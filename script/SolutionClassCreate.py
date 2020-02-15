import os
import yaml
import re

with open('properties.yml', 'r') as f:
    prop = yaml.safe_load(f)
    ROOT_DIR = prop['ROOT_DIR']
    SRC_CODE_DIR = prop['SRC_CODE_DIR']
    TEST_CODE_DIR = prop['TEST_CODE_DIR']

BREAK_LINE = '\n'

def makeFile(path, body):
    f = open(path, "w")
    f.writelines(body)
    f.close()

print('type the creating directory name.')
input_val = input().strip()
space_omitted = re.sub('\s', '_', input_val)
dirName = 'no' + re.sub('\.', '', space_omitted)

print('now creating dirctories...')
os.makedirs(ROOT_DIR + SRC_CODE_DIR + dirName)
os.makedirs(ROOT_DIR + TEST_CODE_DIR + dirName)
print('done.')

print('making solution class files.')
body = [
    'package leet_code.' + dirName + ';' + BREAK_LINE,
    BREAK_LINE,
    '/**' + BREAK_LINE,
    ' * ' + input_val + BREAK_LINE,
    ' * https://leetcode.com/problems/' + BREAK_LINE,
    ' */' + BREAK_LINE,
    'public class Solution {' + BREAK_LINE,
    '}' + BREAK_LINE
]
bodyTest = [
    'package leet_code.' + dirName + ';' + BREAK_LINE,
    BREAK_LINE,
    'import static org.junit.jupiter.api.Assertions.assertEquals;' + BREAK_LINE,
    'import org.junit.jupiter.api.Test;' + BREAK_LINE,
    BREAK_LINE,
    '/**' + BREAK_LINE,
    ' * ' + input_val + BREAK_LINE,
    ' * https://leetcode.com/problems/' + BREAK_LINE,
    ' */' + BREAK_LINE,
    'public class SolutionTest {' + BREAK_LINE,
    BREAK_LINE,
    '    private static Solution solution = new Solution();' + BREAK_LINE,
    BREAK_LINE,
    '    @Test' + BREAK_LINE,
    '    void example1Test() {' + BREAK_LINE,
    '        // given' + BREAK_LINE,
    '        // when' + BREAK_LINE,
    '        final String actual = \"\";' + BREAK_LINE,
    '        // then' + BREAK_LINE,
    '        final String expected = \"\";' + BREAK_LINE,
    '        assertEquals(expected, actual);' + BREAK_LINE,
    '    }' + BREAK_LINE,
    '}'
]
makeFile(ROOT_DIR + SRC_CODE_DIR + dirName + '/Solution.java', body)
makeFile(ROOT_DIR + TEST_CODE_DIR + dirName + '/SolutionTest.java', bodyTest)
print('done.')

print('all processes are done.')
