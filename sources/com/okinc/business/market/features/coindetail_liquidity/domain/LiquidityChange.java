package com.okinc.business.market.features.coindetail_liquidity.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.data.constant.LiquidityChangeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityChange implements Parcelable {
    public static final Parcelable.Creator<LiquidityChange> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String AkhnZx;
    public final LiquidityChangeType DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final List<TokenChange> copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<LiquidityChange> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityChange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LiquidityChangeType liquidityChangeTypeValueOf = LiquidityChangeType.valueOf(parcel.readString());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TokenChange.CREATOR.createFromParcel(parcel));
            }
            return new LiquidityChange(string, string2, string3, liquidityChangeTypeValueOf, string4, string5, string6, string7, string8, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityChange[] newArray(int i) {
            return new LiquidityChange[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChange() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChangeType AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChange OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LiquidityChangeType liquidityChangeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<TokenChange> list, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(liquidityChangeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new LiquidityChange(str, str2, str3, liquidityChangeType, str4, str5, str6, str7, str8, list, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenChange> copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidityChange)) {
            return false;
        }
        LiquidityChange liquidityChange = (LiquidityChange) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) liquidityChange.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) liquidityChange.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) liquidityChange.KWHzl) && this.DbNXlk == liquidityChange.DbNXlk && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) liquidityChange.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) liquidityChange.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) liquidityChange.AhwBna) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) liquidityChange.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) liquidityChange.AkhnZx) && Intrinsics.EZpvd(this.copydefault, liquidityChange.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) liquidityChange.valueOf) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) liquidityChange.OLrzqt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) liquidityChange.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChange(id=" + this.AEQbTJ + ", chainId=" + this.EZpvd + ", dexName=" + this.KWHzl + ", type=" + this.DbNXlk + ", poolName=" + this.gEmmrt + ", poolLogoUrl=" + this.djBIcL + ", txHashUrl=" + this.AhwBna + ", value=" + this.fetchVPNInfo + ", walletAddress=" + this.AkhnZx + ", changedTokenInfo=" + this.copydefault + ", tokenSymbol=" + this.valueOf + ", amount=" + this.OLrzqt + ", timestamp=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.DbNXlk.name());
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.AkhnZx);
        List<TokenChange> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<TokenChange> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueOf);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AYXKKw);
    }

    public LiquidityChange(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull LiquidityChangeType liquidityChangeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<TokenChange> list, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(liquidityChangeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.DbNXlk = liquidityChangeType;
        this.gEmmrt = str4;
        this.djBIcL = str5;
        this.AhwBna = str6;
        this.fetchVPNInfo = str7;
        this.AkhnZx = str8;
        this.copydefault = list;
        this.valueOf = str9;
        this.OLrzqt = str10;
        this.AYXKKw = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.business.market.data.constant.LiquidityChangeType:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] (LINE:12) com.okinc.business.market.data.constant.LiquidityChangeType.All com.okinc.business.market.data.constant.LiquidityChangeType) : (r18v0 com.okinc.business.market.data.constant.LiquidityChangeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r24v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.LiquidityChangeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.coindetail_liquidity.domain.TokenChange>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.constant.LiquidityChangeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiquidityChange(String str, String str2, String str3, LiquidityChangeType liquidityChangeType, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? LiquidityChangeType.All : liquidityChangeType, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) == 0 ? str11 : "");
    }
}
