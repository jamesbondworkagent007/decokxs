package com.okinc.business.market.features.holders.ui.detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.holders.ui.detail.model.AccountDetail;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsParams implements Parcelable {
    public static final Parcelable.Creator<HolderDetailsParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final String djBIcL;
    public final int fetchVPNInfo;
    public final List<TagWrapper> gEmmrt;
    public final AccountDetail isConnected;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<HolderDetailsParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string9 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
            }
            return new HolderDetailsParams(string, string2, string3, string4, string5, string6, string7, i, string8, z, string9, arrayList, parcel.readInt() != 0, AccountDetail.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailsParams[] newArray(int i) {
            return new HolderDetailsParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderDetailsParams() {
        this(null, null, null, null, null, null, null, 0, null, false, null, null, false, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailsParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, boolean z, @NotNull String str9, @NotNull List<TagWrapper> list, boolean z2, @NotNull AccountDetail accountDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(accountDetail, "");
        return new HolderDetailsParams(str, str2, str3, str4, str5, str6, str7, i, str8, z, str9, list, z2, accountDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.djBIcL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderDetailsParams)) {
            return false;
        }
        HolderDetailsParams holderDetailsParams = (HolderDetailsParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) holderDetailsParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) holderDetailsParams.AkhnZx) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) holderDetailsParams.DbNXlk) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) holderDetailsParams.AYXKKw) && Intrinsics.EZpvd((Object) this.valueOf, (Object) holderDetailsParams.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) holderDetailsParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) holderDetailsParams.KWHzl) && this.fetchVPNInfo == holderDetailsParams.fetchVPNInfo && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) holderDetailsParams.OLrzqt) && this.AhwBna == holderDetailsParams.AhwBna && Intrinsics.EZpvd((Object) this.djBIcL, (Object) holderDetailsParams.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, holderDetailsParams.gEmmrt) && this.copydefault == holderDetailsParams.copydefault && this.isConnected == holderDetailsParams.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.AkhnZx.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.fetchVPNInfo)) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.isConnected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderDetailsParams(holderWalletAddress=" + this.AEQbTJ + ", tokenContractAddress=" + this.AkhnZx + ", tokenSymbol=" + this.DbNXlk + ", nativeTokenPrice=" + this.AYXKKw + ", nativeTokenSymbol=" + this.valueOf + ", explorerUrl=" + this.EZpvd + ", chainId=" + this.KWHzl + ", ranking=" + this.fetchVPNInfo + ", addressAlias=" + this.OLrzqt + ", isFollowing=" + this.AhwBna + ", lastTradeTime=" + this.djBIcL + ", newTagList=" + this.gEmmrt + ", isExpandV2DataSupportedChain=" + this.copydefault + ", type=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountDetail values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.fetchVPNInfo);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.djBIcL);
        List<TagWrapper> list = this.gEmmrt;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeString(this.isConnected.name());
    }

    public HolderDetailsParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, boolean z, @NotNull String str9, @NotNull List<TagWrapper> list, boolean z2, @NotNull AccountDetail accountDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(accountDetail, "");
        this.AEQbTJ = str;
        this.AkhnZx = str2;
        this.DbNXlk = str3;
        this.AYXKKw = str4;
        this.valueOf = str5;
        this.EZpvd = str6;
        this.KWHzl = str7;
        this.fetchVPNInfo = i;
        this.OLrzqt = str8;
        this.AhwBna = z;
        this.djBIcL = str9;
        this.gEmmrt = list;
        this.copydefault = z2;
        this.isConnected = accountDetail;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0095: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0060: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:53)) : (r27v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 boolean) : false)
  (wrap:com.okinc.business.market.features.holders.ui.detail.model.AccountDetail:?: TERNARY null = ((wrap:int:0x006e: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: SGET  A[WRAPPED] (LINE:55) com.okinc.business.market.features.holders.ui.detail.model.AccountDetail.HOLDER_DETAIL com.okinc.business.market.features.holders.ui.detail.model.AccountDetail) : (r29v0 com.okinc.business.market.features.holders.ui.detail.model.AccountDetail))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>, boolean, com.okinc.business.market.features.holders.ui.detail.model.AccountDetail):void (m)] (LINE:41) call: com.okinc.business.market.features.holders.ui.detail.HolderDetailsParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, java.lang.String, java.util.List, boolean, com.okinc.business.market.features.holders.ui.detail.model.AccountDetail):void type: THIS */
    public /* synthetic */ HolderDetailsParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, String str9, List list, boolean z2, AccountDetail accountDetail, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? false : z, (i2 & 1024) == 0 ? str9 : "", (i2 & 2048) != 0 ? yDY.AhwBna() : list, (i2 & 4096) == 0 ? z2 : false, (i2 & 8192) != 0 ? AccountDetail.HOLDER_DETAIL : accountDetail);
    }
}
