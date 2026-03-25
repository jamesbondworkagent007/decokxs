package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TransactionBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class RecommendCardDisplayModel {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecommendCardDisplayModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecommendCardDisplayModel() {
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class VideoMeetingCardDisplayModel extends RecommendCardDisplayModel {
        public static final int $stable = 0;
        private final String ctaButtonText;
        private final String describe;
        private final Integer icon;
        private final String id;
        private final boolean isCtaButtonClickable;
        private final boolean isOngoing;
        private final Integer tagStyle;
        private final String tagText;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
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
            return this.ctaButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component5() {
            return this.isCtaButtonClickable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component6() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.tagText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isOngoing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component9() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VideoMeetingCardDisplayModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, Integer num, String str5, boolean z2, Integer num2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new VideoMeetingCardDisplayModel(str, str2, str3, str4, z, num, str5, z2, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMeetingCardDisplayModel)) {
                return false;
            }
            VideoMeetingCardDisplayModel videoMeetingCardDisplayModel = (VideoMeetingCardDisplayModel) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) videoMeetingCardDisplayModel.id) && Intrinsics.EZpvd((Object) this.title, (Object) videoMeetingCardDisplayModel.title) && Intrinsics.EZpvd((Object) this.describe, (Object) videoMeetingCardDisplayModel.describe) && Intrinsics.EZpvd((Object) this.ctaButtonText, (Object) videoMeetingCardDisplayModel.ctaButtonText) && this.isCtaButtonClickable == videoMeetingCardDisplayModel.isCtaButtonClickable && Intrinsics.EZpvd(this.icon, videoMeetingCardDisplayModel.icon) && Intrinsics.EZpvd((Object) this.tagText, (Object) videoMeetingCardDisplayModel.tagText) && this.isOngoing == videoMeetingCardDisplayModel.isOngoing && Intrinsics.EZpvd(this.tagStyle, videoMeetingCardDisplayModel.tagStyle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCtaButtonText() {
            return this.ctaButtonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescribe() {
            return this.describe;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getIcon() {
            return this.icon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getTagStyle() {
            return this.tagStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTagText() {
            return this.tagText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.id.hashCode();
            int iHashCode2 = this.title.hashCode();
            int iHashCode3 = this.describe.hashCode();
            int iHashCode4 = this.ctaButtonText.hashCode();
            int iHashCode5 = Boolean.hashCode(this.isCtaButtonClickable);
            Integer num = this.icon;
            int iHashCode6 = num == null ? 0 : num.hashCode();
            String str = this.tagText;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            int iHashCode8 = Boolean.hashCode(this.isOngoing);
            Integer num2 = this.tagStyle;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isCtaButtonClickable() {
            return this.isCtaButtonClickable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isOngoing() {
            return this.isOngoing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VideoMeetingCardDisplayModel(id=" + this.id + ", title=" + this.title + ", describe=" + this.describe + ", ctaButtonText=" + this.ctaButtonText + ", isCtaButtonClickable=" + this.isCtaButtonClickable + ", icon=" + this.icon + ", tagText=" + this.tagText + ", isOngoing=" + this.isOngoing + ", tagStyle=" + this.tagStyle + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (r21v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, boolean, java.lang.Integer):void (m)] (LINE:13) call: com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel.VideoMeetingCardDisplayModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, boolean, java.lang.Integer):void type: THIS */
        public /* synthetic */ VideoMeetingCardDisplayModel(String str, String str2, String str3, String str4, boolean z, Integer num, String str5, boolean z2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str5, z2, (i & 256) != 0 ? null : num2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoMeetingCardDisplayModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, Integer num, String str5, boolean z2, Integer num2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.title = str2;
            this.describe = str3;
            this.ctaButtonText = str4;
            this.isCtaButtonClickable = z;
            this.icon = num;
            this.tagText = str5;
            this.isOngoing = z2;
            this.tagStyle = num2;
        }
    }

    public static final class CommonDisplayModel extends RecommendCardDisplayModel {
        public static final int $stable = 8;
        private final String amount;
        private final Long createData;
        private final String describe;
        private final String iconUrl;
        private final String idNumber;
        private final String label;
        private final SelfServiceToolBean primaryAction;
        private final SelfServiceDisplayModel selfServiceItem;
        private final RecommendationCard sourceBean;
        private final CardTag statusTag;
        private final String title;
        private final TransactionBean transactionBean;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecommendationCard component1() {
            return this.sourceBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component10() {
            return this.createData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelfServiceDisplayModel component11() {
            return this.selfServiceItem;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelfServiceToolBean component12() {
            return this.primaryAction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionBean component2() {
            return this.transactionBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.iconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.label;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardTag component5() {
            return this.statusTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.describe;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.idNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CommonDisplayModel copy(@NotNull RecommendationCard recommendationCard, TransactionBean transactionBean, @NotNull String str, @NotNull String str2, CardTag cardTag, @NotNull String str3, @NotNull String str4, String str5, String str6, Long l, SelfServiceDisplayModel selfServiceDisplayModel, SelfServiceToolBean selfServiceToolBean) {
            Intrinsics.checkNotNullParameter(recommendationCard, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new CommonDisplayModel(recommendationCard, transactionBean, str, str2, cardTag, str3, str4, str5, str6, l, selfServiceDisplayModel, selfServiceToolBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonDisplayModel)) {
                return false;
            }
            CommonDisplayModel commonDisplayModel = (CommonDisplayModel) obj;
            return Intrinsics.EZpvd(this.sourceBean, commonDisplayModel.sourceBean) && Intrinsics.EZpvd(this.transactionBean, commonDisplayModel.transactionBean) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) commonDisplayModel.iconUrl) && Intrinsics.EZpvd((Object) this.label, (Object) commonDisplayModel.label) && Intrinsics.EZpvd(this.statusTag, commonDisplayModel.statusTag) && Intrinsics.EZpvd((Object) this.title, (Object) commonDisplayModel.title) && Intrinsics.EZpvd((Object) this.describe, (Object) commonDisplayModel.describe) && Intrinsics.EZpvd((Object) this.amount, (Object) commonDisplayModel.amount) && Intrinsics.EZpvd((Object) this.idNumber, (Object) commonDisplayModel.idNumber) && Intrinsics.EZpvd(this.createData, commonDisplayModel.createData) && Intrinsics.EZpvd(this.selfServiceItem, commonDisplayModel.selfServiceItem) && Intrinsics.EZpvd(this.primaryAction, commonDisplayModel.primaryAction);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCreateData() {
            return this.createData;
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
        public final String getIdNumber() {
            return this.idNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLabel() {
            return this.label;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelfServiceToolBean getPrimaryAction() {
            return this.primaryAction;
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
        public final CardTag getStatusTag() {
            return this.statusTag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionBean getTransactionBean() {
            return this.transactionBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.sourceBean.hashCode();
            TransactionBean transactionBean = this.transactionBean;
            int iHashCode2 = transactionBean == null ? 0 : transactionBean.hashCode();
            int iHashCode3 = this.iconUrl.hashCode();
            int iHashCode4 = this.label.hashCode();
            CardTag cardTag = this.statusTag;
            int iHashCode5 = cardTag == null ? 0 : cardTag.hashCode();
            int iHashCode6 = this.title.hashCode();
            int iHashCode7 = this.describe.hashCode();
            String str = this.amount;
            int iHashCode8 = str == null ? 0 : str.hashCode();
            String str2 = this.idNumber;
            int iHashCode9 = str2 == null ? 0 : str2.hashCode();
            Long l = this.createData;
            int iHashCode10 = l == null ? 0 : l.hashCode();
            SelfServiceDisplayModel selfServiceDisplayModel = this.selfServiceItem;
            int iHashCode11 = selfServiceDisplayModel == null ? 0 : selfServiceDisplayModel.hashCode();
            SelfServiceToolBean selfServiceToolBean = this.primaryAction;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (selfServiceToolBean != null ? selfServiceToolBean.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CommonDisplayModel(sourceBean=" + this.sourceBean + ", transactionBean=" + this.transactionBean + ", iconUrl=" + this.iconUrl + ", label=" + this.label + ", statusTag=" + this.statusTag + ", title=" + this.title + ", describe=" + this.describe + ", amount=" + this.amount + ", idNumber=" + this.idNumber + ", createData=" + this.createData + ", selfServiceItem=" + this.selfServiceItem + ", primaryAction=" + this.primaryAction + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (r17v0 com.okinc.okex.center.bean.RecommendationCard)
  (wrap:com.okinc.okex.center.bean.TransactionBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TransactionBean) : (r18v0 com.okinc.okex.center.bean.TransactionBean))
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (wrap:com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel$CommonDisplayModel$CardTag:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel$CommonDisplayModel$CardTag) : (r21v0 com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel$CommonDisplayModel$CardTag))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel:?: TERNARY null = ((wrap:int:0x002d: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel) : (r27v0 com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel))
  (wrap:com.okinc.okex.center.bean.SelfServiceToolBean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceToolBean) : (r28v0 com.okinc.okex.center.bean.SelfServiceToolBean))
 A[MD:(com.okinc.okex.center.bean.RecommendationCard, com.okinc.okex.center.bean.TransactionBean, java.lang.String, java.lang.String, com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel$CommonDisplayModel$CardTag, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel, com.okinc.okex.center.bean.SelfServiceToolBean):void (m)] (LINE:26) call: com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel.CommonDisplayModel.<init>(com.okinc.okex.center.bean.RecommendationCard, com.okinc.okex.center.bean.TransactionBean, java.lang.String, java.lang.String, com.okinc.okex.center.ui.displaymodels.RecommendCardDisplayModel$CommonDisplayModel$CardTag, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel, com.okinc.okex.center.bean.SelfServiceToolBean):void type: THIS */
        public /* synthetic */ CommonDisplayModel(RecommendationCard recommendationCard, TransactionBean transactionBean, String str, String str2, CardTag cardTag, String str3, String str4, String str5, String str6, Long l, SelfServiceDisplayModel selfServiceDisplayModel, SelfServiceToolBean selfServiceToolBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(recommendationCard, (i & 2) != 0 ? null : transactionBean, str, str2, (i & 16) != 0 ? null : cardTag, str3, str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : selfServiceDisplayModel, (i & 2048) != 0 ? null : selfServiceToolBean);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonDisplayModel(@NotNull RecommendationCard recommendationCard, TransactionBean transactionBean, @NotNull String str, @NotNull String str2, CardTag cardTag, @NotNull String str3, @NotNull String str4, String str5, String str6, Long l, SelfServiceDisplayModel selfServiceDisplayModel, SelfServiceToolBean selfServiceToolBean) {
            super(null);
            Intrinsics.checkNotNullParameter(recommendationCard, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.sourceBean = recommendationCard;
            this.transactionBean = transactionBean;
            this.iconUrl = str;
            this.label = str2;
            this.statusTag = cardTag;
            this.title = str3;
            this.describe = str4;
            this.amount = str5;
            this.idNumber = str6;
            this.createData = l;
            this.selfServiceItem = selfServiceDisplayModel;
            this.primaryAction = selfServiceToolBean;
        }

        public static final class CardTag {
            public static final int $stable = 0;
            private final int tagStyle;
            private final String text;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CardTag copy$default(CardTag cardTag, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = cardTag.text;
                }
                if ((i2 & 2) != 0) {
                    i = cardTag.tagStyle;
                }
                return cardTag.copy(str, i);
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
            public final CardTag copy(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                return new CardTag(str, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardTag)) {
                    return false;
                }
                CardTag cardTag = (CardTag) obj;
                return Intrinsics.EZpvd((Object) this.text, (Object) cardTag.text) && this.tagStyle == cardTag.tagStyle;
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
                return "CardTag(text=" + this.text + ", tagStyle=" + this.tagStyle + ")";
            }

            public CardTag(@NotNull String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                this.text = str;
                this.tagStyle = i;
            }
        }
    }
}
