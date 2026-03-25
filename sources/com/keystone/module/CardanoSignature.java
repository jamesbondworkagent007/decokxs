package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CardanoSignature {
    private final String requestId;
    private final String witnessSet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardanoSignature copy$default(CardanoSignature cardanoSignature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoSignature.requestId;
        }
        if ((i & 2) != 0) {
            str2 = cardanoSignature.witnessSet;
        }
        return cardanoSignature.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.witnessSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoSignature copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CardanoSignature(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardanoSignature)) {
            return false;
        }
        CardanoSignature cardanoSignature = (CardanoSignature) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) cardanoSignature.requestId) && Intrinsics.EZpvd((Object) this.witnessSet, (Object) cardanoSignature.witnessSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWitnessSet() {
        return this.witnessSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.requestId.hashCode() * 31) + this.witnessSet.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoSignature(requestId=" + this.requestId + ", witnessSet=" + this.witnessSet + ')';
    }

    public CardanoSignature(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.requestId = str;
        this.witnessSet = str2;
    }
}
