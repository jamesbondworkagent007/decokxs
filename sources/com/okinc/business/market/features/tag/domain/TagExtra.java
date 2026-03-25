package com.okinc.business.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagExtra implements Parcelable {
    public static final Parcelable.Creator<TagExtra> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final TagEventProperty OLrzqt;
    public final TagBelongType copydefault;
    public final TagLocalProperty djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<TagExtra> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagExtra(parcel.readString(), parcel.readString(), parcel.readString(), TagLocalProperty.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TagEventProperty.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), TagBelongType.CREATOR.createFromParcel(parcel));
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
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagExtra EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, String str4, String str5, @NotNull TagBelongType tagBelongType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        Intrinsics.checkNotNullParameter(tagBelongType, "");
        return new TagExtra(str, str2, str3, tagLocalProperty, tagEventProperty, str4, str5, tagBelongType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagEventProperty KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagBelongType copydefault() {
        return this.copydefault;
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
        return Intrinsics.EZpvd((Object) this.AhwBna, (Object) tagExtra.AhwBna) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tagExtra.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tagExtra.KWHzl) && Intrinsics.EZpvd(this.djBIcL, tagExtra.djBIcL) && Intrinsics.EZpvd(this.OLrzqt, tagExtra.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tagExtra.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) tagExtra.gEmmrt) && this.copydefault == tagExtra.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        TagEventProperty tagEventProperty = this.OLrzqt;
        int iHashCode5 = tagEventProperty == null ? 0 : tagEventProperty.hashCode();
        String str = this.AEQbTJ;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.gEmmrt;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagExtra(name=" + this.AhwBna + ", kolAvatarUrl=" + this.EZpvd + ", kolLink=" + this.KWHzl + ", localProperty=" + this.djBIcL + ", eventProperty=" + this.OLrzqt + ", iconText=" + this.AEQbTJ + ", rwaPlatform=" + this.gEmmrt + ", belong=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        this.djBIcL.writeToParcel(parcel, i);
        TagEventProperty tagEventProperty = this.OLrzqt;
        if (tagEventProperty == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tagEventProperty.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        this.copydefault.writeToParcel(parcel, i);
    }

    public TagExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, String str4, String str5, @NotNull TagBelongType tagBelongType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tagLocalProperty, "");
        Intrinsics.checkNotNullParameter(tagBelongType, "");
        this.AhwBna = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.djBIcL = tagLocalProperty;
        this.OLrzqt = tagEventProperty;
        this.AEQbTJ = str4;
        this.gEmmrt = str5;
        this.copydefault = tagBelongType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r24v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.tag.domain.TagLocalProperty:?: TERNARY null = ((wrap:int:0x001b: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: CONSTRUCTOR 
  (null java.lang.Float)
  (null java.lang.Float)
  (null java.lang.Integer)
  (null java.lang.Float)
  (null java.lang.Integer)
  (null java.lang.Integer)
  (null java.lang.Float)
  (127 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.business.market.features.tag.domain.TagLocalProperty.<init>(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.market.features.tag.domain.TagLocalProperty))
  (wrap:com.okinc.business.market.features.tag.domain.TagEventProperty:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.domain.TagEventProperty) : (r20v0 com.okinc.business.market.features.tag.domain.TagEventProperty))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r24v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:com.okinc.business.market.features.tag.domain.TagBelongType:?: TERNARY null = ((wrap:int:0x004a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.features.tag.domain.TagBelongType.NONE com.okinc.business.market.features.tag.domain.TagBelongType) : (r23v0 com.okinc.business.market.features.tag.domain.TagBelongType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagLocalProperty, com.okinc.business.market.features.tag.domain.TagEventProperty, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagBelongType):void (m)] (LINE:7) call: com.okinc.business.market.features.tag.domain.TagExtra.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagLocalProperty, com.okinc.business.market.features.tag.domain.TagEventProperty, java.lang.String, java.lang.String, com.okinc.business.market.features.tag.domain.TagBelongType):void type: THIS */
    public /* synthetic */ TagExtra(String str, String str2, String str3, TagLocalProperty tagLocalProperty, TagEventProperty tagEventProperty, String str4, String str5, TagBelongType tagBelongType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new TagLocalProperty(null, null, null, null, null, null, null, 127, null) : tagLocalProperty, (i & 16) != 0 ? null : tagEventProperty, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? str5 : null, (i & 128) != 0 ? TagBelongType.NONE : tagBelongType);
    }

    public final Float values() {
        return this.djBIcL.djBIcL();
    }

    public final Integer AYXKKw() {
        return this.djBIcL.AEQbTJ();
    }

    public final Float AhwBna() {
        return this.djBIcL.copydefault();
    }

    public final Integer djBIcL() {
        return this.djBIcL.EZpvd();
    }

    public final Integer AEQbTJ() {
        return this.djBIcL.KWHzl();
    }

    public final Float OLrzqt() {
        return this.djBIcL.OLrzqt();
    }
}
