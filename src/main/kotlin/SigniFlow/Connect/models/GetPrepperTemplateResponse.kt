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

import SigniFlow.Connect.models.GetPrepperTemplateResponsePrepperTemplateValuesField

import com.squareup.moshi.Json

/**
 * #### The response received after requesting a document template.
 * @param prepperTemplateValuesField 
 * @param resultField Displays the result of the call.
 */

data class GetPrepperTemplateResponse (
    @Json(name = "PrepperTemplateValuesField")
    val prepperTemplateValuesField: kotlin.collections.List<GetPrepperTemplateResponsePrepperTemplateValuesField>,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String
)

