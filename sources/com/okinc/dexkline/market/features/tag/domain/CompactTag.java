package com.okinc.dexkline.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CompactTag implements Parcelable {
    public static final Parcelable.Creator<CompactTag> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final TagExtra KWHzl;

    public static final class Creator implements Parcelable.Creator<CompactTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompactTag(parcel.readString(), parcel.readInt() != 0, TagExtra.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompactTag[] newArray(int i) {
            return new CompactTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CompactTag() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CompactTag copy$default(CompactTag compactTag, String str, boolean z, TagExtra tagExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = compactTag.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = compactTag.EZpvd;
        }
        if ((i & 4) != 0) {
            tagExtra = compactTag.KWHzl;
        }
        return compactTag.AEQbTJ(str, z, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompactTag AEQbTJ(@NotNull String str, boolean z, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        return new CompactTag(str, z, tagExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof CompactTag)) {
            return false;
        }
        CompactTag compactTag = (CompactTag) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) compactTag.AEQbTJ) && this.EZpvd == compactTag.EZpvd && Intrinsics.EZpvd(this.KWHzl, compactTag.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompactTag(key=" + this.AEQbTJ + ", hasMetadata=" + this.EZpvd + ", extra=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        this.KWHzl.writeToParcel(parcel, i);
    }

    public CompactTag(@NotNull String str, boolean z, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        this.AEQbTJ = str;
        this.EZpvd = z;
        this.KWHzl = tagExtra;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:com.okinc.dexkline.market.features.tag.domain.TagExtra:?: TERNARY null = ((wrap:int:0x000b: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.tag.domain.TagExtra:0x001a: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.dexkline.market.features.tag.domain.TagLocalProperty)
  (null com.okinc.dexkline.market.features.tag.domain.TagEventProperty)
  (31 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.tag.domain.TagLocalProperty, com.okinc.dexkline.market.features.tag.domain.TagEventProperty, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.dexkline.market.features.tag.domain.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.tag.domain.TagLocalProperty, com.okinc.dexkline.market.features.tag.domain.TagEventProperty, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 com.okinc.dexkline.market.features.tag.domain.TagExtra))
 A[MD:(java.lang.String, boolean, com.okinc.dexkline.market.features.tag.domain.TagExtra):void (m)] (LINE:7) call: com.okinc.dexkline.market.features.tag.domain.CompactTag.<init>(java.lang.String, boolean, com.okinc.dexkline.market.features.tag.domain.TagExtra):void type: THIS */
    public /* synthetic */ CompactTag(String str, boolean z, TagExtra tagExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new TagExtra(null, null, null, null, null, 31, null) : tagExtra);
    }
}
