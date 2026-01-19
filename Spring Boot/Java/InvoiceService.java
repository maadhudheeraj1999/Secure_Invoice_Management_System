@Service
public class InvoiceService {

    @Autowired private InvoiceRepository repo;

    public Invoice save(Invoice invoice){ return repo.save(invoice); }
    public List<Invoice> findAll(){ return repo.findAll(); }
    public void delete(Long id){ repo.deleteById(id); }
}
