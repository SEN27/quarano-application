package quarano.masterdata.web;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import quarano.masterdata.FrontendText;

import org.springframework.hateoas.server.core.Relation;
import org.springframework.stereotype.Component;

/**
 * @author Jens Kutzsche
 */
@Component
public class FrontendTextRepresentations {

	public FrontendTextDto toRepresentation(FrontendText textEntity) {
		return FrontendTextDto.from(textEntity);
	}

	@Relation(collectionRelation = "texts")
	@Value
	@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
	static class FrontendTextDto {

		private String key;
		private String text;

		static FrontendTextDto from(FrontendText textEntity) {
			return new FrontendTextDto(textEntity.getTextKey(), textEntity.getText());
		}
	}
}
