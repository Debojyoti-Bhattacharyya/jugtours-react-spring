import React from "react";
import AppNavbar from "./AppNavbar";
import { Button, Container } from "reactstrap";
import { Link } from "react-router-dom";

export default function Home() {
	return (
		<div>
			<AppNavbar />
			<Container fluid>
				<Button color="link">
					<Link to="/groups">Manage JUG Tour</Link>
				</Button>
			</Container>
		</div>
	);
}
