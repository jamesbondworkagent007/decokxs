package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletApprovalRiskSubManager$SubResponse$$serializer implements GeneratedSerializer<WalletApprovalRiskSubManager.SubResponse> {
    public static final int $stable;
    public static final WalletApprovalRiskSubManager$SubResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletApprovalRiskSubManager$SubResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletApprovalRiskSubManager$SubResponse$$serializer walletApprovalRiskSubManager$SubResponse$$serializer = new WalletApprovalRiskSubManager$SubResponse$$serializer();
        INSTANCE = walletApprovalRiskSubManager$SubResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager.SubResponse", walletApprovalRiskSubManager$SubResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, false);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletApprovalRiskSubManager.SubResponse deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        Integer num;
        WalletApprovalRiskSubManager.SubResponse.ApproveRiskData approveRiskData;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, null);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            num = num2;
            approveRiskData = (WalletApprovalRiskSubManager.SubResponse.ApproveRiskData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer.INSTANCE, null);
            str = str3;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            Integer num3 = null;
            WalletApprovalRiskSubManager.SubResponse.ApproveRiskData approveRiskData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    approveRiskData2 = (WalletApprovalRiskSubManager.SubResponse.ApproveRiskData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer.INSTANCE, approveRiskData2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            num = num3;
            approveRiskData = approveRiskData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletApprovalRiskSubManager.SubResponse(i, num, str, approveRiskData, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletApprovalRiskSubManager.SubResponse subResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletApprovalRiskSubManager.SubResponse.write$Self$OKWallet_wallet_impl(subResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
