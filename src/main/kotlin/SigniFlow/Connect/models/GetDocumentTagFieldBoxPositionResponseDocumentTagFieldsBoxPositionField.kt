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
 * @param heightField The height of the field.
 * @param pageNumberField The page number where the field is.
 * @param widthField 
 * @param xcoordinateField The x coordinates of the field.
 * @param ycoordinateField The y coordinates of the field
 */

data class GetDocumentTagFieldBoxPositionResponseDocumentTagFieldsBoxPositionField (
    /* The height of the field. */
    @Json(name = "HeightField")
    val heightField: kotlin.String,
    /* The page number where the field is. */
    @Json(name = "PageNumberField")
    val pageNumberField: java.math.BigDecimal,
    @Json(name = "WidthField")
    val widthField: kotlin.String,
    /* The x coordinates of the field. */
    @Json(name = "XCoordinateField")
    val xcoordinateField: kotlin.String,
    /* The y coordinates of the field */
    @Json(name = "YCoordinateField")
    val ycoordinateField: kotlin.String
)

