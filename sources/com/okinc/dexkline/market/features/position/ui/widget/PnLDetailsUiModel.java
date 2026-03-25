package com.okinc.dexkline.market.features.position.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.mRE;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PnLDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<PnLDetailsUiModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<PnLDetailsUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnLDetailsUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PnLDetailsUiModel(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnLDetailsUiModel[] newArray(int i) {
            return new PnLDetailsUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLDetailsUiModel() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetailsUiModel EZpvd(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new PnLDetailsUiModel(z, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.DbNXlk;
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
        if (!(obj instanceof PnLDetailsUiModel)) {
            return false;
        }
        PnLDetailsUiModel pnLDetailsUiModel = (PnLDetailsUiModel) obj;
        return this.AhwBna == pnLDetailsUiModel.AhwBna && Intrinsics.EZpvd((Object) this.djBIcL, (Object) pnLDetailsUiModel.djBIcL) && Intrinsics.EZpvd((Object) this.valueOf, (Object) pnLDetailsUiModel.valueOf) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) pnLDetailsUiModel.AkhnZx) && Intrinsics.EZpvd((Object) this.copydefault, (Object) pnLDetailsUiModel.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) pnLDetailsUiModel.OLrzqt) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) pnLDetailsUiModel.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) pnLDetailsUiModel.DbNXlk) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) pnLDetailsUiModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) pnLDetailsUiModel.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) pnLDetailsUiModel.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) pnLDetailsUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) pnLDetailsUiModel.gEmmrt) && Intrinsics.EZpvd((Object) this.isConnected, (Object) pnLDetailsUiModel.isConnected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.AhwBna) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.isConnected.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLDetailsUiModel(shouldShowPnl=" + this.AhwBna + ", spotBalance=" + this.djBIcL + ", totalProfit=" + this.valueOf + ", totalProfitPercentage=" + this.AkhnZx + ", currentProfit=" + this.copydefault + ", currentProfitPercentage=" + this.OLrzqt + ", unrealizedProfit=" + this.fetchVPNInfo + ", unrealizedProfitPercentage=" + this.DbNXlk + ", realizedProfit=" + this.AEQbTJ + ", realizedProfitPercentage=" + this.AYXKKw + ", averageBought=" + this.EZpvd + ", averageSold=" + this.KWHzl + ", totalBought=" + this.gEmmrt + ", totalSold=" + this.isConnected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.isConnected);
    }

    public PnLDetailsUiModel(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.AhwBna = z;
        this.djBIcL = str;
        this.valueOf = str2;
        this.AkhnZx = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
        this.fetchVPNInfo = str6;
        this.DbNXlk = str7;
        this.AEQbTJ = str8;
        this.AYXKKw = str9;
        this.EZpvd = str10;
        this.KWHzl = str11;
        this.gEmmrt = str12;
        this.isConnected = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PnLDetailsUiModel(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "");
    }

    public final boolean KWHzl() {
        if (this.AhwBna) {
            List<String> listGEmmrt = yDY.gEmmrt(this.copydefault, this.OLrzqt, this.fetchVPNInfo, this.DbNXlk, this.AEQbTJ, this.AYXKKw, this.EZpvd, this.KWHzl, this.gEmmrt, this.isConnected);
            if (!(listGEmmrt instanceof Collection) || !listGEmmrt.isEmpty()) {
                for (String str : listGEmmrt) {
                    if (str.length() <= 0 || !mRE.copydefault(Double.valueOf(C33129mqd.AEQbTJ(str)), Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
