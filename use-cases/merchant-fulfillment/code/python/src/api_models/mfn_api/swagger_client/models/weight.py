# coding: utf-8

"""
    Selling Partner API for Merchant Fulfillment

    The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from src.api_models.mfn_api.swagger_client.configuration import Configuration


class Weight(object):
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
        'value': 'WeightValue',
        'unit': 'UnitOfWeight'
    }

    attribute_map = {
        'value': 'Value',
        'unit': 'Unit'
    }

    def __init__(self, value=None, unit=None, _configuration=None):  # noqa: E501
        """Weight - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._value = None
        self._unit = None
        self.discriminator = None

        self.value = value
        self.unit = unit

    @property
    def value(self):
        """Gets the value of this Weight.  # noqa: E501


        :return: The value of this Weight.  # noqa: E501
        :rtype: WeightValue
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this Weight.


        :param value: The value of this Weight.  # noqa: E501
        :type: WeightValue
        """
        if self._configuration.client_side_validation and value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def unit(self):
        """Gets the unit of this Weight.  # noqa: E501


        :return: The unit of this Weight.  # noqa: E501
        :rtype: UnitOfWeight
        """
        return self._unit

    @unit.setter
    def unit(self, unit):
        """Sets the unit of this Weight.


        :param unit: The unit of this Weight.  # noqa: E501
        :type: UnitOfWeight
        """
        if self._configuration.client_side_validation and unit is None:
            raise ValueError("Invalid value for `unit`, must not be `None`")  # noqa: E501

        self._unit = unit

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
        if issubclass(Weight, dict):
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
        if not isinstance(other, Weight):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Weight):
            return True

        return self.to_dict() != other.to_dict()
