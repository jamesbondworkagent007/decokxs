package com.amplifyframework.geo.models;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class SearchArea {
    private final Coordinates biasPosition;
    private final BoundingBox boundingBox;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Coordinates getBiasPosition() {
        return this.biasPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    private SearchArea(BoundingBox boundingBox, Coordinates coordinates) {
        this.boundingBox = boundingBox;
        this.biasPosition = coordinates;
    }

    public static SearchArea near(@NonNull Coordinates coordinates) {
        Objects.requireNonNull(coordinates);
        return new SearchArea(null, coordinates);
    }

    public static SearchArea within(@NonNull BoundingBox boundingBox) {
        Objects.requireNonNull(boundingBox);
        return new SearchArea(boundingBox, null);
    }

    public String toString() {
        return "SearchArea{boundingBox=" + this.boundingBox + ", biasPosition=" + this.biasPosition + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SearchArea.class != obj.getClass()) {
            return false;
        }
        SearchArea searchArea = (SearchArea) obj;
        return ObjectsCompat.equals(this.boundingBox, searchArea.boundingBox) && ObjectsCompat.equals(this.biasPosition, searchArea.biasPosition);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.boundingBox, this.biasPosition);
    }
}
