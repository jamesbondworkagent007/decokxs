package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ChainInfoData$$serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TrackingAddressData$$serializer implements GeneratedSerializer<TrackingAddressData> {
    public static final int $stable;
    public static final TrackingAddressData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackingAddressData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackingAddressData$$serializer trackingAddressData$$serializer = new TrackingAddressData$$serializer();
        INSTANCE = trackingAddressData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.TrackingAddressData", trackingAddressData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("addressAlias", true);
        pluginGeneratedSerialDescriptor.addElement("aliasType", true);
        pluginGeneratedSerialDescriptor.addElement("collectAddress", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("collectType", true);
        pluginGeneratedSerialDescriptor.addElement("collectTime", true);
        pluginGeneratedSerialDescriptor.addElement("lastTxTime", true);
        pluginGeneratedSerialDescriptor.addElement("sevenDayPnl", true);
        pluginGeneratedSerialDescriptor.addElement("sevenDayPnlPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("sevenDayTxs", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenAmount", true);
        pluginGeneratedSerialDescriptor.addElement("notifyType", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("chainInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrackingAddressData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, kSerializerArr[4], longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[11], kSerializerArr[12], ChainInfoData$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackingAddressData deserialize(@NotNull Decoder decoder) {
        StringBooleanType stringBooleanType;
        int i;
        StringBooleanType stringBooleanType2;
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        String str4;
        StringBooleanType stringBooleanType3;
        long j;
        String str5;
        String str6;
        List list;
        ChainInfoData chainInfoData;
        long j2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrackingAddressData.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        ChainInfoData chainInfoData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringBooleanType stringBooleanType4 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringBooleanType stringBooleanType5 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            StringBooleanType stringBooleanType6 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            stringBooleanType3 = stringBooleanType6;
            chainInfoData = (ChainInfoData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, ChainInfoData$$serializer.INSTANCE, null);
            stringBooleanType2 = stringBooleanType5;
            str6 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            i = 16383;
            j = jDecodeLongElement2;
            str3 = strDecodeStringElement3;
            stringBooleanType = stringBooleanType4;
            j2 = jDecodeLongElement;
            str2 = strDecodeStringElement4;
            str4 = strDecodeStringElement2;
            str = strDecodeStringElement5;
        } else {
            int i5 = 13;
            long jDecodeLongElement3 = 0;
            boolean z = true;
            List list2 = null;
            StringBooleanType stringBooleanType7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            StringBooleanType stringBooleanType8 = null;
            String strDecodeStringElement14 = null;
            int i6 = 0;
            long jDecodeLongElement4 = 0;
            StringBooleanType stringBooleanType9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 0:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 1:
                        stringBooleanType8 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], stringBooleanType8);
                        i6 |= 2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 2:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 4:
                        stringBooleanType7 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], stringBooleanType7);
                        i6 |= 16;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i6 |= 32;
                        i5 = 13;
                        break;
                    case 6:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i2 = i6 | 64;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 7:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = i6 | 128;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i6 | 256;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 9:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i2 = i6 | 512;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 10:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 = i6 | 1024;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 11:
                        stringBooleanType9 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], stringBooleanType9);
                        i2 = i6 | 2048;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 12:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], list2);
                        i2 = i6 | 4096;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 13:
                        chainInfoData2 = (ChainInfoData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, ChainInfoData$$serializer.INSTANCE, chainInfoData2);
                        i2 = i6 | 8192;
                        i6 = i2;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            stringBooleanType = stringBooleanType8;
            i = i6;
            stringBooleanType2 = stringBooleanType7;
            str = strDecodeStringElement8;
            strDecodeStringElement = strDecodeStringElement11;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            stringBooleanType3 = stringBooleanType9;
            j = jDecodeLongElement3;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            list = list2;
            chainInfoData = chainInfoData2;
            j2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackingAddressData(i, str4, stringBooleanType, str3, strDecodeStringElement, stringBooleanType2, j2, j, str2, str, str5, str6, stringBooleanType3, list, chainInfoData, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackingAddressData trackingAddressData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackingAddressData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackingAddressData.OLrzqt(trackingAddressData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
