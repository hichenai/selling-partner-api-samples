# coding: utf-8

"""
    Selling Partner API for Data Kiosk

    The Selling Partner API for Data Kiosk lets you submit GraphQL queries from a variety of schemas to help selling partners manage their businesses.  # noqa: E501

    OpenAPI spec version: 2023-11-15
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class CreateQuerySpecification(object):
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
        'query': 'str',
        'pagination_token': 'str'
    }

    attribute_map = {
        'query': 'query',
        'pagination_token': 'paginationToken'
    }

    def __init__(self, query=None, pagination_token=None):  # noqa: E501
        """CreateQuerySpecification - a model defined in Swagger"""  # noqa: E501
        self._query = None
        self._pagination_token = None
        self.discriminator = None
        self.query = query
        if pagination_token is not None:
            self.pagination_token = pagination_token

    @property
    def query(self):
        """Gets the query of this CreateQuerySpecification.  # noqa: E501

        The GraphQL query to submit. A query must be at most 8000 characters after unnecessary whitespace is removed.  # noqa: E501

        :return: The query of this CreateQuerySpecification.  # noqa: E501
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query):
        """Sets the query of this CreateQuerySpecification.

        The GraphQL query to submit. A query must be at most 8000 characters after unnecessary whitespace is removed.  # noqa: E501

        :param query: The query of this CreateQuerySpecification.  # noqa: E501
        :type: str
        """
        if query is None:
            raise ValueError("Invalid value for `query`, must not be `None`")  # noqa: E501

        self._query = query

    @property
    def pagination_token(self):
        """Gets the pagination_token of this CreateQuerySpecification.  # noqa: E501

        A token to fetch a certain page of query results when there are multiple pages of query results available. The value of this token must be fetched from the `pagination.nextToken` field of the `Query` object, and the `query` field for this object must also be set to the `query` field of the same `Query` object. A `Query` object can be retrieved from either the `getQueries` or `getQuery` operation. In the absence of this token value, the first page of query results will be requested.  # noqa: E501

        :return: The pagination_token of this CreateQuerySpecification.  # noqa: E501
        :rtype: str
        """
        return self._pagination_token

    @pagination_token.setter
    def pagination_token(self, pagination_token):
        """Sets the pagination_token of this CreateQuerySpecification.

        A token to fetch a certain page of query results when there are multiple pages of query results available. The value of this token must be fetched from the `pagination.nextToken` field of the `Query` object, and the `query` field for this object must also be set to the `query` field of the same `Query` object. A `Query` object can be retrieved from either the `getQueries` or `getQuery` operation. In the absence of this token value, the first page of query results will be requested.  # noqa: E501

        :param pagination_token: The pagination_token of this CreateQuerySpecification.  # noqa: E501
        :type: str
        """

        self._pagination_token = pagination_token

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
        if issubclass(CreateQuerySpecification, dict):
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
        if not isinstance(other, CreateQuerySpecification):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
