package com.okinc.okex.search.ui.displaymodels;

import com.okinc.okex.center.bean.enums.CategorySlug;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchArticleDisplayModel {
    public static final int $stable = 0;
    private final String categoryName;
    private final CategorySlug categorySlug;
    private final int okxLikesNums;
    private final long publishTime;
    private final String sectionId;
    private final String sectionName;
    private final String sectionSlug;
    private final String slug;
    private final String title;
    private final long updateTime;
    private final String url;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, CategorySlug.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sectionSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategorySlug component8() {
        return this.categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.sectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchArticleDisplayModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, int i, @NotNull String str4, @NotNull CategorySlug categorySlug, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(categorySlug, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SearchArticleDisplayModel(str, str2, str3, j, j2, i, str4, categorySlug, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchArticleDisplayModel)) {
            return false;
        }
        SearchArticleDisplayModel searchArticleDisplayModel = (SearchArticleDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) searchArticleDisplayModel.title) && Intrinsics.EZpvd((Object) this.url, (Object) searchArticleDisplayModel.url) && Intrinsics.EZpvd((Object) this.slug, (Object) searchArticleDisplayModel.slug) && this.publishTime == searchArticleDisplayModel.publishTime && this.updateTime == searchArticleDisplayModel.updateTime && this.okxLikesNums == searchArticleDisplayModel.okxLikesNums && Intrinsics.EZpvd((Object) this.categoryName, (Object) searchArticleDisplayModel.categoryName) && this.categorySlug == searchArticleDisplayModel.categorySlug && Intrinsics.EZpvd((Object) this.sectionId, (Object) searchArticleDisplayModel.sectionId) && Intrinsics.EZpvd((Object) this.sectionName, (Object) searchArticleDisplayModel.sectionName) && Intrinsics.EZpvd((Object) this.sectionSlug, (Object) searchArticleDisplayModel.sectionSlug);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategorySlug getCategorySlug() {
        return this.categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOkxLikesNums() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionId() {
        return this.sectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionSlug() {
        return this.sectionSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.title.hashCode() * 31) + this.url.hashCode()) * 31) + this.slug.hashCode()) * 31) + Long.hashCode(this.publishTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.okxLikesNums)) * 31) + this.categoryName.hashCode()) * 31) + this.categorySlug.hashCode()) * 31) + this.sectionId.hashCode()) * 31) + this.sectionName.hashCode()) * 31) + this.sectionSlug.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchArticleDisplayModel(title=" + this.title + ", url=" + this.url + ", slug=" + this.slug + ", publishTime=" + this.publishTime + ", updateTime=" + this.updateTime + ", okxLikesNums=" + this.okxLikesNums + ", categoryName=" + this.categoryName + ", categorySlug=" + this.categorySlug + ", sectionId=" + this.sectionId + ", sectionName=" + this.sectionName + ", sectionSlug=" + this.sectionSlug + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchArticleDisplayModel> serializer() {
            return SearchArticleDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchArticleDisplayModel(int i, String str, String str2, String str3, long j, long j2, int i2, String str4, CategorySlug categorySlug, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, SearchArticleDisplayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.url = str2;
        this.slug = str3;
        this.publishTime = j;
        this.updateTime = j2;
        this.okxLikesNums = i2;
        this.categoryName = str4;
        this.categorySlug = categorySlug;
        this.sectionId = str5;
        this.sectionName = str6;
        this.sectionSlug = str7;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchArticleDisplayModel searchArticleDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, searchArticleDisplayModel.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, searchArticleDisplayModel.url);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, searchArticleDisplayModel.slug);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, searchArticleDisplayModel.publishTime);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, searchArticleDisplayModel.updateTime);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, searchArticleDisplayModel.okxLikesNums);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, searchArticleDisplayModel.categoryName);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], searchArticleDisplayModel.categorySlug);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, searchArticleDisplayModel.sectionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, searchArticleDisplayModel.sectionName);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, searchArticleDisplayModel.sectionSlug);
    }

    public SearchArticleDisplayModel(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, int i, @NotNull String str4, @NotNull CategorySlug categorySlug, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(categorySlug, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.title = str;
        this.url = str2;
        this.slug = str3;
        this.publishTime = j;
        this.updateTime = j2;
        this.okxLikesNums = i;
        this.categoryName = str4;
        this.categorySlug = categorySlug;
        this.sectionId = str5;
        this.sectionName = str6;
        this.sectionSlug = str7;
    }
}
