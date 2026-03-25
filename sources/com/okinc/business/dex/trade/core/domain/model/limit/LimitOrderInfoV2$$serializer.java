package com.okinc.business.dex.trade.core.domain.model.limit;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
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
public final /* synthetic */ class LimitOrderInfoV2$$serializer implements GeneratedSerializer<LimitOrderInfoV2> {
    public static final int $stable;
    public static final LimitOrderInfoV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LimitOrderInfoV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LimitOrderInfoV2$$serializer limitOrderInfoV2$$serializer = new LimitOrderInfoV2$$serializer();
        INSTANCE = limitOrderInfoV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.limit.LimitOrderInfoV2", limitOrderInfoV2$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("estReserveNativeAmt", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("isEnableMev", true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenUnitPriceUsd", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement("tradeTaxes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LimitOrderInfoV2 deserialize(@NotNull Decoder decoder) {
        boolean z;
        String str;
        String str2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String str3;
        int i;
        String str4;
        String str5;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, dexMultiTokenInfoBean$$serializer, null);
            str5 = strDecodeStringElement;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            str = str8;
            z = zDecodeBooleanElement;
            str4 = str7;
            str3 = str6;
            i = 255;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z3 = true;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = null;
            String strDecodeStringElement2 = null;
            String str12 = null;
            int i4 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 7;
                        break;
                    case 0:
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        z2 = true;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        z2 = true;
                        dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean7);
                        i4 |= 2;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        i4 |= 4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                        dexMultiTokenInfoBean3 = dexMultiTokenInfoBean7;
                        z2 = true;
                        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean3;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 3:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        i4 |= 16;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str10);
                        break;
                    case 5:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str12);
                        i4 |= 32;
                        break;
                    case 6:
                        i4 |= 64;
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        break;
                    case 7:
                        i4 |= 128;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str11);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBean8 = dexMultiTokenInfoBean7;
            z = zDecodeBooleanElement2;
            str = str12;
            str2 = str11;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean6;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean8;
            str3 = str9;
            i = i4;
            String str13 = strDecodeStringElement2;
            str4 = str10;
            str5 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LimitOrderInfoV2(i, str5, dexMultiTokenInfoBean2, str3, z, str4, str, dexMultiTokenInfoBean, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LimitOrderInfoV2 limitOrderInfoV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(limitOrderInfoV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LimitOrderInfoV2.write$Self$OKDex_dex_impl(limitOrderInfoV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
