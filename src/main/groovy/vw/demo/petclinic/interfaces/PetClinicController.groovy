package vw.demo.petclinic.interfaces

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("petclinic")
@CrossOrigin("*")
@RefreshScope
class PetClinicController {
    @Value('${petclinic.name}')
    private String petClinicName

    @GetMapping("/developer")
    ResponseEntity getName(){
        return ResponseEntity.ok("Hello cobain")
    }
}
