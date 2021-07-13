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
 * #### Authentication Token
 * @param tokenField User API Token
 * @param tokenExpiryField Expiry date of Token
 */

data class TokenField (
    /* User API Token */
    @Json(name = "TokenField")
    val tokenField: kotlin.String,
    /* Expiry date of Token */
    @Json(name = "TokenExpiryField")
    val tokenExpiryField: java.time.OffsetDateTime? = null
)

