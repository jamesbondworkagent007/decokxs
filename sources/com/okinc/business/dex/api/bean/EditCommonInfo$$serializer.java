package com.okinc.business.dex.api.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class EditCommonInfo$$serializer implements GeneratedSerializer<EditCommonInfo> {
    public static final int $stable;
    public static final EditCommonInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditCommonInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditCommonInfo$$serializer editCommonInfo$$serializer = new EditCommonInfo$$serializer();
        INSTANCE = editCommonInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.api.bean.EditCommonInfo", editCommonInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("slippage", false);
        pluginGeneratedSerialDescriptor.addElement("expireTime", false);
        pluginGeneratedSerialDescriptor.addElement("expireTimeType", true);
        pluginGeneratedSerialDescriptor.addElement("rate", false);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", false);
        pluginGeneratedSerialDescriptor.addElement("feeType", false);
        pluginGeneratedSerialDescriptor.addElement("feeToken", false);
        pluginGeneratedSerialDescriptor.addElement("clickMax", true);
        pluginGeneratedSerialDescriptor.addElement("switchFromTo", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("slippageType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, intSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditCommonInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int iDecodeIntElement;
        String str;
        boolean z;
        boolean z2;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i3;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str3 = strDecodeStringElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            str = strDecodeStringElement7;
            z2 = zDecodeBooleanElement;
            str6 = strDecodeStringElement6;
            i2 = iDecodeIntElement2;
            str4 = strDecodeStringElement4;
            str2 = str7;
            z = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement5;
            i = 2047;
            str5 = strDecodeStringElement3;
        } else {
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z3 = true;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            String str8 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 10;
                        break;
                    case 0:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 10;
                        break;
                    case 1:
                        c = 2;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 10;
                        break;
                    case 2:
                        c = 2;
                        i5 |= 4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str8);
                        i4 = 10;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 = 10;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 = 10;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i3 = i5 | 32;
                        i5 = i3;
                        i4 = 10;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 10;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 = i5 | 128;
                        i5 = i3;
                        i4 = 10;
                        break;
                    case 8:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i3 = i5 | 256;
                        i5 = i3;
                        i4 = 10;
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 = 10;
                        break;
                    case 10:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i3 = i5 | 1024;
                        i5 = i3;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement3;
            str = strDecodeStringElement9;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            str2 = str8;
            i = i5;
            String str9 = strDecodeStringElement11;
            i2 = iDecodeIntElement4;
            str3 = str9;
            String str10 = strDecodeStringElement10;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement12;
            str6 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditCommonInfo(i, str3, str5, str2, str4, strDecodeStringElement, i2, str6, z2, z, str, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditCommonInfo editCommonInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editCommonInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditCommonInfo.write$Self$OKDex_dex_api(editCommonInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
