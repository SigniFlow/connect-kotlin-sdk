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
* #### Determines whether or not the signer can nominate someone else to sign on their behalf.  `0 = No 1 = Yes`
* Values: No,Yes
*/

enum class ProxyAllowedField(val value: kotlin.Int) {


    @Json(name = "0")
    No(0),

    @Json(name = "1")
    Yes(1);


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value.toString()
    }
}

