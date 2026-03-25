package com.okinc.wallet.hardware.api.onekey;

import com.engagelab.privates.push.constants.MTPushConstants;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class TxInputType$$serializer implements GeneratedSerializer<TxInputType> {
    public static final int $stable;
    public static final TxInputType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TxInputType$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TxInputType$$serializer txInputType$$serializer = new TxInputType$$serializer();
        INSTANCE = txInputType$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.TxInputType", txInputType$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("prev_hash", false);
        pluginGeneratedSerialDescriptor.addElement("prev_index", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_SEQUENCE, true);
        pluginGeneratedSerialDescriptor.addElement("multisig", true);
        pluginGeneratedSerialDescriptor.addElement("decred_tree", true);
        pluginGeneratedSerialDescriptor.addElement("orig_hash", true);
        pluginGeneratedSerialDescriptor.addElement("orig_index", true);
        pluginGeneratedSerialDescriptor.addElement("decred_staking_spend", true);
        pluginGeneratedSerialDescriptor.addElement("script_pubkey", true);
        pluginGeneratedSerialDescriptor.addElement("script_sig", true);
        pluginGeneratedSerialDescriptor.addElement("witness", true);
        pluginGeneratedSerialDescriptor.addElement("ownership_proof", true);
        pluginGeneratedSerialDescriptor.addElement("commitment_data", true);
        pluginGeneratedSerialDescriptor.addElement("address_n", true);
        pluginGeneratedSerialDescriptor.addElement("script_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TxInputType.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, longSerializer, stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(MultisigRedeemScriptType$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[14]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TxInputType deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        MultisigRedeemScriptType multisigRedeemScriptType;
        Long l2;
        Long l3;
        Long l4;
        String str8;
        String str9;
        int i;
        KSerializer[] kSerializerArr;
        String str10;
        long jDecodeLongElement;
        Long l5;
        String str11;
        Long l6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = TxInputType.$childSerializers;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            MultisigRedeemScriptType multisigRedeemScriptType2 = (MultisigRedeemScriptType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            l4 = l9;
            str = str14;
            str3 = str17;
            str4 = str13;
            l3 = l8;
            l2 = l7;
            str6 = str12;
            multisigRedeemScriptType = multisigRedeemScriptType2;
            str9 = strDecodeStringElement2;
            list = list3;
            i = 65535;
            j = jDecodeLongElement2;
            str8 = strDecodeStringElement;
            str2 = str16;
            str7 = str15;
        } else {
            long j2 = 0;
            int i3 = 0;
            boolean z = true;
            MultisigRedeemScriptType multisigRedeemScriptType3 = null;
            String str18 = null;
            Long l10 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Long l11 = null;
            String str22 = null;
            String str23 = null;
            String strDecodeStringElement3 = null;
            Long l12 = null;
            String str24 = null;
            Long l13 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l5 = l12;
                        str11 = str24;
                        z = false;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l5 = l12;
                        str11 = str24;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        l5 = l12;
                        str11 = str24;
                        jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l5 = l12;
                        str11 = str24;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l5 = l12;
                        str11 = str24;
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l13);
                        i3 |= 8;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l5 = l12;
                        multisigRedeemScriptType3 = (MultisigRedeemScriptType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, MultisigRedeemScriptType$$serializer.INSTANCE, multisigRedeemScriptType3);
                        str11 = str24;
                        i3 |= 16;
                        l12 = l5;
                        str24 = str11;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        str10 = str18;
                        jDecodeLongElement = j2;
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l11);
                        i3 |= 32;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        jDecodeLongElement = j2;
                        l6 = l12;
                        str10 = str18;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str24);
                        i3 |= 64;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr2;
                        jDecodeLongElement = j2;
                        l6 = l12;
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, l10);
                        i3 |= 128;
                        str10 = str18;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 8:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 256;
                        str10 = str18;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l12);
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 9:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 512;
                        str10 = str18;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str22);
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 10:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 1024;
                        str10 = str18;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str19);
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 11:
                        jDecodeLongElement = j2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str18);
                        i2 = i3 | 2048;
                        kSerializerArr = kSerializerArr2;
                        i3 = i2;
                        str10 = str18;
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 12:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 4096;
                        str10 = str18;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str20);
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 13:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        i3 |= 8192;
                        str10 = str18;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str21);
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 14:
                        jDecodeLongElement = j2;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr2[14], list2);
                        i2 = i3 | 16384;
                        kSerializerArr = kSerializerArr2;
                        i3 = i2;
                        str10 = str18;
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    case 15:
                        jDecodeLongElement = j2;
                        kSerializerArr = kSerializerArr2;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str23);
                        str10 = str18;
                        i3 = 32768 | i3;
                        l6 = l12;
                        l12 = l6;
                        str18 = str10;
                        kSerializerArr2 = kSerializerArr;
                        j2 = jDecodeLongElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            str = str19;
            str2 = str20;
            str3 = str21;
            l = l11;
            str4 = str22;
            str5 = str23;
            str6 = str24;
            str7 = str18;
            j = j2;
            multisigRedeemScriptType = multisigRedeemScriptType3;
            l2 = l13;
            l3 = l10;
            l4 = l12;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TxInputType(i, str8, j, str9, l2, multisigRedeemScriptType, l, str6, l3, l4, str4, str, str7, str2, str3, list, str5, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TxInputType txInputType) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(txInputType, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TxInputType.OLrzqt(txInputType, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
