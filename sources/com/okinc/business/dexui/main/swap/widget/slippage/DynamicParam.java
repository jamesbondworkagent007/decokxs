package com.okinc.business.dexui.main.swap.widget.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DynamicParam implements Parcelable {
    public static final Parcelable.Creator<DynamicParam> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final boolean DbNXlk;
    public final String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public String djBIcL;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public final boolean isConnected;
    public final String valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<DynamicParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DynamicParam(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicParam[] newArray(int i) {
            return new DynamicParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicParam KWHzl(boolean z, String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, boolean z6, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new DynamicParam(z, str, str2, str3, str4, str5, str6, str7, z2, z3, str8, z4, z5, z6, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.djBIcL = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicParam)) {
            return false;
        }
        DynamicParam dynamicParam = (DynamicParam) obj;
        return this.DbNXlk == dynamicParam.DbNXlk && Intrinsics.EZpvd((Object) this.djBIcL, (Object) dynamicParam.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) dynamicParam.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) dynamicParam.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dynamicParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) dynamicParam.EZpvd) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) dynamicParam.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) dynamicParam.AYXKKw) && this.values == dynamicParam.values && this.isConnected == dynamicParam.isConnected && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) dynamicParam.AkhnZx) && this.OLrzqt == dynamicParam.OLrzqt && this.KWHzl == dynamicParam.KWHzl && this.fetchVPNInfo == dynamicParam.fetchVPNInfo && Intrinsics.EZpvd((Object) this.valueOf, (Object) dynamicParam.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.DbNXlk);
        String str = this.djBIcL;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.AhwBna;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        int iHashCode7 = this.gEmmrt.hashCode();
        int iHashCode8 = this.AYXKKw.hashCode();
        int iHashCode9 = Boolean.hashCode(this.values);
        int iHashCode10 = Boolean.hashCode(this.isConnected);
        String str3 = this.AkhnZx;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.fetchVPNInfo)) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DynamicParam(supportMaxSlippage=" + this.DbNXlk + ", maxSlippage=" + this.djBIcL + ", referenceSlippage=" + this.AhwBna + ", dynamicAutoSlippage=" + this.copydefault + ", dynamicSlippageRangeMin=" + this.AEQbTJ + ", dynamicSlippageRangeMax=" + this.EZpvd + ", recommendSlippageRangeMin=" + this.gEmmrt + ", recommendSlippageRangeMax=" + this.AYXKKw + ", showDynamicAutoSlippage=" + this.values + ", supportDynamicSlippage=" + this.isConnected + ", safeMoonTokenSymbol=" + this.AkhnZx + ", isSafeMoonToken=" + this.OLrzqt + ", isBridge=" + this.KWHzl + ", useMaxSlippageErrorHint=" + this.fetchVPNInfo + ", memeTransactionSceneType=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.isConnected ? 1 : 0);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        parcel.writeString(this.valueOf);
    }

    public DynamicParam(boolean z, String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, boolean z6, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.DbNXlk = z;
        this.djBIcL = str;
        this.AhwBna = str2;
        this.copydefault = str3;
        this.AEQbTJ = str4;
        this.EZpvd = str5;
        this.gEmmrt = str6;
        this.AYXKKw = str7;
        this.values = z2;
        this.isConnected = z3;
        this.AkhnZx = str8;
        this.OLrzqt = z4;
        this.KWHzl = z5;
        this.fetchVPNInfo = z6;
        this.valueOf = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (r21v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0.01") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0.02") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0.03") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0.1") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0070: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0083: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MemeTransactionSceneType:0x007d: SGET  A[WRAPPED] (LINE:895) com.okinc.business.dexlogic.bean.MemeTransactionSceneType.Market com.okinc.business.dexlogic.bean.MemeTransactionSceneType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MemeTransactionSceneType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:895)) : (r34v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:880) call: com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DynamicParam(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, boolean z4, boolean z5, boolean z6, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "0.01" : str3, (i & 16) != 0 ? "0.02" : str4, (i & 32) != 0 ? SlippageConfigVo.MAX_SLIP : str5, (i & 64) != 0 ? "0.03" : str6, (i & 128) != 0 ? "0.1" : str7, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? true : z3, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? true : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? MemeTransactionSceneType.Market.getValue() : str9);
    }
}
