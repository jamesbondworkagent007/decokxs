package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class BoundedKeyValue extends ImageFeature<Pair<String, String>> {
    private BoundedKeyValue(Builder builder) {
        super(builder);
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.BOUNDED_KEY_VALUE.getAlias();
    }

    public String getKey() {
        return getValue().first;
    }

    public String getKeyValue() {
        return getValue().second;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ImageFeature.Builder<Builder, BoundedKeyValue, Pair<String, String>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(@Nullable RectF rectF) {
            return super.box(rectF);
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(@Nullable Polygon polygon) {
            return super.polygon(polygon);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: B */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder keyValuePair(@NonNull String str, @NonNull String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            return (Builder) value(Pair.create(str, str2));
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BoundedKeyValue build() {
            Objects.requireNonNull(getValue());
            Objects.requireNonNull(getValue().first);
            Objects.requireNonNull(getValue().second);
            return new BoundedKeyValue(this);
        }
    }
}
