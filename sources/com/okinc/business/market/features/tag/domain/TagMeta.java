package com.okinc.business.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagMeta implements Parcelable {
    public static final Parcelable.Creator<TagMeta> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final int AkhnZx;
    public final String DbNXlk;
    public final boolean EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final TagGroup fetchVPNInfo;
    public final String gEmmrt;
    public final String isConnected;
    public final String valueOf;

    public static final class Creator implements Parcelable.Creator<TagMeta> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagMeta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagMeta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, TagGroup.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagMeta[] newArray(int i) {
            return new TagMeta[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagMeta KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, boolean z, @NotNull TagGroup tagGroup, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(tagGroup, "");
        return new TagMeta(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, z, tagGroup, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagGroup djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagMeta)) {
            return false;
        }
        TagMeta tagMeta = (TagMeta) obj;
        return Intrinsics.EZpvd((Object) this.DbNXlk, (Object) tagMeta.DbNXlk) && Intrinsics.EZpvd((Object) this.isConnected, (Object) tagMeta.isConnected) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) tagMeta.gEmmrt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tagMeta.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tagMeta.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tagMeta.AEQbTJ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) tagMeta.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) tagMeta.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) tagMeta.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) tagMeta.AhwBna) && this.AkhnZx == tagMeta.AkhnZx && this.EZpvd == tagMeta.EZpvd && this.fetchVPNInfo == tagMeta.fetchVPNInfo && this.OLrzqt == tagMeta.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.DbNXlk.hashCode() * 31) + this.isConnected.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Integer.hashCode(this.AkhnZx)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagMeta(tagKey=" + this.DbNXlk + ", title=" + this.isConnected + ", shortTitle=" + this.gEmmrt + ", description=" + this.copydefault + ", classicDarkIcon=" + this.KWHzl + ", classicLightIcon=" + this.AEQbTJ + ", modernDarkIcon=" + this.valueOf + ", modernLightIcon=" + this.AYXKKw + ", modernDarkTextColor=" + this.djBIcL + ", modernLightTextColor=" + this.AhwBna + ", upDown=" + this.AkhnZx + ", forceRoundingIcon=" + this.EZpvd + ", tagGroup=" + this.fetchVPNInfo + ", isShowIconText=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeInt(this.AkhnZx);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.fetchVPNInfo.name());
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public TagMeta(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i, boolean z, @NotNull TagGroup tagGroup, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(tagGroup, "");
        this.DbNXlk = str;
        this.isConnected = str2;
        this.gEmmrt = str3;
        this.copydefault = str4;
        this.KWHzl = str5;
        this.AEQbTJ = str6;
        this.valueOf = str7;
        this.AYXKKw = str8;
        this.djBIcL = str9;
        this.AhwBna = str10;
        this.AkhnZx = i;
        this.EZpvd = z;
        this.fetchVPNInfo = tagGroup;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (r31v0 com.okinc.business.market.features.tag.domain.TagGroup)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, com.okinc.business.market.features.tag.domain.TagGroup, boolean):void (m)] (LINE:9) call: com.okinc.business.market.features.tag.domain.TagMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, com.okinc.business.market.features.tag.domain.TagGroup, boolean):void type: THIS */
    public /* synthetic */ TagMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, boolean z, TagGroup tagGroup, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? false : z, tagGroup, (i2 & 8192) != 0 ? false : z2);
    }
}
