package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NewsArticleResponseBean {
    private final String image;
    private final NewsArticleImageInfoResponseBean imageInfo;
    private final long publishTime;
    private final String sourcePlatform;
    private final String sourceUrl;
    private final String summary;
    private final String title;
    private final List<NewsArticleTokenResponseBean> tokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(NewsArticleTokenResponseBean$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsArticleResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0L, (List) null, (NewsArticleImageInfoResponseBean) null, 255, (DefaultConstructorMarker) null);
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
    public final List<NewsArticleTokenResponseBean> component7() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleImageInfoResponseBean component8() {
        return this.imageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull List<NewsArticleTokenResponseBean> list, NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NewsArticleResponseBean(str, str2, str3, str4, str5, j, list, newsArticleImageInfoResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsArticleResponseBean)) {
            return false;
        }
        NewsArticleResponseBean newsArticleResponseBean = (NewsArticleResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.sourcePlatform, (Object) newsArticleResponseBean.sourcePlatform) && Intrinsics.EZpvd((Object) this.sourceUrl, (Object) newsArticleResponseBean.sourceUrl) && Intrinsics.EZpvd((Object) this.title, (Object) newsArticleResponseBean.title) && Intrinsics.EZpvd((Object) this.summary, (Object) newsArticleResponseBean.summary) && Intrinsics.EZpvd((Object) this.image, (Object) newsArticleResponseBean.image) && this.publishTime == newsArticleResponseBean.publishTime && Intrinsics.EZpvd(this.tokens, newsArticleResponseBean.tokens) && Intrinsics.EZpvd(this.imageInfo, newsArticleResponseBean.imageInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsArticleImageInfoResponseBean getImageInfo() {
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
    public final List<NewsArticleTokenResponseBean> getTokens() {
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
        NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean = this.imageInfo;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (newsArticleImageInfoResponseBean == null ? 0 : newsArticleImageInfoResponseBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsArticleResponseBean(sourcePlatform=" + this.sourcePlatform + ", sourceUrl=" + this.sourceUrl + ", title=" + this.title + ", summary=" + this.summary + ", image=" + this.image + ", publishTime=" + this.publishTime + ", tokens=" + this.tokens + ", imageInfo=" + this.imageInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.NewsArticleResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewsArticleResponseBean> serializer() {
            return NewsArticleResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewsArticleResponseBean(int i, String str, String str2, String str3, String str4, String str5, long j, List list, NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sourcePlatform = "";
        } else {
            this.sourcePlatform = str;
        }
        if ((i & 2) == 0) {
            this.sourceUrl = "";
        } else {
            this.sourceUrl = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.summary = "";
        } else {
            this.summary = str4;
        }
        if ((i & 16) == 0) {
            this.image = "";
        } else {
            this.image = str5;
        }
        if ((i & 32) == 0) {
            this.publishTime = 0L;
        } else {
            this.publishTime = j;
        }
        if ((i & 64) == 0) {
            this.tokens = yDY.AhwBna();
        } else {
            this.tokens = list;
        }
        if ((i & 128) == 0) {
            this.imageInfo = null;
        } else {
            this.imageInfo = newsArticleImageInfoResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(NewsArticleResponseBean newsArticleResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) newsArticleResponseBean.sourcePlatform, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, newsArticleResponseBean.sourcePlatform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) newsArticleResponseBean.sourceUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newsArticleResponseBean.sourceUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) newsArticleResponseBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newsArticleResponseBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) newsArticleResponseBean.summary, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newsArticleResponseBean.summary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) newsArticleResponseBean.image, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newsArticleResponseBean.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || newsArticleResponseBean.publishTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, newsArticleResponseBean.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(newsArticleResponseBean.tokens, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], newsArticleResponseBean.tokens);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && newsArticleResponseBean.imageInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, NewsArticleImageInfoResponseBean$$serializer.INSTANCE, newsArticleResponseBean.imageInfo);
    }

    public NewsArticleResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull List<NewsArticleTokenResponseBean> list, NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean) {
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
        this.imageInfo = newsArticleImageInfoResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r17v0 java.util.List))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean) : (r18v0 com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<com.okinc.crcore.coreapi.net.responsebean.NewsArticleTokenResponseBean>, com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.NewsArticleResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean):void type: THIS */
    public /* synthetic */ NewsArticleResponseBean(String str, String str2, String str3, String str4, String str5, long j, List list, NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? null : newsArticleImageInfoResponseBean);
    }
}
