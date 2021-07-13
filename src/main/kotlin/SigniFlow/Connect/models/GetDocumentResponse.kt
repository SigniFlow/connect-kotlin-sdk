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
 * #### The response returned when a user wants to download a document.
 * @param docField Returns a base64 string as the document.
 * @param docNameField Document field name.
 * @param extensionField Document extension field.
 * @param resultField Displays the result of the call.
 */

data class GetDocumentResponse (
    /* Returns a base64 string as the document. */
    @Json(name = "DocField")
    val docField: kotlin.String,
    /* Document field name. */
    @Json(name = "DocNameField")
    val docNameField: kotlin.String,
    /* Document extension field. */
    @Json(name = "ExtensionField")
    val extensionField: kotlin.String,
    /* Displays the result of the call. */
    @Json(name = "ResultField")
    val resultField: kotlin.String
)

