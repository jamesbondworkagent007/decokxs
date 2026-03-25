package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public final class Selection {
    private final RectF box;
    private final Polygon polygon;
    private final boolean selected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RectF getBox() {
        return this.box;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Polygon getPolygon() {
        return this.polygon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSelected() {
        return this.selected;
    }

    private Selection(RectF rectF, Polygon polygon, boolean z) {
        this.box = rectF;
        this.polygon = polygon;
        this.selected = z;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private RectF box;
        private Polygon polygon;
        private boolean selected;

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
        public boolean isSelected() {
            return this.selected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder polygon(@Nullable Polygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder selected(boolean z) {
            this.selected = z;
            return this;
        }

        public Selection build() {
            return new Selection(this.box, this.polygon, this.selected);
        }
    }
}
