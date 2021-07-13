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
 * #### Used to create a portfolio.
 * @param docIDField Document ID field.
 * @param portfolioNameField Portfolio name displayed in SigniFlow
 * @param tokenIDField 
 */

data class CreatePortfolioRequest (
    /* Document ID field. */
    @Json(name = "DocIDField")
    val docIDField: java.math.BigDecimal,
    /* Portfolio name displayed in SigniFlow */
    @Json(name = "PortfolioNameField")
    val portfolioNameField: kotlin.String,
    @Json(name = "TokenIDField")
    val tokenIDField: TokenField
)

