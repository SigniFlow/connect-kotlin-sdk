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
* #### Is the action taken by a user in a workflow on this step.  `0 = SignDocument 1 = ViewDocument 2 = ApproveDocument` 
* Values: SignDocument,ViewDocument,ApproveDocument
*/

enum class ActionField(val value: kotlin.Int) {


    @Json(name = "0")
    SignDocument(0),

    @Json(name = "1")
    ViewDocument(1),

    @Json(name = "2")
    ApproveDocument(2);


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value.toString()
    }
}

