package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class GuideLottieCard implements Parcelable {
    public static final Parcelable.Creator<GuideLottieCard> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String OLrzqt;
    public final Integer copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<GuideLottieCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideLottieCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GuideLottieCard(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideLottieCard[] newArray(int i) {
            return new GuideLottieCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GuideLottieCard copy$default(GuideLottieCard guideLottieCard, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guideLottieCard.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = guideLottieCard.AEQbTJ;
        }
        if ((i & 4) != 0) {
            num = guideLottieCard.copydefault;
        }
        if ((i & 8) != 0) {
            str3 = guideLottieCard.OLrzqt;
        }
        return guideLottieCard.EZpvd(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideLottieCard EZpvd(@NotNull String str, @NotNull String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GuideLottieCard(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof GuideLottieCard)) {
            return false;
        }
        GuideLottieCard guideLottieCard = (GuideLottieCard) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) guideLottieCard.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) guideLottieCard.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, guideLottieCard.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) guideLottieCard.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        Integer num = this.copydefault;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GuideLottieCard(title=" + this.EZpvd + ", desc=" + this.AEQbTJ + ", lottieFile=" + this.copydefault + ", gifUrl=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        Integer num = this.copydefault;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.OLrzqt);
    }

    public GuideLottieCard(@NotNull String str, @NotNull String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.copydefault = num;
        this.OLrzqt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:75) call: com.okinc.tradingbot.impl.strategy.bean.GuideLottieCard.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ GuideLottieCard(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
