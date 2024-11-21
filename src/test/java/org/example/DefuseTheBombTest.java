    package org.example;

    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

    class DefuseTheBombTest {

        DefuseTheBomb solution = new DefuseTheBomb();

        @Test
        void testDecryptWithKZero() {
            assertArrayEquals(new int[]{0, 0, 0, 0}, solution.decrypt(new int[]{1, 2, 3, 4}, 0));
        }

        @Test
        void testDecryptWithPositiveK() {
            assertArrayEquals(new int[]{5, 7, 5, 3}, solution.decrypt(new int[]{1, 2, 3, 4}, 2));
        }

        @Test
        void testDecryptWithNegativeK() {
            assertArrayEquals(new int[]{7, 5, 3, 5}, solution.decrypt(new int[]{1, 2, 3, 4}, -2));
        }

        @Test
        void testDecryptWithEmptyArray() {
            assertArrayEquals(new int[]{}, solution.decrypt(new int[]{}, 1));
        }

        @Test
        void testDecryptWithSingleElementArray() {
            assertArrayEquals(new int[]{42}, solution.decrypt(new int[]{42}, 1));
        }

    }

