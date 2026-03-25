package com.okinc.okex.common.model;

import com.okinc.okex.common.model.SupportServiceData;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class SupportServiceData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.snE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportServiceData._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SupportServiceData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void write$Self(SupportServiceData supportServiceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) SupportServiceData.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SupportServiceData> serializer() {
            return EZpvd();
        }
    }

    private SupportServiceData() {
    }

    public /* synthetic */ SupportServiceData(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.okex.common.model.SupportServiceData", C56524yIo.AEQbTJ(SupportServiceData.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(ArticleData.class), C56524yIo.AEQbTJ(ChatbotData.class), C56524yIo.AEQbTJ(EmailData.class), C56524yIo.AEQbTJ(FormData.class), C56524yIo.AEQbTJ(HelpCenterData.class), C56524yIo.AEQbTJ(MinSupportPageData.class), C56524yIo.AEQbTJ(RecentActivitiesData.class)}, new KSerializer[]{SupportServiceData$ArticleData$$serializer.INSTANCE, SupportServiceData$ChatbotData$$serializer.INSTANCE, SupportServiceData$EmailData$$serializer.INSTANCE, SupportServiceData$FormData$$serializer.INSTANCE, SupportServiceData$HelpCenterData$$serializer.INSTANCE, SupportServiceData$MinSupportPageData$$serializer.INSTANCE, SupportServiceData$RecentActivitiesData$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    public static final class ChatbotData extends SupportServiceData {
        private final String message;
        private final JsonObject params;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ChatbotData() {
            this((String) null, (JsonObject) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ChatbotData copy$default(ChatbotData chatbotData, String str, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatbotData.message;
            }
            if ((i & 2) != 0) {
                jsonObject = chatbotData.params;
            }
            return chatbotData.copy(str, jsonObject);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonObject component2() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChatbotData copy(String str, JsonObject jsonObject) {
            return new ChatbotData(str, jsonObject);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatbotData)) {
                return false;
            }
            ChatbotData chatbotData = (ChatbotData) obj;
            return Intrinsics.EZpvd((Object) this.message, (Object) chatbotData.message) && Intrinsics.EZpvd(this.params, chatbotData.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonObject getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.message;
            int iHashCode = str == null ? 0 : str.hashCode();
            JsonObject jsonObject = this.params;
            return (iHashCode * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChatbotData(message=" + this.message + ", params=" + this.params + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.ChatbotData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ChatbotData> serializer() {
                return SupportServiceData$ChatbotData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ChatbotData(int i, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 2) == 0) {
                this.params = null;
            } else {
                this.params = jsonObject;
            }
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(ChatbotData chatbotData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(chatbotData, compositeEncoder, serialDescriptor);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chatbotData.message != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, chatbotData.message);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && chatbotData.params == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, chatbotData.params);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r3v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:13) call: com.okinc.okex.common.model.SupportServiceData.ChatbotData.<init>(java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
        public /* synthetic */ ChatbotData(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : jsonObject);
        }

        public ChatbotData(String str, JsonObject jsonObject) {
            super(null);
            this.message = str;
            this.params = jsonObject;
        }
    }

    @Serializable
    public static final class FormData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String contextId;
        private final String formId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FormData copy$default(FormData formData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = formData.formId;
            }
            if ((i & 2) != 0) {
                str2 = formData.contextId;
            }
            return formData.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.formId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.contextId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FormData copy(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FormData(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormData)) {
                return false;
            }
            FormData formData = (FormData) obj;
            return Intrinsics.EZpvd((Object) this.formId, (Object) formData.formId) && Intrinsics.EZpvd((Object) this.contextId, (Object) formData.contextId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContextId() {
            return this.contextId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.formId.hashCode();
            String str = this.contextId;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FormData(formId=" + this.formId + ", contextId=" + this.contextId + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.FormData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<FormData> serializer() {
                return SupportServiceData$FormData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FormData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SupportServiceData$FormData$$serializer.INSTANCE.getDescriptor());
            }
            this.formId = str;
            if ((i & 2) == 0) {
                this.contextId = null;
            } else {
                this.contextId = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(FormData formData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(formData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, formData.formId);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && formData.contextId == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, formData.contextId);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.okex.common.model.SupportServiceData.FormData.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ FormData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormData(@NotNull String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.formId = str;
            this.contextId = str2;
        }
    }

    @Serializable
    public static final class EmailData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String email;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EmailData copy$default(EmailData emailData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emailData.email;
            }
            return emailData.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EmailData copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new EmailData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailData) && Intrinsics.EZpvd((Object) this.email, (Object) ((EmailData) obj).email);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEmail() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.email.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EmailData(email=" + this.email + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.EmailData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<EmailData> serializer() {
                return SupportServiceData$EmailData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EmailData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SupportServiceData$EmailData$$serializer.INSTANCE.getDescriptor());
            }
            this.email = str;
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(EmailData emailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(emailData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, emailData.email);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailData(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }
    }

    @Serializable
    public static final class ArticleData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String link;
        private final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ArticleData copy$default(ArticleData articleData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = articleData.name;
            }
            if ((i & 2) != 0) {
                str2 = articleData.link;
            }
            return articleData.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArticleData copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ArticleData(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleData)) {
                return false;
            }
            ArticleData articleData = (ArticleData) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) articleData.name) && Intrinsics.EZpvd((Object) this.link, (Object) articleData.link);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLink() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.name.hashCode() * 31) + this.link.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ArticleData(name=" + this.name + ", link=" + this.link + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.ArticleData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ArticleData> serializer() {
                return SupportServiceData$ArticleData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ArticleData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, SupportServiceData$ArticleData$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
            this.link = str2;
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(ArticleData articleData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(articleData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeStringElement(serialDescriptor, 0, articleData.name);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, articleData.link);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleData(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.link = str2;
        }
    }

    @Serializable
    public static final class HelpCenterData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String slug;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HelpCenterData copy$default(HelpCenterData helpCenterData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = helpCenterData.slug;
            }
            return helpCenterData.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.slug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HelpCenterData copy(String str) {
            return new HelpCenterData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpCenterData) && Intrinsics.EZpvd((Object) this.slug, (Object) ((HelpCenterData) obj).slug);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.slug;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HelpCenterData(slug=" + this.slug + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.HelpCenterData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<HelpCenterData> serializer() {
                return SupportServiceData$HelpCenterData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HelpCenterData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SupportServiceData$HelpCenterData$$serializer.INSTANCE.getDescriptor());
            }
            this.slug = str;
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(HelpCenterData helpCenterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(helpCenterData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, helpCenterData.slug);
        }

        public HelpCenterData(String str) {
            super(null);
            this.slug = str;
        }
    }

    @Serializable
    public static final class MinSupportPageData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Integer id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MinSupportPageData copy$default(MinSupportPageData minSupportPageData, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = minSupportPageData.id;
            }
            return minSupportPageData.copy(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MinSupportPageData copy(Integer num) {
            return new MinSupportPageData(num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MinSupportPageData) && Intrinsics.EZpvd(this.id, ((MinSupportPageData) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.id;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MinSupportPageData(id=" + this.id + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.MinSupportPageData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<MinSupportPageData> serializer() {
                return SupportServiceData$MinSupportPageData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MinSupportPageData(int i, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SupportServiceData$MinSupportPageData$$serializer.INSTANCE.getDescriptor());
            }
            this.id = num;
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(MinSupportPageData minSupportPageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(minSupportPageData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, minSupportPageData.id);
        }

        public MinSupportPageData(Integer num) {
            super(null);
            this.id = num;
        }
    }

    @Serializable
    public static final class RecentActivitiesData extends SupportServiceData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String tab;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RecentActivitiesData copy$default(RecentActivitiesData recentActivitiesData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recentActivitiesData.tab;
            }
            return recentActivitiesData.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tab;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecentActivitiesData copy(String str) {
            return new RecentActivitiesData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentActivitiesData) && Intrinsics.EZpvd((Object) this.tab, (Object) ((RecentActivitiesData) obj).tab);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTab() {
            return this.tab;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.tab;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RecentActivitiesData(tab=" + this.tab + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.model.SupportServiceData.RecentActivitiesData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RecentActivitiesData> serializer() {
                return SupportServiceData$RecentActivitiesData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RecentActivitiesData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SupportServiceData$RecentActivitiesData$$serializer.INSTANCE.getDescriptor());
            }
            this.tab = str;
        }

        public static final /* synthetic */ void write$Self$OKSupport_support_impl(RecentActivitiesData recentActivitiesData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SupportServiceData.write$Self(recentActivitiesData, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, recentActivitiesData.tab);
        }

        public RecentActivitiesData(String str) {
            super(null);
            this.tab = str;
        }
    }
}
