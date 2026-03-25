package com.amplifyframework.geo.result;

import androidx.annotation.NonNull;
import com.amplifyframework.geo.models.Place;
import com.amplifyframework.util.Immutable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class GeoSearchResult {
    private final List<Place> places;

    private GeoSearchResult(List<Place> list) {
        this.places = list;
    }

    public static GeoSearchResult withPlaces(@NonNull List<Place> list) {
        Objects.requireNonNull(list);
        return new GeoSearchResult(list);
    }

    public List<Place> getPlaces() {
        return Immutable.of(this.places);
    }
}
