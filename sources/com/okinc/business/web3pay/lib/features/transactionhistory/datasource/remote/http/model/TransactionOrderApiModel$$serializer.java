package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class TransactionOrderApiModel$$serializer implements GeneratedSerializer<TransactionOrderApiModel> {
    public static final int $stable;
    public static final TransactionOrderApiModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionOrderApiModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionOrderApiModel$$serializer transactionOrderApiModel$$serializer = new TransactionOrderApiModel$$serializer();
        INSTANCE = transactionOrderApiModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderApiModel", transactionOrderApiModel$$serializer, 29);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("merchantId", false);
        pluginGeneratedSerialDescriptor.addElement("productCode", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("areaCode", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("createTime", false);
        pluginGeneratedSerialDescriptor.addElement("receiverType", false);
        pluginGeneratedSerialDescriptor.addElement("subStatus", false);
        pluginGeneratedSerialDescriptor.addElement("gasFeeType", false);
        pluginGeneratedSerialDescriptor.addElement("txHash", false);
        pluginGeneratedSerialDescriptor.addElement("firstPackTime", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("convertInfo", false);
        pluginGeneratedSerialDescriptor.addElement("authorizeType", false);
        pluginGeneratedSerialDescriptor.addElement("extInfo", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimal", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("userFundStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, longSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, BuiltinSerializersKt.getNullable(ConvertInfoApiModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(JsonObjectSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionOrderApiModel deserialize(@NotNull Decoder decoder) {
        Integer num;
        String str;
        JsonObject jsonObject;
        Integer num2;
        int i;
        Integer num3;
        Integer num4;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        int i3;
        String str7;
        String str8;
        String strDecodeStringElement;
        String str9;
        String str10;
        Long l;
        ConvertInfoApiModel convertInfoApiModel;
        String str11;
        int i4;
        String str12;
        int i5;
        String str13;
        Integer num5;
        String str14;
        long j;
        String str15;
        String str16;
        int i6;
        String str17;
        Integer num6;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, intSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, LongSerializer.INSTANCE, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            ConvertInfoApiModel convertInfoApiModel2 = (ConvertInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, ConvertInfoApiModel$$serializer.INSTANCE, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, intSerializer, null);
            JsonObject jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, JsonObjectSerializer.INSTANCE, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, intSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, intSerializer, null);
            str11 = str31;
            str14 = str30;
            str3 = str24;
            num4 = num10;
            num5 = num8;
            jsonObject = jsonObject2;
            str7 = strDecodeStringElement5;
            num3 = num9;
            str13 = strDecodeStringElement3;
            convertInfoApiModel = convertInfoApiModel2;
            str6 = strDecodeStringElement7;
            l = l2;
            str12 = str26;
            i = 536870911;
            i4 = iDecodeIntElement;
            str2 = strDecodeStringElement6;
            str15 = str23;
            str9 = strDecodeStringElement2;
            num2 = num7;
            j = jDecodeLongElement;
            str10 = str29;
            i3 = iDecodeIntElement4;
            str8 = strDecodeStringElement4;
            str = str27;
            str4 = str25;
            i5 = iDecodeIntElement2;
            str5 = str28;
            i2 = iDecodeIntElement3;
        } else {
            String str32 = null;
            boolean z = true;
            String str33 = null;
            Integer num11 = null;
            String str34 = null;
            String str35 = null;
            JsonObject jsonObject3 = null;
            Integer num12 = null;
            Integer num13 = null;
            Long l3 = null;
            ConvertInfoApiModel convertInfoApiModel3 = null;
            Integer num14 = null;
            Integer num15 = null;
            String str36 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String str37 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String str38 = null;
            String strDecodeStringElement13 = null;
            String str39 = null;
            String strDecodeStringElement14 = null;
            String str40 = null;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement8 = 0;
            while (z) {
                String str41 = str34;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str20 = str38;
                        str21 = str39;
                        str34 = str41;
                        z = false;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 0:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str20 = str38;
                        str21 = str39;
                        str34 = str41;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 1:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str20 = str38;
                        str21 = str39;
                        str34 = str41;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 2:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str20 = str38;
                        str34 = str41;
                        str21 = str39;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str40);
                        i7 |= 4;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 3:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str34 = str41;
                        str20 = str38;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str39);
                        i7 |= 8;
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 4:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str34 = str41;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        str20 = str38;
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 5:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str19 = str37;
                        str34 = str41;
                        i7 |= 32;
                        str20 = str38;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 6:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str34 = str41;
                        str19 = str37;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str38);
                        i7 |= 64;
                        str20 = str38;
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 7:
                        str17 = str33;
                        num6 = num11;
                        str18 = str35;
                        str34 = str41;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        str19 = str37;
                        str20 = str38;
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 8:
                        str17 = str33;
                        num6 = num11;
                        str34 = str41;
                        str18 = str35;
                        i7 |= 256;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str37);
                        str20 = str38;
                        str21 = str39;
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 9:
                        str17 = str33;
                        num6 = num11;
                        i7 |= 512;
                        str18 = str35;
                        str19 = str37;
                        str20 = str38;
                        str21 = str39;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str41);
                        str33 = str17;
                        str39 = str21;
                        str38 = str20;
                        str37 = str19;
                        str35 = str18;
                        num11 = num6;
                        break;
                    case 10:
                        str22 = str33;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        str33 = str22;
                        str34 = str41;
                        break;
                    case 11:
                        str22 = str33;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        str33 = str22;
                        str34 = str41;
                        break;
                    case 12:
                        str22 = str33;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        str33 = str22;
                        str34 = str41;
                        break;
                    case 13:
                        str22 = str33;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str35);
                        i7 |= 8192;
                        str33 = str22;
                        str34 = str41;
                        break;
                    case 14:
                        str16 = str35;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        i7 |= 16384;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 15:
                        str16 = str35;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i7 |= 32768;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 16:
                        str16 = str35;
                        num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, num12);
                        i6 = 65536;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 17:
                        str16 = str35;
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, num13);
                        i6 = 131072;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 18:
                        str16 = str35;
                        i7 |= 262144;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 19:
                        str16 = str35;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str32);
                        i6 = 524288;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 20:
                        str16 = str35;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, LongSerializer.INSTANCE, l3);
                        i6 = 1048576;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 21:
                        str22 = str33;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i7 = 2097152 | i7;
                        str35 = str35;
                        str33 = str22;
                        str34 = str41;
                        break;
                    case 22:
                        str16 = str35;
                        convertInfoApiModel3 = (ConvertInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, ConvertInfoApiModel$$serializer.INSTANCE, convertInfoApiModel3);
                        i6 = 4194304;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 23:
                        str16 = str35;
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, num14);
                        i6 = 8388608;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 24:
                        str16 = str35;
                        jsonObject3 = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, JsonObjectSerializer.INSTANCE, jsonObject3);
                        i6 = 16777216;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 25:
                        str16 = str35;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, str33);
                        i6 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 26:
                        str16 = str35;
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, num15);
                        i6 = 67108864;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 27:
                        str16 = str35;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, str36);
                        i6 = 134217728;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    case 28:
                        str16 = str35;
                        num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, IntSerializer.INSTANCE, num11);
                        i6 = 268435456;
                        i7 = i6 | i7;
                        str34 = str41;
                        str35 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num11;
            str = str34;
            jsonObject = jsonObject3;
            num2 = num12;
            i = i7;
            num3 = num14;
            num4 = num15;
            str2 = strDecodeStringElement8;
            str3 = str39;
            i2 = iDecodeIntElement5;
            str4 = str38;
            str5 = str35;
            str6 = strDecodeStringElement9;
            i3 = iDecodeIntElement7;
            str7 = strDecodeStringElement10;
            str8 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement12;
            str9 = strDecodeStringElement14;
            str10 = str32;
            l = l3;
            convertInfoApiModel = convertInfoApiModel3;
            str11 = str36;
            i4 = iDecodeIntElement8;
            str12 = str37;
            i5 = iDecodeIntElement6;
            str13 = strDecodeStringElement13;
            num5 = num13;
            str14 = str33;
            j = jDecodeLongElement2;
            str15 = str40;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionOrderApiModel(i, str9, i4, str15, str3, str13, i5, str4, strDecodeStringElement, str12, str, str8, str7, str2, str5, i2, j, num2, num5, i3, str10, l, str6, convertInfoApiModel, num3, jsonObject, str14, num4, str11, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionOrderApiModel transactionOrderApiModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionOrderApiModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionOrderApiModel.write$Self$OKPayCore_web3pay_lib(transactionOrderApiModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
