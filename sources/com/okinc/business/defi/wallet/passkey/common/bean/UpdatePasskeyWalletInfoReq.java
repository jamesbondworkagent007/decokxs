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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class UpdatePasskeyWalletInfoReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int accountType;
    private final String chainIndex;
    private final Boolean enableLimitOrder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdatePasskeyWalletInfoReq copy$default(UpdatePasskeyWalletInfoReq updatePasskeyWalletInfoReq, int i, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updatePasskeyWalletInfoReq.accountType;
        }
        if ((i2 & 2) != 0) {
            str = updatePasskeyWalletInfoReq.chainIndex;
        }
        if ((i2 & 4) != 0) {
            bool = updatePasskeyWalletInfoReq.enableLimitOrder;
        }
        return updatePasskeyWalletInfoReq.copy(i, str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.enableLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdatePasskeyWalletInfoReq copy(int i, @NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdatePasskeyWalletInfoReq(i, str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePasskeyWalletInfoReq)) {
            return false;
        }
        UpdatePasskeyWalletInfoReq updatePasskeyWalletInfoReq = (UpdatePasskeyWalletInfoReq) obj;
        return this.accountType == updatePasskeyWalletInfoReq.accountType && Intrinsics.EZpvd((Object) this.chainIndex, (Object) updatePasskeyWalletInfoReq.chainIndex) && Intrinsics.EZpvd(this.enableLimitOrder, updatePasskeyWalletInfoReq.enableLimitOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableLimitOrder() {
        return this.enableLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.accountType);
        int iHashCode2 = this.chainIndex.hashCode();
        Boolean bool = this.enableLimitOrder;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdatePasskeyWalletInfoReq(accountType=" + this.accountType + ", chainIndex=" + this.chainIndex + ", enableLimitOrder=" + this.enableLimitOrder + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.UpdatePasskeyWalletInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdatePasskeyWalletInfoReq> serializer() {
            return UpdatePasskeyWalletInfoReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdatePasskeyWalletInfoReq(int i, int i2, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, UpdatePasskeyWalletInfoReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accountType = 2;
        } else {
            this.accountType = i2;
        }
        this.chainIndex = str;
        if ((i & 4) == 0) {
            this.enableLimitOrder = null;
        } else {
            this.enableLimitOrder = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UpdatePasskeyWalletInfoReq updatePasskeyWalletInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || updatePasskeyWalletInfoReq.accountType != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, updatePasskeyWalletInfoReq.accountType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, updatePasskeyWalletInfoReq.chainIndex);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && updatePasskeyWalletInfoReq.enableLimitOrder == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, updatePasskeyWalletInfoReq.enableLimitOrder);
    }

    public UpdatePasskeyWalletInfoReq(int i, @NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountType = i;
        this.chainIndex = str;
        this.enableLimitOrder = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r1v0 int))
  (r2v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(int, java.lang.String, java.lang.Boolean):void (m)] (LINE:96) call: com.okinc.business.defi.wallet.passkey.common.bean.UpdatePasskeyWalletInfoReq.<init>(int, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ UpdatePasskeyWalletInfoReq(int i, String str, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, str, (i2 & 4) != 0 ? null : bool);
    }
}
