package com.okinc.web3.security.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PrivateKeyInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PrivateKeyInfo> CREATOR = new Creator();
    private final String chainAddress;
    private final String chainAddressTypeText;
    private final long chainId;
    private final String chainInfoText;
    private final String chainName;
    private final String chainUrl;
    private boolean isCopied;
    private boolean isExpand;
    private final boolean isShowSupportChains;
    private boolean isShowed;
    private final String privateKey;
    private final boolean showChainInfo;
    private final List<Long> supportChainAllIds;
    private final List<Integer> supportChainShowIconResIds;

    public static final class Creator implements Parcelable.Creator<PrivateKeyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivateKeyInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new PrivateKeyInfo(j, string, string2, z, string3, string4, string5, string6, z2, arrayList2, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivateKeyInfo[] newArray(int i) {
            return new PrivateKeyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component10() {
        return this.supportChainAllIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component11() {
        return this.supportChainShowIconResIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isShowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isCopied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainInfoText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainAddressTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isShowSupportChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrivateKeyInfo copy(long j, @NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z2, @NotNull List<Long> list, List<Integer> list2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PrivateKeyInfo(j, str, str2, z, str3, str4, str5, str6, z2, list, list2, z3, z4, z5);
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
        if (!(obj instanceof PrivateKeyInfo)) {
            return false;
        }
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
        return this.chainId == privateKeyInfo.chainId && Intrinsics.EZpvd((Object) this.chainName, (Object) privateKeyInfo.chainName) && Intrinsics.EZpvd((Object) this.chainUrl, (Object) privateKeyInfo.chainUrl) && this.showChainInfo == privateKeyInfo.showChainInfo && Intrinsics.EZpvd((Object) this.chainInfoText, (Object) privateKeyInfo.chainInfoText) && Intrinsics.EZpvd((Object) this.chainAddress, (Object) privateKeyInfo.chainAddress) && Intrinsics.EZpvd((Object) this.chainAddressTypeText, (Object) privateKeyInfo.chainAddressTypeText) && Intrinsics.EZpvd((Object) this.privateKey, (Object) privateKeyInfo.privateKey) && this.isShowSupportChains == privateKeyInfo.isShowSupportChains && Intrinsics.EZpvd(this.supportChainAllIds, privateKeyInfo.supportChainAllIds) && Intrinsics.EZpvd(this.supportChainShowIconResIds, privateKeyInfo.supportChainShowIconResIds) && this.isExpand == privateKeyInfo.isExpand && this.isShowed == privateKeyInfo.isShowed && this.isCopied == privateKeyInfo.isCopied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddress() {
        return this.chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddressTypeText() {
        return this.chainAddressTypeText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainInfoText() {
        return this.chainInfoText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainUrl() {
        return this.chainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowChainInfo() {
        return this.showChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getSupportChainAllIds() {
        return this.supportChainAllIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSupportChainShowIconResIds() {
        return this.supportChainShowIconResIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainUrl.hashCode();
        int iHashCode4 = Boolean.hashCode(this.showChainInfo);
        String str = this.chainInfoText;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.chainAddress.hashCode();
        String str2 = this.chainAddressTypeText;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.privateKey.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isShowSupportChains);
        int iHashCode10 = this.supportChainAllIds.hashCode();
        List<Integer> list = this.supportChainShowIconResIds;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpand)) * 31) + Boolean.hashCode(this.isShowed)) * 31) + Boolean.hashCode(this.isCopied);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCopied() {
        return this.isCopied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpand() {
        return this.isExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSupportChains() {
        return this.isShowSupportChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowed() {
        return this.isShowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopied(boolean z) {
        this.isCopied = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpand(boolean z) {
        this.isExpand = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrivateKeyInfo(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainUrl=" + this.chainUrl + ", showChainInfo=" + this.showChainInfo + ", chainInfoText=" + this.chainInfoText + ", chainAddress=" + this.chainAddress + ", chainAddressTypeText=" + this.chainAddressTypeText + ", privateKey=" + this.privateKey + ", isShowSupportChains=" + this.isShowSupportChains + ", supportChainAllIds=" + this.supportChainAllIds + ", supportChainShowIconResIds=" + this.supportChainShowIconResIds + ", isExpand=" + this.isExpand + ", isShowed=" + this.isShowed + ", isCopied=" + this.isCopied + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainUrl);
        parcel.writeInt(this.showChainInfo ? 1 : 0);
        parcel.writeString(this.chainInfoText);
        parcel.writeString(this.chainAddress);
        parcel.writeString(this.chainAddressTypeText);
        parcel.writeString(this.privateKey);
        parcel.writeInt(this.isShowSupportChains ? 1 : 0);
        List<Long> list = this.supportChainAllIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        List<Integer> list2 = this.supportChainShowIconResIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        parcel.writeInt(this.isExpand ? 1 : 0);
        parcel.writeInt(this.isShowed ? 1 : 0);
        parcel.writeInt(this.isCopied ? 1 : 0);
    }

    public PrivateKeyInfo(long j, @NotNull String str, @NotNull String str2, boolean z, String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z2, @NotNull List<Long> list, List<Integer> list2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = j;
        this.chainName = str;
        this.chainUrl = str2;
        this.showChainInfo = z;
        this.chainInfoText = str3;
        this.chainAddress = str4;
        this.chainAddressTypeText = str5;
        this.privateKey = str6;
        this.isShowSupportChains = z2;
        this.supportChainAllIds = list;
        this.supportChainShowIconResIds = list2;
        this.isExpand = z3;
        this.isShowed = z4;
        this.isCopied = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r20v0 long)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 boolean)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 boolean)
  (r30v0 java.util.List)
  (r31v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
 A[MD:(long, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<java.lang.Long>, java.util.List<java.lang.Integer>, boolean, boolean, boolean):void (m)] (LINE:9) call: com.okinc.web3.security.model.PrivateKeyInfo.<init>(long, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.util.List, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ PrivateKeyInfo(long j, String str, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, List list, List list2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, z, str3, str4, str5, str6, z2, list, list2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? false : z5);
    }
}
