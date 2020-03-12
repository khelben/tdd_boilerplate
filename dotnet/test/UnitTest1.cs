using NUnit.Framework;

namespace Boilerplate.Tests
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1()
        {
            Assert.AreEqual("Boo", Boilerplate.Class1.HelloWorld());
        }
    }
}