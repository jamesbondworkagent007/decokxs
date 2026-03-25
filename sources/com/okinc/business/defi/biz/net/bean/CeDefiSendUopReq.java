package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiSendUopReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final int accountType;
    private final Integer signType;
    private final CeDefiSendUopReqSignedMsg signedMsg;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiSendUopReq copy$default(CeDefiSendUopReq ceDefiSendUopReq, Integer num, CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = ceDefiSendUopReq.signType;
        }
        if ((i2 & 2) != 0) {
            ceDefiSendUopReqSignedMsg = ceDefiSendUopReq.signedMsg;
        }
        CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg2 = ceDefiSendUopReqSignedMsg;
        if ((i2 & 4) != 0) {
            str = ceDefiSendUopReq.uopHash;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            i = ceDefiSendUopReq.accountType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = ceDefiSendUopReq.accountId;
        }
        return ceDefiSendUopReq.copy(num, ceDefiSendUopReqSignedMsg2, str3, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSendUopReqSignedMsg component2() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSendUopReq copy(Integer num, @NotNull CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(ceDefiSendUopReqSignedMsg, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CeDefiSendUopReq(num, ceDefiSendUopReqSignedMsg, str, i, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiSendUopReq)) {
            return false;
        }
        CeDefiSendUopReq ceDefiSendUopReq = (CeDefiSendUopReq) obj;
        return Intrinsics.EZpvd(this.signType, ceDefiSendUopReq.signType) && Intrinsics.EZpvd(this.signedMsg, ceDefiSendUopReq.signedMsg) && Intrinsics.EZpvd((Object) this.uopHash, (Object) ceDefiSendUopReq.uopHash) && this.accountType == ceDefiSendUopReq.accountType && Intrinsics.EZpvd((Object) this.accountId, (Object) ceDefiSendUopReq.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSendUopReqSignedMsg getSignedMsg() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.signType;
        int iHashCode = num == null ? 0 : num.hashCode();
        int iHashCode2 = this.signedMsg.hashCode();
        String str = this.uopHash;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.accountType)) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiSendUopReq(signType=" + this.signType + ", signedMsg=" + this.signedMsg + ", uopHash=" + this.uopHash + ", accountType=" + this.accountType + ", accountId=" + this.accountId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiSendUopReq> serializer() {
            return CeDefiSendUopReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiSendUopReq(int i, Integer num, CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CeDefiSendUopReq$$serializer.INSTANCE.getDescriptor());
        }
        this.signType = num;
        this.signedMsg = ceDefiSendUopReqSignedMsg;
        this.uopHash = str;
        this.accountType = i2;
        this.accountId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiSendUopReq ceDefiSendUopReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, ceDefiSendUopReq.signType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE, ceDefiSendUopReq.signedMsg);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ceDefiSendUopReq.uopHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, ceDefiSendUopReq.accountType);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, ceDefiSendUopReq.accountId);
    }

    public CeDefiSendUopReq(Integer num, @NotNull CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, String str, int i, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(ceDefiSendUopReqSignedMsg, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.signType = num;
        this.signedMsg = ceDefiSendUopReqSignedMsg;
        this.uopHash = str;
        this.accountType = i;
        this.accountId = str2;
    }

    @Serializable
    public static final class CeDefiSendUopReqSignedMsg {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final String signature;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CeDefiSendUopReqSignedMsg copy$default(CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ceDefiSendUopReqSignedMsg.address;
            }
            if ((i & 2) != 0) {
                str2 = ceDefiSendUopReqSignedMsg.signature;
            }
            return ceDefiSendUopReqSignedMsg.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CeDefiSendUopReqSignedMsg copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CeDefiSendUopReqSignedMsg(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CeDefiSendUopReqSignedMsg)) {
                return false;
            }
            CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg = (CeDefiSendUopReqSignedMsg) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) ceDefiSendUopReqSignedMsg.address) && Intrinsics.EZpvd((Object) this.signature, (Object) ceDefiSendUopReqSignedMsg.signature);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignature() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.address.hashCode() * 31) + this.signature.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CeDefiSendUopReqSignedMsg(address=" + this.address + ", signature=" + this.signature + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq.CeDefiSendUopReqSignedMsg.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CeDefiSendUopReqSignedMsg> serializer() {
                return CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CeDefiSendUopReqSignedMsg(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CeDefiSendUopReq$CeDefiSendUopReqSignedMsg$$serializer.INSTANCE.getDescriptor());
            }
            this.address = str;
            this.signature = str2;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiSendUopReqSignedMsg ceDefiSendUopReqSignedMsg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiSendUopReqSignedMsg.address);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiSendUopReqSignedMsg.signature);
        }

        public CeDefiSendUopReqSignedMsg(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.address = str;
            this.signature = str2;
        }
    }
}
