package com.online.repair.factory;

import com.online.repair.builder.DeviceBuilder;
import com.online.repair.model.Device;
import com.online.repair.model.MobileAudioRepair;
import com.online.repair.model.MobileCameraRepair;
import com.online.repair.model.MobileScreenReplacement;
import com.online.repair.model.TVDisplayRepair;
import com.online.repair.model.TVMotherboardRepair;
import com.online.repair.model.TVSpeakerRepair;

public class DeviceRepairFactory {

	public static Device getDeviceInstanceForRepair(DeviceBuilder builder) {
		Device device = null;

		if (builder.getDevice().equalsIgnoreCase("MOBILE")) {
			switch (builder.getRepairType()) {
			case "MOBILE_SCREEN_REPAIR":
				device = new MobileScreenReplacement(builder);
				break;
			case "MOBILE_AUDIO_REPAIR":
				device = new MobileAudioRepair(builder);
				break;
			case "MOBILE_CAMERA_REPAIR":
				device = new MobileCameraRepair(builder);
				break;
			}

		} else if (builder.getDevice().equalsIgnoreCase("TV")) {
			switch (builder.getRepairType()) {
			case "TV_DISPLAY_REPAIR":
				device = new TVDisplayRepair(builder);
				break;
			case "TV_SPEAKER_REPAIR":
				device = new TVSpeakerRepair(builder);
				break;
			case "TV_MOTHERBOARD_REPAIR":
				device = new TVMotherboardRepair(builder);
				break;
			}
		}

		return device;
	}
}
