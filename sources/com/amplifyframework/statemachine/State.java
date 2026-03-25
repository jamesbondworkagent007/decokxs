package com.amplifyframework.statemachine;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface State {
    boolean equals(Object obj);

    String getType();

    int hashCode();

    String toString();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static String getType(@NotNull State state) {
            String simpleName = state.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            return simpleName;
        }
    }
}
