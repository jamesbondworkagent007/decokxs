package com.amplifyframework.geo.models;

import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public class Place {
    private final Geometry geometry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Geometry getGeometry() {
        return this.geometry;
    }

    public Place(Geometry geometry) {
        this.geometry = geometry;
    }

    public String toString() {
        return "Place{geometry=" + this.geometry + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.geometry, ((Place) obj).geometry);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.geometry);
    }
}
