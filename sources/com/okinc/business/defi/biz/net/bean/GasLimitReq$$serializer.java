package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class GasLimitReq$$serializer implements GeneratedSerializer<GasLimitReq> {
    public static final int $stable;
    public static final GasLimitReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GasLimitReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GasLimitReq$$serializer gasLimitReq$$serializer = new GasLimitReq$$serializer();
        INSTANCE = gasLimitReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.GasLimitReq", gasLimitReq$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("inputData", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("authorizationList", true);
        pluginGeneratedSerialDescriptor.addElement("userAddress", true);
        pluginGeneratedSerialDescriptor.addElement("stateOverrideList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GasLimitReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GasLimitReq deserialize(@NotNull Decoder decoder) {
        Long l;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GasLimitReq.$childSerializers;
        int i2 = 6;
        int i3 = 3;
        int i4 = 4;
        int i5 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            str = str7;
            l = l2;
            str2 = str6;
            strDecodeStringElement = strDecodeStringElement2;
            list2 = list3;
            i = 255;
        } else {
            int i6 = 0;
            boolean z = true;
            List list4 = null;
            String str8 = null;
            l = null;
            List list5 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str10;
                        z = false;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 0:
                        str5 = str10;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i6 |= 1;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 1:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        i6 |= 2;
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 3:
                        l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l);
                        i6 |= 8;
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str8);
                        i6 |= 16;
                        break;
                    case 5:
                        i6 |= 32;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list4);
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 6:
                        i6 |= 64;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str9);
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    case 7:
                        i6 |= 128;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list5);
                        str5 = str10;
                        str10 = str5;
                        i2 = 6;
                        i3 = 3;
                        i4 = 4;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str12 = str10;
            i = i6;
            list = list5;
            str = str9;
            list2 = list4;
            str2 = str8;
            str3 = str12;
            str4 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GasLimitReq(i, str4, str3, strDecodeStringElement, l, str2, list2, str, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GasLimitReq gasLimitReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(gasLimitReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GasLimitReq.write$Self$OKWallet_wallet_impl(gasLimitReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
