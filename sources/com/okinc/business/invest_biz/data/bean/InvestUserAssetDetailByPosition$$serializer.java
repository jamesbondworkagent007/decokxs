package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserAssetDetailByPosition$$serializer implements GeneratedSerializer<InvestUserAssetDetailByPosition> {
    public static final int $stable;
    public static final InvestUserAssetDetailByPosition$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserAssetDetailByPosition$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserAssetDetailByPosition$$serializer investUserAssetDetailByPosition$$serializer = new InvestUserAssetDetailByPosition$$serializer();
        INSTANCE = investUserAssetDetailByPosition$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition", investUserAssetDetailByPosition$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("assetsTokenList", true);
        pluginGeneratedSerialDescriptor.addElement("positionName", true);
        pluginGeneratedSerialDescriptor.addElement("positionStatus", true);
        pluginGeneratedSerialDescriptor.addElement("range", true);
        pluginGeneratedSerialDescriptor.addElement("reverseRange", true);
        pluginGeneratedSerialDescriptor.addElement("isReverse", true);
        pluginGeneratedSerialDescriptor.addElement("rewardDefiTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("showIncreaseLiquidity", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("unclaimFeesDefiTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("nftLogo", true);
        pluginGeneratedSerialDescriptor.addElement("isNarrow", true);
        pluginGeneratedSerialDescriptor.addElement("needInvest", true);
        pluginGeneratedSerialDescriptor.addElement("assetPositionType", true);
        pluginGeneratedSerialDescriptor.addElement("positionExtInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("settlementTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestUserAssetDetailByPosition.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[6]), booleanSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), stringSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[14]), kSerializerArr[15], BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserAssetDetailByPosition deserialize(@NotNull Decoder decoder) {
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        boolean z3;
        boolean z4;
        String str8;
        InvestAssetPositionType investAssetPositionType;
        List list3;
        int i;
        List list4;
        List list5;
        int i2;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestUserAssetDetailByPosition.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            InvestAssetPositionType investAssetPositionType2 = (InvestAssetPositionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], null);
            investAssetPositionType = investAssetPositionType2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            z = zDecodeBooleanElement3;
            str8 = str9;
            str7 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            str6 = strDecodeStringElement;
            z4 = zDecodeBooleanElement4;
            list3 = list8;
            str5 = strDecodeStringElement2;
            list4 = list6;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement;
            str2 = strDecodeStringElement3;
            list2 = list7;
            str3 = strDecodeStringElement4;
            i = 131071;
        } else {
            int i5 = 16;
            int i6 = 0;
            boolean z5 = true;
            List list9 = null;
            String str10 = null;
            String str11 = null;
            InvestAssetPositionType investAssetPositionType3 = null;
            List list10 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            List list11 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            List list12 = null;
            String strDecodeStringElement12 = null;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list5 = list11;
                        z5 = false;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 0:
                        list5 = list11;
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list12);
                        i6 |= 1;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 1:
                        list5 = list11;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 2:
                        list5 = list11;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 3:
                        list5 = list11;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 4:
                        list5 = list11;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 5:
                        c = 6;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 6:
                        c = 6;
                        i6 |= 64;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], list11);
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 7:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 128;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 8:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i6 | 256;
                        i6 = i2;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 9:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        i2 = i6 | 512;
                        i6 = i2;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 10:
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], list10);
                        i2 = i6 | 1024;
                        i6 = i2;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 11:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 |= 2048;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 12:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i6 |= 4096;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 13:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i6 |= 8192;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 14:
                        investAssetPositionType3 = (InvestAssetPositionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], investAssetPositionType3);
                        i6 |= 16384;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 15:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], list9);
                        i2 = 32768 | i6;
                        i6 = i2;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    case 16:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str11);
                        i6 |= 65536;
                        list5 = list11;
                        list11 = list5;
                        i5 = 16;
                        i3 = 9;
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list9;
            list2 = list11;
            str = str11;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            z = zDecodeBooleanElement6;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement12;
            z2 = zDecodeBooleanElement7;
            z3 = zDecodeBooleanElement8;
            z4 = zDecodeBooleanElement5;
            str8 = str10;
            investAssetPositionType = investAssetPositionType3;
            list3 = list10;
            i = i6;
            list4 = list12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserAssetDetailByPosition(i, list4, str6, str5, str2, str3, z3, list2, z2, str7, str8, list3, str4, z, z4, investAssetPositionType, list, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserAssetDetailByPosition investUserAssetDetailByPosition) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserAssetDetailByPosition, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserAssetDetailByPosition.write$Self$OKDeFi_invest_biz(investUserAssetDetailByPosition, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
