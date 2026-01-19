@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired private InvoiceService service;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping public Invoice create(@RequestBody Invoice invoice){ return service.save(invoice); }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping public List<Invoice> getAll(){ return service.findAll(); }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){ service.delete(id); }
}
