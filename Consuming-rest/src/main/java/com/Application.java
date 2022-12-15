package com;

import org.springframework.web.client.RestTemplate;
//Взаимодействие с RESTful Web-сервисом
//Как с использованием Spring RestTemplate получить web-страницу.
public class Application {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject(
                "https://mdn.github.io/learning-area/javascript/oojs/json/superheroes.json",
                Page.class
        );
        System.out.println("" + page.getHomeTown());
        System.out.println("" + page.getFormed());
        System.out.println("" + page.isActive());
        System.out.println();

        for(Member member: page.getMembers()){
            System.out.println(member.getName() + ":  " + member.getSecretIdentity());

        }
    }
}
