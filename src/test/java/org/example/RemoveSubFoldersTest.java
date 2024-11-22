package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveSubFoldersTest {

    @Test
    void testExample1() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/a", "/c/d", "/c/f"), result);
    }

    @Test
    void testExample2() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {"/a", "/a/b/c", "/a/b/d"};
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/a"), result);
    }

    @Test
    void testExample3() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {"/a/b/c", "/a/b/ca", "/a/b/d"};
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/a/b/c", "/a/b/ca", "/a/b/d"), result);
    }

    @Test
    void testNoSubfolders() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {"/ab", "/abc", "/abcd"};
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/ab", "/abc", "/abcd"), result);
    }

    @Test
    void testMixedCases() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {"/a/b/c", "/abc/d", "/a/b/d", "/abc"};
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/a/b/c", "/a/b/d", "/abc"), result);
    }

    @Test
    void testComplexCase() {
        RemoveSubFolders solution = new RemoveSubFolders();
        String[] folder = {
                "/aa/ab/ac/ae", "/aa/ab/af/ag", "/ap/aq/ar/as",
                "/ap/aq/ar", "/ap/ax/ay/az", "/ap",
                "/ap/aq/ar/at", "/aa/ab/af/ah", "/aa/ai/aj/ak"
        };
        List<String> result = solution.removeSubfolders(folder);
        assertEquals(List.of("/aa/ab/ac/ae", "/aa/ab/af/ag", "/ap", "/aa/ab/af/ah","/aa/ai/aj/ak"), result);
    }
}
