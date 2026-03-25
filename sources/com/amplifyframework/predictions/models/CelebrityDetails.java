package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.util.Immutable;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class CelebrityDetails {
    private final RectF box;
    private final Celebrity celebrity;
    private final List<Landmark> landmarks;
    private final Polygon polygon;
    private final Pose pose;
    private final List<URL> urls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RectF getBox() {
        return this.box;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Celebrity getCelebrity() {
        return this.celebrity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Polygon getPolygon() {
        return this.polygon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Pose getPose() {
        return this.pose;
    }

    private CelebrityDetails(Builder builder) {
        this.celebrity = builder.getCelebrity();
        this.box = builder.getBox();
        this.polygon = builder.getPolygon();
        this.pose = builder.getPose();
        this.landmarks = builder.getLandmarks();
        this.urls = builder.getUrls();
    }

    public List<Landmark> getLandmarks() {
        return Immutable.of(this.landmarks);
    }

    public List<URL> getUrls() {
        return Immutable.of(this.urls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private RectF box;
        private Celebrity celebrity;
        private List<Landmark> landmarks;
        private Polygon polygon;
        private Pose pose;
        private List<URL> urls;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder box(@Nullable RectF rectF) {
            this.box = rectF;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RectF getBox() {
            return this.box;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Polygon getPolygon() {
            return this.polygon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Pose getPose() {
            return this.pose;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder polygon(@Nullable Polygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder pose(@Nullable Pose pose) {
            this.pose = pose;
            return this;
        }

        private Builder() {
            this.landmarks = Collections.emptyList();
            this.urls = Collections.emptyList();
        }

        public Builder celebrity(@NonNull Celebrity celebrity) {
            Objects.requireNonNull(celebrity);
            this.celebrity = celebrity;
            return this;
        }

        public Builder landmarks(@NonNull List<Landmark> list) {
            Objects.requireNonNull(list);
            this.landmarks = list;
            return this;
        }

        public Builder urls(@NonNull List<URL> list) {
            Objects.requireNonNull(list);
            this.urls = list;
            return this;
        }

        public CelebrityDetails build() {
            return new CelebrityDetails(this);
        }

        public Celebrity getCelebrity() {
            Celebrity celebrity = this.celebrity;
            Objects.requireNonNull(celebrity);
            return celebrity;
        }

        public List<Landmark> getLandmarks() {
            List<Landmark> list = this.landmarks;
            Objects.requireNonNull(list);
            return list;
        }

        public List<URL> getUrls() {
            List<URL> list = this.urls;
            Objects.requireNonNull(list);
            return list;
        }
    }
}
