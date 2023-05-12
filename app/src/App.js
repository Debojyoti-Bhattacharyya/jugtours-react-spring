import React from "react";
import "./App.css";
import Home from "./components/Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import GroupList from "./components/GroupList";

function App() {
	return (
		<Router>
			<Routes>
				<Route exact path="/" element={<Home />}></Route>
				<Route
					path="/groups"
					exact={true}
					element={<GroupList />}
				></Route>
			</Routes>
		</Router>
	);
}

export default App;
