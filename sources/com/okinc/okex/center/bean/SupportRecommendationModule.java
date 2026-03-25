package com.okinc.okex.center.bean;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SupportRecommendationModule {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String BUSINESS_CODE_FROZEN_ACCOUNT = "frozenAccount";
    public static final String TYPE_WITHDRAW_AMOUNT = "withdrawAmount";
    public static final String TYPE_WITHDRAW_AMOUNT_UNIT = "withdrawAmountUnit";
    public static final String TYPE_WITHDRAW_NETWORK = "withdrawNetwork";
    public static final String TYPE_WITHDRAW_TIME = "withdrawTime";
    private final String businessCode;
    private final String darkIconUrl;
    private final Detail detail;
    private final Boolean displaySwitch;
    private final Long id;
    private final String lightIconUrl;
    private final String trackingKey;
    private final Map<String, String> trackingProperties;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportRecommendationModule() {
        this((String) null, (String) null, (Detail) null, (Boolean) null, (Long) null, (String) null, (String) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    @SerialName("businessCode")
    public static /* synthetic */ void getBusinessCode$annotations() {
    }

    @SerialName("darkIconUrl")
    public static /* synthetic */ void getDarkIconUrl$annotations() {
    }

    @SerialName("detail")
    public static /* synthetic */ void getDetail$annotations() {
    }

    @SerialName("displaySwitch")
    public static /* synthetic */ void getDisplaySwitch$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("lightIconUrl")
    public static /* synthetic */ void getLightIconUrl$annotations() {
    }

    @SerialName("trackingKey")
    public static /* synthetic */ void getTrackingKey$annotations() {
    }

    @SerialName("trackingProperties")
    public static /* synthetic */ void getTrackingProperties$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.businessCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Detail component3() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.displaySwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.trackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component8() {
        return this.trackingProperties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportRecommendationModule copy(String str, String str2, Detail detail, Boolean bool, Long l, String str3, String str4, Map<String, String> map) {
        return new SupportRecommendationModule(str, str2, detail, bool, l, str3, str4, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportRecommendationModule)) {
            return false;
        }
        SupportRecommendationModule supportRecommendationModule = (SupportRecommendationModule) obj;
        return Intrinsics.EZpvd((Object) this.businessCode, (Object) supportRecommendationModule.businessCode) && Intrinsics.EZpvd((Object) this.darkIconUrl, (Object) supportRecommendationModule.darkIconUrl) && Intrinsics.EZpvd(this.detail, supportRecommendationModule.detail) && Intrinsics.EZpvd(this.displaySwitch, supportRecommendationModule.displaySwitch) && Intrinsics.EZpvd(this.id, supportRecommendationModule.id) && Intrinsics.EZpvd((Object) this.lightIconUrl, (Object) supportRecommendationModule.lightIconUrl) && Intrinsics.EZpvd((Object) this.trackingKey, (Object) supportRecommendationModule.trackingKey) && Intrinsics.EZpvd(this.trackingProperties, supportRecommendationModule.trackingProperties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessCode() {
        return this.businessCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Detail getDetail() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisplaySwitch() {
        return this.displaySwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconUrl() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingKey() {
        return this.trackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getTrackingProperties() {
        return this.trackingProperties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.businessCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.darkIconUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Detail detail = this.detail;
        int iHashCode3 = detail == null ? 0 : detail.hashCode();
        Boolean bool = this.displaySwitch;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Long l = this.id;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str3 = this.lightIconUrl;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.trackingKey;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Map<String, String> map = this.trackingProperties;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportRecommendationModule(businessCode=" + this.businessCode + ", darkIconUrl=" + this.darkIconUrl + ", detail=" + this.detail + ", displaySwitch=" + this.displaySwitch + ", id=" + this.id + ", lightIconUrl=" + this.lightIconUrl + ", trackingKey=" + this.trackingKey + ", trackingProperties=" + this.trackingProperties + ")";
    }

    public /* synthetic */ SupportRecommendationModule(int i, String str, String str2, Detail detail, Boolean bool, Long l, String str3, String str4, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.businessCode = null;
        } else {
            this.businessCode = str;
        }
        if ((i & 2) == 0) {
            this.darkIconUrl = null;
        } else {
            this.darkIconUrl = str2;
        }
        if ((i & 4) == 0) {
            this.detail = null;
        } else {
            this.detail = detail;
        }
        if ((i & 8) == 0) {
            this.displaySwitch = null;
        } else {
            this.displaySwitch = bool;
        }
        if ((i & 16) == 0) {
            this.id = null;
        } else {
            this.id = l;
        }
        if ((i & 32) == 0) {
            this.lightIconUrl = null;
        } else {
            this.lightIconUrl = str3;
        }
        if ((i & 64) == 0) {
            this.trackingKey = null;
        } else {
            this.trackingKey = str4;
        }
        if ((i & 128) == 0) {
            this.trackingProperties = null;
        } else {
            this.trackingProperties = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SupportRecommendationModule supportRecommendationModule, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || supportRecommendationModule.businessCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, supportRecommendationModule.businessCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || supportRecommendationModule.darkIconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, supportRecommendationModule.darkIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportRecommendationModule.detail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SupportRecommendationModule$Detail$$serializer.INSTANCE, supportRecommendationModule.detail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportRecommendationModule.displaySwitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, supportRecommendationModule.displaySwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportRecommendationModule.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, supportRecommendationModule.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || supportRecommendationModule.lightIconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, supportRecommendationModule.lightIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || supportRecommendationModule.trackingKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, supportRecommendationModule.trackingKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && supportRecommendationModule.trackingProperties == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], supportRecommendationModule.trackingProperties);
    }

    public SupportRecommendationModule(String str, String str2, Detail detail, Boolean bool, Long l, String str3, String str4, Map<String, String> map) {
        this.businessCode = str;
        this.darkIconUrl = str2;
        this.detail = detail;
        this.displaySwitch = bool;
        this.id = l;
        this.lightIconUrl = str3;
        this.trackingKey = str4;
        this.trackingProperties = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.SupportRecommendationModule$Detail:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SupportRecommendationModule$Detail) : (r12v0 com.okinc.okex.center.bean.SupportRecommendationModule$Detail))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.util.Map) : (null java.util.Map))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SupportRecommendationModule$Detail, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:9) call: com.okinc.okex.center.bean.SupportRecommendationModule.<init>(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SupportRecommendationModule$Detail, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ SupportRecommendationModule(String str, String str2, Detail detail, Boolean bool, Long l, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : detail, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? map : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportRecommendationModule.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SupportRecommendationModule> serializer() {
            return SupportRecommendationModule$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    @Serializable
    public static final class Detail {
        private final List<Button> buttonList;
        private final List<Description> descriptionList;
        private final Tag tag;
        private final String title;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportRecommendationModule$Detail$Button$$serializer.INSTANCE), new ArrayListSerializer(SupportRecommendationModule$Detail$Description$$serializer.INSTANCE), null, null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Detail() {
            this((List) null, (List) null, (Tag) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.SupportRecommendationModule$Detail */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Detail copy$default(Detail detail, List list, List list2, Tag tag, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = detail.buttonList;
            }
            if ((i & 2) != 0) {
                list2 = detail.descriptionList;
            }
            if ((i & 4) != 0) {
                tag = detail.tag;
            }
            if ((i & 8) != 0) {
                str = detail.title;
            }
            return detail.copy(list, list2, tag, str);
        }

        @SerialName("buttonList")
        public static /* synthetic */ void getButtonList$annotations() {
        }

        @SerialName("descriptionList")
        public static /* synthetic */ void getDescriptionList$annotations() {
        }

        @SerialName("tag")
        public static /* synthetic */ void getTag$annotations() {
        }

        @SerialName("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Button> component1() {
            return this.buttonList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Description> component2() {
            return this.descriptionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Tag component3() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Detail copy(List<Button> list, List<Description> list2, Tag tag, String str) {
            return new Detail(list, list2, tag, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj;
            return Intrinsics.EZpvd(this.buttonList, detail.buttonList) && Intrinsics.EZpvd(this.descriptionList, detail.descriptionList) && Intrinsics.EZpvd(this.tag, detail.tag) && Intrinsics.EZpvd((Object) this.title, (Object) detail.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Button> getButtonList() {
            return this.buttonList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Description> getDescriptionList() {
            return this.descriptionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Tag getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<Button> list = this.buttonList;
            int iHashCode = list == null ? 0 : list.hashCode();
            List<Description> list2 = this.descriptionList;
            int iHashCode2 = list2 == null ? 0 : list2.hashCode();
            Tag tag = this.tag;
            int iHashCode3 = tag == null ? 0 : tag.hashCode();
            String str = this.title;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Detail(buttonList=" + this.buttonList + ", descriptionList=" + this.descriptionList + ", tag=" + this.tag + ", title=" + this.title + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Detail> serializer() {
                return SupportRecommendationModule$Detail$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Detail(int i, List list, List list2, Tag tag, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.buttonList = null;
            } else {
                this.buttonList = list;
            }
            if ((i & 2) == 0) {
                this.descriptionList = null;
            } else {
                this.descriptionList = list2;
            }
            if ((i & 4) == 0) {
                this.tag = null;
            } else {
                this.tag = tag;
            }
            if ((i & 8) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(Detail detail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || detail.buttonList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], detail.buttonList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || detail.descriptionList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], detail.descriptionList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || detail.tag != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SupportRecommendationModule$Detail$Tag$$serializer.INSTANCE, detail.tag);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && detail.title == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, detail.title);
        }

        public Detail(List<Button> list, List<Description> list2, Tag tag, String str) {
            this.buttonList = list;
            this.descriptionList = list2;
            this.tag = tag;
            this.title = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Tag:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Tag) : (r4v0 com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Tag))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Button>, java.util.List<com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Description>, com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Tag, java.lang.String):void (m)] (LINE:37) call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.<init>(java.util.List, java.util.List, com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Tag, java.lang.String):void type: THIS */
        public /* synthetic */ Detail(List list, List list2, Tag tag, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : tag, (i & 8) != 0 ? null : str);
        }

        @Serializable
        public static final class Button {
            private static final KSerializer<Object>[] $childSerializers;
            private final String buttonText;
            private final String mobileLink;
            private final String trackingKey;
            private final Map<String, String> trackingProperties;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Button() {
                this((String) null, (String) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.SupportRecommendationModule$Detail$Button */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.buttonText;
                }
                if ((i & 2) != 0) {
                    str2 = button.mobileLink;
                }
                if ((i & 4) != 0) {
                    str3 = button.trackingKey;
                }
                if ((i & 8) != 0) {
                    map = button.trackingProperties;
                }
                return button.copy(str, str2, str3, map);
            }

            @SerialName("buttonText")
            public static /* synthetic */ void getButtonText$annotations() {
            }

            @SerialName("mobileLink")
            public static /* synthetic */ void getMobileLink$annotations() {
            }

            @SerialName("trackingKey")
            public static /* synthetic */ void getTrackingKey$annotations() {
            }

            @SerialName("trackingProperties")
            public static /* synthetic */ void getTrackingProperties$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.buttonText;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.mobileLink;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.trackingKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component4() {
                return this.trackingProperties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Button copy(String str, String str2, String str3, Map<String, String> map) {
                return new Button(str, str2, str3, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.EZpvd((Object) this.buttonText, (Object) button.buttonText) && Intrinsics.EZpvd((Object) this.mobileLink, (Object) button.mobileLink) && Intrinsics.EZpvd((Object) this.trackingKey, (Object) button.trackingKey) && Intrinsics.EZpvd(this.trackingProperties, button.trackingProperties);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getButtonText() {
                return this.buttonText;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMobileLink() {
                return this.mobileLink;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTrackingKey() {
                return this.trackingKey;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getTrackingProperties() {
                return this.trackingProperties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.buttonText;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.mobileLink;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.trackingKey;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                Map<String, String> map = this.trackingProperties;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Button(buttonText=" + this.buttonText + ", mobileLink=" + this.mobileLink + ", trackingKey=" + this.trackingKey + ", trackingProperties=" + this.trackingProperties + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Button.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Button> serializer() {
                    return SupportRecommendationModule$Detail$Button$$serializer.INSTANCE;
                }
            }

            static {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
            }

            public /* synthetic */ Button(int i, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.buttonText = null;
                } else {
                    this.buttonText = str;
                }
                if ((i & 2) == 0) {
                    this.mobileLink = null;
                } else {
                    this.mobileLink = str2;
                }
                if ((i & 4) == 0) {
                    this.trackingKey = null;
                } else {
                    this.trackingKey = str3;
                }
                if ((i & 8) == 0) {
                    this.trackingProperties = null;
                } else {
                    this.trackingProperties = map;
                }
            }

            public static final /* synthetic */ void write$Self$OKSupport_support_impl(Button button, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || button.buttonText != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, button.buttonText);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || button.mobileLink != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, button.mobileLink);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || button.trackingKey != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, button.trackingKey);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && button.trackingProperties == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], button.trackingProperties);
            }

            public Button(String str, String str2, String str3, Map<String, String> map) {
                this.buttonText = str;
                this.mobileLink = str2;
                this.trackingKey = str3;
                this.trackingProperties = map;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r5v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:49) call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Button.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map):void type: THIS */
            public /* synthetic */ Button(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map);
            }
        }

        @Serializable
        public static final class Description {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String name;
            private final String type;
            private final String value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Description() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Description copy$default(Description description, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = description.name;
                }
                if ((i & 2) != 0) {
                    str2 = description.type;
                }
                if ((i & 4) != 0) {
                    str3 = description.value;
                }
                return description.copy(str, str2, str3);
            }

            @SerialName("name")
            public static /* synthetic */ void getName$annotations() {
            }

            @SerialName("type")
            public static /* synthetic */ void getType$annotations() {
            }

            @SerialName("value")
            public static /* synthetic */ void getValue$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Description copy(String str, String str2, String str3) {
                return new Description(str, str2, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Description)) {
                    return false;
                }
                Description description = (Description) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) description.name) && Intrinsics.EZpvd((Object) this.type, (Object) description.type) && Intrinsics.EZpvd((Object) this.value, (Object) description.value);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.name;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.type;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.value;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Description(name=" + this.name + ", type=" + this.type + ", value=" + this.value + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Description.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Description> serializer() {
                    return SupportRecommendationModule$Detail$Description$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Description(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.name = null;
                } else {
                    this.name = str;
                }
                if ((i & 2) == 0) {
                    this.type = null;
                } else {
                    this.type = str2;
                }
                if ((i & 4) == 0) {
                    this.value = null;
                } else {
                    this.value = str3;
                }
            }

            public static final /* synthetic */ void write$Self$OKSupport_support_impl(Description description, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || description.name != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, description.name);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || description.type != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, description.type);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && description.value == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, description.value);
            }

            public Description(String str, String str2, String str3) {
                this.name = str;
                this.type = str2;
                this.value = str3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:62) call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Description.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ Description(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        @Serializable
        public static final class Tag {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String color;
            private final String value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Tag() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Tag copy$default(Tag tag, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tag.color;
                }
                if ((i & 2) != 0) {
                    str2 = tag.value;
                }
                return tag.copy(str, str2);
            }

            @SerialName("color")
            public static /* synthetic */ void getColor$annotations() {
            }

            @SerialName("value")
            public static /* synthetic */ void getValue$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.color;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Tag copy(String str, String str2) {
                return new Tag(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tag)) {
                    return false;
                }
                Tag tag = (Tag) obj;
                return Intrinsics.EZpvd((Object) this.color, (Object) tag.color) && Intrinsics.EZpvd((Object) this.value, (Object) tag.value);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getColor() {
                return this.color;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.color;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.value;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Tag(color=" + this.color + ", value=" + this.value + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Tag.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Tag> serializer() {
                    return SupportRecommendationModule$Detail$Tag$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Tag(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.color = null;
                } else {
                    this.color = str;
                }
                if ((i & 2) == 0) {
                    this.value = null;
                } else {
                    this.value = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKSupport_support_impl(Tag tag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tag.color != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tag.color);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && tag.value == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tag.value);
            }

            public Tag(String str, String str2) {
                this.color = str;
                this.value = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:73) call: com.okinc.okex.center.bean.SupportRecommendationModule.Detail.Tag.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ Tag(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }
        }
    }
}
