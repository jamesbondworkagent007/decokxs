package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NewsArticleImageInfoBean implements Parcelable {
    public static final int $stable = 0;
    private final String category;
    private final String dark;
    private final String light;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<NewsArticleImageInfoBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewsArticleImageInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsArticleImageInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewsArticleImageInfoBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsArticleImageInfoBean[] newArray(int i) {
            return new NewsArticleImageInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsArticleImageInfoBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewsArticleImageInfoBean copy$default(NewsArticleImageInfoBean newsArticleImageInfoBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsArticleImageInfoBean.category;
        }
        if ((i & 2) != 0) {
            str2 = newsArticleImageInfoBean.dark;
        }
        if ((i & 4) != 0) {
            str3 = newsArticleImageInfoBean.light;
        }
        return newsArticleImageInfoBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleImageInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NewsArticleImageInfoBean(str, str2, str3);
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
        if (!(obj instanceof NewsArticleImageInfoBean)) {
            return false;
        }
        NewsArticleImageInfoBean newsArticleImageInfoBean = (NewsArticleImageInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.category, (Object) newsArticleImageInfoBean.category) && Intrinsics.EZpvd((Object) this.dark, (Object) newsArticleImageInfoBean.dark) && Intrinsics.EZpvd((Object) this.light, (Object) newsArticleImageInfoBean.light);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDark() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLight() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.category.hashCode() * 31) + this.dark.hashCode()) * 31) + this.light.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsArticleImageInfoBean(category=" + this.category + ", dark=" + this.dark + ", light=" + this.light + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.category);
        parcel.writeString(this.dark);
        parcel.writeString(this.light);
    }

    public NewsArticleImageInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.category = str;
        this.dark = str2;
        this.light = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewsArticleImageInfoBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final NewsArticleImageInfoBean EZpvd(@NotNull NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean) {
            Intrinsics.checkNotNullParameter(newsArticleImageInfoResponseBean, "");
            return new NewsArticleImageInfoBean(newsArticleImageInfoResponseBean.getCategory(), newsArticleImageInfoResponseBean.getDark(), newsArticleImageInfoResponseBean.getLight());
        }
    }
}
