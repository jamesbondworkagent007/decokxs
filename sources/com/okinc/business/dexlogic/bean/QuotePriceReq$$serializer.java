package com.okinc.business.dexlogic.bean;

import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class QuotePriceReq$$serializer implements GeneratedSerializer<QuotePriceReq> {
    public static final int $stable;
    public static final QuotePriceReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private QuotePriceReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        QuotePriceReq$$serializer quotePriceReq$$serializer = new QuotePriceReq$$serializer();
        INSTANCE = quotePriceReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.QuotePriceReq", quotePriceReq$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("fromTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fromTokenDecimal", true);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimal", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("gasLevel", true);
        pluginGeneratedSerialDescriptor.addElement("toChainId", true);
        pluginGeneratedSerialDescriptor.addElement("slippage", false);
        pluginGeneratedSerialDescriptor.addElement("pmm", true);
        pluginGeneratedSerialDescriptor.addElement("slippageType", false);
        pluginGeneratedSerialDescriptor.addElement("maxSlippage", false);
        pluginGeneratedSerialDescriptor.addElement("quoteBizType", true);
        pluginGeneratedSerialDescriptor.addElement("dexIds", true);
        pluginGeneratedSerialDescriptor.addElement("forbiddenBridgeTypes", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("receiveWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformIds", true);
        pluginGeneratedSerialDescriptor.addElement("refCode", true);
        pluginGeneratedSerialDescriptor.addElement("referralCommissionJsVersion", true);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = QuotePriceReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(kSerializerArr[14]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[17]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(AccountInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final QuotePriceReq deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        List list2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        List list3;
        AccountInfo accountInfo;
        String str16;
        String str17;
        KSerializer[] kSerializerArr;
        AccountInfo accountInfo2;
        String str18;
        String str19;
        String str20;
        AccountInfo accountInfo3;
        String str21;
        AccountInfo accountInfo4;
        String str22;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = QuotePriceReq.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr2[17], null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            accountInfo = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, AccountInfo$$serializer.INSTANCE, null);
            str15 = str30;
            i = 2097151;
            str16 = strDecodeStringElement8;
            str13 = str23;
            list3 = list6;
            str5 = str29;
            str2 = str25;
            str4 = str27;
            str9 = strDecodeStringElement6;
            str8 = strDecodeStringElement5;
            str11 = strDecodeStringElement2;
            list2 = list4;
            str3 = str26;
            str6 = str24;
            str = str28;
            str7 = strDecodeStringElement4;
            list = list5;
            str17 = strDecodeStringElement3;
            str10 = strDecodeStringElement7;
            str12 = strDecodeStringElement;
        } else {
            boolean z = true;
            String str31 = null;
            List list7 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            List list8 = null;
            String str35 = null;
            String str36 = null;
            List list9 = null;
            String str37 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String str38 = null;
            String strDecodeStringElement16 = null;
            String str39 = null;
            i = 0;
            AccountInfo accountInfo5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        accountInfo2 = accountInfo5;
                        str18 = str31;
                        str19 = str37;
                        str20 = str38;
                        z = false;
                        str38 = str20;
                        accountInfo5 = accountInfo2;
                        str31 = str18;
                        kSerializerArr2 = kSerializerArr;
                        str37 = str19;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        accountInfo2 = accountInfo5;
                        str19 = str37;
                        str20 = str38;
                        str18 = str31;
                        i |= 1;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str39);
                        str38 = str20;
                        accountInfo5 = accountInfo2;
                        str31 = str18;
                        kSerializerArr2 = kSerializerArr;
                        str37 = str19;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        accountInfo2 = accountInfo5;
                        str19 = str37;
                        str20 = str38;
                        i |= 2;
                        str18 = str31;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        str38 = str20;
                        accountInfo5 = accountInfo2;
                        str31 = str18;
                        kSerializerArr2 = kSerializerArr;
                        str37 = str19;
                        break;
                    case 2:
                        accountInfo2 = accountInfo5;
                        str19 = str37;
                        kSerializerArr = kSerializerArr2;
                        i |= 4;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str38);
                        str18 = str31;
                        str38 = str20;
                        accountInfo5 = accountInfo2;
                        str31 = str18;
                        kSerializerArr2 = kSerializerArr;
                        str37 = str19;
                        break;
                    case 3:
                        accountInfo3 = accountInfo5;
                        str21 = str37;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 4:
                        accountInfo3 = accountInfo5;
                        str21 = str37;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 5:
                        accountInfo3 = accountInfo5;
                        str21 = str37;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 6:
                        accountInfo3 = accountInfo5;
                        str21 = str37;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 7:
                        accountInfo3 = accountInfo5;
                        str21 = str37;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 8:
                        accountInfo3 = accountInfo5;
                        i |= 256;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str37);
                        str37 = str21;
                        accountInfo5 = accountInfo3;
                        break;
                    case 9:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 512;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 10:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 1024;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 11:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 2048;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str34);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 12:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 4096;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str35);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 13:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 8192;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], list8);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 14:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        i |= 16384;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], list7);
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 15:
                        accountInfo4 = accountInfo5;
                        str22 = str37;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str31);
                        i2 = 32768;
                        i |= i2;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 16:
                        str22 = str37;
                        accountInfo4 = accountInfo5;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str36);
                        i2 = 65536;
                        i |= i2;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 17:
                        str22 = str37;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr2[17], list9);
                        i2 = 131072;
                        accountInfo4 = accountInfo5;
                        i |= i2;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 18:
                        str22 = str37;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str33);
                        i3 = 262144;
                        accountInfo4 = accountInfo5;
                        i = i3 | i;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 19:
                        str22 = str37;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str32);
                        i3 = 524288;
                        accountInfo4 = accountInfo5;
                        i = i3 | i;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    case 20:
                        str22 = str37;
                        accountInfo5 = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, AccountInfo$$serializer.INSTANCE, accountInfo5);
                        i3 = 1048576;
                        accountInfo4 = accountInfo5;
                        i = i3 | i;
                        accountInfo5 = accountInfo4;
                        str37 = str22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str31;
            list = list7;
            str2 = str37;
            str3 = str34;
            list2 = list8;
            str4 = str35;
            str5 = str36;
            str6 = str38;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement12;
            str11 = strDecodeStringElement15;
            str12 = strDecodeStringElement16;
            str13 = str39;
            str14 = str32;
            str15 = str33;
            list3 = list9;
            accountInfo = accountInfo5;
            str16 = strDecodeStringElement13;
            str17 = strDecodeStringElement14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuotePriceReq(i, str13, str12, str6, str11, str17, str7, str8, str9, str2, str10, str16, str3, str4, list2, list, str, str5, list3, str15, str14, accountInfo, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull QuotePriceReq quotePriceReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quotePriceReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuotePriceReq.write$Self$OKDex_dex_impl(quotePriceReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
