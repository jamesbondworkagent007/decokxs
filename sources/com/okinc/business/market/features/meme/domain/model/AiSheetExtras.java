package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AiSheetExtras implements Parcelable {
    public static final Parcelable.Creator<AiSheetExtras> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<AiSheetExtras> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiSheetExtras createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AiSheetExtras(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiSheetExtras[] newArray(int i) {
            return new AiSheetExtras[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AiSheetExtras() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AiSheetExtras copy$default(AiSheetExtras aiSheetExtras, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiSheetExtras.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = aiSheetExtras.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = aiSheetExtras.copydefault;
        }
        return aiSheetExtras.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AiSheetExtras AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AiSheetExtras(str, str2, str3);
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
        if (!(obj instanceof AiSheetExtras)) {
            return false;
        }
        AiSheetExtras aiSheetExtras = (AiSheetExtras) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) aiSheetExtras.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) aiSheetExtras.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) aiSheetExtras.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AiSheetExtras(website=" + this.OLrzqt + ", telegram=" + this.AEQbTJ + ", search=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
    }

    public AiSheetExtras(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:73) call: com.okinc.business.market.features.meme.domain.model.AiSheetExtras.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AiSheetExtras(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
