import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import RegistrationForm from './components/RegistrationForm';
import './App.css'; 
import Login from './components/users/Login';
import CreateAccount from './components/bank/CreateAccount';
function App() {
  return (
    <div className="App">
       <Router>
      <Routes>
        <Route path='/' element={<RegistrationForm/>}/>
        <Route path='/login' element={<Login/>}/>
        <Route path='/createAccount'element={<CreateAccount/>}/>
      </Routes>
     </Router>
      
    </div>
  );
}

export default App;
