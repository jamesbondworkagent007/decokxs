package com.okinc.okimcore.model.other;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AnnouncementBanner {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String ctaContent;
    private final String detailContentApp;
    private final String detailTitle;
    private final boolean showCta;
    private final String updateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnouncementBanner() {
        this((String) null, (String) null, false, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AnnouncementBanner copy$default(AnnouncementBanner announcementBanner, String str, String str2, boolean z, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = announcementBanner.content;
        }
        if ((i & 2) != 0) {
            str2 = announcementBanner.updateTime;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            z = announcementBanner.showCta;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = announcementBanner.ctaContent;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = announcementBanner.detailTitle;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = announcementBanner.detailContentApp;
        }
        return announcementBanner.copy(str, str6, z2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.showCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ctaContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.detailTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.detailContentApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnouncementBanner copy(String str, String str2, boolean z, String str3, String str4, String str5) {
        return new AnnouncementBanner(str, str2, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnouncementBanner)) {
            return false;
        }
        AnnouncementBanner announcementBanner = (AnnouncementBanner) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) announcementBanner.content) && Intrinsics.EZpvd((Object) this.updateTime, (Object) announcementBanner.updateTime) && this.showCta == announcementBanner.showCta && Intrinsics.EZpvd((Object) this.ctaContent, (Object) announcementBanner.ctaContent) && Intrinsics.EZpvd((Object) this.detailTitle, (Object) announcementBanner.detailTitle) && Intrinsics.EZpvd((Object) this.detailContentApp, (Object) announcementBanner.detailContentApp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaContent() {
        return this.ctaContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailContentApp() {
        return this.detailContentApp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailTitle() {
        return this.detailTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCta() {
        return this.showCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.updateTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Boolean.hashCode(this.showCta);
        String str3 = this.ctaContent;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.detailTitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.detailContentApp;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnnouncementBanner(content=" + this.content + ", updateTime=" + this.updateTime + ", showCta=" + this.showCta + ", ctaContent=" + this.ctaContent + ", detailTitle=" + this.detailTitle + ", detailContentApp=" + this.detailContentApp + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.AnnouncementBanner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnouncementBanner> serializer() {
            return AnnouncementBanner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnouncementBanner(int i, String str, String str2, boolean z, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = str2;
        }
        if ((i & 4) == 0) {
            this.showCta = true;
        } else {
            this.showCta = z;
        }
        if ((i & 8) == 0) {
            this.ctaContent = null;
        } else {
            this.ctaContent = str3;
        }
        if ((i & 16) == 0) {
            this.detailTitle = null;
        } else {
            this.detailTitle = str4;
        }
        if ((i & 32) == 0) {
            this.detailContentApp = null;
        } else {
            this.detailContentApp = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AnnouncementBanner announcementBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || announcementBanner.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, announcementBanner.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || announcementBanner.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, announcementBanner.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !announcementBanner.showCta) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, announcementBanner.showCta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || announcementBanner.ctaContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, announcementBanner.ctaContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || announcementBanner.detailTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, announcementBanner.detailTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && announcementBanner.detailContentApp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, announcementBanner.detailContentApp);
    }

    public AnnouncementBanner(String str, String str2, boolean z, String str3, String str4, String str5) {
        this.content = str;
        this.updateTime = str2;
        this.showCta = z;
        this.ctaContent = str3;
        this.detailTitle = str4;
        this.detailContentApp = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:boolean:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.model.other.AnnouncementBanner.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AnnouncementBanner(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
