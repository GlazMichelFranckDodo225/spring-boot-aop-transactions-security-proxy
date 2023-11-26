package com.dgmf.hello;

public class BookmarkNotFoundException extends RuntimeException {

    public BookmarkNotFoundException(Long bookmarkId) {
        super("Bookmark with id: "+ bookmarkId+" not found");
    }
}