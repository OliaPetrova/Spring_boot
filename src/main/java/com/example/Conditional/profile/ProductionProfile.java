package com.example.Conditional.profile;

public class ProductionProfile implements SystemProfile {
	@Override
	public String getProfile() {
		return "Current profile is production";
	}
}
