package org.example;


import com.grpcmod.Author;
import com.grpcmod.BookAuthorServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {


    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
        
    }
}
