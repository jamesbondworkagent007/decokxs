package com.okinc.business.defi.wallet.common.okxconnect.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppInfo {
    private final String chainName;
    private final String contractAddress;
    private final int decimals;
    private final String explorerUrl;
    private final String icon;
    private final String name;
    private String origin;
    private final List<String> rpcUrls;
    private final String symbol;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DAppInfo() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 0, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.rpcUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, List<String> list, String str5, String str6, String str7, int i, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DAppInfo(str, str2, str3, str4, list, str5, str6, str7, i, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppInfo)) {
            return false;
        }
        DAppInfo dAppInfo = (DAppInfo) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) dAppInfo.url) && Intrinsics.EZpvd((Object) this.name, (Object) dAppInfo.name) && Intrinsics.EZpvd((Object) this.icon, (Object) dAppInfo.icon) && Intrinsics.EZpvd((Object) this.chainName, (Object) dAppInfo.chainName) && Intrinsics.EZpvd(this.rpcUrls, dAppInfo.rpcUrls) && Intrinsics.EZpvd((Object) this.symbol, (Object) dAppInfo.symbol) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) dAppInfo.explorerUrl) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) dAppInfo.contractAddress) && this.decimals == dAppInfo.decimals && Intrinsics.EZpvd((Object) this.origin, (Object) dAppInfo.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRpcUrls() {
        return this.rpcUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.url.hashCode();
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.icon.hashCode();
        String str = this.chainName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        List<String> list = this.rpcUrls;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str2 = this.symbol;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.explorerUrl;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contractAddress;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = Integer.hashCode(this.decimals);
        String str5 = this.origin;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrigin(String str) {
        this.origin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppInfo(url=" + this.url + ", name=" + this.name + ", icon=" + this.icon + ", chainName=" + this.chainName + ", rpcUrls=" + this.rpcUrls + ", symbol=" + this.symbol + ", explorerUrl=" + this.explorerUrl + ", contractAddress=" + this.contractAddress + ", decimals=" + this.decimals + ", origin=" + this.origin + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppInfo> serializer() {
            return DAppInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppInfo(int i, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i2, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str4;
        }
        if ((i & 16) == 0) {
            this.rpcUrls = null;
        } else {
            this.rpcUrls = list;
        }
        if ((i & 32) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str5;
        }
        if ((i & 64) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str6;
        }
        if ((i & 128) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str7;
        }
        if ((i & 256) == 0) {
            this.decimals = -1;
        } else {
            this.decimals = i2;
        }
        if ((i & 512) == 0) {
            this.origin = "";
        } else {
            this.origin = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppInfo dAppInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dAppInfo.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppInfo.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dAppInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dAppInfo.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppInfo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dAppInfo.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dAppInfo.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dAppInfo.rpcUrls != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], dAppInfo.rpcUrls);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dAppInfo.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dAppInfo.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dAppInfo.explorerUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dAppInfo.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dAppInfo.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dAppInfo.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dAppInfo.decimals != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, dAppInfo.decimals);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) dAppInfo.origin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dAppInfo.origin);
    }

    public DAppInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, List<String> list, String str5, String str6, String str7, int i, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.url = str;
        this.name = str2;
        this.icon = str3;
        this.chainName = str4;
        this.rpcUrls = list;
        this.symbol = str5;
        this.explorerUrl = str6;
        this.contractAddress = str7;
        this.decimals = i;
        this.origin = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ DAppInfo(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? -1 : i, (i2 & 512) == 0 ? str8 : "");
    }
}
