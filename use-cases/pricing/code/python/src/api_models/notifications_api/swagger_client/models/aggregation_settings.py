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


class AggregationSettings(object):
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
        'aggregation_time_period': 'AggregationTimePeriod'
    }

    attribute_map = {
        'aggregation_time_period': 'aggregationTimePeriod'
    }

    def __init__(self, aggregation_time_period=None, _configuration=None):  # noqa: E501
        """AggregationSettings - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._aggregation_time_period = None
        self.discriminator = None

        self.aggregation_time_period = aggregation_time_period

    @property
    def aggregation_time_period(self):
        """Gets the aggregation_time_period of this AggregationSettings.  # noqa: E501

        The supported time period to use to perform marketplace-ASIN level aggregation.  # noqa: E501

        :return: The aggregation_time_period of this AggregationSettings.  # noqa: E501
        :rtype: AggregationTimePeriod
        """
        return self._aggregation_time_period

    @aggregation_time_period.setter
    def aggregation_time_period(self, aggregation_time_period):
        """Sets the aggregation_time_period of this AggregationSettings.

        The supported time period to use to perform marketplace-ASIN level aggregation.  # noqa: E501

        :param aggregation_time_period: The aggregation_time_period of this AggregationSettings.  # noqa: E501
        :type: AggregationTimePeriod
        """
        if self._configuration.client_side_validation and aggregation_time_period is None:
            raise ValueError("Invalid value for `aggregation_time_period`, must not be `None`")  # noqa: E501

        self._aggregation_time_period = aggregation_time_period

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
        if issubclass(AggregationSettings, dict):
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
        if not isinstance(other, AggregationSettings):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AggregationSettings):
            return True

        return self.to_dict() != other.to_dict()
