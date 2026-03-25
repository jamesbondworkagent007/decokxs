package com.okinc.business.market.features.history.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.txs.TxType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeFragmentParams implements Parcelable {
    public final String AEQbTJ;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String valueOf;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<HistoryChangeFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HistoryChangeFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryChangeFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryChangeFragmentParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryChangeFragmentParams[] newArray(int i) {
            return new HistoryChangeFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryChangeFragmentParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HistoryChangeFragmentParams copy$default(HistoryChangeFragmentParams historyChangeFragmentParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyChangeFragmentParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = historyChangeFragmentParams.copydefault;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = historyChangeFragmentParams.AhwBna;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = historyChangeFragmentParams.OLrzqt;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = historyChangeFragmentParams.valueOf;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = historyChangeFragmentParams.EZpvd;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = historyChangeFragmentParams.KWHzl;
        }
        return historyChangeFragmentParams.copydefault(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryChangeFragmentParams copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new HistoryChangeFragmentParams(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof HistoryChangeFragmentParams)) {
            return false;
        }
        HistoryChangeFragmentParams historyChangeFragmentParams = (HistoryChangeFragmentParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) historyChangeFragmentParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) historyChangeFragmentParams.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) historyChangeFragmentParams.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) historyChangeFragmentParams.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) historyChangeFragmentParams.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) historyChangeFragmentParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) historyChangeFragmentParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryChangeFragmentParams(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.copydefault + ", tokenSymbol=" + this.AhwBna + ", chainName=" + this.OLrzqt + ", type=" + this.valueOf + ", chainLogo=" + this.EZpvd + ", pageFrom=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
    }

    public HistoryChangeFragmentParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.AhwBna = str3;
        this.OLrzqt = str4;
        this.valueOf = str5;
        this.EZpvd = str6;
        this.KWHzl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:0x0028: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0024: INVOKE 
  (wrap:com.okinc.business.dexlogic.txs.TxType:0x0022: SGET  A[WRAPPED] (LINE:13) com.okinc.business.dexlogic.txs.TxType.ALL com.okinc.business.dexlogic.txs.TxType)
 VIRTUAL call: com.okinc.business.dexlogic.txs.TxType.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:13)) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HistoryChangeFragmentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? TxType.ALL.getValue() : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
