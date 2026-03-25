package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiCreateUopReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String orderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiCreateUopReq copy$default(CeDefiCreateUopReq ceDefiCreateUopReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ceDefiCreateUopReq.orderId;
        }
        if ((i & 2) != 0) {
            str2 = ceDefiCreateUopReq.accountId;
        }
        return ceDefiCreateUopReq.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiCreateUopReq copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CeDefiCreateUopReq(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiCreateUopReq)) {
            return false;
        }
        CeDefiCreateUopReq ceDefiCreateUopReq = (CeDefiCreateUopReq) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) ceDefiCreateUopReq.orderId) && Intrinsics.EZpvd((Object) this.accountId, (Object) ceDefiCreateUopReq.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiCreateUopReq(orderId=" + this.orderId + ", accountId=" + this.accountId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiCreateUopReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiCreateUopReq> serializer() {
            return CeDefiCreateUopReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiCreateUopReq(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CeDefiCreateUopReq$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.accountId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiCreateUopReq ceDefiCreateUopReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiCreateUopReq.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiCreateUopReq.accountId);
    }

    public CeDefiCreateUopReq(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.accountId = str2;
    }
}
