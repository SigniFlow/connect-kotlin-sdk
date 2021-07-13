# ViewersApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postGetDocLink**](ViewersApi.md#postGetDocLink) | **POST** /GetDocLink | Get Document Link
[**postGetDocumentPrepperLink**](ViewersApi.md#postGetDocumentPrepperLink) | **POST** /GetDocumentPrepperLink | Get Document Prepper Link


<a name="postGetDocLink"></a>
# **postGetDocLink**
> GetDocLinkResponse postGetDocLink(contentType, getDocLinkRequest)

Get Document Link

#### Used to get the document link that will be used to sign a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = ViewersApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocLinkRequest : GetDocLinkRequest = {"DocIDField":"string","EmailField":"email@domain.com","ReturnURLField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocLinkRequest | ##### Get Document Link Request Model
try {
    val result : GetDocLinkResponse = apiInstance.postGetDocLink(contentType, getDocLinkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewersApi#postGetDocLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewersApi#postGetDocLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocLinkRequest** | [**GetDocLinkRequest**](GetDocLinkRequest.md)| ##### Get Document Link Request Model | [optional]

### Return type

[**GetDocLinkResponse**](GetDocLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postGetDocumentPrepperLink"></a>
# **postGetDocumentPrepperLink**
> GetDocumentPrepperLinkResponse postGetDocumentPrepperLink(contentType, getDocumentPrepperLinkRequest)

Get Document Prepper Link

#### Used to get a document prepper link (url).

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = ViewersApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val getDocumentPrepperLinkRequest : GetDocumentPrepperLinkRequest = {"DocIDField":"string","EmailSettingField":0,"ReturnURLField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // GetDocumentPrepperLinkRequest | ##### Get Document Prepper Link Request Model
try {
    val result : GetDocumentPrepperLinkResponse = apiInstance.postGetDocumentPrepperLink(contentType, getDocumentPrepperLinkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ViewersApi#postGetDocumentPrepperLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ViewersApi#postGetDocumentPrepperLink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **getDocumentPrepperLinkRequest** | [**GetDocumentPrepperLinkRequest**](GetDocumentPrepperLinkRequest.md)| ##### Get Document Prepper Link Request Model | [optional]

### Return type

[**GetDocumentPrepperLinkResponse**](GetDocumentPrepperLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

