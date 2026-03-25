package com.okinc.business.defi.dapp.webview.okxconnect;

import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Address {
    public static final int $stable = 8;
    private final String address;
    private final String addressType;
    private final String chainId;
    private final HashMap<String, Object> data;
    private final String name;
    private final String namespaceChainId;
    private final String publicKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.dapp.webview.okxconnect.Address */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, HashMap map, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.address;
        }
        if ((i & 2) != 0) {
            str2 = address.chainId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = address.name;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = address.namespaceChainId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = address.publicKey;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            map = address.data;
        }
        HashMap map2 = map;
        if ((i & 64) != 0) {
            str6 = address.addressType;
        }
        return address.copy(str, str7, str8, str9, str10, map2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.namespaceChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, Object> component6() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Address copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, HashMap<String, Object> map, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new Address(str, str2, str3, str4, str5, map, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) address.address) && Intrinsics.EZpvd((Object) this.chainId, (Object) address.chainId) && Intrinsics.EZpvd((Object) this.name, (Object) address.name) && Intrinsics.EZpvd((Object) this.namespaceChainId, (Object) address.namespaceChainId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) address.publicKey) && Intrinsics.EZpvd(this.data, address.data) && Intrinsics.EZpvd((Object) this.addressType, (Object) address.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, Object> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNamespaceChainId() {
        return this.namespaceChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.name.hashCode();
        int iHashCode4 = this.namespaceChainId.hashCode();
        int iHashCode5 = this.publicKey.hashCode();
        HashMap<String, Object> map = this.data;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.addressType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Address(address=" + this.address + ", chainId=" + this.chainId + ", name=" + this.name + ", namespaceChainId=" + this.namespaceChainId + ", publicKey=" + this.publicKey + ", data=" + this.data + ", addressType=" + this.addressType + ")";
    }

    public Address(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, HashMap<String, Object> map, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.address = str;
        this.chainId = str2;
        this.name = str3;
        this.namespaceChainId = str4;
        this.publicKey = str5;
        this.data = map;
        this.addressType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r15v0 java.util.HashMap))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.defi.dapp.webview.okxconnect.Address.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String):void type: THIS */
    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, HashMap map, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? "" : str6);
    }
}
