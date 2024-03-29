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
 * #### This request is used to get the url link to a portfolio.
 * @param docIDField The document ID.
 * @param documentNameField Document name.
 * @param portfolioIDField The portfolio ID.
 * @param tokenField 
 */

data class LinkToPortfolioRequest (
    /* The document ID. */
    @Json(name = "DocIDField")
    val docIDField: kotlin.String,
    /* Document name. */
    @Json(name = "DocumentNameField")
    val documentNameField: kotlin.String,
    /* The portfolio ID. */
    @Json(name = "PortfolioIDField")
    val portfolioIDField: kotlin.String,
    @Json(name = "TokenField")
    val tokenField: TokenField
)

