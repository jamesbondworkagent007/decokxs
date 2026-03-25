package com.okinc.business.web3pay.lib.features.account.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class KycNameAndUid {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String maskedName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KycNameAndUid copy$default(KycNameAndUid kycNameAndUid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycNameAndUid.maskedName;
        }
        return kycNameAndUid.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maskedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycNameAndUid copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new KycNameAndUid(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycNameAndUid) && Intrinsics.EZpvd((Object) this.maskedName, (Object) ((KycNameAndUid) obj).maskedName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedName() {
        return this.maskedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.maskedName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KycNameAndUid(maskedName=" + this.maskedName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.data.model.KycNameAndUid.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KycNameAndUid> serializer() {
            return KycNameAndUid$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KycNameAndUid(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, KycNameAndUid$$serializer.INSTANCE.getDescriptor());
        }
        this.maskedName = str;
    }

    public KycNameAndUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maskedName = str;
    }
}
