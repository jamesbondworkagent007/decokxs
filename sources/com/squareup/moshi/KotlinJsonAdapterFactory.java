package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    private final /* synthetic */ com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory $$delegate_0 = new com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
        com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory kotlinJsonAdapterFactory = this.$$delegate_0;
        Intrinsics.checkNotNullExpressionValue(type, "");
        Intrinsics.checkNotNullExpressionValue(set, "");
        Intrinsics.checkNotNullExpressionValue(moshi, "");
        return kotlinJsonAdapterFactory.create(type, set, moshi);
    }
}
