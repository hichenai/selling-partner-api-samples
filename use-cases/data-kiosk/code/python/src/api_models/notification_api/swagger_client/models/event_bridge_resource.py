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

class EventBridgeResource(object):
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
        'name': 'str',
        'region': 'str',
        'account_id': 'str'
    }

    attribute_map = {
        'name': 'name',
        'region': 'region',
        'account_id': 'accountId'
    }

    def __init__(self, name=None, region=None, account_id=None):  # noqa: E501
        """EventBridgeResource - a model defined in Swagger"""  # noqa: E501
        self._name = None
        self._region = None
        self._account_id = None
        self.discriminator = None
        self.name = name
        self.region = region
        self.account_id = account_id

    @property
    def name(self):
        """Gets the name of this EventBridgeResource.  # noqa: E501

        The name of the partner event source associated with the destination.  # noqa: E501

        :return: The name of this EventBridgeResource.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this EventBridgeResource.

        The name of the partner event source associated with the destination.  # noqa: E501

        :param name: The name of this EventBridgeResource.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def region(self):
        """Gets the region of this EventBridgeResource.  # noqa: E501

        The AWS region in which you receive the notifications. For AWS regions that are supported in Amazon EventBridge, see https://docs.aws.amazon.com/general/latest/gr/ev.html.  # noqa: E501

        :return: The region of this EventBridgeResource.  # noqa: E501
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region):
        """Sets the region of this EventBridgeResource.

        The AWS region in which you receive the notifications. For AWS regions that are supported in Amazon EventBridge, see https://docs.aws.amazon.com/general/latest/gr/ev.html.  # noqa: E501

        :param region: The region of this EventBridgeResource.  # noqa: E501
        :type: str
        """
        if region is None:
            raise ValueError("Invalid value for `region`, must not be `None`")  # noqa: E501

        self._region = region

    @property
    def account_id(self):
        """Gets the account_id of this EventBridgeResource.  # noqa: E501

        The identifier for the AWS account that is responsible for charges related to receiving notifications.  # noqa: E501

        :return: The account_id of this EventBridgeResource.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this EventBridgeResource.

        The identifier for the AWS account that is responsible for charges related to receiving notifications.  # noqa: E501

        :param account_id: The account_id of this EventBridgeResource.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

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
        if issubclass(EventBridgeResource, dict):
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
        if not isinstance(other, EventBridgeResource):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
