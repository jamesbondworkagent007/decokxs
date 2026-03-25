package com.okinc.assets.backend.api.model.transfer;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification;
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

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class PortfolioMarginVerification$MarginLevelConfirmation$$serializer implements GeneratedSerializer<PortfolioMarginVerification.MarginLevelConfirmation> {
    public static final int $stable;
    public static final PortfolioMarginVerification$MarginLevelConfirmation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PortfolioMarginVerification$MarginLevelConfirmation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PortfolioMarginVerification$MarginLevelConfirmation$$serializer portfolioMarginVerification$MarginLevelConfirmation$$serializer = new PortfolioMarginVerification$MarginLevelConfirmation$$serializer();
        INSTANCE = portfolioMarginVerification$MarginLevelConfirmation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.transfer.PortfolioMarginVerification.MarginLevelConfirmation", portfolioMarginVerification$MarginLevelConfirmation$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("isTransferConfirmation", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseAmt", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseAmtAft", true);
        pluginGeneratedSerialDescriptor.addElement("spotInUseAmtVar", true);
        pluginGeneratedSerialDescriptor.addElement("mgnRatio", false);
        pluginGeneratedSerialDescriptor.addElement("mmr", false);
        pluginGeneratedSerialDescriptor.addElement("mmrAft", false);
        pluginGeneratedSerialDescriptor.addElement("mgnRatioAft", false);
        pluginGeneratedSerialDescriptor.addElement("mmrVar", false);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PortfolioMarginVerification.MarginLevelConfirmation deserialize(@NotNull Decoder decoder) {
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            bool = bool2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str8 = str12;
            str2 = strDecodeStringElement7;
            str4 = strDecodeStringElement3;
            str6 = str11;
            str5 = str10;
            i = 1023;
        } else {
            int i5 = 0;
            boolean z = true;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            Boolean bool3 = null;
            String strDecodeStringElement12 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str15;
                        z = false;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        str9 = str15;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 1;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        i5 |= 2;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 2:
                        i5 |= 4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str13);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        i5 |= 8;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str14);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        str9 = str15;
                        str15 = str9;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool4 = bool3;
            String str16 = str15;
            str = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement8;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            str5 = str16;
            bool = bool4;
            str6 = str13;
            str7 = strDecodeStringElement10;
            str8 = str14;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PortfolioMarginVerification.MarginLevelConfirmation(i, bool, str5, str6, str8, str4, str3, str7, str, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PortfolioMarginVerification.MarginLevelConfirmation marginLevelConfirmation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(marginLevelConfirmation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PortfolioMarginVerification.MarginLevelConfirmation.write$Self$OKAssets_assets_pro_api(marginLevelConfirmation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
