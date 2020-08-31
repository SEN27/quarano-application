package quarano.department;

import lombok.RequiredArgsConstructor;
import quarano.account.DepartmentDataInitializer;
import quarano.account.DepartmentRepository;
import quarano.core.DataInitializer;
import quarano.department.Questionnaire.SymptomInformation;
import quarano.department.TrackedCase.TrackedCaseIdentifier;
import quarano.tracking.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Oliver Drotbohm
 */
@Component
@RequiredArgsConstructor
@Order(660)
public class TrackedCaseDataInitializer implements DataInitializer {

	private final TrackedCaseRepository cases;
	private final TrackedPersonRepository trackedPeople;
	private final DepartmentRepository departments;

	public static final TrackedCaseIdentifier TRACKED_CASE_TANJA = TrackedCaseIdentifier
			.of(UUID.fromString("5e2d917f-7cb4-4084-ab32-62b4b19b2a74"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SANDRA = TrackedCaseIdentifier
			.of(UUID.fromString("e55ce370-7dbe-11ea-bc55-0242ac134711"));

	public static final TrackedCaseIdentifier TRACKED_CASE_GUSTAV = TrackedCaseIdentifier
			.of(UUID.fromString("8ea1a457-3ba2-4319-a393-3d1379ab66cb"));

	public static final TrackedCaseIdentifier TRACKED_CASE_NADINE = TrackedCaseIdentifier
			.of(UUID.fromString("03ea6953-f06c-418a-975c-bb2ff79c1ff3"));

	public static final TrackedCaseIdentifier TRACKED_CASE_HARRY = TrackedCaseIdentifier
			.of(UUID.fromString("bb2ff79c-f06c-418a-975c-03ea69537d41"));

	// security test cases
	public static final TrackedCaseIdentifier TRACKED_CASE_SARAH = TrackedCaseIdentifier
			.of(UUID.fromString("20158af7-56da-4bca-a9c6-72035d1b27b6"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SYLVIA = TrackedCaseIdentifier
			.of(UUID.fromString("29590262-c4e7-4047-a4a8-693ad8ffbcd6"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SIGGI = TrackedCaseIdentifier
			.of(UUID.fromString("01d8b3bd-041e-4493-b491-42f9bf40323d"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SONJA = TrackedCaseIdentifier
			.of(UUID.fromString("903b819b-ce2c-41ec-88b4-9c04d4359b92"));

	public static final TrackedCaseIdentifier TRACKED_CASE_STEVEN = TrackedCaseIdentifier
			.of(UUID.fromString("5018227d-96c9-47d9-864c-94acf5b07cd6"));

	public static final TrackedCaseIdentifier TRACKED_CASE_STEFFEN = TrackedCaseIdentifier
			.of(UUID.fromString("2ec51662-da01-4841-ad50-da6d7a8e204e"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SAMUEL = TrackedCaseIdentifier
			.of(UUID.fromString("94f6f81c-909f-42ae-8248-3e8ea8b7dae5"));

	public static final TrackedCaseIdentifier TRACKED_CASE_SUNNY = TrackedCaseIdentifier
			.of(UUID.fromString("cbb52d97-fb3e-45a1-b7a3-d2cb5d9c65a2"));

	public static final TrackedCaseIdentifier TRACKED_CASE_JOEL = TrackedCaseIdentifier
			.of(UUID.fromString("5d5ed296-ec66-11ea-adc1-0242ac120002"));

	public static final TrackedCaseIdentifier TRACKED_CASE_CARLOS = TrackedCaseIdentifier
			.of(UUID.fromString("5d5ed5f2-ec66-11ea-adc1-0242ac120002"));

	/*
	 * (non-Javadoc)
	 * @see quarano.core.DataInitializer#initialize()
	 */
	@Override
	public void initialize() {

		var tanja = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON1_ID_DEP1).orElseThrow();
		var markus = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON2_ID_DEP1).orElseThrow();
		var sandra = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON3_ID_DEP2).orElseThrow();
		var gustav = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON4_ID_DEP1).orElseThrow();
		var nadine = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON5_ID_DEP1).orElseThrow();
		var jessica = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON4_ID_DEP2).orElseThrow();
		var harry = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON6_ID_DEP1).orElseThrow();
		var harriette = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_PERSON7_ID_DEP1).orElseThrow();

		var siggi = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC1_ID_DEP1).orElseThrow();
		var sarah = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC2_ID_DEP1).orElseThrow();
		var sonja = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC3_ID_DEP1).orElseThrow();
		var samuel = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC4_ID_DEP1).orElseThrow();
		var sylvia = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC5_ID_DEP1).orElseThrow();
		var steve = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC6_ID_DEP1).orElseThrow();
		var steffen = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC7_ID_DEP1).orElseThrow();
		var sunny = trackedPeople.findById(TrackedPersonDataInitializer.VALID_TRACKED_SEC8_ID_DEP1).orElseThrow();

		var joel = trackedPeople.findById(TrackedPersonDataInitializer.INDEX_PERSON_DELETE1_DEP1).orElseThrow();
		var carlos = trackedPeople.findById(TrackedPersonDataInitializer.CONTACT_PERSON_DELETE1_DEP1).orElseThrow();

		var department1 = departments.findById(DepartmentDataInitializer.DEPARTMENT_ID_DEP1).orElseThrow();
		var department2 = departments.findById(DepartmentDataInitializer.DEPARTMENT_ID_DEP2).orElseThrow();

		// CASE Tanja
		cases.save(new TrackedCase(tanja, CaseType.CONTACT, department1));

		// CASE Markus
		cases.save(new TrackedCase(markus, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now(), LocalDate.now().plusWeeks(2)))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(2))));

		LocalDate start = LocalDate.now().minusWeeks(1);
		LocalDate end = start.plusWeeks(4);

		// CASE Sandra
		TrackedCase caseSandra = cases.save(new TrackedCase(TRACKED_CASE_SANDRA, sandra, CaseType.INDEX, department2, null)
				.setTestResult(TestResult.infected(start.minusDays(3)))
				.setQuarantine(Quarantine.of(start, end))
				.submitEnrollmentDetails()
				.submitQuestionnaire(new Questionnaire(SymptomInformation.withoutSymptoms(), "Herzinfarkt und Bluthochdruck",
						"Arbeite als Pfleger im Klinikum Mannheim")
						.withoutSymptoms()
						.withContactToVulnerablePeople("Arbeite in der Pflege")
						.setFamilyDoctor("Dr. Müller, Schwanenstr. 34 in Mannheim")
						.setGuessedOriginOfInfection("Auf dem Mannheim Blasmusikfestival"))
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS));

		// CASE Jessica
		cases.save(new TrackedCase(jessica, CaseType.CONTACT, department2));

		// CASE Gustav
		LocalDate startG = LocalDate.now().minusWeeks(1).plusDays(2);
		LocalDate endG = start.plusWeeks(2);

		cases.save(new TrackedCase(TRACKED_CASE_GUSTAV, gustav, CaseType.INDEX, department1, null)
				.setTestResult(TestResult.infected(startG.minusDays(1)))
				.setQuarantine(Quarantine.of(startG, endG))
				.submitEnrollmentDetails()
				.submitQuestionnaire(new Questionnaire(SymptomInformation.withoutSymptoms(), "Herzinfarkt und Bluthochdruck",
						"Chirurg im Klinikum Ludwigshafen")
								.withContactToVulnerablePeople("Arbeite in der Pflege")
								.setFamilyDoctor("Dr. Müller, Schwanenstr. 34 in Mannheim")
								.setGuessedOriginOfInfection("Auf dem Mannheim Blasmusikfestival"))
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS));

		// CASE Nadine
		LocalDate startN = LocalDate.now().minusWeeks(1).plusDays(2);
		LocalDate endN = start.plusWeeks(2);

		cases.save(new TrackedCase(TRACKED_CASE_NADINE, nadine, CaseType.INDEX, department1, null)
				.setTestResult(TestResult.infected(startN.minusDays(1)))
				.setQuarantine(Quarantine.of(startN, endN))
				.submitEnrollmentDetails()
				.submitQuestionnaire(
						new Questionnaire(SymptomInformation.withoutSymptoms(), null, "Chirurg im Klinikum Ludwigshafen")
								.withContactToVulnerablePeople("Alterheim Totenruh")
								.setFamilyDoctor("Dr. Müller, Schwanenstr. 34 in Mannheim")
								.setGuessedOriginOfInfection("Auf dem Mannheim Blasmusikfestival"))
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS));

		// CASE Siggi

		cases.save(new TrackedCase(TRACKED_CASE_SIGGI, siggi, CaseType.INDEX, department1, null)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(3), LocalDate.now().plusWeeks(2).minusDays(3)))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(2)))
				.submitEnrollmentDetails()
				.submitQuestionnaire(new Questionnaire(SymptomInformation.withoutSymptoms(), null, "Pfleger im Klinikum Darmstadt")
						.withoutContactToVulnerablePeople())
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS));

		cases.save(new TrackedCase(harry, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now(), LocalDate.now().plusWeeks(2))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(2)));

		cases.save(new TrackedCase(harriette, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now(), LocalDate.now().plusWeeks(2))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(2)));

		cases.save(new TrackedCase(sarah, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(4), LocalDate.now().plusWeeks(2).minusDays(4))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(5)));

		cases.save(new TrackedCase(sonja, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(1), LocalDate.now().plusWeeks(2).minusDays(1))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(2)));

		cases.save(new TrackedCase(steve, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(8), LocalDate.now().plusWeeks(2).minusDays(8))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(9)));

		cases.save(new TrackedCase(steffen, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(13), LocalDate.now().plusWeeks(2).minusDays(13))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(14)));

		cases.save(new TrackedCase(samuel, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(3), LocalDate.now().plusWeeks(2).minusDays(3))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(5)));

		cases.save(new TrackedCase(sunny, CaseType.INDEX, department1)
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(1), LocalDate.now().plusWeeks(2).minusDays(1))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(3)));

		cases.save(new TrackedCase(sylvia, CaseType.INDEX, department1) // s
				.setQuarantine(Quarantine.of(LocalDate.now().minusDays(9), LocalDate.now().plusWeeks(2).minusDays(9))))
				.setTestResult(TestResult.infected(LocalDate.now().minusDays(10)));

		// Special cases for deletion
		cases.save(new TrackedCase(TRACKED_CASE_JOEL, joel, CaseType.INDEX, department1, null)
				.setTestResult(TestResult.infected(start.minusDays(3)))
				.setQuarantine(Quarantine.of(start, end))
				.submitEnrollmentDetails()
				.submitQuestionnaire(new Questionnaire(SymptomInformation.withoutSymptoms(), "Herzinfarkt und Bluthochdruck",
						"Arbeite als Pfleger im Klinikum Mannheim")
						.withoutSymptoms())
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS)
				.setOriginContacts(List.of(new ContactPerson("First", "Last", ContactWays.ofEmailAddress("contact4joel@here.com"))))
				.setComments(List.of(new Comment("Comment", TRACKED_CASE_CARLOS.toString())))
				.setOriginCases(List.of(caseSandra)));

		cases.save(new TrackedCase(TRACKED_CASE_CARLOS, carlos, CaseType.CONTACT, department1, null)
				.setTestResult(TestResult.infected(start.minusDays(3)))
				.setQuarantine(Quarantine.of(start, end))
				.submitEnrollmentDetails()
				.submitQuestionnaire(new Questionnaire(SymptomInformation.withoutSymptoms(), "Herzinfarkt und Bluthochdruck",
						"Arbeite als Pfleger im Klinikum Mannheim")
								.withoutSymptoms())
				.markEnrollmentCompleted(EnrollmentCompletion.WITHOUT_ENCOUNTERS)
				.setOriginContacts(List.of(new ContactPerson("First", "Last", ContactWays.ofEmailAddress("contact4carlos@here.com"))))
				.setComments(List.of(new Comment("Comment", TRACKED_CASE_CARLOS.toString())))
				.setOriginCases(List.of(caseSandra)));


	}
}
