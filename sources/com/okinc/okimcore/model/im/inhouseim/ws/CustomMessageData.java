package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CustomMessageData {
    public static final String BIZ_NAME_MODERATOR_INVITATION = "ModeratorInvitation";
    public static final String SERVICE_NAME_CAMPAIGN = "Campaign";
    public static final String SERVICE_NAME_CONTRACT_ADDRESS = "SocialTrading";
    public static final String SERVICE_NAME_CRYPTO_GIFT = "CryptoGift";
    public static final String SERVICE_NAME_GROUP_VOICE_CALL = "GroupVoiceCall";
    public static final String SERVICE_NAME_LIVE_STREAM = "LiveStream";
    public static final String SERVICE_NAME_ONE_TO_ONE_PAYMENT = "OneToOnePayment";
    public static final String SERVICE_NAME_P2P = "P2P";
    public static final String SERVICE_NAME_VIP_ACCESS = "OperationPlatform";
    private final String bizName;
    private final String content;
    private final String frontendOption;
    private final List<InHouseMessageHandling> messageHandling;
    private final String preview;
    private final JsonObject pushData;
    private final String pushTemplate;
    private final String serviceName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(InHouseMessageHandling$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomMessageData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (JsonObject) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.serviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pushTemplate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component6() {
        return this.pushData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseMessageHandling> component8() {
        return this.messageHandling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomMessageData copy(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, List<InHouseMessageHandling> list) {
        return new CustomMessageData(str, str2, str3, str4, str5, jsonObject, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMessageData)) {
            return false;
        }
        CustomMessageData customMessageData = (CustomMessageData) obj;
        return Intrinsics.EZpvd((Object) this.serviceName, (Object) customMessageData.serviceName) && Intrinsics.EZpvd((Object) this.bizName, (Object) customMessageData.bizName) && Intrinsics.EZpvd((Object) this.preview, (Object) customMessageData.preview) && Intrinsics.EZpvd((Object) this.content, (Object) customMessageData.content) && Intrinsics.EZpvd((Object) this.pushTemplate, (Object) customMessageData.pushTemplate) && Intrinsics.EZpvd(this.pushData, customMessageData.pushData) && Intrinsics.EZpvd((Object) this.frontendOption, (Object) customMessageData.frontendOption) && Intrinsics.EZpvd(this.messageHandling, customMessageData.messageHandling);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendOption() {
        return this.frontendOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InHouseMessageHandling> getMessageHandling() {
        return this.messageHandling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreview() {
        return this.preview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getPushData() {
        return this.pushData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushTemplate() {
        return this.pushTemplate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.serviceName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.bizName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.preview;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.content;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pushTemplate;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        JsonObject jsonObject = this.pushData;
        int iHashCode6 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str6 = this.frontendOption;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        List<InHouseMessageHandling> list = this.messageHandling;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomMessageData(serviceName=" + this.serviceName + ", bizName=" + this.bizName + ", preview=" + this.preview + ", content=" + this.content + ", pushTemplate=" + this.pushTemplate + ", pushData=" + this.pushData + ", frontendOption=" + this.frontendOption + ", messageHandling=" + this.messageHandling + ")";
    }

    public /* synthetic */ CustomMessageData(int i, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serviceName = null;
        } else {
            this.serviceName = str;
        }
        if ((i & 2) == 0) {
            this.bizName = null;
        } else {
            this.bizName = str2;
        }
        if ((i & 4) == 0) {
            this.preview = null;
        } else {
            this.preview = str3;
        }
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        if ((i & 16) == 0) {
            this.pushTemplate = null;
        } else {
            this.pushTemplate = str5;
        }
        if ((i & 32) == 0) {
            this.pushData = null;
        } else {
            this.pushData = jsonObject;
        }
        if ((i & 64) == 0) {
            this.frontendOption = null;
        } else {
            this.frontendOption = str6;
        }
        if ((i & 128) == 0) {
            this.messageHandling = null;
        } else {
            this.messageHandling = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CustomMessageData customMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || customMessageData.serviceName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, customMessageData.serviceName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || customMessageData.bizName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, customMessageData.bizName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || customMessageData.preview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, customMessageData.preview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || customMessageData.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, customMessageData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || customMessageData.pushTemplate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, customMessageData.pushTemplate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || customMessageData.pushData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JsonObjectSerializer.INSTANCE, customMessageData.pushData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || customMessageData.frontendOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, customMessageData.frontendOption);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && customMessageData.messageHandling == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], customMessageData.messageHandling);
    }

    public CustomMessageData(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, List<InHouseMessageHandling> list) {
        this.serviceName = str;
        this.bizName = str2;
        this.preview = str3;
        this.content = str4;
        this.pushTemplate = str5;
        this.pushData = jsonObject;
        this.frontendOption = str6;
        this.messageHandling = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r15v0 kotlinx.serialization.json.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.InHouseMessageHandling>):void (m)] (LINE:9) call: com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CustomMessageData(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : jsonObject, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? list : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CustomMessageData> serializer() {
            return CustomMessageData$$serializer.INSTANCE;
        }
    }
}
