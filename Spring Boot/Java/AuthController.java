@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private UserService service;
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return jwtUtil.generateToken(user.getUsername());
    }
}
