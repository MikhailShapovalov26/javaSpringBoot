FROM debian:stable-slim

RUN apt-get update && apt-get install -y nginx && \
    apt-get clean && rm -rf /var/lib/apt/lists/* && \
    mkdir -p /var/www/html/signin && \
    chown -R www-data:www-data /var/www/html/signin && \
    chmod -R 755 /var/www/html/signin

COPY config/proxy.conf /etc/nginx/conf.d/proxy.conf

COPY html/index.html /var/www/html/signin/index.html
EXPOSE 80

CMD [ "nginx", "-g", "daemon off;" ]
