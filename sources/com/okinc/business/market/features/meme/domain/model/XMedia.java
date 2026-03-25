package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.data.model.XPostType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class XMedia implements Parcelable {
    public static final Parcelable.Creator<XMedia> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String KWHzl;
    public final String OLrzqt;
    public final XPostType copydefault;

    public static final class Creator implements Parcelable.Creator<XMedia> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XMedia createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new XMedia(parcel.readString(), parcel.readInt() == 0 ? null : XPostType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XMedia[] newArray(int i) {
            return new XMedia[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XMedia() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ XMedia copy$default(XMedia xMedia, String str, XPostType xPostType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xMedia.AEQbTJ;
        }
        if ((i & 2) != 0) {
            xPostType = xMedia.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = xMedia.KWHzl;
        }
        if ((i & 8) != 0) {
            str3 = xMedia.OLrzqt;
        }
        return xMedia.EZpvd(str, xPostType, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XMedia EZpvd(@NotNull String str, XPostType xPostType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new XMedia(str, xPostType, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XPostType OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof XMedia)) {
            return false;
        }
        XMedia xMedia = (XMedia) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) xMedia.AEQbTJ) && this.copydefault == xMedia.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) xMedia.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) xMedia.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        XPostType xPostType = this.copydefault;
        return (((((iHashCode * 31) + (xPostType == null ? 0 : xPostType.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "XMedia(url=" + this.AEQbTJ + ", type=" + this.copydefault + ", xTime=" + this.KWHzl + ", xrenameCnt=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        XPostType xPostType = this.copydefault;
        if (xPostType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(xPostType.name());
        }
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
    }

    public XMedia(@NotNull String str, XPostType xPostType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AEQbTJ = str;
        this.copydefault = xPostType;
        this.KWHzl = str2;
        this.OLrzqt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.XPostType:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.data.model.XPostType) : (r3v0 com.okinc.business.market.features.meme.data.model.XPostType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.market.features.meme.domain.model.XMedia.<init>(java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ XMedia(String str, XPostType xPostType, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : xPostType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
