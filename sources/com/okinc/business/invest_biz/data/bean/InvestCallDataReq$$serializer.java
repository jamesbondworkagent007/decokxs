package com.okinc.business.invest_biz.data.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestCallDataReq$$serializer implements GeneratedSerializer<InvestCallDataReq> {
    public static final int $stable;
    public static final InvestCallDataReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestCallDataReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestCallDataReq$$serializer investCallDataReq$$serializer = new InvestCallDataReq$$serializer();
        INSTANCE = investCallDataReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestCallDataReq", investCallDataReq$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("investmentIdList", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("expectOutputList", true);
        pluginGeneratedSerialDescriptor.addElement("userInputList", true);
        pluginGeneratedSerialDescriptor.addElement("assetsList", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("priorityFee", true);
        pluginGeneratedSerialDescriptor.addElement("slipPoint", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("feeEarning", true);
        pluginGeneratedSerialDescriptor.addElement("swapSlipPoint", true);
        pluginGeneratedSerialDescriptor.addElement("stakeId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestCallDataReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), kSerializerArr[2], stringSerializer, kSerializerArr[4], kSerializerArr[5], kSerializerArr[6], stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[12], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestCallDataReq deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        List list;
        Integer num;
        List list2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list3;
        List list4;
        List list5;
        Long l;
        int i;
        String str7;
        String str8;
        List list6;
        Integer num2;
        List list7;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestCallDataReq.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        int i7 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            List list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            num = num3;
            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, null);
            list4 = list9;
            str3 = strDecodeStringElement6;
            str4 = strDecodeStringElement5;
            str = str9;
            str8 = strDecodeStringElement3;
            str5 = strDecodeStringElement2;
            str7 = strDecodeStringElement4;
            i = 32767;
            list5 = list11;
            list = list10;
            list2 = list8;
            str6 = strDecodeStringElement;
        } else {
            String str10 = null;
            int i8 = 14;
            int i9 = 0;
            String str11 = null;
            List list12 = null;
            List list13 = null;
            List list14 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            List list15 = null;
            String strDecodeStringElement11 = null;
            Integer num4 = null;
            String strDecodeStringElement12 = null;
            List list16 = null;
            boolean z = true;
            Long l2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        z = false;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 0:
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 1:
                        list6 = list15;
                        list7 = list16;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num4);
                        i9 |= 2;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 2:
                        list6 = list15;
                        list16 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list16);
                        i9 |= 4;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 3:
                        list6 = list15;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i9 |= 8;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 4:
                        list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list15);
                        i2 = i9 | 16;
                        i9 = i2;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 5:
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list12);
                        i9 |= 32;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 6:
                        list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list14);
                        i2 = i9 | 64;
                        i9 = i2;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 7:
                        i9 |= 128;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i4 = 10;
                        i8 = 14;
                        break;
                    case 8:
                        i9 |= 256;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i4 = 10;
                        i8 = 14;
                        break;
                    case 9:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str11);
                        i9 |= 512;
                        i4 = 10;
                        i8 = 14;
                        break;
                    case 10:
                        i9 |= 1024;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 11:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i9 |= 2048;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 12:
                        list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], list13);
                        i9 |= 4096;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 13:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str10);
                        i3 = i9 | 8192;
                        i9 = i3;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    case 14:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, LongSerializer.INSTANCE, l2);
                        i3 = i9 | 16384;
                        i9 = i3;
                        list6 = list15;
                        num2 = num4;
                        list7 = list16;
                        num4 = num2;
                        list15 = list6;
                        list16 = list7;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 8;
                        i8 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list17 = list15;
            Integer num5 = num4;
            str = str11;
            str2 = str10;
            list = list12;
            num = num5;
            list2 = list16;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            list3 = list13;
            list4 = list17;
            list5 = list14;
            l = l2;
            i = i9;
            String str12 = strDecodeStringElement10;
            str7 = strDecodeStringElement9;
            str8 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestCallDataReq(i, str6, num, list2, str5, list4, list, list5, str8, str7, str, str4, str3, list3, str2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestCallDataReq investCallDataReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investCallDataReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestCallDataReq.write$Self$OKDeFi_invest_biz(investCallDataReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
