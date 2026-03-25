package com.okinc.business.defi.biz.model;

import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletAddressItem {
    private String address;
    private long chainId;
    private String pubKey;
    private String signature;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAddressItem() {
        this(0L, (String) null, (String) null, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletAddressItem copy$default(WalletAddressItem walletAddressItem, long j, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = walletAddressItem.chainId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = walletAddressItem.pubKey;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = walletAddressItem.address;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = walletAddressItem.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = walletAddressItem.signature;
        }
        return walletAddressItem.copy(j2, str4, str5, i3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressItem copy(long j, @NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new WalletAddressItem(j, str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressItem)) {
            return false;
        }
        WalletAddressItem walletAddressItem = (WalletAddressItem) obj;
        return this.chainId == walletAddressItem.chainId && Intrinsics.EZpvd((Object) this.pubKey, (Object) walletAddressItem.pubKey) && Intrinsics.EZpvd((Object) this.address, (Object) walletAddressItem.address) && this.type == walletAddressItem.type && Intrinsics.EZpvd((Object) this.signature, (Object) walletAddressItem.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.chainId) * 31) + this.pubKey.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletAddressItem(chainId=" + this.chainId + ", pubKey=" + this.pubKey + ", address=" + this.address + ", type=" + this.type + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.WalletAddressItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddressItem> serializer() {
            return WalletAddressItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAddressItem(int i, long j, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.pubKey = "";
        } else {
            this.pubKey = str;
        }
        if ((i & 4) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i & 8) == 0) {
            this.type = AddressType.Legacy.getValue();
        } else {
            this.type = i2;
        }
        if ((i & 16) == 0) {
            this.signature = "";
        } else {
            this.signature = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletAddressItem walletAddressItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletAddressItem.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, walletAddressItem.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletAddressItem.pubKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletAddressItem.pubKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletAddressItem.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, walletAddressItem.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletAddressItem.type != AddressType.Legacy.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, walletAddressItem.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) walletAddressItem.signature, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, walletAddressItem.signature);
    }

    public WalletAddressItem(long j, @NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = j;
        this.pubKey = str;
        this.address = str2;
        this.type = i;
        this.signature = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:0x0021: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x001d: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x001b: SGET  A[WRAPPED] (LINE:245) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:245)) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:241) call: com.okinc.business.defi.biz.model.WalletAddressItem.<init>(long, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ WalletAddressItem(long j, String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? AddressType.Legacy.getValue() : i, (i2 & 16) != 0 ? "" : str3);
    }
}
