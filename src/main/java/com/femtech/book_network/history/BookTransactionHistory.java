package com.femtech.book_network.history;

import com.femtech.book_network.book.Book;
import com.femtech.book_network.common.BaseEntity;
import com.femtech.book_network.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookTransactionHistory extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "user_id")
     private User userId;

    @ManyToOne
    @JoinColumn(name = "book_id")

    private Book book;
    private boolean returned;
    private boolean returnApproved;
}
