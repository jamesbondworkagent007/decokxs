package com.okinc.okex.center.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SupportLandingResponse {
    private final ContactInfoBean contactInformation;
    private final TollFreeCallBean contactUs;
    private final DisplayControl displayControl;
    private final PopupAnnouncements popupAnnouncements;
    private final RecentActivities recentActivities;
    private final List<RecommendationSection> recommendationCards;
    private final SelfServiceTools selfServiceTools;
    private final TopTopics topTopics;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RecommendationSection$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportLandingResponse() {
        this((ContactInfoBean) null, (TollFreeCallBean) null, (List) null, (RecentActivities) null, (TopTopics) null, (SelfServiceTools) null, (DisplayControl) null, (PopupAnnouncements) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactInfoBean component1() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TollFreeCallBean component2() {
        return this.contactUs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendationSection> component3() {
        return this.recommendationCards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecentActivities component4() {
        return this.recentActivities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopTopics component5() {
        return this.topTopics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component6() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayControl component7() {
        return this.displayControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncements component8() {
        return this.popupAnnouncements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportLandingResponse copy(ContactInfoBean contactInfoBean, TollFreeCallBean tollFreeCallBean, List<RecommendationSection> list, RecentActivities recentActivities, TopTopics topTopics, SelfServiceTools selfServiceTools, DisplayControl displayControl, PopupAnnouncements popupAnnouncements) {
        return new SupportLandingResponse(contactInfoBean, tollFreeCallBean, list, recentActivities, topTopics, selfServiceTools, displayControl, popupAnnouncements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportLandingResponse)) {
            return false;
        }
        SupportLandingResponse supportLandingResponse = (SupportLandingResponse) obj;
        return Intrinsics.EZpvd(this.contactInformation, supportLandingResponse.contactInformation) && Intrinsics.EZpvd(this.contactUs, supportLandingResponse.contactUs) && Intrinsics.EZpvd(this.recommendationCards, supportLandingResponse.recommendationCards) && Intrinsics.EZpvd(this.recentActivities, supportLandingResponse.recentActivities) && Intrinsics.EZpvd(this.topTopics, supportLandingResponse.topTopics) && Intrinsics.EZpvd(this.selfServiceTools, supportLandingResponse.selfServiceTools) && Intrinsics.EZpvd(this.displayControl, supportLandingResponse.displayControl) && Intrinsics.EZpvd(this.popupAnnouncements, supportLandingResponse.popupAnnouncements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactInfoBean getContactInformation() {
        return this.contactInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TollFreeCallBean getContactUs() {
        return this.contactUs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisplayControl getDisplayControl() {
        return this.displayControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncements getPopupAnnouncements() {
        return this.popupAnnouncements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecentActivities getRecentActivities() {
        return this.recentActivities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecommendationSection> getRecommendationCards() {
        return this.recommendationCards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopTopics getTopTopics() {
        return this.topTopics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ContactInfoBean contactInfoBean = this.contactInformation;
        int iHashCode = contactInfoBean == null ? 0 : contactInfoBean.hashCode();
        TollFreeCallBean tollFreeCallBean = this.contactUs;
        int iHashCode2 = tollFreeCallBean == null ? 0 : tollFreeCallBean.hashCode();
        List<RecommendationSection> list = this.recommendationCards;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        RecentActivities recentActivities = this.recentActivities;
        int iHashCode4 = recentActivities == null ? 0 : recentActivities.hashCode();
        TopTopics topTopics = this.topTopics;
        int iHashCode5 = topTopics == null ? 0 : topTopics.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        int iHashCode6 = selfServiceTools == null ? 0 : selfServiceTools.hashCode();
        DisplayControl displayControl = this.displayControl;
        int iHashCode7 = displayControl == null ? 0 : displayControl.hashCode();
        PopupAnnouncements popupAnnouncements = this.popupAnnouncements;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (popupAnnouncements != null ? popupAnnouncements.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportLandingResponse(contactInformation=" + this.contactInformation + ", contactUs=" + this.contactUs + ", recommendationCards=" + this.recommendationCards + ", recentActivities=" + this.recentActivities + ", topTopics=" + this.topTopics + ", selfServiceTools=" + this.selfServiceTools + ", displayControl=" + this.displayControl + ", popupAnnouncements=" + this.popupAnnouncements + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportLandingResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportLandingResponse> serializer() {
            return SupportLandingResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportLandingResponse(int i, ContactInfoBean contactInfoBean, TollFreeCallBean tollFreeCallBean, List list, RecentActivities recentActivities, TopTopics topTopics, SelfServiceTools selfServiceTools, DisplayControl displayControl, PopupAnnouncements popupAnnouncements, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contactInformation = null;
        } else {
            this.contactInformation = contactInfoBean;
        }
        if ((i & 2) == 0) {
            this.contactUs = null;
        } else {
            this.contactUs = tollFreeCallBean;
        }
        if ((i & 4) == 0) {
            this.recommendationCards = null;
        } else {
            this.recommendationCards = list;
        }
        if ((i & 8) == 0) {
            this.recentActivities = null;
        } else {
            this.recentActivities = recentActivities;
        }
        if ((i & 16) == 0) {
            this.topTopics = null;
        } else {
            this.topTopics = topTopics;
        }
        if ((i & 32) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
        if ((i & 64) == 0) {
            this.displayControl = null;
        } else {
            this.displayControl = displayControl;
        }
        if ((i & 128) == 0) {
            this.popupAnnouncements = null;
        } else {
            this.popupAnnouncements = popupAnnouncements;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SupportLandingResponse supportLandingResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || supportLandingResponse.contactInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContactInfoBean$$serializer.INSTANCE, supportLandingResponse.contactInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || supportLandingResponse.contactUs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TollFreeCallBean$$serializer.INSTANCE, supportLandingResponse.contactUs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportLandingResponse.recommendationCards != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], supportLandingResponse.recommendationCards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportLandingResponse.recentActivities != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RecentActivities$$serializer.INSTANCE, supportLandingResponse.recentActivities);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportLandingResponse.topTopics != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, TopTopics$$serializer.INSTANCE, supportLandingResponse.topTopics);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || supportLandingResponse.selfServiceTools != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, SelfServiceTools$$serializer.INSTANCE, supportLandingResponse.selfServiceTools);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || supportLandingResponse.displayControl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, DisplayControl$$serializer.INSTANCE, supportLandingResponse.displayControl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && supportLandingResponse.popupAnnouncements == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, PopupAnnouncements$$serializer.INSTANCE, supportLandingResponse.popupAnnouncements);
    }

    public SupportLandingResponse(ContactInfoBean contactInfoBean, TollFreeCallBean tollFreeCallBean, List<RecommendationSection> list, RecentActivities recentActivities, TopTopics topTopics, SelfServiceTools selfServiceTools, DisplayControl displayControl, PopupAnnouncements popupAnnouncements) {
        this.contactInformation = contactInfoBean;
        this.contactUs = tollFreeCallBean;
        this.recommendationCards = list;
        this.recentActivities = recentActivities;
        this.topTopics = topTopics;
        this.selfServiceTools = selfServiceTools;
        this.displayControl = displayControl;
        this.popupAnnouncements = popupAnnouncements;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContactInfoBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContactInfoBean) : (r10v0 com.okinc.okex.center.bean.ContactInfoBean))
  (wrap:com.okinc.okex.center.bean.TollFreeCallBean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TollFreeCallBean) : (r11v0 com.okinc.okex.center.bean.TollFreeCallBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:com.okinc.okex.center.bean.RecentActivities:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.RecentActivities) : (r13v0 com.okinc.okex.center.bean.RecentActivities))
  (wrap:com.okinc.okex.center.bean.TopTopics:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.TopTopics) : (r14v0 com.okinc.okex.center.bean.TopTopics))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r15v0 com.okinc.okex.center.bean.SelfServiceTools))
  (wrap:com.okinc.okex.center.bean.DisplayControl:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.DisplayControl) : (r16v0 com.okinc.okex.center.bean.DisplayControl))
  (wrap:com.okinc.okex.center.bean.PopupAnnouncements:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 com.okinc.okex.center.bean.PopupAnnouncements) : (null com.okinc.okex.center.bean.PopupAnnouncements))
 A[MD:(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.TollFreeCallBean, java.util.List<com.okinc.okex.center.bean.RecommendationSection>, com.okinc.okex.center.bean.RecentActivities, com.okinc.okex.center.bean.TopTopics, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.DisplayControl, com.okinc.okex.center.bean.PopupAnnouncements):void (m)] (LINE:13) call: com.okinc.okex.center.bean.SupportLandingResponse.<init>(com.okinc.okex.center.bean.ContactInfoBean, com.okinc.okex.center.bean.TollFreeCallBean, java.util.List, com.okinc.okex.center.bean.RecentActivities, com.okinc.okex.center.bean.TopTopics, com.okinc.okex.center.bean.SelfServiceTools, com.okinc.okex.center.bean.DisplayControl, com.okinc.okex.center.bean.PopupAnnouncements):void type: THIS */
    public /* synthetic */ SupportLandingResponse(ContactInfoBean contactInfoBean, TollFreeCallBean tollFreeCallBean, List list, RecentActivities recentActivities, TopTopics topTopics, SelfServiceTools selfServiceTools, DisplayControl displayControl, PopupAnnouncements popupAnnouncements, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactInfoBean, (i & 2) != 0 ? null : tollFreeCallBean, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : recentActivities, (i & 16) != 0 ? null : topTopics, (i & 32) != 0 ? null : selfServiceTools, (i & 64) != 0 ? null : displayControl, (i & 128) == 0 ? popupAnnouncements : null);
    }
}
