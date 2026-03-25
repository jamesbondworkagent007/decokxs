package com.okinc.okex.rating.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PostUpdateRatingRequestBean {
    private final String businessId;
    private final Boolean checkBoxResult;
    private final String feedback;
    private final String labelIds;
    private final JsonObject moduleAttributes;
    private final Long moduleId;
    private final String moduleType;
    private final long ratingId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SerialName("businessId")
    public static /* synthetic */ void getBusinessId$annotations() {
    }

    @SerialName("checkBoxResult")
    public static /* synthetic */ void getCheckBoxResult$annotations() {
    }

    @SerialName("feedback")
    public static /* synthetic */ void getFeedback$annotations() {
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

    @SerialName("ratingId")
    public static /* synthetic */ void getRatingId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.ratingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feedback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.checkBoxResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.labelIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.moduleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component7() {
        return this.moduleAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.businessId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PostUpdateRatingRequestBean copy(long j, String str, Boolean bool, String str2, Long l, String str3, JsonObject jsonObject, String str4) {
        return new PostUpdateRatingRequestBean(j, str, bool, str2, l, str3, jsonObject, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostUpdateRatingRequestBean)) {
            return false;
        }
        PostUpdateRatingRequestBean postUpdateRatingRequestBean = (PostUpdateRatingRequestBean) obj;
        return this.ratingId == postUpdateRatingRequestBean.ratingId && Intrinsics.EZpvd((Object) this.feedback, (Object) postUpdateRatingRequestBean.feedback) && Intrinsics.EZpvd(this.checkBoxResult, postUpdateRatingRequestBean.checkBoxResult) && Intrinsics.EZpvd((Object) this.labelIds, (Object) postUpdateRatingRequestBean.labelIds) && Intrinsics.EZpvd(this.moduleId, postUpdateRatingRequestBean.moduleId) && Intrinsics.EZpvd((Object) this.moduleType, (Object) postUpdateRatingRequestBean.moduleType) && Intrinsics.EZpvd(this.moduleAttributes, postUpdateRatingRequestBean.moduleAttributes) && Intrinsics.EZpvd((Object) this.businessId, (Object) postUpdateRatingRequestBean.businessId);
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
    public final long getRatingId() {
        return this.ratingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.ratingId);
        String str = this.feedback;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.checkBoxResult;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str2 = this.labelIds;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Long l = this.moduleId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str3 = this.moduleType;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        JsonObject jsonObject = this.moduleAttributes;
        int iHashCode7 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str4 = this.businessId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PostUpdateRatingRequestBean(ratingId=" + this.ratingId + ", feedback=" + this.feedback + ", checkBoxResult=" + this.checkBoxResult + ", labelIds=" + this.labelIds + ", moduleId=" + this.moduleId + ", moduleType=" + this.moduleType + ", moduleAttributes=" + this.moduleAttributes + ", businessId=" + this.businessId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.bean.PostUpdateRatingRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PostUpdateRatingRequestBean> serializer() {
            return PostUpdateRatingRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PostUpdateRatingRequestBean(int i, long j, String str, Boolean bool, String str2, Long l, String str3, JsonObject jsonObject, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PostUpdateRatingRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        this.ratingId = j;
        if ((i & 2) == 0) {
            this.feedback = null;
        } else {
            this.feedback = str;
        }
        if ((i & 4) == 0) {
            this.checkBoxResult = null;
        } else {
            this.checkBoxResult = bool;
        }
        if ((i & 8) == 0) {
            this.labelIds = null;
        } else {
            this.labelIds = str2;
        }
        if ((i & 16) == 0) {
            this.moduleId = null;
        } else {
            this.moduleId = l;
        }
        if ((i & 32) == 0) {
            this.moduleType = null;
        } else {
            this.moduleType = str3;
        }
        if ((i & 64) == 0) {
            this.moduleAttributes = null;
        } else {
            this.moduleAttributes = jsonObject;
        }
        if ((i & 128) == 0) {
            this.businessId = null;
        } else {
            this.businessId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(PostUpdateRatingRequestBean postUpdateRatingRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, postUpdateRatingRequestBean.ratingId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || postUpdateRatingRequestBean.feedback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, postUpdateRatingRequestBean.feedback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || postUpdateRatingRequestBean.checkBoxResult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, postUpdateRatingRequestBean.checkBoxResult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || postUpdateRatingRequestBean.labelIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, postUpdateRatingRequestBean.labelIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || postUpdateRatingRequestBean.moduleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, postUpdateRatingRequestBean.moduleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || postUpdateRatingRequestBean.moduleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, postUpdateRatingRequestBean.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || postUpdateRatingRequestBean.moduleAttributes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, JsonObjectSerializer.INSTANCE, postUpdateRatingRequestBean.moduleAttributes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && postUpdateRatingRequestBean.businessId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, postUpdateRatingRequestBean.businessId);
    }

    public PostUpdateRatingRequestBean(long j, String str, Boolean bool, String str2, Long l, String str3, JsonObject jsonObject, String str4) {
        this.ratingId = j;
        this.feedback = str;
        this.checkBoxResult = bool;
        this.labelIds = str2;
        this.moduleId = l;
        this.moduleType = str3;
        this.moduleAttributes = jsonObject;
        this.businessId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (r14v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x002b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r21v0 kotlinx.serialization.json.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String):void (m)] (LINE:10) call: com.okinc.okex.rating.bean.PostUpdateRatingRequestBean.<init>(long, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String):void type: THIS */
    public /* synthetic */ PostUpdateRatingRequestBean(long j, String str, Boolean bool, String str2, Long l, String str3, JsonObject jsonObject, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : jsonObject, (i & 128) != 0 ? null : str4);
    }
}
