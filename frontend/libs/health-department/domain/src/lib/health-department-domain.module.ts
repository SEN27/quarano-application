import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReportCaseActionsResolver } from './resolvers/report-case-actions.resolver';
import { CaseDetailResolver } from './resolvers/case-detail.resolver';
import { ContactCaseCaseListResolver } from './resolvers/contact-case-case-list.resolver';
import { ContactCaseActionListResolver } from './resolvers/contact-case-action-list.resolver';
import { IndexCaseActionListResolver } from './resolvers/index-case-action-list.resolver';
import { IndexCaseCaseListResolver } from './resolvers/index-case-case-list.resolver';
import { DefaultDataServiceConfig, EntityDataService, EntityDefinitionService } from '@ngrx/data';
import { healthDepartmentConfig } from './store/entity-metadata';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [CommonModule, HttpClientModule],
  providers: [
    ReportCaseActionsResolver,
    CaseDetailResolver,
    ContactCaseActionListResolver,
    ContactCaseCaseListResolver,
    IndexCaseActionListResolver,
    IndexCaseCaseListResolver,
  ],
})
export class HealthDepartmentDomainModule {
  constructor(eds: EntityDefinitionService, entityDataService: EntityDataService) {
    eds.registerMetadataMap(healthDepartmentConfig.entityMetadata);
  }
}
