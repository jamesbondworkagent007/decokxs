package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PopUpInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PopUpInfo> CREATOR = new Creator();
    private final RiskWarningText textInfo;

    public static final class Creator implements Parcelable.Creator<PopUpInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopUpInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PopUpInfo(parcel.readInt() == 0 ? null : RiskWarningText.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopUpInfo[] newArray(int i) {
            return new PopUpInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PopUpInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PopUpInfo copy$default(PopUpInfo popUpInfo, RiskWarningText riskWarningText, int i, Object obj) {
        if ((i & 1) != 0) {
            riskWarningText = popUpInfo.textInfo;
        }
        return popUpInfo.copy(riskWarningText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningText component1() {
        return this.textInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopUpInfo copy(RiskWarningText riskWarningText) {
        return new PopUpInfo(riskWarningText);
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
        return (obj instanceof PopUpInfo) && Intrinsics.EZpvd(this.textInfo, ((PopUpInfo) obj).textInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningText getTextInfo() {
        return this.textInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RiskWarningText riskWarningText = this.textInfo;
        if (riskWarningText == null) {
            return 0;
        }
        return riskWarningText.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PopUpInfo(textInfo=" + this.textInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        RiskWarningText riskWarningText = this.textInfo;
        if (riskWarningText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            riskWarningText.writeToParcel(parcel, i);
        }
    }

    public PopUpInfo(RiskWarningText riskWarningText) {
        this.textInfo = riskWarningText;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.assets.backend.api.model.RiskWarningText:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.RiskWarningText) : (r1v0 com.okinc.assets.backend.api.model.RiskWarningText))
 A[MD:(com.okinc.assets.backend.api.model.RiskWarningText):void (m)] (LINE:35) call: com.okinc.assets.backend.api.model.PopUpInfo.<init>(com.okinc.assets.backend.api.model.RiskWarningText):void type: THIS */
    public /* synthetic */ PopUpInfo(RiskWarningText riskWarningText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : riskWarningText);
    }
}
