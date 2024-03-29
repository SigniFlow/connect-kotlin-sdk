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
 * #### The request sent when a user wants to download a portfolio.
 * @param portfolioIDField Portfolio ID.
 * @param tokenField 
 */

data class DownloadPortfolioRequest (
    /* Portfolio ID. */
    @Json(name = "PortfolioIDField")
    val portfolioIDField: java.math.BigDecimal,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

