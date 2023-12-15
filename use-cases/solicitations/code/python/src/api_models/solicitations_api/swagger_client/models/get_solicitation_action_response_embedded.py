# coding: utf-8

"""
    Selling Partner API for Solicitations

    With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.  # noqa: E501

    OpenAPI spec version: v1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class GetSolicitationActionResponseEmbedded(object):
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
        'schema': 'GetSchemaResponse'
    }

    attribute_map = {
        'schema': 'schema'
    }

    def __init__(self, schema=None):  # noqa: E501
        """GetSolicitationActionResponseEmbedded - a model defined in Swagger"""  # noqa: E501

        self._schema = None
        self.discriminator = None

        if schema is not None:
            self.schema = schema

    @property
    def schema(self):
        """Gets the schema of this GetSolicitationActionResponseEmbedded.  # noqa: E501


        :return: The schema of this GetSolicitationActionResponseEmbedded.  # noqa: E501
        :rtype: GetSchemaResponse
        """
        return self._schema

    @schema.setter
    def schema(self, schema):
        """Sets the schema of this GetSolicitationActionResponseEmbedded.


        :param schema: The schema of this GetSolicitationActionResponseEmbedded.  # noqa: E501
        :type: GetSchemaResponse
        """

        self._schema = schema

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
        if issubclass(GetSolicitationActionResponseEmbedded, dict):
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
        if not isinstance(other, GetSolicitationActionResponseEmbedded):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
