package com.okinc.business.market.features.smart_money.ranking.domain.model;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RankingFilter$$serializer implements GeneratedSerializer<RankingFilter> {
    public static final int $stable;
    public static final RankingFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RankingFilter$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RankingFilter$$serializer rankingFilter$$serializer = new RankingFilter$$serializer();
        INSTANCE = rankingFilter$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter", rankingFilter$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("desc", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("periodType", true);
        pluginGeneratedSerialDescriptor.addElement("pnlMax", true);
        pluginGeneratedSerialDescriptor.addElement("pnlMin", true);
        pluginGeneratedSerialDescriptor.addElement("rankBy", true);
        pluginGeneratedSerialDescriptor.addElement("roiMax", true);
        pluginGeneratedSerialDescriptor.addElement("roiMin", true);
        pluginGeneratedSerialDescriptor.addElement("winRateMin", true);
        pluginGeneratedSerialDescriptor.addElement("winRateMax", true);
        pluginGeneratedSerialDescriptor.addElement("tradeVolumeMax", true);
        pluginGeneratedSerialDescriptor.addElement("tradeVolumeMin", true);
        pluginGeneratedSerialDescriptor.addElement("txsMax", true);
        pluginGeneratedSerialDescriptor.addElement("txsMin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RankingFilter deserialize(@NotNull Decoder decoder) {
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
        String strDecodeStringElement;
        String str10;
        String str11;
        String str12;
        String strDecodeStringElement2;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str4 = strDecodeStringElement14;
            str13 = strDecodeStringElement15;
            i = 32767;
            str5 = strDecodeStringElement13;
            str7 = strDecodeStringElement11;
            str3 = strDecodeStringElement5;
            str = strDecodeStringElement3;
            str6 = strDecodeStringElement12;
            str2 = strDecodeStringElement4;
            str8 = strDecodeStringElement9;
            str10 = strDecodeStringElement6;
            str9 = strDecodeStringElement8;
            str12 = strDecodeStringElement7;
            str11 = strDecodeStringElement10;
        } else {
            int i2 = 0;
            int i3 = 14;
            String strDecodeStringElement16 = null;
            boolean z = true;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 14;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        i3 = 14;
                        break;
                    case 1:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        i3 = 14;
                        break;
                    case 2:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        i3 = 14;
                        break;
                    case 3:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        i3 = 14;
                        break;
                    case 4:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        i3 = 14;
                        break;
                    case 5:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        i3 = 14;
                        break;
                    case 6:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        i3 = 14;
                        break;
                    case 7:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        i3 = 14;
                        break;
                    case 8:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        i3 = 14;
                        break;
                    case 9:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        i3 = 14;
                        break;
                    case 10:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 |= 1024;
                        i3 = 14;
                        break;
                    case 11:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 |= 2048;
                        i3 = 14;
                        break;
                    case 12:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 |= 4096;
                        i3 = 14;
                        break;
                    case 13:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i2 |= 8192;
                        i3 = 14;
                        break;
                    case 14:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 |= 16384;
                        i3 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement17;
            str3 = strDecodeStringElement19;
            str4 = strDecodeStringElement20;
            str5 = strDecodeStringElement21;
            str6 = strDecodeStringElement22;
            str7 = strDecodeStringElement23;
            str8 = strDecodeStringElement24;
            str9 = strDecodeStringElement25;
            strDecodeStringElement = strDecodeStringElement26;
            str10 = strDecodeStringElement27;
            str11 = strDecodeStringElement28;
            str12 = strDecodeStringElement29;
            strDecodeStringElement2 = strDecodeStringElement18;
            str13 = strDecodeStringElement30;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RankingFilter(i, str, str2, str3, str10, str12, strDecodeStringElement, str9, str8, str11, str7, str6, str5, str4, str13, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RankingFilter rankingFilter) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rankingFilter, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RankingFilter.EZpvd(rankingFilter, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
