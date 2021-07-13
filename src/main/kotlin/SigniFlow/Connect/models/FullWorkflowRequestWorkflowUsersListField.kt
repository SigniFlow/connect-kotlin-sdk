/**
* SigniFlow OpenAPI Spec v1
* ## SigniFlow API used to automate esignature workflow creation and management. 
*
* The version of the OpenAPI document: 1.0
* Contact: support@signiflow.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package SigniFlow.Connect.models

import SigniFlow.Connect.models.FullWorkflowRequestGroupStepField
import SigniFlow.Connect.models.FullWorkflowRequestWorkflowUserFieldsField

import com.squareup.moshi.Json

/**
 * 
 * @param actionField Refers to the order of signatures from the users.
 * @param allowProxyField Allow proxy confirmation field.
 * @param autoSignField ### Enable auto sign.  `True = Signature will be applied automaticly False = User will need to login and Sign` 
 * @param emailAddressField Workflow user's email addresses.
 * @param languageCodeField #### Sets the display language for the user ##### ISO 2 Digit Code  `en = English es = Spanish fr = French` 
 * @param latitudeField Location latitude.
 * @param longitudeField Location longtitude.
 * @param mobileNumberField Group user's mobile number.
 * @param signReasonField Reason for signature.
 * @param signerPasswordField Face to face user's password.
 * @param userFirstNameField Face to face user's first name.
 * @param userFullNameField Face to face user's full name.
 * @param userLastNameField Face to face user's last name.
 * @param groupStepField 
 * @param preloadedFaceToFaceSignersField Preloaded user's who will be using the face to face signature field.
 * @param workflowUserFieldsField The list of the workflowed documents field.
 */

data class FullWorkflowRequestWorkflowUsersListField (
    /* Refers to the order of signatures from the users. */
    @Json(name = "ActionField")
    val actionField: java.math.BigDecimal,
    /* Allow proxy confirmation field. */
    @Json(name = "AllowProxyField")
    val allowProxyField: java.math.BigDecimal,
    /* ### Enable auto sign.  `True = Signature will be applied automaticly False = User will need to login and Sign`  */
    @Json(name = "AutoSignField")
    val autoSignField: kotlin.Boolean,
    /* Workflow user's email addresses. */
    @Json(name = "EmailAddressField")
    val emailAddressField: kotlin.String,
    /* #### Sets the display language for the user ##### ISO 2 Digit Code  `en = English es = Spanish fr = French`  */
    @Json(name = "LanguageCodeField")
    val languageCodeField: kotlin.String,
    /* Location latitude. */
    @Json(name = "LatitudeField")
    val latitudeField: kotlin.String,
    /* Location longtitude. */
    @Json(name = "LongitudeField")
    val longitudeField: kotlin.String,
    /* Group user's mobile number. */
    @Json(name = "MobileNumberField")
    val mobileNumberField: kotlin.String,
    /* Reason for signature. */
    @Json(name = "SignReasonField")
    val signReasonField: kotlin.String,
    /* Face to face user's password. */
    @Json(name = "SignerPasswordField")
    val signerPasswordField: kotlin.String,
    /* Face to face user's first name. */
    @Json(name = "UserFirstNameField")
    val userFirstNameField: kotlin.String,
    /* Face to face user's full name. */
    @Json(name = "UserFullNameField")
    val userFullNameField: kotlin.String,
    /* Face to face user's last name. */
    @Json(name = "UserLastNameField")
    val userLastNameField: kotlin.String,
    @Json(name = "GroupStepField")
    val groupStepField: FullWorkflowRequestGroupStepField? = null,
    /* Preloaded user's who will be using the face to face signature field. */
    @Json(name = "PreloadedFaceToFaceSignersField")
    val preloadedFaceToFaceSignersField: kotlin.collections.List<kotlin.Any>? = null,
    /* The list of the workflowed documents field. */
    @Json(name = "WorkflowUserFieldsField")
    val workflowUserFieldsField: kotlin.collections.List<FullWorkflowRequestWorkflowUserFieldsField>? = null
)
