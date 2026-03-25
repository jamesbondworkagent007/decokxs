package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class RiskWarningResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RiskWarningResponse> CREATOR = new Creator();
    private final String id;
    private final PopUpInfo popupInfo;
    private final RiskWarningType type;

    public static final class Creator implements Parcelable.Creator<RiskWarningResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RiskWarningResponse(parcel.readString(), parcel.readInt() == 0 ? null : RiskWarningType.valueOf(parcel.readString()), parcel.readInt() != 0 ? PopUpInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskWarningResponse[] newArray(int i) {
            return new RiskWarningResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskWarningResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RiskWarningResponse copy$default(RiskWarningResponse riskWarningResponse, String str, RiskWarningType riskWarningType, PopUpInfo popUpInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskWarningResponse.id;
        }
        if ((i & 2) != 0) {
            riskWarningType = riskWarningResponse.type;
        }
        if ((i & 4) != 0) {
            popUpInfo = riskWarningResponse.popupInfo;
        }
        return riskWarningResponse.copy(str, riskWarningType, popUpInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopUpInfo component3() {
        return this.popupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningResponse copy(@NotNull String str, RiskWarningType riskWarningType, PopUpInfo popUpInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RiskWarningResponse(str, riskWarningType, popUpInfo);
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
        if (!(obj instanceof RiskWarningResponse)) {
            return false;
        }
        RiskWarningResponse riskWarningResponse = (RiskWarningResponse) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) riskWarningResponse.id) && this.type == riskWarningResponse.type && Intrinsics.EZpvd(this.popupInfo, riskWarningResponse.popupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopUpInfo getPopupInfo() {
        return this.popupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskWarningType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        RiskWarningType riskWarningType = this.type;
        int iHashCode2 = riskWarningType == null ? 0 : riskWarningType.hashCode();
        PopUpInfo popUpInfo = this.popupInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (popUpInfo != null ? popUpInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskWarningResponse(id=" + this.id + ", type=" + this.type + ", popupInfo=" + this.popupInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        RiskWarningType riskWarningType = this.type;
        if (riskWarningType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(riskWarningType.name());
        }
        PopUpInfo popUpInfo = this.popupInfo;
        if (popUpInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpInfo.writeToParcel(parcel, i);
        }
    }

    public RiskWarningResponse(@NotNull String str, RiskWarningType riskWarningType, PopUpInfo popUpInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.type = riskWarningType;
        this.popupInfo = popUpInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.RiskWarningType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.RiskWarningType) : (r3v0 com.okinc.assets.backend.api.model.RiskWarningType))
  (wrap:com.okinc.assets.backend.api.model.PopUpInfo:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.PopUpInfo) : (r4v0 com.okinc.assets.backend.api.model.PopUpInfo))
 A[MD:(java.lang.String, com.okinc.assets.backend.api.model.RiskWarningType, com.okinc.assets.backend.api.model.PopUpInfo):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.RiskWarningResponse.<init>(java.lang.String, com.okinc.assets.backend.api.model.RiskWarningType, com.okinc.assets.backend.api.model.PopUpInfo):void type: THIS */
    public /* synthetic */ RiskWarningResponse(String str, RiskWarningType riskWarningType, PopUpInfo popUpInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : riskWarningType, (i & 4) != 0 ? null : popUpInfo);
    }
}
