package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsStringProperty implements AnalyticsPropertyBehavior<String> {
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public String getValue() {
        return this.value;
    }

    private AnalyticsStringProperty(String str) {
        this.value = str;
    }

    public static AnalyticsStringProperty from(@NonNull String str) {
        Objects.requireNonNull(str);
        return new AnalyticsStringProperty(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsStringProperty.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getValue(), ((AnalyticsStringProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsStringProperty{value='" + this.value + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
