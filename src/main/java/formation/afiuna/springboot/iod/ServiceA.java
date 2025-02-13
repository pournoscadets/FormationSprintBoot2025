package formation.afiuna.springboot.iod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceA {
    private ServiceB serviceB;

    // On se débarasse de ce constructeur
    // public ServiceA(ServiceB serviceB) {        
    //     this.serviceB = serviceB;
    // }

    // la version propre se trouve sur la branche principe_injection_dependance_goal_implementation_final

    public double calcule() {
        try(AnnotationConfigApplicationContext context =
         new AnnotationConfigApplicationContext("formation.afiuna.springboot.iod")) {

            // Nous aurons 3 beans, celui par défaut l'autre
            this.serviceB = context.getBean("createBeanB", ServiceB.class);

        }
        return this.serviceB.getValue() * this.serviceB.getCoefficient();        
    }
}
