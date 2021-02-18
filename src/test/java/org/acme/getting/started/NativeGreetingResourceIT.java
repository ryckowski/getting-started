package org.acme.getting.started;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeGreetingResourceIT extends GreetingResourceIT {

    // Execute the same tests but in native mode.
}