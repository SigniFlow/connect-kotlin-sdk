# AuthenticationApi

All URIs are relative to *https://server-url/API/SignFlowAPIServiceRest.svc*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthenticationApi.md#login) | **POST** /Login | Login
[**postLogout**](AuthenticationApi.md#postLogout) | **POST** /Logout | Logout
[**postTokenExtend**](AuthenticationApi.md#postTokenExtend) | **POST** /TokenExtend | Token Extend
[**postTokenValidate**](AuthenticationApi.md#postTokenValidate) | **POST** /TokenValidate | Token Validate


<a name="login"></a>
# **login**
> LoginResponse login(contentType, loginRequest)

Login

#### Generates a API Token for the User

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuthenticationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val loginRequest : LoginRequest = {"UserNameField":"email@domain.com","PasswordField":"P@ssword"} // LoginRequest | ##### Login Request Model
try {
    val result : LoginResponse = apiInstance.login(contentType, loginRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#login")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#login")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **loginRequest** | [**LoginRequest**](LoginRequest.md)| ##### Login Request Model |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postLogout"></a>
# **postLogout**
> LogoutResponse postLogout(contentType, logoutRequest)

Logout

#### Used to log out a user from SigniFlow.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuthenticationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val logoutRequest : LogoutRequest = {"TokenField":"aaa111"} // LogoutRequest | ##### Logout Request Model
try {
    val result : LogoutResponse = apiInstance.postLogout(contentType, logoutRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#postLogout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#postLogout")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **logoutRequest** | [**LogoutRequest**](LogoutRequest.md)| ##### Logout Request Model | [optional]

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenExtend"></a>
# **postTokenExtend**
> TokenExtendResponse postTokenExtend(contentType, tokenExtendRequest)

Token Extend

#### Used to extend the period of time in which the session token is valid.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuthenticationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val tokenExtendRequest : TokenExtendRequest = {"TokenField":{"TokenExpiryField":"2019-08-24T14:15:22Z","TokenField":"aaa111"},"TokenValidityField":0} // TokenExtendRequest | ##### Token Extend Request Model
try {
    val result : TokenExtendResponse = apiInstance.postTokenExtend(contentType, tokenExtendRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#postTokenExtend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#postTokenExtend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **tokenExtendRequest** | [**TokenExtendRequest**](TokenExtendRequest.md)| ##### Token Extend Request Model | [optional]

### Return type

[**TokenExtendResponse**](TokenExtendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTokenValidate"></a>
# **postTokenValidate**
> TokenValidateResponse postTokenValidate(contentType, tokenValidateRequest)

Token Validate

#### Used to validate the user&#39;s session token.

### Example
```kotlin
// Import classes:
//import SigniFlow.Connect.infrastructure.*
//import SigniFlow.Connect.models.*

val apiInstance = AuthenticationApi()
val contentType : kotlin.String = contentType_example // kotlin.String | 
val tokenValidateRequest : TokenValidateRequest = {"0":"string"} // TokenValidateRequest | ##### Token Validate Request Model
try {
    val result : TokenValidateResponse = apiInstance.postTokenValidate(contentType, tokenValidateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#postTokenValidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#postTokenValidate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [default to &quot;application/json&quot;]
 **tokenValidateRequest** | [**TokenValidateRequest**](TokenValidateRequest.md)| ##### Token Validate Request Model | [optional]

### Return type

[**TokenValidateResponse**](TokenValidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

