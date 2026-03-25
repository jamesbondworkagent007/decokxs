package com.okinc.business.market.features.meme.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.data.model.XPostType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewParams implements Parcelable {
    public static final Parcelable.Creator<TwitterPreviewParams> CREATOR = new Creator();
    public final XPostType AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<TwitterPreviewParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwitterPreviewParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TwitterPreviewParams(parcel.readString(), parcel.readString(), XPostType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwitterPreviewParams[] newArray(int i) {
            return new TwitterPreviewParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwitterPreviewParams() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwitterPreviewParams copy$default(TwitterPreviewParams twitterPreviewParams, String str, String str2, XPostType xPostType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twitterPreviewParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = twitterPreviewParams.KWHzl;
        }
        if ((i & 4) != 0) {
            xPostType = twitterPreviewParams.AEQbTJ;
        }
        if ((i & 8) != 0) {
            str3 = twitterPreviewParams.EZpvd;
        }
        return twitterPreviewParams.EZpvd(str, str2, xPostType, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwitterPreviewParams EZpvd(@NotNull String str, @NotNull String str2, @NotNull XPostType xPostType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(xPostType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TwitterPreviewParams(str, str2, xPostType, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XPostType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof TwitterPreviewParams)) {
            return false;
        }
        TwitterPreviewParams twitterPreviewParams = (TwitterPreviewParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) twitterPreviewParams.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) twitterPreviewParams.KWHzl) && this.AEQbTJ == twitterPreviewParams.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) twitterPreviewParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwitterPreviewParams(chainId=" + this.copydefault + ", tokenAddress=" + this.KWHzl + ", postType=" + this.AEQbTJ + ", fallbackRedirect=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.EZpvd);
    }

    public TwitterPreviewParams(@NotNull String str, @NotNull String str2, @NotNull XPostType xPostType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(xPostType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.AEQbTJ = xPostType;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.data.model.XPostType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.meme.data.model.XPostType:0x0010: SGET  A[WRAPPED] (LINE:49) com.okinc.business.market.features.meme.data.model.XPostType.PROFILE com.okinc.business.market.features.meme.data.model.XPostType) : (r4v0 com.okinc.business.market.features.meme.data.model.XPostType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String):void (m)] (LINE:46) call: com.okinc.business.market.features.meme.preview.TwitterPreviewParams.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.meme.data.model.XPostType, java.lang.String):void type: THIS */
    public /* synthetic */ TwitterPreviewParams(String str, String str2, XPostType xPostType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? XPostType.PROFILE : xPostType, (i & 8) != 0 ? "" : str3);
    }
}
