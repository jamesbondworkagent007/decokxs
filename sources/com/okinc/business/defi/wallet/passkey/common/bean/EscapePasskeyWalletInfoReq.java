package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class EscapePasskeyWalletInfoReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int accountType;
    private final boolean boundWeb3Wallet;
    private final String chainIndex;
    private final String escapeAddress;
    private final String web3WalletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapePasskeyWalletInfoReq copy$default(EscapePasskeyWalletInfoReq escapePasskeyWalletInfoReq, int i, String str, String str2, boolean z, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = escapePasskeyWalletInfoReq.accountType;
        }
        if ((i2 & 2) != 0) {
            str = escapePasskeyWalletInfoReq.escapeAddress;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = escapePasskeyWalletInfoReq.chainIndex;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            z = escapePasskeyWalletInfoReq.boundWeb3Wallet;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str3 = escapePasskeyWalletInfoReq.web3WalletId;
        }
        return escapePasskeyWalletInfoReq.copy(i, str4, str5, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.escapeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.boundWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.web3WalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapePasskeyWalletInfoReq copy(int i, @NotNull String str, @NotNull String str2, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EscapePasskeyWalletInfoReq(i, str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EscapePasskeyWalletInfoReq)) {
            return false;
        }
        EscapePasskeyWalletInfoReq escapePasskeyWalletInfoReq = (EscapePasskeyWalletInfoReq) obj;
        return this.accountType == escapePasskeyWalletInfoReq.accountType && Intrinsics.EZpvd((Object) this.escapeAddress, (Object) escapePasskeyWalletInfoReq.escapeAddress) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) escapePasskeyWalletInfoReq.chainIndex) && this.boundWeb3Wallet == escapePasskeyWalletInfoReq.boundWeb3Wallet && Intrinsics.EZpvd((Object) this.web3WalletId, (Object) escapePasskeyWalletInfoReq.web3WalletId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBoundWeb3Wallet() {
        return this.boundWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeAddress() {
        return this.escapeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeb3WalletId() {
        return this.web3WalletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.accountType);
        int iHashCode2 = this.escapeAddress.hashCode();
        int iHashCode3 = this.chainIndex.hashCode();
        int iHashCode4 = Boolean.hashCode(this.boundWeb3Wallet);
        String str = this.web3WalletId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapePasskeyWalletInfoReq(accountType=" + this.accountType + ", escapeAddress=" + this.escapeAddress + ", chainIndex=" + this.chainIndex + ", boundWeb3Wallet=" + this.boundWeb3Wallet + ", web3WalletId=" + this.web3WalletId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.EscapePasskeyWalletInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapePasskeyWalletInfoReq> serializer() {
            return EscapePasskeyWalletInfoReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapePasskeyWalletInfoReq(int i, int i2, String str, String str2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, EscapePasskeyWalletInfoReq$$serializer.INSTANCE.getDescriptor());
        }
        this.accountType = (i & 1) == 0 ? AccountType.CeDeFi.getValue() : i2;
        this.escapeAddress = str;
        this.chainIndex = str2;
        this.boundWeb3Wallet = z;
        if ((i & 16) == 0) {
            this.web3WalletId = null;
        } else {
            this.web3WalletId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapePasskeyWalletInfoReq escapePasskeyWalletInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || escapePasskeyWalletInfoReq.accountType != AccountType.CeDeFi.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, escapePasskeyWalletInfoReq.accountType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, escapePasskeyWalletInfoReq.escapeAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, escapePasskeyWalletInfoReq.chainIndex);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, escapePasskeyWalletInfoReq.boundWeb3Wallet);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && escapePasskeyWalletInfoReq.web3WalletId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, escapePasskeyWalletInfoReq.web3WalletId);
    }

    public EscapePasskeyWalletInfoReq(int i, @NotNull String str, @NotNull String str2, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountType = i;
        this.escapeAddress = str;
        this.chainIndex = str2;
        this.boundWeb3Wallet = z;
        this.web3WalletId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE 
  (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType:0x0004: SGET  A[WRAPPED] (LINE:105) com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType.CeDeFi com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType)
 VIRTUAL call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType.getValue():int A[MD:():int (m), WRAPPED] (LINE:105)) : (r7v0 int))
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:104) call: com.okinc.business.defi.wallet.passkey.common.bean.EscapePasskeyWalletInfoReq.<init>(int, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ EscapePasskeyWalletInfoReq(int i, String str, String str2, boolean z, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AccountType.CeDeFi.getValue() : i, str, str2, z, (i2 & 16) != 0 ? null : str3);
    }
}
