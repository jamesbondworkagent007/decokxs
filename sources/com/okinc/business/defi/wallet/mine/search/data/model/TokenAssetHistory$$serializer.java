package com.okinc.business.defi.wallet.mine.search.data.model;

import com.okinc.localization2.bean.AppLocaleInfo;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class TokenAssetHistory$$serializer implements GeneratedSerializer<TokenAssetHistory> {
    public static final int $stable;
    public static final TokenAssetHistory$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenAssetHistory$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenAssetHistory$$serializer tokenAssetHistory$$serializer = new TokenAssetHistory$$serializer();
        INSTANCE = tokenAssetHistory$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("asset_token", tokenAssetHistory$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("metaId", false);
        pluginGeneratedSerialDescriptor.addElement("symbol", false);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("generalChainId", false);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("iconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenAssetHistory deserialize(@NotNull Decoder decoder) {
        long jDecodeLongElement;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str4 = str7;
            str5 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str6 = strDecodeStringElement3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            j = jDecodeLongElement2;
            str2 = strDecodeStringElement2;
            i = 255;
        } else {
            long jDecodeLongElement3 = 0;
            int i3 = 0;
            boolean z = true;
            String str8 = null;
            String strDecodeStringElement6 = null;
            String str9 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 7;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                        i3 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        i3 |= 64;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                        i2 = 7;
                        break;
                    case 7:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i3 |= 128;
                        i2 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            jDecodeLongElement = jDecodeLongElement3;
            str = str9;
            str2 = strDecodeStringElement8;
            i = i3;
            str3 = strDecodeStringElement;
            long j2 = jDecodeLongElement4;
            str4 = str8;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement7;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenAssetHistory(i, str2, str6, str3, j, str5, str4, str, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory.EZpvd(com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenAssetHistory tokenAssetHistory) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenAssetHistory, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenAssetHistory.EZpvd(tokenAssetHistory, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
