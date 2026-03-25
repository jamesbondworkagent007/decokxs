package com.amplifyframework.geo.models;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class MapStyleDescriptor {
    private final String json;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getJson() {
        return this.json;
    }

    public MapStyleDescriptor(@NonNull String str) {
        Objects.requireNonNull(str);
        this.json = str;
    }

    public String toString() {
        return "MapStyleDescriptor{json='" + this.json + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapStyleDescriptor.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.json, ((MapStyleDescriptor) obj).json);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.json);
    }
}
