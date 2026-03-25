package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletPnlSubManager$SubResponse$PnlPushData$$serializer implements GeneratedSerializer<WalletPnlSubManager.SubResponse.PnlPushData> {
    public static final int $stable;
    public static final WalletPnlSubManager$SubResponse$PnlPushData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletPnlSubManager$SubResponse$PnlPushData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletPnlSubManager$SubResponse$PnlPushData$$serializer walletPnlSubManager$SubResponse$PnlPushData$$serializer = new WalletPnlSubManager$SubResponse$PnlPushData$$serializer();
        INSTANCE = walletPnlSubManager$SubResponse$PnlPushData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager.SubResponse.PnlPushData", walletPnlSubManager$SubResponse$PnlPushData$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("spotBalance", true);
        pluginGeneratedSerialDescriptor.addElement("holdAvgPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletPnlSubManager.SubResponse.PnlPushData deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            l = l2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            str3 = str7;
            i = 31;
            str4 = str6;
        } else {
            int i2 = 0;
            boolean z = true;
            String str8 = null;
            String str9 = null;
            Long l3 = null;
            String str10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str10);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str9);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str8);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            str2 = str8;
            str3 = str9;
            l = l3;
            str4 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletPnlSubManager.SubResponse.PnlPushData(i, l, str4, str3, str, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletPnlSubManager.SubResponse.PnlPushData pnlPushData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pnlPushData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletPnlSubManager.SubResponse.PnlPushData.write$Self$OKWallet_wallet_impl(pnlPushData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
