package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsDoubleProperty implements AnalyticsPropertyBehavior<Double> {
    private final Double value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Double getValue() {
        return this.value;
    }

    private AnalyticsDoubleProperty(Double d) {
        this.value = d;
    }

    public static AnalyticsDoubleProperty from(@NonNull Double d) {
        Objects.requireNonNull(d);
        return new AnalyticsDoubleProperty(d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsDoubleProperty.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getValue(), ((AnalyticsDoubleProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsDoubleProperty{value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
