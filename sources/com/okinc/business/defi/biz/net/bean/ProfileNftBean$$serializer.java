package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.api.bean.NftPrice$$serializer;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ProfileNftBean$$serializer implements GeneratedSerializer<ProfileNftBean> {
    public static final int $stable;
    public static final ProfileNftBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProfileNftBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProfileNftBean$$serializer profileNftBean$$serializer = new ProfileNftBean$$serializer();
        INSTANCE = profileNftBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.ProfileNftBean", profileNftBean$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("detail", true);
        pluginGeneratedSerialDescriptor.addElement("contractAddress", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("topPrice", true);
        pluginGeneratedSerialDescriptor.addElement("floorPrice", true);
        pluginGeneratedSerialDescriptor.addElement("medianPrice", true);
        pluginGeneratedSerialDescriptor.addElement("floorSalePrice", true);
        pluginGeneratedSerialDescriptor.addElement("collectionName", true);
        pluginGeneratedSerialDescriptor.addElement("platformUrl", true);
        pluginGeneratedSerialDescriptor.addElement("certificateFlag", true);
        pluginGeneratedSerialDescriptor.addElement("project", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundImage", true);
        pluginGeneratedSerialDescriptor.addElement("owned", true);
        pluginGeneratedSerialDescriptor.addElement("owner", true);
        pluginGeneratedSerialDescriptor.addElement("total", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ProfileNftBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        NftPrice$$serializer nftPrice$$serializer = NftPrice$$serializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[5]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(nftPrice$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProfileNftBean deserialize(@NotNull Decoder decoder) {
        NftPrice nftPrice;
        String str;
        Integer num;
        String str2;
        NftPrice nftPrice2;
        Integer num2;
        NftPrice nftPrice3;
        NftPrice nftPrice4;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        String str6;
        int i;
        long j;
        String str7;
        Integer num3;
        Boolean bool;
        String str8;
        Integer num4;
        String str9;
        String str10;
        KSerializer[] kSerializerArr;
        Integer num5;
        Boolean bool2;
        NftPrice nftPrice5;
        NftPrice nftPrice6;
        NftPrice nftPrice7;
        Integer num6;
        NftPrice nftPrice8;
        NftPrice nftPrice9;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ProfileNftBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            NftPrice$$serializer nftPrice$$serializer = NftPrice$$serializer.INSTANCE;
            NftPrice nftPrice10 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, nftPrice$$serializer, null);
            NftPrice nftPrice11 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, nftPrice$$serializer, null);
            NftPrice nftPrice12 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, nftPrice$$serializer, null);
            NftPrice nftPrice13 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, nftPrice$$serializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, intSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, intSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, null);
            str7 = strDecodeStringElement3;
            num2 = num8;
            str = str14;
            nftPrice = nftPrice10;
            str6 = str12;
            str8 = str11;
            nftPrice3 = nftPrice12;
            i = 2097151;
            str3 = strDecodeStringElement4;
            str5 = str13;
            str2 = str15;
            str4 = strDecodeStringElement;
            nftPrice4 = nftPrice11;
            num4 = num9;
            num = num7;
            nftPrice2 = nftPrice13;
            str10 = strDecodeStringElement2;
            str9 = strDecodeStringElement5;
            arrayList = arrayList2;
            j = jDecodeLongElement;
            num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, intSerializer, null);
            bool = bool3;
        } else {
            long jDecodeLongElement2 = 0;
            Integer num10 = null;
            String str16 = null;
            Boolean bool4 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            Integer num11 = null;
            NftPrice nftPrice14 = null;
            Integer num12 = null;
            String strDecodeStringElement6 = null;
            NftPrice nftPrice15 = null;
            ArrayList arrayList3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            NftPrice nftPrice16 = null;
            NftPrice nftPrice17 = null;
            boolean z = true;
            Integer num13 = null;
            int i3 = 0;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        z = false;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], arrayList3);
                        i3 |= 32;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str19);
                        i3 |= 64;
                        nftPrice7 = nftPrice17;
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr2;
                        num5 = num10;
                        bool2 = bool4;
                        nftPrice5 = nftPrice15;
                        nftPrice6 = nftPrice16;
                        nftPrice7 = nftPrice17;
                        i3 |= 128;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str18);
                        nftPrice16 = nftPrice6;
                        num10 = num5;
                        bool4 = bool2;
                        nftPrice17 = nftPrice7;
                        nftPrice15 = nftPrice5;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 8:
                        kSerializerArr = kSerializerArr2;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str16);
                        i3 |= 256;
                        num10 = num10;
                        bool4 = bool4;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 9:
                        kSerializerArr = kSerializerArr2;
                        num6 = num10;
                        nftPrice8 = nftPrice17;
                        nftPrice16 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, NftPrice$$serializer.INSTANCE, nftPrice16);
                        i3 |= 512;
                        bool4 = bool4;
                        nftPrice9 = nftPrice15;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 10:
                        kSerializerArr = kSerializerArr2;
                        num6 = num10;
                        nftPrice8 = nftPrice17;
                        nftPrice9 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, NftPrice$$serializer.INSTANCE, nftPrice15);
                        i3 |= 1024;
                        bool4 = bool4;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 11:
                        kSerializerArr = kSerializerArr2;
                        num6 = num10;
                        i3 |= 2048;
                        nftPrice8 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, NftPrice$$serializer.INSTANCE, nftPrice17);
                        nftPrice9 = nftPrice15;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 12:
                        kSerializerArr = kSerializerArr2;
                        num6 = num10;
                        i3 |= 4096;
                        nftPrice14 = (NftPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, NftPrice$$serializer.INSTANCE, nftPrice14);
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 13:
                        kSerializerArr = kSerializerArr2;
                        num6 = num10;
                        i3 |= 8192;
                        nftPrice8 = nftPrice17;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str17);
                        nftPrice9 = nftPrice15;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 14:
                        kSerializerArr = kSerializerArr2;
                        i3 |= 16384;
                        num6 = num10;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 15:
                        kSerializerArr = kSerializerArr2;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, num13);
                        i2 = 32768;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 16:
                        kSerializerArr = kSerializerArr2;
                        num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, num12);
                        i2 = 65536;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 17:
                        kSerializerArr = kSerializerArr2;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str20);
                        i2 = 131072;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 18:
                        kSerializerArr = kSerializerArr2;
                        num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, num10);
                        i2 = 262144;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 19:
                        kSerializerArr = kSerializerArr2;
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool4);
                        i2 = 524288;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 20:
                        kSerializerArr = kSerializerArr2;
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, num11);
                        i2 = 1048576;
                        i3 = i2 | i3;
                        num6 = num10;
                        nftPrice9 = nftPrice15;
                        nftPrice8 = nftPrice17;
                        nftPrice15 = nftPrice9;
                        nftPrice17 = nftPrice8;
                        num10 = num6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool5 = bool4;
            nftPrice = nftPrice16;
            str = str17;
            num = num13;
            str2 = str20;
            nftPrice2 = nftPrice14;
            num2 = num12;
            nftPrice3 = nftPrice17;
            nftPrice4 = nftPrice15;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement10;
            arrayList = arrayList3;
            str5 = str16;
            str6 = str18;
            i = i3;
            j = jDecodeLongElement2;
            str7 = strDecodeStringElement8;
            num3 = num11;
            bool = bool5;
            str8 = str19;
            num4 = num10;
            str9 = strDecodeStringElement6;
            str10 = strDecodeStringElement9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProfileNftBean(i, str4, j, str10, str7, str3, arrayList, str8, str6, str5, nftPrice, nftPrice4, nftPrice3, nftPrice2, str, str9, num, num2, str2, num4, bool, num3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProfileNftBean profileNftBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(profileNftBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProfileNftBean.write$Self$OKWallet_wallet_impl(profileNftBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
