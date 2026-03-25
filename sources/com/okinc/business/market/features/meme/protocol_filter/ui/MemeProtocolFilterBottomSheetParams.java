package com.okinc.business.market.features.meme.protocol_filter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeProtocolFilterBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<MemeProtocolFilterBottomSheetParams> CREATOR = new Creator();
    public final int AEQbTJ;
    public final MemeProtocolFilterUiData KWHzl;

    public static final class Creator implements Parcelable.Creator<MemeProtocolFilterBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolFilterBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeProtocolFilterBottomSheetParams(MemeProtocolFilterUiData.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolFilterBottomSheetParams[] newArray(int i) {
            return new MemeProtocolFilterBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeProtocolFilterBottomSheetParams() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeProtocolFilterBottomSheetParams copy$default(MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams, MemeProtocolFilterUiData memeProtocolFilterUiData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            memeProtocolFilterUiData = memeProtocolFilterBottomSheetParams.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = memeProtocolFilterBottomSheetParams.AEQbTJ;
        }
        return memeProtocolFilterBottomSheetParams.KWHzl(memeProtocolFilterUiData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolFilterUiData EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolFilterBottomSheetParams KWHzl(@NotNull MemeProtocolFilterUiData memeProtocolFilterUiData, int i) {
        Intrinsics.checkNotNullParameter(memeProtocolFilterUiData, "");
        return new MemeProtocolFilterBottomSheetParams(memeProtocolFilterUiData, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
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
        if (!(obj instanceof MemeProtocolFilterBottomSheetParams)) {
            return false;
        }
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams = (MemeProtocolFilterBottomSheetParams) obj;
        return Intrinsics.EZpvd(this.KWHzl, memeProtocolFilterBottomSheetParams.KWHzl) && this.AEQbTJ == memeProtocolFilterBottomSheetParams.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeProtocolFilterBottomSheetParams(filterState=" + this.KWHzl + ", tabIndex=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.KWHzl.writeToParcel(parcel, i);
        parcel.writeInt(this.AEQbTJ);
    }

    public MemeProtocolFilterBottomSheetParams(@NotNull MemeProtocolFilterUiData memeProtocolFilterUiData, int i) {
        Intrinsics.checkNotNullParameter(memeProtocolFilterUiData, "");
        this.KWHzl = memeProtocolFilterUiData;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData:0x000c: CONSTRUCTOR 
  (null java.util.List)
  (null java.util.List)
  (null java.util.List)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData.<init>(java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData, int):void (m)] (LINE:34) call: com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams.<init>(com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData, int):void type: THIS */
    public /* synthetic */ MemeProtocolFilterBottomSheetParams(MemeProtocolFilterUiData memeProtocolFilterUiData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new MemeProtocolFilterUiData(null, null, null, 7, null) : memeProtocolFilterUiData, (i2 & 2) != 0 ? 0 : i);
    }
}
