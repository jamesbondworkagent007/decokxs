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
public final class BTCSpeedUpFeeRateReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long coinId;
    private final String txHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BTCSpeedUpFeeRateReq copy$default(BTCSpeedUpFeeRateReq bTCSpeedUpFeeRateReq, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bTCSpeedUpFeeRateReq.coinId;
        }
        if ((i & 2) != 0) {
            str = bTCSpeedUpFeeRateReq.address;
        }
        if ((i & 4) != 0) {
            str2 = bTCSpeedUpFeeRateReq.txHash;
        }
        return bTCSpeedUpFeeRateReq.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCSpeedUpFeeRateReq copy(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BTCSpeedUpFeeRateReq(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BTCSpeedUpFeeRateReq)) {
            return false;
        }
        BTCSpeedUpFeeRateReq bTCSpeedUpFeeRateReq = (BTCSpeedUpFeeRateReq) obj;
        return this.coinId == bTCSpeedUpFeeRateReq.coinId && Intrinsics.EZpvd((Object) this.address, (Object) bTCSpeedUpFeeRateReq.address) && Intrinsics.EZpvd((Object) this.txHash, (Object) bTCSpeedUpFeeRateReq.txHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.coinId) * 31) + this.address.hashCode()) * 31) + this.txHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCSpeedUpFeeRateReq(coinId=" + this.coinId + ", address=" + this.address + ", txHash=" + this.txHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BTCSpeedUpFeeRateReq> serializer() {
            return BTCSpeedUpFeeRateReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BTCSpeedUpFeeRateReq(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BTCSpeedUpFeeRateReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.address = str;
        this.txHash = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BTCSpeedUpFeeRateReq bTCSpeedUpFeeRateReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, bTCSpeedUpFeeRateReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bTCSpeedUpFeeRateReq.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bTCSpeedUpFeeRateReq.txHash);
    }

    public BTCSpeedUpFeeRateReq(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coinId = j;
        this.address = str;
        this.txHash = str2;
    }
}
