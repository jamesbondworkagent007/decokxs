package com.okinc.oklive.app.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSUnpinMessageModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long messageSeq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSUnpinMessageModel copy$default(WSUnpinMessageModel wSUnpinMessageModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wSUnpinMessageModel.messageSeq;
        }
        return wSUnpinMessageModel.copy(j);
    }

    @SerialName("messageSeq")
    public static /* synthetic */ void getMessageSeq$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.messageSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSUnpinMessageModel copy(long j) {
        return new WSUnpinMessageModel(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSUnpinMessageModel) && this.messageSeq == ((WSUnpinMessageModel) obj).messageSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMessageSeq() {
        return this.messageSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.messageSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSUnpinMessageModel(messageSeq=" + this.messageSeq + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.WSUnpinMessageModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSUnpinMessageModel> serializer() {
            return WSUnpinMessageModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSUnpinMessageModel(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WSUnpinMessageModel$$serializer.INSTANCE.getDescriptor());
        }
        this.messageSeq = j;
    }

    public WSUnpinMessageModel(long j) {
        this.messageSeq = j;
    }
}
