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

import SigniFlow.Connect.models.AddWokflowStepV2ResponseFlowStepsField

import com.squareup.moshi.Json

/**
 * #### Add a step to a Workflow response.
 * @param docIDField Document ID field.
 * @param flowIDField Document flow ID field
 * @param flowStepsField 
 * @param resultField Displays the result of the call.
 */

data class AddWokflowStepV2Response (
    /* Document ID field. */
    @Json(name = "DocIDField")
    val docIDField: java.math.BigDecimal,
    /* Document flow ID field */
    @Json(name = "FlowIDField")
    val flowIDField: java.math.BigDecimal,
    @Json(name = "FlowStepsField")
    val flowStepsField: kotlin.collections.List<AddWokflowStepV2ResponseFlowStepsField>,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String
)
