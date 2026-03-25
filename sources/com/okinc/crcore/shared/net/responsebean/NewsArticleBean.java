package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.NewsArticleResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.NewsArticleTokenResponseBean;
import com.okinc.crcore.shared.net.responsebean.NewsArticleTokenBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NewsArticleBean implements Parcelable {
    private final String image;
    private final NewsArticleImageInfoBean imageInfo;
    private final long publishTime;
    private final String sourcePlatform;
    private final String sourceUrl;
    private final String summary;
    private final String title;
    private final List<NewsArticleTokenBean> tokens;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewsArticleBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewsArticleBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsArticleBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NewsArticleTokenBean.CREATOR.createFromParcel(parcel));
            }
            return new NewsArticleBean(string, string2, string3, string4, string5, j, arrayList, parcel.readInt() == 0 ? null : NewsArticleImageInfoBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsArticleBean[] newArray(int i) {
            return new NewsArticleBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsArticleBean() {
        this(null, null, null, null, null, 0L, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sourcePlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sourceUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewsArticleTokenBean> component7() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleImageInfoBean component8() {
        return this.imageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull List<NewsArticleTokenBean> list, NewsArticleImageInfoBean newsArticleImageInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NewsArticleBean(str, str2, str3, str4, str5, j, list, newsArticleImageInfoBean);
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
        if (!(obj instanceof NewsArticleBean)) {
            return false;
        }
        NewsArticleBean newsArticleBean = (NewsArticleBean) obj;
        return Intrinsics.EZpvd((Object) this.sourcePlatform, (Object) newsArticleBean.sourcePlatform) && Intrinsics.EZpvd((Object) this.sourceUrl, (Object) newsArticleBean.sourceUrl) && Intrinsics.EZpvd((Object) this.title, (Object) newsArticleBean.title) && Intrinsics.EZpvd((Object) this.summary, (Object) newsArticleBean.summary) && Intrinsics.EZpvd((Object) this.image, (Object) newsArticleBean.image) && this.publishTime == newsArticleBean.publishTime && Intrinsics.EZpvd(this.tokens, newsArticleBean.tokens) && Intrinsics.EZpvd(this.imageInfo, newsArticleBean.imageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleImageInfoBean getImageInfo() {
        return this.imageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewsArticleTokenBean> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sourcePlatform.hashCode();
        int iHashCode2 = this.sourceUrl.hashCode();
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.summary.hashCode();
        int iHashCode5 = this.image.hashCode();
        int iHashCode6 = Long.hashCode(this.publishTime);
        int iHashCode7 = this.tokens.hashCode();
        NewsArticleImageInfoBean newsArticleImageInfoBean = this.imageInfo;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (newsArticleImageInfoBean == null ? 0 : newsArticleImageInfoBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsArticleBean(sourcePlatform=" + this.sourcePlatform + ", sourceUrl=" + this.sourceUrl + ", title=" + this.title + ", summary=" + this.summary + ", image=" + this.image + ", publishTime=" + this.publishTime + ", tokens=" + this.tokens + ", imageInfo=" + this.imageInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sourcePlatform);
        parcel.writeString(this.sourceUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.summary);
        parcel.writeString(this.image);
        parcel.writeLong(this.publishTime);
        List<NewsArticleTokenBean> list = this.tokens;
        parcel.writeInt(list.size());
        Iterator<NewsArticleTokenBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        NewsArticleImageInfoBean newsArticleImageInfoBean = this.imageInfo;
        if (newsArticleImageInfoBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsArticleImageInfoBean.writeToParcel(parcel, i);
        }
    }

    public NewsArticleBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull List<NewsArticleTokenBean> list, NewsArticleImageInfoBean newsArticleImageInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.sourcePlatform = str;
        this.sourceUrl = str2;
        this.title = str3;
        this.summary = str4;
        this.image = str5;
        this.publishTime = j;
        this.tokens = list;
        this.imageInfo = newsArticleImageInfoBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r17v0 java.util.List))
  (wrap:com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean) : (r18v0 com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<com.okinc.crcore.shared.net.responsebean.NewsArticleTokenBean>, com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.NewsArticleBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, com.okinc.crcore.shared.net.responsebean.NewsArticleImageInfoBean):void type: THIS */
    public /* synthetic */ NewsArticleBean(String str, String str2, String str3, String str4, String str5, long j, List list, NewsArticleImageInfoBean newsArticleImageInfoBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? null : newsArticleImageInfoBean);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.NewsArticleBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final NewsArticleBean copydefault(@NotNull NewsArticleResponseBean newsArticleResponseBean) {
            Intrinsics.checkNotNullParameter(newsArticleResponseBean, "");
            String sourcePlatform = newsArticleResponseBean.getSourcePlatform();
            String sourceUrl = newsArticleResponseBean.getSourceUrl();
            String title = newsArticleResponseBean.getTitle();
            String summary = newsArticleResponseBean.getSummary();
            String image = newsArticleResponseBean.getImage();
            long publishTime = newsArticleResponseBean.getPublishTime();
            List<NewsArticleTokenResponseBean> tokens = newsArticleResponseBean.getTokens();
            NewsArticleTokenBean.StateListAnimator stateListAnimator = NewsArticleTokenBean.Companion;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(tokens, 10));
            Iterator<T> it = tokens.iterator();
            while (it.hasNext()) {
                arrayList.add(stateListAnimator.KWHzl((NewsArticleTokenResponseBean) it.next()));
            }
            NewsArticleImageInfoResponseBean imageInfo = newsArticleResponseBean.getImageInfo();
            return new NewsArticleBean(sourcePlatform, sourceUrl, title, summary, image, publishTime, arrayList, imageInfo != null ? NewsArticleImageInfoBean.Companion.EZpvd(imageInfo) : null);
        }
    }
}
