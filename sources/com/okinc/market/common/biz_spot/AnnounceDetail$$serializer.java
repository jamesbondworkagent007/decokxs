package com.okinc.market.common.biz_spot;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.search.bean.SearchResultContentPo;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AnnounceDetail$$serializer implements GeneratedSerializer<AnnounceDetail> {
    public static final int $stable;
    public static final AnnounceDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AnnounceDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AnnounceDetail$$serializer announceDetail$$serializer = new AnnounceDetail$$serializer();
        INSTANCE = announceDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.market.common.biz_spot.AnnounceDetail", announceDetail$$serializer, 25);
        pluginGeneratedSerialDescriptor.addElement("brief", true);
        pluginGeneratedSerialDescriptor.addElement("classification", true);
        pluginGeneratedSerialDescriptor.addElement("facebook", true);
        pluginGeneratedSerialDescriptor.addElement("flowTotal", true);
        pluginGeneratedSerialDescriptor.addElement("fullName", true);
        pluginGeneratedSerialDescriptor.addElement("github", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("introduce", true);
        pluginGeneratedSerialDescriptor.addElement("investors", true);
        pluginGeneratedSerialDescriptor.addElement("investor", true);
        pluginGeneratedSerialDescriptor.addElement("issueTime", true);
        pluginGeneratedSerialDescriptor.addElement("issueTotal", true);
        pluginGeneratedSerialDescriptor.addElement("link", true);
        pluginGeneratedSerialDescriptor.addElement("members", true);
        pluginGeneratedSerialDescriptor.addElement("officialUrl", true);
        pluginGeneratedSerialDescriptor.addElement("project", true);
        pluginGeneratedSerialDescriptor.addElement("projectId", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("telegram", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER, true);
        pluginGeneratedSerialDescriptor.addElement("weChat", true);
        pluginGeneratedSerialDescriptor.addElement("whitePaper", true);
        pluginGeneratedSerialDescriptor.addElement("blockBrowser", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AnnounceDetail.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[8]), stringSerializer, longSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[13]), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AnnounceDetail deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        ArrayList arrayList;
        int i;
        String str;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement2;
        String str8;
        String str9;
        String str10;
        String strDecodeStringElement3;
        long j;
        long j2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AnnounceDetail.$childSerializers;
        int i6 = 5;
        int i7 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            ArrayList arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            ArrayList arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            str17 = strDecodeStringElement19;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            strDecodeStringElement = strDecodeStringElement18;
            str15 = strDecodeStringElement20;
            str5 = strDecodeStringElement9;
            str13 = strDecodeStringElement21;
            str2 = strDecodeStringElement22;
            str = strDecodeStringElement13;
            str8 = strDecodeStringElement12;
            str3 = strDecodeStringElement11;
            str16 = strDecodeStringElement16;
            str10 = strDecodeStringElement4;
            str4 = strDecodeStringElement10;
            arrayList = arrayList4;
            str7 = strDecodeStringElement6;
            str9 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            i = 33554431;
            str18 = strDecodeStringElement17;
            arrayList2 = arrayList3;
            j2 = jDecodeLongElement;
            str11 = strDecodeStringElement14;
            str14 = strDecodeStringElement15;
            str12 = strDecodeStringElement5;
            j = jDecodeLongElement2;
        } else {
            String strDecodeStringElement23 = null;
            int i8 = 0;
            boolean z = true;
            ArrayList arrayList5 = null;
            String strDecodeStringElement24 = null;
            ArrayList arrayList6 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i7;
                        z = false;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 0:
                        i2 = i7;
                        i8 |= 1;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 1:
                        i2 = i7;
                        i8 |= 2;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 2:
                        i2 = i7;
                        i8 |= 4;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 3:
                        i2 = i7;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i8 |= 8;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 4:
                        i3 = i7;
                        i8 |= 16;
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i7 = i3;
                        break;
                    case 5:
                        i8 |= 32;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 6:
                        i8 |= 64;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 7:
                        i8 |= 128;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 8:
                        i8 |= 256;
                        arrayList6 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], arrayList6);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 9:
                        i8 |= 512;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 10:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
                        i8 |= 1024;
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 11:
                        i8 |= 2048;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 12:
                        i8 |= 4096;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 13:
                        arrayList5 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], arrayList5);
                        i8 |= 8192;
                        i2 = 4;
                        i7 = i2;
                        i6 = 5;
                        break;
                    case 14:
                        i8 |= 16384;
                        i3 = 4;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i7 = i3;
                        break;
                    case 15:
                        i8 |= 32768;
                        i3 = 4;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i7 = i3;
                        break;
                    case 16:
                        i8 |= 65536;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 4;
                        i7 = i3;
                        break;
                    case 17:
                        i8 |= 131072;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 4;
                        i7 = i3;
                        break;
                    case 18:
                        i8 |= 262144;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 = 4;
                        i7 = i3;
                        break;
                    case 19:
                        i8 |= 524288;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 4;
                        i7 = i3;
                        break;
                    case 20:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i4 = 1048576;
                        i8 |= i4;
                        i3 = i7;
                        i7 = i3;
                        break;
                    case 21:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i5 = 2097152;
                        i4 = i5;
                        i8 |= i4;
                        i3 = i7;
                        i7 = i3;
                        break;
                    case 22:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i5 = 4194304;
                        i4 = i5;
                        i8 |= i4;
                        i3 = i7;
                        i7 = i3;
                        break;
                    case 23:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i5 = 8388608;
                        i4 = i5;
                        i8 |= i4;
                        i3 = i7;
                        i7 = i3;
                        break;
                    case 24:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i5 = 16777216;
                        i4 = i5;
                        i8 |= i4;
                        i3 = i7;
                        i7 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            arrayList = arrayList5;
            i = i8;
            str = strDecodeStringElement24;
            arrayList2 = arrayList6;
            str2 = strDecodeStringElement41;
            str3 = strDecodeStringElement30;
            str4 = strDecodeStringElement31;
            str5 = strDecodeStringElement32;
            str6 = strDecodeStringElement33;
            str7 = strDecodeStringElement34;
            strDecodeStringElement2 = strDecodeStringElement35;
            str8 = strDecodeStringElement36;
            str9 = strDecodeStringElement37;
            str10 = strDecodeStringElement39;
            strDecodeStringElement3 = strDecodeStringElement40;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            str11 = strDecodeStringElement23;
            str12 = strDecodeStringElement38;
            String str19 = strDecodeStringElement29;
            str13 = strDecodeStringElement42;
            str14 = str19;
            String str20 = strDecodeStringElement28;
            str15 = strDecodeStringElement25;
            str16 = str20;
            String str21 = strDecodeStringElement27;
            str17 = strDecodeStringElement26;
            str18 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AnnounceDetail(i, str10, strDecodeStringElement3, str12, j2, str7, str9, str6, str5, arrayList2, str4, j, str3, str8, arrayList, str, str11, str14, str16, str18, strDecodeStringElement, str17, str15, str13, str2, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AnnounceDetail announceDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(announceDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AnnounceDetail.write$Self$OKMarket_market_api(announceDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
