package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomNetworkInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CustomNetworkInfo> CREATOR = new Creator();
    private final String chainName;
    private final String contractAddress;
    private final int decimals;
    private final String explorerUrl;
    private String iconUrl;
    private final String name;
    private final List<String> rpcUrls;
    private String symbol;
    private final String url;

    public static final class Creator implements Parcelable.Creator<CustomNetworkInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomNetworkInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomNetworkInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomNetworkInfo[] newArray(int i) {
            return new CustomNetworkInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomNetworkInfo() {
        this(null, null, null, null, null, null, null, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
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
    public final CustomNetworkInfo copy(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, int i) {
        return new CustomNetworkInfo(str, str2, str3, str4, list, str5, str6, str7, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomNetworkInfo)) {
            return false;
        }
        CustomNetworkInfo customNetworkInfo = (CustomNetworkInfo) obj;
        return Intrinsics.EZpvd((Object) this.iconUrl, (Object) customNetworkInfo.iconUrl) && Intrinsics.EZpvd((Object) this.name, (Object) customNetworkInfo.name) && Intrinsics.EZpvd((Object) this.url, (Object) customNetworkInfo.url) && Intrinsics.EZpvd((Object) this.chainName, (Object) customNetworkInfo.chainName) && Intrinsics.EZpvd(this.rpcUrls, customNetworkInfo.rpcUrls) && Intrinsics.EZpvd((Object) this.symbol, (Object) customNetworkInfo.symbol) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) customNetworkInfo.explorerUrl) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) customNetworkInfo.contractAddress) && this.decimals == customNetworkInfo.decimals;
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
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
        String str = this.iconUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.rpcUrls;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str5 = this.symbol;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.explorerUrl;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.contractAddress;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.decimals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomNetworkInfo(iconUrl=" + this.iconUrl + ", name=" + this.name + ", url=" + this.url + ", chainName=" + this.chainName + ", rpcUrls=" + this.rpcUrls + ", symbol=" + this.symbol + ", explorerUrl=" + this.explorerUrl + ", contractAddress=" + this.contractAddress + ", decimals=" + this.decimals + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.chainName);
        parcel.writeStringList(this.rpcUrls);
        parcel.writeString(this.symbol);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.contractAddress);
        parcel.writeInt(this.decimals);
    }

    public CustomNetworkInfo(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, int i) {
        this.iconUrl = str;
        this.name = str2;
        this.url = str3;
        this.chainName = str4;
        this.rpcUrls = list;
        this.symbol = str5;
        this.explorerUrl = str6;
        this.contractAddress = str7;
        this.decimals = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r19v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:200) call: com.okinc.business.defi.api.bean.CustomNetworkInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ CustomNetworkInfo(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) == 0 ? str7 : "", (i2 & 256) != 0 ? -1 : i);
    }
}
