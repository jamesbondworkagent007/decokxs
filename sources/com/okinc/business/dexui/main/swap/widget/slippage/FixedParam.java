package com.okinc.business.dexui.main.swap.widget.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FixedParam implements Parcelable {
    public static final Parcelable.Creator<FixedParam> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final SlippageFeeType AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public String djBIcL;
    public final List<String> gEmmrt;
    public final boolean valueOf;

    public static final class Creator implements Parcelable.Creator<FixedParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FixedParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FixedParam(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SlippageFeeType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FixedParam[] newArray(int i) {
            return new FixedParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FixedParam() {
        this(null, null, null, null, null, false, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FixedParam OLrzqt(@NotNull String str, List<String> list, @NotNull String str2, @NotNull String str3, SlippageFeeType slippageFeeType, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new FixedParam(str, list, str2, str3, slippageFeeType, z, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedParam)) {
            return false;
        }
        FixedParam fixedParam = (FixedParam) obj;
        return Intrinsics.EZpvd((Object) this.djBIcL, (Object) fixedParam.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, fixedParam.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) fixedParam.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fixedParam.OLrzqt) && this.AhwBna == fixedParam.AhwBna && this.valueOf == fixedParam.valueOf && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) fixedParam.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) fixedParam.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) fixedParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) fixedParam.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        List<String> list = this.gEmmrt;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        SlippageFeeType slippageFeeType = this.AhwBna;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (slippageFeeType != null ? slippageFeeType.hashCode() : 0)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FixedParam(selectSlippage=" + this.djBIcL + ", slippageList=" + this.gEmmrt + ", fixedMax=" + this.EZpvd + ", fixedMin=" + this.OLrzqt + ", slippageFeeType=" + this.AhwBna + ", useRecommendAutoSlippageHint=" + this.valueOf + ", tradeMode=" + this.AYXKKw + ", fixedRecommendMax=" + this.KWHzl + ", fixedRecommendMin=" + this.AEQbTJ + ", memeTransactionSceneType=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL);
        parcel.writeStringList(this.gEmmrt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        SlippageFeeType slippageFeeType = this.AhwBna;
        if (slippageFeeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(slippageFeeType.name());
        }
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
    }

    public FixedParam(@NotNull String str, List<String> list, @NotNull String str2, @NotNull String str3, SlippageFeeType slippageFeeType, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.djBIcL = str;
        this.gEmmrt = list;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.AhwBna = slippageFeeType;
        this.valueOf = z;
        this.AYXKKw = str4;
        this.KWHzl = str5;
        this.AEQbTJ = str6;
        this.copydefault = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: INVOKE (wrap:java.lang.String[]:0x0015: FILLED_NEW_ARRAY ("0.001"), ("0.005"), ("0.01") A[WRAPPED] elemType: java.lang.String) STATIC call: o.yDY.copydefault(java.lang.Object[]):java.util.ArrayList A[MD:<T>:(T[]):java.util.ArrayList<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:901)) : (r13v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] com.okinc.business.dexlogic.bean.SlippageConfigVo.MAX_SLIP java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : ("0.01"))
  (wrap:com.okinc.business.dexlogic.bean.SlippageFeeType:?: TERNARY null = ((wrap:int:0x002d: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.SlippageFeeType) : (r16v0 com.okinc.business.dexlogic.bean.SlippageFeeType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: INVOKE 
  (wrap:com.okinc.business.dexlogic.bean.MemeTransactionSceneType:0x0058: SGET  A[WRAPPED] (LINE:909) com.okinc.business.dexlogic.bean.MemeTransactionSceneType.Market com.okinc.business.dexlogic.bean.MemeTransactionSceneType)
 VIRTUAL call: com.okinc.business.dexlogic.bean.MemeTransactionSceneType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:909)) : (r21v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:899) call: com.okinc.business.dexui.main.swap.widget.slippage.FixedParam.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.SlippageFeeType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FixedParam(String str, List list, String str2, String str3, SlippageFeeType slippageFeeType, boolean z, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.copydefault("0.001", "0.005", "0.01") : list, (i & 4) != 0 ? SlippageConfigVo.MAX_SLIP : str2, (i & 8) == 0 ? str3 : "0.01", (i & 16) != 0 ? null : slippageFeeType, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? MemeTransactionSceneType.Market.getValue() : str7);
    }
}
