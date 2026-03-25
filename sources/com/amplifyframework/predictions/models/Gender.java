package com.amplifyframework.predictions.models;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes14.dex */
public final class Gender extends Feature<GenderBinaryType> {
    private Gender(Builder builder) {
        super(builder);
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.GENDER.getAlias();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends Feature.Builder<Builder, Gender, GenderBinaryType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(@NonNull GenderBinaryType genderBinaryType) {
            return super.value(genderBinaryType);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Gender build() {
            return new Gender(this);
        }
    }
}
