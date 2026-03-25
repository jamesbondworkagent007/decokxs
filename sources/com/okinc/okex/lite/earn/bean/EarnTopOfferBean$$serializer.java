package com.okinc.okex.lite.earn.bean;

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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class EarnTopOfferBean$$serializer implements GeneratedSerializer<EarnTopOfferBean> {
    public static final int $stable;
    public static final EarnTopOfferBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EarnTopOfferBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EarnTopOfferBean$$serializer earnTopOfferBean$$serializer = new EarnTopOfferBean$$serializer();
        INSTANCE = earnTopOfferBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.lite.earn.bean.EarnTopOfferBean", earnTopOfferBean$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("labels", true);
        pluginGeneratedSerialDescriptor.addElement("apy", true);
        pluginGeneratedSerialDescriptor.addElement("expectedEarningsFiat", true);
        pluginGeneratedSerialDescriptor.addElement("amountToDepositToInvest", true);
        pluginGeneratedSerialDescriptor.addElement("migrationBlocked", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EarnTopOfferBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{EarnCurrency$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[1]), stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EarnTopOfferBean deserialize(@NotNull Decoder decoder) {
        Integer[] numArr;
        int i;
        boolean zDecodeBooleanElement;
        String str;
        EarnCurrency earnCurrency;
        String str2;
        String str3;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EarnTopOfferBean.$childSerializers;
        int i2 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            EarnCurrency earnCurrency2 = (EarnCurrency) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, EarnCurrency$$serializer.INSTANCE, null);
            Integer[] numArr2 = (Integer[]) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 63;
            numArr = numArr2;
            earnCurrency = earnCurrency2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement3;
            str3 = strDecodeStringElement;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            numArr = null;
            String strDecodeStringElement6 = null;
            EarnCurrency earnCurrency3 = null;
            boolean zDecodeBooleanElement2 = false;
            i = 0;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i |= 1;
                        earnCurrency3 = (EarnCurrency) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, EarnCurrency$$serializer.INSTANCE, earnCurrency3);
                        i2 = 5;
                        break;
                    case 1:
                        i |= 2;
                        numArr = (Integer[]) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], numArr);
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement5;
            earnCurrency = earnCurrency3;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
        }
        int i3 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EarnTopOfferBean(i3, earnCurrency, numArr, str3, str2, str, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EarnTopOfferBean earnTopOfferBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earnTopOfferBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EarnTopOfferBean.write$Self$OKFinance_finance_api(earnTopOfferBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
