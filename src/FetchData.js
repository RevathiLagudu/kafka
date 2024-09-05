// import React from 'react'

const FetchData = () => {
    return new Promise((resolve) => {
        setTimeout(() => {
          resolve('Data fetched');
        }, 2000);
      });
    };
    
    const fetchDataAsync = async () => {
      try {
        console.log('Fetching data...');
        const data = await FetchData(); // Pauses here until fetchData resolves
        console.log(data); // This will log 'Data fetched' after 2 seconds
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };
    fetchDataAsync()

export default FetchData