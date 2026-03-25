package com.amplifyframework.predictions.models;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.Feature;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class BinaryFeature extends Feature<Boolean> {
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return this.type;
    }

    private BinaryFeature(Builder builder) {
        super(builder);
        this.type = builder.getType();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends Feature.Builder<Builder, BinaryFeature, Boolean> {
        private String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(@NonNull Boolean bool) {
            return super.value(bool);
        }

        public Builder type(@NonNull String str) {
            Objects.requireNonNull(str);
            this.type = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BinaryFeature build() {
            return new BinaryFeature(this);
        }

        public String getType() {
            String str = this.type;
            Objects.requireNonNull(str);
            return str;
        }
    }
}
