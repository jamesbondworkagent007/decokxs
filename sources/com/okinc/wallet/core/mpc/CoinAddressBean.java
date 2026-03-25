package com.okinc.wallet.core.mpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CoinAddressBean {
    private String address;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinAddressBean() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinAddressBean copy$default(CoinAddressBean coinAddressBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = coinAddressBean.address;
        }
        if ((i2 & 2) != 0) {
            i = coinAddressBean.type;
        }
        return coinAddressBean.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinAddressBean copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CoinAddressBean(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinAddressBean)) {
            return false;
        }
        CoinAddressBean coinAddressBean = (CoinAddressBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) coinAddressBean.address) && this.type == coinAddressBean.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.address.hashCode() * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinAddressBean(address=" + this.address + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.mpc.CoinAddressBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinAddressBean> serializer() {
            return CoinAddressBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinAddressBean(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.address = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.type = 1;
        } else {
            this.type = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CoinAddressBean coinAddressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinAddressBean.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinAddressBean.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && coinAddressBean.type == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, coinAddressBean.type);
    }

    public CoinAddressBean(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:87) call: com.okinc.wallet.core.mpc.CoinAddressBean.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ CoinAddressBean(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i);
    }
}
