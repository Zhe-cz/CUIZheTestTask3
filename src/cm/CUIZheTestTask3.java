package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import cm.CarParkKind;
public class CUIZheTestTask3 {
    /**
     *Rate method Test case1
     *Partition Tested: hourlyNormalRate<0 && hourlyNormalRate< hourlyReducedRate
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate1() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(-1);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);


    }

     /**
     *Rate method Test case2
     * Partition Tested: hourlyNormalRate=0 && hourlyNormalRate= hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate2() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(0);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method case3
     *Partition Tested: hourlyNormalRate>=0 && hourlyNormalRate>=hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate3() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(4);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then

    }

    /**
     *Rate method Test case4
     *Partition Tested: Float hourlyNormalRate && hourlyNormalRate >= hourlyReducedRate
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate4() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(4.5);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case5
     *Partition Tested: Float hourlyReducedRate && hourlyNormalRate >= hourlyReducedRate
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate5() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(4);
        BigDecimal hourlyReducedRate = new BigDecimal(1.5);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case6
     *Partition Tested: hourlyReducedRate<=0 && hourlyNormalRate >= hourlyReducedRate
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate6() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = new BigDecimal(-2);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);
    }

    /**
     *Rate method Test case7
     *Partition Tested: hourlyReducedRate=0 && hourlyNormalRate >=hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate7() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(4);
        BigDecimal hourlyReducedRate = new BigDecimal(0);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case8
     *Partition Tested: hourlyReducedRate>=0 && hourlyNormalRate >= hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate8() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(4);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case9
     *Partition Tested: hourlyNormalRate < hourlyReducedRate
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate9() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = new BigDecimal(6);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case10
     *Partition Tested: hourlyNormalRate = hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate10() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case11
     *Partition Tested: hourlyNormalRate >= hourlyReducedRate
     *expected an instance of Rate
     */

    @Test
    public void testRate11() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case12
     *Partition Tested: normalPeriods is Null
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate12() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = null;
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case13
     *Partition Tested: normalPeriods is not Null
     *expected an instance of Rate
     */

    @Test
    public void testRate13() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(8, 11);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case14
     *Partition Tested: reducedPeriods is not Null
     *expected an instance of Rate
     */

    @Test
    public void testRate14() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod1 = new Period(3, 4);
        Period reducedPeriod2 = new Period(19, 22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case15
     *Partition Tested: reducedPeriods is Null
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate15() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(10, 16);
        Period reducedPeriod = null;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case16
     *Partition Tested: normalPeriods is overlap itself
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate16() throws IllegalArgumentException
    {
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(8,11);
        Period normalPeriod2 = new Period(10,12);
        Period reducedPeriod = new Period(15,17);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod);
        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);
    }

    /**
     *Rate method Test case17
     *Partition Tested: normalPeriods is overlap itself
     *expected an instance of Rate
     */

    @Test
    public void testRate17() throws IllegalArgumentException
    {
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(8,11);
        Period normalPeriod2 = new Period(13,14);
        Period reducedPeriod = new Period(15,17);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod);
        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case18
     *Partition Tested: reducedPeriods is overlap itself
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate18() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(17, 19);
        Period reducedPeriod1 = new Period(2, 10);
        Period reducedPeriod2 = new Period(8, 13);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);
    }

    /**
     *Rate method Test case19
     *Partition Tested: reducedPeriods is not overlap
     *expected an instance of Rate
     */

    @Test
    public void testRate19() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(17, 19);
        Period reducedPeriod1 = new Period(2, 10);
        Period reducedPeriod2 = new Period(12, 13);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case20
     *Partition Tested: two collections not overlap themselves
     *expected an instance of Rate
     */

    @Test
    public void testRate20() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);

        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case21
     *Partition Tested: two collections overlap themselves
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate21() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,7);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(2,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);

        //Then
        Assert.assertNotNull(testRate);
    }

    /**
     *Rate method Test case22
     *Partition Tested: Times should between the 0 and 23:59
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate22() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(-1,7);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(2,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);
    }

    /**
     *Rate method Test case23
     *Partition Tested: Times should between the 0 and 24
     *expected an instance of Rate
     */

    @Test
    public void testRate23() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(13,15);
        Period reducedPeriod = new Period(22,24);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case24
     *Partition Tested: Kind = stuff
     *expected an instance of Rate
     */

    @Test
    public void testRate24() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case25
     *Partition Tested: Kind = student
     *expected an instance of Rate
     */

    @Test
    public void testRate25() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case26
     *Partition Tested: Kind = management
     *expected an instance of Rate
     */

    @Test
    public void testRate26() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case27
     *Partition Tested: Kind = visitor
     *expected an instance of Rate
     */

    @Test
    public void testRate27() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }

    /**
     *Rate method Test case28
     *Partition Tested: Kind = Null
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate28() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = null;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod1 = new Period(1,2);
        Period normalPeriod2 = new Period(9,10);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(11,12);
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case29
     *Partition Tested: reducedPeriods is Null
     * expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate29() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(5,10);;
        Period reducedPeriod = new Period(13,19);;
        ArrayList<Period> reducedPeriods = null;
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);

        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case30
     *Partition Tested: normalRate=null && reducedRate=null
     *expected an instance of Rate
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate30() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(5,10);;
        Period reducedPeriod = new Period(13,19);;
        ArrayList<Period> reducedPeriods = null;
        ArrayList<Period> normalPeriods = null;


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case31
     *Partition Tested: normalRate=null
     *expected an instance of Rate
     */

    @Test(expected = IllegalArgumentException.class)
    public void testRate31() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(6);
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(5,10);
        Period reducedPeriod = new Period(13,19);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = null;


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case32
     *Partition Tested: hourlyNormalRate=null
     *expected an instance of Rate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRate32() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = null;
        BigDecimal hourlyReducedRate = new BigDecimal(3);
        Period normalPeriod = new Period(5,10);;
        Period reducedPeriod = new Period(13,19);;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case33
     *Partition Tested: hourlyReducedRate=null
     *expected an instance of Rate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRate33() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = null;
        Period normalPeriod = new Period(5,10);;
        Period reducedPeriod = new Period(13,19);;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case34
     *Partition Tested: hourlyNormalRate=null && hourlyReducedRate=null
     *expected an instance of Rate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRate34() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = null;
        BigDecimal hourlyReducedRate = null;
        Period normalPeriod = new Period(5,10);
        Period reducedPeriod = new Period(13,19);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case35
     *Partition Tested: normalPeriod is overlap
     *expected an instance of Rate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRate35() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        Period normalPeriod1 = new Period(5,10);
        Period normalPeriod2 = new Period(6,7);
        Period normalPeriod3 = new Period(13,19);
        Period reducedPeriod = new Period(20,23);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);
        reducedPeriods.add(reducedPeriod);


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
    /**
     *Rate method Test case36
     *Partition Tested: normalPeriod is not overlap
     *expected an instance of Rate
     */
    @Test
    public void testRate36() throws IllegalArgumentException
    {
        //given
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(3);
        BigDecimal hourlyReducedRate = new BigDecimal(2);
        Period normalPeriod1 = new Period(5,10);
        Period normalPeriod2 = new Period(13,19);
        Period reducedPeriod = new Period(20,23);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        reducedPeriods.add(reducedPeriod);


        //when
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        //Then
        Assert.assertNotNull(testRate);

    }
     /**
     *calculate method test case1
     *Partition Tested: startHour < 0
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate1() throws IllegalArgumentException
    {
        //given
        int startHour = -1;
        int endHour = 11;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
    }

     /**
     *calculate method test case2
     *Partition Tested: startHour = 0
     *expected to output the cost: 4
     */

    @Test
    public void testcalculate2() throws IllegalArgumentException
    {
        //given
        int startHour = 0;
        int endHour = 7;

        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("4.00"), cost);
    }

     /**
     *calculate method test case3
     *Partition Tested: 0 <= startHour < 24
     *expected to output the cost: 5
     */

    @Test
    public void testcalculate3() throws IllegalArgumentException
    {
        //given
        int startHour = 8;
        int endHour = 11;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("5.00"), cost);

    }

     /**
     *calculate method test case4
     *Partition Tested: startHour > 24
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate4() throws IllegalArgumentException
    {
        //given
        int startHour = 26;
        int endHour = 22;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);

    }


     /**
     *calculate method test case5
     *Partition Tested: endHour < 0
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate5() throws IllegalArgumentException
    {
        int startHour = 2;
        int endHour = -1;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
    }

     /**
     *calculate method test case6
     *Partition Tested: startHour=endHour && endHour = 0
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate6() throws IllegalArgumentException
    {
        int startHour = 0;
        int endHour = 0;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
    }

/**
     *calculate method test case7
     *Partition Tested: 0 <= endHour < 24
     *expected to output the cost: 15
     */

    @Test
    public void testcalculate7() throws IllegalArgumentException
    {
        //given
        int startHour = 11;
        int endHour = 16;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("16.00"), cost);
    }

/**
     *calculate method test case8
     *Partition Tested: endHour > 24
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate8() throws IllegalArgumentException
    {
        //given
        int startHour = 11;
        int endHour = 25;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);

    }

     /**
     *calculate method test case9
     *Partition Tested: endHour = 24
     *expected to output the cost: 4
     */

    @Test
    public void testcalculate9() throws IllegalArgumentException
    {
        //given
        int startHour = 20;
        int endHour = 24;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("4.00"), cost);
    }

    /**
     *calculate method test case10
     *Partition Tested: startHour > endHour
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate10() throws IllegalArgumentException
    {
        //given
        int startHour = 11;
        int endHour = 1;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);


    }

     /**
     calculate method test case11
     *Partition Tested:startHour = endHour
     *expected to throw IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testcalculate11() throws IllegalArgumentException
    {
        //given
        int startHour = 16;
        int endHour = 16;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(18,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);


        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
    }

    /**
     *calculate method test case12
     *Partition Tested: startHour < endHour
     *expected to output the cost: 2
     */

    @Test
    public void testcalculate12() throws IllegalArgumentException
    {
        //given
        int startHour = 16;
        int endHour = 19;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("5");
        BigDecimal hourlyReducedRate = new BigDecimal("2");
        Period normalPeriod = new Period(10,15);
        Period reducedPeriod1 = new Period(5,8);
        Period reducedPeriod2 = new Period(20,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("0.00"), cost);
    }
    /**
     *calculate method test case13
     *Partition Tested:
     * VISITOR: first 8.00 is free, 50% reduction above that
     *expected to output the cost: 0.00
     */

    @Test
    public void testcalculate13() throws IllegalArgumentException
    {
        //given
        int startHour = 10;
        int endHour = 12;
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal("4.00");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("0.00"), cost);
    }
    /**
     *calculate method test case14
     *Partition Tested:
     * VISITOR: first 8.00 is free, 50% reduction above that
     *expected to output the cost: 0.00
     */

    @Test
    public void testcalculate14() throws IllegalArgumentException
    {
        //given
        int startHour = 10;
        int endHour = 15;
        CarParkKind carParkKind = CarParkKind.VISITOR;
        BigDecimal hourlyNormalRate = new BigDecimal("4.00");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("6.00"), cost);
    }
    /**
     *calculate method test case15
     *Partition Tested:
     * MANAGEMENT: minimum payable is 3.00
     *expected to output the cost: 0.00
     */

    @Test
    public void testcalculate15() throws IllegalArgumentException
    {
        //given
        int startHour = 19;
        int endHour = 20;
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;
        BigDecimal hourlyNormalRate = new BigDecimal("4.00");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("3.00"), cost);
    }
    /**
     *calculate method test case16
     *Partition Tested:
     * STUDENT: 25% reduction on any amount above 5.50
     *expected to output the cost: 5.50
     */

    @Test
    public void testcalculate16() throws IllegalArgumentException
    {
        //given
        int startHour = 10;
        int endHour = 11;
        CarParkKind carParkKind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal("5.50");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("5.50"), cost);
    }
    /**
     *calculate method test case17
     *Partition Tested:
     * STUDENT: 25% reduction on any amount above 5.50
     *expected to output the cost: 5.50
     */

    @Test
    public void testcalculate17() throws IllegalArgumentException
    {
        //given
        int startHour = 10;
        int endHour = 13;
        CarParkKind carParkKind = CarParkKind.STUDENT;
        BigDecimal hourlyNormalRate = new BigDecimal("5.50");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("8.25"), cost);
    }
    /**
     *calculate method test case18
     *Partition Tested:
     * STAFF: maximum payable is 16.00 per day
     *expected to output the cost: 16.00
     */

    @Test
    public void testcalculate18() throws IllegalArgumentException
    {
        //given
        int startHour = 10;
        int endHour = 16;
        CarParkKind carParkKind = CarParkKind.STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal("4.00");
        BigDecimal hourlyReducedRate = new BigDecimal("2.00");
        Period normalPeriod = new Period(10,16);
        Period reducedPeriod1 = new Period(3,4);
        Period reducedPeriod2 = new Period(19,22);
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        Rate testRate = new Rate(carParkKind, hourlyNormalRate, hourlyReducedRate, reducedPeriods, normalPeriods);
        Period period = new Period(startHour, endHour);
        //when
        BigDecimal cost = testRate.calculate(period);
        Assert.assertEquals(new BigDecimal("16.00"), cost);
    }
}


