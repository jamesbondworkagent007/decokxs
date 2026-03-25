package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class ContactInfoBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String adaGreeting;
    private final String chatWithUsTitle;
    private final Boolean chatbotEnabled;
    private final String chatbotIconBright;
    private final String chatbotIconDark;
    private final String contextualBot;
    private final String okAssistantGreeting;
    private final String xbotGreeting;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContactInfoBean() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.chatbotEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chatWithUsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chatbotIconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chatbotIconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactInfoBean copy(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new ContactInfoBean(bool, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInfoBean)) {
            return false;
        }
        ContactInfoBean contactInfoBean = (ContactInfoBean) obj;
        return Intrinsics.EZpvd(this.chatbotEnabled, contactInfoBean.chatbotEnabled) && Intrinsics.EZpvd((Object) this.chatWithUsTitle, (Object) contactInfoBean.chatWithUsTitle) && Intrinsics.EZpvd((Object) this.chatbotIconBright, (Object) contactInfoBean.chatbotIconBright) && Intrinsics.EZpvd((Object) this.chatbotIconDark, (Object) contactInfoBean.chatbotIconDark) && Intrinsics.EZpvd((Object) this.okAssistantGreeting, (Object) contactInfoBean.okAssistantGreeting) && Intrinsics.EZpvd((Object) this.xbotGreeting, (Object) contactInfoBean.xbotGreeting) && Intrinsics.EZpvd((Object) this.adaGreeting, (Object) contactInfoBean.adaGreeting) && Intrinsics.EZpvd((Object) this.contextualBot, (Object) contactInfoBean.contextualBot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdaGreeting() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatWithUsTitle() {
        return this.chatWithUsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getChatbotEnabled() {
        return this.chatbotEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatbotIconBright() {
        return this.chatbotIconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatbotIconDark() {
        return this.chatbotIconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualBot() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkAssistantGreeting() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXbotGreeting() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.chatbotEnabled;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.chatWithUsTitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.chatbotIconBright;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chatbotIconDark;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.okAssistantGreeting;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.xbotGreeting;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.adaGreeting;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.contextualBot;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContactInfoBean(chatbotEnabled=" + this.chatbotEnabled + ", chatWithUsTitle=" + this.chatWithUsTitle + ", chatbotIconBright=" + this.chatbotIconBright + ", chatbotIconDark=" + this.chatbotIconDark + ", okAssistantGreeting=" + this.okAssistantGreeting + ", xbotGreeting=" + this.xbotGreeting + ", adaGreeting=" + this.adaGreeting + ", contextualBot=" + this.contextualBot + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.ContactInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContactInfoBean> serializer() {
            return ContactInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContactInfoBean(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chatbotEnabled = null;
        } else {
            this.chatbotEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.chatWithUsTitle = null;
        } else {
            this.chatWithUsTitle = str;
        }
        if ((i & 4) == 0) {
            this.chatbotIconBright = null;
        } else {
            this.chatbotIconBright = str2;
        }
        if ((i & 8) == 0) {
            this.chatbotIconDark = null;
        } else {
            this.chatbotIconDark = str3;
        }
        if ((i & 16) == 0) {
            this.okAssistantGreeting = null;
        } else {
            this.okAssistantGreeting = str4;
        }
        if ((i & 32) == 0) {
            this.xbotGreeting = null;
        } else {
            this.xbotGreeting = str5;
        }
        if ((i & 64) == 0) {
            this.adaGreeting = null;
        } else {
            this.adaGreeting = str6;
        }
        if ((i & 128) == 0) {
            this.contextualBot = null;
        } else {
            this.contextualBot = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ContactInfoBean contactInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contactInfoBean.chatbotEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, contactInfoBean.chatbotEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || contactInfoBean.chatWithUsTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contactInfoBean.chatWithUsTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || contactInfoBean.chatbotIconBright != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contactInfoBean.chatbotIconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contactInfoBean.chatbotIconDark != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, contactInfoBean.chatbotIconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contactInfoBean.okAssistantGreeting != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contactInfoBean.okAssistantGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || contactInfoBean.xbotGreeting != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, contactInfoBean.xbotGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || contactInfoBean.adaGreeting != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, contactInfoBean.adaGreeting);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && contactInfoBean.contextualBot == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, contactInfoBean.contextualBot);
    }

    public ContactInfoBean(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.chatbotEnabled = bool;
        this.chatWithUsTitle = str;
        this.chatbotIconBright = str2;
        this.chatbotIconDark = str3;
        this.okAssistantGreeting = str4;
        this.xbotGreeting = str5;
        this.adaGreeting = str6;
        this.contextualBot = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okex.center.bean.ContactInfoBean.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContactInfoBean(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
