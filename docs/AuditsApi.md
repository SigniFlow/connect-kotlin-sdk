# AuditsApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postGetAuditDocument**](AuditsApi.md#postGetAuditDocument) | **POST** /GetAuditDocument | Get Audit Document
[**postGetDocumentAudit**](AuditsApi.md#postGetDocumentAudit) | **POST** /GetDocumentAudit | Get Document Audit


<a name="postGetAuditDocument"></a>
# **postGetAuditDocument**
> GetAuditDocumentResponse postGetAuditDocument(contentType, getAuditDocumentRequest)

Get Audit Document

#### Used to get an audit document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuditsApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getAuditDocumentRequest : GetAuditDocumentRequest = {"DocIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetAuditDocumentRequest | ##### Get Audit Document Request Model
try {
    val result : GetAuditDocumentResponse = apiInstance.postGetAuditDocument(contentType, getAuditDocumentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditsApi#postGetAuditDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditsApi#postGetAuditDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getAuditDocumentRequest** | [**GetAuditDocumentRequest**](GetAuditDocumentRequest.md)| ##### Get Audit Document Request Model | [optional]

### Return type

[**GetAuditDocumentResponse**](GetAuditDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDocumentAudit"></a>
# **postGetDocumentAudit**
> GetDocumentAuditResponse postGetDocumentAudit(contentType, getDocumentAuditRequest)

Get Document Audit

#### Used to get the audit information from a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuditsApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocumentAuditRequest : GetDocumentAuditRequest = {"DocIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocumentAuditRequest | ##### Get Document Audit Request Model
try {
    val result : GetDocumentAuditResponse = apiInstance.postGetDocumentAudit(contentType, getDocumentAuditRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditsApi#postGetDocumentAudit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditsApi#postGetDocumentAudit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocumentAuditRequest** | [**GetDocumentAuditRequest**](GetDocumentAuditRequest.md)| ##### Get Document Audit Request Model | [optional]

### Return type

[**GetDocumentAuditResponse**](GetDocumentAuditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

