package com.okinc.okex.center.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class SelfServiceToolBean$$serializer implements GeneratedSerializer<SelfServiceToolBean> {
    public static final int $stable;
    public static final SelfServiceToolBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SelfServiceToolBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SelfServiceToolBean$$serializer selfServiceToolBean$$serializer = new SelfServiceToolBean$$serializer();
        INSTANCE = selfServiceToolBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.SelfServiceToolBean", selfServiceToolBean$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("dataTrackingKey", true);
        pluginGeneratedSerialDescriptor.addElement("deeplink", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("iconBright", true);
        pluginGeneratedSerialDescriptor.addElement("iconDark", true);
        pluginGeneratedSerialDescriptor.addElement("scenario", true);
        pluginGeneratedSerialDescriptor.addElement("slug", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("adaGreeting", true);
        pluginGeneratedSerialDescriptor.addElement("contextualBot", true);
        pluginGeneratedSerialDescriptor.addElement("okAssistantGreeting", true);
        pluginGeneratedSerialDescriptor.addElement("xbotGreeting", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("primary", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SelfServiceToolBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[6], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SelfServiceToolBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        JsonObject jsonObject;
        String str8;
        String str9;
        String str10;
        SelfServiceScenario selfServiceScenario;
        String str11;
        String str12;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SelfServiceToolBean.$childSerializers;
        int i2 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            SelfServiceScenario selfServiceScenario2 = (SelfServiceScenario) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            str7 = strDecodeStringElement5;
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, JsonObjectSerializer.INSTANCE, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, null);
            str10 = strDecodeStringElement6;
            str9 = strDecodeStringElement14;
            str11 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement10;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement7;
            str12 = strDecodeStringElement9;
            str8 = strDecodeStringElement12;
            str = strDecodeStringElement13;
            selfServiceScenario = selfServiceScenario2;
            i = 65535;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement2;
            str4 = strDecodeStringElement4;
        } else {
            int i3 = 15;
            SelfServiceScenario selfServiceScenario3 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            boolean z = true;
            int i4 = 0;
            Boolean bool2 = null;
            JsonObject jsonObject2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 3;
                        z = false;
                        i2 = 4;
                        i3 = 15;
                        break;
                    case 0:
                        c = 3;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 4;
                        i3 = 15;
                        break;
                    case 1:
                        c = 3;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 4;
                        i3 = 15;
                        break;
                    case 2:
                        c = 3;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 4;
                        i3 = 15;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 15;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        c = 3;
                        i2 = 4;
                        i3 = 15;
                        break;
                    case 5:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 15;
                        break;
                    case 6:
                        selfServiceScenario3 = (SelfServiceScenario) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], selfServiceScenario3);
                        i4 |= 64;
                        i3 = 15;
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = 15;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = 15;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = 15;
                        break;
                    case 10:
                        i4 |= 1024;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 = 15;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 15;
                        break;
                    case 12:
                        i4 |= 4096;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = 15;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 15;
                        break;
                    case 14:
                        jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, JsonObjectSerializer.INSTANCE, jsonObject2);
                        i4 |= 16384;
                        i3 = 15;
                        break;
                    case 15:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool2);
                        i4 |= 32768;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            str6 = strDecodeStringElement24;
            str7 = strDecodeStringElement26;
            bool = bool2;
            jsonObject = jsonObject2;
            str8 = strDecodeStringElement15;
            str9 = strDecodeStringElement16;
            str10 = strDecodeStringElement25;
            selfServiceScenario = selfServiceScenario3;
            String str13 = strDecodeStringElement19;
            str11 = strDecodeStringElement18;
            str12 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SelfServiceToolBean(i, str6, str5, str4, str7, str10, str3, selfServiceScenario, str2, str12, strDecodeStringElement, str11, str8, str, str9, jsonObject, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SelfServiceToolBean.write$Self$OKSupport_support_impl(selfServiceToolBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
