package o;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.biz.bean.enums.SupportChannelType;
import com.okinc.okex.common.bean.UnifiedEntranceResponse;
import com.okinc.okex.common.model.SupportServiceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45296snC implements KSerializer<UnifiedEntranceResponse> {
    public static final C45296snC AEQbTJ = new C45296snC();
    public static final Json OLrzqt = JsonKt.Json$default(null, new Function1() { // from class: o.snD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C45296snC.OLrzqt((JsonBuilder) obj);
        }
    }, 1, null);
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.buildClassSerialDescriptor("UnifiedEntranceResponse", new SerialDescriptor[0], new Function1() { // from class: o.snA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C45296snC.EZpvd((ClassSerialDescriptorBuilder) obj);
        }
    });
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.snC$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SupportChannelType.values().length];
            try {
                iArr[SupportChannelType.Chatbot.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SupportChannelType.Form.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SupportChannelType.Email.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SupportChannelType.Article.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SupportChannelType.HelpCenter.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SupportChannelType.MinSupportPage.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SupportChannelType.RecentActivities.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private C45296snC() {
    }

    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull UnifiedEntranceResponse unifiedEntranceResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unifiedEntranceResponse, "");
        SupportChannelType channel = unifiedEntranceResponse.getChannel();
        switch (channel == null ? -1 : ActionBar.copydefault[channel.ordinal()]) {
            case 1:
                encoder.encodeString("CHATBOT");
                break;
            case 2:
                encoder.encodeString("FORM");
                break;
            case 3:
                encoder.encodeString("EMAIL");
                break;
            case 4:
                encoder.encodeString("ARTICLE");
                break;
            case 5:
                encoder.encodeString("HELP_CENTER");
                break;
            case 6:
                encoder.encodeString("MINI_SUPPORT_PAGE");
                break;
            case 7:
                encoder.encodeString("RECENT_ACTIVITIES");
                break;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UnifiedEntranceResponse deserialize(@NotNull Decoder decoder) {
        SupportChannelType supportChannelType;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(decoder, "");
        SupportServiceData supportServiceData = null;
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new SerializationException("Expected JSON decoder");
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonDecoder.decodeJsonElement());
        JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) AppsFlyerProperties.CHANNEL);
        java.lang.String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        SupportChannelType[] supportChannelTypeArrValues = SupportChannelType.values();
        int length = supportChannelTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                supportChannelType = null;
                break;
            }
            supportChannelType = supportChannelTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) supportChannelType.getValue(), (java.lang.Object) content)) {
                break;
            }
            i++;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get((java.lang.Object) "channelData");
        switch (supportChannelType == null ? -1 : ActionBar.copydefault[supportChannelType.ordinal()]) {
            case 1:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.ChatbotData) OLrzqt.decodeFromJsonElement(SupportServiceData.ChatbotData.Companion.serializer(), jsonElement2);
                }
                break;
            case 2:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.FormData) OLrzqt.decodeFromJsonElement(SupportServiceData.FormData.Companion.serializer(), jsonElement2);
                }
                break;
            case 3:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.EmailData) OLrzqt.decodeFromJsonElement(SupportServiceData.EmailData.Companion.serializer(), jsonElement2);
                }
                break;
            case 4:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.ArticleData) OLrzqt.decodeFromJsonElement(SupportServiceData.ArticleData.Companion.serializer(), jsonElement2);
                }
                break;
            case 5:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.HelpCenterData) OLrzqt.decodeFromJsonElement(SupportServiceData.HelpCenterData.Companion.serializer(), jsonElement2);
                }
                break;
            case 6:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.MinSupportPageData) OLrzqt.decodeFromJsonElement(SupportServiceData.MinSupportPageData.Companion.serializer(), jsonElement2);
                }
                break;
            case 7:
                if (jsonElement2 != null) {
                    supportServiceData = (SupportServiceData.RecentActivitiesData) OLrzqt.decodeFromJsonElement(SupportServiceData.RecentActivitiesData.Companion.serializer(), jsonElement2);
                }
                break;
        }
        return new UnifiedEntranceResponse(supportChannelType, supportServiceData);
    }

    public static final Unit EZpvd(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        java.util.List<? extends java.lang.annotation.Annotation> listAhwBna = yDY.AhwBna();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        classSerialDescriptorBuilder.element(AppsFlyerProperties.CHANNEL, stringSerializer.getDescriptor(), listAhwBna, false);
        classSerialDescriptorBuilder.element("channelData", JsonObject.Companion.serializer().getDescriptor(), yDY.AhwBna(), false);
        classSerialDescriptorBuilder.element("slug", stringSerializer.getDescriptor(), yDY.AhwBna(), false);
        return Unit.INSTANCE;
    }
}
