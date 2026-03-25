package com.okinc.business.market.data.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.market.common.constants.StringBooleanType;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class HomeTokenData$$serializer implements GeneratedSerializer<HomeTokenData> {
    public static final int $stable;
    public static final HomeTokenData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HomeTokenData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HomeTokenData$$serializer homeTokenData$$serializer = new HomeTokenData$$serializer();
        INSTANCE = homeTokenData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.HomeTokenData", homeTokenData$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("change", true);
        pluginGeneratedSerialDescriptor.addElement("txs", true);
        pluginGeneratedSerialDescriptor.addElement("txsb", true);
        pluginGeneratedSerialDescriptor.addElement("txss", true);
        pluginGeneratedSerialDescriptor.addElement("uqtrader", true);
        pluginGeneratedSerialDescriptor.addElement("vol", true);
        pluginGeneratedSerialDescriptor.addElement("mcap", true);
        pluginGeneratedSerialDescriptor.addElement("liq", true);
        pluginGeneratedSerialDescriptor.addElement("firstpt", true);
        pluginGeneratedSerialDescriptor.addElement("collectionToken", true);
        pluginGeneratedSerialDescriptor.addElement("hold", true);
        pluginGeneratedSerialDescriptor.addElement("searchNum", true);
        pluginGeneratedSerialDescriptor.addElement("chain", true);
        pluginGeneratedSerialDescriptor.addElement("ca", true);
        pluginGeneratedSerialDescriptor.addElement("smbl", true);
        pluginGeneratedSerialDescriptor.addElement("logo", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("riskconl", true);
        pluginGeneratedSerialDescriptor.addElement("riskl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenScoreRank", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HomeTokenData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[10], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[17], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HomeTokenData deserialize(@NotNull Decoder decoder) {
        List list;
        int i;
        StringBooleanType stringBooleanType;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
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
        String str16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HomeTokenData.$childSerializers;
        int i2 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            StringBooleanType stringBooleanType2 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            list = list2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            str12 = strDecodeStringElement7;
            str11 = strDecodeStringElement8;
            str8 = strDecodeStringElement12;
            i = 2097151;
            stringBooleanType = stringBooleanType2;
            str14 = strDecodeStringElement6;
            str16 = strDecodeStringElement4;
            str5 = strDecodeStringElement19;
            str7 = strDecodeStringElement14;
            str6 = strDecodeStringElement15;
            str15 = strDecodeStringElement5;
            str4 = strDecodeStringElement18;
            str = strDecodeStringElement13;
            str13 = strDecodeStringElement9;
            str9 = strDecodeStringElement11;
            str10 = strDecodeStringElement10;
            str3 = strDecodeStringElement17;
            str2 = strDecodeStringElement16;
        } else {
            String strDecodeStringElement20 = null;
            int i3 = 20;
            int i4 = 0;
            boolean z = true;
            List list3 = null;
            StringBooleanType stringBooleanType3 = null;
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
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 0:
                        i4 |= 1;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 10:
                        i4 |= 1024;
                        stringBooleanType3 = (StringBooleanType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], stringBooleanType3);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 12:
                        i4 |= 4096;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 15:
                        i4 |= 32768;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 16:
                        i4 |= 65536;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 17:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], list3);
                        i4 |= 131072;
                        i2 = 4;
                        i3 = 20;
                        break;
                    case 18:
                        i4 |= 262144;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 = 20;
                        break;
                    case 19:
                        i4 |= 524288;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 20;
                        break;
                    case 20:
                        i4 |= 1048576;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            i = i4;
            stringBooleanType = stringBooleanType3;
            str = strDecodeStringElement20;
            str2 = strDecodeStringElement21;
            str3 = strDecodeStringElement22;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement24;
            strDecodeStringElement = strDecodeStringElement25;
            strDecodeStringElement2 = strDecodeStringElement26;
            strDecodeStringElement3 = strDecodeStringElement27;
            str6 = strDecodeStringElement28;
            str7 = strDecodeStringElement29;
            str8 = strDecodeStringElement30;
            str9 = strDecodeStringElement31;
            str10 = strDecodeStringElement32;
            str11 = strDecodeStringElement33;
            str12 = strDecodeStringElement34;
            str13 = strDecodeStringElement35;
            str14 = strDecodeStringElement36;
            str15 = strDecodeStringElement37;
            str16 = strDecodeStringElement38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HomeTokenData(i, str16, str15, str14, str12, str11, str13, str10, str9, str8, str, stringBooleanType, str7, str6, str2, str3, str4, str5, list, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HomeTokenData homeTokenData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeTokenData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HomeTokenData.AEQbTJ(homeTokenData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
