package com.okinc.ok_kyc_core.data.remote.networkmodel;

import androidx.core.app.FrameMetricsAggregator;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CardChoicesValueData$$serializer implements GeneratedSerializer<CardChoicesValueData> {
    public static final int $stable;
    public static final CardChoicesValueData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CardChoicesValueData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CardChoicesValueData$$serializer cardChoicesValueData$$serializer = new CardChoicesValueData$$serializer();
        INSTANCE = cardChoicesValueData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValueData", cardChoicesValueData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("searchKey", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("selected", true);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("tip", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(CardChoicesValueData.$childSerializers[0]), BuiltinSerializersKt.getNullable(CardChoicesIcon$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE), BuiltinSerializersKt.getNullable(HelperLabelTag$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButton$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CardChoicesValueData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        JsonArray jsonArray;
        HelperLabelTag helperLabelTag;
        CTAButton cTAButton;
        int i;
        List list;
        String str3;
        Boolean bool;
        CardChoicesIcon cardChoicesIcon;
        CardChoicesIcon cardChoicesIcon2;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CardChoicesValueData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CardChoicesIcon cardChoicesIcon3 = (CardChoicesIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            JsonArray jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, JsonArraySerializer.INSTANCE, null);
            HelperLabelTag helperLabelTag2 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, HelperLabelTag$$serializer.INSTANCE, null);
            CTAButton cTAButton2 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButton$$serializer.INSTANCE, null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            list = list3;
            cardChoicesIcon = cardChoicesIcon3;
            helperLabelTag = helperLabelTag2;
            jsonArray = jsonArray2;
            str2 = str5;
            str3 = strDecodeStringElement;
            cTAButton = cTAButton2;
            str = str4;
            bool = bool3;
        } else {
            boolean z = true;
            int i6 = 0;
            String str6 = null;
            String str7 = null;
            JsonArray jsonArray3 = null;
            HelperLabelTag helperLabelTag3 = null;
            String strDecodeStringElement2 = null;
            CTAButton cTAButton3 = null;
            CardChoicesIcon cardChoicesIcon4 = null;
            List list4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        cardChoicesIcon2 = cardChoicesIcon4;
                        list2 = list4;
                        z = false;
                        list4 = list2;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 0:
                        cardChoicesIcon2 = cardChoicesIcon4;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list4);
                        i6 |= 1;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 1:
                        cardChoicesIcon4 = (CardChoicesIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, cardChoicesIcon4);
                        i6 |= 2;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 2:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool2);
                        i6 |= 4;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        list2 = list4;
                        list4 = list2;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 4:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str6);
                        i6 |= 16;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        list2 = list4;
                        list4 = list2;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, JsonArraySerializer.INSTANCE, jsonArray3);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        helperLabelTag3 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, HelperLabelTag$$serializer.INSTANCE, helperLabelTag3);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        cTAButton3 = (CTAButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, CTAButton$$serializer.INSTANCE, cTAButton3);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CardChoicesIcon cardChoicesIcon5 = cardChoicesIcon4;
            List list5 = list4;
            str = str6;
            str2 = str7;
            jsonArray = jsonArray3;
            helperLabelTag = helperLabelTag3;
            cTAButton = cTAButton3;
            i = i6;
            list = list5;
            str3 = strDecodeStringElement2;
            bool = bool2;
            cardChoicesIcon = cardChoicesIcon5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardChoicesValueData(i, list, cardChoicesIcon, bool, str3, str, str2, jsonArray, helperLabelTag, cTAButton, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CardChoicesValueData cardChoicesValueData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardChoicesValueData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CardChoicesValueData.write$Self$OKCompliance_ok_compliance_impl(cardChoicesValueData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
