package com.okinc.planet.biz_social_feeds.domain;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class FollowInnerData$$serializer implements GeneratedSerializer<FollowInnerData> {
    public static final int $stable;
    public static final FollowInnerData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FollowInnerData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FollowInnerData$$serializer followInnerData$$serializer = new FollowInnerData$$serializer();
        INSTANCE = followInnerData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_social_feeds.domain.FollowInnerData", followInnerData$$serializer, 35);
        pluginGeneratedSerialDescriptor.addElement("nickName", true);
        pluginGeneratedSerialDescriptor.addElement("uniqueName", true);
        pluginGeneratedSerialDescriptor.addElement("portrait", true);
        pluginGeneratedSerialDescriptor.addElement("targetId", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("postId", true);
        pluginGeneratedSerialDescriptor.addElement("instId", true);
        pluginGeneratedSerialDescriptor.addElement("px", true);
        pluginGeneratedSerialDescriptor.addElement("openAvgPx", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("baseCcy", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.SIDE, true);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, true);
        pluginGeneratedSerialDescriptor.addElement("orderFinishTime", true);
        pluginGeneratedSerialDescriptor.addElement("sysTime", true);
        pluginGeneratedSerialDescriptor.addElement("posSide", true);
        pluginGeneratedSerialDescriptor.addElement("mgnMode", true);
        pluginGeneratedSerialDescriptor.addElement("bizId", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("posStatus", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_ALIAS, true);
        pluginGeneratedSerialDescriptor.addElement("pos", true);
        pluginGeneratedSerialDescriptor.addElement("posCcy", true);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("stgyName", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("balNum", true);
        pluginGeneratedSerialDescriptor.addElement("cycles", true);
        pluginGeneratedSerialDescriptor.addElement("gridNum", true);
        pluginGeneratedSerialDescriptor.addElement("minPrice", true);
        pluginGeneratedSerialDescriptor.addElement("maxPrice", true);
        pluginGeneratedSerialDescriptor.addElement("arbitrageInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("tradeType", true);
        pluginGeneratedSerialDescriptor.addElement("copyType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = FollowInnerData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[32], stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FollowInnerData deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
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
        int i2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String strDecodeStringElement;
        String str21;
        String str22;
        List list;
        String strDecodeStringElement2;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = FollowInnerData.$childSerializers;
        int i5 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
            String strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            String strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            String strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
            String strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
            str5 = strDecodeStringElement16;
            str29 = strDecodeStringElement29;
            str27 = strDecodeStringElement30;
            str17 = strDecodeStringElement31;
            str16 = strDecodeStringElement32;
            str26 = strDecodeStringElement33;
            str15 = strDecodeStringElement34;
            str6 = strDecodeStringElement13;
            str12 = strDecodeStringElement3;
            str19 = strDecodeStringElement23;
            str20 = strDecodeStringElement24;
            str28 = strDecodeStringElement25;
            str30 = strDecodeStringElement26;
            str32 = strDecodeStringElement27;
            str31 = strDecodeStringElement28;
            str24 = strDecodeStringElement22;
            str3 = strDecodeStringElement14;
            str = strDecodeStringElement21;
            str23 = strDecodeStringElement20;
            str18 = strDecodeStringElement19;
            str21 = strDecodeStringElement18;
            str22 = strDecodeStringElement17;
            i2 = 7;
            str11 = strDecodeStringElement7;
            str10 = strDecodeStringElement8;
            str7 = strDecodeStringElement12;
            str9 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            i = -1;
            str13 = strDecodeStringElement4;
            str4 = strDecodeStringElement6;
            str2 = strDecodeStringElement15;
            str25 = strDecodeStringElement11;
            str14 = strDecodeStringElement5;
        } else {
            String str33 = null;
            int i6 = 0;
            String str34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            String strDecodeStringElement42 = null;
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            String strDecodeStringElement57 = null;
            String strDecodeStringElement58 = null;
            String strDecodeStringElement59 = null;
            String strDecodeStringElement60 = null;
            String strDecodeStringElement61 = null;
            String strDecodeStringElement62 = null;
            String strDecodeStringElement63 = null;
            String str35 = null;
            String strDecodeStringElement64 = null;
            String strDecodeStringElement65 = null;
            boolean z = true;
            i = 0;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        Unit unit = Unit.INSTANCE;
                        z = false;
                        i5 = 3;
                        break;
                    case 0:
                        String strDecodeStringElement66 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        Unit unit2 = Unit.INSTANCE;
                        str35 = strDecodeStringElement66;
                        i5 = 3;
                        break;
                    case 1:
                        strDecodeStringElement64 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        Unit unit3 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 2:
                        strDecodeStringElement65 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        Unit unit4 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 3:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i |= 8;
                        Unit unit5 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 4:
                        strDecodeStringElement63 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        Unit unit6 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 5:
                        strDecodeStringElement62 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        Unit unit62 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 6:
                        strDecodeStringElement61 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        Unit unit622 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 7:
                        strDecodeStringElement60 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        Unit unit6222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 8:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        Unit unit7 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 9:
                        strDecodeStringElement59 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        Unit unit72 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 10:
                        strDecodeStringElement58 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        Unit unit722 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 11:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        Unit unit7222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 12:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        Unit unit72222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 13:
                        strDecodeStringElement57 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        Unit unit8 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 14:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        Unit unit9 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 15:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i |= 32768;
                        Unit unit10 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 16:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i |= 65536;
                        Unit unit11 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 17:
                        String strDecodeStringElement67 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i |= 131072;
                        Unit unit12 = Unit.INSTANCE;
                        str33 = strDecodeStringElement67;
                        i5 = 3;
                        break;
                    case 18:
                        String strDecodeStringElement68 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i |= 262144;
                        Unit unit13 = Unit.INSTANCE;
                        str34 = strDecodeStringElement68;
                        i5 = 3;
                        break;
                    case 19:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i |= 524288;
                        Unit unit14 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 20:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i |= i3;
                        Unit unit15 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 21:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i |= i3;
                        Unit unit152 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 22:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i3 = 4194304;
                        i |= i3;
                        Unit unit1522 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 23:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i3 = 8388608;
                        i |= i3;
                        Unit unit15222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 24:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i3 = 16777216;
                        i |= i3;
                        Unit unit152222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 25:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 25);
                        i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i |= i3;
                        Unit unit1522222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 26:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i3 = 67108864;
                        i |= i3;
                        Unit unit15222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 27:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 = 134217728;
                        i |= i3;
                        Unit unit152222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 28:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i3 = 268435456;
                        i |= i3;
                        Unit unit1522222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 29:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 = 536870912;
                        i |= i3;
                        Unit unit15222222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 30:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 30);
                        i3 = 1073741824;
                        i |= i3;
                        Unit unit152222222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 31:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 31);
                        i3 = Integer.MIN_VALUE;
                        i |= i3;
                        Unit unit1522222222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 32:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 32, kSerializerArr[32], list2);
                        i6 |= 1;
                        Unit unit15222222222222 = Unit.INSTANCE;
                        i5 = 3;
                        break;
                    case 33:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 33);
                        i4 = i6 | 2;
                        Unit unit16 = Unit.INSTANCE;
                        i6 = i4;
                        i5 = 3;
                        break;
                    case 34:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 34);
                        i4 = i6 | 4;
                        Unit unit162 = Unit.INSTANCE;
                        i6 = i4;
                        i5 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str34;
            str2 = strDecodeStringElement49;
            str3 = strDecodeStringElement50;
            str4 = strDecodeStringElement52;
            str5 = strDecodeStringElement57;
            str6 = strDecodeStringElement58;
            str7 = strDecodeStringElement59;
            str8 = strDecodeStringElement60;
            str9 = strDecodeStringElement61;
            str10 = strDecodeStringElement62;
            str11 = strDecodeStringElement63;
            str12 = str35;
            str13 = strDecodeStringElement64;
            str14 = strDecodeStringElement65;
            i2 = i6;
            str15 = strDecodeStringElement38;
            str16 = strDecodeStringElement41;
            str17 = strDecodeStringElement42;
            str18 = strDecodeStringElement54;
            str19 = strDecodeStringElement36;
            str20 = strDecodeStringElement37;
            strDecodeStringElement = strDecodeStringElement53;
            str21 = strDecodeStringElement55;
            str22 = strDecodeStringElement56;
            list = list2;
            strDecodeStringElement2 = strDecodeStringElement39;
            str23 = str33;
            String str36 = strDecodeStringElement40;
            str24 = strDecodeStringElement35;
            str25 = strDecodeStringElement51;
            str26 = str36;
            String str37 = strDecodeStringElement48;
            str27 = strDecodeStringElement43;
            str28 = str37;
            String str38 = strDecodeStringElement47;
            str29 = strDecodeStringElement44;
            str30 = str38;
            String str39 = strDecodeStringElement46;
            str31 = strDecodeStringElement45;
            str32 = str39;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FollowInnerData(i, i2, str12, str13, str14, str4, str11, str10, str9, str8, str25, str7, str6, str3, str2, str5, str22, str21, str18, str23, str, str24, str19, str20, str28, str30, str32, str31, str29, str27, str17, str16, str26, str15, list, strDecodeStringElement, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FollowInnerData followInnerData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(followInnerData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FollowInnerData.KWHzl(followInnerData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
