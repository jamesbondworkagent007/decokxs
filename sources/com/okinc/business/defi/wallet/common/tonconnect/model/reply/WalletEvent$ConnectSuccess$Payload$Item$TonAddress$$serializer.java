package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

import com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork;
import com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletEvent;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Item.TonAddress> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    public final /* synthetic */ class ActionBar implements JsonClassDiscriminator {
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.annotation.Annotation
        public final /* synthetic */ Class annotationType() {
            return JsonClassDiscriminator.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlinx.serialization.json.JsonClassDiscriminator
        public final /* synthetic */ String discriminator() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            return (obj instanceof JsonClassDiscriminator) && Intrinsics.EZpvd((Object) discriminator(), (Object) ((JsonClassDiscriminator) obj).discriminator());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return this.copydefault.hashCode() ^ 707790692;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.copydefault + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer walletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer = new WalletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ton_addr", walletEvent$ConnectSuccess$Payload$Item$TonAddress$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("network", false);
        pluginGeneratedSerialDescriptor.addElement("walletStateInit", false);
        pluginGeneratedSerialDescriptor.addElement("publicKey", false);
        pluginGeneratedSerialDescriptor.pushClassAnnotation(new ActionBar("name"));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = WalletEvent.ConnectSuccess.Payload.Item.TonAddress.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Item.TonAddress deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String strDecodeStringElement;
        TonNetwork tonNetwork;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WalletEvent.ConnectSuccess.Payload.Item.TonAddress.$childSerializers;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            TonNetwork tonNetwork2 = (TonNetwork) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            tonNetwork = tonNetwork2;
            str2 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            str = strDecodeStringElement4;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement5 = null;
            TonNetwork tonNetwork3 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    tonNetwork3 = (TonNetwork) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], tonNetwork3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement5;
            tonNetwork = tonNetwork3;
            str2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Item.TonAddress(i, str2, tonNetwork, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Item.TonAddress tonAddress) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tonAddress, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Item.TonAddress.write$Self$OKWallet_wallet_impl(tonAddress, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
