package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Instanciar manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, conforme exemplo.

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // mascara do sdf

        Comment firstComment = new Comment("Have a nice trip!");
        Comment secondComment = new Comment("Wow!!! That´s awesome!");

        Post firstPost = new Post(
                sdf.parse("21/06/2018 13:05:44"), // utilizando a mascara do sdf
                "Traveling to United States", // título
                "I´m going to visit this wonderful country!", // conteúdo
                12); // likes
        firstPost.addComment(firstComment); // adicionando o comentario "firstComment" para o post firstPost
        firstPost.addComment(secondComment); // adicionando o comentario "secondComment" para o post firstPost

        Comment thirdComment = new Comment("Good night");
        Comment forthComment = new Comment("May the force be with you");

        Post secondPost = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night, guys!",
                "See you tomorrow!",
                5);
        secondPost.addComment(thirdComment);
        secondPost.addComment(forthComment);

        System.out.println(firstPost);
        System.out.println(secondPost);
    }
}