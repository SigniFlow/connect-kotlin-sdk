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
 * #### This is the request used to delete a document.
 * @param docIDField Document ID field.
 * @param tokenField 
 */

data class DeleteDocRequest (
    /* Document ID field. */
    @Json(name = "DocIDField")
    val docIDField: java.math.BigDecimal,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

