package com.okinc.business.market.features.meme.aped_together.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<ApedTogetherBottomSheetParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<ApedTogetherBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApedTogetherBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApedTogetherBottomSheetParams(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApedTogetherBottomSheetParams[] newArray(int i) {
            return new ApedTogetherBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApedTogetherBottomSheetParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApedTogetherBottomSheetParams copy$default(ApedTogetherBottomSheetParams apedTogetherBottomSheetParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apedTogetherBottomSheetParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = apedTogetherBottomSheetParams.AEQbTJ;
        }
        return apedTogetherBottomSheetParams.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApedTogetherBottomSheetParams copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ApedTogetherBottomSheetParams(str, str2);
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
        if (!(obj instanceof ApedTogetherBottomSheetParams)) {
            return false;
        }
        ApedTogetherBottomSheetParams apedTogetherBottomSheetParams = (ApedTogetherBottomSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) apedTogetherBottomSheetParams.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) apedTogetherBottomSheetParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApedTogetherBottomSheetParams(tokenContractAddress=" + this.OLrzqt + ", chainId=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
    }

    public ApedTogetherBottomSheetParams(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheetParams.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ApedTogetherBottomSheetParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
