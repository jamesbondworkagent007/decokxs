package com.amplifyframework.api.graphql;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class GraphQLPathSegment {
    private final Object value;

    public GraphQLPathSegment(int i) {
        this.value = Integer.valueOf(i);
    }

    public GraphQLPathSegment(@NonNull String str) {
        this.value = str;
    }

    public boolean isInteger() {
        return this.value instanceof Integer;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public String getAsString() {
        if (isString()) {
            return (String) this.value;
        }
        throw new ClassCastException("Not a String: " + this.value.getClass().getSimpleName());
    }

    public int getAsInt() {
        if (isInteger()) {
            return ((Integer) this.value).intValue();
        }
        throw new ClassCastException("Not an int: " + this.value.getClass().getSimpleName());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GraphQLPathSegment.class != obj.getClass()) {
            return false;
        }
        GraphQLPathSegment graphQLPathSegment = (GraphQLPathSegment) obj;
        if (isString() && graphQLPathSegment.isString()) {
            return ObjectsCompat.equals(getAsString(), graphQLPathSegment.getAsString());
        }
        if (isInteger() && graphQLPathSegment.isInteger()) {
            return ObjectsCompat.equals(Integer.valueOf(getAsInt()), Integer.valueOf(graphQLPathSegment.getAsInt()));
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "GraphQLPathSegment{value='" + this.value + "'" + AbstractJsonLexerKt.END_OBJ;
    }
}
