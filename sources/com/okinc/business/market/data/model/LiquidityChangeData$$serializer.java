package com.okinc.business.market.data.model;

import com.okinc.business.market.data.constant.LiquidityChangeType;
import com.okinc.p2p.api.OtcExtraKeys;
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
public final /* synthetic */ class LiquidityChangeData$$serializer implements GeneratedSerializer<LiquidityChangeData> {
    public static final int $stable;
    public static final LiquidityChangeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private LiquidityChangeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        LiquidityChangeData$$serializer liquidityChangeData$$serializer = new LiquidityChangeData$$serializer();
        INSTANCE = liquidityChangeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.LiquidityChangeData", liquidityChangeData$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("dexName", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("poolName", true);
        pluginGeneratedSerialDescriptor.addElement("poolLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("txHashUrl", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("changedTokenInfo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = LiquidityChangeData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[9], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final LiquidityChangeData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        String strDecodeStringElement4;
        String str;
        String str2;
        List list;
        String str3;
        LiquidityChangeType liquidityChangeType;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = LiquidityChangeData.$childSerializers;
        int i3 = 10;
        String strDecodeStringElement5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            LiquidityChangeType liquidityChangeType2 = (LiquidityChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            list = list2;
            str5 = strDecodeStringElement6;
            str7 = strDecodeStringElement7;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str4 = strDecodeStringElement12;
            str3 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement10;
            str6 = strDecodeStringElement13;
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            liquidityChangeType = liquidityChangeType2;
            i = 8191;
        } else {
            int i4 = 12;
            int i5 = 0;
            List list3 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            boolean z = true;
            LiquidityChangeType liquidityChangeType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 0:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 2:
                        c = 3;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 3:
                        c = 3;
                        i5 |= 8;
                        liquidityChangeType3 = (LiquidityChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], liquidityChangeType3);
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 4:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i5 | 16;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 5:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i5 | 32;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 6:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i5 | 64;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 7:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = i5 | 128;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 8:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i5 | 256;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 9:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list3);
                        i2 = i5 | 512;
                        i5 = i2;
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 10:
                        i5 |= 1024;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 11:
                        i5 |= 2048;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 = 12;
                        i3 = 10;
                        break;
                    case 12:
                        i5 |= 4096;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i4 = 12;
                        i3 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            strDecodeStringElement2 = strDecodeStringElement16;
            strDecodeStringElement3 = strDecodeStringElement17;
            strDecodeStringElement4 = strDecodeStringElement18;
            str = strDecodeStringElement19;
            str2 = strDecodeStringElement22;
            list = list3;
            str3 = strDecodeStringElement5;
            liquidityChangeType = liquidityChangeType3;
            String str8 = strDecodeStringElement20;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement21;
            str6 = strDecodeStringElement15;
            str7 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LiquidityChangeData(i, str5, str7, str2, liquidityChangeType, str, strDecodeStringElement, str3, str4, str6, list, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull LiquidityChangeData liquidityChangeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(liquidityChangeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LiquidityChangeData.OLrzqt(liquidityChangeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
