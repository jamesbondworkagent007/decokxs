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
public final class CheckAddressReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long coinId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckAddressReq copy$default(CheckAddressReq checkAddressReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkAddressReq.coinId;
        }
        if ((i & 2) != 0) {
            str = checkAddressReq.address;
        }
        return checkAddressReq.copy(j, str);
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
    public final CheckAddressReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckAddressReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAddressReq)) {
            return false;
        }
        CheckAddressReq checkAddressReq = (CheckAddressReq) obj;
        return this.coinId == checkAddressReq.coinId && Intrinsics.EZpvd((Object) this.address, (Object) checkAddressReq.address);
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
    public int hashCode() {
        return (Long.hashCode(this.coinId) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckAddressReq(coinId=" + this.coinId + ", address=" + this.address + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckAddressReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckAddressReq> serializer() {
            return CheckAddressReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckAddressReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CheckAddressReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.address = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckAddressReq checkAddressReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, checkAddressReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, checkAddressReq.address);
    }

    public CheckAddressReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = j;
        this.address = str;
    }
}
