package com.okinc.business.defi.utm;

import com.okinc.business.defi.utm.Web3UtmParamManager;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Web3UtmParamManager$UTMParamCachedBean$$serializer implements GeneratedSerializer<Web3UtmParamManager.UTMParamCachedBean> {
    public static final int $stable;
    public static final Web3UtmParamManager$UTMParamCachedBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Web3UtmParamManager$UTMParamCachedBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Web3UtmParamManager$UTMParamCachedBean$$serializer web3UtmParamManager$UTMParamCachedBean$$serializer = new Web3UtmParamManager$UTMParamCachedBean$$serializer();
        INSTANCE = web3UtmParamManager$UTMParamCachedBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.utm.Web3UtmParamManager.UTMParamCachedBean", web3UtmParamManager$UTMParamCachedBean$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("utmMedium", true);
        pluginGeneratedSerialDescriptor.addElement("utmSource", true);
        pluginGeneratedSerialDescriptor.addElement("utmCampaign", true);
        pluginGeneratedSerialDescriptor.addElement("utmContent", true);
        pluginGeneratedSerialDescriptor.addElement("utmTerm", true);
        pluginGeneratedSerialDescriptor.addElement("createdTime", false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("ref", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), LongSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Web3UtmParamManager.UTMParamCachedBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str2 = strDecodeStringElement;
            str3 = str13;
            str6 = str14;
            str7 = str12;
            str5 = str11;
            j = jDecodeLongElement;
            i = 255;
            str4 = str10;
        } else {
            int i4 = 0;
            boolean z = true;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement2 = null;
            String str19 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str18;
                        z = false;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        str8 = str18;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str16);
                        i4 |= 1;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        i4 |= 2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str15);
                        i4 |= 4;
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 3:
                        i4 |= 8;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str19);
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 4:
                        i4 |= 16;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str17);
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i4 |= 32;
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 7:
                        i4 |= 128;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str9);
                        str8 = str18;
                        str18 = str8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str20 = str18;
            str = str9;
            str2 = strDecodeStringElement2;
            str3 = str19;
            str4 = str16;
            j = jDecodeLongElement2;
            i = i4;
            str5 = str20;
            str6 = str17;
            str7 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Web3UtmParamManager.UTMParamCachedBean(i, str4, str5, str7, str3, str6, j, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Web3UtmParamManager.UTMParamCachedBean uTMParamCachedBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTMParamCachedBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Web3UtmParamManager.UTMParamCachedBean.write$Self$OKWallet_wallet_impl(uTMParamCachedBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
