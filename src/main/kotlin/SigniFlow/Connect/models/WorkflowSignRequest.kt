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

import SigniFlow.Connect.models.TokenField

import com.squareup.moshi.Json

/**
 * #### This request is sent when a document workflow needs to be signed.
 * @param docIDField 
 * @param latitudeField 
 * @param loginPasswordField 
 * @param loginUserNameField 
 * @param longitudeField 
 * @param signReasonField 
 * @param timeZoneOffsetField 
 * @param tokenField 
 */

data class WorkflowSignRequest (
    @Json(name = "DocIDField")
    val docIDField: kotlin.String,
    @Json(name = "LatitudeField")
    val latitudeField: kotlin.String,
    @Json(name = "LoginPasswordField")
    val loginPasswordField: kotlin.String,
    @Json(name = "LoginUserNameField")
    val loginUserNameField: kotlin.String,
    @Json(name = "LongitudeField")
    val longitudeField: kotlin.String,
    @Json(name = "SignReasonField")
    val signReasonField: kotlin.String,
    @Json(name = "TimeZoneOffsetField")
    val timeZoneOffsetField: java.math.BigDecimal,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

