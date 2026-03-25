package com.okinc.business.defi.biz.core.ws.channel;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletDefiAssetSubManager$SubResponseData$$serializer implements GeneratedSerializer<WalletDefiAssetSubManager.SubResponseData> {
    public static final int $stable;
    public static final WalletDefiAssetSubManager$SubResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletDefiAssetSubManager$SubResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletDefiAssetSubManager$SubResponseData$$serializer walletDefiAssetSubManager$SubResponseData$$serializer = new WalletDefiAssetSubManager$SubResponseData$$serializer();
        INSTANCE = walletDefiAssetSubManager$SubResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.SubResponseData", walletDefiAssetSubManager$SubResponseData$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("analysisPlatformId", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.PlatformNode.KEY_PLATFORM, true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("lpTokenAddressList", true);
        pluginGeneratedSerialDescriptor.addElement("versionList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = WalletDefiAssetSubManager.SubResponseData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(kSerializerArr[9])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletDefiAssetSubManager.SubResponseData deserialize(@NotNull Decoder decoder) {
        String str;
        Long l;
        String str2;
        List list;
        List list2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        Long l2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WalletDefiAssetSubManager.SubResponseData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 9;
        int i5 = 8;
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            i = 1023;
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str2 = str16;
            list = list3;
            str5 = str15;
            str6 = str14;
            l = l3;
            str7 = str10;
            str = str12;
            str4 = str11;
            str3 = str13;
        } else {
            int i6 = 0;
            boolean z = true;
            String str17 = null;
            String str18 = null;
            List list4 = null;
            str = null;
            List list5 = null;
            String str19 = null;
            String str20 = null;
            Long l4 = null;
            String str21 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str20;
                        l2 = l4;
                        z = false;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 0:
                        str8 = str20;
                        l2 = l4;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str21);
                        i6 |= 1;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 1:
                        l2 = l4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str20);
                        i6 |= 2;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 2:
                        l2 = l4;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i6 |= 4;
                        str8 = str20;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 3:
                        l2 = l4;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str19);
                        i6 |= 8;
                        str8 = str20;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 4:
                        l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l4);
                        i6 |= 16;
                        str8 = str20;
                        l2 = l4;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 5:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        i6 |= 32;
                        str8 = str20;
                        l2 = l4;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str9);
                        i6 |= 64;
                        str8 = str20;
                        l2 = l4;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str17);
                        i6 |= 128;
                        str8 = str20;
                        l2 = l4;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    case 8:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list4);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, kSerializerArr[i4], list5);
                        str8 = str20;
                        l2 = l4;
                        l4 = l2;
                        str20 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 9;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str22 = str20;
            l = l4;
            str2 = str17;
            list = list4;
            list2 = list5;
            str3 = str19;
            str4 = str22;
            str5 = str9;
            str6 = str18;
            str7 = str21;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletDefiAssetSubManager.SubResponseData(i, str7, str4, str, str3, l, str6, str5, str2, list, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletDefiAssetSubManager.SubResponseData subResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletDefiAssetSubManager.SubResponseData.write$Self$OKWallet_wallet_impl(subResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
