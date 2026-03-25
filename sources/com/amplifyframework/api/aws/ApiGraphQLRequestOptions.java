package com.amplifyframework.api.aws;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiGraphQLRequestOptions implements GraphQLRequestOptions {
    private static final int DEFAULT_MAX_DEPTH = 2;
    private static final String ITEMS_KEY = "items";
    private static final String NEXT_TOKEN_KEY = "nextToken";
    private int maxDepth;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public String listField() {
        return "items";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public int maxDepth() {
        return this.maxDepth;
    }

    public ApiGraphQLRequestOptions() {
        this.maxDepth = 2;
    }

    public ApiGraphQLRequestOptions(int i) {
        this.maxDepth = i;
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> paginationFields() {
        return Collections.singletonList("nextToken");
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public List<String> modelMetaFields() {
        return Collections.emptyList();
    }

    @Override // com.amplifyframework.api.aws.GraphQLRequestOptions
    public LeafSerializationBehavior leafSerializationBehavior() {
        return LeafSerializationBehavior.ALL_FIELDS;
    }
}
