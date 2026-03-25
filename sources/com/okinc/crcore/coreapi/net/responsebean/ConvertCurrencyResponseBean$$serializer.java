package com.okinc.crcore.coreapi.net.responsebean;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ConvertCurrencyResponseBean$$serializer implements GeneratedSerializer<ConvertCurrencyResponseBean> {
    public static final int $stable;
    public static final ConvertCurrencyResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertCurrencyResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertCurrencyResponseBean$$serializer convertCurrencyResponseBean$$serializer = new ConvertCurrencyResponseBean$$serializer();
        INSTANCE = convertCurrencyResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean", convertCurrencyResponseBean$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("ccyId", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("available", true);
        pluginGeneratedSerialDescriptor.addElement("localCurrentPrice", true);
        pluginGeneratedSerialDescriptor.addElement("ccyFullName", true);
        pluginGeneratedSerialDescriptor.addElement("localChangeRate", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.FLAG, true);
        pluginGeneratedSerialDescriptor.addElement("fiatFlag", true);
        pluginGeneratedSerialDescriptor.addElement("min", true);
        pluginGeneratedSerialDescriptor.addElement("max", true);
        pluginGeneratedSerialDescriptor.addElement("isSupport", true);
        pluginGeneratedSerialDescriptor.addElement("isHide", true);
        pluginGeneratedSerialDescriptor.addElement("sign", true);
        pluginGeneratedSerialDescriptor.addElement("transferable", true);
        pluginGeneratedSerialDescriptor.addElement("scale", true);
        pluginGeneratedSerialDescriptor.addElement("localCurrencyToUsdRate", true);
        pluginGeneratedSerialDescriptor.addElement("earnOption", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(EarnOption$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertCurrencyResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        EarnOption earnOption;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        boolean z;
        boolean z2;
        Boolean bool;
        int i3;
        String str5;
        String str6;
        boolean z3;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            str4 = strDecodeStringElement3;
            earnOption = (EarnOption) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, EarnOption$$serializer.INSTANCE, null);
            bool = bool2;
            str7 = strDecodeStringElement9;
            z = zDecodeBooleanElement;
            str10 = strDecodeStringElement8;
            str = strDecodeStringElement7;
            i4 = iDecodeIntElement2;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            z2 = zDecodeBooleanElement2;
            str5 = strDecodeStringElement10;
            i3 = iDecodeIntElement3;
            z3 = zDecodeBooleanElement3;
            str3 = strDecodeStringElement;
            i2 = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            i = 262143;
        } else {
            int i6 = 17;
            boolean z4 = true;
            int i7 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement5 = false;
            Boolean bool3 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            EarnOption earnOption2 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 3;
                        z4 = false;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 0:
                        c = 3;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 1:
                        c = 3;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 2:
                        c = 3;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 3:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i6 = 17;
                        break;
                    case 4:
                        i7 |= 16;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        c = 3;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        i6 = 17;
                        break;
                    case 6:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        i6 = 17;
                        break;
                    case 7:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i7 |= 128;
                        i6 = 17;
                        break;
                    case 8:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool3);
                        i7 |= 256;
                        i6 = 17;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i6 = 17;
                        break;
                    case 10:
                        i7 |= 1024;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i6 = 17;
                        break;
                    case 11:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i6 = 17;
                        break;
                    case 12:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i6 = 17;
                        break;
                    case 13:
                        i7 |= 8192;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 = 17;
                        break;
                    case 14:
                        i7 |= 16384;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i6 = 17;
                        break;
                    case 15:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i7 |= 32768;
                        i6 = 17;
                        break;
                    case 16:
                        i7 |= 65536;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 = 17;
                        break;
                    case 17:
                        earnOption2 = (EarnOption) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, EarnOption$$serializer.INSTANCE, earnOption2);
                        i7 |= 131072;
                        i6 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i7;
            earnOption = earnOption2;
            str = strDecodeStringElement14;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement17;
            str4 = strDecodeStringElement20;
            i2 = iDecodeIntElement5;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            bool = bool3;
            i3 = iDecodeIntElement4;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            z3 = zDecodeBooleanElement6;
            str7 = strDecodeStringElement12;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement15;
            str10 = strDecodeStringElement13;
            i4 = iDecodeIntElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertCurrencyResponseBean(i, str3, i2, str2, str4, str6, str9, str8, i4, bool, str, str10, z, z2, str7, z3, i3, str5, earnOption, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertCurrencyResponseBean convertCurrencyResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(convertCurrencyResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertCurrencyResponseBean.write$Self$OKCRCore_cr_core(convertCurrencyResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
