package com.okinc.business.market.features.coindetail.ui.dev_analysis;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DevAnalysisBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<DevAnalysisBottomSheetParams> CREATOR = new Creator();
    public final TagWrapper AEQbTJ;
    public final String EZpvd;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<DevAnalysisBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DevAnalysisBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DevAnalysisBottomSheetParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TagWrapper.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DevAnalysisBottomSheetParams[] newArray(int i) {
            return new DevAnalysisBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DevAnalysisBottomSheetParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DevAnalysisBottomSheetParams copy$default(DevAnalysisBottomSheetParams devAnalysisBottomSheetParams, String str, String str2, TagWrapper tagWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devAnalysisBottomSheetParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = devAnalysisBottomSheetParams.EZpvd;
        }
        if ((i & 4) != 0) {
            tagWrapper = devAnalysisBottomSheetParams.AEQbTJ;
        }
        return devAnalysisBottomSheetParams.AEQbTJ(str, str2, tagWrapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevAnalysisBottomSheetParams AEQbTJ(@NotNull String str, @NotNull String str2, TagWrapper tagWrapper) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DevAnalysisBottomSheetParams(str, str2, tagWrapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagWrapper EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof DevAnalysisBottomSheetParams)) {
            return false;
        }
        DevAnalysisBottomSheetParams devAnalysisBottomSheetParams = (DevAnalysisBottomSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) devAnalysisBottomSheetParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) devAnalysisBottomSheetParams.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, devAnalysisBottomSheetParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        TagWrapper tagWrapper = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tagWrapper == null ? 0 : tagWrapper.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DevAnalysisBottomSheetParams(chainId=" + this.copydefault + ", tokenContractAddress=" + this.EZpvd + ", devTag=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        TagWrapper tagWrapper = this.AEQbTJ;
        if (tagWrapper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagWrapper.writeToParcel(parcel, i);
        }
    }

    public DevAnalysisBottomSheetParams(@NotNull String str, @NotNull String str2, TagWrapper tagWrapper) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = tagWrapper;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.market.features.tag.domain.TagWrapper:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.domain.TagWrapper) : (r4v0 com.okinc.business.market.features.tag.domain.TagWrapper))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagWrapper):void (m)] (LINE:37) call: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheetParams.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagWrapper):void type: THIS */
    public /* synthetic */ DevAnalysisBottomSheetParams(String str, String str2, TagWrapper tagWrapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tagWrapper);
    }
}
