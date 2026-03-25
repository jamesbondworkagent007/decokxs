package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class Label extends ImageFeature<String> {
    public static final String FEATURE_TYPE = "Label";
    private final List<RectF> boxes;
    private final List<String> parentLabels;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<RectF> getBoxes() {
        return this.boxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getParentLabels() {
        return this.parentLabels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FEATURE_TYPE;
    }

    private Label(Builder builder) {
        super(builder);
        this.parentLabels = builder.getParentLabels();
        this.boxes = builder.getBoxes();
    }

    public String getName() {
        return getValue();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ImageFeature.Builder<Builder, Label, String> {
        private List<RectF> boxes;
        private List<String> parentLabels;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(@NonNull Object obj) {
            return super.value(obj);
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
            this.parentLabels = new ArrayList();
            this.boxes = new ArrayList();
        }

        public Builder name(@NonNull String str) {
            return (Builder) super.value(str);
        }

        public Builder parentLabels(@NonNull List<String> list) {
            Objects.requireNonNull(list);
            this.parentLabels = list;
            return this;
        }

        public Builder boxes(@NonNull List<RectF> list) {
            Objects.requireNonNull(list);
            this.boxes = list;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Label build() {
            return new Label(this);
        }

        public List<String> getParentLabels() {
            List<String> listOf = Immutable.of(this.parentLabels);
            Objects.requireNonNull(listOf);
            return listOf;
        }

        public List<RectF> getBoxes() {
            List<RectF> listOf = Immutable.of(this.boxes);
            Objects.requireNonNull(listOf);
            return listOf;
        }
    }
}
