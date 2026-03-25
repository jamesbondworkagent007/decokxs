package com.okinc.dexkline.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TagExtra implements Parcelable {
    public static final Parcelable.Creator<TagExtra> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final TagEventProperty KWHzl;
    public final String OLrzqt;
    public final TagLocalProperty copydefault;

    public static final class Creator implements Parcelable.Creator<TagExtra> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExtra(parcel.readString(), parcel.readString(), parcel.readString(), TagLocalProperty.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TagEventProperty.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtra[] newArray(int i) {
            return new TagExtra[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagExtra() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagExtra copy$default(TagExtra tagExtra, String str, String str2, String str3, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagExtra.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = tagExtra.EZpvd;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = tagExtra.OLrzqt;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            tagLocalProperty = tagExtra.copydefault;
        }
        TagLocalProperty tagLocalProperty2 = tagLocalProperty;
        if ((i & 16) != 0) {
            tagEventProperty = tagExtra.KWHzl;
        }
        return tagExtra.copydefault(str, str4, str5, tagLocalProperty2, tagEventProperty);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        return new TagExtra(str, str2, str3, tagLocalProperty, tagEventProperty);
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
        if (!(obj instanceof TagExtra)) {
            return false;
        }
        TagExtra tagExtra = (TagExtra) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tagExtra.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tagExtra.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tagExtra.OLrzqt) && Intrinsics.EZpvd(this.copydefault, tagExtra.copydefault) && Intrinsics.EZpvd(this.KWHzl, tagExtra.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        TagEventProperty tagEventProperty = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tagEventProperty == null ? 0 : tagEventProperty.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExtra(name=" + this.AEQbTJ + ", kolAvatarUrl=" + this.EZpvd + ", kolLink=" + this.OLrzqt + ", localProperty=" + this.copydefault + ", eventProperty=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        this.copydefault.writeToParcel(parcel, i);
        TagEventProperty tagEventProperty = this.KWHzl;
        if (tagEventProperty == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagEventProperty.writeToParcel(parcel, i);
        }
    }

    public TagExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.copydefault = tagLocalProperty;
        this.KWHzl = tagEventProperty;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:com.okinc.dexkline.market.features.tag.domain.TagLocalProperty:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: CONSTRUCTOR 
  (null java.lang.Float)
  (null java.lang.Float)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.Float)
  (127 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.dexkline.market.features.tag.domain.TagLocalProperty.<init>(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.dexkline.market.features.tag.domain.TagLocalProperty))
  (wrap:com.okinc.dexkline.market.features.tag.domain.TagEventProperty:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.tag.domain.TagEventProperty) : (r19v0 com.okinc.dexkline.market.features.tag.domain.TagEventProperty))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.tag.domain.TagLocalProperty, com.okinc.dexkline.market.features.tag.domain.TagEventProperty):void (m)] (LINE:7) call: com.okinc.dexkline.market.features.tag.domain.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.tag.domain.TagLocalProperty, com.okinc.dexkline.market.features.tag.domain.TagEventProperty):void type: THIS */
    public /* synthetic */ TagExtra(String str, String str2, String str3, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new TagLocalProperty(null, null, null, null, null, null, null, 127, null) : tagLocalProperty, (i & 16) != 0 ? null : tagEventProperty);
    }

    public final Float OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    public final Integer KWHzl() {
        return this.copydefault.KWHzl();
    }

    public final Integer copydefault() {
        return this.copydefault.AEQbTJ();
    }

    public final Float AEQbTJ() {
        return this.copydefault.copydefault();
    }
}
