package com.okinc.business.market.features.tag.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.widget.tag.TagEventSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagExplanationBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<TagExplanationBottomSheetParams> CREATOR = new Creator();
    public final TagEventSource AEQbTJ;
    public final boolean EZpvd;
    public final TagStaticDataParams KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<TagExplanationBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExplanationBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExplanationBottomSheetParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TagStaticDataParams.CREATOR.createFromParcel(parcel), TagEventSource.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExplanationBottomSheetParams[] newArray(int i) {
            return new TagExplanationBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagExplanationBottomSheetParams() {
        this(null, null, false, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagExplanationBottomSheetParams copy$default(TagExplanationBottomSheetParams tagExplanationBottomSheetParams, String str, String str2, boolean z, TagStaticDataParams tagStaticDataParams, TagEventSource tagEventSource, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagExplanationBottomSheetParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = tagExplanationBottomSheetParams.valueOf;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = tagExplanationBottomSheetParams.EZpvd;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            tagStaticDataParams = tagExplanationBottomSheetParams.KWHzl;
        }
        TagStaticDataParams tagStaticDataParams2 = tagStaticDataParams;
        if ((i & 16) != 0) {
            tagEventSource = tagExplanationBottomSheetParams.AEQbTJ;
        }
        TagEventSource tagEventSource2 = tagEventSource;
        if ((i & 32) != 0) {
            z2 = tagExplanationBottomSheetParams.OLrzqt;
        }
        return tagExplanationBottomSheetParams.AEQbTJ(str, str3, z3, tagStaticDataParams2, tagEventSource2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExplanationBottomSheetParams AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, TagStaticDataParams tagStaticDataParams, @NotNull TagEventSource tagEventSource, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tagEventSource, "");
        return new TagExplanationBottomSheetParams(str, str2, z, tagStaticDataParams, tagEventSource, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagEventSource AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagStaticDataParams copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof TagExplanationBottomSheetParams)) {
            return false;
        }
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = (TagExplanationBottomSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) tagExplanationBottomSheetParams.copydefault) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tagExplanationBottomSheetParams.valueOf) && this.EZpvd == tagExplanationBottomSheetParams.EZpvd && Intrinsics.EZpvd(this.KWHzl, tagExplanationBottomSheetParams.KWHzl) && this.AEQbTJ == tagExplanationBottomSheetParams.AEQbTJ && this.OLrzqt == tagExplanationBottomSheetParams.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.valueOf.hashCode();
        int iHashCode3 = Boolean.hashCode(this.EZpvd);
        TagStaticDataParams tagStaticDataParams = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tagStaticDataParams == null ? 0 : tagStaticDataParams.hashCode())) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExplanationBottomSheetParams(chainId=" + this.copydefault + ", tokenContractAddress=" + this.valueOf + ", fromTokenDetail=" + this.EZpvd + ", tagStaticData=" + this.KWHzl + ", eventSource=" + this.AEQbTJ + ", fillParentHeight=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        TagStaticDataParams tagStaticDataParams = this.KWHzl;
        if (tagStaticDataParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagStaticDataParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public TagExplanationBottomSheetParams(@NotNull String str, @NotNull String str2, boolean z, TagStaticDataParams tagStaticDataParams, @NotNull TagEventSource tagEventSource, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tagEventSource, "");
        this.copydefault = str;
        this.valueOf = str2;
        this.EZpvd = z;
        this.KWHzl = tagStaticDataParams;
        this.AEQbTJ = tagEventSource;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:com.okinc.business.market.features.tag.ui.TagStaticDataParams:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.ui.TagStaticDataParams) : (r8v0 com.okinc.business.market.features.tag.ui.TagStaticDataParams))
  (wrap:com.okinc.business.market.widget.tag.TagEventSource:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.widget.tag.TagEventSource:0x0021: SGET  A[WRAPPED] (LINE:25) com.okinc.business.market.widget.tag.TagEventSource.HOMEPAGE com.okinc.business.market.widget.tag.TagEventSource) : (r9v0 com.okinc.business.market.widget.tag.TagEventSource))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.business.market.features.tag.ui.TagStaticDataParams, com.okinc.business.market.widget.tag.TagEventSource, boolean):void (m)] (LINE:20) call: com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams.<init>(java.lang.String, java.lang.String, boolean, com.okinc.business.market.features.tag.ui.TagStaticDataParams, com.okinc.business.market.widget.tag.TagEventSource, boolean):void type: THIS */
    public /* synthetic */ TagExplanationBottomSheetParams(String str, String str2, boolean z, TagStaticDataParams tagStaticDataParams, TagEventSource tagEventSource, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : tagStaticDataParams, (i & 16) != 0 ? TagEventSource.HOMEPAGE : tagEventSource, (i & 32) != 0 ? false : z2);
    }
}
