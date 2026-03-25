package com.okinc.business.defi.biz.core.customchain.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import com.okinc.business.defi.biz.net.bean.FactionInfoExtData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10854bwM;
import o.C10953byF;
import o.C33129mqd;
import o.C59454zhO;
import o.C9700baY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomChainCoinMeta implements Parcelable {
    public static final Parcelable.Creator<CustomChainCoinMeta> CREATOR = new Creator();
    public CustomChainCoinMeta AEQbTJ;
    public int AYXKKw;
    public long AhwBna;
    public String DbNXlk;
    public CustomChainMeta EZpvd;
    public String KWHzl;
    public long OLrzqt;
    public long copydefault;
    public String djBIcL;
    public long fetchVPNInfo;
    public long gEmmrt;
    public String isConnected;
    public int valueOf;
    public String values;

    public static final class Creator implements Parcelable.Creator<CustomChainCoinMeta> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainCoinMeta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomChainCoinMeta(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt() == 0 ? null : CustomChainMeta.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CustomChainCoinMeta.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainCoinMeta[] newArray(int i) {
            return new CustomChainCoinMeta[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(CustomChainMeta customChainMeta) {
        this.EZpvd = customChainMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMeta EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMeta OLrzqt(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j4, int i, int i2, long j5, CustomChainMeta customChainMeta, CustomChainCoinMeta customChainCoinMeta) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CustomChainCoinMeta(j, j2, j3, str, str2, str3, str4, str5, j4, i, i2, j5, customChainMeta, customChainCoinMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainMeta OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(CustomChainCoinMeta customChainCoinMeta) {
        this.AEQbTJ = customChainCoinMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainCoinMeta)) {
            return false;
        }
        CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) obj;
        return this.copydefault == customChainCoinMeta.copydefault && this.fetchVPNInfo == customChainCoinMeta.fetchVPNInfo && this.AhwBna == customChainCoinMeta.AhwBna && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) customChainCoinMeta.DbNXlk) && Intrinsics.EZpvd((Object) this.values, (Object) customChainCoinMeta.values) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) customChainCoinMeta.KWHzl) && Intrinsics.EZpvd((Object) this.isConnected, (Object) customChainCoinMeta.isConnected) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) customChainCoinMeta.djBIcL) && this.OLrzqt == customChainCoinMeta.OLrzqt && this.valueOf == customChainCoinMeta.valueOf && this.AYXKKw == customChainCoinMeta.AYXKKw && this.gEmmrt == customChainCoinMeta.gEmmrt && Intrinsics.EZpvd(this.EZpvd, customChainCoinMeta.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, customChainCoinMeta.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return (this.valueOf & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.copydefault);
        int iHashCode2 = Long.hashCode(this.fetchVPNInfo);
        int iHashCode3 = Long.hashCode(this.AhwBna);
        int iHashCode4 = this.DbNXlk.hashCode();
        int iHashCode5 = this.values.hashCode();
        int iHashCode6 = this.KWHzl.hashCode();
        int iHashCode7 = this.isConnected.hashCode();
        int iHashCode8 = this.djBIcL.hashCode();
        int iHashCode9 = Long.hashCode(this.OLrzqt);
        int iHashCode10 = Integer.hashCode(this.valueOf);
        int iHashCode11 = Integer.hashCode(this.AYXKKw);
        int iHashCode12 = Long.hashCode(this.gEmmrt);
        CustomChainMeta customChainMeta = this.EZpvd;
        int iHashCode13 = customChainMeta == null ? 0 : customChainMeta.hashCode();
        CustomChainCoinMeta customChainCoinMeta = this.AEQbTJ;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (customChainCoinMeta != null ? customChainCoinMeta.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainCoinMeta(chainId=" + this.copydefault + ", realChainId=" + this.fetchVPNInfo + ", coinId=" + this.AhwBna + ", symbol=" + this.DbNXlk + ", name=" + this.values + ", chainName=" + this.KWHzl + ", iconUrl=" + this.isConnected + ", contractAddress=" + this.djBIcL + ", baseCoinId=" + this.OLrzqt + ", coinType=" + this.valueOf + ", decimalNum=" + this.AYXKKw + ", createAt=" + this.gEmmrt + ", chainMeta=" + this.EZpvd + ", baseCoinMeta=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.copydefault);
        parcel.writeLong(this.fetchVPNInfo);
        parcel.writeLong(this.AhwBna);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.values);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.djBIcL);
        parcel.writeLong(this.OLrzqt);
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.AYXKKw);
        parcel.writeLong(this.gEmmrt);
        CustomChainMeta customChainMeta = this.EZpvd;
        if (customChainMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customChainMeta.writeToParcel(parcel, i);
        }
        CustomChainCoinMeta customChainCoinMeta = this.AEQbTJ;
        if (customChainCoinMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customChainCoinMeta.writeToParcel(parcel, i);
        }
    }

    public CustomChainCoinMeta(long j, long j2, long j3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j4, int i, int i2, long j5, CustomChainMeta customChainMeta, CustomChainCoinMeta customChainCoinMeta) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = j;
        this.fetchVPNInfo = j2;
        this.AhwBna = j3;
        this.DbNXlk = str;
        this.values = str2;
        this.KWHzl = str3;
        this.isConnected = str4;
        this.djBIcL = str5;
        this.OLrzqt = j4;
        this.valueOf = i;
        this.AYXKKw = i2;
        this.gEmmrt = j5;
        this.EZpvd = customChainMeta;
        this.AEQbTJ = customChainCoinMeta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r24v0 long)
  (r26v0 long)
  (r28v0 long)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 long)
  (r37v0 int)
  (r38v0 int)
  (r39v0 long)
  (wrap:com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta) : (r41v0 com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta))
  (wrap:com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta:?: TERNARY null = ((wrap:int:0x000c: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta) : (r42v0 com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta))
 A[MD:(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, long, com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta):void (m)] (LINE:17) call: com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, long, com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta):void type: THIS */
    public /* synthetic */ CustomChainCoinMeta(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, long j4, int i, int i2, long j5, CustomChainMeta customChainMeta, CustomChainCoinMeta customChainCoinMeta, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, str, str2, str3, str4, str5, j4, i, i2, j5, (i3 & 4096) != 0 ? null : customChainMeta, (i3 & 8192) != 0 ? null : customChainCoinMeta);
    }

    public final String AkhnZx() {
        return C10953byF.KWHzl.AEQbTJ(this.AhwBna);
    }

    public final C10854bwM AEQbTJ() {
        String strValueOf;
        String strIsConnected;
        long j = this.copydefault;
        long j2 = this.AhwBna;
        String str = this.DbNXlk;
        String str2 = this.values;
        String str3 = this.KWHzl;
        String strOLrzqt = this.isConnected;
        if (strOLrzqt.length() == 0) {
            strOLrzqt = C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(this.DbNXlk)));
        }
        String str4 = strOLrzqt;
        String str5 = this.djBIcL;
        long j3 = this.OLrzqt;
        long j4 = this.fetchVPNInfo;
        int i = this.valueOf;
        int i2 = this.AYXKKw;
        C10854bwM c10854bwM = new C10854bwM(new CoinMetaBean(j2, j3, j, j4, str2, str3, str, str4, (String) null, str5, i2, i2, i2, i, (String) null, false, false, Integer.valueOf((int) this.gEmmrt), false, 0, 0, 0, false, false, (String) null, new FactionInfo(1, (FactionInfoExtData) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), (Boolean) null, 0, 0, false, (Boolean) null, (Long) null, (Boolean) null, (Integer) null, (Integer) null, 0, (Integer) null, (Integer) null, false, 6, false, (String) null, -33701632, 575, (DefaultConstructorMarker) null));
        c10854bwM.EZpvd(true);
        CustomChainMeta customChainMeta = this.EZpvd;
        String str6 = "";
        if (customChainMeta == null || (strValueOf = customChainMeta.valueOf()) == null) {
            strValueOf = "";
        }
        c10854bwM.copydefault(strValueOf);
        CustomChainMeta customChainMeta2 = this.EZpvd;
        if (customChainMeta2 != null && (strIsConnected = customChainMeta2.isConnected()) != null) {
            str6 = strIsConnected;
        }
        c10854bwM.AYXKKw(str6);
        return c10854bwM;
    }

    public final CustomChainCoinMetaEntity KWHzl() {
        long j = this.copydefault;
        long j2 = this.fetchVPNInfo;
        long j3 = this.AhwBna;
        String str = this.DbNXlk;
        String str2 = this.values;
        String strOLrzqt = this.isConnected;
        if (strOLrzqt.length() == 0) {
            strOLrzqt = C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(this.DbNXlk)));
        }
        return new CustomChainCoinMetaEntity(j, j2, j3, str, str2, strOLrzqt, this.djBIcL, this.OLrzqt, this.valueOf, this.AYXKKw, this.gEmmrt);
    }
}
