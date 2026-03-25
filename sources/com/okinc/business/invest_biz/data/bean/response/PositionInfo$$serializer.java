package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.contants.PositionStatus;
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
public final /* synthetic */ class PositionInfo$$serializer implements GeneratedSerializer<PositionInfo> {
    public static final int $stable;
    public static final PositionInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PositionInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PositionInfo$$serializer positionInfo$$serializer = new PositionInfo$$serializer();
        INSTANCE = positionInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.PositionInfo", positionInfo$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("positionName", true);
        pluginGeneratedSerialDescriptor.addElement("positionStatus", true);
        pluginGeneratedSerialDescriptor.addElement("range", true);
        pluginGeneratedSerialDescriptor.addElement("reverseRange", true);
        pluginGeneratedSerialDescriptor.addElement("tips", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("feeRate", true);
        pluginGeneratedSerialDescriptor.addElement("supplied", true);
        pluginGeneratedSerialDescriptor.addElement("rewardDefiTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("unclaimFeesDefiTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("settlementTime", true);
        pluginGeneratedSerialDescriptor.addElement("assetPositionType", true);
        pluginGeneratedSerialDescriptor.addElement("totalValue", true);
        pluginGeneratedSerialDescriptor.addElement("showIncreaseLiquidity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PositionInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[7], kSerializerArr[8], kSerializerArr[9], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[11]), stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PositionInfo deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        List list2;
        String str2;
        InvestAssetPositionType investAssetPositionType;
        String str3;
        String str4;
        String str5;
        boolean zDecodeBooleanElement;
        PositionStatus positionStatus;
        List list3;
        String strDecodeStringElement;
        String str6;
        String str7;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PositionInfo.$childSerializers;
        int i3 = 8;
        List list4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            PositionStatus positionStatus2 = (PositionStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            investAssetPositionType = (InvestAssetPositionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            list = list6;
            list2 = list5;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            list3 = list7;
            str7 = str9;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            str3 = strDecodeStringElement5;
            str = strDecodeStringElement4;
            str2 = str8;
            str6 = strDecodeStringElement3;
            i = 16383;
            str5 = strDecodeStringElement2;
            positionStatus = positionStatus2;
            str4 = strDecodeStringElement6;
        } else {
            int i4 = 13;
            boolean z = true;
            List list8 = null;
            String strDecodeStringElement7 = null;
            String str10 = null;
            List list9 = null;
            String str11 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            PositionStatus positionStatus3 = null;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            InvestAssetPositionType investAssetPositionType2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 1:
                        positionStatus3 = (PositionStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], positionStatus3);
                        i5 |= 2;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 2:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        i5 |= 16;
                        i4 = 13;
                        i3 = 8;
                        break;
                    case 5:
                        i5 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = 13;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = 13;
                        break;
                    case 7:
                        i5 |= 128;
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list9);
                        i4 = 13;
                        break;
                    case 8:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], list8);
                        i2 = i5 | 256;
                        i5 = i2;
                        i4 = 13;
                        break;
                    case 9:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list4);
                        i2 = i5 | 512;
                        i5 = i2;
                        i4 = 13;
                        break;
                    case 10:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str10);
                        i2 = i5 | 1024;
                        i5 = i2;
                        i4 = 13;
                        break;
                    case 11:
                        investAssetPositionType2 = (InvestAssetPositionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], investAssetPositionType2);
                        i2 = i5 | 2048;
                        i5 = i2;
                        i4 = 13;
                        break;
                    case 12:
                        i5 |= 4096;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 = 13;
                        break;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 8192;
                        i4 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list8;
            str = strDecodeStringElement7;
            list2 = list9;
            str2 = str11;
            investAssetPositionType = investAssetPositionType2;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement12;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            positionStatus = positionStatus3;
            list3 = list4;
            strDecodeStringElement = strDecodeStringElement9;
            str6 = strDecodeStringElement11;
            str7 = str10;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PositionInfo(i, str5, positionStatus, str6, str, str2, str3, str4, list2, list, list3, str7, investAssetPositionType, strDecodeStringElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PositionInfo positionInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(positionInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PositionInfo.EZpvd(positionInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
