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
 * 
 * @param linkedValueField 
 * @param maxField Max amount field.
 * @param minField Min amount field
 * @param valueField 
 */

data class DocPrepperAddAdvancedFieldsRequestFieldOptionsListField (
    @Json(name = "LinkedValueField")
    val linkedValueField: kotlin.String,
    /* Max amount field. */
    @Json(name = "MaxField")
    val maxField: java.math.BigDecimal,
    /* Min amount field */
    @Json(name = "MinField")
    val minField: java.math.BigDecimal,
    @Json(name = "ValueField")
    val valueField: kotlin.String
)

