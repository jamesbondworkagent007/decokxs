package com.amplifyframework.api.aws;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface GraphQLRequestOptions {
    LeafSerializationBehavior leafSerializationBehavior();

    String listField();

    int maxDepth();

    List<String> modelMetaFields();

    List<String> paginationFields();
}
