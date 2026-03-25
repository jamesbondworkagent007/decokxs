package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MoreFunctionInfo$$serializer implements GeneratedSerializer<MoreFunctionInfo> {
    public static final int $stable;
    public static final MoreFunctionInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MoreFunctionInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MoreFunctionInfo$$serializer moreFunctionInfo$$serializer = new MoreFunctionInfo$$serializer();
        INSTANCE = moreFunctionInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.MoreFunctionInfo", moreFunctionInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("dayIcon", true);
        pluginGeneratedSerialDescriptor.addElement("nightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("jumpUrl", true);
        pluginGeneratedSerialDescriptor.addElement("jumpType", true);
        pluginGeneratedSerialDescriptor.addElement("supportWalletType", true);
        pluginGeneratedSerialDescriptor.addElement("recommendFlag", true);
        pluginGeneratedSerialDescriptor.addElement("projectCount", true);
        pluginGeneratedSerialDescriptor.addElement("projectCountText", true);
        pluginGeneratedSerialDescriptor.addElement("localeBuildEnum", true);
        pluginGeneratedSerialDescriptor.addElement("walletMode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = MoreFunctionInfo.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, kSerializerArr[6], BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MoreFunctionInfo deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i;
        int i2;
        int i3;
        List list;
        Integer num3;
        String str5;
        boolean z2;
        int iDecodeIntElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = MoreFunctionInfo.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, intSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, intSerializer, null);
            list = list2;
            i2 = iDecodeIntElement2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            num2 = num5;
            str5 = str6;
            z = zDecodeBooleanElement;
            i = iDecodeIntElement3;
            str = strDecodeStringElement3;
            num3 = num4;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement2;
            i3 = 4095;
            str4 = strDecodeStringElement;
        } else {
            int i4 = 11;
            List list3 = null;
            Integer num6 = null;
            String str7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement4 = 0;
            boolean z3 = true;
            Integer num7 = null;
            int i6 = 0;
            Integer num8 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 11;
                        break;
                    case 0:
                        z2 = false;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i5 |= 1;
                        i6 = iDecodeIntElement;
                        i4 = 11;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        iDecodeIntElement = i6;
                        z2 = false;
                        i6 = iDecodeIntElement;
                        i4 = 11;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        iDecodeIntElement = i6;
                        z2 = false;
                        i6 = iDecodeIntElement;
                        i4 = 11;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        iDecodeIntElement = i6;
                        z2 = false;
                        i6 = iDecodeIntElement;
                        i4 = 11;
                        break;
                    case 4:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        iDecodeIntElement = i6;
                        z2 = false;
                        i6 = iDecodeIntElement;
                        i4 = 11;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 11;
                        break;
                    case 6:
                        i5 |= 64;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list3);
                        i4 = 11;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 11;
                        break;
                    case 8:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, num6);
                        i5 |= 256;
                        i4 = 11;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str7);
                        i5 |= 512;
                        i4 = 11;
                        break;
                    case 10:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num7);
                        i5 |= 1024;
                        i4 = 11;
                        break;
                    case 11:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num8);
                        i5 |= 2048;
                        i4 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num8;
            num2 = num7;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            z = zDecodeBooleanElement2;
            i = iDecodeIntElement4;
            i2 = i6;
            i3 = i5;
            list = list3;
            num3 = num6;
            str5 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MoreFunctionInfo(i3, i2, str4, str3, str, str2, i, list, z, num3, str5, num2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MoreFunctionInfo moreFunctionInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(moreFunctionInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MoreFunctionInfo.write$Self$OKWallet_wallet_impl(moreFunctionInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
