# PortfoliosApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postCreatePortfolio**](PortfoliosApi.md#postCreatePortfolio) | **POST** /CreatePortfolio | Create Portfolio
[**postDownloadPortfolio**](PortfoliosApi.md#postDownloadPortfolio) | **POST** /DownloadPortfolio | Download Portfolio
[**postLinkToPortfolio**](PortfoliosApi.md#postLinkToPortfolio) | **POST** /LinkToPortfolio | Link To Portfolio
[**postSetDocumentOrder**](PortfoliosApi.md#postSetDocumentOrder) | **POST** /SetDocumentOrder | Set Document Order
[**postSharePortfolio**](PortfoliosApi.md#postSharePortfolio) | **POST** /SharePortfolio | Share Portfolio
[**postSharePortfolioNoEmail**](PortfoliosApi.md#postSharePortfolioNoEmail) | **POST** /SharePortfolio_No_Email | Share Portfolio No Email


<a name="postCreatePortfolio"></a>
# **postCreatePortfolio**
> CreatePortfolioResponse postCreatePortfolio(contentType, createPortfolioRequest)

Create Portfolio

#### Used to create a portfolio to group documents.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val createPortfolioRequest : CreatePortfolioRequest = {"DocIDField":2147483647,"PortfolioNameField":"Application Portfolio","TokenIDField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // CreatePortfolioRequest | ##### Create Portfolio Request Model
try {
    val result : CreatePortfolioResponse = apiInstance.postCreatePortfolio(contentType, createPortfolioRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postCreatePortfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postCreatePortfolio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **createPortfolioRequest** | [**CreatePortfolioRequest**](CreatePortfolioRequest.md)| ##### Create Portfolio Request Model | [optional]

### Return type

[**CreatePortfolioResponse**](CreatePortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDownloadPortfolio"></a>
# **postDownloadPortfolio**
> DownloadPortfolioResponse postDownloadPortfolio(contentType, downloadPortfolioRequest)

Download Portfolio

#### Used to return a string that is then used to download a portfolio.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val downloadPortfolioRequest : DownloadPortfolioRequest = {"PortfolioIDField":111112,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // DownloadPortfolioRequest | ##### Download Portfolio Request Model
try {
    val result : DownloadPortfolioResponse = apiInstance.postDownloadPortfolio(contentType, downloadPortfolioRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postDownloadPortfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postDownloadPortfolio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **downloadPortfolioRequest** | [**DownloadPortfolioRequest**](DownloadPortfolioRequest.md)| ##### Download Portfolio Request Model | [optional]

### Return type

[**DownloadPortfolioResponse**](DownloadPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLinkToPortfolio"></a>
# **postLinkToPortfolio**
> LinkToPortfolioResponse postLinkToPortfolio(contentType, linkToPortfolioRequest)

Link To Portfolio

#### Used to get the url link to a portfolio.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val linkToPortfolioRequest : LinkToPortfolioRequest = {"DocIDField":"string","DocumentNameField":"string","PortfolioIDField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // LinkToPortfolioRequest | ##### Link To Portfolio Request Model
try {
    val result : LinkToPortfolioResponse = apiInstance.postLinkToPortfolio(contentType, linkToPortfolioRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postLinkToPortfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postLinkToPortfolio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **linkToPortfolioRequest** | [**LinkToPortfolioRequest**](LinkToPortfolioRequest.md)| ##### Link To Portfolio Request Model | [optional]

### Return type

[**LinkToPortfolioResponse**](LinkToPortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSetDocumentOrder"></a>
# **postSetDocumentOrder**
> SetDocumentOrderResponse postSetDocumentOrder(contentType, setDocumentOrderRequest)

Set Document Order

#### Used to set the order of documents that needs to be signed.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val setDocumentOrderRequest : SetDocumentOrderRequest = {"DocIDField":"string","DocumentOrderField":"string","TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"}} // SetDocumentOrderRequest | ##### Set Document Order Request Model
try {
    val result : SetDocumentOrderResponse = apiInstance.postSetDocumentOrder(contentType, setDocumentOrderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postSetDocumentOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postSetDocumentOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **setDocumentOrderRequest** | [**SetDocumentOrderRequest**](SetDocumentOrderRequest.md)| ##### Set Document Order Request Model | [optional]

### Return type

[**SetDocumentOrderResponse**](SetDocumentOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSharePortfolio"></a>
# **postSharePortfolio**
> SharePortfolioResponse postSharePortfolio(contentType, sharePortfolioRequest)

Share Portfolio

#### Used when a user wants to share a portfolio with someone else.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val sharePortfolioRequest : SharePortfolioRequest = {"AccessLevelField":0,"PortfolioIDField":"string","ShareOptionField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"},"UniqueIDField":"string"} // SharePortfolioRequest | ##### Share Portfolio Request Model
try {
    val result : SharePortfolioResponse = apiInstance.postSharePortfolio(contentType, sharePortfolioRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postSharePortfolio")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postSharePortfolio")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **sharePortfolioRequest** | [**SharePortfolioRequest**](SharePortfolioRequest.md)| ##### Share Portfolio Request Model | [optional]

### Return type

[**SharePortfolioResponse**](SharePortfolioResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSharePortfolioNoEmail"></a>
# **postSharePortfolioNoEmail**
> SharePortfolioNoEmailResponse postSharePortfolioNoEmail(contentType, sharePortfolioNoEmailRequest)

Share Portfolio No Email

#### Used when a user wants to share a portfolio without sending out an email.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = PortfoliosApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val sharePortfolioNoEmailRequest : SharePortfolioNoEmailRequest = {"AccessLevelField":0,"PortfolioIDField":"string","ShareOptionField":0,"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"},"UniqueIDField":"string"} // SharePortfolioNoEmailRequest | ##### Share Portfolio No Email Request Model
try {
    val result : SharePortfolioNoEmailResponse = apiInstance.postSharePortfolioNoEmail(contentType, sharePortfolioNoEmailRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortfoliosApi#postSharePortfolioNoEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortfoliosApi#postSharePortfolioNoEmail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **sharePortfolioNoEmailRequest** | [**SharePortfolioNoEmailRequest**](SharePortfolioNoEmailRequest.md)| ##### Share Portfolio No Email Request Model | [optional]

### Return type

[**SharePortfolioNoEmailResponse**](SharePortfolioNoEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

