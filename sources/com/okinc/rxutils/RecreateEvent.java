package com.okinc.rxutils;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecreateEvent implements RxBus.Application {
    public static final int $stable = 0;
    private final RecreateType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecreateEvent copy$default(RecreateEvent recreateEvent, RecreateType recreateType, int i, Object obj) {
        if ((i & 1) != 0) {
            recreateType = recreateEvent.type;
        }
        return recreateEvent.copy(recreateType);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecreateType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecreateEvent copy(@NotNull RecreateType recreateType) {
        Intrinsics.checkNotNullParameter(recreateType, "");
        return new RecreateEvent(recreateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecreateEvent) && this.type == ((RecreateEvent) obj).type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecreateType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecreateEvent(type=" + this.type + ")";
    }

    public RecreateEvent(@NotNull RecreateType recreateType) {
        Intrinsics.checkNotNullParameter(recreateType, "");
        this.type = recreateType;
    }
}
