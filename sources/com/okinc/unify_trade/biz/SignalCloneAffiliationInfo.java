package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SignalCloneAffiliationInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SignalCloneAffiliationInfo> CREATOR = new Creator();
    private final String hasAffiliation;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SignalCloneAffiliationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCloneAffiliationInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalCloneAffiliationInfo(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCloneAffiliationInfo[] newArray(int i) {
            return new SignalCloneAffiliationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalCloneAffiliationInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalCloneAffiliationInfo copy$default(SignalCloneAffiliationInfo signalCloneAffiliationInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalCloneAffiliationInfo.hasAffiliation;
        }
        return signalCloneAffiliationInfo.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.hasAffiliation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalCloneAffiliationInfo copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalCloneAffiliationInfo(str);
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
        return (obj instanceof SignalCloneAffiliationInfo) && Intrinsics.EZpvd((Object) this.hasAffiliation, (Object) ((SignalCloneAffiliationInfo) obj).hasAffiliation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasAffiliation() {
        return this.hasAffiliation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.hasAffiliation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalCloneAffiliationInfo(hasAffiliation=" + this.hasAffiliation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.hasAffiliation);
    }

    public SignalCloneAffiliationInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hasAffiliation = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:4652) call: com.okinc.unify_trade.biz.SignalCloneAffiliationInfo.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SignalCloneAffiliationInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }

    public final boolean hasAffiliation() {
        return Intrinsics.EZpvd((Object) this.hasAffiliation, (Object) "1");
    }
}
