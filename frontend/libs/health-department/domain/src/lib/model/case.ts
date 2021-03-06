import { HalResponse } from '@qro/shared/util-data-access';
import { CaseType } from '@qro/auth/api';
import { CaseCommentDto } from './case-comment';
import { ContactDto } from './contact';
import { CaseSearchItem } from './case-search-item';

export interface CaseDto extends HalResponse {
  dateOfBirth?: Date;
  firstName: string;
  lastName: string;
  zipCode?: string;
  email?: string;
  phone?: string;
  enrollmentCompleted?: boolean;
  caseType?: CaseType;
  medicalStaff?: boolean;
  caseId?: string;
  caseTypeLabel: string;
  createdAt?: Date;
  extReferenceNumber: string;

  testDate?: Date;
  quarantineStartDate?: Date;
  quarantineEndDate?: Date;
  street?: string;
  houseNumber?: string;
  city?: string;
  mobilePhone?: string;
  comments?: CaseCommentDto[];
  status?: CaseStatus;
  infected?: boolean;
  indexContacts?: ContactDto[];
  contactCount?: number;
  openAnomaliesCount?: number;
  originCases?: string[];
  locale?: string;
  _embedded?: CaseDetailsEmbeddedDto;
}

export interface CaseDetailsEmbeddedDto {
  originCases: CaseSearchItem[];
}

export enum CaseStatus {
  Angelegt = 'angelegt',
  InRegistrierung = 'in Registrierung',
  RegistrierungAbgeschlossen = 'Registrierung abgeschlossen',
  InNachverfolgung = 'in Nachverfolgung',
  Abgeschlossen = 'abgeschlossen',
}

export function sortByLastName(a: { lastName: string }, b: { lastName: string }): number {
  if (!a.lastName) {
    return -1;
  }
  return a.lastName.localeCompare(b.lastName);
}

export function caseTypeFilter(entities: { caseType: CaseType }[], search: string) {
  return entities.filter((e) => -1 < e.caseType.indexOf(search));
}
