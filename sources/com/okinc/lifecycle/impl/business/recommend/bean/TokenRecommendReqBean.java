package com.okinc.lifecycle.impl.business.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendReqBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TokenRecommendReqBean> CREATOR = new Creator();

    @SerializedName("component")
    private final int component;

    @SerializedName(OtcExtraKeys.MODE)
    private final int mode;

    @SerializedName("token")
    private final String token;

    @SerializedName("tokenPair")
    private final String tokenPair;

    public static final class Creator implements Parcelable.Creator<TokenRecommendReqBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendReqBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenRecommendReqBean(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendReqBean[] newArray(int i) {
            return new TokenRecommendReqBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenRecommendReqBean copy$default(TokenRecommendReqBean tokenRecommendReqBean, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tokenRecommendReqBean.mode;
        }
        if ((i3 & 2) != 0) {
            i2 = tokenRecommendReqBean.component;
        }
        if ((i3 & 4) != 0) {
            str = tokenRecommendReqBean.token;
        }
        if ((i3 & 8) != 0) {
            str2 = tokenRecommendReqBean.tokenPair;
        }
        return tokenRecommendReqBean.AEQbTJ(i, i2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.component;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendReqBean AEQbTJ(int i, int i2, String str, String str2) {
        return new TokenRecommendReqBean(i, i2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.token;
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
        if (!(obj instanceof TokenRecommendReqBean)) {
            return false;
        }
        TokenRecommendReqBean tokenRecommendReqBean = (TokenRecommendReqBean) obj;
        return this.mode == tokenRecommendReqBean.mode && this.component == tokenRecommendReqBean.component && Intrinsics.EZpvd((Object) this.token, (Object) tokenRecommendReqBean.token) && Intrinsics.EZpvd((Object) this.tokenPair, (Object) tokenRecommendReqBean.tokenPair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mode);
        int iHashCode2 = Integer.hashCode(this.component);
        String str = this.token;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenPair;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenRecommendReqBean(mode=" + this.mode + ", component=" + this.component + ", token=" + this.token + ", tokenPair=" + this.tokenPair + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.mode);
        parcel.writeInt(this.component);
        parcel.writeString(this.token);
        parcel.writeString(this.tokenPair);
    }

    public TokenRecommendReqBean(int i, int i2, String str, String str2) {
        this.mode = i;
        this.component = i2;
        this.token = str;
        this.tokenPair = str2;
    }
}
