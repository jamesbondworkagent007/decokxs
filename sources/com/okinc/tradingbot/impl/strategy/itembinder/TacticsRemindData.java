package com.okinc.tradingbot.impl.strategy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsRemindData implements Parcelable {
    public static final Parcelable.Creator<TacticsRemindData> CREATOR = new Creator();
    public final boolean OLrzqt;
    public String copydefault;

    public static final class Creator implements Parcelable.Creator<TacticsRemindData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsRemindData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsRemindData(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsRemindData[] newArray(int i) {
            return new TacticsRemindData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsRemindData() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsRemindData copy$default(TacticsRemindData tacticsRemindData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tacticsRemindData.copydefault;
        }
        if ((i & 2) != 0) {
            z = tacticsRemindData.OLrzqt;
        }
        return tacticsRemindData.KWHzl(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsRemindData KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TacticsRemindData(str, z);
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
        if (!(obj instanceof TacticsRemindData)) {
            return false;
        }
        TacticsRemindData tacticsRemindData = (TacticsRemindData) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) tacticsRemindData.copydefault) && this.OLrzqt == tacticsRemindData.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsRemindData(conteny=" + this.copydefault + ", isShowDot=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public TacticsRemindData(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:357) call: com.okinc.tradingbot.impl.strategy.itembinder.TacticsRemindData.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TacticsRemindData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z);
    }
}
