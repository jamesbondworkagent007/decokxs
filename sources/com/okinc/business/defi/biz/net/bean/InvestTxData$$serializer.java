package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class InvestTxData$$serializer implements GeneratedSerializer<InvestTxData> {
    public static final int $stable;
    public static final InvestTxData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestTxData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestTxData$$serializer investTxData$$serializer = new InvestTxData$$serializer();
        INSTANCE = investTxData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.InvestTxData", investTxData$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("lpTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("investInfo", true);
        pluginGeneratedSerialDescriptor.addElement("investmentDetailType", true);
        pluginGeneratedSerialDescriptor.addElement("projectId", true);
        pluginGeneratedSerialDescriptor.addElement("investInCoins", true);
        pluginGeneratedSerialDescriptor.addElement("investOutCoins", true);
        pluginGeneratedSerialDescriptor.addElement("redeemShowNum", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("aggregateId", true);
        pluginGeneratedSerialDescriptor.addElement("validateName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = InvestTxData.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(InvestTxCoinInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(InvestInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(kSerializerArr[5]), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestTxData deserialize(@NotNull Decoder decoder) {
        InvestInfo investInfo;
        boolean z;
        List list;
        Long l;
        Long l2;
        String str;
        InvestTxCoinInfo investTxCoinInfo;
        List list2;
        Integer num;
        Long l3;
        int i;
        KSerializer[] kSerializerArr;
        InvestInfo investInfo2;
        List list3;
        Long l4;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = InvestTxData.$childSerializers;
        int i4 = 9;
        int i5 = 7;
        int i6 = 6;
        int i7 = 8;
        int i8 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestTxCoinInfo investTxCoinInfo2 = (InvestTxCoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTxCoinInfo$$serializer.INSTANCE, null);
            InvestInfo investInfo3 = (InvestInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestInfo$$serializer.INSTANCE, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr2[4], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr2[5], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            list2 = list5;
            investTxCoinInfo = investTxCoinInfo2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            l3 = l6;
            z = zDecodeBooleanElement;
            l = l5;
            l2 = l7;
            num = num2;
            i = 1023;
            investInfo = investInfo3;
            list = list4;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            Long l8 = null;
            String str2 = null;
            Integer num3 = null;
            Long l9 = null;
            investInfo = null;
            InvestTxCoinInfo investTxCoinInfo3 = null;
            List list6 = null;
            Long l10 = null;
            List list7 = null;
            int i9 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        z2 = false;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 0:
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        kSerializerArr = kSerializerArr2;
                        investTxCoinInfo3 = (InvestTxCoinInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, InvestTxCoinInfo$$serializer.INSTANCE, investTxCoinInfo3);
                        i9 |= 1;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 1:
                        list3 = list6;
                        l4 = l10;
                        investInfo = (InvestInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, InvestInfo$$serializer.INSTANCE, investInfo);
                        i2 = i9 | 2;
                        kSerializerArr = kSerializerArr2;
                        i9 = i2;
                        investInfo2 = investInfo;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 2:
                        list3 = list6;
                        l4 = l10;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num3);
                        i2 = i9 | 4;
                        kSerializerArr = kSerializerArr2;
                        i9 = i2;
                        investInfo2 = investInfo;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 3:
                        list3 = list6;
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l10);
                        kSerializerArr = kSerializerArr2;
                        i9 |= 8;
                        investInfo2 = investInfo;
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        i9 |= 16;
                        investInfo2 = investInfo;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr2[4], list6);
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 5:
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, kSerializerArr2[i8], list7);
                        i3 = i9 | 32;
                        kSerializerArr = kSerializerArr2;
                        i9 = i3;
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i3 = i9 | 64;
                        kSerializerArr = kSerializerArr2;
                        i9 = i3;
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 7:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, LongSerializer.INSTANCE, l9);
                        i3 = i9 | 128;
                        kSerializerArr = kSerializerArr2;
                        i9 = i3;
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    case 8:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, LongSerializer.INSTANCE, l8);
                        i9 |= 256;
                        break;
                    case 9:
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str2);
                        i9 |= 512;
                        kSerializerArr = kSerializerArr2;
                        investInfo2 = investInfo;
                        list3 = list6;
                        l4 = l10;
                        kSerializerArr2 = kSerializerArr;
                        list6 = list3;
                        l10 = l4;
                        investInfo = investInfo2;
                        i4 = 9;
                        i5 = 7;
                        i6 = 6;
                        i7 = 8;
                        i8 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l11 = l10;
            z = zDecodeBooleanElement2;
            list = list6;
            l = l11;
            l2 = l8;
            str = str2;
            investTxCoinInfo = investTxCoinInfo3;
            list2 = list7;
            num = num3;
            l3 = l9;
            i = i9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestTxData(i, investTxCoinInfo, investInfo, num, l, list, list2, z, l3, l2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestTxData investTxData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investTxData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestTxData.write$Self$OKWallet_wallet_impl(investTxData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
