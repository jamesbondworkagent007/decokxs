package com.okinc.business.market.data.model.smart_money;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.DexTokenMeta$$serializer;
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
public final /* synthetic */ class SignalData$$serializer implements GeneratedSerializer<SignalData> {
    public static final int $stable;
    public static final SignalData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalData$$serializer signalData$$serializer = new SignalData$$serializer();
        INSTANCE = signalData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SignalData", signalData$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("tokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("batchId", true);
        pluginGeneratedSerialDescriptor.addElement("batchIndex", true);
        pluginGeneratedSerialDescriptor.addElement("trend", true);
        pluginGeneratedSerialDescriptor.addElement("addressNum", true);
        pluginGeneratedSerialDescriptor.addElement("addresses", true);
        pluginGeneratedSerialDescriptor.addElement("volume", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("liquidity", true);
        pluginGeneratedSerialDescriptor.addElement("mcap", true);
        pluginGeneratedSerialDescriptor.addElement("eventTime", true);
        pluginGeneratedSerialDescriptor.addElement("duration", true);
        pluginGeneratedSerialDescriptor.addElement("holders", true);
        pluginGeneratedSerialDescriptor.addElement("sellRatio", true);
        pluginGeneratedSerialDescriptor.addElement("expireStatus", true);
        pluginGeneratedSerialDescriptor.addElement("signalLabel", true);
        pluginGeneratedSerialDescriptor.addElement("tokenKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{DexTokenMeta$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[4], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalData deserialize(@NotNull Decoder decoder) {
        int i;
        TxType txType;
        DexTokenMeta dexTokenMeta;
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
        String strDecodeStringElement;
        String str13;
        String strDecodeStringElement2;
        String str14;
        DexTokenMeta dexTokenMeta2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalData.$childSerializers;
        int i3 = 8;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DexTokenMeta dexTokenMeta3 = (DexTokenMeta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            TxType txType2 = (TxType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            str9 = strDecodeStringElement15;
            str14 = strDecodeStringElement17;
            str13 = strDecodeStringElement16;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement11;
            str10 = strDecodeStringElement9;
            txType = txType2;
            str12 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
            str2 = strDecodeStringElement13;
            i = 262143;
            str6 = strDecodeStringElement7;
            str = strDecodeStringElement14;
            dexTokenMeta = dexTokenMeta3;
            str11 = strDecodeStringElement8;
            str8 = strDecodeStringElement4;
            str5 = strDecodeStringElement10;
        } else {
            int i4 = 17;
            boolean z = true;
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
            DexTokenMeta dexTokenMeta4 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            i = 0;
            TxType txType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        dexTokenMeta2 = dexTokenMeta4;
                        z = false;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 0:
                        dexTokenMeta2 = (DexTokenMeta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, dexTokenMeta4);
                        i |= 1;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 1:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 2:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 3:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i | 8;
                        i = i2;
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 4:
                        txType3 = (TxType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], txType3);
                        i2 = i | 16;
                        i = i2;
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 12:
                        i |= 4096;
                        dexTokenMeta2 = dexTokenMeta4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        dexTokenMeta2 = dexTokenMeta4;
                        dexTokenMeta4 = dexTokenMeta2;
                        i3 = 8;
                        i4 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            txType = txType3;
            dexTokenMeta = dexTokenMeta4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement22;
            str3 = strDecodeStringElement23;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str9 = strDecodeStringElement29;
            str10 = strDecodeStringElement30;
            str11 = strDecodeStringElement31;
            str12 = strDecodeStringElement32;
            String str15 = strDecodeStringElement21;
            strDecodeStringElement = strDecodeStringElement18;
            str13 = str15;
            String str16 = strDecodeStringElement20;
            strDecodeStringElement2 = strDecodeStringElement19;
            str14 = str16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalData(i, dexTokenMeta, str8, str12, str7, txType, str6, str11, str10, str5, str4, str3, str2, str, str9, str13, str14, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalData signalData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalData.OLrzqt(signalData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
