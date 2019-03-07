# Project about Java modules and strong encapsulation
You have here a simple project about a scooters provider and a client.

Before modification, there was a way to access internal diagnostic classes which had the
abilities to modify scooter characteristics without the consent of the provider.

The code has been left commented in the different classes of the client.

## What do I have to do ?
Nothing special because this branch is a correction proposal to our problem of
strong encapsulation which was hard to achieve before Java 9 modules.

As you have certainly seen, Lombok dependency is not yet ready for being used with
java module. We can make it almost work with the edge version but after during execution,
it finally doesn't work...

For the reflection part, you will discover the *opens* instruction.