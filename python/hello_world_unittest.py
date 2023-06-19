import unittest

from hello_world import HelloWorld

class HelloWorldShould(unittest.TestCase):

    def test_return_well_known_phrase(self):
        helloWorld = HelloWorld()

        actual = helloWorld.GetGreeting()

        self.assertEqual('Hello, World!', actual)

if __name__ == '__main__':
    unittest.main()