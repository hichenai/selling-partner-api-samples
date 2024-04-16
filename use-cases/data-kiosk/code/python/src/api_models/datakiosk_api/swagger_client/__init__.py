# coding: utf-8

# flake8: noqa

"""
    Selling Partner API for Data Kiosk

    The Selling Partner API for Data Kiosk lets you submit GraphQL queries from a variety of schemas to help selling partners manage their businesses.  # noqa: E501

    OpenAPI spec version: 2023-11-15
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

# import apis into sdk package
from src.api_models.datakiosk_api.swagger_client.api.queries_api import QueriesApi
# import ApiClient
from src.api_models.datakiosk_api.swagger_client.api_client import ApiClient
from src.api_models.datakiosk_api.swagger_client.configuration import Configuration
# import models into sdk package
from src.api_models.datakiosk_api.swagger_client.models.create_query_response import CreateQueryResponse
from src.api_models.datakiosk_api.swagger_client.models.create_query_specification import CreateQuerySpecification
from src.api_models.datakiosk_api.swagger_client.models.error import Error
from src.api_models.datakiosk_api.swagger_client.models.error_list import ErrorList
from src.api_models.datakiosk_api.swagger_client.models.get_document_response import GetDocumentResponse
from src.api_models.datakiosk_api.swagger_client.models.get_queries_response import GetQueriesResponse
from src.api_models.datakiosk_api.swagger_client.models.get_queries_response_pagination import GetQueriesResponsePagination
from src.api_models.datakiosk_api.swagger_client.models.query import Query
from src.api_models.datakiosk_api.swagger_client.models.query_list import QueryList
from src.api_models.datakiosk_api.swagger_client.models.query_pagination import QueryPagination
