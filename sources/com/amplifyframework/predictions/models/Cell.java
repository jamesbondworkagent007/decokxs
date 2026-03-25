package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;

/* JADX INFO: loaded from: classes21.dex */
public final class Cell extends ImageFeature<String> {
    private final int column;
    private final int row;
    private final boolean selected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getColumn() {
        return this.column;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getRow() {
        return this.row;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSelected() {
        return this.selected;
    }

    private Cell(Builder builder) {
        super(builder);
        this.selected = builder.getSelected();
        this.row = builder.getRow();
        this.column = builder.getColumn();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.CELL.getAlias();
    }

    public String getText() {
        return getValue();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ImageFeature.Builder<Builder, Cell, String> {
        private int column;
        private int row;
        private boolean selected;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder column(int i) {
            this.column = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getColumn() {
            return this.column;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getRow() {
            return this.row;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getSelected() {
            return this.selected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder row(int i) {
            this.row = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder selected(boolean z) {
            this.selected = z;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(@Nullable RectF rectF) {
            return super.box(rectF);
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(@Nullable Polygon polygon) {
            return super.polygon(polygon);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: B */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder text(@NonNull String str) {
            return (Builder) value(str);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Cell build() {
            return new Cell(this);
        }
    }
}
