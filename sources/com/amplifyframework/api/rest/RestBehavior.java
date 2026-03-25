package com.amplifyframework.api.rest;

import androidx.annotation.NonNull;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface RestBehavior {
    RestOperation delete(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation delete(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation get(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation get(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation head(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation head(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation patch(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation patch(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation post(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation post(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation put(@NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);

    RestOperation put(@NonNull String str, @NonNull RestOptions restOptions, @NonNull Consumer<RestResponse> consumer, @NonNull Consumer<ApiException> consumer2);
}
