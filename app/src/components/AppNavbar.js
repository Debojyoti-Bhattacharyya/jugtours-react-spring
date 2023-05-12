import React, { useState } from "react";
import {
	Collapse,
	NavItem,
	Nav,
	Navbar,
	NavLink,
	NavbarBrand,
	NavbarToggler,
} from "reactstrap";
import { Link } from "react-router-dom";

export default function AppNavbar() {
	const [isOpen, setIsOpen] = useState(false);

	return (
		<Navbar color="dark" dark expand="md">
			<NavbarBrand tag={Link} to="/">
				Home
			</NavbarBrand>
			<NavbarToggler
				conClick={() => {
					setIsOpen(!isOpen);
				}}
			></NavbarToggler>
			<Collapse isOpen={isOpen} navbar>
				<Nav
					className="justify-content-end"
					style={{ width: "100%" }}
					navbar
				>
					<NavItem>
						<NavLink href="https://twitter.com/oktadev">
							@oktadev
						</NavLink>
					</NavItem>
					<NavItem>
						<NavLink href="https://github.com/oktadev/okta-spring-boot-react-crud-example">
							GitHub
						</NavLink>
					</NavItem>
				</Nav>
			</Collapse>
		</Navbar>
	);
}
