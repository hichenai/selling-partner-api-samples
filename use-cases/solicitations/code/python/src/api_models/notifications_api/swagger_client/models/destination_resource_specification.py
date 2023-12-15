# coding: utf-8

"""
    Selling Partner API for Notifications

    The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  # noqa: E501

    OpenAPI spec version: v1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class DestinationResourceSpecification(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'sqs': 'SqsResource',
        'event_bridge': 'EventBridgeResourceSpecification'
    }

    attribute_map = {
        'sqs': 'sqs',
        'event_bridge': 'eventBridge'
    }

    def __init__(self, sqs=None, event_bridge=None):  # noqa: E501
        """DestinationResourceSpecification - a model defined in Swagger"""  # noqa: E501

        self._sqs = None
        self._event_bridge = None
        self.discriminator = None

        if sqs is not None:
            self.sqs = sqs
        if event_bridge is not None:
            self.event_bridge = event_bridge

    @property
    def sqs(self):
        """Gets the sqs of this DestinationResourceSpecification.  # noqa: E501

        The information required to create an Amazon Simple Queue Service (SQS) queue destination.  # noqa: E501

        :return: The sqs of this DestinationResourceSpecification.  # noqa: E501
        :rtype: SqsResource
        """
        return self._sqs

    @sqs.setter
    def sqs(self, sqs):
        """Sets the sqs of this DestinationResourceSpecification.

        The information required to create an Amazon Simple Queue Service (SQS) queue destination.  # noqa: E501

        :param sqs: The sqs of this DestinationResourceSpecification.  # noqa: E501
        :type: SqsResource
        """

        self._sqs = sqs

    @property
    def event_bridge(self):
        """Gets the event_bridge of this DestinationResourceSpecification.  # noqa: E501

        The information required to create an Amazon EventBridge destination.  # noqa: E501

        :return: The event_bridge of this DestinationResourceSpecification.  # noqa: E501
        :rtype: EventBridgeResourceSpecification
        """
        return self._event_bridge

    @event_bridge.setter
    def event_bridge(self, event_bridge):
        """Sets the event_bridge of this DestinationResourceSpecification.

        The information required to create an Amazon EventBridge destination.  # noqa: E501

        :param event_bridge: The event_bridge of this DestinationResourceSpecification.  # noqa: E501
        :type: EventBridgeResourceSpecification
        """

        self._event_bridge = event_bridge

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(DestinationResourceSpecification, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, DestinationResourceSpecification):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
