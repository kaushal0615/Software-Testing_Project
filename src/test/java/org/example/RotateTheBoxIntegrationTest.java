package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateTheBoxIntegrationTest {

    // Helper method to create RotateTheBox with RotateHelper
    private RotateTheBox createRotateTheBox() {
        RotateHelper helper = new RotateHelper();
        return new RotateTheBox(helper);
    }

    @Test
    void testExample1() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#', '.', '#'}
        };
        char[][] expected = {
                {'.'},
                {'#'},
                {'#'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }

    @Test
    void testExample2() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#', '.', '*', '.'},
                {'#', '#', '*', '.'}
        };
        char[][] expected = {
                {'#', '.'},
                {'#', '#'},
                {'*', '*'},
                {'.', '.'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }

    @Test
    void testExample3() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#', '#', '*', '.', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };
        char[][] expected = {
                {'.', '#', '#'},
                {'.', '#', '#'},
                {'#', '#', '*'},
                {'#', '*', '.'},
                {'#', '.', '*'},
                {'#', '.', '.'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }

    @Test
    void testSingleRow() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#'}
        };
        char[][] expected = {
                {'#'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }

    @Test
    void testLargeMatrix() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#', '#', '*', '#', '*', '.'},
                {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}
        };
        char[][] expected = {
                {'.', '#', '#'},
                {'.', '#', '#'},
                {'#', '#', '*'},
                {'#', '*', '#'},
                {'#', '.', '*'},
                {'#', '.', '.'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }

    @Test
    void testComplexGrid() {
        RotateTheBox rotateTheBox = createRotateTheBox();
        char[][] box = {
                {'#', '#', '#', '.', '.', '.'},
                {'#', '#', '#', '.', '.', '.'},
                {'#', '#', '#', '.', '.', '.'},
                {'#', '#', '#', '.', '.', '.'},
                {'#', '#', '#', '.', '.', '.'}
        };
        char[][] expected = {
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#'}
        };
        assertArrayEquals(expected, rotateTheBox.rotateTheBox(box));
    }
}
