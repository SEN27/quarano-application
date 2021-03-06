package quarano.masterdata.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import quarano.core.validation.Alphabetic;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SymptomDto {

	@Getter(onMethod = @__(@JsonProperty)) //
	@Setter(onMethod = @__(@JsonIgnore)) //
	private UUID id;

	private @Alphabetic String name;
	private boolean isCharacteristic;
}
