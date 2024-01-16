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


class SellerInputDefinition(object):
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
        'is_required': 'bool',
        'data_type': 'str',
        'constraints': 'Constraints',
        'input_display_text': 'str',
        'input_target': 'InputTargetType',
        'stored_value': 'AdditionalSellerInput',
        'restricted_set_values': 'RestrictedSetValues'
    }

    attribute_map = {
        'is_required': 'IsRequired',
        'data_type': 'DataType',
        'constraints': 'Constraints',
        'input_display_text': 'InputDisplayText',
        'input_target': 'InputTarget',
        'stored_value': 'StoredValue',
        'restricted_set_values': 'RestrictedSetValues'
    }

    def __init__(self, is_required=None, data_type=None, constraints=None, input_display_text=None, input_target=None, stored_value=None, restricted_set_values=None, _configuration=None):  # noqa: E501
        """SellerInputDefinition - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._is_required = None
        self._data_type = None
        self._constraints = None
        self._input_display_text = None
        self._input_target = None
        self._stored_value = None
        self._restricted_set_values = None
        self.discriminator = None

        self.is_required = is_required
        self.data_type = data_type
        self.constraints = constraints
        self.input_display_text = input_display_text
        if input_target is not None:
            self.input_target = input_target
        self.stored_value = stored_value
        if restricted_set_values is not None:
            self.restricted_set_values = restricted_set_values

    @property
    def is_required(self):
        """Gets the is_required of this SellerInputDefinition.  # noqa: E501

        When true, the additional input field is required.  # noqa: E501

        :return: The is_required of this SellerInputDefinition.  # noqa: E501
        :rtype: bool
        """
        return self._is_required

    @is_required.setter
    def is_required(self, is_required):
        """Sets the is_required of this SellerInputDefinition.

        When true, the additional input field is required.  # noqa: E501

        :param is_required: The is_required of this SellerInputDefinition.  # noqa: E501
        :type: bool
        """
        if self._configuration.client_side_validation and is_required is None:
            raise ValueError("Invalid value for `is_required`, must not be `None`")  # noqa: E501

        self._is_required = is_required

    @property
    def data_type(self):
        """Gets the data_type of this SellerInputDefinition.  # noqa: E501

        The data type of the additional input field.  # noqa: E501

        :return: The data_type of this SellerInputDefinition.  # noqa: E501
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """Sets the data_type of this SellerInputDefinition.

        The data type of the additional input field.  # noqa: E501

        :param data_type: The data_type of this SellerInputDefinition.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and data_type is None:
            raise ValueError("Invalid value for `data_type`, must not be `None`")  # noqa: E501

        self._data_type = data_type

    @property
    def constraints(self):
        """Gets the constraints of this SellerInputDefinition.  # noqa: E501


        :return: The constraints of this SellerInputDefinition.  # noqa: E501
        :rtype: Constraints
        """
        return self._constraints

    @constraints.setter
    def constraints(self, constraints):
        """Sets the constraints of this SellerInputDefinition.


        :param constraints: The constraints of this SellerInputDefinition.  # noqa: E501
        :type: Constraints
        """
        if self._configuration.client_side_validation and constraints is None:
            raise ValueError("Invalid value for `constraints`, must not be `None`")  # noqa: E501

        self._constraints = constraints

    @property
    def input_display_text(self):
        """Gets the input_display_text of this SellerInputDefinition.  # noqa: E501

        The display text for the additional input field.  # noqa: E501

        :return: The input_display_text of this SellerInputDefinition.  # noqa: E501
        :rtype: str
        """
        return self._input_display_text

    @input_display_text.setter
    def input_display_text(self, input_display_text):
        """Sets the input_display_text of this SellerInputDefinition.

        The display text for the additional input field.  # noqa: E501

        :param input_display_text: The input_display_text of this SellerInputDefinition.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and input_display_text is None:
            raise ValueError("Invalid value for `input_display_text`, must not be `None`")  # noqa: E501

        self._input_display_text = input_display_text

    @property
    def input_target(self):
        """Gets the input_target of this SellerInputDefinition.  # noqa: E501

        Whether the seller input applies to the item or the shipment.  # noqa: E501

        :return: The input_target of this SellerInputDefinition.  # noqa: E501
        :rtype: InputTargetType
        """
        return self._input_target

    @input_target.setter
    def input_target(self, input_target):
        """Sets the input_target of this SellerInputDefinition.

        Whether the seller input applies to the item or the shipment.  # noqa: E501

        :param input_target: The input_target of this SellerInputDefinition.  # noqa: E501
        :type: InputTargetType
        """

        self._input_target = input_target

    @property
    def stored_value(self):
        """Gets the stored_value of this SellerInputDefinition.  # noqa: E501


        :return: The stored_value of this SellerInputDefinition.  # noqa: E501
        :rtype: AdditionalSellerInput
        """
        return self._stored_value

    @stored_value.setter
    def stored_value(self, stored_value):
        """Sets the stored_value of this SellerInputDefinition.


        :param stored_value: The stored_value of this SellerInputDefinition.  # noqa: E501
        :type: AdditionalSellerInput
        """
        if self._configuration.client_side_validation and stored_value is None:
            raise ValueError("Invalid value for `stored_value`, must not be `None`")  # noqa: E501

        self._stored_value = stored_value

    @property
    def restricted_set_values(self):
        """Gets the restricted_set_values of this SellerInputDefinition.  # noqa: E501


        :return: The restricted_set_values of this SellerInputDefinition.  # noqa: E501
        :rtype: RestrictedSetValues
        """
        return self._restricted_set_values

    @restricted_set_values.setter
    def restricted_set_values(self, restricted_set_values):
        """Sets the restricted_set_values of this SellerInputDefinition.


        :param restricted_set_values: The restricted_set_values of this SellerInputDefinition.  # noqa: E501
        :type: RestrictedSetValues
        """

        self._restricted_set_values = restricted_set_values

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
        if issubclass(SellerInputDefinition, dict):
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
        if not isinstance(other, SellerInputDefinition):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SellerInputDefinition):
            return True

        return self.to_dict() != other.to_dict()
