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
 * #### This is the request sent to get a documnt prepper url.
 * @param docIDField 
 * @param emailSettingField 
 * @param returnURLField 
 * @param tokenField 
 */

data class GetDocumentPrepperLinkRequest (
    @Json(name = "DocIDField")
    val docIDField: kotlin.String,
    @Json(name = "EmailSettingField")
    val emailSettingField: java.math.BigDecimal,
    @Json(name = "ReturnURLField")
    val returnURLField: kotlin.String,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

