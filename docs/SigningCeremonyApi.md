# SigningCeremonyApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postMultipleSignersSigningCeremony**](SigningCeremonyApi.md#postMultipleSignersSigningCeremony) | **POST** /MultipleSignersSigningCeremony | Multiple Signers Signing Ceremony
[**postSigningCeremonyV2**](SigningCeremonyApi.md#postSigningCeremonyV2) | **POST** /SigningCeremonyV2 | Signing Ceremony V2


<a name="postMultipleSignersSigningCeremony"></a>
# **postMultipleSignersSigningCeremony**
> MultipleSignersSigningCeremonyResponse postMultipleSignersSigningCeremony(contentType, multipleSignersSigningCeremonyRequest)

Multiple Signers Signing Ceremony

#### Used when there are multiple signers on a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = SigningCeremonyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val multipleSignersSigningCeremonyRequest : MultipleSignersSigningCeremonyRequest = {"DocField":"string","DocNameField":"string","LoginPasswordField":"12345","LoginUserNameField":"John@gmail.com","SignerListField":[{"SignatureHField":0,"SignatureImageField":"string","SignatureImageIncludeBorderField":true,"SignatureImageIncludeReasonField":true,"SignatureImageIncludeSignedByField":true,"SignatureImageIncludeSignedDateField":true,"SignatureImageTypeField":0,"SignaturePageField":0,"SignatureWField":0,"SignatureXField":0,"SignatureYField":0,"SignerEmailField":"string","SignerFullNameField":"string","SignerIndentificationNumberField":"string","SignerLocationField":"string","SignerMobileNumberField":"string","SignerReasonField":"string","SignerTrustOriginField":"string","SignerTrustReferenceField":"string"}]} // MultipleSignersSigningCeremonyRequest | ##### Multiple Signers Signing Ceremony Request Model
try {
    val result : MultipleSignersSigningCeremonyResponse = apiInstance.postMultipleSignersSigningCeremony(contentType, multipleSignersSigningCeremonyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCeremonyApi#postMultipleSignersSigningCeremony")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCeremonyApi#postMultipleSignersSigningCeremony")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **multipleSignersSigningCeremonyRequest** | [**MultipleSignersSigningCeremonyRequest**](MultipleSignersSigningCeremonyRequest.md)| ##### Multiple Signers Signing Ceremony Request Model | [optional]

### Return type

[**MultipleSignersSigningCeremonyResponse**](MultipleSignersSigningCeremonyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSigningCeremonyV2"></a>
# **postSigningCeremonyV2**
> SigningCeremonyV2Response postSigningCeremonyV2(contentType, signingCeremonyV2Request)

Signing Ceremony V2

#### Used to initiate the signing process of a document.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = SigningCeremonyApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val signingCeremonyV2Request : SigningCeremonyV2Request = {"CheckboxFieldsListField":[{"CheckboxHField":0,"CheckboxPageField":0,"CheckboxWField":0,"CheckboxXField":0,"CheckboxYField":0,"IsCheckedField":true}],"DocField":"string","DocNameField":"string","InitialFieldsListField":[{"InitialHField":0,"InitialImageField":"string","InitialImageTypeField":0,"InitialPageField":0,"InitialWField":0,"InitialXField":0,"InitialYField":0}],"LoginPasswordField":"string","LoginUserNameField":"string","SignatureHField":0,"SignatureImageField":"string","SignatureImageIncludeBorderField":true,"SignatureImageIncludeReasonField":true,"SignatureImageIncludeSignedByField":true,"SignatureImageIncludeSignedDateField":true,"SignatureImageTypeField":0,"SignaturePageField":0,"SignatureWField":0,"SignatureXField":0,"SignatureYField":0,"SignerEmailField":"string","SignerFullNameField":"string","SignerIdentificationNumberField":"string","SignerLocationField":"string","SignerMobileNumberField":"string","SignerReasonField":"string","SignerTrustOriginField":"string","SignerTrustReferenceField":"string","TextFieldsListField":[{"TextFieldHField":0,"TextFieldPageField":0,"TextFieldValueField":"string","TextFieldWField":0,"TextFieldXField":0,"TextFieldYField":0}]} // SigningCeremonyV2Request | ##### Signing Ceremony V2 Request Model
try {
    val result : SigningCeremonyV2Response = apiInstance.postSigningCeremonyV2(contentType, signingCeremonyV2Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCeremonyApi#postSigningCeremonyV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCeremonyApi#postSigningCeremonyV2")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **signingCeremonyV2Request** | [**SigningCeremonyV2Request**](SigningCeremonyV2Request.md)| ##### Signing Ceremony V2 Request Model | [optional]

### Return type

[**SigningCeremonyV2Response**](SigningCeremonyV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

