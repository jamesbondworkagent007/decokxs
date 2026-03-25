package com.amplifyframework.geo.options;

import androidx.annotation.NonNull;
import com.amplifyframework.geo.models.CountryCode;
import com.amplifyframework.geo.models.SearchArea;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class GeoSearchByTextOptions {
    private final List<CountryCode> countries;
    private final int maxResults;
    private final SearchArea searchArea;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxResults() {
        return this.maxResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchArea getSearchArea() {
        return this.searchArea;
    }

    public GeoSearchByTextOptions(Builder builder) {
        this.maxResults = builder.maxResults;
        this.searchArea = builder.searchArea;
        this.countries = builder.countries;
    }

    public List<CountryCode> getCountries() {
        return Immutable.of(this.countries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByTextOptions defaults() {
        return builder().build();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private SearchArea searchArea;
        private int maxResults = 50;
        private List<CountryCode> countries = Collections.singletonList(CountryCode.USA);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder maxResults(int i) {
            this.maxResults = i;
            return this;
        }

        public Builder searchArea(@NonNull SearchArea searchArea) {
            Objects.requireNonNull(searchArea);
            this.searchArea = searchArea;
            return this;
        }

        public Builder countries(@NonNull List<CountryCode> list) {
            Objects.requireNonNull(list);
            this.countries = list;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Country filter cannot be empty.");
            }
            return this;
        }

        public GeoSearchByTextOptions build() {
            return new GeoSearchByTextOptions(this);
        }
    }
}
