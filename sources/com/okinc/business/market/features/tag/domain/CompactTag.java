package com.okinc.business.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CompactTag implements Parcelable {
    public static final Parcelable.Creator<CompactTag> CREATOR = new Creator();
    public final String EZpvd;
    public final boolean KWHzl;
    public final TagExtra OLrzqt;

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
            str = compactTag.EZpvd;
        }
        if ((i & 2) != 0) {
            z = compactTag.KWHzl;
        }
        if ((i & 4) != 0) {
            tagExtra = compactTag.OLrzqt;
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
    public final TagExtra OLrzqt() {
        return this.OLrzqt;
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
        if (!(obj instanceof CompactTag)) {
            return false;
        }
        CompactTag compactTag = (CompactTag) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) compactTag.EZpvd) && this.KWHzl == compactTag.KWHzl && Intrinsics.EZpvd(this.OLrzqt, compactTag.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CompactTag(key=" + this.EZpvd + ", hasMetadata=" + this.KWHzl + ", extra=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        this.OLrzqt.writeToParcel(parcel, i);
    }

    public CompactTag(@NotNull String str, boolean z, @NotNull TagExtra tagExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tagExtra, "");
        this.EZpvd = str;
        this.KWHzl = z;
        this.OLrzqt = tagExtra;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:com.okinc.business.market.features.tag.domain.TagExtra:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.tag.domain.TagLocalProperty)
  (null com.okinc.business.market.features.tag.domain.TagEventProperty)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.tag.domain.TagBelongType)
  (255 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagLocalProperty, com.okinc.business.market.features.tag.domain.TagEventProperty, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagBelongType, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:10) call: com.okinc.business.market.features.tag.domain.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagLocalProperty, com.okinc.business.market.features.tag.domain.TagEventProperty, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagBelongType, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.market.features.tag.domain.TagExtra))
 A[MD:(java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagExtra):void (m)] (LINE:7) call: com.okinc.business.market.features.tag.domain.CompactTag.<init>(java.lang.String, boolean, com.okinc.business.market.features.tag.domain.TagExtra):void type: THIS */
    public /* synthetic */ CompactTag(String str, boolean z, TagExtra tagExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new TagExtra(null, null, null, null, null, null, null, null, 255, null) : tagExtra);
    }
}
