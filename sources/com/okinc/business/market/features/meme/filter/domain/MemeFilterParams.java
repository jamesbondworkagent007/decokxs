package com.okinc.business.market.features.meme.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterParams implements Parcelable {
    public final MemeProtocolFilterBottomSheetParams AEQbTJ;
    public final MemeFilter EZpvd;
    public final MemeFilter OLrzqt;
    public final int copydefault;
    public final boolean djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final Parcelable.Creator<MemeFilterParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MemeFilterParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeFilterParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeFilterParams(parcel.readInt() == 0 ? null : MemeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MemeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MemeProtocolFilterBottomSheetParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeFilterParams[] newArray(int i) {
            return new MemeFilterParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeFilterParams() {
        this(null, null, null, 0, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeFilterParams copy$default(MemeFilterParams memeFilterParams, MemeFilter memeFilter, MemeFilter memeFilter2, MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            memeFilter = memeFilterParams.EZpvd;
        }
        if ((i2 & 2) != 0) {
            memeFilter2 = memeFilterParams.OLrzqt;
        }
        MemeFilter memeFilter3 = memeFilter2;
        if ((i2 & 4) != 0) {
            memeProtocolFilterBottomSheetParams = memeFilterParams.AEQbTJ;
        }
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams2 = memeProtocolFilterBottomSheetParams;
        if ((i2 & 8) != 0) {
            i = memeFilterParams.copydefault;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = memeFilterParams.djBIcL;
        }
        return memeFilterParams.KWHzl(memeFilter, memeFilter3, memeProtocolFilterBottomSheetParams2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolFilterBottomSheetParams EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilterParams KWHzl(MemeFilter memeFilter, MemeFilter memeFilter2, MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams, int i, boolean z) {
        return new MemeFilterParams(memeFilter, memeFilter2, memeProtocolFilterBottomSheetParams, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter copydefault() {
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
        if (!(obj instanceof MemeFilterParams)) {
            return false;
        }
        MemeFilterParams memeFilterParams = (MemeFilterParams) obj;
        return Intrinsics.EZpvd(this.EZpvd, memeFilterParams.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, memeFilterParams.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, memeFilterParams.AEQbTJ) && this.copydefault == memeFilterParams.copydefault && this.djBIcL == memeFilterParams.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MemeFilter memeFilter = this.EZpvd;
        int iHashCode = memeFilter == null ? 0 : memeFilter.hashCode();
        MemeFilter memeFilter2 = this.OLrzqt;
        int iHashCode2 = memeFilter2 == null ? 0 : memeFilter2.hashCode();
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (memeProtocolFilterBottomSheetParams != null ? memeProtocolFilterBottomSheetParams.hashCode() : 0)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeFilterParams(memeFilter=" + this.EZpvd + ", defaultMemeFilter=" + this.OLrzqt + ", protocolParam=" + this.AEQbTJ + ", lastTab=" + this.copydefault + ", shouldDisableUnchanged=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        MemeFilter memeFilter = this.EZpvd;
        if (memeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memeFilter.writeToParcel(parcel, i);
        }
        MemeFilter memeFilter2 = this.OLrzqt;
        if (memeFilter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memeFilter2.writeToParcel(parcel, i);
        }
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams = this.AEQbTJ;
        if (memeProtocolFilterBottomSheetParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memeProtocolFilterBottomSheetParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.copydefault);
        parcel.writeInt(this.djBIcL ? 1 : 0);
    }

    public MemeFilterParams(MemeFilter memeFilter, MemeFilter memeFilter2, MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams, int i, boolean z) {
        this.EZpvd = memeFilter;
        this.OLrzqt = memeFilter2;
        this.AEQbTJ = memeProtocolFilterBottomSheetParams;
        this.copydefault = i;
        this.djBIcL = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.filter.domain.MemeFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.filter.domain.MemeFilter) : (r4v0 com.okinc.business.market.features.meme.filter.domain.MemeFilter))
  (wrap:com.okinc.business.market.features.meme.filter.domain.MemeFilter:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.filter.domain.MemeFilter) : (r5v0 com.okinc.business.market.features.meme.filter.domain.MemeFilter))
  (wrap:com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams) : (null com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
 A[MD:(com.okinc.business.market.features.meme.filter.domain.MemeFilter, com.okinc.business.market.features.meme.filter.domain.MemeFilter, com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams, int, boolean):void (m)] (LINE:82) call: com.okinc.business.market.features.meme.filter.domain.MemeFilterParams.<init>(com.okinc.business.market.features.meme.filter.domain.MemeFilter, com.okinc.business.market.features.meme.filter.domain.MemeFilter, com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams, int, boolean):void type: THIS */
    public /* synthetic */ MemeFilterParams(MemeFilter memeFilter, MemeFilter memeFilter2, MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : memeFilter, (i2 & 2) != 0 ? null : memeFilter2, (i2 & 4) == 0 ? memeProtocolFilterBottomSheetParams : null, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? true : z);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.filter.domain.MemeFilterParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
