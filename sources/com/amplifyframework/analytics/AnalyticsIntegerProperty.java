package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AnalyticsIntegerProperty implements AnalyticsPropertyBehavior<Integer> {
    private final Integer value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Integer getValue() {
        return this.value;
    }

    private AnalyticsIntegerProperty(Integer num) {
        this.value = num;
    }

    public static AnalyticsIntegerProperty from(@NonNull Integer num) {
        Objects.requireNonNull(num);
        return new AnalyticsIntegerProperty(num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsIntegerProperty.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getValue(), ((AnalyticsIntegerProperty) obj).getValue());
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsIntegerProperty{value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}
