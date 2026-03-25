package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class EntityMatch extends ImageFeature<String> {
    private EntityMatch(Builder builder) {
        super(builder);
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.ENTITY_MATCH.getAlias();
    }

    public String getExternalImageId() {
        return getValue();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends ImageFeature.Builder<Builder, EntityMatch, String> {
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

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: B */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder externalImageId(@NonNull String str) {
            Objects.requireNonNull(str);
            return (Builder) value(str);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public EntityMatch build() {
            return new EntityMatch(this);
        }
    }
}
