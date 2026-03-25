package com.okinc.business.dex.trade.common.expire.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpireTimeData implements Parcelable {
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final Parcelable.Creator<ExpireTimeData> CREATOR = new Creator();
    public static final ExpireTimeData EZpvd = new ExpireTimeData(null, null, null, 7, null);

    public static final class Creator implements Parcelable.Creator<ExpireTimeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExpireTimeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExpireTimeData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExpireTimeData[] newArray(int i) {
            return new ExpireTimeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExpireTimeData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExpireTimeData copy$default(ExpireTimeData expireTimeData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expireTimeData.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = expireTimeData.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = expireTimeData.OLrzqt;
        }
        return expireTimeData.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExpireTimeData copydefault(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new ExpireTimeData(str, str2, str3);
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
        if (!(obj instanceof ExpireTimeData)) {
            return false;
        }
        ExpireTimeData expireTimeData = (ExpireTimeData) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) expireTimeData.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) expireTimeData.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) expireTimeData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExpireTimeData(id=" + this.KWHzl + ", customTime=" + this.copydefault + ", textTime=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
    }

    public ExpireTimeData(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.OLrzqt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.dex.trade.common.expire.model.ExpireTimeData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ExpireTimeData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.common.expire.model.ExpireTimeData.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ExpireTimeData OLrzqt() {
            return ExpireTimeData.EZpvd;
        }
    }
}
