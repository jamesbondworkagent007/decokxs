package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.RecommendationCard;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendationDisplayModel {
    public static final int $stable = 8;
    private final String describe;
    private final String iconUrl;
    private final String listTitle;
    private final SelfServiceDisplayModel selfServiceItem;
    private final RecommendationCard sourceBean;
    private final RecommendationTag statusTag;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecommendationDisplayModel copy$default(RecommendationDisplayModel recommendationDisplayModel, RecommendationCard recommendationCard, String str, String str2, String str3, String str4, RecommendationTag recommendationTag, SelfServiceDisplayModel selfServiceDisplayModel, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendationCard = recommendationDisplayModel.sourceBean;
        }
        if ((i & 2) != 0) {
            str = recommendationDisplayModel.title;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = recommendationDisplayModel.describe;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = recommendationDisplayModel.listTitle;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = recommendationDisplayModel.iconUrl;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            recommendationTag = recommendationDisplayModel.statusTag;
        }
        RecommendationTag recommendationTag2 = recommendationTag;
        if ((i & 64) != 0) {
            selfServiceDisplayModel = recommendationDisplayModel.selfServiceItem;
        }
        return recommendationDisplayModel.copy(recommendationCard, str5, str6, str7, str8, recommendationTag2, selfServiceDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard component1() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.describe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.listTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationTag component6() {
        return this.statusTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceDisplayModel component7() {
        return this.selfServiceItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationDisplayModel copy(@NotNull RecommendationCard recommendationCard, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, RecommendationTag recommendationTag, SelfServiceDisplayModel selfServiceDisplayModel) {
        Intrinsics.checkNotNullParameter(recommendationCard, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecommendationDisplayModel(recommendationCard, str, str2, str3, str4, recommendationTag, selfServiceDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendationDisplayModel)) {
            return false;
        }
        RecommendationDisplayModel recommendationDisplayModel = (RecommendationDisplayModel) obj;
        return Intrinsics.EZpvd(this.sourceBean, recommendationDisplayModel.sourceBean) && Intrinsics.EZpvd((Object) this.title, (Object) recommendationDisplayModel.title) && Intrinsics.EZpvd((Object) this.describe, (Object) recommendationDisplayModel.describe) && Intrinsics.EZpvd((Object) this.listTitle, (Object) recommendationDisplayModel.listTitle) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) recommendationDisplayModel.iconUrl) && Intrinsics.EZpvd(this.statusTag, recommendationDisplayModel.statusTag) && Intrinsics.EZpvd(this.selfServiceItem, recommendationDisplayModel.selfServiceItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescribe() {
        return this.describe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTitle() {
        return this.listTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceDisplayModel getSelfServiceItem() {
        return this.selfServiceItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationCard getSourceBean() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationTag getStatusTag() {
        return this.statusTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sourceBean.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.describe.hashCode();
        int iHashCode4 = this.listTitle.hashCode();
        int iHashCode5 = this.iconUrl.hashCode();
        RecommendationTag recommendationTag = this.statusTag;
        int iHashCode6 = recommendationTag == null ? 0 : recommendationTag.hashCode();
        SelfServiceDisplayModel selfServiceDisplayModel = this.selfServiceItem;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (selfServiceDisplayModel != null ? selfServiceDisplayModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendationDisplayModel(sourceBean=" + this.sourceBean + ", title=" + this.title + ", describe=" + this.describe + ", listTitle=" + this.listTitle + ", iconUrl=" + this.iconUrl + ", statusTag=" + this.statusTag + ", selfServiceItem=" + this.selfServiceItem + ")";
    }

    public RecommendationDisplayModel(@NotNull RecommendationCard recommendationCard, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, RecommendationTag recommendationTag, SelfServiceDisplayModel selfServiceDisplayModel) {
        Intrinsics.checkNotNullParameter(recommendationCard, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.sourceBean = recommendationCard;
        this.title = str;
        this.describe = str2;
        this.listTitle = str3;
        this.iconUrl = str4;
        this.statusTag = recommendationTag;
        this.selfServiceItem = selfServiceDisplayModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r11v0 com.okinc.okex.center.bean.RecommendationCard)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel$RecommendationTag:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel$RecommendationTag) : (r16v0 com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel$RecommendationTag))
  (wrap:com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel) : (r17v0 com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel))
 A[MD:(com.okinc.okex.center.bean.RecommendationCard, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel$RecommendationTag, com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel):void (m)] (LINE:8) call: com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel.<init>(com.okinc.okex.center.bean.RecommendationCard, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.ui.displaymodels.RecommendationDisplayModel$RecommendationTag, com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel):void type: THIS */
    public /* synthetic */ RecommendationDisplayModel(RecommendationCard recommendationCard, String str, String str2, String str3, String str4, RecommendationTag recommendationTag, SelfServiceDisplayModel selfServiceDisplayModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(recommendationCard, str, str2, str3, str4, (i & 32) != 0 ? null : recommendationTag, (i & 64) != 0 ? null : selfServiceDisplayModel);
    }

    public static final class RecommendationTag {
        public static final int $stable = 0;
        private final int tagStyle;
        private final String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RecommendationTag copy$default(RecommendationTag recommendationTag, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = recommendationTag.text;
            }
            if ((i2 & 2) != 0) {
                i = recommendationTag.tagStyle;
            }
            return recommendationTag.copy(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecommendationTag copy(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RecommendationTag(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendationTag)) {
                return false;
            }
            RecommendationTag recommendationTag = (RecommendationTag) obj;
            return Intrinsics.EZpvd((Object) this.text, (Object) recommendationTag.text) && this.tagStyle == recommendationTag.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTagStyle() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.text.hashCode() * 31) + Integer.hashCode(this.tagStyle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RecommendationTag(text=" + this.text + ", tagStyle=" + this.tagStyle + ")";
        }

        public RecommendationTag(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.tagStyle = i;
        }
    }
}
