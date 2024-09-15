package com.calculator;

	public class corecalculator {
	    public static CoreParameters calculateParameters(String coreModel) {
	        // Example parsing logic based on the core model "EE25/13/7"
	        String[] parts = coreModel.split("/");
	        if (parts.length != 3) {
	            throw new IllegalArgumentException("Invalid core model format.");
	        }

	        double width = Double.parseDouble(parts[0].substring(2));
	        double height = Double.parseDouble(parts[1]);
	        double thickness = Double.parseDouble(parts[2]);

	        double coreVolume = width * height * thickness;
	        double effectiveVolume = coreVolume * 0.8; // Assuming 80% effective volume
	        double effectiveLength = height; // Assuming effective length equals height
	        double effectiveArea = width * effectiveLength; 
	        double minArea = width * thickness;

	        return new CoreParameters(coreVolume, effectiveVolume, effectiveLength, effectiveArea, minArea);
	    }

	    public static class CoreParameters {
	        public final double coreVolume;
	        public final double effectiveVolume;
	        public final double effectiveLength;
	        public final double effectiveArea;
	        public final double minArea;

	        public CoreParameters(double coreVolume, double effectiveVolume, double effectiveLength, double effectiveArea, double minArea) {
	            this.coreVolume = coreVolume;
	            this.effectiveVolume = effectiveVolume;
	            this.effectiveLength = effectiveLength;
	            this.effectiveArea = effectiveArea;
	            this.minArea = minArea;
	        }
	    }
	}



