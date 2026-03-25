package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer implements GeneratedSerializer<WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account> {
    public static final int $stable;
    public static final WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer walletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer = new WalletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer();
        INSTANCE = walletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account", walletEvent$ConnectSuccess$Payload$Response$Accounts$Account$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("namespace", false);
        pluginGeneratedSerialDescriptor.addElement("addresses", false);
        pluginGeneratedSerialDescriptor.addElement("methods", false);
        pluginGeneratedSerialDescriptor.addElement("data", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        Map map;
        Map map2;
        List list2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.$childSerializers;
        List list3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            Map map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            str = strDecodeStringElement;
            list2 = list4;
            map2 = map3;
            i = 31;
            list = list5;
        } else {
            int i2 = 0;
            boolean z = true;
            Map map4 = null;
            Map map5 = null;
            List list6 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    i2 |= 2;
                    list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list6);
                } else if (iDecodeElementIndex == 2) {
                    i2 |= 4;
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list3);
                } else if (iDecodeElementIndex == 3) {
                    i2 |= 8;
                    map5 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], map5);
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i2 |= 16;
                    map4 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], map4);
                }
            }
            i = i2;
            list = list3;
            map = map4;
            map2 = map5;
            list2 = list6;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account(i, str, list2, list, map2, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account account) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(account, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account.write$Self$OKWallet_wallet_impl(account, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
