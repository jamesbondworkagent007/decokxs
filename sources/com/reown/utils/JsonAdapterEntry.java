package com.reown.utils;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonAdapterEntry<T> {
    public final Function1<Moshi, JsonAdapter<T>> adapter;
    public final Class<T> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.utils.JsonAdapterEntry */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JsonAdapterEntry copy$default(JsonAdapterEntry jsonAdapterEntry, Class cls, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            cls = jsonAdapterEntry.type;
        }
        if ((i & 2) != 0) {
            function1 = jsonAdapterEntry.adapter;
        }
        return jsonAdapterEntry.copy(cls, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<T> component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Moshi, JsonAdapter<T>> component2() {
        return this.adapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonAdapterEntry<T> copy(@NotNull Class<T> cls, @NotNull Function1<? super Moshi, ? extends JsonAdapter<T>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new JsonAdapterEntry<>(cls, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonAdapterEntry)) {
            return false;
        }
        JsonAdapterEntry jsonAdapterEntry = (JsonAdapterEntry) obj;
        return Intrinsics.EZpvd(this.type, jsonAdapterEntry.type) && Intrinsics.EZpvd(this.adapter, jsonAdapterEntry.adapter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Moshi, JsonAdapter<T>> getAdapter() {
        return this.adapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<T> getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.adapter.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.squareup.moshi.Moshi, ? extends com.squareup.moshi.JsonAdapter<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonAdapterEntry(@NotNull Class<T> cls, @NotNull Function1<? super Moshi, ? extends JsonAdapter<T>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.type = cls;
        this.adapter = function1;
    }

    public String toString() {
        return "JsonAdapterEntry(type=" + this.type.getName() + ")";
    }
}
