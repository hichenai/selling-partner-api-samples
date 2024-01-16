# coding: utf-8

"""
    Selling Partner API for Notifications

    The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide).  # noqa: E501

    OpenAPI spec version: v1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from src.api_models.notifications_api.swagger_client.configuration import Configuration


class ProcessingDirective(object):
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
        'event_filter': 'EventFilter'
    }

    attribute_map = {
        'event_filter': 'eventFilter'
    }

    def __init__(self, event_filter=None, _configuration=None):  # noqa: E501
        """ProcessingDirective - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._event_filter = None
        self.discriminator = None

        if event_filter is not None:
            self.event_filter = event_filter

    @property
    def event_filter(self):
        """Gets the event_filter of this ProcessingDirective.  # noqa: E501

        A notificationType specific filter.  # noqa: E501

        :return: The event_filter of this ProcessingDirective.  # noqa: E501
        :rtype: EventFilter
        """
        return self._event_filter

    @event_filter.setter
    def event_filter(self, event_filter):
        """Sets the event_filter of this ProcessingDirective.

        A notificationType specific filter.  # noqa: E501

        :param event_filter: The event_filter of this ProcessingDirective.  # noqa: E501
        :type: EventFilter
        """

        self._event_filter = event_filter

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
        if issubclass(ProcessingDirective, dict):
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
        if not isinstance(other, ProcessingDirective):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ProcessingDirective):
            return True

        return self.to_dict() != other.to_dict()
