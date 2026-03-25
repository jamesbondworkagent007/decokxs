package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class SignInfoReq$$serializer implements GeneratedSerializer<SignInfoReq> {
    public static final int $stable;
    public static final SignInfoReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignInfoReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignInfoReq$$serializer signInfoReq$$serializer = new SignInfoReq$$serializer();
        INSTANCE = signInfoReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.SignInfoReq", signInfoReq$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("coinId", false);
        pluginGeneratedSerialDescriptor.addElement("fromAddr", false);
        pluginGeneratedSerialDescriptor.addElement("toAddr", true);
        pluginGeneratedSerialDescriptor.addElement("scenario", true);
        pluginGeneratedSerialDescriptor.addElement("inputData", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("dataLength", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("callValue", true);
        pluginGeneratedSerialDescriptor.addElement("feeLimit", true);
        pluginGeneratedSerialDescriptor.addElement("functionSelector", true);
        pluginGeneratedSerialDescriptor.addElement("permissionId", true);
        pluginGeneratedSerialDescriptor.addElement("visible", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignInfoReq deserialize(@NotNull Decoder decoder) {
        Integer num;
        Long l;
        String str;
        Integer num2;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Long l2;
        int i2;
        String str6;
        String strDecodeStringElement;
        Boolean bool;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 9;
        int i4 = 7;
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, null);
            num = num4;
            l2 = l4;
            str = str9;
            num2 = num3;
            str2 = str8;
            l = l3;
            str6 = str7;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement2;
            str3 = strDecodeStringElement4;
            i = iDecodeIntElement;
            i2 = 8191;
        } else {
            int i5 = 12;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            Long l5 = null;
            Integer num5 = null;
            Long l6 = null;
            String str10 = null;
            Integer num6 = null;
            String str11 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z = true;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 0:
                        i6 |= 1;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 1:
                        i6 |= 2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 3:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 |= 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 4:
                        i6 |= 16;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 5:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 |= 32;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 6:
                        i6 |= 64;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str12);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 7:
                        i6 |= 128;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num6);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 8:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l6);
                        i6 |= 256;
                        i5 = 12;
                        break;
                    case 9:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l5);
                        i6 |= 512;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 10:
                        i6 |= 1024;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str10);
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 11:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num5);
                        i6 |= 2048;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    case 12:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool2);
                        i6 |= 4096;
                        i3 = 9;
                        i4 = 7;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num5;
            l = l6;
            str = str10;
            num2 = num6;
            str2 = str12;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement8;
            i = iDecodeIntElement2;
            l2 = l5;
            i2 = i6;
            str6 = str11;
            strDecodeStringElement = strDecodeStringElement6;
            bool = bool2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignInfoReq(i2, str5, str4, strDecodeStringElement, i, str6, str3, str2, num2, l, l2, str, num, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignInfoReq signInfoReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signInfoReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignInfoReq.EZpvd(signInfoReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
