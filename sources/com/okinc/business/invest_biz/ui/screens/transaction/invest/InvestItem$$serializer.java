package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestItem$$serializer implements GeneratedSerializer<InvestItem> {
    public static final int $stable;
    public static final InvestItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestItem$$serializer investItem$$serializer = new InvestItem$$serializer();
        INSTANCE = investItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem", investItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("leftTitle", true);
        pluginGeneratedSerialDescriptor.addElement("rightTitle", true);
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tvl", true);
        pluginGeneratedSerialDescriptor.addElement("investDetail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(TokenInvestDetail$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestItem deserialize(@NotNull Decoder decoder) {
        TokenInvestDetail tokenInvestDetail;
        int i;
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            tokenInvestDetail = (TokenInvestDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TokenInvestDetail$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement4;
            str = strDecodeStringElement5;
            i = 63;
            j = jDecodeLongElement;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement3;
        } else {
            int i2 = 0;
            boolean z = true;
            TokenInvestDetail tokenInvestDetail2 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        i2 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i2 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i2 |= 32;
                        tokenInvestDetail2 = (TokenInvestDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TokenInvestDetail$$serializer.INSTANCE, tokenInvestDetail2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            tokenInvestDetail = tokenInvestDetail2;
            String str5 = strDecodeStringElement;
            i = i2;
            long j2 = jDecodeLongElement2;
            str = str5;
            str2 = strDecodeStringElement6;
            j = j2;
            String str6 = strDecodeStringElement8;
            str3 = strDecodeStringElement7;
            str4 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestItem(i, str4, str3, j, str2, str, tokenInvestDetail, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestItem investItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestItem.copydefault(investItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
