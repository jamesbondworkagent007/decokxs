package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestGasFeeReminderInfo implements Parcelable {
    public static final Parcelable.Creator<InvestGasFeeReminderInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<InvestGasFeeReminderInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestGasFeeReminderInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestGasFeeReminderInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestGasFeeReminderInfo[] newArray(int i) {
            return new InvestGasFeeReminderInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestGasFeeReminderInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestGasFeeReminderInfo copy$default(InvestGasFeeReminderInfo investGasFeeReminderInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investGasFeeReminderInfo.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = investGasFeeReminderInfo.OLrzqt;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = investGasFeeReminderInfo.EZpvd;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = investGasFeeReminderInfo.AEQbTJ;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = investGasFeeReminderInfo.KWHzl;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = investGasFeeReminderInfo.AYXKKw;
        }
        return investGasFeeReminderInfo.AEQbTJ(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGasFeeReminderInfo AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InvestGasFeeReminderInfo(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AYXKKw;
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
        if (!(obj instanceof InvestGasFeeReminderInfo)) {
            return false;
        }
        InvestGasFeeReminderInfo investGasFeeReminderInfo = (InvestGasFeeReminderInfo) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) investGasFeeReminderInfo.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) investGasFeeReminderInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) investGasFeeReminderInfo.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) investGasFeeReminderInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) investGasFeeReminderInfo.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) investGasFeeReminderInfo.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestGasFeeReminderInfo(feeAmount=" + this.copydefault + ", rewards=" + this.OLrzqt + ", contractClaimableReward=" + this.EZpvd + ", rewardTokenAddress=" + this.AEQbTJ + ", rewardTokenSymbol=" + this.KWHzl + ", userRewardBalance=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
    }

    public InvestGasFeeReminderInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.AEQbTJ = str4;
        this.KWHzl = str5;
        this.AYXKKw = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:993) call: com.okinc.business.invest_biz.data.bean.InvestGasFeeReminderInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestGasFeeReminderInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
