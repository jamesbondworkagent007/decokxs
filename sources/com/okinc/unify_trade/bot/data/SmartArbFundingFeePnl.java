package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56030xvC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartArbFundingFeePnl implements Parcelable, C56030xvC.Activity {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SmartArbFundingFeePnl> CREATOR = new Creator();
    private final String data;
    private final String pnl;

    public static final class Creator implements Parcelable.Creator<SmartArbFundingFeePnl> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbFundingFeePnl createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbFundingFeePnl(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbFundingFeePnl[] newArray(int i) {
            return new SmartArbFundingFeePnl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbFundingFeePnl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SmartArbFundingFeePnl copy$default(SmartArbFundingFeePnl smartArbFundingFeePnl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartArbFundingFeePnl.pnl;
        }
        if ((i & 2) != 0) {
            str2 = smartArbFundingFeePnl.data;
        }
        return smartArbFundingFeePnl.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbFundingFeePnl copy(String str, String str2) {
        return new SmartArbFundingFeePnl(str, str2);
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
        if (!(obj instanceof SmartArbFundingFeePnl)) {
            return false;
        }
        SmartArbFundingFeePnl smartArbFundingFeePnl = (SmartArbFundingFeePnl) obj;
        return Intrinsics.EZpvd((Object) this.pnl, (Object) smartArbFundingFeePnl.pnl) && Intrinsics.EZpvd((Object) this.data, (Object) smartArbFundingFeePnl.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.pnl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.data;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbFundingFeePnl(pnl=" + this.pnl + ", data=" + this.data + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pnl);
        parcel.writeString(this.data);
    }

    public SmartArbFundingFeePnl(String str, String str2) {
        this.pnl = str;
        this.data = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:1352) call: com.okinc.unify_trade.bot.data.SmartArbFundingFeePnl.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartArbFundingFeePnl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Override // o.C56030xvC.Activity
    public float getChartPnl() {
        return C33129mqd.djBIcL(this.pnl);
    }

    @Override // o.C56030xvC.Activity
    public long getDateTime() {
        return C33129mqd.valueOf(this.data);
    }
}
