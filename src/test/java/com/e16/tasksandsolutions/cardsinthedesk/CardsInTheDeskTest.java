package com.e16.tasksandsolutions.cardsinthedesk;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CardsInTheDeskTest {

    @Test
    public void solutionTest() throws Exception {
        assertThat(new CardsInTheDeck()
                .solution(new int[] {100, 50, 60, 30}), is(8));
    }

}