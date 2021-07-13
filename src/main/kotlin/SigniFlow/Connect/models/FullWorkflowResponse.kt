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
 * #### The response returned on FullWorkflow.
 * @param docField 
 * @param docIDField 
 * @param portfolioIDField 
 * @param resultField Displays the result of the call.
 * @param statusField 
 */

data class FullWorkflowResponse (
    @Json(name = "DocField")
    val docField: kotlin.String,
    @Json(name = "DocIDField")
    val docIDField: java.math.BigDecimal,
    @Json(name = "PortfolioIDField")
    val portfolioIDField: java.math.BigDecimal,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String,
    @Json(name = "StatusField")
    val statusField: kotlin.String
)
