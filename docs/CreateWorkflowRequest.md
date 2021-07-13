
# CreateWorkflowRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalDataField** | **kotlin.String** | Sets additional data to be embedded in PDF Meta. | 
**autoExpireField** | [**AutoExpire**](AutoExpire.md) |  | 
**autoRemindField** | [**AutoRemind**](AutoRemind.md) |  | 
**docField** | **kotlin.String** | Base64 Encoded String of document | 
**docNameField** | **kotlin.String** | Name of document to display in SigniFlow | 
**extensionField** | [**DocExtension**](DocExtension.md) |  | 
**messageField** | **kotlin.String** | Custom message to display to participants | 
**priorityField** | [**Priority**](Priority.md) |  | 
**slAField** | **kotlin.Int** | Deprecated field, Pass 0 | 
**tokenField** | [**TokenField**](TokenField.md) |  | 
**dueDateField** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Due date for the document, use in conjunction with Auto Expire. |  [optional]



