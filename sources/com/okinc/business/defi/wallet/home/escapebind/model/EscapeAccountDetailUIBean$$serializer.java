package com.okinc.business.defi.wallet.home.escapebind.model;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class EscapeAccountDetailUIBean$$serializer implements GeneratedSerializer<EscapeAccountDetailUIBean> {
    public static final int $stable;
    public static final EscapeAccountDetailUIBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EscapeAccountDetailUIBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EscapeAccountDetailUIBean$$serializer escapeAccountDetailUIBean$$serializer = new EscapeAccountDetailUIBean$$serializer();
        INSTANCE = escapeAccountDetailUIBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean", escapeAccountDetailUIBean$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("coinId", false);
        pluginGeneratedSerialDescriptor.addElement("symbol", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("logo", false);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", false);
        pluginGeneratedSerialDescriptor.addElement("originalCoinAmount", false);
        pluginGeneratedSerialDescriptor.addElement("decimalNum", false);
        pluginGeneratedSerialDescriptor.addElement("displayPrecision", false);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", false);
        pluginGeneratedSerialDescriptor.addElement("riskType", false);
        pluginGeneratedSerialDescriptor.addElement("isMainCoin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, longSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EscapeAccountDetailUIBean deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        long j;
        long j2;
        boolean zDecodeBooleanElement;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            j2 = jDecodeLongElement2;
            str4 = strDecodeStringElement10;
            i2 = iDecodeIntElement2;
            i = 32767;
            str = strDecodeStringElement;
            i3 = iDecodeIntElement;
            str5 = strDecodeStringElement9;
            str2 = strDecodeStringElement2;
            str3 = strDecodeStringElement3;
            str6 = strDecodeStringElement7;
            str9 = strDecodeStringElement4;
            str10 = strDecodeStringElement8;
            str7 = strDecodeStringElement6;
            str8 = strDecodeStringElement5;
            j = jDecodeLongElement;
        } else {
            int i5 = 14;
            boolean z = true;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 14;
                        break;
                    case 0:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i5 = 14;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i5 = 14;
                        break;
                    case 2:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i5 = 14;
                        break;
                    case 3:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i5 = 14;
                        break;
                    case 4:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i4 |= 16;
                        i5 = 14;
                        break;
                    case 5:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i5 = 14;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i5 = 14;
                        break;
                    case 7:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i5 = 14;
                        break;
                    case 8:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i5 = 14;
                        break;
                    case 9:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        i5 = 14;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i4 |= 1024;
                        i5 = 14;
                        break;
                    case 11:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i5 = 14;
                        break;
                    case 12:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i5 = 14;
                        break;
                    case 13:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 13);
                        i4 |= 8192;
                        i5 = 14;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i4 |= 16384;
                        i5 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement19;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement12;
            i2 = iDecodeIntElement3;
            str5 = strDecodeStringElement13;
            str6 = strDecodeStringElement14;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement16;
            str9 = strDecodeStringElement17;
            str10 = strDecodeStringElement18;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i3 = iDecodeIntElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EscapeAccountDetailUIBean(i, str, str2, str3, str9, j, str8, str7, str6, str10, str5, i3, i2, str4, j2, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EscapeAccountDetailUIBean escapeAccountDetailUIBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(escapeAccountDetailUIBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EscapeAccountDetailUIBean.write$Self$OKWallet_wallet_impl(escapeAccountDetailUIBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
