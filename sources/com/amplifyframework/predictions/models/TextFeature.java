package com.amplifyframework.predictions.models;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.Feature;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public abstract class TextFeature<T> extends Feature<T> {
    private final int length;
    private final int startIndex;
    private final String targetText;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLength() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStartIndex() {
        return this.startIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetText() {
        return this.targetText;
    }

    public TextFeature(Builder<?, ? extends TextFeature<T>, T> builder) {
        super(builder);
        String targetText = builder.getTargetText();
        this.targetText = targetText;
        this.startIndex = builder.getStartIndex();
        this.length = targetText.length();
    }

    public static abstract class Builder<B extends Builder<B, R, T>, R extends TextFeature<T>, T> extends Feature.Builder<B, R, T> {
        private int startIndex;
        private String targetText;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStartIndex() {
            return this.startIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public B startIndex(int i) {
            this.startIndex = i;
            return this;
        }

        public B targetText(@NonNull String str) {
            Objects.requireNonNull(str);
            this.targetText = str;
            return this;
        }

        public final String getTargetText() {
            String str = this.targetText;
            Objects.requireNonNull(str);
            return str;
        }
    }
}
