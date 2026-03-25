package com.okinc.lifecycle.impl.business.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendItemBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenRecommendItemBean> CREATOR = new Creator();

    @SerializedName("dayChangePercentage24h")
    private final String dayChangePercentage24h;

    @SerializedName("dayChangePercentageUtc0")
    private final String dayChangePercentageUtc0;

    @SerializedName("dayChangePercentageUtc8")
    private final String dayChangePercentageUtc8;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName("iconURL")
    private final String iconURL;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private String price;

    @SerializedName("tokenId")
    private final long tokenId;

    @SerializedName("tokenName")
    private final String tokenName;

    public static final class Creator implements Parcelable.Creator<TokenRecommendItemBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenRecommendItemBean(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendItemBean[] newArray(int i) {
            return new TokenRecommendItemBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenRecommendItemBean() {
        this(0L, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.iconURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.dayChangePercentageUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.dayChangePercentageUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendItemBean OLrzqt(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TokenRecommendItemBean(j, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.dayChangePercentage24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.fullName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenRecommendItemBean)) {
            return false;
        }
        TokenRecommendItemBean tokenRecommendItemBean = (TokenRecommendItemBean) obj;
        return this.tokenId == tokenRecommendItemBean.tokenId && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenRecommendItemBean.tokenName) && Intrinsics.EZpvd((Object) this.fullName, (Object) tokenRecommendItemBean.fullName) && Intrinsics.EZpvd((Object) this.price, (Object) tokenRecommendItemBean.price) && Intrinsics.EZpvd((Object) this.dayChangePercentage24h, (Object) tokenRecommendItemBean.dayChangePercentage24h) && Intrinsics.EZpvd((Object) this.dayChangePercentageUtc0, (Object) tokenRecommendItemBean.dayChangePercentageUtc0) && Intrinsics.EZpvd((Object) this.dayChangePercentageUtc8, (Object) tokenRecommendItemBean.dayChangePercentageUtc8) && Intrinsics.EZpvd((Object) this.iconURL, (Object) tokenRecommendItemBean.iconURL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.tokenId) * 31) + this.tokenName.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.price.hashCode()) * 31) + this.dayChangePercentage24h.hashCode()) * 31) + this.dayChangePercentageUtc0.hashCode()) * 31) + this.dayChangePercentageUtc8.hashCode()) * 31) + this.iconURL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenRecommendItemBean(tokenId=" + this.tokenId + ", tokenName=" + this.tokenName + ", fullName=" + this.fullName + ", price=" + this.price + ", dayChangePercentage24h=" + this.dayChangePercentage24h + ", dayChangePercentageUtc0=" + this.dayChangePercentageUtc0 + ", dayChangePercentageUtc8=" + this.dayChangePercentageUtc8 + ", iconURL=" + this.iconURL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.tokenId);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.fullName);
        parcel.writeString(this.price);
        parcel.writeString(this.dayChangePercentage24h);
        parcel.writeString(this.dayChangePercentageUtc0);
        parcel.writeString(this.dayChangePercentageUtc8);
        parcel.writeString(this.iconURL);
    }

    public TokenRecommendItemBean(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.tokenId = j;
        this.tokenName = str;
        this.fullName = str2;
        this.price = str3;
        this.dayChangePercentage24h = str4;
        this.dayChangePercentageUtc0 = str5;
        this.dayChangePercentageUtc8 = str6;
        this.iconURL = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenRecommendItemBean(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }
}
