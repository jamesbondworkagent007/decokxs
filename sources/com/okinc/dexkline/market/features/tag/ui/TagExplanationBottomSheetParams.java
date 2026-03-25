package com.okinc.dexkline.market.features.tag.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TagExplanationBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<TagExplanationBottomSheetParams> CREATOR = new Creator();
    public final boolean EZpvd;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<TagExplanationBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExplanationBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExplanationBottomSheetParams(parcel.readString(), parcel.readInt() != 0);
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
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagExplanationBottomSheetParams copy$default(TagExplanationBottomSheetParams tagExplanationBottomSheetParams, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagExplanationBottomSheetParams.KWHzl;
        }
        if ((i & 2) != 0) {
            z = tagExplanationBottomSheetParams.EZpvd;
        }
        return tagExplanationBottomSheetParams.copydefault(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExplanationBottomSheetParams copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TagExplanationBottomSheetParams(str, z);
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
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) tagExplanationBottomSheetParams.KWHzl) && this.EZpvd == tagExplanationBottomSheetParams.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExplanationBottomSheetParams(chainId=" + this.KWHzl + ", isMemeDetail=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public TagExplanationBottomSheetParams(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:56) call: com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheetParams.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TagExplanationBottomSheetParams(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
