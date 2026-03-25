package com.okinc.business.defi.biz.net.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class SegWitInfoBeanBatchRes$$serializer implements GeneratedSerializer<SegWitInfoBeanBatchRes> {
    public static final int $stable;
    public static final SegWitInfoBeanBatchRes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SegWitInfoBeanBatchRes$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SegWitInfoBeanBatchRes$$serializer segWitInfoBeanBatchRes$$serializer = new SegWitInfoBeanBatchRes$$serializer();
        INSTANCE = segWitInfoBeanBatchRes$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes", segWitInfoBeanBatchRes$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.Account.KEY_ACCOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("pubKey", true);
        pluginGeneratedSerialDescriptor.addElement("addressType", true);
        pluginGeneratedSerialDescriptor.addElement("responseResult", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SegWitInfoBeanBatchRes.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SegWitInfoBeanBatchRes deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        ResponseResult responseResult;
        Integer num;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SegWitInfoBeanBatchRes.$childSerializers;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, null);
            responseResult = (ResponseResult) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            str = str7;
            num = num2;
            i = 31;
            str3 = str5;
            str2 = str6;
        } else {
            int i2 = 0;
            boolean z = true;
            ResponseResult responseResult2 = null;
            Integer num3 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str8);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str4);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num3);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    responseResult2 = (ResponseResult) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], responseResult2);
                }
            }
            i = i2;
            str = str4;
            responseResult = responseResult2;
            num = num3;
            str2 = str8;
            str3 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SegWitInfoBeanBatchRes(i, str3, str2, str, num, responseResult, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SegWitInfoBeanBatchRes segWitInfoBeanBatchRes) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(segWitInfoBeanBatchRes, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SegWitInfoBeanBatchRes.write$Self$OKWallet_wallet_impl(segWitInfoBeanBatchRes, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
