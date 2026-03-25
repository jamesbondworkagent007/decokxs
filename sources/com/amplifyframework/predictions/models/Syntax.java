package com.amplifyframework.predictions.models;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.TextFeature;

/* JADX INFO: loaded from: classes14.dex */
public final class Syntax extends TextFeature<SpeechType> {
    private Syntax(Builder builder) {
        super(builder);
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.SYNTAX.getAlias();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends TextFeature.Builder<Builder, Syntax, SpeechType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder id(@NonNull String str) {
            return super.id(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.TextFeature.Builder
        public /* bridge */ /* synthetic */ TextFeature.Builder startIndex(int i) {
            return super.startIndex(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.TextFeature.Builder
        public /* bridge */ /* synthetic */ TextFeature.Builder targetText(@NonNull String str) {
            return super.targetText(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(@NonNull Object obj) {
            return super.value(obj);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/models/Feature; */
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Syntax build() {
            return new Syntax(this);
        }
    }
}
