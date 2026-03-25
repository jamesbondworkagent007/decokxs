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
public final /* synthetic */ class DeFiAssetHistory$$serializer implements GeneratedSerializer<DeFiAssetHistory> {
    public static final int $stable;
    public static final DeFiAssetHistory$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DeFiAssetHistory$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DeFiAssetHistory$$serializer deFiAssetHistory$$serializer = new DeFiAssetHistory$$serializer();
        INSTANCE = deFiAssetHistory$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("asset_defi", deFiAssetHistory$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("platformId", false);
        pluginGeneratedSerialDescriptor.addElement("platformName", false);
        pluginGeneratedSerialDescriptor.addElement("metaId", false);
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
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, stringSerializer, stringSerializer, stringSerializer, longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DeFiAssetHistory deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        long jDecodeLongElement;
        String str5;
        String str6;
        long j;
        long j2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str2 = str7;
            str = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            str5 = strDecodeStringElement3;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement2;
            str6 = strDecodeStringElement2;
            i = 511;
        } else {
            long jDecodeLongElement4 = 0;
            String strDecodeStringElement6 = null;
            String str8 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z = true;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            int i4 = 0;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 = i4 | 16;
                        i4 = i2;
                        break;
                    case 5:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i4 | 32;
                        i4 = i2;
                        break;
                    case 6:
                        i4 |= 64;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str9);
                        break;
                    case 7:
                        i4 |= 128;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str8);
                        break;
                    case 8:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i2 = i4 | 256;
                        i4 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            long j3 = jDecodeLongElement5;
            str = strDecodeStringElement6;
            str2 = str9;
            i = i4;
            String str10 = strDecodeStringElement7;
            str3 = strDecodeStringElement;
            long j4 = jDecodeLongElement6;
            str4 = str8;
            jDecodeLongElement = jDecodeLongElement4;
            str5 = str10;
            str6 = strDecodeStringElement8;
            j = j3;
            j2 = j4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DeFiAssetHistory(i, j2, str6, str5, str3, j, str, str2, str4, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory.copydefault(com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DeFiAssetHistory deFiAssetHistory) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(deFiAssetHistory, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DeFiAssetHistory.copydefault(deFiAssetHistory, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
