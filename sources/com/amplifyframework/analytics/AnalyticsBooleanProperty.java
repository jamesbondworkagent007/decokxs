package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsBooleanProperty implements AnalyticsPropertyBehavior<Boolean> {
    private final Boolean value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Boolean getValue() {
        return this.value;
    }

    private AnalyticsBooleanProperty(Boolean bool) {
        this.value = bool;
    }

    public static AnalyticsBooleanProperty from(@NonNull Boolean bool) {
        Objects.requireNonNull(bool);
        return new AnalyticsBooleanProperty(bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsBooleanProperty.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getValue(), ((AnalyticsBooleanProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsBooleanProperty{value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
