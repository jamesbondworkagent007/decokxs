package com.reown.android.internal.common.model;

import com.reown.foundation.common.model.PublicKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Participants {
    public final String receiverPublicKey;
    public final String senderPublicKey;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (m)] call: com.reown.android.internal.common.model.Participants.<init>(java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Participants(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-V_lFtQw$default, reason: not valid java name */
    public static /* synthetic */ Participants m7232copyV_lFtQw$default(Participants participants, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participants.senderPublicKey;
        }
        if ((i & 2) != 0) {
            str2 = participants.receiverPublicKey;
        }
        return participants.m7235copyV_lFtQw(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component1-uN_RPug, reason: not valid java name */
    public final String m7233component1uN_RPug() {
        return this.senderPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component2-uN_RPug, reason: not valid java name */
    public final String m7234component2uN_RPug() {
        return this.receiverPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-V_lFtQw, reason: not valid java name */
    public final Participants m7235copyV_lFtQw(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Participants(str, str2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participants)) {
            return false;
        }
        Participants participants = (Participants) obj;
        return PublicKey.m7319equalsimpl0(this.senderPublicKey, participants.senderPublicKey) && PublicKey.m7319equalsimpl0(this.receiverPublicKey, participants.receiverPublicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getReceiverPublicKey-uN_RPug, reason: not valid java name */
    public final String m7236getReceiverPublicKeyuN_RPug() {
        return this.receiverPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getSenderPublicKey-uN_RPug, reason: not valid java name */
    public final String m7237getSenderPublicKeyuN_RPug() {
        return this.senderPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (PublicKey.m7321hashCodeimpl(this.senderPublicKey) * 31) + PublicKey.m7321hashCodeimpl(this.receiverPublicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Participants(senderPublicKey=" + PublicKey.m7322toStringimpl(this.senderPublicKey) + ", receiverPublicKey=" + PublicKey.m7322toStringimpl(this.receiverPublicKey) + ")";
    }

    public Participants(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.senderPublicKey = str;
        this.receiverPublicKey = str2;
    }
}
