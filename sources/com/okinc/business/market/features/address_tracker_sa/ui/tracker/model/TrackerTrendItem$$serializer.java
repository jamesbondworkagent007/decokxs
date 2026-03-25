package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TrackerTrendItem$$serializer implements GeneratedSerializer<TrackerTrendItem> {
    public static final int $stable;
    public static final TrackerTrendItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TrackerTrendItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrackerTrendItem$$serializer trackerTrendItem$$serializer = new TrackerTrendItem$$serializer();
        INSTANCE = trackerTrendItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem", trackerTrendItem$$serializer, 26);
        pluginGeneratedSerialDescriptor.addElement("chainBWLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("firstPriceTime", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("priceChange", true);
        pluginGeneratedSerialDescriptor.addElement("riskControlLevel", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenTagList", true);
        pluginGeneratedSerialDescriptor.addElement("totalInflow", true);
        pluginGeneratedSerialDescriptor.addElement("totalLastTxTime", true);
        pluginGeneratedSerialDescriptor.addElement("totalTxsBuy", true);
        pluginGeneratedSerialDescriptor.addElement("totalTxsSell", true);
        pluginGeneratedSerialDescriptor.addElement("totalUniqueTraderNum", true);
        pluginGeneratedSerialDescriptor.addElement("totalVolumeBuy", true);
        pluginGeneratedSerialDescriptor.addElement("traderList", true);
        pluginGeneratedSerialDescriptor.addElement("traderListSize", true);
        pluginGeneratedSerialDescriptor.addElement("viewMoreType", true);
        pluginGeneratedSerialDescriptor.addElement("volume", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TrackerTrendItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[11], stringSerializer, stringSerializer, kSerializerArr[14], stringSerializer, longSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, kSerializerArr[21], intSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrackerTrendItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        List list;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3;
        String strDecodeStringElement2;
        String str8;
        String str9;
        String str10;
        long j;
        List list2;
        int i4;
        boolean z;
        int i5;
        String str11;
        String str12;
        long j2;
        List list3;
        int i6;
        String str13;
        int i7;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TrackerTrendItem.$childSerializers;
        int i11 = 5;
        int i12 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 16);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            i2 = iDecodeIntElement4;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            i = iDecodeIntElement5;
            z = zDecodeBooleanElement;
            list3 = list6;
            strDecodeStringElement = strDecodeStringElement15;
            str2 = strDecodeStringElement16;
            i5 = iDecodeIntElement2;
            list2 = list5;
            str9 = strDecodeStringElement8;
            str6 = strDecodeStringElement5;
            list = list4;
            i3 = iDecodeIntElement;
            i6 = 67108863;
            i4 = iDecodeIntElement3;
            str10 = strDecodeStringElement7;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
            str11 = strDecodeStringElement14;
            str8 = strDecodeStringElement9;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement10;
            str3 = strDecodeStringElement13;
            str7 = strDecodeStringElement4;
            str13 = strDecodeStringElement6;
            str12 = strDecodeStringElement3;
            str = strDecodeStringElement12;
        } else {
            List list7 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            int i13 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            boolean z2 = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            List list8 = null;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            List list9 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i7 = i11;
                        z2 = false;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 0:
                        i7 = i11;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i13 |= 1;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 1:
                        i7 = i11;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i13 |= 2;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 2:
                        i7 = i11;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i13 |= 4;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 3:
                        i7 = i11;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i13 |= 8;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 4:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i13 |= 16;
                        i11 = i11;
                        i12 = 8;
                        break;
                    case 5:
                        i7 = i11;
                        i13 |= 32;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 6:
                        i13 |= 64;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i11 = 5;
                        break;
                    case 7:
                        i13 |= 128;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i11 = 5;
                        break;
                    case 8:
                        i13 |= 256;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i12);
                        i11 = 5;
                        break;
                    case 9:
                        i13 |= 512;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i11 = 5;
                        break;
                    case 10:
                        i13 |= 1024;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i11 = 5;
                        break;
                    case 11:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list7);
                        i13 |= 2048;
                        i11 = 5;
                        break;
                    case 12:
                        i13 |= 4096;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i11 = 5;
                        break;
                    case 13:
                        i13 |= 8192;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i11 = 5;
                        break;
                    case 14:
                        i13 |= 16384;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], list8);
                        i11 = 5;
                        break;
                    case 15:
                        i13 |= 32768;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i11 = 5;
                        break;
                    case 16:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 16);
                        i13 |= 65536;
                        i11 = 5;
                        break;
                    case 17:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        i13 |= 131072;
                        i11 = 5;
                        break;
                    case 18:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
                        i13 |= 262144;
                        i11 = 5;
                        break;
                    case 19:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 19);
                        i9 = 524288;
                        i13 |= i9;
                        i11 = 5;
                        break;
                    case 20:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i10 = 1048576;
                        i9 = i10;
                        i13 |= i9;
                        i11 = 5;
                        break;
                    case 21:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], list9);
                        i10 = 2097152;
                        i9 = i10;
                        i13 |= i9;
                        i11 = 5;
                        break;
                    case 22:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                        i8 = 4194304;
                        i13 = i8 | i13;
                        i7 = i11;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 23:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 23);
                        i8 = 8388608;
                        i13 = i8 | i13;
                        i7 = i11;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 24:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i8 = 16777216;
                        i13 = i8 | i13;
                        i7 = i11;
                        i11 = i7;
                        i12 = 8;
                        break;
                    case 25:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i8 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i13 = i8 | i13;
                        i7 = i11;
                        i11 = i7;
                        i12 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement8;
            list = list7;
            i2 = iDecodeIntElement9;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement23;
            str7 = strDecodeStringElement24;
            i3 = iDecodeIntElement7;
            strDecodeStringElement2 = strDecodeStringElement26;
            str8 = strDecodeStringElement27;
            str9 = strDecodeStringElement28;
            str10 = strDecodeStringElement29;
            j = jDecodeLongElement4;
            list2 = list8;
            i4 = iDecodeIntElement10;
            z = zDecodeBooleanElement2;
            i5 = iDecodeIntElement6;
            str11 = strDecodeStringElement19;
            str12 = strDecodeStringElement25;
            j2 = jDecodeLongElement3;
            list3 = list9;
            i6 = i13;
            str13 = strDecodeStringElement30;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TrackerTrendItem(i6, str12, i3, str7, j, str6, str13, str10, str9, str8, str5, str4, list, str, str3, list2, str11, j2, i5, i4, i2, strDecodeStringElement, list3, i, z, str2, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TrackerTrendItem trackerTrendItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(trackerTrendItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TrackerTrendItem.OLrzqt(trackerTrendItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
