package com.okinc.business.dexlogic.bean;

import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class UnsignedSwapData$$serializer implements GeneratedSerializer<UnsignedSwapData> {
    public static final int $stable;
    public static final UnsignedSwapData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UnsignedSwapData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UnsignedSwapData$$serializer unsignedSwapData$$serializer = new UnsignedSwapData$$serializer();
        INSTANCE = unsignedSwapData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.UnsignedSwapData", unsignedSwapData$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("callData", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeId", true);
        pluginGeneratedSerialDescriptor.addElement("calldataType", true);
        pluginGeneratedSerialDescriptor.addElement("bizLoad", true);
        pluginGeneratedSerialDescriptor.addElement("quoteResult", true);
        pluginGeneratedSerialDescriptor.addElement("offlineTypeQuote", true);
        pluginGeneratedSerialDescriptor.addElement("jitoData", true);
        pluginGeneratedSerialDescriptor.addElement("jitoEnable", true);
        pluginGeneratedSerialDescriptor.addElement("hasReferralCommission", true);
        pluginGeneratedSerialDescriptor.addElement("mevConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, CallData$$serializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(QuotePriceRes$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(JitoData$$serializer.INSTANCE), booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(MevConfig$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UnsignedSwapData deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        JitoData jitoData;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        QuotePriceRes quotePriceRes;
        MevConfig mevConfig;
        String str6;
        CallData callData;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            CallData callData2 = (CallData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CallData$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            QuotePriceRes quotePriceRes2 = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, QuotePriceRes$$serializer.INSTANCE, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            JitoData jitoData2 = (JitoData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JitoData$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            quotePriceRes = quotePriceRes2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            z = zDecodeBooleanElement2;
            str5 = str9;
            jitoData = jitoData2;
            str3 = strDecodeStringElement4;
            mevConfig = (MevConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, MevConfig$$serializer.INSTANCE, null);
            str4 = str8;
            i = 4095;
            str6 = strDecodeStringElement;
            str2 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            callData = callData2;
        } else {
            int i6 = 11;
            boolean zDecodeBooleanElement3 = false;
            boolean z2 = true;
            String str10 = null;
            QuotePriceRes quotePriceRes3 = null;
            MevConfig mevConfig2 = null;
            JitoData jitoData3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String str11 = null;
            CallData callData3 = null;
            String strDecodeStringElement8 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str11;
                        z2 = false;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 0:
                        str7 = str11;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 1:
                        str7 = str11;
                        callData3 = (CallData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CallData$$serializer.INSTANCE, callData3);
                        i5 |= 2;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        str7 = str11;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        str7 = str11;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 4:
                        i5 |= 16;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        i5 |= 64;
                        quotePriceRes3 = (QuotePriceRes) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, QuotePriceRes$$serializer.INSTANCE, quotePriceRes3);
                        break;
                    case 7:
                        i5 |= 128;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        str7 = str11;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 8:
                        i5 |= 256;
                        jitoData3 = (JitoData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, JitoData$$serializer.INSTANCE, jitoData3);
                        str7 = str11;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 9:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i5 |= 512;
                        str7 = str11;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 10:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 1024;
                        str7 = str11;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 11:
                        i5 |= 2048;
                        mevConfig2 = (MevConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, MevConfig$$serializer.INSTANCE, mevConfig2);
                        str7 = str11;
                        str11 = str7;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            i = i5;
            jitoData = jitoData3;
            z = zDecodeBooleanElement4;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = str11;
            str5 = str10;
            quotePriceRes = quotePriceRes3;
            mevConfig = mevConfig2;
            str6 = strDecodeStringElement8;
            callData = callData3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnsignedSwapData(i, str6, callData, str, str2, str4, str3, quotePriceRes, str5, jitoData, z, zDecodeBooleanElement, mevConfig, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UnsignedSwapData unsignedSwapData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unsignedSwapData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UnsignedSwapData.write$Self$OKDex_dex_impl(unsignedSwapData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
