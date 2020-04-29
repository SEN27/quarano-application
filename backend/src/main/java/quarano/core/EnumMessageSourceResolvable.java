/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package quarano.core;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

import org.springframework.context.MessageSourceResolvable;
import org.springframework.lang.NonNull;

/**
 * @author Oliver Drotbohm
 */
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class EnumMessageSourceResolvable implements MessageSourceResolvable {

	private final Enum<?> value;

	public static EnumMessageSourceResolvable of(Enum<?> value) {
		return new EnumMessageSourceResolvable(value);
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.context.MessageSourceResolvable#getCodes()
	 */
	@NonNull
	@Override
	public String[] getCodes() {

		var name = value.name() //
				.toLowerCase(Locale.US) //
				.replace("_", "-");

		return new String[] { String.format("%s.%s", value.getClass().getName(), name) };
	}
}