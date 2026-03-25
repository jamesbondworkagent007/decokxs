package com.okinc.lifecycle.impl.business.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendTotalBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenRecommendTotalBean> CREATOR = new Creator();

    @SerializedName("aiModelVersion")
    private final String aiModelVersion;

    @SerializedName("recTokenText")
    private final String recTokenText;

    @SerializedName("recTokenTextEn")
    private final String recTokenTextEn;

    @SerializedName("recTokenTextId")
    private final String recTokenTextId;

    @SerializedName("recTokens")
    private final List<TokenRecommendItemBean> recTokens;

    public static final class Creator implements Parcelable.Creator<TokenRecommendTotalBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendTotalBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TokenRecommendItemBean.CREATOR.createFromParcel(parcel));
            }
            return new TokenRecommendTotalBean(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenRecommendTotalBean[] newArray(int i) {
            return new TokenRecommendTotalBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenRecommendTotalBean() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenRecommendTotalBean copy$default(TokenRecommendTotalBean tokenRecommendTotalBean, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenRecommendTotalBean.recTokenText;
        }
        if ((i & 2) != 0) {
            list = tokenRecommendTotalBean.recTokens;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = tokenRecommendTotalBean.recTokenTextEn;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = tokenRecommendTotalBean.recTokenTextId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = tokenRecommendTotalBean.aiModelVersion;
        }
        return tokenRecommendTotalBean.OLrzqt(str, list2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.recTokenText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.recTokenTextId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenRecommendItemBean> KWHzl() {
        return this.recTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenRecommendTotalBean OLrzqt(@NotNull String str, @NotNull List<TokenRecommendItemBean> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TokenRecommendTotalBean(str, list, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.recTokenTextEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.aiModelVersion;
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
        if (!(obj instanceof TokenRecommendTotalBean)) {
            return false;
        }
        TokenRecommendTotalBean tokenRecommendTotalBean = (TokenRecommendTotalBean) obj;
        return Intrinsics.EZpvd((Object) this.recTokenText, (Object) tokenRecommendTotalBean.recTokenText) && Intrinsics.EZpvd(this.recTokens, tokenRecommendTotalBean.recTokens) && Intrinsics.EZpvd((Object) this.recTokenTextEn, (Object) tokenRecommendTotalBean.recTokenTextEn) && Intrinsics.EZpvd((Object) this.recTokenTextId, (Object) tokenRecommendTotalBean.recTokenTextId) && Intrinsics.EZpvd((Object) this.aiModelVersion, (Object) tokenRecommendTotalBean.aiModelVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.recTokenText.hashCode() * 31) + this.recTokens.hashCode()) * 31) + this.recTokenTextEn.hashCode()) * 31) + this.recTokenTextId.hashCode()) * 31) + this.aiModelVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenRecommendTotalBean(recTokenText=" + this.recTokenText + ", recTokens=" + this.recTokens + ", recTokenTextEn=" + this.recTokenTextEn + ", recTokenTextId=" + this.recTokenTextId + ", aiModelVersion=" + this.aiModelVersion + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.recTokenText);
        List<TokenRecommendItemBean> list = this.recTokens;
        parcel.writeInt(list.size());
        Iterator<TokenRecommendItemBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.recTokenTextEn);
        parcel.writeString(this.recTokenTextId);
        parcel.writeString(this.aiModelVersion);
    }

    public TokenRecommendTotalBean(@NotNull String str, @NotNull List<TokenRecommendItemBean> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.recTokenText = str;
        this.recTokens = list;
        this.recTokenTextEn = str2;
        this.recTokenTextId = str3;
        this.aiModelVersion = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendItemBean>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.lifecycle.impl.business.recommend.bean.TokenRecommendTotalBean.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenRecommendTotalBean(String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
