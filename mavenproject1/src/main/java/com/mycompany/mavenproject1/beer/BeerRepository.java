
package com.mycompany.mavenproject1.beer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long>{
    
}
