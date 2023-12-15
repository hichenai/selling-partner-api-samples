# coding: utf-8

"""
    Selling Partner API for Pricing

    The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from src.api_models.pricing_api.swagger_client.configuration import Configuration


class ItemIdentifier(object):
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
        'marketplace_id': 'str',
        'asin': 'str',
        'seller_sku': 'str',
        'item_condition': 'ConditionType'
    }

    attribute_map = {
        'marketplace_id': 'MarketplaceId',
        'asin': 'ASIN',
        'seller_sku': 'SellerSKU',
        'item_condition': 'ItemCondition'
    }

    def __init__(self, marketplace_id=None, asin=None, seller_sku=None, item_condition=None, _configuration=None):  # noqa: E501
        """ItemIdentifier - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._marketplace_id = None
        self._asin = None
        self._seller_sku = None
        self._item_condition = None
        self.discriminator = None

        self.marketplace_id = marketplace_id
        if asin is not None:
            self.asin = asin
        if seller_sku is not None:
            self.seller_sku = seller_sku
        self.item_condition = item_condition

    @property
    def marketplace_id(self):
        """Gets the marketplace_id of this ItemIdentifier.  # noqa: E501

        A marketplace identifier. Specifies the marketplace from which prices are returned.  # noqa: E501

        :return: The marketplace_id of this ItemIdentifier.  # noqa: E501
        :rtype: str
        """
        return self._marketplace_id

    @marketplace_id.setter
    def marketplace_id(self, marketplace_id):
        """Sets the marketplace_id of this ItemIdentifier.

        A marketplace identifier. Specifies the marketplace from which prices are returned.  # noqa: E501

        :param marketplace_id: The marketplace_id of this ItemIdentifier.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and marketplace_id is None:
            raise ValueError("Invalid value for `marketplace_id`, must not be `None`")  # noqa: E501

        self._marketplace_id = marketplace_id

    @property
    def asin(self):
        """Gets the asin of this ItemIdentifier.  # noqa: E501

        The Amazon Standard Identification Number (ASIN) of the item.  # noqa: E501

        :return: The asin of this ItemIdentifier.  # noqa: E501
        :rtype: str
        """
        return self._asin

    @asin.setter
    def asin(self, asin):
        """Sets the asin of this ItemIdentifier.

        The Amazon Standard Identification Number (ASIN) of the item.  # noqa: E501

        :param asin: The asin of this ItemIdentifier.  # noqa: E501
        :type: str
        """

        self._asin = asin

    @property
    def seller_sku(self):
        """Gets the seller_sku of this ItemIdentifier.  # noqa: E501

        The seller stock keeping unit (SKU) of the item.  # noqa: E501

        :return: The seller_sku of this ItemIdentifier.  # noqa: E501
        :rtype: str
        """
        return self._seller_sku

    @seller_sku.setter
    def seller_sku(self, seller_sku):
        """Sets the seller_sku of this ItemIdentifier.

        The seller stock keeping unit (SKU) of the item.  # noqa: E501

        :param seller_sku: The seller_sku of this ItemIdentifier.  # noqa: E501
        :type: str
        """

        self._seller_sku = seller_sku

    @property
    def item_condition(self):
        """Gets the item_condition of this ItemIdentifier.  # noqa: E501

        The condition of the item.  # noqa: E501

        :return: The item_condition of this ItemIdentifier.  # noqa: E501
        :rtype: ConditionType
        """
        return self._item_condition

    @item_condition.setter
    def item_condition(self, item_condition):
        """Sets the item_condition of this ItemIdentifier.

        The condition of the item.  # noqa: E501

        :param item_condition: The item_condition of this ItemIdentifier.  # noqa: E501
        :type: ConditionType
        """
        if self._configuration.client_side_validation and item_condition is None:
            raise ValueError("Invalid value for `item_condition`, must not be `None`")  # noqa: E501

        self._item_condition = item_condition

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
        if issubclass(ItemIdentifier, dict):
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
        if not isinstance(other, ItemIdentifier):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ItemIdentifier):
            return True

        return self.to_dict() != other.to_dict()
