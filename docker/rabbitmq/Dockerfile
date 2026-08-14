FROM rabbitmq:3.12-management

RUN apt-get update \
    && apt-get install -y --no-install-recommends curl ca-certificates \
    && rm -rf /var/lib/apt/lists/* \
    && curl -fsSL -o /plugins/rabbitmq_delayed_message_exchange-3.12.0.ez \
       https://github.com/rabbitmq/rabbitmq-delayed-message-exchange/releases/download/v3.12.0/rabbitmq_delayed_message_exchange-3.12.0.ez \
    && chmod 0644 /plugins/rabbitmq_delayed_message_exchange-3.12.0.ez
