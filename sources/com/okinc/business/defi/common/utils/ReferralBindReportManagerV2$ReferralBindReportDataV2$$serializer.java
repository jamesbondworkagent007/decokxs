package com.okinc.business.defi.common.utils;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.business.defi.common.utils.ReferralBindReportManagerV2;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.Map;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer implements GeneratedSerializer<ReferralBindReportManagerV2.ReferralBindReportDataV2> {
    public static final int $stable;
    public static final ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer referralBindReportManagerV2$ReferralBindReportDataV2$$serializer = new ReferralBindReportManagerV2$ReferralBindReportDataV2$$serializer();
        INSTANCE = referralBindReportManagerV2$ReferralBindReportDataV2$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.common.utils.ReferralBindReportManagerV2.ReferralBindReportDataV2", referralBindReportManagerV2$ReferralBindReportDataV2$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("signMsg", false);
        pluginGeneratedSerialDescriptor.addElement("signature", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("walletType", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement(RequestParameters.X_OSS_RESTORE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ReferralBindReportManagerV2.ReferralBindReportDataV2.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], stringSerializer, stringSerializer, LongSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ReferralBindReportManagerV2.ReferralBindReportDataV2 deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        long j;
        int iDecodeIntElement;
        Map map;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ReferralBindReportManagerV2.ReferralBindReportDataV2.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            map = map2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            str2 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            j = jDecodeLongElement;
            str = strDecodeStringElement;
            str4 = strDecodeStringElement2;
            i = 511;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            Map map3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], map3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i2 = i4 | 64;
                        i4 = i2;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i2 = i4 | 128;
                        i4 = i2;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 = i4 | 256;
                        i4 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            j = jDecodeLongElement2;
            iDecodeIntElement = iDecodeIntElement2;
            String str6 = strDecodeStringElement6;
            map = map3;
            i = i4;
            str = strDecodeStringElement8;
            str2 = str6;
            String str7 = strDecodeStringElement10;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement7;
            str5 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReferralBindReportManagerV2.ReferralBindReportDataV2(i, str, str4, str3, map, str5, str2, j, iDecodeIntElement, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ReferralBindReportManagerV2.ReferralBindReportDataV2 referralBindReportDataV2) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(referralBindReportDataV2, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReferralBindReportManagerV2.ReferralBindReportDataV2.write$Self$OKWallet_wallet_impl(referralBindReportDataV2, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
