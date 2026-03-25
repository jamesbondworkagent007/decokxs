package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.analytics.AnalyticsProperties;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsEvent implements AnalyticsEventBehavior {
    private final String name;
    private final AnalyticsProperties properties;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.analytics.AnalyticsEventBehavior
    public AnalyticsProperties getProperties() {
        return this.properties;
    }

    private AnalyticsEvent(String str, AnalyticsProperties analyticsProperties) {
        this.name = str;
        this.properties = analyticsProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsEvent.class != obj.getClass()) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (ObjectsCompat.equals(getName(), analyticsEvent.getName())) {
            return ObjectsCompat.equals(getProperties(), analyticsEvent.getProperties());
        }
        return false;
    }

    public int hashCode() {
        return (getName().hashCode() * 31) + getProperties().hashCode();
    }

    public String toString() {
        return "AnalyticsEvent{name='" + this.name + "', properties=" + this.properties + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class Builder {
        private String name;
        private AnalyticsProperties.Builder propertiesBuilder;

        private Builder() {
            this.propertiesBuilder = AnalyticsProperties.builder();
        }

        public Builder name(@NonNull String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder addProperty(@NonNull String str, @NonNull String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            this.propertiesBuilder.add(str, str2);
            return this;
        }

        public Builder addProperty(@NonNull String str, @NonNull Double d) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(d);
            this.propertiesBuilder.add(str, d);
            return this;
        }

        public Builder addProperty(@NonNull String str, @NonNull Boolean bool) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(bool);
            this.propertiesBuilder.add(str, bool);
            return this;
        }

        public Builder addProperty(@NonNull String str, @NonNull Integer num) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(num);
            this.propertiesBuilder.add(str, num);
            return this;
        }

        public AnalyticsEvent build() {
            return new AnalyticsEvent(this.name, this.propertiesBuilder.build());
        }
    }
}
