package com.amplifyframework.api.aws;

import com.amplifyframework.api.graphql.GsonResponseAdapters;
import com.amplifyframework.core.model.query.predicate.GsonPredicateAdapters;
import com.amplifyframework.core.model.temporal.GsonTemporalAdapters;
import com.amplifyframework.core.model.types.GsonJavaTypeAdapters;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.datastore.appsync.SerializedCustomTypeAdapter;
import com.amplifyframework.datastore.appsync.SerializedModelAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes21.dex */
final class GsonFactory {
    private static Gson gson;

    private GsonFactory() {
    }

    public static Gson instance() {
        Gson gson2;
        synchronized (GsonFactory.class) {
            if (gson == null) {
                gson = create();
            }
            gson2 = gson;
        }
        return gson2;
    }

    private static Gson create() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        GsonTemporalAdapters.register(gsonBuilder);
        GsonJavaTypeAdapters.register(gsonBuilder);
        GsonPredicateAdapters.register(gsonBuilder);
        GsonResponseAdapters.register(gsonBuilder);
        ModelWithMetadataAdapter.register(gsonBuilder);
        SerializedModelAdapter.register(gsonBuilder);
        SerializedCustomTypeAdapter.register(gsonBuilder);
        ModelListDeserializer.register(gsonBuilder);
        ModelPageDeserializer.register(gsonBuilder);
        gsonBuilder.serializeNulls();
        return gsonBuilder.create();
    }
}
