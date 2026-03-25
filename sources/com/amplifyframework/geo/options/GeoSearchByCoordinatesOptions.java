package com.amplifyframework.geo.options;

/* JADX INFO: loaded from: classes14.dex */
public class GeoSearchByCoordinatesOptions {
    private final int maxResults;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxResults() {
        return this.maxResults;
    }

    public GeoSearchByCoordinatesOptions(Builder builder) {
        this.maxResults = builder.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByCoordinatesOptions defaults() {
        return builder().build();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private int maxResults = 50;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder maxResults(int i) {
            this.maxResults = i;
            return this;
        }

        public GeoSearchByCoordinatesOptions build() {
            return new GeoSearchByCoordinatesOptions(this);
        }
    }
}
