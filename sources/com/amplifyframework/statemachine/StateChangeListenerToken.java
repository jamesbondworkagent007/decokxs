package com.amplifyframework.statemachine;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StateChangeListenerToken {
    private final UUID uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UUID getUuid() {
        return this.uuid;
    }

    private StateChangeListenerToken(UUID uuid) {
        this.uuid = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StateChangeListenerToken() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "");
        this(uuidRandomUUID);
    }

    public boolean equals(Object obj) {
        return (obj instanceof StateChangeListenerToken) && Intrinsics.EZpvd(((StateChangeListenerToken) obj).uuid, this.uuid);
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }
}
