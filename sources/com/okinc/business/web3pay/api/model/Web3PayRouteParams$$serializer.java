package com.okinc.business.web3pay.api.model;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class Web3PayRouteParams$$serializer implements GeneratedSerializer<Web3PayRouteParams> {
    public static final int $stable;
    public static final Web3PayRouteParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Web3PayRouteParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Web3PayRouteParams$$serializer web3PayRouteParams$$serializer = new Web3PayRouteParams$$serializer();
        INSTANCE = web3PayRouteParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.api.model.Web3PayRouteParams", web3PayRouteParams$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("targetType", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("transactionParams", true);
        pluginGeneratedSerialDescriptor.addElement("receiverOrClaimParams", true);
        pluginGeneratedSerialDescriptor.addElement("offshorePayFlow", true);
        pluginGeneratedSerialDescriptor.addElement("offshoreActivatePayFlowParams", true);
        pluginGeneratedSerialDescriptor.addElement("offshoreAddFundsFlowParams", true);
        pluginGeneratedSerialDescriptor.addElement("offshoreCovertToPayFlowParams", true);
        pluginGeneratedSerialDescriptor.addElement("offshorePayTabParams", true);
        pluginGeneratedSerialDescriptor.addElement("rewardsParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Web3PayRouteParams.$childSerializers[0], BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(TransactionParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ReceiverOrClaimParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OffshorePayFlowParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OffshoreActivatePayFlowParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OffshoreAddFundsFlowParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OffshoreCovertToPayParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OffshorePayTabParams$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RewardsParams$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Web3PayRouteParams deserialize(@NotNull Decoder decoder) {
        OffshoreCovertToPayParams offshoreCovertToPayParams;
        OffshorePayTabParams offshorePayTabParams;
        RewardsParams rewardsParams;
        TransactionParams transactionParams;
        OffshoreAddFundsFlowParams offshoreAddFundsFlowParams;
        ReceiverOrClaimParams receiverOrClaimParams;
        OffshorePayFlowParams offshorePayFlowParams;
        String str;
        OffshoreActivatePayFlowParams offshoreActivatePayFlowParams;
        JumpTargetType jumpTargetType;
        int i;
        String str2;
        OffshorePayFlowParams offshorePayFlowParams2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Web3PayRouteParams.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        OffshoreAddFundsFlowParams offshoreAddFundsFlowParams2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JumpTargetType jumpTargetType2 = (JumpTargetType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            TransactionParams transactionParams2 = (TransactionParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TransactionParams$$serializer.INSTANCE, null);
            ReceiverOrClaimParams receiverOrClaimParams2 = (ReceiverOrClaimParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ReceiverOrClaimParams$$serializer.INSTANCE, null);
            OffshorePayFlowParams offshorePayFlowParams3 = (OffshorePayFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OffshorePayFlowParams$$serializer.INSTANCE, null);
            OffshoreActivatePayFlowParams offshoreActivatePayFlowParams2 = (OffshoreActivatePayFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OffshoreActivatePayFlowParams$$serializer.INSTANCE, null);
            OffshoreAddFundsFlowParams offshoreAddFundsFlowParams3 = (OffshoreAddFundsFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, OffshoreAddFundsFlowParams$$serializer.INSTANCE, null);
            OffshoreCovertToPayParams offshoreCovertToPayParams2 = (OffshoreCovertToPayParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, OffshoreCovertToPayParams$$serializer.INSTANCE, null);
            OffshorePayTabParams offshorePayTabParams2 = (OffshorePayTabParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, OffshorePayTabParams$$serializer.INSTANCE, null);
            rewardsParams = (RewardsParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, RewardsParams$$serializer.INSTANCE, null);
            offshoreCovertToPayParams = offshoreCovertToPayParams2;
            offshoreAddFundsFlowParams = offshoreAddFundsFlowParams3;
            offshoreActivatePayFlowParams = offshoreActivatePayFlowParams2;
            receiverOrClaimParams = receiverOrClaimParams2;
            offshorePayTabParams = offshorePayTabParams2;
            offshorePayFlowParams = offshorePayFlowParams3;
            i = 1023;
            jumpTargetType = jumpTargetType2;
            transactionParams = transactionParams2;
            str = str3;
        } else {
            boolean z = true;
            int i6 = 0;
            OffshoreCovertToPayParams offshoreCovertToPayParams3 = null;
            OffshoreActivatePayFlowParams offshoreActivatePayFlowParams3 = null;
            OffshorePayTabParams offshorePayTabParams3 = null;
            RewardsParams rewardsParams2 = null;
            TransactionParams transactionParams3 = null;
            ReceiverOrClaimParams receiverOrClaimParams3 = null;
            String str4 = null;
            OffshorePayFlowParams offshorePayFlowParams4 = null;
            JumpTargetType jumpTargetType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        z = false;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 0:
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        jumpTargetType3 = (JumpTargetType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], jumpTargetType3);
                        i6 |= 1;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 1:
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str4);
                        i6 |= 2;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 2:
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        transactionParams3 = (TransactionParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, TransactionParams$$serializer.INSTANCE, transactionParams3);
                        i6 |= 4;
                        str2 = str4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 3:
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        receiverOrClaimParams3 = (ReceiverOrClaimParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ReceiverOrClaimParams$$serializer.INSTANCE, receiverOrClaimParams3);
                        i6 |= 8;
                        str2 = str4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 4:
                        offshorePayFlowParams2 = (OffshorePayFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OffshorePayFlowParams$$serializer.INSTANCE, offshorePayFlowParams4);
                        i6 |= 16;
                        str2 = str4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 5:
                        offshoreActivatePayFlowParams3 = (OffshoreActivatePayFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, OffshoreActivatePayFlowParams$$serializer.INSTANCE, offshoreActivatePayFlowParams3);
                        i6 |= 32;
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 6:
                        offshoreAddFundsFlowParams2 = (OffshoreAddFundsFlowParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, OffshoreAddFundsFlowParams$$serializer.INSTANCE, offshoreAddFundsFlowParams2);
                        i6 |= 64;
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 7:
                        offshoreCovertToPayParams3 = (OffshoreCovertToPayParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, OffshoreCovertToPayParams$$serializer.INSTANCE, offshoreCovertToPayParams3);
                        i6 |= 128;
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    case 8:
                        offshorePayTabParams3 = (OffshorePayTabParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, OffshorePayTabParams$$serializer.INSTANCE, offshorePayTabParams3);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        rewardsParams2 = (RewardsParams) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, RewardsParams$$serializer.INSTANCE, rewardsParams2);
                        str2 = str4;
                        offshorePayFlowParams2 = offshorePayFlowParams4;
                        offshorePayFlowParams4 = offshorePayFlowParams2;
                        str4 = str2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str5 = str4;
            offshoreCovertToPayParams = offshoreCovertToPayParams3;
            offshorePayTabParams = offshorePayTabParams3;
            rewardsParams = rewardsParams2;
            transactionParams = transactionParams3;
            offshoreAddFundsFlowParams = offshoreAddFundsFlowParams2;
            receiverOrClaimParams = receiverOrClaimParams3;
            offshorePayFlowParams = offshorePayFlowParams4;
            str = str5;
            offshoreActivatePayFlowParams = offshoreActivatePayFlowParams3;
            jumpTargetType = jumpTargetType3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Web3PayRouteParams(i, jumpTargetType, str, transactionParams, receiverOrClaimParams, offshorePayFlowParams, offshoreActivatePayFlowParams, offshoreAddFundsFlowParams, offshoreCovertToPayParams, offshorePayTabParams, rewardsParams, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Web3PayRouteParams web3PayRouteParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(web3PayRouteParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Web3PayRouteParams.EZpvd(web3PayRouteParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
