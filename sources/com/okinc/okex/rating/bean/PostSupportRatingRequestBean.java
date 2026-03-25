package com.okinc.okex.rating.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PostSupportRatingRequestBean {
    private final String businessId;
    private final Boolean checkBoxResult;
    private final String feedback;
    private final String labelFeedback;
    private final String labelIds;
    private final JsonObject moduleAttributes;
    private final Long moduleId;
    private final String moduleType;
    private final Integer ratingNotificationId;
    private final Integer score;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PostSupportRatingRequestBean() {
        this((Boolean) null, (String) null, (String) null, (Long) null, (String) null, (Integer) null, (Integer) null, (JsonObject) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("businessId")
    public static /* synthetic */ void getBusinessId$annotations() {
    }

    @SerialName("checkBoxResult")
    public static /* synthetic */ void getCheckBoxResult$annotations() {
    }

    @SerialName("feedback")
    public static /* synthetic */ void getFeedback$annotations() {
    }

    @SerialName("labelFeedback")
    public static /* synthetic */ void getLabelFeedback$annotations() {
    }

    @SerialName("labelIds")
    public static /* synthetic */ void getLabelIds$annotations() {
    }

    @SerialName("moduleAttributes")
    public static /* synthetic */ void getModuleAttributes$annotations() {
    }

    @SerialName("moduleId")
    public static /* synthetic */ void getModuleId$annotations() {
    }

    @SerialName("moduleType")
    public static /* synthetic */ void getModuleType$annotations() {
    }

    @SerialName("ratingNotificationId")
    public static /* synthetic */ void getRatingNotificationId$annotations() {
    }

    @SerialName(FirebaseAnalytics.Param.SCORE)
    public static /* synthetic */ void getScore$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.checkBoxResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.businessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feedback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.labelIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.moduleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.ratingNotificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component8() {
        return this.moduleAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.labelFeedback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PostSupportRatingRequestBean copy(Boolean bool, String str, String str2, Long l, String str3, Integer num, Integer num2, JsonObject jsonObject, String str4, String str5) {
        return new PostSupportRatingRequestBean(bool, str, str2, l, str3, num, num2, jsonObject, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSupportRatingRequestBean)) {
            return false;
        }
        PostSupportRatingRequestBean postSupportRatingRequestBean = (PostSupportRatingRequestBean) obj;
        return Intrinsics.EZpvd(this.checkBoxResult, postSupportRatingRequestBean.checkBoxResult) && Intrinsics.EZpvd((Object) this.feedback, (Object) postSupportRatingRequestBean.feedback) && Intrinsics.EZpvd((Object) this.labelIds, (Object) postSupportRatingRequestBean.labelIds) && Intrinsics.EZpvd(this.moduleId, postSupportRatingRequestBean.moduleId) && Intrinsics.EZpvd((Object) this.moduleType, (Object) postSupportRatingRequestBean.moduleType) && Intrinsics.EZpvd(this.ratingNotificationId, postSupportRatingRequestBean.ratingNotificationId) && Intrinsics.EZpvd(this.score, postSupportRatingRequestBean.score) && Intrinsics.EZpvd(this.moduleAttributes, postSupportRatingRequestBean.moduleAttributes) && Intrinsics.EZpvd((Object) this.labelFeedback, (Object) postSupportRatingRequestBean.labelFeedback) && Intrinsics.EZpvd((Object) this.businessId, (Object) postSupportRatingRequestBean.businessId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCheckBoxResult() {
        return this.checkBoxResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeedback() {
        return this.feedback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabelFeedback() {
        return this.labelFeedback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabelIds() {
        return this.labelIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getModuleAttributes() {
        return this.moduleAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getModuleId() {
        return this.moduleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRatingNotificationId() {
        return this.ratingNotificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.checkBoxResult;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.feedback;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.labelIds;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Long l = this.moduleId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str3 = this.moduleType;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.ratingNotificationId;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.score;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        JsonObject jsonObject = this.moduleAttributes;
        int iHashCode8 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str4 = this.labelFeedback;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.businessId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PostSupportRatingRequestBean(checkBoxResult=" + this.checkBoxResult + ", feedback=" + this.feedback + ", labelIds=" + this.labelIds + ", moduleId=" + this.moduleId + ", moduleType=" + this.moduleType + ", ratingNotificationId=" + this.ratingNotificationId + ", score=" + this.score + ", moduleAttributes=" + this.moduleAttributes + ", labelFeedback=" + this.labelFeedback + ", businessId=" + this.businessId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.PostSupportRatingRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostSupportRatingRequestBean> serializer() {
            return PostSupportRatingRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostSupportRatingRequestBean(int i, Boolean bool, String str, String str2, Long l, String str3, Integer num, Integer num2, JsonObject jsonObject, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.checkBoxResult = null;
        } else {
            this.checkBoxResult = bool;
        }
        if ((i & 2) == 0) {
            this.feedback = null;
        } else {
            this.feedback = str;
        }
        if ((i & 4) == 0) {
            this.labelIds = null;
        } else {
            this.labelIds = str2;
        }
        if ((i & 8) == 0) {
            this.moduleId = null;
        } else {
            this.moduleId = l;
        }
        if ((i & 16) == 0) {
            this.moduleType = null;
        } else {
            this.moduleType = str3;
        }
        if ((i & 32) == 0) {
            this.ratingNotificationId = null;
        } else {
            this.ratingNotificationId = num;
        }
        if ((i & 64) == 0) {
            this.score = null;
        } else {
            this.score = num2;
        }
        if ((i & 128) == 0) {
            this.moduleAttributes = null;
        } else {
            this.moduleAttributes = jsonObject;
        }
        if ((i & 256) == 0) {
            this.labelFeedback = null;
        } else {
            this.labelFeedback = str4;
        }
        if ((i & 512) == 0) {
            this.businessId = null;
        } else {
            this.businessId = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(PostSupportRatingRequestBean postSupportRatingRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || postSupportRatingRequestBean.checkBoxResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, postSupportRatingRequestBean.checkBoxResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || postSupportRatingRequestBean.feedback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, postSupportRatingRequestBean.feedback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || postSupportRatingRequestBean.labelIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, postSupportRatingRequestBean.labelIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || postSupportRatingRequestBean.moduleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, postSupportRatingRequestBean.moduleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || postSupportRatingRequestBean.moduleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, postSupportRatingRequestBean.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || postSupportRatingRequestBean.ratingNotificationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, postSupportRatingRequestBean.ratingNotificationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || postSupportRatingRequestBean.score != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, postSupportRatingRequestBean.score);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || postSupportRatingRequestBean.moduleAttributes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, JsonObjectSerializer.INSTANCE, postSupportRatingRequestBean.moduleAttributes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || postSupportRatingRequestBean.labelFeedback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, postSupportRatingRequestBean.labelFeedback);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && postSupportRatingRequestBean.businessId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, postSupportRatingRequestBean.businessId);
    }

    public PostSupportRatingRequestBean(Boolean bool, String str, String str2, Long l, String str3, Integer num, Integer num2, JsonObject jsonObject, String str4, String str5) {
        this.checkBoxResult = bool;
        this.feedback = str;
        this.labelIds = str2;
        this.moduleId = l;
        this.moduleType = str3;
        this.ratingNotificationId = num;
        this.score = num2;
        this.moduleAttributes = jsonObject;
        this.labelFeedback = str4;
        this.businessId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r19v0 kotlinx.serialization.json.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.okex.rating.bean.PostSupportRatingRequestBean.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PostSupportRatingRequestBean(Boolean bool, String str, String str2, Long l, String str3, Integer num, Integer num2, JsonObject jsonObject, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : jsonObject, (i & 256) != 0 ? null : str4, (i & 512) == 0 ? str5 : null);
    }
}
