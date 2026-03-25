package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ImageFeature<T> extends Feature<T> {
    private final RectF box;
    private final Polygon polygon;

    public static abstract class Builder<B extends Builder<B, R, T>, R extends ImageFeature<T>, T> extends Feature.Builder<B, R, T> {
        private RectF box;
        private Polygon polygon;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public B box(@Nullable RectF rectF) {
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
        public B polygon(@Nullable Polygon polygon) {
            this.polygon = polygon;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RectF getBox() {
        return this.box;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Polygon getPolygon() {
        return this.polygon;
    }

    public ImageFeature(Builder<?, ? extends ImageFeature<T>, T> builder) {
        super(builder);
        this.box = builder.getBox();
        this.polygon = builder.getPolygon();
    }
}
