function greet(name) {
    console.log('Hello, ' + name);
  }
  
  function processUserInput(callback) {
    // const name = promp'Please enter your name:');
    const name = "Lankesh"
    callback(name); // Execute the callback function
  }
  
  processUserInput(greet);
  