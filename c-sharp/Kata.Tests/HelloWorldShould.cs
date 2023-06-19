namespace Kata.Tests;

public class HelloWorldShould
{
    [Test]
    public void ReturnWellKnownPhrase()
    {
        var helloWorld = new HelloWorld();

        var actual = helloWorld.GetGreeting();

        Assert.That(actual, Is.EqualTo("Hello, World!"));
    }
}
