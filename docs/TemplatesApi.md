# TemplatesApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postApplyPrepperTemplate**](TemplatesApi.md#postApplyPrepperTemplate) | **POST** /ApplyPrepperTemplate | Apply a Prepper template
[**postGetDocumentTagFieldBoxPosition**](TemplatesApi.md#postGetDocumentTagFieldBoxPosition) | **POST** /GetDocumentTagFieldBoxPosition | Get Document Tag Field Box Position
[**postGetDocumentTagFieldPosition**](TemplatesApi.md#postGetDocumentTagFieldPosition) | **POST** /GetDocumentTagFieldPosition | Get Document Tag Field Position
[**postGetPrepperTemplate**](TemplatesApi.md#postGetPrepperTemplate) | **POST** /GetPrepperTemplate | Get Prepper Template
[**postGetPrepperTemplateList**](TemplatesApi.md#postGetPrepperTemplateList) | **POST** /GetPrepperTemplateList | Get Prepper Template List


<a name="postApplyPrepperTemplate"></a>
# **postApplyPrepperTemplate**
> ApplyPrepperTemplateResponse postApplyPrepperTemplate(contentType, applyPrepperTemplateRequest)

Apply a Prepper template

#### Used when applying a templaet to a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = TemplatesApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val applyPrepperTemplateRequest : ApplyPrepperTemplateRequest = {"DocIDField":2147483647,"PrepperTemplateIDField":21344,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // ApplyPrepperTemplateRequest | ##### Apply A Prepper Template Request Model
try {
    val result : ApplyPrepperTemplateResponse = apiInstance.postApplyPrepperTemplate(contentType, applyPrepperTemplateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#postApplyPrepperTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#postApplyPrepperTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **applyPrepperTemplateRequest** | [**ApplyPrepperTemplateRequest**](ApplyPrepperTemplateRequest.md)| ##### Apply A Prepper Template Request Model | [optional]

### Return type

[**ApplyPrepperTemplateResponse**](ApplyPrepperTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDocumentTagFieldBoxPosition"></a>
# **postGetDocumentTagFieldBoxPosition**
> GetDocumentTagFieldBoxPositionResponse postGetDocumentTagFieldBoxPosition(contentType, getDocumentTagFieldBoxPositionRequest)

Get Document Tag Field Box Position

#### Used to get the tag field box position on a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = TemplatesApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocumentTagFieldBoxPositionRequest : GetDocumentTagFieldBoxPositionRequest = {"DocIDField":0,"TagNameField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocumentTagFieldBoxPositionRequest | ##### Get Document Tag Field Box Position Request Model
try {
    val result : GetDocumentTagFieldBoxPositionResponse = apiInstance.postGetDocumentTagFieldBoxPosition(contentType, getDocumentTagFieldBoxPositionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#postGetDocumentTagFieldBoxPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#postGetDocumentTagFieldBoxPosition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocumentTagFieldBoxPositionRequest** | [**GetDocumentTagFieldBoxPositionRequest**](GetDocumentTagFieldBoxPositionRequest.md)| ##### Get Document Tag Field Box Position Request Model | [optional]

### Return type

[**GetDocumentTagFieldBoxPositionResponse**](GetDocumentTagFieldBoxPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDocumentTagFieldPosition"></a>
# **postGetDocumentTagFieldPosition**
> GetDocumentTagFieldPositionResponse postGetDocumentTagFieldPosition(contentType, getDocumentTagFieldPositionRequest)

Get Document Tag Field Position

#### Used to get the tag position on a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = TemplatesApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocumentTagFieldPositionRequest : GetDocumentTagFieldPositionRequest = {"DocIDField":0,"TagNameField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocumentTagFieldPositionRequest | ##### Get Document Tag Field Position Request Model
try {
    val result : GetDocumentTagFieldPositionResponse = apiInstance.postGetDocumentTagFieldPosition(contentType, getDocumentTagFieldPositionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#postGetDocumentTagFieldPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#postGetDocumentTagFieldPosition")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocumentTagFieldPositionRequest** | [**GetDocumentTagFieldPositionRequest**](GetDocumentTagFieldPositionRequest.md)| ##### Get Document Tag Field Position Request Model | [optional]

### Return type

[**GetDocumentTagFieldPositionResponse**](GetDocumentTagFieldPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetPrepperTemplate"></a>
# **postGetPrepperTemplate**
> GetPrepperTemplateResponse postGetPrepperTemplate(contentType, getPrepperTemplateRequest)

Get Prepper Template

#### Used to get a document template.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = TemplatesApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getPrepperTemplateRequest : GetPrepperTemplateRequest = {"DocIDField":0,"PrepperTemplateIDField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetPrepperTemplateRequest | ##### Get Prepper Template Request Model
try {
    val result : GetPrepperTemplateResponse = apiInstance.postGetPrepperTemplate(contentType, getPrepperTemplateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#postGetPrepperTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#postGetPrepperTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getPrepperTemplateRequest** | [**GetPrepperTemplateRequest**](GetPrepperTemplateRequest.md)| ##### Get Prepper Template Request Model | [optional]

### Return type

[**GetPrepperTemplateResponse**](GetPrepperTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetPrepperTemplateList"></a>
# **postGetPrepperTemplateList**
> GetPrepperTemplateListResponse postGetPrepperTemplateList(contentType, getPrepperTemplateListRequest)

Get Prepper Template List

#### Used to get a list of document templates.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = TemplatesApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getPrepperTemplateListRequest : GetPrepperTemplateListRequest = {"TemplateFolderField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetPrepperTemplateListRequest | ##### Get Prepper Template List Request Model
try {
    val result : GetPrepperTemplateListResponse = apiInstance.postGetPrepperTemplateList(contentType, getPrepperTemplateListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#postGetPrepperTemplateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#postGetPrepperTemplateList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getPrepperTemplateListRequest** | [**GetPrepperTemplateListRequest**](GetPrepperTemplateListRequest.md)| ##### Get Prepper Template List Request Model | [optional]

### Return type

[**GetPrepperTemplateListResponse**](GetPrepperTemplateListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

