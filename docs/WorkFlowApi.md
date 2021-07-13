# WorkFlowApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkFlowApi.md#createWorkflow) | **POST** /CreateWorkflow | Create Workflow
[**getDocument**](WorkFlowApi.md#getDocument) | **POST** /GetDoc | Get Document
[**postAddWorkflowStep**](WorkFlowApi.md#postAddWorkflowStep) | **POST** /AddWorkflowStepV2 | Add a Workflow step
[**postCancelFlow**](WorkFlowApi.md#postCancelFlow) | **POST** /CancelFlow | Cancel Flow
[**postDeleteDoc**](WorkFlowApi.md#postDeleteDoc) | **POST** /DeleteDoc | Delete Document
[**postDocPrepperAddField**](WorkFlowApi.md#postDocPrepperAddField) | **POST** /DocPrepperAddFieldsFlowID | Document Prepper Add Fields
[**postDocPrepperAdvancedFields**](WorkFlowApi.md#postDocPrepperAdvancedFields) | **POST** /DocPrepperAdvancedFields | Document Prepper Add Advanced Fields
[**postFullWorkflow**](WorkFlowApi.md#postFullWorkflow) | **POST** /FullWorkflow | FullWorkflow
[**postGetDocStatus**](WorkFlowApi.md#postGetDocStatus) | **POST** /GetDocStatus | Get Document Status
[**postInitiateFlow**](WorkFlowApi.md#postInitiateFlow) | **POST** /InitiateFlow | Initiate Flow
[**postInitiateFlowNoEmail**](WorkFlowApi.md#postInitiateFlowNoEmail) | **POST** /InitiateFlow_No_Email | Initiate Flow No Email
[**postInitiateFlowNoInitialEmail**](WorkFlowApi.md#postInitiateFlowNoInitialEmail) | **POST** /InitiateFlow_No_Initial_Email | Initiate Flow No Initial Email
[**postWorkflowSign**](WorkFlowApi.md#postWorkflowSign) | **POST** /WorkflowSign | Workflow Sign


<a name="createWorkflow"></a>
# **createWorkflow**
> CreateWorkflowResponse createWorkflow(contentType, createWorkflowRequest)

Create Workflow

#### Used to start a new workflow by passing a Base64 encoded document to SigniFlow

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val createWorkflowRequest : CreateWorkflowRequest = {"AdditionalDataField":"\"\"","AutoExpireField":0,"AutoRemindField":0,"DocField":"String content","DocNameField":"String content","DueDateField":"2019-08-24T14:15:22Z","ExtensionField":0,"MessageField":"String content","PriorityField":0,"SLAField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // CreateWorkflowRequest | ##### Create Workflow Request Model
try {
    val result : CreateWorkflowResponse = apiInstance.createWorkflow(contentType, createWorkflowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#createWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#createWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **createWorkflowRequest** | [**CreateWorkflowRequest**](CreateWorkflowRequest.md)| ##### Create Workflow Request Model |

### Return type

[**CreateWorkflowResponse**](CreateWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> GetDocumentResponse getDocument(contentType, getDocumentRequest)

Get Document

#### Used to download a document from SigniFlow.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocumentRequest : GetDocumentRequest = {"DocIDField":2147483647,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocumentRequest | ##### Get Document Request Model
try {
    val result : GetDocumentResponse = apiInstance.getDocument(contentType, getDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#getDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#getDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocumentRequest** | [**GetDocumentRequest**](GetDocumentRequest.md)| ##### Get Document Request Model | [optional]

### Return type

[**GetDocumentResponse**](GetDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAddWorkflowStep"></a>
# **postAddWorkflowStep**
> AddWokflowStepV2Response postAddWorkflowStep(contentType, addWorkflowStepV2Request)

Add a Workflow step

#### Used to add a step to a document Workflow process.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val addWorkflowStepV2Request : AddWorkflowStepV2Request = {"ActionField":0,"CellField":"string","DocIDField":"2147483647","EmailField":"email@domain.com","FirstNameField":"John","LanguageCodeField":"ENG","LastNameField":"Smith","ProxyAllowedField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // AddWorkflowStepV2Request | ##### Add A Workflow Step Request Model
try {
    val result : AddWokflowStepV2Response = apiInstance.postAddWorkflowStep(contentType, addWorkflowStepV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postAddWorkflowStep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postAddWorkflowStep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **addWorkflowStepV2Request** | [**AddWorkflowStepV2Request**](AddWorkflowStepV2Request.md)| ##### Add A Workflow Step Request Model | [optional]

### Return type

[**AddWokflowStepV2Response**](AddWokflowStepV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCancelFlow"></a>
# **postCancelFlow**
> CancelFlowResponse postCancelFlow(contentType, cancelFlowRequest)

Cancel Flow

#### Used to cancel a document workflow.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val cancelFlowRequest : CancelFlowRequest = {"DocIDField":"2147483647","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // CancelFlowRequest | ##### Cancel Flow Request Model
try {
    val result : CancelFlowResponse = apiInstance.postCancelFlow(contentType, cancelFlowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postCancelFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postCancelFlow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **cancelFlowRequest** | [**CancelFlowRequest**](CancelFlowRequest.md)| ##### Cancel Flow Request Model | [optional]

### Return type

[**CancelFlowResponse**](CancelFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDeleteDoc"></a>
# **postDeleteDoc**
> DeleteDocResponse postDeleteDoc(contentType, deleteDocRequest)

Delete Document

#### This is used to delete a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val deleteDocRequest : DeleteDocRequest = {"DocIDField":2147483647,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // DeleteDocRequest | ##### Delete Document Request Model
try {
    val result : DeleteDocResponse = apiInstance.postDeleteDoc(contentType, deleteDocRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postDeleteDoc")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postDeleteDoc")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **deleteDocRequest** | [**DeleteDocRequest**](DeleteDocRequest.md)| ##### Delete Document Request Model | [optional]

### Return type

[**DeleteDocResponse**](DeleteDocResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocPrepperAddField"></a>
# **postDocPrepperAddField**
> DocPrepperAddFieldsFlowIDResponse postDocPrepperAddField(contentType, docPrepperAddFieldsFlowIDRequest)

Document Prepper Add Fields

#### Used to add fields to a document using the user&#39;s FlowID.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val docPrepperAddFieldsFlowIDRequest : DocPrepperAddFieldsFlowIDRequest = {"DocFieldTypeField":0,"DocIDField":12344,"FlowIDField":11111,"HeightField":"25","WidthField":"20","IsInvisibleField":true,"LinkToField":"string","PageNumberField":2,"NameField":"string","UserEmailField":"email@domain.com","XCoordinateField":"50","YCoordinateField":"150","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // DocPrepperAddFieldsFlowIDRequest | ##### Document Prepper Add Fields Request Model
try {
    val result : DocPrepperAddFieldsFlowIDResponse = apiInstance.postDocPrepperAddField(contentType, docPrepperAddFieldsFlowIDRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postDocPrepperAddField")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postDocPrepperAddField")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **docPrepperAddFieldsFlowIDRequest** | [**DocPrepperAddFieldsFlowIDRequest**](DocPrepperAddFieldsFlowIDRequest.md)| ##### Document Prepper Add Fields Request Model | [optional]

### Return type

[**DocPrepperAddFieldsFlowIDResponse**](DocPrepperAddFieldsFlowIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocPrepperAdvancedFields"></a>
# **postDocPrepperAdvancedFields**
> DocPrepperAddAdvancedFieldsResponse postDocPrepperAdvancedFields(contentType, docPrepperAddAdvancedFieldsRequest)

Document Prepper Add Advanced Fields

#### Used to add advanced fields to a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val docPrepperAddAdvancedFieldsRequest : DocPrepperAddAdvancedFieldsRequest = {"FieldInfoListField":[{"AdvancedFieldTypeField":0,"DocIDField":2147483647,"FieldOptionsListField":[{"LinkedValueField":"string","MaxField":5,"MinField":2,"ValueField":"string"}],"FlowIDField":11111,"FontFamilyField":"Arial","FontSizeField":12,"HeightField":"30","WidthField":"15","LinkToField":"string","NameField":"Text Field","PageNumberField":2,"SearchableField":true,"UserEmailField":"John@domain.com","ValueField":"string","XCoordinateField":"60","YCoordinateField":"120"}],"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // DocPrepperAddAdvancedFieldsRequest | ##### Document Prepper Add Advanced Fields Request Model
try {
    val result : DocPrepperAddAdvancedFieldsResponse = apiInstance.postDocPrepperAdvancedFields(contentType, docPrepperAddAdvancedFieldsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postDocPrepperAdvancedFields")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postDocPrepperAdvancedFields")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **docPrepperAddAdvancedFieldsRequest** | [**DocPrepperAddAdvancedFieldsRequest**](DocPrepperAddAdvancedFieldsRequest.md)| ##### Document Prepper Add Advanced Fields Request Model | [optional]

### Return type

[**DocPrepperAddAdvancedFieldsResponse**](DocPrepperAddAdvancedFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFullWorkflow"></a>
# **postFullWorkflow**
> FullWorkflowResponse postFullWorkflow(contentType, fullWorkflowRequest)

FullWorkflow

#### Used to create a fullworkflow for a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val fullWorkflowRequest : FullWorkflowRequest = {"AdditionalDataField":"string","AutoRemindField":0,"CustomMessageField":"A message with things.","DocField":"string","DocNameField":"Document 1","DueDateField":"02/02/2021","ExtensionField":0,"FlattenDocumentField":true,"KeepContentSecurityField":true,"KeepCustomPropertiesField":true,"KeepXMPMetadataField":true,"PortfolioInformationField":{"CreatePortfolioField":true,"LinkToPortfolioField":true,"PortfolioIDField":11112,"PortfolioNameField":"Portfolio 1"},"PriorityField":0,"SLAField":0,"SendFirstEmailField":true,"SendWorkflowEmailsField":true,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"},"WorkflowUsersListField":[{"ActionField":0,"AllowProxyField":0,"AutoSignField":true,"EmailAddressField":"email@domain.com","GroupStepField":{"GroupMembersField":[{"LanguageCodeField":"string","UserEmailField":"string","UserFullNameField":"string","UserMobileNumberField":"string"}],"GroupNameField":"Managers","RequiredNumberOfSignaturesField":3},"LanguageCodeField":"ENG","LatitudeField":"string","LongitudeField":"string","MobileNumberField":"078 222 2222","PreloadedFaceToFaceSignersField":[{}],"SignReasonField":"Because yes","SignerPasswordField":"P@ssw0rd","UserFirstNameField":"John","UserFullNameField":"John Smith","UserLastNameField":"Smith","WorkflowUserFieldsField":[{"FieldTypeField":7,"FontFamilyField":"Arial","FontSizeField":15,"GroupUserNumberField":5,"HeightField":"15","IsInvisibleField":true,"PageNumberField":2,"TagNameField":"string","ValueField":"string","WidthField":"25","XCoordinateField":"60","XOffsetField":15,"YCoordinateField":"150","YOffsetField":20}]}]} // FullWorkflowRequest | ##### FullWorkflow Request Model
try {
    val result : FullWorkflowResponse = apiInstance.postFullWorkflow(contentType, fullWorkflowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postFullWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postFullWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **fullWorkflowRequest** | [**FullWorkflowRequest**](FullWorkflowRequest.md)| ##### FullWorkflow Request Model | [optional]

### Return type

[**FullWorkflowResponse**](FullWorkflowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDocStatus"></a>
# **postGetDocStatus**
> GetDocStatusResponse postGetDocStatus(contentType, getDocStatusRequest)

Get Document Status

#### Used to get the status of the document ex. pending/completed/rejected.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocStatusRequest : GetDocStatusRequest = {"DocIDField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocStatusRequest | ##### Get Document Status Request Model
try {
    val result : GetDocStatusResponse = apiInstance.postGetDocStatus(contentType, getDocStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postGetDocStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postGetDocStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocStatusRequest** | [**GetDocStatusRequest**](GetDocStatusRequest.md)| ##### Get Document Status Request Model | [optional]

### Return type

[**GetDocStatusResponse**](GetDocStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postInitiateFlow"></a>
# **postInitiateFlow**
> InitiateFlowResponse postInitiateFlow(contentType, initiateFlowRequest)

Initiate Flow

#### Used to initiate aworkflow of a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val initiateFlowRequest : InitiateFlowRequest = {"DocIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // InitiateFlowRequest | ##### Initiate Flow Request Model
try {
    val result : InitiateFlowResponse = apiInstance.postInitiateFlow(contentType, initiateFlowRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postInitiateFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postInitiateFlow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **initiateFlowRequest** | [**InitiateFlowRequest**](InitiateFlowRequest.md)| ##### Initiate Flow Request Model | [optional]

### Return type

[**InitiateFlowResponse**](InitiateFlowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postInitiateFlowNoEmail"></a>
# **postInitiateFlowNoEmail**
> InitiateFlowNoEmailResponse postInitiateFlowNoEmail(contentType, initiateFlowNoEmailRequest)

Initiate Flow No Email

#### Used to initiate a workflow without sending out emails.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val initiateFlowNoEmailRequest : InitiateFlowNoEmailRequest = {"DocIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // InitiateFlowNoEmailRequest | ##### Initiate Flow No Email Request Model
try {
    val result : InitiateFlowNoEmailResponse = apiInstance.postInitiateFlowNoEmail(contentType, initiateFlowNoEmailRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postInitiateFlowNoEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postInitiateFlowNoEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **initiateFlowNoEmailRequest** | [**InitiateFlowNoEmailRequest**](InitiateFlowNoEmailRequest.md)| ##### Initiate Flow No Email Request Model | [optional]

### Return type

[**InitiateFlowNoEmailResponse**](InitiateFlowNoEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postInitiateFlowNoInitialEmail"></a>
# **postInitiateFlowNoInitialEmail**
> InitiateFlowNoInitialEmailResponse postInitiateFlowNoInitialEmail(contentType, initiateFlowNoInitialEmailRequest)

Initiate Flow No Initial Email

#### Used to initiate a document workflow without an initial email being sent to the user.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val initiateFlowNoInitialEmailRequest : InitiateFlowNoInitialEmailRequest = {"DocIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // InitiateFlowNoInitialEmailRequest | ##### Initiate Flow No Initial Email Request Model
try {
    val result : InitiateFlowNoInitialEmailResponse = apiInstance.postInitiateFlowNoInitialEmail(contentType, initiateFlowNoInitialEmailRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postInitiateFlowNoInitialEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postInitiateFlowNoInitialEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **initiateFlowNoInitialEmailRequest** | [**InitiateFlowNoInitialEmailRequest**](InitiateFlowNoInitialEmailRequest.md)| ##### Initiate Flow No Initial Email Request Model | [optional]

### Return type

[**InitiateFlowNoInitialEmailResponse**](InitiateFlowNoInitialEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWorkflowSign"></a>
# **postWorkflowSign**
> WorkflowSignResponse postWorkflowSign(contentType, workflowSignRequest)

Workflow Sign

#### Used to send a request to a user to sign a document workflow.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = WorkFlowApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val workflowSignRequest : WorkflowSignRequest = {"DocIDField":"string","LatitudeField":"string","LoginPasswordField":"pa$$word","LoginUserNameField":"email@domain.com","LongitudeField":"string","SignReasonField":"string","TimeZoneOffsetField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // WorkflowSignRequest | ##### Workflow Sign Request Model
try {
    val result : WorkflowSignResponse = apiInstance.postWorkflowSign(contentType, workflowSignRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkFlowApi#postWorkflowSign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkFlowApi#postWorkflowSign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **workflowSignRequest** | [**WorkflowSignRequest**](WorkflowSignRequest.md)| ##### Workflow Sign Request Model | [optional]

### Return type

[**WorkflowSignResponse**](WorkflowSignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

