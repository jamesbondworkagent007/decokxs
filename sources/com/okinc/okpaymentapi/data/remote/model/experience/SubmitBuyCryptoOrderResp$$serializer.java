package com.okinc.okpaymentapi.data.remote.model.experience;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class SubmitBuyCryptoOrderResp$$serializer implements GeneratedSerializer<SubmitBuyCryptoOrderResp> {
    public static final int $stable;
    public static final SubmitBuyCryptoOrderResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SubmitBuyCryptoOrderResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SubmitBuyCryptoOrderResp$$serializer submitBuyCryptoOrderResp$$serializer = new SubmitBuyCryptoOrderResp$$serializer();
        INSTANCE = submitBuyCryptoOrderResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.experience.SubmitBuyCryptoOrderResp", submitBuyCryptoOrderResp$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("totalPaidAmount", true);
        pluginGeneratedSerialDescriptor.addElement("totalPaidCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("metaData", true);
        pluginGeneratedSerialDescriptor.addElement("userInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DoubleSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(BuyCryptoMetaData$$serializer.INSTANCE), UserInfoQR$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SubmitBuyCryptoOrderResp deserialize(@NotNull Decoder decoder) {
        int i;
        BuyCryptoMetaData buyCryptoMetaData;
        String str;
        UserInfoQR userInfoQR;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        BuyCryptoMetaData buyCryptoMetaData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            BuyCryptoMetaData buyCryptoMetaData3 = (BuyCryptoMetaData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BuyCryptoMetaData$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            userInfoQR = (UserInfoQR) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, UserInfoQR$$serializer.INSTANCE, null);
            buyCryptoMetaData = buyCryptoMetaData3;
            i = 15;
            d = dDecodeDoubleElement;
        } else {
            int i2 = 0;
            boolean z = true;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement2 = null;
            UserInfoQR userInfoQR2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    buyCryptoMetaData2 = (BuyCryptoMetaData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BuyCryptoMetaData$$serializer.INSTANCE, buyCryptoMetaData2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    userInfoQR2 = (UserInfoQR) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, UserInfoQR$$serializer.INSTANCE, userInfoQR2);
                    i2 |= 8;
                }
            }
            i = i2;
            buyCryptoMetaData = buyCryptoMetaData2;
            str = strDecodeStringElement2;
            userInfoQR = userInfoQR2;
            d = dDecodeDoubleElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SubmitBuyCryptoOrderResp(i, d, str, buyCryptoMetaData, userInfoQR, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SubmitBuyCryptoOrderResp submitBuyCryptoOrderResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(submitBuyCryptoOrderResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SubmitBuyCryptoOrderResp.write$Self$OKPayments_ok_payment_api(submitBuyCryptoOrderResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
