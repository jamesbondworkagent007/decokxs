package com.okinc.wallet.core.mpc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class WalletAddressList {
    private List<CoinAddressBean> addressList;
    private long chainId;
    private String pubKey;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(CoinAddressBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletAddressList() {
        this(0L, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.wallet.core.mpc.WalletAddressList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAddressList copy$default(WalletAddressList walletAddressList, long j, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = walletAddressList.chainId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = walletAddressList.pubKey;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = walletAddressList.signature;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = walletAddressList.addressList;
        }
        return walletAddressList.copy(j2, str3, str4, list);
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
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAddressBean> component4() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressList copy(long j, @NotNull String str, @NotNull String str2, @NotNull List<CoinAddressBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WalletAddressList(j, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressList)) {
            return false;
        }
        WalletAddressList walletAddressList = (WalletAddressList) obj;
        return this.chainId == walletAddressList.chainId && Intrinsics.EZpvd((Object) this.pubKey, (Object) walletAddressList.pubKey) && Intrinsics.EZpvd((Object) this.signature, (Object) walletAddressList.signature) && Intrinsics.EZpvd(this.addressList, walletAddressList.addressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAddressBean> getAddressList() {
        return this.addressList;
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
    public int hashCode() {
        return (((((Long.hashCode(this.chainId) * 31) + this.pubKey.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.addressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressList(@NotNull List<CoinAddressBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.addressList = list;
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
    public String toString() {
        return "WalletAddressList(chainId=" + this.chainId + ", pubKey=" + this.pubKey + ", signature=" + this.signature + ", addressList=" + this.addressList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.mpc.WalletAddressList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletAddressList> serializer() {
            return WalletAddressList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletAddressList(int i, long j, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.pubKey = "";
        } else {
            this.pubKey = str;
        }
        if ((i & 4) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
        if ((i & 8) == 0) {
            this.addressList = new ArrayList();
        } else {
            this.addressList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(WalletAddressList walletAddressList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletAddressList.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, walletAddressList.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletAddressList.pubKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletAddressList.pubKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletAddressList.signature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, walletAddressList.signature);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(walletAddressList.addressList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], walletAddressList.addressList);
    }

    public WalletAddressList(long j, @NotNull String str, @NotNull String str2, @NotNull List<CoinAddressBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = j;
        this.pubKey = str;
        this.signature = str2;
        this.addressList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r7v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001d: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:98) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r11v0 java.util.List))
 A[MD:(long, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.mpc.CoinAddressBean>):void (m)] (LINE:94) call: com.okinc.wallet.core.mpc.WalletAddressList.<init>(long, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WalletAddressList(long j, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new ArrayList() : list);
    }
}
