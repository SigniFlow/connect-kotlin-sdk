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

import SigniFlow.Connect.models.AutoExpire
import SigniFlow.Connect.models.AutoRemind
import SigniFlow.Connect.models.DocExtension
import SigniFlow.Connect.models.Priority
import SigniFlow.Connect.models.TokenField

import com.squareup.moshi.Json

/**
 * #### The request sent to create a document workflow.
 * @param additionalDataField Sets additional data to be embedded in PDF Meta.
 * @param autoExpireField 
 * @param autoRemindField 
 * @param docField Base64 Encoded String of document
 * @param docNameField Name of document to display in SigniFlow
 * @param extensionField 
 * @param messageField Custom message to display to participants
 * @param priorityField 
 * @param slAField Deprecated field, Pass 0
 * @param tokenField 
 * @param dueDateField Due date for the document, use in conjunction with Auto Expire.
 */

data class CreateWorkflowRequest (
    /* Sets additional data to be embedded in PDF Meta. */
    @Json(name = "AdditionalDataField")
    val additionalDataField: kotlin.String,
    @Json(name = "AutoExpireField")
    val autoExpireField: AutoExpire,
    @Json(name = "AutoRemindField")
    val autoRemindField: AutoRemind,
    /* Base64 Encoded String of document */
    @Json(name = "DocField")
    val docField: kotlin.String,
    /* Name of document to display in SigniFlow */
    @Json(name = "DocNameField")
    val docNameField: kotlin.String,
    @Json(name = "ExtensionField")
    val extensionField: DocExtension,
    /* Custom message to display to participants */
    @Json(name = "MessageField")
    val messageField: kotlin.String,
    @Json(name = "PriorityField")
    val priorityField: Priority,
    /* Deprecated field, Pass 0 */
    @Json(name = "SLAField")
    val slAField: kotlin.Int,
    @Json(name = "TokenField")
    val tokenField: TokenField,
    /* Due date for the document, use in conjunction with Auto Expire. */
    @Json(name = "DueDateField")
    val dueDateField: java.time.OffsetDateTime? = null
)

