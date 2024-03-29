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


import com.squareup.moshi.Json

/**
 * #### This is the response returned when there are multiple people who need to sign a document.
 * @param ceremonyIDField 
 * @param resultField Displays the result of the call.
 * @param signedDocumentField 
 */

data class MultipleSignersSigningCeremonyResponse (
    @Json(name = "CeremonyIDField")
    val ceremonyIDField: java.math.BigDecimal,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String,
    @Json(name = "SignedDocumentField")
    val signedDocumentField: kotlin.String
)

