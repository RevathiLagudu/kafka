import React, { useState } from 'react';
const Demo = () => {
    const [age, setAge] = useState(25);
  const [name, setName] = useState('John');
  const [count, setCount] = useState(0);
  return (
    <div>
      <p>Age: {age}</p>
      <button onClick={() => setAge(age + 1)}>Increase Age</button>

      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>Click me</button>
      <button onClick={() => setCount(prevCount => prevCount + 1)}>Click me</button>
      
      <p>Name: {name}</p>
      <button onClick={() => setName('Jane')}>Change Name</button>
    </div>
  )
}

export default Demo