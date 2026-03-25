package com.amplifyframework.api.graphql;

import androidx.annotation.NonNull;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.ApiOperation;
import com.amplifyframework.api.graphql.GraphQLResponse;

/* JADX INFO: loaded from: classes14.dex */
public abstract class GraphQLOperation<R> extends ApiOperation<GraphQLRequest<R>> {
    private final GraphQLResponse.Factory responseFactory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GraphQLResponse.Factory getResponseFactory() {
        return this.responseFactory;
    }

    public GraphQLOperation(@NonNull GraphQLRequest<R> graphQLRequest, @NonNull GraphQLResponse.Factory factory) {
        super(graphQLRequest);
        this.responseFactory = factory;
    }

    public GraphQLResponse<R> wrapResponse(String str) throws ApiException {
        try {
            return this.responseFactory.buildResponse((GraphQLRequest) getRequest(), str);
        } catch (ClassCastException unused) {
            throw new ApiException("Amplify encountered an error while deserializing an object", "Sorry, we don't have a suggested fix for this error yet.");
        }
    }
}
