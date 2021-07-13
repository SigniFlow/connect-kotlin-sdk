# SigniFlow.Connect - Kotlin client library for SigniFlow OpenAPI Spec v1

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuditsApi* | [**postGetAuditDocument**](docs/AuditsApi.md#postgetauditdocument) | **POST** /GetAuditDocument | Get Audit Document
*AuditsApi* | [**postGetDocumentAudit**](docs/AuditsApi.md#postgetdocumentaudit) | **POST** /GetDocumentAudit | Get Document Audit
*AuthenticationApi* | [**login**](docs/AuthenticationApi.md#login) | **POST** /Login | Login
*AuthenticationApi* | [**postLogout**](docs/AuthenticationApi.md#postlogout) | **POST** /Logout | Logout
*AuthenticationApi* | [**postTokenExtend**](docs/AuthenticationApi.md#posttokenextend) | **POST** /TokenExtend | Token Extend
*AuthenticationApi* | [**postTokenValidate**](docs/AuthenticationApi.md#posttokenvalidate) | **POST** /TokenValidate | Token Validate
*PortfoliosApi* | [**postCreatePortfolio**](docs/PortfoliosApi.md#postcreateportfolio) | **POST** /CreatePortfolio | Create Portfolio
*PortfoliosApi* | [**postDownloadPortfolio**](docs/PortfoliosApi.md#postdownloadportfolio) | **POST** /DownloadPortfolio | Download Portfolio
*PortfoliosApi* | [**postLinkToPortfolio**](docs/PortfoliosApi.md#postlinktoportfolio) | **POST** /LinkToPortfolio | Link To Portfolio
*PortfoliosApi* | [**postSetDocumentOrder**](docs/PortfoliosApi.md#postsetdocumentorder) | **POST** /SetDocumentOrder | Set Document Order
*PortfoliosApi* | [**postSharePortfolio**](docs/PortfoliosApi.md#postshareportfolio) | **POST** /SharePortfolio | Share Portfolio
*PortfoliosApi* | [**postSharePortfolioNoEmail**](docs/PortfoliosApi.md#postshareportfolionoemail) | **POST** /SharePortfolio_No_Email | Share Portfolio No Email
*SigningCeremonyApi* | [**postMultipleSignersSigningCeremony**](docs/SigningCeremonyApi.md#postmultiplesignerssigningceremony) | **POST** /MultipleSignersSigningCeremony | Multiple Signers Signing Ceremony
*SigningCeremonyApi* | [**postSigningCeremonyV2**](docs/SigningCeremonyApi.md#postsigningceremonyv2) | **POST** /SigningCeremonyV2 | Signing Ceremony V2
*TemplatesApi* | [**postApplyPrepperTemplate**](docs/TemplatesApi.md#postapplypreppertemplate) | **POST** /ApplyPrepperTemplate | Apply a Prepper template
*TemplatesApi* | [**postGetDocumentTagFieldBoxPosition**](docs/TemplatesApi.md#postgetdocumenttagfieldboxposition) | **POST** /GetDocumentTagFieldBoxPosition | Get Document Tag Field Box Position
*TemplatesApi* | [**postGetDocumentTagFieldPosition**](docs/TemplatesApi.md#postgetdocumenttagfieldposition) | **POST** /GetDocumentTagFieldPosition | Get Document Tag Field Position
*TemplatesApi* | [**postGetPrepperTemplate**](docs/TemplatesApi.md#postgetpreppertemplate) | **POST** /GetPrepperTemplate | Get Prepper Template
*TemplatesApi* | [**postGetPrepperTemplateList**](docs/TemplatesApi.md#postgetpreppertemplatelist) | **POST** /GetPrepperTemplateList | Get Prepper Template List
*ViewersApi* | [**postGetDocLink**](docs/ViewersApi.md#postgetdoclink) | **POST** /GetDocLink | Get Document Link
*ViewersApi* | [**postGetDocumentPrepperLink**](docs/ViewersApi.md#postgetdocumentprepperlink) | **POST** /GetDocumentPrepperLink | Get Document Prepper Link
*WorkFlowApi* | [**createWorkflow**](docs/WorkFlowApi.md#createworkflow) | **POST** /CreateWorkflow | Create Workflow
*WorkFlowApi* | [**getDocument**](docs/WorkFlowApi.md#getdocument) | **POST** /GetDoc | Get Document
*WorkFlowApi* | [**postAddWorkflowStep**](docs/WorkFlowApi.md#postaddworkflowstep) | **POST** /AddWorkflowStepV2 | Add a Workflow step
*WorkFlowApi* | [**postCancelFlow**](docs/WorkFlowApi.md#postcancelflow) | **POST** /CancelFlow | Cancel Flow
*WorkFlowApi* | [**postDeleteDoc**](docs/WorkFlowApi.md#postdeletedoc) | **POST** /DeleteDoc | Delete Document
*WorkFlowApi* | [**postDocPrepperAddField**](docs/WorkFlowApi.md#postdocprepperaddfield) | **POST** /DocPrepperAddFieldsFlowID | Document Prepper Add Fields
*WorkFlowApi* | [**postDocPrepperAdvancedFields**](docs/WorkFlowApi.md#postdocprepperadvancedfields) | **POST** /DocPrepperAdvancedFields | Document Prepper Add Advanced Fields
*WorkFlowApi* | [**postFullWorkflow**](docs/WorkFlowApi.md#postfullworkflow) | **POST** /FullWorkflow | FullWorkflow
*WorkFlowApi* | [**postGetDocStatus**](docs/WorkFlowApi.md#postgetdocstatus) | **POST** /GetDocStatus | Get Document Status
*WorkFlowApi* | [**postInitiateFlow**](docs/WorkFlowApi.md#postinitiateflow) | **POST** /InitiateFlow | Initiate Flow
*WorkFlowApi* | [**postInitiateFlowNoEmail**](docs/WorkFlowApi.md#postinitiateflownoemail) | **POST** /InitiateFlow_No_Email | Initiate Flow No Email
*WorkFlowApi* | [**postInitiateFlowNoInitialEmail**](docs/WorkFlowApi.md#postinitiateflownoinitialemail) | **POST** /InitiateFlow_No_Initial_Email | Initiate Flow No Initial Email
*WorkFlowApi* | [**postWorkflowSign**](docs/WorkFlowApi.md#postworkflowsign) | **POST** /WorkflowSign | Workflow Sign


<a name="documentation-for-models"></a>
## Documentation for Models

 - [SigniFlow.Connect.models.ActionField](docs/ActionField.md)
 - [SigniFlow.Connect.models.AddWokflowStepV2Response](docs/AddWokflowStepV2Response.md)
 - [SigniFlow.Connect.models.AddWokflowStepV2ResponseFlowStepsField](docs/AddWokflowStepV2ResponseFlowStepsField.md)
 - [SigniFlow.Connect.models.AddWorkflowStepV2Request](docs/AddWorkflowStepV2Request.md)
 - [SigniFlow.Connect.models.AdvancedFieldType](docs/AdvancedFieldType.md)
 - [SigniFlow.Connect.models.ApplyPrepperTemplateRequest](docs/ApplyPrepperTemplateRequest.md)
 - [SigniFlow.Connect.models.ApplyPrepperTemplateResponse](docs/ApplyPrepperTemplateResponse.md)
 - [SigniFlow.Connect.models.AutoExpire](docs/AutoExpire.md)
 - [SigniFlow.Connect.models.AutoRemind](docs/AutoRemind.md)
 - [SigniFlow.Connect.models.CancelFlowRequest](docs/CancelFlowRequest.md)
 - [SigniFlow.Connect.models.CancelFlowResponse](docs/CancelFlowResponse.md)
 - [SigniFlow.Connect.models.CreatePortfolioRequest](docs/CreatePortfolioRequest.md)
 - [SigniFlow.Connect.models.CreatePortfolioResponse](docs/CreatePortfolioResponse.md)
 - [SigniFlow.Connect.models.CreateWorkflowRequest](docs/CreateWorkflowRequest.md)
 - [SigniFlow.Connect.models.CreateWorkflowResponse](docs/CreateWorkflowResponse.md)
 - [SigniFlow.Connect.models.DeleteDocRequest](docs/DeleteDocRequest.md)
 - [SigniFlow.Connect.models.DeleteDocResponse](docs/DeleteDocResponse.md)
 - [SigniFlow.Connect.models.DocExtension](docs/DocExtension.md)
 - [SigniFlow.Connect.models.DocPrepperAddAdvancedFieldsRequest](docs/DocPrepperAddAdvancedFieldsRequest.md)
 - [SigniFlow.Connect.models.DocPrepperAddAdvancedFieldsRequestFieldInfoListField](docs/DocPrepperAddAdvancedFieldsRequestFieldInfoListField.md)
 - [SigniFlow.Connect.models.DocPrepperAddAdvancedFieldsRequestFieldOptionsListField](docs/DocPrepperAddAdvancedFieldsRequestFieldOptionsListField.md)
 - [SigniFlow.Connect.models.DocPrepperAddAdvancedFieldsResponse](docs/DocPrepperAddAdvancedFieldsResponse.md)
 - [SigniFlow.Connect.models.DocPrepperAddAdvancedFieldsResponseAdvancedFieldResponseListField](docs/DocPrepperAddAdvancedFieldsResponseAdvancedFieldResponseListField.md)
 - [SigniFlow.Connect.models.DocPrepperAddFieldsFlowIDRequest](docs/DocPrepperAddFieldsFlowIDRequest.md)
 - [SigniFlow.Connect.models.DocPrepperAddFieldsFlowIDResponse](docs/DocPrepperAddFieldsFlowIDResponse.md)
 - [SigniFlow.Connect.models.DownloadPortfolioRequest](docs/DownloadPortfolioRequest.md)
 - [SigniFlow.Connect.models.DownloadPortfolioResponse](docs/DownloadPortfolioResponse.md)
 - [SigniFlow.Connect.models.FieldType](docs/FieldType.md)
 - [SigniFlow.Connect.models.FullWorkflowRequest](docs/FullWorkflowRequest.md)
 - [SigniFlow.Connect.models.FullWorkflowRequestGroupStepField](docs/FullWorkflowRequestGroupStepField.md)
 - [SigniFlow.Connect.models.FullWorkflowRequestGroupStepFieldGroupMembersField](docs/FullWorkflowRequestGroupStepFieldGroupMembersField.md)
 - [SigniFlow.Connect.models.FullWorkflowRequestPortfolioInformationField](docs/FullWorkflowRequestPortfolioInformationField.md)
 - [SigniFlow.Connect.models.FullWorkflowRequestWorkflowUserFieldsField](docs/FullWorkflowRequestWorkflowUserFieldsField.md)
 - [SigniFlow.Connect.models.FullWorkflowRequestWorkflowUsersListField](docs/FullWorkflowRequestWorkflowUsersListField.md)
 - [SigniFlow.Connect.models.FullWorkflowResponse](docs/FullWorkflowResponse.md)
 - [SigniFlow.Connect.models.GetAuditDocumentRequest](docs/GetAuditDocumentRequest.md)
 - [SigniFlow.Connect.models.GetAuditDocumentResponse](docs/GetAuditDocumentResponse.md)
 - [SigniFlow.Connect.models.GetDocLinkRequest](docs/GetDocLinkRequest.md)
 - [SigniFlow.Connect.models.GetDocLinkResponse](docs/GetDocLinkResponse.md)
 - [SigniFlow.Connect.models.GetDocStatusRequest](docs/GetDocStatusRequest.md)
 - [SigniFlow.Connect.models.GetDocStatusResponse](docs/GetDocStatusResponse.md)
 - [SigniFlow.Connect.models.GetDocumentAuditRequest](docs/GetDocumentAuditRequest.md)
 - [SigniFlow.Connect.models.GetDocumentAuditResponse](docs/GetDocumentAuditResponse.md)
 - [SigniFlow.Connect.models.GetDocumentAuditResponseActivityField](docs/GetDocumentAuditResponseActivityField.md)
 - [SigniFlow.Connect.models.GetDocumentPrepperLinkRequest](docs/GetDocumentPrepperLinkRequest.md)
 - [SigniFlow.Connect.models.GetDocumentPrepperLinkResponse](docs/GetDocumentPrepperLinkResponse.md)
 - [SigniFlow.Connect.models.GetDocumentRequest](docs/GetDocumentRequest.md)
 - [SigniFlow.Connect.models.GetDocumentResponse](docs/GetDocumentResponse.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldBoxPositionRequest](docs/GetDocumentTagFieldBoxPositionRequest.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldBoxPositionResponse](docs/GetDocumentTagFieldBoxPositionResponse.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField](docs/GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldPositionRequest](docs/GetDocumentTagFieldPositionRequest.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldPositionResponse](docs/GetDocumentTagFieldPositionResponse.md)
 - [SigniFlow.Connect.models.GetDocumentTagFieldPositionResponseDocumentTagFieldsPositionField](docs/GetDocumentTagFieldPositionResponseDocumentTagFieldsPositionField.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateListRequest](docs/GetPrepperTemplateListRequest.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateListResponse](docs/GetPrepperTemplateListResponse.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateListResponseTemplateInformationValuesField](docs/GetPrepperTemplateListResponseTemplateInformationValuesField.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateRequest](docs/GetPrepperTemplateRequest.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateResponse](docs/GetPrepperTemplateResponse.md)
 - [SigniFlow.Connect.models.GetPrepperTemplateResponsePrepperTemplateValuesField](docs/GetPrepperTemplateResponsePrepperTemplateValuesField.md)
 - [SigniFlow.Connect.models.InitiateFlowNoEmailRequest](docs/InitiateFlowNoEmailRequest.md)
 - [SigniFlow.Connect.models.InitiateFlowNoEmailResponse](docs/InitiateFlowNoEmailResponse.md)
 - [SigniFlow.Connect.models.InitiateFlowNoInitialEmailRequest](docs/InitiateFlowNoInitialEmailRequest.md)
 - [SigniFlow.Connect.models.InitiateFlowNoInitialEmailResponse](docs/InitiateFlowNoInitialEmailResponse.md)
 - [SigniFlow.Connect.models.InitiateFlowRequest](docs/InitiateFlowRequest.md)
 - [SigniFlow.Connect.models.InitiateFlowResponse](docs/InitiateFlowResponse.md)
 - [SigniFlow.Connect.models.LinkToPortfolioRequest](docs/LinkToPortfolioRequest.md)
 - [SigniFlow.Connect.models.LinkToPortfolioResponse](docs/LinkToPortfolioResponse.md)
 - [SigniFlow.Connect.models.LoginRequest](docs/LoginRequest.md)
 - [SigniFlow.Connect.models.LoginResponse](docs/LoginResponse.md)
 - [SigniFlow.Connect.models.LogoutRequest](docs/LogoutRequest.md)
 - [SigniFlow.Connect.models.LogoutResponse](docs/LogoutResponse.md)
 - [SigniFlow.Connect.models.MultipleSignersSigningCeremonyRequest](docs/MultipleSignersSigningCeremonyRequest.md)
 - [SigniFlow.Connect.models.MultipleSignersSigningCeremonyRequestSignerListField](docs/MultipleSignersSigningCeremonyRequestSignerListField.md)
 - [SigniFlow.Connect.models.MultipleSignersSigningCeremonyResponse](docs/MultipleSignersSigningCeremonyResponse.md)
 - [SigniFlow.Connect.models.Priority](docs/Priority.md)
 - [SigniFlow.Connect.models.ProxyAllowedField](docs/ProxyAllowedField.md)
 - [SigniFlow.Connect.models.SetDocumentOrderRequest](docs/SetDocumentOrderRequest.md)
 - [SigniFlow.Connect.models.SetDocumentOrderResponse](docs/SetDocumentOrderResponse.md)
 - [SigniFlow.Connect.models.SharePortfolioNoEmailRequest](docs/SharePortfolioNoEmailRequest.md)
 - [SigniFlow.Connect.models.SharePortfolioNoEmailResponse](docs/SharePortfolioNoEmailResponse.md)
 - [SigniFlow.Connect.models.SharePortfolioRequest](docs/SharePortfolioRequest.md)
 - [SigniFlow.Connect.models.SharePortfolioResponse](docs/SharePortfolioResponse.md)
 - [SigniFlow.Connect.models.SigningCeremonyV2Request](docs/SigningCeremonyV2Request.md)
 - [SigniFlow.Connect.models.SigningCeremonyV2Response](docs/SigningCeremonyV2Response.md)
 - [SigniFlow.Connect.models.TokenExtendRequest](docs/TokenExtendRequest.md)
 - [SigniFlow.Connect.models.TokenExtendResponse](docs/TokenExtendResponse.md)
 - [SigniFlow.Connect.models.TokenField](docs/TokenField.md)
 - [SigniFlow.Connect.models.TokenValidateRequest](docs/TokenValidateRequest.md)
 - [SigniFlow.Connect.models.TokenValidateResponse](docs/TokenValidateResponse.md)
 - [SigniFlow.Connect.models.WorkflowSignRequest](docs/WorkflowSignRequest.md)
 - [SigniFlow.Connect.models.WorkflowSignResponse](docs/WorkflowSignResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
