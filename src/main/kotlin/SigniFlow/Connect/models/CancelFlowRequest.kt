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
 * #### The request sent when a workflow is cancelled.
 * @param docIDField Document ID field.
 * @param tokenField 
 */

data class CancelFlowRequest (
    /* Document ID field. */
    @Json(name = "DocIDField")
    val docIDField: kotlin.String,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

