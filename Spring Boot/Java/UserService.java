@Service
public class UserService implements UserDetailsService {

    @Autowired private UserRepository repo;
    @Autowired private PasswordEncoder encoder;

    public User register(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        User user = repo.findByUsername(username).orElseThrow();
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
        );
    }
}
