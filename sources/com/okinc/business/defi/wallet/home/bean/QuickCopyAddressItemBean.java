package com.okinc.business.defi.wallet.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.constant.WalletType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickCopyAddressItemBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuickCopyAddressItemBean> CREATOR = new Creator();
    private String address;
    private String addressTypeContent;
    private int btcAddressType;
    private String chainName;
    private long coinId;
    private String coinSymbol;
    private String coinUrl;
    private int hotNetworkRank;
    private boolean isCustom;
    private boolean isEos;
    private boolean isExpanded;
    private boolean isHotNetwork;
    private List<QuickCopyAddressItemBean> moreAddressList;
    private boolean needGenerateAddress;
    private WalletType walletType;

    public static final class Creator implements Parcelable.Creator<QuickCopyAddressItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickCopyAddressItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            WalletType walletTypeValueOf = WalletType.valueOf(parcel.readString());
            boolean z2 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            int i3 = parcel.readInt();
            boolean z5 = parcel.readInt() != 0;
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            while (i != i4) {
                arrayList.add(QuickCopyAddressItemBean.CREATOR.createFromParcel(parcel));
                i++;
                i4 = i4;
            }
            return new QuickCopyAddressItemBean(string, j, string2, string3, string4, z, walletTypeValueOf, z2, i2, z3, z4, string5, i3, z5, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickCopyAddressItemBean[] newArray(int i) {
            return new QuickCopyAddressItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuickCopyAddressItemBean() {
        this(null, 0L, null, null, null, false, null, false, 0, false, false, null, 0, false, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.needGenerateAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.addressTypeContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.btcAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuickCopyAddressItemBean> component15() {
        return this.moreAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isEos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType component7() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isHotNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.hotNetworkRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickCopyAddressItemBean copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull WalletType walletType, boolean z2, int i, boolean z3, boolean z4, @NotNull String str5, int i2, boolean z5, @NotNull List<QuickCopyAddressItemBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new QuickCopyAddressItemBean(str, j, str2, str3, str4, z, walletType, z2, i, z3, z4, str5, i2, z5, list);
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
        if (!(obj instanceof QuickCopyAddressItemBean)) {
            return false;
        }
        QuickCopyAddressItemBean quickCopyAddressItemBean = (QuickCopyAddressItemBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) quickCopyAddressItemBean.address) && this.coinId == quickCopyAddressItemBean.coinId && Intrinsics.EZpvd((Object) this.chainName, (Object) quickCopyAddressItemBean.chainName) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) quickCopyAddressItemBean.coinUrl) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) quickCopyAddressItemBean.coinSymbol) && this.isEos == quickCopyAddressItemBean.isEos && this.walletType == quickCopyAddressItemBean.walletType && this.isHotNetwork == quickCopyAddressItemBean.isHotNetwork && this.hotNetworkRank == quickCopyAddressItemBean.hotNetworkRank && this.isCustom == quickCopyAddressItemBean.isCustom && this.needGenerateAddress == quickCopyAddressItemBean.needGenerateAddress && Intrinsics.EZpvd((Object) this.addressTypeContent, (Object) quickCopyAddressItemBean.addressTypeContent) && this.btcAddressType == quickCopyAddressItemBean.btcAddressType && this.isExpanded == quickCopyAddressItemBean.isExpanded && Intrinsics.EZpvd(this.moreAddressList, quickCopyAddressItemBean.moreAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressTypeContent() {
        return this.addressTypeContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBtcAddressType() {
        return this.btcAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrl() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHotNetworkRank() {
        return this.hotNetworkRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuickCopyAddressItemBean> getMoreAddressList() {
        return this.moreAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedGenerateAddress() {
        return this.needGenerateAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.address.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.chainName.hashCode()) * 31) + this.coinUrl.hashCode()) * 31) + this.coinSymbol.hashCode()) * 31) + Boolean.hashCode(this.isEos)) * 31) + this.walletType.hashCode()) * 31) + Boolean.hashCode(this.isHotNetwork)) * 31) + Integer.hashCode(this.hotNetworkRank)) * 31) + Boolean.hashCode(this.isCustom)) * 31) + Boolean.hashCode(this.needGenerateAddress)) * 31) + this.addressTypeContent.hashCode()) * 31) + Integer.hashCode(this.btcAddressType)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + this.moreAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustom() {
        return this.isCustom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEos() {
        return this.isEos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHotNetwork() {
        return this.isHotNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTypeContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressTypeContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcAddressType(int i) {
        this.btcAddressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustom(boolean z) {
        this.isCustom = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEos(boolean z) {
        this.isEos = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotNetwork(boolean z) {
        this.isHotNetwork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotNetworkRank(int i) {
        this.hotNetworkRank = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoreAddressList(@NotNull List<QuickCopyAddressItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.moreAddressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedGenerateAddress(boolean z) {
        this.needGenerateAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        this.walletType = walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickCopyAddressItemBean(address=" + this.address + ", coinId=" + this.coinId + ", chainName=" + this.chainName + ", coinUrl=" + this.coinUrl + ", coinSymbol=" + this.coinSymbol + ", isEos=" + this.isEos + ", walletType=" + this.walletType + ", isHotNetwork=" + this.isHotNetwork + ", hotNetworkRank=" + this.hotNetworkRank + ", isCustom=" + this.isCustom + ", needGenerateAddress=" + this.needGenerateAddress + ", addressTypeContent=" + this.addressTypeContent + ", btcAddressType=" + this.btcAddressType + ", isExpanded=" + this.isExpanded + ", moreAddressList=" + this.moreAddressList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.coinUrl);
        parcel.writeString(this.coinSymbol);
        parcel.writeInt(this.isEos ? 1 : 0);
        parcel.writeString(this.walletType.name());
        parcel.writeInt(this.isHotNetwork ? 1 : 0);
        parcel.writeInt(this.hotNetworkRank);
        parcel.writeInt(this.isCustom ? 1 : 0);
        parcel.writeInt(this.needGenerateAddress ? 1 : 0);
        parcel.writeString(this.addressTypeContent);
        parcel.writeInt(this.btcAddressType);
        parcel.writeInt(this.isExpanded ? 1 : 0);
        List<QuickCopyAddressItemBean> list = this.moreAddressList;
        parcel.writeInt(list.size());
        Iterator<QuickCopyAddressItemBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public QuickCopyAddressItemBean(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull WalletType walletType, boolean z2, int i, boolean z3, boolean z4, @NotNull String str5, int i2, boolean z5, @NotNull List<QuickCopyAddressItemBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.coinId = j;
        this.chainName = str2;
        this.coinUrl = str3;
        this.coinSymbol = str4;
        this.isEos = z;
        this.walletType = walletType;
        this.isHotNetwork = z2;
        this.hotNetworkRank = i;
        this.isCustom = z3;
        this.needGenerateAddress = z4;
        this.addressTypeContent = str5;
        this.btcAddressType = i2;
        this.isExpanded = z5;
        this.moreAddressList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:com.okinc.business.defi.biz.constant.WalletType:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:17) com.okinc.business.defi.biz.constant.WalletType.HDWallet com.okinc.business.defi.biz.constant.WalletType) : (r24v0 com.okinc.business.defi.biz.constant.WalletType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r30v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0075: ARITH (r33v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0079: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r32v0 java.util.List))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.defi.biz.constant.WalletType, boolean, int, boolean, boolean, java.lang.String, int, boolean, java.util.List<com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean>):void (m)] (LINE:10) call: com.okinc.business.defi.wallet.home.bean.QuickCopyAddressItemBean.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.defi.biz.constant.WalletType, boolean, int, boolean, boolean, java.lang.String, int, boolean, java.util.List):void type: THIS */
    public /* synthetic */ QuickCopyAddressItemBean(String str, long j, String str2, String str3, String str4, boolean z, WalletType walletType, boolean z2, int i, boolean z3, boolean z4, String str5, int i2, boolean z5, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? WalletType.HDWallet : walletType, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) == 0 ? str5 : "", (i3 & 4096) != 0 ? -1 : i2, (i3 & 8192) != 0 ? false : z5, (i3 & 16384) != 0 ? yDY.AhwBna() : list);
    }
}
