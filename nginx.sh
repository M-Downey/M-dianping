docker run --name nginx-dp \
    -p 8080:8080 \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/conf:/etc/nginx \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/html:/usr/share/nginx/html \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/logs:/var/log/nginx \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/temp:/var/temp/nginx \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/contrib:/etc/nginx/contrib \
    -v /Users/tony/IdeaProjects/m-dianping/dp-nginx/docs:/usr/share/nginx/docs \
    -d nginx