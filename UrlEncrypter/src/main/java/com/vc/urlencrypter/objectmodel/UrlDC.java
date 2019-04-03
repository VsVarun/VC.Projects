package com.vc.urlencrypter.objectmodel;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UrlDC implements Serializable{
	
		private static final long serialVersionUID = 1L;

		private String hostname;
		private long port;
		private String username;
		private String password;
		private String role;
		
		public UrlDC() {
			super();
		}
		
		public UrlDC(String hostname, long port, String username, String password, String role) {
			super();
			this.hostname = hostname;
			this.port = port;
			this.username = username;
			this.password = password;
			this.role = role;
		}

		public String getHostname() {
			return hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public long getPort() {
			return port;
		}

		public void setPort(long port) {
			this.port = port;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return hostname + ":" + port + "/" + username + ":"
					+ password + (role!=null?(":"+role):"");
		}

}
