package com.okinc.business.defi.wallet.passkey.common.bean;

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
public final class PasskeyWalletAddressBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final int chainType;
    private final boolean hasDeployed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletAddressBean copy$default(PasskeyWalletAddressBean passkeyWalletAddressBean, String str, boolean z, int i, long j, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = passkeyWalletAddressBean.address;
        }
        if ((i2 & 2) != 0) {
            z = passkeyWalletAddressBean.hasDeployed;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = passkeyWalletAddressBean.chainType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = passkeyWalletAddressBean.chainIndex;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            str2 = passkeyWalletAddressBean.chainName;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            str3 = passkeyWalletAddressBean.chainLogo;
        }
        return passkeyWalletAddressBean.copy(str, z2, i3, j2, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasDeployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletAddressBean copy(String str, boolean z, int i, long j, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PasskeyWalletAddressBean(str, z, i, j, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletAddressBean)) {
            return false;
        }
        PasskeyWalletAddressBean passkeyWalletAddressBean = (PasskeyWalletAddressBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) passkeyWalletAddressBean.address) && this.hasDeployed == passkeyWalletAddressBean.hasDeployed && this.chainType == passkeyWalletAddressBean.chainType && this.chainIndex == passkeyWalletAddressBean.chainIndex && Intrinsics.EZpvd((Object) this.chainName, (Object) passkeyWalletAddressBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) passkeyWalletAddressBean.chainLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasDeployed() {
        return this.hasDeployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.hasDeployed)) * 31) + Integer.hashCode(this.chainType)) * 31) + Long.hashCode(this.chainIndex)) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletAddressBean(address=" + this.address + ", hasDeployed=" + this.hasDeployed + ", chainType=" + this.chainType + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAddressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletAddressBean> serializer() {
            return PasskeyWalletAddressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletAddressBean(int i, String str, boolean z, int i2, long j, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (62 != (i & 62)) {
            PluginExceptionsKt.throwMissingFieldException(i, 62, PasskeyWalletAddressBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        this.hasDeployed = z;
        this.chainType = i2;
        this.chainIndex = j;
        this.chainName = str2;
        this.chainLogo = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletAddressBean passkeyWalletAddressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) passkeyWalletAddressBean.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, passkeyWalletAddressBean.address);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, passkeyWalletAddressBean.hasDeployed);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, passkeyWalletAddressBean.chainType);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, passkeyWalletAddressBean.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, passkeyWalletAddressBean.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, passkeyWalletAddressBean.chainLogo);
    }

    public PasskeyWalletAddressBean(String str, boolean z, int i, long j, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.address = str;
        this.hasDeployed = z;
        this.chainType = i;
        this.chainIndex = j;
        this.chainName = str2;
        this.chainLogo = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (r11v0 boolean)
  (r12v0 int)
  (r13v0 long)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
 A[MD:(java.lang.String, boolean, int, long, java.lang.String, java.lang.String):void (m)] (LINE:219) call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAddressBean.<init>(java.lang.String, boolean, int, long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyWalletAddressBean(String str, boolean z, int i, long j, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, z, i, j, str2, str3);
    }
}
