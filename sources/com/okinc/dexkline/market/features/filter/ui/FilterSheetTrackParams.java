package com.okinc.dexkline.market.features.filter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FilterSheetTrackParams implements Parcelable {
    public static final Parcelable.Creator<FilterSheetTrackParams> CREATOR = new Creator();
    public final CommonTrackData AEQbTJ;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<FilterSheetTrackParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterSheetTrackParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilterSheetTrackParams(parcel.readString(), CommonTrackData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterSheetTrackParams[] newArray(int i) {
            return new FilterSheetTrackParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterSheetTrackParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterSheetTrackParams copy$default(FilterSheetTrackParams filterSheetTrackParams, String str, CommonTrackData commonTrackData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = filterSheetTrackParams.KWHzl;
        }
        if ((i & 2) != 0) {
            commonTrackData = filterSheetTrackParams.AEQbTJ;
        }
        return filterSheetTrackParams.AEQbTJ(str, commonTrackData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterSheetTrackParams AEQbTJ(@NotNull String str, @NotNull CommonTrackData commonTrackData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonTrackData, "");
        return new FilterSheetTrackParams(str, commonTrackData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonTrackData EZpvd() {
        return this.AEQbTJ;
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
        if (!(obj instanceof FilterSheetTrackParams)) {
            return false;
        }
        FilterSheetTrackParams filterSheetTrackParams = (FilterSheetTrackParams) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) filterSheetTrackParams.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, filterSheetTrackParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterSheetTrackParams(trackClick=" + this.KWHzl + ", trackView=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        this.AEQbTJ.writeToParcel(parcel, i);
    }

    public FilterSheetTrackParams(@NotNull String str, @NotNull CommonTrackData commonTrackData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonTrackData, "");
        this.KWHzl = str;
        this.AEQbTJ = commonTrackData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.features.filter.ui.CommonTrackData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.filter.ui.CommonTrackData:0x0012: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.dexkline.market.features.filter.ui.CommonTrackData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.dexkline.market.features.filter.ui.CommonTrackData))
 A[MD:(java.lang.String, com.okinc.dexkline.market.features.filter.ui.CommonTrackData):void (m)] (LINE:16) call: com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams.<init>(java.lang.String, com.okinc.dexkline.market.features.filter.ui.CommonTrackData):void type: THIS */
    public /* synthetic */ FilterSheetTrackParams(String str, CommonTrackData commonTrackData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new CommonTrackData(null, null, null, 7, null) : commonTrackData);
    }
}
