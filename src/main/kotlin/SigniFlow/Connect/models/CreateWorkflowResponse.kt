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
 * #### The response returned when creating a document workflow.
 * @param docIDField Document Id created in SigniFlow
 * @param resultField Displays the result of the call.
 */

data class CreateWorkflowResponse (
    /* Document Id created in SigniFlow */
    @Json(name = "DocIDField")
    val docIDField: kotlin.Int,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String
)

