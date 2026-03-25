package com.amplifyframework.predictions.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Feature<T> implements Comparable<Feature<T>> {
    private final float confidence;
    private final String id;
    private final T value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getConfidence() {
        return this.confidence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    public abstract String getTypeAlias();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getValue() {
        return this.value;
    }

    public Feature(Builder<?, ? extends Feature<T>, T> builder) {
        this.id = builder.getId();
        this.value = builder.getValue();
        this.confidence = builder.getConfidence();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(@Nullable Feature<T> feature) {
        if (feature == null) {
            return -1;
        }
        int iCompareToIgnoreCase = getTypeAlias().compareToIgnoreCase(feature.getTypeAlias());
        return iCompareToIgnoreCase != 0 ? iCompareToIgnoreCase : (int) Math.signum(getConfidence() - feature.getConfidence());
    }

    public static abstract class Builder<B extends Builder<B, R, T>, R extends Feature<T>, T> {
        private float confidence;
        private String id = UUID.randomUUID().toString();
        private T value;

        public abstract R build();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public B confidence(float f) {
            this.confidence = f;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getConfidence() {
            return this.confidence;
        }

        public B id(@NonNull String str) {
            Objects.requireNonNull(str);
            this.id = str;
            return this;
        }

        public B value(@NonNull T t) {
            Objects.requireNonNull(t);
            this.value = t;
            return this;
        }

        public final String getId() {
            String str = this.id;
            Objects.requireNonNull(str);
            return str;
        }

        public final T getValue() {
            T t = this.value;
            Objects.requireNonNull(t);
            return t;
        }
    }
}
