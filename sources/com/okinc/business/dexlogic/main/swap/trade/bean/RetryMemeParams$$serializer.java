package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
public final /* synthetic */ class RetryMemeParams$$serializer implements GeneratedSerializer<RetryMemeParams> {
    public static final int $stable;
    public static final RetryMemeParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RetryMemeParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RetryMemeParams$$serializer retryMemeParams$$serializer = new RetryMemeParams$$serializer();
        INSTANCE = retryMemeParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams", retryMemeParams$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("slippage", false);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("customPriorityFee", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("referId", false);
        pluginGeneratedSerialDescriptor.addElement("fromTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("isEnableJito", false);
        pluginGeneratedSerialDescriptor.addElement("mevInfo", false);
        pluginGeneratedSerialDescriptor.addElement("isMemeTimeOut", true);
        pluginGeneratedSerialDescriptor.addElement("routerModeType", false);
        pluginGeneratedSerialDescriptor.addElement("priorityFeeType", false);
        pluginGeneratedSerialDescriptor.addElement("customSlippage", false);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", false);
        pluginGeneratedSerialDescriptor.addElement("slippageType", true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RetryMemeParams deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z;
        String str10;
        int iDecodeIntElement;
        Integer num;
        String str11;
        String str12;
        String str13;
        String str14;
        int i;
        char c;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            i = 524287;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, null);
            str4 = strDecodeStringElement8;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
            zDecodeBooleanElement = zDecodeBooleanElement3;
            str11 = str15;
            z = zDecodeBooleanElement2;
            str13 = strDecodeStringElement9;
            str2 = strDecodeStringElement7;
            str14 = str17;
            str8 = strDecodeStringElement2;
            str12 = strDecodeStringElement11;
            str3 = strDecodeStringElement10;
            str9 = strDecodeStringElement;
            str10 = str16;
            str5 = strDecodeStringElement5;
            str7 = strDecodeStringElement3;
            str6 = strDecodeStringElement4;
            bool = bool2;
            str = strDecodeStringElement6;
        } else {
            int i4 = 18;
            Boolean bool3 = null;
            String str18 = null;
            String str19 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            boolean z2 = true;
            int i5 = 0;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement4 = false;
            Integer num2 = null;
            int iDecodeIntElement2 = 0;
            String str20 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 6;
                        z2 = false;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 0:
                        c = 6;
                        i5 |= 1;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 1:
                        c = 6;
                        i5 |= 2;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 2:
                        c = 6;
                        i5 |= 4;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 3:
                        c = 6;
                        i5 |= 8;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 4:
                        c = 6;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 5:
                        c = 6;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 6:
                        c = 6;
                        i5 |= 64;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool3);
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 8:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 256;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 9:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 10:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i5 |= 1024;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 11:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str19);
                        i5 |= 2048;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 12:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i5 |= 4096;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 13:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 14:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 |= 16384;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 15:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str18);
                        i2 = 32768;
                        i5 |= i2;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 16:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str20);
                        i2 = 65536;
                        i5 |= i2;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 17:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, num2);
                        i2 = 131072;
                        i5 |= i2;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    case 18:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i5 = 262144 | i5;
                        c = 6;
                        i4 = 18;
                        i3 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool3;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement15;
            str4 = strDecodeStringElement16;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
            z = zDecodeBooleanElement4;
            str10 = str18;
            iDecodeIntElement = iDecodeIntElement2;
            num = num2;
            str11 = str19;
            str12 = strDecodeStringElement14;
            str13 = strDecodeStringElement18;
            str14 = str20;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RetryMemeParams(i, str9, str8, str7, str6, str5, str, bool, str2, str4, str13, z, str11, zDecodeBooleanElement, str3, str12, str10, str14, num, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RetryMemeParams retryMemeParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(retryMemeParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RetryMemeParams.write$Self$OKDex_dex_impl(retryMemeParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
