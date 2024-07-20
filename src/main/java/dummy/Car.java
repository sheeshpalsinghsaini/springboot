package dummy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Component
//@Scope("prototype")
public class Car {

    private String brandName;
    private String id;

}
