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
package SigniFlow.Connect.apis

import SigniFlow.Connect.models.GetDocLinkRequest
import SigniFlow.Connect.models.GetDocLinkResponse
import SigniFlow.Connect.models.GetDocumentPrepperLinkRequest
import SigniFlow.Connect.models.GetDocumentPrepperLinkResponse

import SigniFlow.Connect.infrastructure.ApiClient
import SigniFlow.Connect.infrastructure.ClientException
import SigniFlow.Connect.infrastructure.ClientError
import SigniFlow.Connect.infrastructure.ServerException
import SigniFlow.Connect.infrastructure.ServerError
import SigniFlow.Connect.infrastructure.MultiValueMap
import SigniFlow.Connect.infrastructure.RequestConfig
import SigniFlow.Connect.infrastructure.RequestMethod
import SigniFlow.Connect.infrastructure.ResponseType
import SigniFlow.Connect.infrastructure.Success
import SigniFlow.Connect.infrastructure.toMultiValue

class ViewersApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("SigniFlow.Connect.baseUrl", "https://server-url/API/SignFlowAPIServiceRest.svc")
        }
    }

    /**
    * Get Document Link
    * #### Used to get the document link that will be used to sign a document.
    * @param contentType  
    * @param getDocLinkRequest ##### Get Document Link Request Model (optional)
    * @return GetDocLinkResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetDocLink(contentType: kotlin.String, getDocLinkRequest: GetDocLinkRequest?) : GetDocLinkResponse {
        val localVariableConfig = postGetDocLinkRequestConfig(contentType = contentType, getDocLinkRequest = getDocLinkRequest)

        val localVarResponse = request<GetDocLinkResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDocLinkResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation postGetDocLink
    *
    * @param contentType  
    * @param getDocLinkRequest ##### Get Document Link Request Model (optional)
    * @return RequestConfig
    */
    fun postGetDocLinkRequestConfig(contentType: kotlin.String, getDocLinkRequest: GetDocLinkRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getDocLinkRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetDocLink",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get Document Prepper Link
    * #### Used to get a document prepper link (url).
    * @param contentType  
    * @param getDocumentPrepperLinkRequest ##### Get Document Prepper Link Request Model (optional)
    * @return GetDocumentPrepperLinkResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetDocumentPrepperLink(contentType: kotlin.String, getDocumentPrepperLinkRequest: GetDocumentPrepperLinkRequest?) : GetDocumentPrepperLinkResponse {
        val localVariableConfig = postGetDocumentPrepperLinkRequestConfig(contentType = contentType, getDocumentPrepperLinkRequest = getDocumentPrepperLinkRequest)

        val localVarResponse = request<GetDocumentPrepperLinkResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDocumentPrepperLinkResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation postGetDocumentPrepperLink
    *
    * @param contentType  
    * @param getDocumentPrepperLinkRequest ##### Get Document Prepper Link Request Model (optional)
    * @return RequestConfig
    */
    fun postGetDocumentPrepperLinkRequestConfig(contentType: kotlin.String, getDocumentPrepperLinkRequest: GetDocumentPrepperLinkRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getDocumentPrepperLinkRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetDocumentPrepperLink",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}