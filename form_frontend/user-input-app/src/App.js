import axios from 'axios';
import React, { useState } from 'react';

function App() {
  const [inputValue, setInputValue] = useState("");
  const [successMessage, setSuccessMessage] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('https://legendary-halibut-gg69vx69wwj29vq9-8080.app.github.dev/api/input', inputValue, {
        headers: {
          'Content-Type': 'application/json',
        },
      });
      console.log('Data Saved', response.data);
      setSuccessMessage('Successfully added!');
      setInputValue(''); // Reset the input field
    } catch (error) {
      console.error('Error saving data', error);
      setSuccessMessage('Failed to add. Please try again.');
    }
  };

  return (
    <div>
      <h1>User Input Form</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={inputValue}
          onChange={(e) => setInputValue(e.target.value)}
          placeholder="Enter some value"
          required
        />
        <button type="submit">Submit</button>
      </form>

      {/* Display success message */}
      {successMessage && <p>{successMessage}</p>}
    </div>
  );
}

export default App;
