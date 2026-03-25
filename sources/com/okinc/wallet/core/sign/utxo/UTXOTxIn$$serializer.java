package com.okinc.wallet.core.sign.utxo;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class UTXOTxIn$$serializer implements GeneratedSerializer<UTXOTxIn> {
    public static final int $stable;
    public static final UTXOTxIn$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UTXOTxIn$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UTXOTxIn$$serializer uTXOTxIn$$serializer = new UTXOTxIn$$serializer();
        INSTANCE = uTXOTxIn$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.utxo.UTXOTxIn", uTXOTxIn$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("tx_id", true);
        pluginGeneratedSerialDescriptor.addElement("index", true);
        pluginGeneratedSerialDescriptor.addElement("coin_amount", true);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.Operation.KEY_SEQUENCE, true);
        pluginGeneratedSerialDescriptor.addElement("rawTransaction", true);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("addressType", true);
        pluginGeneratedSerialDescriptor.addElement("addressIndex", true);
        pluginGeneratedSerialDescriptor.addElement("nftInfos", true);
        pluginGeneratedSerialDescriptor.addElement("isNFT", true);
        pluginGeneratedSerialDescriptor.addElement("isDummy", true);
        pluginGeneratedSerialDescriptor.addElement("masterFingerprint", true);
        pluginGeneratedSerialDescriptor.addElement("publicKey", true);
        pluginGeneratedSerialDescriptor.addElement("derivationPath", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = UTXOTxIn.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UTXOTxIn deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        String str3;
        Boolean bool;
        Boolean bool2;
        String str4;
        String str5;
        String strDecodeStringElement;
        String str6;
        String str7;
        Integer num2;
        String str8;
        List list;
        int i;
        KSerializer[] kSerializerArr;
        Integer num3;
        String str9;
        String str10;
        Integer num4;
        String str11;
        String str12;
        Integer num5;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = UTXOTxIn.$childSerializers;
        int i4 = 9;
        int i5 = 8;
        Integer num6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr2[8], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            bool = bool4;
            num2 = num8;
            bool2 = bool3;
            str5 = str16;
            num = num7;
            str8 = str13;
            list = list2;
            str7 = strDecodeStringElement2;
            str3 = str15;
            i = 16383;
            str2 = str14;
            str6 = strDecodeStringElement3;
        } else {
            int i6 = 13;
            boolean z = true;
            String str17 = null;
            String str18 = null;
            List list3 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str19 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            Integer num9 = null;
            String str20 = null;
            String strDecodeStringElement6 = null;
            String str21 = null;
            int i7 = 0;
            String str22 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        num3 = num9;
                        str9 = str20;
                        str10 = str21;
                        z = false;
                        num9 = num3;
                        str21 = str10;
                        str20 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        num4 = num9;
                        str11 = str20;
                        str12 = str21;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        str20 = str11;
                        num9 = num4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        num3 = num9;
                        str9 = str20;
                        str10 = str21;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        num9 = num3;
                        str21 = str10;
                        str20 = str9;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        num4 = num9;
                        str11 = str20;
                        str12 = str21;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        str20 = str11;
                        num9 = num4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 3:
                        num4 = num9;
                        str12 = str21;
                        kSerializerArr = kSerializerArr2;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str20);
                        i7 |= 8;
                        num9 = num4;
                        str21 = str12;
                        kSerializerArr2 = kSerializerArr;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 4:
                        num5 = num9;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str21);
                        i7 |= 16;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 5:
                        num5 = num9;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str18);
                        i2 = i7 | 32;
                        i7 = i2;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 6:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num9);
                        i2 = i7 | 64;
                        i7 = i2;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 7:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num6);
                        i3 = i7 | 128;
                        i7 = i3;
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 8:
                        i7 |= 256;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], list3);
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 9:
                        i7 |= 512;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool6);
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 10:
                        i7 |= 1024;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool5);
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 11:
                        i7 |= 2048;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str22);
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 12:
                        i7 |= 4096;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str19);
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    case 13:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str17);
                        i3 = i7 | 8192;
                        i7 = i3;
                        num5 = num9;
                        num9 = num5;
                        i6 = 13;
                        i5 = 8;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str17;
            num = num9;
            str2 = str21;
            str3 = str18;
            bool = bool5;
            bool2 = bool6;
            str4 = str19;
            str5 = str22;
            strDecodeStringElement = strDecodeStringElement4;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement6;
            num2 = num6;
            str8 = str20;
            list = list3;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UTXOTxIn(i, str7, str6, strDecodeStringElement, str8, str2, str3, num, num2, list, bool2, bool, str5, str4, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UTXOTxIn uTXOTxIn) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXOTxIn, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UTXOTxIn.write$Self$OKWalletCore_wallet_lib(uTXOTxIn, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
