package com.okinc.business.defi.wallet.passkey.common.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PasskeyWalletCheckRecoverRes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean allowRecovery;
    private final boolean existRecoveryFlow;
    private final boolean hasActiveLimitOrder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletCheckRecoverRes copy$default(PasskeyWalletCheckRecoverRes passkeyWalletCheckRecoverRes, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyWalletCheckRecoverRes.allowRecovery;
        }
        if ((i & 2) != 0) {
            z2 = passkeyWalletCheckRecoverRes.existRecoveryFlow;
        }
        if ((i & 4) != 0) {
            z3 = passkeyWalletCheckRecoverRes.hasActiveLimitOrder;
        }
        return passkeyWalletCheckRecoverRes.copy(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.allowRecovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.existRecoveryFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasActiveLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletCheckRecoverRes copy(boolean z, boolean z2, boolean z3) {
        return new PasskeyWalletCheckRecoverRes(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletCheckRecoverRes)) {
            return false;
        }
        PasskeyWalletCheckRecoverRes passkeyWalletCheckRecoverRes = (PasskeyWalletCheckRecoverRes) obj;
        return this.allowRecovery == passkeyWalletCheckRecoverRes.allowRecovery && this.existRecoveryFlow == passkeyWalletCheckRecoverRes.existRecoveryFlow && this.hasActiveLimitOrder == passkeyWalletCheckRecoverRes.hasActiveLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowRecovery() {
        return this.allowRecovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExistRecoveryFlow() {
        return this.existRecoveryFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasActiveLimitOrder() {
        return this.hasActiveLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.allowRecovery) * 31) + Boolean.hashCode(this.existRecoveryFlow)) * 31) + Boolean.hashCode(this.hasActiveLimitOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletCheckRecoverRes(allowRecovery=" + this.allowRecovery + ", existRecoveryFlow=" + this.existRecoveryFlow + ", hasActiveLimitOrder=" + this.hasActiveLimitOrder + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCheckRecoverRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletCheckRecoverRes> serializer() {
            return PasskeyWalletCheckRecoverRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletCheckRecoverRes(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PasskeyWalletCheckRecoverRes$$serializer.INSTANCE.getDescriptor());
        }
        this.allowRecovery = z;
        this.existRecoveryFlow = z2;
        this.hasActiveLimitOrder = z3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletCheckRecoverRes passkeyWalletCheckRecoverRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, passkeyWalletCheckRecoverRes.allowRecovery);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, passkeyWalletCheckRecoverRes.existRecoveryFlow);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, passkeyWalletCheckRecoverRes.hasActiveLimitOrder);
    }

    public PasskeyWalletCheckRecoverRes(boolean z, boolean z2, boolean z3) {
        this.allowRecovery = z;
        this.existRecoveryFlow = z2;
        this.hasActiveLimitOrder = z3;
    }
}
