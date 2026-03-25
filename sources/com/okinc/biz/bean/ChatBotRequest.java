package com.okinc.biz.bean;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ChatBotRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private String contextualBot;
    private String contextualParams;
    private final Map<String, String> extraParams;
    private Long faqGroupId;
    private int formSource;
    private String greetingAda;
    private String greetings;
    private String okaChatbotMessage;
    private String okaFrom;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getContextualBot$annotations() {
    }

    public static /* synthetic */ void getFaqGroupId$annotations() {
    }

    public static /* synthetic */ void getFormSource$annotations() {
    }

    public static /* synthetic */ void getGreetingAda$annotations() {
    }

    public static /* synthetic */ void getGreetings$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualBot() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualParams() {
        return this.contextualParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFaqGroupId() {
        return this.faqGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFormSource() {
        return this.formSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreetingAda() {
        return this.greetingAda;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreetings() {
        return this.greetings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkaChatbotMessage() {
        return this.okaChatbotMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkaFrom() {
        return this.okaFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContextualBot(String str) {
        this.contextualBot = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContextualParams(String str) {
        this.contextualParams = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaqGroupId(Long l) {
        this.faqGroupId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormSource(int i) {
        this.formSource = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGreetings(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.greetings = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkaChatbotMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.okaChatbotMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkaFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.okaFrom = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.bean.ChatBotRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatBotRequest> serializer() {
            return ChatBotRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, null};
    }

    public ChatBotRequest() {
        this.okaFrom = "";
        this.okaChatbotMessage = "";
        this.extraParams = new LinkedHashMap();
        this.greetings = "";
        this.greetingAda = "";
        this.contextualParams = "";
    }

    public /* synthetic */ ChatBotRequest(int i, String str, String str2, Map map, int i2, String str3, String str4, String str5, Long l, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.okaFrom = "";
        } else {
            this.okaFrom = str;
        }
        if ((i & 2) == 0) {
            this.okaChatbotMessage = "";
        } else {
            this.okaChatbotMessage = str2;
        }
        if ((i & 4) == 0) {
            this.extraParams = new LinkedHashMap();
        } else {
            this.extraParams = map;
        }
        if ((i & 8) == 0) {
            this.formSource = 0;
        } else {
            this.formSource = i2;
        }
        if ((i & 16) == 0) {
            this.greetings = "";
        } else {
            this.greetings = str3;
        }
        if ((i & 32) == 0) {
            this.greetingAda = "";
        } else {
            this.greetingAda = str4;
        }
        if ((i & 64) == 0) {
            this.contextualBot = null;
        } else {
            this.contextualBot = str5;
        }
        if ((i & 128) == 0) {
            this.faqGroupId = null;
        } else {
            this.faqGroupId = l;
        }
        if ((i & 256) == 0) {
            this.contextualParams = "";
        } else {
            this.contextualParams = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(ChatBotRequest chatBotRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) chatBotRequest.okaFrom, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, chatBotRequest.okaFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chatBotRequest.okaChatbotMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chatBotRequest.okaChatbotMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(chatBotRequest.extraParams, new LinkedHashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], chatBotRequest.extraParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || chatBotRequest.formSource != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, chatBotRequest.formSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chatBotRequest.greetings, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chatBotRequest.greetings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) chatBotRequest.greetingAda, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, chatBotRequest.greetingAda);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || chatBotRequest.contextualBot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, chatBotRequest.contextualBot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || chatBotRequest.faqGroupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, chatBotRequest.faqGroupId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) chatBotRequest.contextualParams, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, chatBotRequest.contextualParams);
    }

    public final void setGreetingAda(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        this.greetingAda = sb.toString();
    }
}
