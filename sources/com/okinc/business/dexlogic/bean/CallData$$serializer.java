package com.okinc.business.dexlogic.bean;

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
public final /* synthetic */ class CallData$$serializer implements GeneratedSerializer<CallData> {
    public static final int $stable;
    public static final CallData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CallData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CallData$$serializer callData$$serializer = new CallData$$serializer();
        INSTANCE = callData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.CallData", callData$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("from", true);
        pluginGeneratedSerialDescriptor.addElement("to", true);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("gas", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("sender", true);
        pluginGeneratedSerialDescriptor.addElement("memo", true);
        pluginGeneratedSerialDescriptor.addElement("memoPos", true);
        pluginGeneratedSerialDescriptor.addElement("bridgeId", true);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("unsignedTx", true);
        pluginGeneratedSerialDescriptor.addElement("hasReferralCommission", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CallData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zDecodeBooleanElement;
        String str10;
        int i;
        String str11;
        String str12;
        String strDecodeStringElement;
        String str13;
        String str14;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 7;
        String str15 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            str3 = str21;
            str11 = str20;
            str = str19;
            str13 = strDecodeStringElement7;
            str10 = str17;
            str5 = str18;
            str4 = str16;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            str9 = strDecodeStringElement2;
            str8 = strDecodeStringElement3;
            str12 = strDecodeStringElement4;
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            i = 32767;
        } else {
            int i6 = 14;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z = true;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String str27 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str14 = str27;
                        z = false;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 0:
                        str14 = str27;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 1:
                        str14 = str27;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 2:
                        str14 = str27;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 3:
                        str14 = str27;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 4:
                        i7 |= 16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str27);
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 6:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str24);
                        i7 |= 64;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 7:
                        i2 = i5;
                        i7 |= 128;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 = i2;
                        i6 = 14;
                        break;
                    case 8:
                        i7 |= 256;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str25);
                        i2 = 7;
                        i5 = i2;
                        i6 = 14;
                        break;
                    case 9:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str22);
                        i7 |= 512;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 10:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str26);
                        i7 |= 1024;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 11:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        i7 |= 2048;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 12:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str23);
                        i7 |= 4096;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 13:
                        i7 |= 8192;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i7 |= 16384;
                        str14 = str27;
                        str27 = str14;
                        i6 = 14;
                        i3 = 11;
                        i4 = 10;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str28 = str27;
            str = str22;
            str2 = str23;
            str3 = str15;
            str4 = str28;
            str5 = str25;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement13;
            str9 = strDecodeStringElement14;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str10 = str24;
            i = i7;
            String str29 = strDecodeStringElement11;
            str11 = str26;
            str12 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement10;
            str13 = str29;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CallData(i, str9, str8, str12, str6, str4, str7, str10, str13, str5, str, str11, str3, str2, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CallData callData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(callData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CallData.write$Self$OKDex_dex_impl(callData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
