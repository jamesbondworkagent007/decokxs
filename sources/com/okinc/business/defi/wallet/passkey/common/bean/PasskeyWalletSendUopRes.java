package com.okinc.business.defi.wallet.passkey.common.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PasskeyWalletSendUopRes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String orderId;
    private final Boolean skipOnChain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletSendUopRes copy$default(PasskeyWalletSendUopRes passkeyWalletSendUopRes, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyWalletSendUopRes.orderId;
        }
        if ((i & 2) != 0) {
            bool = passkeyWalletSendUopRes.skipOnChain;
        }
        return passkeyWalletSendUopRes.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.skipOnChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletSendUopRes copy(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyWalletSendUopRes(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletSendUopRes)) {
            return false;
        }
        PasskeyWalletSendUopRes passkeyWalletSendUopRes = (PasskeyWalletSendUopRes) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) passkeyWalletSendUopRes.orderId) && Intrinsics.EZpvd(this.skipOnChain, passkeyWalletSendUopRes.skipOnChain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSkipOnChain() {
        return this.skipOnChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        Boolean bool = this.skipOnChain;
        return (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletSendUopRes(orderId=" + this.orderId + ", skipOnChain=" + this.skipOnChain + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletSendUopRes> serializer() {
            return PasskeyWalletSendUopRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletSendUopRes(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyWalletSendUopRes$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        if ((i & 2) == 0) {
            this.skipOnChain = Boolean.FALSE;
        } else {
            this.skipOnChain = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletSendUopRes passkeyWalletSendUopRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyWalletSendUopRes.orderId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(passkeyWalletSendUopRes.skipOnChain, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, passkeyWalletSendUopRes.skipOnChain);
    }

    public PasskeyWalletSendUopRes(@NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
        this.skipOnChain = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r2v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean):void (m)] (LINE:168) call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes.<init>(java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PasskeyWalletSendUopRes(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
