package com.okinc.business.dexui.main.swap.widget.mev;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MinimumReceivedParam implements Parcelable {
    public static final Parcelable.Creator<MinimumReceivedParam> CREATOR = new Creator();
    public String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public TradeMode djBIcL;

    public static final class Creator implements Parcelable.Creator<MinimumReceivedParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinimumReceivedParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MinimumReceivedParam(TradeMode.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinimumReceivedParam[] newArray(int i) {
            return new MinimumReceivedParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MinimumReceivedParam copy$default(MinimumReceivedParam minimumReceivedParam, TradeMode tradeMode, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeMode = minimumReceivedParam.djBIcL;
        }
        if ((i & 2) != 0) {
            str = minimumReceivedParam.AEQbTJ;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = minimumReceivedParam.EZpvd;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = minimumReceivedParam.OLrzqt;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = minimumReceivedParam.KWHzl;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            z = minimumReceivedParam.copydefault;
        }
        return minimumReceivedParam.AEQbTJ(tradeMode, str5, str6, str7, str8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinimumReceivedParam AEQbTJ(@NotNull TradeMode tradeMode, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MinimumReceivedParam(tradeMode, str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof MinimumReceivedParam)) {
            return false;
        }
        MinimumReceivedParam minimumReceivedParam = (MinimumReceivedParam) obj;
        return this.djBIcL == minimumReceivedParam.djBIcL && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) minimumReceivedParam.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) minimumReceivedParam.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) minimumReceivedParam.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) minimumReceivedParam.KWHzl) && this.copydefault == minimumReceivedParam.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.djBIcL.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MinimumReceivedParam(tradeMode=" + this.djBIcL + ", minimumReceived=" + this.AEQbTJ + ", tokenSymbol=" + this.EZpvd + ", receiveAmount=" + this.OLrzqt + ", decimal=" + this.KWHzl + ", showHint=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL.name());
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public MinimumReceivedParam(@NotNull TradeMode tradeMode, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = tradeMode;
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.KWHzl = str4;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 com.okinc.business.dexui.main.shared.model.TradeMode)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(com.okinc.business.dexui.main.shared.model.TradeMode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:47) call: com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam.<init>(com.okinc.business.dexui.main.shared.model.TradeMode, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ MinimumReceivedParam(TradeMode tradeMode, String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeMode, (i & 2) != 0 ? "" : str, str2, str3, str4, (i & 32) != 0 ? false : z);
    }
}
