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


class MarketplaceFilter(object):
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
        'marketplace_ids': 'MarketplaceIds'
    }

    attribute_map = {
        'marketplace_ids': 'marketplaceIds'
    }

    def __init__(self, marketplace_ids=None, _configuration=None):  # noqa: E501
        """MarketplaceFilter - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._marketplace_ids = None
        self.discriminator = None

        if marketplace_ids is not None:
            self.marketplace_ids = marketplace_ids

    @property
    def marketplace_ids(self):
        """Gets the marketplace_ids of this MarketplaceFilter.  # noqa: E501


        :return: The marketplace_ids of this MarketplaceFilter.  # noqa: E501
        :rtype: MarketplaceIds
        """
        return self._marketplace_ids

    @marketplace_ids.setter
    def marketplace_ids(self, marketplace_ids):
        """Sets the marketplace_ids of this MarketplaceFilter.


        :param marketplace_ids: The marketplace_ids of this MarketplaceFilter.  # noqa: E501
        :type: MarketplaceIds
        """

        self._marketplace_ids = marketplace_ids

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
        if issubclass(MarketplaceFilter, dict):
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
        if not isinstance(other, MarketplaceFilter):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MarketplaceFilter):
            return True

        return self.to_dict() != other.to_dict()
