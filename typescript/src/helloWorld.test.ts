import { HelloWorld } from './helloWorld';
 
test('HelloWorld should return well known phrase', () => {
    const helloWorld : HelloWorld = new HelloWorld();
    const actual = helloWorld.GetGreeting();
    expect(actual).toBe('Hello, World!');
});