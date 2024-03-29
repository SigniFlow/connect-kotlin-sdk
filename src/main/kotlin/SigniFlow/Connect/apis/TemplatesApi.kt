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

import SigniFlow.Connect.models.ApplyPrepperTemplateRequest
import SigniFlow.Connect.models.ApplyPrepperTemplateResponse
import SigniFlow.Connect.models.GetDocumentTagFieldBoxPositionRequest
import SigniFlow.Connect.models.GetDocumentTagFieldBoxPositionResponse
import SigniFlow.Connect.models.GetDocumentTagFieldPositionRequest
import SigniFlow.Connect.models.GetDocumentTagFieldPositionResponse
import SigniFlow.Connect.models.GetPrepperTemplateListRequest
import SigniFlow.Connect.models.GetPrepperTemplateListResponse
import SigniFlow.Connect.models.GetPrepperTemplateRequest
import SigniFlow.Connect.models.GetPrepperTemplateResponse

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

class TemplatesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("SigniFlow.Connect.baseUrl", "https://server-url/API/SignFlowAPIServiceRest.svc")
        }
    }

    /**
    * Apply a Prepper template
    * #### Used when applying a templaet to a document.
    * @param contentType  
    * @param applyPrepperTemplateRequest ##### Apply A Prepper Template Request Model (optional)
    * @return ApplyPrepperTemplateResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postApplyPrepperTemplate(contentType: kotlin.String, applyPrepperTemplateRequest: ApplyPrepperTemplateRequest?) : ApplyPrepperTemplateResponse {
        val localVariableConfig = postApplyPrepperTemplateRequestConfig(contentType = contentType, applyPrepperTemplateRequest = applyPrepperTemplateRequest)

        val localVarResponse = request<ApplyPrepperTemplateResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApplyPrepperTemplateResponse
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
    * To obtain the request config of the operation postApplyPrepperTemplate
    *
    * @param contentType  
    * @param applyPrepperTemplateRequest ##### Apply A Prepper Template Request Model (optional)
    * @return RequestConfig
    */
    fun postApplyPrepperTemplateRequestConfig(contentType: kotlin.String, applyPrepperTemplateRequest: ApplyPrepperTemplateRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = applyPrepperTemplateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/ApplyPrepperTemplate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get Document Tag Field Box Position
    * #### Used to get the tag field box position on a document.
    * @param contentType  
    * @param getDocumentTagFieldBoxPositionRequest ##### Get Document Tag Field Box Position Request Model (optional)
    * @return GetDocumentTagFieldBoxPositionResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetDocumentTagFieldBoxPosition(contentType: kotlin.String, getDocumentTagFieldBoxPositionRequest: GetDocumentTagFieldBoxPositionRequest?) : GetDocumentTagFieldBoxPositionResponse {
        val localVariableConfig = postGetDocumentTagFieldBoxPositionRequestConfig(contentType = contentType, getDocumentTagFieldBoxPositionRequest = getDocumentTagFieldBoxPositionRequest)

        val localVarResponse = request<GetDocumentTagFieldBoxPositionResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDocumentTagFieldBoxPositionResponse
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
    * To obtain the request config of the operation postGetDocumentTagFieldBoxPosition
    *
    * @param contentType  
    * @param getDocumentTagFieldBoxPositionRequest ##### Get Document Tag Field Box Position Request Model (optional)
    * @return RequestConfig
    */
    fun postGetDocumentTagFieldBoxPositionRequestConfig(contentType: kotlin.String, getDocumentTagFieldBoxPositionRequest: GetDocumentTagFieldBoxPositionRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getDocumentTagFieldBoxPositionRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetDocumentTagFieldBoxPosition",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get Document Tag Field Position
    * #### Used to get the tag position on a document.
    * @param contentType  
    * @param getDocumentTagFieldPositionRequest ##### Get Document Tag Field Position Request Model (optional)
    * @return GetDocumentTagFieldPositionResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetDocumentTagFieldPosition(contentType: kotlin.String, getDocumentTagFieldPositionRequest: GetDocumentTagFieldPositionRequest?) : GetDocumentTagFieldPositionResponse {
        val localVariableConfig = postGetDocumentTagFieldPositionRequestConfig(contentType = contentType, getDocumentTagFieldPositionRequest = getDocumentTagFieldPositionRequest)

        val localVarResponse = request<GetDocumentTagFieldPositionResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetDocumentTagFieldPositionResponse
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
    * To obtain the request config of the operation postGetDocumentTagFieldPosition
    *
    * @param contentType  
    * @param getDocumentTagFieldPositionRequest ##### Get Document Tag Field Position Request Model (optional)
    * @return RequestConfig
    */
    fun postGetDocumentTagFieldPositionRequestConfig(contentType: kotlin.String, getDocumentTagFieldPositionRequest: GetDocumentTagFieldPositionRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getDocumentTagFieldPositionRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetDocumentTagFieldPosition",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get Prepper Template
    * #### Used to get a document template.
    * @param contentType  
    * @param getPrepperTemplateRequest ##### Get Prepper Template Request Model (optional)
    * @return GetPrepperTemplateResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetPrepperTemplate(contentType: kotlin.String, getPrepperTemplateRequest: GetPrepperTemplateRequest?) : GetPrepperTemplateResponse {
        val localVariableConfig = postGetPrepperTemplateRequestConfig(contentType = contentType, getPrepperTemplateRequest = getPrepperTemplateRequest)

        val localVarResponse = request<GetPrepperTemplateResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetPrepperTemplateResponse
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
    * To obtain the request config of the operation postGetPrepperTemplate
    *
    * @param contentType  
    * @param getPrepperTemplateRequest ##### Get Prepper Template Request Model (optional)
    * @return RequestConfig
    */
    fun postGetPrepperTemplateRequestConfig(contentType: kotlin.String, getPrepperTemplateRequest: GetPrepperTemplateRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getPrepperTemplateRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetPrepperTemplate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Get Prepper Template List
    * #### Used to get a list of document templates.
    * @param contentType  
    * @param getPrepperTemplateListRequest ##### Get Prepper Template List Request Model (optional)
    * @return GetPrepperTemplateListResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postGetPrepperTemplateList(contentType: kotlin.String, getPrepperTemplateListRequest: GetPrepperTemplateListRequest?) : GetPrepperTemplateListResponse {
        val localVariableConfig = postGetPrepperTemplateListRequestConfig(contentType = contentType, getPrepperTemplateListRequest = getPrepperTemplateListRequest)

        val localVarResponse = request<GetPrepperTemplateListResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetPrepperTemplateListResponse
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
    * To obtain the request config of the operation postGetPrepperTemplateList
    *
    * @param contentType  
    * @param getPrepperTemplateListRequest ##### Get Prepper Template List Request Model (optional)
    * @return RequestConfig
    */
    fun postGetPrepperTemplateListRequestConfig(contentType: kotlin.String, getPrepperTemplateListRequest: GetPrepperTemplateListRequest?) : RequestConfig {
        val localVariableBody: kotlin.Any? = getPrepperTemplateListRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/GetPrepperTemplateList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
