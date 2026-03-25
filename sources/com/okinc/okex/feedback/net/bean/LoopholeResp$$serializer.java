package com.okinc.okex.feedback.net.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class LoopholeResp$$serializer implements GeneratedSerializer<LoopholeResp> {
    public static final int $stable;
    public static final LoopholeResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LoopholeResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LoopholeResp$$serializer loopholeResp$$serializer = new LoopholeResp$$serializer();
        INSTANCE = loopholeResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.feedback.net.bean.LoopholeResp", loopholeResp$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("statusInfo", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("auditContent", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("mainCategoryId", true);
        pluginGeneratedSerialDescriptor.addElement("childId", true);
        pluginGeneratedSerialDescriptor.addElement("mainCategoryName", true);
        pluginGeneratedSerialDescriptor.addElement("childName", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("rewardAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = LoopholeResp.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, LongSerializer.INSTANCE, intSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LoopholeResp deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        Integer num3;
        String str5;
        long j;
        int i;
        String str6;
        int i2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = LoopholeResp.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            i2 = 8191;
            str = str12;
            str4 = str11;
            str2 = str10;
            num = num5;
            num3 = num4;
            str6 = str9;
            num2 = num6;
            str3 = str8;
            str5 = strDecodeStringElement;
            j = jDecodeLongElement;
            arrayList = arrayList2;
            i = iDecodeIntElement2;
            iDecodeIntElement = iDecodeIntElement3;
        } else {
            int i5 = 12;
            int i6 = 0;
            Integer num7 = null;
            Integer num8 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String strDecodeStringElement2 = null;
            String str16 = null;
            ArrayList arrayList3 = null;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            iDecodeIntElement = 0;
            String str17 = null;
            Integer num9 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str16;
                        z = false;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 0:
                        str7 = str16;
                        i6 |= 1;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        str7 = str16;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i6 |= 2;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        str7 = str16;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 |= 4;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        str7 = str16;
                        i6 |= 8;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], arrayList3);
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str7 = str16;
                        i6 |= 16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 5:
                        i6 |= 32;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str16);
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 6:
                        i6 |= 64;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num9);
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        i6 |= 128;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num7);
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        i6 |= 256;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num8);
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        i6 |= 512;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 10:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        i6 |= 1024;
                        i5 = 12;
                        break;
                    case 11:
                        i6 |= 2048;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str17);
                        i6 |= 4096;
                        str7 = str16;
                        str16 = str7;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str18 = str16;
            str = str17;
            num = num7;
            num2 = num8;
            arrayList = arrayList3;
            str2 = str13;
            str3 = str14;
            str4 = str15;
            num3 = num9;
            str5 = strDecodeStringElement2;
            j = jDecodeLongElement2;
            i = iDecodeIntElement4;
            str6 = str18;
            i2 = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LoopholeResp(i2, i, j, iDecodeIntElement, arrayList, str3, str6, num3, num, num2, str2, str4, str5, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LoopholeResp loopholeResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loopholeResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LoopholeResp.write$Self$OKSupport_support_impl(loopholeResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
