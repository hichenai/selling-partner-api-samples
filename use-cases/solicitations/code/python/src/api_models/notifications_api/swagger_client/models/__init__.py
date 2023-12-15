# coding: utf-8

# flake8: noqa
"""
    Selling Partner API for Notifications

    The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  # noqa: E501

    OpenAPI spec version: v1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from api_models.notifications_api.swagger_client.models.create_destination_request import CreateDestinationRequest
from api_models.notifications_api.swagger_client.models.create_destination_response import CreateDestinationResponse
from api_models.notifications_api.swagger_client.models.create_subscription_request import CreateSubscriptionRequest
from api_models.notifications_api.swagger_client.models.create_subscription_response import CreateSubscriptionResponse
from api_models.notifications_api.swagger_client.models.delete_destination_response import DeleteDestinationResponse
from api_models.notifications_api.swagger_client.models.delete_subscription_by_id_response import DeleteSubscriptionByIdResponse
from api_models.notifications_api.swagger_client.models.destination import Destination
from api_models.notifications_api.swagger_client.models.destination_list import DestinationList
from api_models.notifications_api.swagger_client.models.destination_resource import DestinationResource
from api_models.notifications_api.swagger_client.models.destination_resource_specification import DestinationResourceSpecification
from api_models.notifications_api.swagger_client.models.error import Error
from api_models.notifications_api.swagger_client.models.error_list import ErrorList
from api_models.notifications_api.swagger_client.models.event_bridge_resource import EventBridgeResource
from api_models.notifications_api.swagger_client.models.event_bridge_resource_specification import EventBridgeResourceSpecification
from api_models.notifications_api.swagger_client.models.get_destination_response import GetDestinationResponse
from api_models.notifications_api.swagger_client.models.get_destinations_response import GetDestinationsResponse
from api_models.notifications_api.swagger_client.models.get_subscription_by_id_response import GetSubscriptionByIdResponse
from api_models.notifications_api.swagger_client.models.get_subscription_response import GetSubscriptionResponse
from api_models.notifications_api.swagger_client.models.sqs_resource import SqsResource
from api_models.notifications_api.swagger_client.models.subscription import Subscription
