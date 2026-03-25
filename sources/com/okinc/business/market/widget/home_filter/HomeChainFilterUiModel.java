package com.okinc.business.market.widget.home_filter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeChainFilterUiModel implements kMU, Parcelable {
    public static final Parcelable.Creator<HomeChainFilterUiModel> CREATOR = new Creator();
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<HomeChainFilterUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeChainFilterUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeChainFilterUiModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeChainFilterUiModel[] newArray(int i) {
            return new HomeChainFilterUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeChainFilterUiModel copy$default(HomeChainFilterUiModel homeChainFilterUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeChainFilterUiModel.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = homeChainFilterUiModel.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = homeChainFilterUiModel.EZpvd;
        }
        return homeChainFilterUiModel.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeChainFilterUiModel EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HomeChainFilterUiModel(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof HomeChainFilterUiModel)) {
            return false;
        }
        HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) homeChainFilterUiModel.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) homeChainFilterUiModel.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) homeChainFilterUiModel.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeChainFilterUiModel(chainId=" + this.KWHzl + ", chainName=" + this.copydefault + ", iconUrl=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public HomeChainFilterUiModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:34) call: com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeChainFilterUiModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
