//package hu.nive.ujratervezes.zarovizsga.cleaning;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CleaningServiceTest {
//
//    CleaningService service = new CleaningService();
//
//    @BeforeEach
//    void init() {
//        service.add(new House("Bp. Fo ut 1.", 130));
//        service.add(new House("Bp. Fo ut 2.", 300));
//        service.add(new Office("Bp. Fo ut 3.", 300, 3));
//        service.add(new Office("Bp. Fo ut 4.", 300, 4));
//    }
//
//    @Test
//    void getCleanables() {
//        assertEquals(4, service.getCleanables().size());
//    }