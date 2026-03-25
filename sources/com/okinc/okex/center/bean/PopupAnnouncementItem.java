package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class PopupAnnouncementItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String dataTrackingKey;
    private final String htmlContent;
    private final String id;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PopupAnnouncementItem() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PopupAnnouncementItem copy$default(PopupAnnouncementItem popupAnnouncementItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupAnnouncementItem.id;
        }
        if ((i & 2) != 0) {
            str2 = popupAnnouncementItem.title;
        }
        if ((i & 4) != 0) {
            str3 = popupAnnouncementItem.htmlContent;
        }
        if ((i & 8) != 0) {
            str4 = popupAnnouncementItem.dataTrackingKey;
        }
        return popupAnnouncementItem.copy(str, str2, str3, str4);
    }

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
        return this.htmlContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupAnnouncementItem copy(String str, String str2, String str3, String str4) {
        return new PopupAnnouncementItem(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupAnnouncementItem)) {
            return false;
        }
        PopupAnnouncementItem popupAnnouncementItem = (PopupAnnouncementItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) popupAnnouncementItem.id) && Intrinsics.EZpvd((Object) this.title, (Object) popupAnnouncementItem.title) && Intrinsics.EZpvd((Object) this.htmlContent, (Object) popupAnnouncementItem.htmlContent) && Intrinsics.EZpvd((Object) this.dataTrackingKey, (Object) popupAnnouncementItem.dataTrackingKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataTrackingKey() {
        return this.dataTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.htmlContent;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dataTrackingKey;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PopupAnnouncementItem(id=" + this.id + ", title=" + this.title + ", htmlContent=" + this.htmlContent + ", dataTrackingKey=" + this.dataTrackingKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.PopupAnnouncementItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PopupAnnouncementItem> serializer() {
            return PopupAnnouncementItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PopupAnnouncementItem(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.htmlContent = null;
        } else {
            this.htmlContent = str3;
        }
        if ((i & 8) == 0) {
            this.dataTrackingKey = null;
        } else {
            this.dataTrackingKey = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(PopupAnnouncementItem popupAnnouncementItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || popupAnnouncementItem.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, popupAnnouncementItem.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || popupAnnouncementItem.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, popupAnnouncementItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || popupAnnouncementItem.htmlContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, popupAnnouncementItem.htmlContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && popupAnnouncementItem.dataTrackingKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, popupAnnouncementItem.dataTrackingKey);
    }

    public PopupAnnouncementItem(String str, String str2, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.htmlContent = str3;
        this.dataTrackingKey = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.okex.center.bean.PopupAnnouncementItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PopupAnnouncementItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
