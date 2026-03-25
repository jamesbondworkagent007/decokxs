package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.models.Label;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class IdentifyLabelsResult implements IdentifyResult {
    private final List<Label> labels;
    private final boolean unsafeContent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isUnsafeContent() {
        return this.unsafeContent;
    }

    private IdentifyLabelsResult(Builder builder) {
        this.labels = builder.getLabels();
        this.unsafeContent = builder.getUnsafeContent();
    }

    public List<Label> getLabels() {
        return Immutable.of(this.labels);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<Label> labels;
        private boolean unsafeContent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean getUnsafeContent() {
            return this.unsafeContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder unsafeContent(boolean z) {
            this.unsafeContent = z;
            return this;
        }

        private Builder() {
            this.labels = Collections.emptyList();
        }

        public Builder labels(@NonNull List<Label> list) {
            Objects.requireNonNull(list);
            this.labels = list;
            return this;
        }

        public IdentifyLabelsResult build() {
            return new IdentifyLabelsResult(this);
        }

        public List<Label> getLabels() {
            List<Label> list = this.labels;
            Objects.requireNonNull(list);
            return list;
        }
    }
}
