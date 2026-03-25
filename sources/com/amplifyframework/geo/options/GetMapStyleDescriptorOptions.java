package com.amplifyframework.geo.options;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class GetMapStyleDescriptorOptions {
    private final String mapName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMapName() {
        return this.mapName;
    }

    private GetMapStyleDescriptorOptions(Builder builder) {
        this.mapName = builder.mapName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMapStyleDescriptorOptions defaults() {
        return builder().build();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private String mapName;

        private Builder() {
        }

        public Builder mapName(@NonNull String str) {
            Objects.requireNonNull(str);
            this.mapName = str;
            return this;
        }

        public GetMapStyleDescriptorOptions build() {
            return new GetMapStyleDescriptorOptions(this);
        }
    }
}
