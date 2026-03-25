package com.okinc.business.web3pay.api.model;

import androidx.core.app.FrameMetricsAggregator;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OffshoreAddFundsFlowParams$$serializer implements GeneratedSerializer<OffshoreAddFundsFlowParams> {
    public static final int $stable;
    public static final OffshoreAddFundsFlowParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OffshoreAddFundsFlowParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OffshoreAddFundsFlowParams$$serializer offshoreAddFundsFlowParams$$serializer = new OffshoreAddFundsFlowParams$$serializer();
        INSTANCE = offshoreAddFundsFlowParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.api.model.OffshoreAddFundsFlowParams", offshoreAddFundsFlowParams$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("showConvert", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("convertFromTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", false);
        pluginGeneratedSerialDescriptor.addElement("convertSubTitle", false);
        pluginGeneratedSerialDescriptor.addElement("exchangeReceiveSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("onChainReceiveSubtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OffshoreAddFundsFlowParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[5], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OffshoreAddFundsFlowParams deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        Web3PayProjectId web3PayProjectId;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        Boolean bool2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OffshoreAddFundsFlowParams.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 8;
        int i5 = 4;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Web3PayProjectId web3PayProjectId2 = (Web3PayProjectId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            i = FrameMetricsAggregator.EVERY_DURATION;
            web3PayProjectId = web3PayProjectId2;
            str4 = str11;
            str2 = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement3;
            str3 = strDecodeStringElement5;
            str = str9;
            str5 = str10;
            bool = bool3;
            str6 = str8;
        } else {
            int i6 = 0;
            boolean z = true;
            String str12 = null;
            Web3PayProjectId web3PayProjectId3 = null;
            String str13 = null;
            String strDecodeStringElement6 = null;
            strDecodeStringElement = null;
            Boolean bool4 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool2 = bool4;
                        str7 = str14;
                        z = false;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 0:
                        bool2 = bool4;
                        str7 = str14;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i6 |= 1;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 1:
                        bool2 = bool4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str14);
                        i6 |= 2;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 2:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool4);
                        i6 |= 4;
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 3:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i6 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        i6 |= 16;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str13);
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 5:
                        i6 |= 32;
                        web3PayProjectId3 = (Web3PayProjectId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], web3PayProjectId3);
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 6:
                        i6 |= 64;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        bool2 = bool4;
                        str7 = str14;
                        bool4 = bool2;
                        str14 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            str = str14;
            str2 = strDecodeStringElement2;
            str3 = strDecodeStringElement6;
            web3PayProjectId = web3PayProjectId3;
            str4 = str13;
            bool = bool4;
            str5 = str12;
            str6 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OffshoreAddFundsFlowParams(i, str6, str, bool, str5, str4, web3PayProjectId, strDecodeStringElement, str2, str3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OffshoreAddFundsFlowParams offshoreAddFundsFlowParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(offshoreAddFundsFlowParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OffshoreAddFundsFlowParams.EZpvd(offshoreAddFundsFlowParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
