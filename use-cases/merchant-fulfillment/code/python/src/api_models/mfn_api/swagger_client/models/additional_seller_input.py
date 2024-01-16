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


class AdditionalSellerInput(object):
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
        'data_type': 'str',
        'value_as_string': 'str',
        'value_as_boolean': 'bool',
        'value_as_integer': 'int',
        'value_as_timestamp': 'Timestamp',
        'value_as_address': 'Address',
        'value_as_weight': 'Weight',
        'value_as_dimension': 'Length',
        'value_as_currency': 'CurrencyAmount'
    }

    attribute_map = {
        'data_type': 'DataType',
        'value_as_string': 'ValueAsString',
        'value_as_boolean': 'ValueAsBoolean',
        'value_as_integer': 'ValueAsInteger',
        'value_as_timestamp': 'ValueAsTimestamp',
        'value_as_address': 'ValueAsAddress',
        'value_as_weight': 'ValueAsWeight',
        'value_as_dimension': 'ValueAsDimension',
        'value_as_currency': 'ValueAsCurrency'
    }

    def __init__(self, data_type=None, value_as_string=None, value_as_boolean=None, value_as_integer=None, value_as_timestamp=None, value_as_address=None, value_as_weight=None, value_as_dimension=None, value_as_currency=None, _configuration=None):  # noqa: E501
        """AdditionalSellerInput - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._data_type = None
        self._value_as_string = None
        self._value_as_boolean = None
        self._value_as_integer = None
        self._value_as_timestamp = None
        self._value_as_address = None
        self._value_as_weight = None
        self._value_as_dimension = None
        self._value_as_currency = None
        self.discriminator = None

        if data_type is not None:
            self.data_type = data_type
        if value_as_string is not None:
            self.value_as_string = value_as_string
        if value_as_boolean is not None:
            self.value_as_boolean = value_as_boolean
        if value_as_integer is not None:
            self.value_as_integer = value_as_integer
        if value_as_timestamp is not None:
            self.value_as_timestamp = value_as_timestamp
        if value_as_address is not None:
            self.value_as_address = value_as_address
        if value_as_weight is not None:
            self.value_as_weight = value_as_weight
        if value_as_dimension is not None:
            self.value_as_dimension = value_as_dimension
        if value_as_currency is not None:
            self.value_as_currency = value_as_currency

    @property
    def data_type(self):
        """Gets the data_type of this AdditionalSellerInput.  # noqa: E501

        The data type of the additional information.  # noqa: E501

        :return: The data_type of this AdditionalSellerInput.  # noqa: E501
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """Sets the data_type of this AdditionalSellerInput.

        The data type of the additional information.  # noqa: E501

        :param data_type: The data_type of this AdditionalSellerInput.  # noqa: E501
        :type: str
        """

        self._data_type = data_type

    @property
    def value_as_string(self):
        """Gets the value_as_string of this AdditionalSellerInput.  # noqa: E501

        The value when the data type is string.  # noqa: E501

        :return: The value_as_string of this AdditionalSellerInput.  # noqa: E501
        :rtype: str
        """
        return self._value_as_string

    @value_as_string.setter
    def value_as_string(self, value_as_string):
        """Sets the value_as_string of this AdditionalSellerInput.

        The value when the data type is string.  # noqa: E501

        :param value_as_string: The value_as_string of this AdditionalSellerInput.  # noqa: E501
        :type: str
        """

        self._value_as_string = value_as_string

    @property
    def value_as_boolean(self):
        """Gets the value_as_boolean of this AdditionalSellerInput.  # noqa: E501

        The value when the data type is boolean.  # noqa: E501

        :return: The value_as_boolean of this AdditionalSellerInput.  # noqa: E501
        :rtype: bool
        """
        return self._value_as_boolean

    @value_as_boolean.setter
    def value_as_boolean(self, value_as_boolean):
        """Sets the value_as_boolean of this AdditionalSellerInput.

        The value when the data type is boolean.  # noqa: E501

        :param value_as_boolean: The value_as_boolean of this AdditionalSellerInput.  # noqa: E501
        :type: bool
        """

        self._value_as_boolean = value_as_boolean

    @property
    def value_as_integer(self):
        """Gets the value_as_integer of this AdditionalSellerInput.  # noqa: E501

        The value when the data type is integer.  # noqa: E501

        :return: The value_as_integer of this AdditionalSellerInput.  # noqa: E501
        :rtype: int
        """
        return self._value_as_integer

    @value_as_integer.setter
    def value_as_integer(self, value_as_integer):
        """Sets the value_as_integer of this AdditionalSellerInput.

        The value when the data type is integer.  # noqa: E501

        :param value_as_integer: The value_as_integer of this AdditionalSellerInput.  # noqa: E501
        :type: int
        """

        self._value_as_integer = value_as_integer

    @property
    def value_as_timestamp(self):
        """Gets the value_as_timestamp of this AdditionalSellerInput.  # noqa: E501

        The value when the data type is a date-time formatted string.  # noqa: E501

        :return: The value_as_timestamp of this AdditionalSellerInput.  # noqa: E501
        :rtype: Timestamp
        """
        return self._value_as_timestamp

    @value_as_timestamp.setter
    def value_as_timestamp(self, value_as_timestamp):
        """Sets the value_as_timestamp of this AdditionalSellerInput.

        The value when the data type is a date-time formatted string.  # noqa: E501

        :param value_as_timestamp: The value_as_timestamp of this AdditionalSellerInput.  # noqa: E501
        :type: Timestamp
        """

        self._value_as_timestamp = value_as_timestamp

    @property
    def value_as_address(self):
        """Gets the value_as_address of this AdditionalSellerInput.  # noqa: E501


        :return: The value_as_address of this AdditionalSellerInput.  # noqa: E501
        :rtype: Address
        """
        return self._value_as_address

    @value_as_address.setter
    def value_as_address(self, value_as_address):
        """Sets the value_as_address of this AdditionalSellerInput.


        :param value_as_address: The value_as_address of this AdditionalSellerInput.  # noqa: E501
        :type: Address
        """

        self._value_as_address = value_as_address

    @property
    def value_as_weight(self):
        """Gets the value_as_weight of this AdditionalSellerInput.  # noqa: E501


        :return: The value_as_weight of this AdditionalSellerInput.  # noqa: E501
        :rtype: Weight
        """
        return self._value_as_weight

    @value_as_weight.setter
    def value_as_weight(self, value_as_weight):
        """Sets the value_as_weight of this AdditionalSellerInput.


        :param value_as_weight: The value_as_weight of this AdditionalSellerInput.  # noqa: E501
        :type: Weight
        """

        self._value_as_weight = value_as_weight

    @property
    def value_as_dimension(self):
        """Gets the value_as_dimension of this AdditionalSellerInput.  # noqa: E501


        :return: The value_as_dimension of this AdditionalSellerInput.  # noqa: E501
        :rtype: Length
        """
        return self._value_as_dimension

    @value_as_dimension.setter
    def value_as_dimension(self, value_as_dimension):
        """Sets the value_as_dimension of this AdditionalSellerInput.


        :param value_as_dimension: The value_as_dimension of this AdditionalSellerInput.  # noqa: E501
        :type: Length
        """

        self._value_as_dimension = value_as_dimension

    @property
    def value_as_currency(self):
        """Gets the value_as_currency of this AdditionalSellerInput.  # noqa: E501


        :return: The value_as_currency of this AdditionalSellerInput.  # noqa: E501
        :rtype: CurrencyAmount
        """
        return self._value_as_currency

    @value_as_currency.setter
    def value_as_currency(self, value_as_currency):
        """Sets the value_as_currency of this AdditionalSellerInput.


        :param value_as_currency: The value_as_currency of this AdditionalSellerInput.  # noqa: E501
        :type: CurrencyAmount
        """

        self._value_as_currency = value_as_currency

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
        if issubclass(AdditionalSellerInput, dict):
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
        if not isinstance(other, AdditionalSellerInput):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, AdditionalSellerInput):
            return True

        return self.to_dict() != other.to_dict()
