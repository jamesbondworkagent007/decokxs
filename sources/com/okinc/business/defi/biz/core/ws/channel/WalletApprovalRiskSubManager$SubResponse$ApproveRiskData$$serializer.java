package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer implements GeneratedSerializer<WalletApprovalRiskSubManager.SubResponse.ApproveRiskData> {
    public static final int $stable;
    public static final WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer walletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer = new WalletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer();
        INSTANCE = walletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager.SubResponse.ApproveRiskData", walletApprovalRiskSubManager$SubResponse$ApproveRiskData$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("approvalAddressRiskyFlag", true);
        pluginGeneratedSerialDescriptor.addElement("approvalAddressRiskyTimeStamp", true);
        pluginGeneratedSerialDescriptor.addElement("longTimeNoActiveFlag", true);
        pluginGeneratedSerialDescriptor.addElement("longTimeNoActiveFlagTimeStamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(booleanSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletApprovalRiskSubManager.SubResponse.ApproveRiskData deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        Long l;
        Long l2;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            i = 15;
            bool2 = bool4;
            l2 = l3;
        } else {
            int i2 = 0;
            boolean z = true;
            Long l4 = null;
            Long l5 = null;
            Boolean bool5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l4);
                    i2 |= 8;
                }
            }
            i = i2;
            bool = bool3;
            l = l4;
            l2 = l5;
            bool2 = bool5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletApprovalRiskSubManager.SubResponse.ApproveRiskData(i, bool2, l2, bool, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletApprovalRiskSubManager.SubResponse.ApproveRiskData approveRiskData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(approveRiskData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletApprovalRiskSubManager.SubResponse.ApproveRiskData.write$Self$OKWallet_wallet_impl(approveRiskData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
