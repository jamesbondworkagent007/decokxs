package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class Table extends ImageFeature<List<Cell>> {
    private final int columnSize;
    private final int rowSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getColumnSize() {
        return this.columnSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getRowSize() {
        return this.rowSize;
    }

    private Table(Builder builder) {
        super(builder);
        this.rowSize = builder.getRowSize();
        this.columnSize = builder.getColumnSize();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.TABLE.getAlias();
    }

    public List<Cell> getCells() {
        return getValue();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ImageFeature.Builder<Builder, Table, List<Cell>> {
        private List<Cell> cells;
        private int columnSize;
        private int rowSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder columnSize(int i) {
            this.columnSize = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getColumnSize() {
            return this.columnSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getRowSize() {
            return this.rowSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder rowSize(int i) {
            this.rowSize = i;
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

        private Builder() {
            this.cells = Collections.emptyList();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: B */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder cells(@NonNull List<Cell> list) {
            return (Builder) value(list);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Table build() {
            return new Table(this);
        }

        public List<Cell> getCells() {
            List<Cell> list = this.cells;
            Objects.requireNonNull(list);
            return list;
        }
    }
}
