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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class CardChoicesValue$$serializer implements GeneratedSerializer<CardChoicesValue> {
    public static final int $stable;
    public static final CardChoicesValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CardChoicesValue$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CardChoicesValue$$serializer cardChoicesValue$$serializer = new CardChoicesValue$$serializer();
        INSTANCE = cardChoicesValue$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesValue", cardChoicesValue$$serializer, 9);
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
        KSerializer[] kSerializerArr = CardChoicesValue.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), BuiltinSerializersKt.getNullable(CardChoicesIcon$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(HelperLabelTag$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CTAButtonAppModel$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CardChoicesValue deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        List list;
        HelperLabelTag helperLabelTag;
        CTAButtonAppModel cTAButtonAppModel;
        CardChoicesIcon cardChoicesIcon;
        String str2;
        List list2;
        CardChoicesIcon cardChoicesIcon2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CardChoicesValue.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        int i4 = 8;
        Boolean bool = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            CardChoicesIcon cardChoicesIcon3 = (CardChoicesIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            HelperLabelTag helperLabelTag2 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, HelperLabelTag$$serializer.INSTANCE, null);
            CTAButtonAppModel cTAButtonAppModel2 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, CTAButtonAppModel$$serializer.INSTANCE, null);
            i = FrameMetricsAggregator.EVERY_DURATION;
            list = list4;
            helperLabelTag = helperLabelTag2;
            str = str4;
            strDecodeStringElement = strDecodeStringElement2;
            cTAButtonAppModel = cTAButtonAppModel2;
            str2 = str3;
            bool = bool2;
            cardChoicesIcon = cardChoicesIcon3;
            list2 = list3;
        } else {
            boolean z = true;
            int i5 = 0;
            String str5 = null;
            String str6 = null;
            List list5 = null;
            HelperLabelTag helperLabelTag3 = null;
            strDecodeStringElement = null;
            CTAButtonAppModel cTAButtonAppModel3 = null;
            CardChoicesIcon cardChoicesIcon4 = null;
            List list6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        cardChoicesIcon2 = cardChoicesIcon4;
                        z = false;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 0:
                        cardChoicesIcon2 = cardChoicesIcon4;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list6);
                        i5 |= 1;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 1:
                        cardChoicesIcon4 = (CardChoicesIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CardChoicesIcon$$serializer.INSTANCE, cardChoicesIcon4);
                        i5 |= 2;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 2:
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool);
                        i5 |= 4;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 4:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str5);
                        i5 |= 16;
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str6);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], list5);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 7:
                        i5 |= 128;
                        helperLabelTag3 = (HelperLabelTag) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, HelperLabelTag$$serializer.INSTANCE, helperLabelTag3);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    case 8:
                        i5 |= 256;
                        cTAButtonAppModel3 = (CTAButtonAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, CTAButtonAppModel$$serializer.INSTANCE, cTAButtonAppModel3);
                        cardChoicesIcon2 = cardChoicesIcon4;
                        cardChoicesIcon4 = cardChoicesIcon2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            CardChoicesIcon cardChoicesIcon5 = cardChoicesIcon4;
            i = i5;
            str = str6;
            list = list5;
            helperLabelTag = helperLabelTag3;
            cTAButtonAppModel = cTAButtonAppModel3;
            cardChoicesIcon = cardChoicesIcon5;
            str2 = str5;
            list2 = list6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CardChoicesValue(i, list2, cardChoicesIcon, bool, strDecodeStringElement, str2, str, list, helperLabelTag, cTAButtonAppModel, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CardChoicesValue cardChoicesValue) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardChoicesValue, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CardChoicesValue.write$Self$OKCompliance_ok_compliance_impl(cardChoicesValue, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
