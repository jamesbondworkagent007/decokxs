package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class PopupAnnouncementInfoBean {
    private final PopupAnnouncementItem popupAnnouncement;
    private final SelfServiceTools selfServiceTools;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PopupAnnouncementInfoBean() {
        this((PopupAnnouncementItem) null, (SelfServiceTools) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PopupAnnouncementInfoBean copy$default(PopupAnnouncementInfoBean popupAnnouncementInfoBean, PopupAnnouncementItem popupAnnouncementItem, SelfServiceTools selfServiceTools, int i, Object obj) {
        if ((i & 1) != 0) {
            popupAnnouncementItem = popupAnnouncementInfoBean.popupAnnouncement;
        }
        if ((i & 2) != 0) {
            selfServiceTools = popupAnnouncementInfoBean.selfServiceTools;
        }
        return popupAnnouncementInfoBean.copy(popupAnnouncementItem, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncementItem component1() {
        return this.popupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component2() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncementInfoBean copy(PopupAnnouncementItem popupAnnouncementItem, SelfServiceTools selfServiceTools) {
        return new PopupAnnouncementInfoBean(popupAnnouncementItem, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupAnnouncementInfoBean)) {
            return false;
        }
        PopupAnnouncementInfoBean popupAnnouncementInfoBean = (PopupAnnouncementInfoBean) obj;
        return Intrinsics.EZpvd(this.popupAnnouncement, popupAnnouncementInfoBean.popupAnnouncement) && Intrinsics.EZpvd(this.selfServiceTools, popupAnnouncementInfoBean.selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncementItem getPopupAnnouncement() {
        return this.popupAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PopupAnnouncementItem popupAnnouncementItem = this.popupAnnouncement;
        int iHashCode = popupAnnouncementItem == null ? 0 : popupAnnouncementItem.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        return (iHashCode * 31) + (selfServiceTools != null ? selfServiceTools.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PopupAnnouncementInfoBean(popupAnnouncement=" + this.popupAnnouncement + ", selfServiceTools=" + this.selfServiceTools + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.PopupAnnouncementInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PopupAnnouncementInfoBean> serializer() {
            return PopupAnnouncementInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PopupAnnouncementInfoBean(int i, PopupAnnouncementItem popupAnnouncementItem, SelfServiceTools selfServiceTools, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.popupAnnouncement = null;
        } else {
            this.popupAnnouncement = popupAnnouncementItem;
        }
        if ((i & 2) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(PopupAnnouncementInfoBean popupAnnouncementInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || popupAnnouncementInfoBean.popupAnnouncement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PopupAnnouncementItem$$serializer.INSTANCE, popupAnnouncementInfoBean.popupAnnouncement);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && popupAnnouncementInfoBean.selfServiceTools == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, popupAnnouncementInfoBean.selfServiceTools);
    }

    public PopupAnnouncementInfoBean(PopupAnnouncementItem popupAnnouncementItem, SelfServiceTools selfServiceTools) {
        this.popupAnnouncement = popupAnnouncementItem;
        this.selfServiceTools = selfServiceTools;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.PopupAnnouncementItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.PopupAnnouncementItem) : (r2v0 com.okinc.okex.center.bean.PopupAnnouncementItem))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r3v0 com.okinc.okex.center.bean.SelfServiceTools))
 A[MD:(com.okinc.okex.center.bean.PopupAnnouncementItem, com.okinc.okex.center.bean.SelfServiceTools):void (m)] (LINE:15) call: com.okinc.okex.center.bean.PopupAnnouncementInfoBean.<init>(com.okinc.okex.center.bean.PopupAnnouncementItem, com.okinc.okex.center.bean.SelfServiceTools):void type: THIS */
    public /* synthetic */ PopupAnnouncementInfoBean(PopupAnnouncementItem popupAnnouncementItem, SelfServiceTools selfServiceTools, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : popupAnnouncementItem, (i & 2) != 0 ? null : selfServiceTools);
    }
}
