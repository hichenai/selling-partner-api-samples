/* 
 * Selling Partner API for Notifications
 *
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = SpApiCsharpApp.swaggerClient.Client.SwaggerDateConverter;

namespace SpApiCsharpApp.swaggerClient.Model.Notifications
{
    /// <summary>
    /// A notificationType specific filter. This object contains all of the currently available filters and properties that you can use to define a notificationType specific filter.
    /// </summary>
    [DataContract]
    public partial class EventFilter :  IEquatable<EventFilter>, IValidatableObject
    {
        /// <summary>
        /// An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.
        /// </summary>
        /// <value>An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventFilterTypeEnum
        {
            
            /// <summary>
            /// Enum ANYOFFERCHANGED for value: ANY_OFFER_CHANGED
            /// </summary>
            [EnumMember(Value = "ANY_OFFER_CHANGED")]
            ANYOFFERCHANGED = 1,
            
            /// <summary>
            /// Enum ORDERCHANGE for value: ORDER_CHANGE
            /// </summary>
            [EnumMember(Value = "ORDER_CHANGE")]
            ORDERCHANGE = 2
        }

        /// <summary>
        /// An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.
        /// </summary>
        /// <value>An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported.</value>
        [DataMember(Name="eventFilterType", EmitDefaultValue=false)]
        public EventFilterTypeEnum EventFilterType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EventFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EventFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EventFilter" /> class.
        /// </summary>
        /// <param name="aggregationSettings">aggregationSettings.</param>
        /// <param name="marketplaceIds">marketplaceIds.</param>
        /// <param name="orderChangeTypes">orderChangeTypes.</param>
        /// <param name="eventFilterType">An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported. (required).</param>
        public EventFilter(AggregationSettings aggregationSettings = default(AggregationSettings), MarketplaceIds marketplaceIds = default(MarketplaceIds), OrderChangeTypes orderChangeTypes = default(OrderChangeTypes), EventFilterTypeEnum eventFilterType = default(EventFilterTypeEnum))
        {
            // to ensure "eventFilterType" is required (not null)
            if (eventFilterType == null)
            {
                throw new InvalidDataException("eventFilterType is a required property for EventFilter and cannot be null");
            }
            else
            {
                this.EventFilterType = eventFilterType;
            }
            this.AggregationSettings = aggregationSettings;
            this.MarketplaceIds = marketplaceIds;
            this.OrderChangeTypes = orderChangeTypes;
        }
        
        /// <summary>
        /// Gets or Sets AggregationSettings
        /// </summary>
        [DataMember(Name="aggregationSettings", EmitDefaultValue=false)]
        public AggregationSettings AggregationSettings { get; set; }

        /// <summary>
        /// Gets or Sets MarketplaceIds
        /// </summary>
        [DataMember(Name="marketplaceIds", EmitDefaultValue=false)]
        public MarketplaceIds MarketplaceIds { get; set; }

        /// <summary>
        /// Gets or Sets OrderChangeTypes
        /// </summary>
        [DataMember(Name="orderChangeTypes", EmitDefaultValue=false)]
        public OrderChangeTypes OrderChangeTypes { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EventFilter {\n");
            sb.Append("  AggregationSettings: ").Append(AggregationSettings).Append("\n");
            sb.Append("  MarketplaceIds: ").Append(MarketplaceIds).Append("\n");
            sb.Append("  OrderChangeTypes: ").Append(OrderChangeTypes).Append("\n");
            sb.Append("  EventFilterType: ").Append(EventFilterType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EventFilter);
        }

        /// <summary>
        /// Returns true if EventFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of EventFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EventFilter input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AggregationSettings == input.AggregationSettings ||
                    (this.AggregationSettings != null &&
                    this.AggregationSettings.Equals(input.AggregationSettings))
                ) && 
                (
                    this.MarketplaceIds == input.MarketplaceIds ||
                    (this.MarketplaceIds != null &&
                    this.MarketplaceIds.Equals(input.MarketplaceIds))
                ) && 
                (
                    this.OrderChangeTypes == input.OrderChangeTypes ||
                    (this.OrderChangeTypes != null &&
                    this.OrderChangeTypes.Equals(input.OrderChangeTypes))
                ) && 
                (
                    this.EventFilterType == input.EventFilterType ||
                    (this.EventFilterType != null &&
                    this.EventFilterType.Equals(input.EventFilterType))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AggregationSettings != null)
                    hashCode = hashCode * 59 + this.AggregationSettings.GetHashCode();
                if (this.MarketplaceIds != null)
                    hashCode = hashCode * 59 + this.MarketplaceIds.GetHashCode();
                if (this.OrderChangeTypes != null)
                    hashCode = hashCode * 59 + this.OrderChangeTypes.GetHashCode();
                if (this.EventFilterType != null)
                    hashCode = hashCode * 59 + this.EventFilterType.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
