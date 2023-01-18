package tech.tresearchgroup.schemas.fpcalc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FPCalcOutput{

	@SerializedName("duration")
	private double duration;

	@SerializedName("fingerprint")
	private String fingerprint;
}