package org.azd.pipelines.types;
/*
----------------------------------------------------------
	GENERATED FILE, should be edited to suit the purpose.
----------------------------------------------------------
*/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.azd.abstractions.serializer.SerializableEntity;

/**
 * Settings which influence pipeline runs. 
**/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildResourceParameters extends SerializableEntity {

	@JsonProperty("version")
	private String version;

	public String getVersion() { return version; }

	public void setVersion(String version) { this.version = version; }

}