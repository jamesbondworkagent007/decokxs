package com.okinc.business.invest_biz.data.bean.request;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class InvestUniv3RedeemInitialReq$$serializer implements GeneratedSerializer<InvestUniv3RedeemInitialReq> {
    public static final int $stable;
    public static final InvestUniv3RedeemInitialReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUniv3RedeemInitialReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUniv3RedeemInitialReq$$serializer investUniv3RedeemInitialReq$$serializer = new InvestUniv3RedeemInitialReq$$serializer();
        INSTANCE = investUniv3RedeemInitialReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.request.InvestUniv3RedeemInitialReq", investUniv3RedeemInitialReq$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("investmentId", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("outputTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("isSingle", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", false);
        pluginGeneratedSerialDescriptor.addElement("openZap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUniv3RedeemInitialReq deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        long j;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            str2 = strDecodeStringElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            z = zDecodeBooleanElement2;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement2;
            j = jDecodeLongElement;
            i = 63;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i3 = 0;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = i3 | 2;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = i3 | 4;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        break;
                    case 5:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i2 = i3 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i3 = i2;
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            i = i3;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement4;
            long j2 = jDecodeLongElement2;
            z = zDecodeBooleanElement4;
            str3 = strDecodeStringElement5;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUniv3RedeemInitialReq(i, j, str2, str, z, str3, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUniv3RedeemInitialReq investUniv3RedeemInitialReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUniv3RedeemInitialReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUniv3RedeemInitialReq.write$Self$OKDeFi_invest_biz(investUniv3RedeemInitialReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
