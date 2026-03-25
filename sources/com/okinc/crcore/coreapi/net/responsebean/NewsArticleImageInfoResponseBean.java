package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NewsArticleImageInfoResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String category;
    private final String dark;
    private final String light;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsArticleImageInfoResponseBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewsArticleImageInfoResponseBean copy$default(NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsArticleImageInfoResponseBean.category;
        }
        if ((i & 2) != 0) {
            str2 = newsArticleImageInfoResponseBean.dark;
        }
        if ((i & 4) != 0) {
            str3 = newsArticleImageInfoResponseBean.light;
        }
        return newsArticleImageInfoResponseBean.copy(str, str2, str3);
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
    public final NewsArticleImageInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NewsArticleImageInfoResponseBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsArticleImageInfoResponseBean)) {
            return false;
        }
        NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean = (NewsArticleImageInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.category, (Object) newsArticleImageInfoResponseBean.category) && Intrinsics.EZpvd((Object) this.dark, (Object) newsArticleImageInfoResponseBean.dark) && Intrinsics.EZpvd((Object) this.light, (Object) newsArticleImageInfoResponseBean.light);
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
        return "NewsArticleImageInfoResponseBean(category=" + this.category + ", dark=" + this.dark + ", light=" + this.light + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewsArticleImageInfoResponseBean> serializer() {
            return NewsArticleImageInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewsArticleImageInfoResponseBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.category = "";
        } else {
            this.category = str;
        }
        if ((i & 2) == 0) {
            this.dark = "";
        } else {
            this.dark = str2;
        }
        if ((i & 4) == 0) {
            this.light = "";
        } else {
            this.light = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(NewsArticleImageInfoResponseBean newsArticleImageInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) newsArticleImageInfoResponseBean.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, newsArticleImageInfoResponseBean.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) newsArticleImageInfoResponseBean.dark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newsArticleImageInfoResponseBean.dark);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) newsArticleImageInfoResponseBean.light, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, newsArticleImageInfoResponseBean.light);
    }

    public NewsArticleImageInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.NewsArticleImageInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewsArticleImageInfoResponseBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
