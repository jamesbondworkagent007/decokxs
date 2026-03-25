package com.okinc.social_trade_api.data;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class NmpBannerVoucherInfoDto$$serializer implements GeneratedSerializer<NmpBannerVoucherInfoDto> {
    public static final int $stable;
    public static final NmpBannerVoucherInfoDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NmpBannerVoucherInfoDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NmpBannerVoucherInfoDto$$serializer nmpBannerVoucherInfoDto$$serializer = new NmpBannerVoucherInfoDto$$serializer();
        INSTANCE = nmpBannerVoucherInfoDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto", nmpBannerVoucherInfoDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("batchNo", true);
        pluginGeneratedSerialDescriptor.addElement("remainCount", true);
        pluginGeneratedSerialDescriptor.addElement("voucherType", true);
        pluginGeneratedSerialDescriptor.addElement("aprVoucher", true);
        pluginGeneratedSerialDescriptor.addElement("voucherPnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("lossVoucher", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("unit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(AprVoucherDto$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(LossVoucherDto$$serializer.INSTANCE), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NmpBannerVoucherInfoDto deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        AprVoucherDto aprVoucherDto;
        String str;
        String str2;
        String str3;
        int i;
        LossVoucherDto lossVoucherDto;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            AprVoucherDto aprVoucherDto2 = (AprVoucherDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, AprVoucherDto$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            LossVoucherDto lossVoucherDto2 = (LossVoucherDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LossVoucherDto$$serializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str4 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            str2 = strDecodeStringElement7;
            lossVoucherDto = lossVoucherDto2;
            aprVoucherDto = aprVoucherDto2;
            str3 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str = strDecodeStringElement4;
            i = 255;
        } else {
            int i2 = 0;
            boolean z = true;
            LossVoucherDto lossVoucherDto3 = null;
            AprVoucherDto aprVoucherDto3 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        i2 |= 4;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i2 |= 8;
                        aprVoucherDto3 = (AprVoucherDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, AprVoucherDto$$serializer.INSTANCE, aprVoucherDto3);
                        break;
                    case 4:
                        i2 |= 16;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i2 |= 32;
                        lossVoucherDto3 = (LossVoucherDto) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LossVoucherDto$$serializer.INSTANCE, lossVoucherDto3);
                        break;
                    case 6:
                        i2 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i2 |= 128;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement9;
            aprVoucherDto = aprVoucherDto3;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement10;
            str3 = strDecodeStringElement2;
            i = i2;
            String str6 = strDecodeStringElement11;
            lossVoucherDto = lossVoucherDto3;
            str4 = strDecodeStringElement8;
            str5 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NmpBannerVoucherInfoDto(i, str4, str, str5, aprVoucherDto, str3, lossVoucherDto, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nmpBannerVoucherInfoDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NmpBannerVoucherInfoDto.write$Self$OKSocialTrading_trading_eco_api(nmpBannerVoucherInfoDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
