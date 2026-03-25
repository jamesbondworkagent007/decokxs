package com.okinc.wallet.hardware.api.onekey;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TxOutputType$$serializer implements GeneratedSerializer<TxOutputType> {
    public static final int $stable;
    public static final TxOutputType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TxOutputType$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TxOutputType$$serializer txOutputType$$serializer = new TxOutputType$$serializer();
        INSTANCE = txOutputType$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.TxOutputType", txOutputType$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("address_n", true);
        pluginGeneratedSerialDescriptor.addElement("script_type", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("multisig", true);
        pluginGeneratedSerialDescriptor.addElement("orig_hash", true);
        pluginGeneratedSerialDescriptor.addElement("orig_index", true);
        pluginGeneratedSerialDescriptor.addElement("payment_req_index", true);
        pluginGeneratedSerialDescriptor.addElement("op_return_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TxOutputType.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[1]), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(MultisigRedeemScriptType$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TxOutputType deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        Long l;
        String str2;
        Long l2;
        MultisigRedeemScriptType multisigRedeemScriptType;
        int i;
        String str3;
        List list;
        List list2;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TxOutputType.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        MultisigRedeemScriptType multisigRedeemScriptType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            MultisigRedeemScriptType multisigRedeemScriptType3 = (MultisigRedeemScriptType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            list = list3;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            l2 = l4;
            l = l3;
            str = str6;
            strDecodeStringElement2 = strDecodeStringElement4;
            multisigRedeemScriptType = multisigRedeemScriptType3;
            strDecodeStringElement = strDecodeStringElement3;
            str3 = str5;
            i = 511;
        } else {
            int i6 = 0;
            boolean z = true;
            String str7 = null;
            Long l5 = null;
            String str8 = null;
            Long l6 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            List list4 = null;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list2 = list4;
                        str4 = str9;
                        z = false;
                        str9 = str4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 0:
                        list2 = list4;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str9);
                        i6 |= 1;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 1:
                        i6 |= 2;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list4);
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        list2 = list4;
                        str4 = str9;
                        str9 = str4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        list2 = list4;
                        str4 = str9;
                        str9 = str4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 4:
                        multisigRedeemScriptType2 = (MultisigRedeemScriptType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, multisigRedeemScriptType2);
                        i6 |= 16;
                        list2 = list4;
                        str4 = str9;
                        str9 = str4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str7);
                        i6 |= 32;
                        break;
                    case 6:
                        i6 |= 64;
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l5);
                        list2 = list4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 7:
                        i6 |= 128;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l6);
                        list2 = list4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str8);
                        list2 = list4;
                        list4 = list2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list5 = list4;
            String str10 = str9;
            str = str7;
            l = l5;
            str2 = str8;
            l2 = l6;
            multisigRedeemScriptType = multisigRedeemScriptType2;
            i = i6;
            str3 = str10;
            list = list5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TxOutputType(i, str3, list, strDecodeStringElement, strDecodeStringElement2, multisigRedeemScriptType, str, l, l2, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TxOutputType txOutputType) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(txOutputType, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TxOutputType.write$Self$OKHardwareWallet_hardware_wallet_api(txOutputType, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
