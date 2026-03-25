package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo;
import com.okinc.business.dexlogic.bean.DexBridgeShadowTokenPairInfoVo$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ChildOrder$$serializer implements GeneratedSerializer<ChildOrder> {
    public static final int $stable;
    public static final ChildOrder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ChildOrder$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ChildOrder$$serializer childOrder$$serializer = new ChildOrder$$serializer();
        INSTANCE = childOrder$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.main.swap.operation_handler.bean.ChildOrder", childOrder$$serializer, 25);
        pluginGeneratedSerialDescriptor.addElement("fromAmount", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("toAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenUsd", true);
        pluginGeneratedSerialDescriptor.addElement("childOrderId", true);
        pluginGeneratedSerialDescriptor.addElement("orderFailReason", true);
        pluginGeneratedSerialDescriptor.addElement("exploreUrl", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("toastType", true);
        pluginGeneratedSerialDescriptor.addElement("toastGuideUrl", true);
        pluginGeneratedSerialDescriptor.addElement("originalTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenIcon", true);
        pluginGeneratedSerialDescriptor.addElement("refundAmount", true);
        pluginGeneratedSerialDescriptor.addElement("extendStatus", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUp", true);
        pluginGeneratedSerialDescriptor.addElement("isShowCancel", true);
        pluginGeneratedSerialDescriptor.addElement("isShowSpeedUpCancel", true);
        pluginGeneratedSerialDescriptor.addElement("transactionHash", true);
        pluginGeneratedSerialDescriptor.addElement("dexBridgeShadowTokenPairInfoVo", true);
        pluginGeneratedSerialDescriptor.addElement("errorCode", true);
        pluginGeneratedSerialDescriptor.addElement("refundSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("refundChain", true);
        pluginGeneratedSerialDescriptor.addElement("speedUpTxHash", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(DexBridgeShadowTokenPairInfoVo$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ChildOrder deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo;
        String strDecodeStringElement2;
        String str15;
        boolean z;
        boolean z2;
        String str16;
        int i;
        boolean z3;
        String str17;
        String str18;
        String str19;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 5;
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo2 = (DexBridgeShadowTokenPairInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, DexBridgeShadowTokenPairInfoVo$$serializer.INSTANCE, null);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            str = strDecodeStringElement20;
            str18 = strDecodeStringElement21;
            str19 = strDecodeStringElement19;
            z2 = zDecodeBooleanElement3;
            dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo2;
            z = zDecodeBooleanElement2;
            str15 = strDecodeStringElement22;
            i = 33554431;
            str5 = strDecodeStringElement9;
            str16 = strDecodeStringElement11;
            str11 = strDecodeStringElement12;
            str12 = strDecodeStringElement10;
            z3 = zDecodeBooleanElement;
            strDecodeStringElement = strDecodeStringElement18;
            str7 = strDecodeStringElement6;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement14;
            str10 = strDecodeStringElement13;
            str14 = strDecodeStringElement5;
            str8 = strDecodeStringElement4;
            str3 = strDecodeStringElement15;
            str9 = strDecodeStringElement3;
            str2 = strDecodeStringElement16;
            str13 = strDecodeStringElement8;
            str17 = strDecodeStringElement17;
        } else {
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean z4 = true;
            strDecodeStringElement = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            int i7 = 0;
            DexBridgeShadowTokenPairInfoVo dexBridgeShadowTokenPairInfoVo3 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 0:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 2:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 3:
                        i7 |= 8;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 4:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 5:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 32;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 6:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 7:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 8:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 9:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 10:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 11:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 12:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 13:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 14:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 |= 16384;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 15:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 32768;
                        i7 |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 16:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i2 = 65536;
                        i7 |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 17:
                        i7 |= 131072;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 18:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i3 = 262144;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 19:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 524288;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 20:
                        dexBridgeShadowTokenPairInfoVo3 = (DexBridgeShadowTokenPairInfoVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, DexBridgeShadowTokenPairInfoVo$$serializer.INSTANCE, dexBridgeShadowTokenPairInfoVo3);
                        i4 = 1048576;
                        i7 = i4 | i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 21:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i7 = i4 | i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 22:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i7 = i4 | i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 23:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i7 = i4 | i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 24:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i4 = 16777216;
                        i7 = i4 | i7;
                        i5 = 5;
                        i6 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement27;
            str2 = strDecodeStringElement29;
            str3 = strDecodeStringElement30;
            str4 = strDecodeStringElement31;
            str5 = strDecodeStringElement33;
            str6 = strDecodeStringElement34;
            str7 = strDecodeStringElement35;
            str8 = strDecodeStringElement36;
            str9 = strDecodeStringElement37;
            str10 = strDecodeStringElement38;
            str11 = strDecodeStringElement39;
            str12 = strDecodeStringElement40;
            str13 = strDecodeStringElement41;
            str14 = strDecodeStringElement42;
            dexBridgeShadowTokenPairInfoVo = dexBridgeShadowTokenPairInfoVo3;
            strDecodeStringElement2 = strDecodeStringElement24;
            str15 = strDecodeStringElement25;
            z = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement4;
            str16 = strDecodeStringElement32;
            i = i7;
            String str20 = strDecodeStringElement23;
            z3 = zDecodeBooleanElement5;
            str17 = strDecodeStringElement28;
            str18 = strDecodeStringElement26;
            str19 = str20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChildOrder(i, str9, str8, str14, str7, str6, str13, str5, str12, str16, str11, str10, str4, str3, str2, str17, strDecodeStringElement, z3, z, z2, str19, dexBridgeShadowTokenPairInfoVo, str, str18, str15, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ChildOrder childOrder) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(childOrder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChildOrder.write$Self$OKDex_dex_impl(childOrder, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
