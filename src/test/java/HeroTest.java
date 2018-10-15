import static  org.junit.Assert.*;
import org.junit.Test;

public class HeroTest {
    Hero superman = new Hero("epha", 20, "words", "silence",8, 9);

    @Test
    public void hero_returnsInstancObject_Object(){

        assertEquals(true, superman instanceof Object);
    }

    @Test
    public void hero_supermanReturnsInstanceOfHero_Object(){

        assertEquals(true, superman instanceof Hero);
    }

    @Test
    public void hero_checkWhetherHeroHasName_String(){

        assertEquals("epha", superman.getName());
    }

    @Test
    public void hero_checkWhetherHeroHasPower_string(){

        assertEquals("words", superman.getPower());
    }
    @Test
    public void hero_checkWhetherHeroHasAge_Integer(){
        Integer age = 20;
        assertEquals(age, superman.getAge());
    }
}