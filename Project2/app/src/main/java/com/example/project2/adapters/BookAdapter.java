package com.example.project2.adapters;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project2.R;
import com.example.project2.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    List<Book> books = new ArrayList<>();
    public BookAdapter(List<Book> books) {
        this.books = books;
    }
    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View bookView = layoutInflater.inflate(R.layout.book_view, parent, false);
        ViewHolder holder = new ViewHolder(bookView);
        return holder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder holder, int position) {
        Book book = books.get(position);
        holder.bookCover.setImageResource(book.getBookCover());
        holder.title.setText(book.getTitle());
        holder.isbn.setText("ISBN-13: "+book.getIsbn());
        holder.date.setText("Publication date: "+book.getPubDate());
        holder.publisher.setText("Publisher: "+book.getPublisher());
        holder.author.setText("Author: "+book.getAuthor());
        String prc = String.valueOf(book.getPrice());
        holder.price.setText("Price: $"+ prc);
    }

    @Override
    public int getItemCount() {
        return (books != null) ? books.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, date, publisher, author, isbn, price;
        ImageView bookCover;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookCover = itemView.findViewById(R.id.bookCover);
            title = itemView.findViewById(R.id.bookTitle);
            date = itemView.findViewById(R.id.textPublicationDate);
            publisher = itemView.findViewById(R.id.textPublisher);
            author = itemView.findViewById(R.id.textAuthor);
            isbn = itemView.findViewById(R.id.textISBN);
            price = itemView.findViewById(R.id.textPrice);
        }
    }
}
