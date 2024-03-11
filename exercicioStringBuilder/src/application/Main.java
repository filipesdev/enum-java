package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

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


        System.out.println(firstPost);
    }
}