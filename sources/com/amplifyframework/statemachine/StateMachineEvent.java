package com.amplifyframework.statemachine;

import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface StateMachineEvent {
    String getId();

    Date getTime();

    String getType();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static String getId(@NotNull StateMachineEvent stateMachineEvent) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        public static Date getTime(@NotNull StateMachineEvent stateMachineEvent) {
            return new Date();
        }
    }
}
