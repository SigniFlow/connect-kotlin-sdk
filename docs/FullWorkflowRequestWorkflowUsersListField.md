
# FullWorkflowRequestWorkflowUsersListField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionField** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Refers to the order of signatures from the users. | 
**allowProxyField** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Allow proxy confirmation field. | 
**autoSignField** | **kotlin.Boolean** | ### Enable auto sign.  &#x60;True &#x3D; Signature will be applied automaticly False &#x3D; User will need to login and Sign&#x60;  | 
**emailAddressField** | **kotlin.String** | Workflow user&#39;s email addresses. | 
**languageCodeField** | **kotlin.String** | #### Sets the display language for the user ##### ISO 2 Digit Code  &#x60;en &#x3D; English es &#x3D; Spanish fr &#x3D; French&#x60;  | 
**latitudeField** | **kotlin.String** | Location latitude. | 
**longitudeField** | **kotlin.String** | Location longtitude. | 
**mobileNumberField** | **kotlin.String** | Group user&#39;s mobile number. | 
**signReasonField** | **kotlin.String** | Reason for signature. | 
**signerPasswordField** | **kotlin.String** | Face to face user&#39;s password. | 
**userFirstNameField** | **kotlin.String** | Face to face user&#39;s first name. | 
**userFullNameField** | **kotlin.String** | Face to face user&#39;s full name. | 
**userLastNameField** | **kotlin.String** | Face to face user&#39;s last name. | 
**groupStepField** | [**FullWorkflowRequestGroupStepField**](FullWorkflowRequestGroupStepField.md) |  |  [optional]
**preloadedFaceToFaceSignersField** | [**kotlin.collections.Set&lt;kotlin.Any&gt;**](kotlin.Any.md) | Preloaded user&#39;s who will be using the face to face signature field. |  [optional]
**workflowUserFieldsField** | [**kotlin.collections.Set&lt;FullWorkflowRequestWorkflowUserFieldsField&gt;**](FullWorkflowRequestWorkflowUserFieldsField.md) | The list of the workflowed documents field. |  [optional]



