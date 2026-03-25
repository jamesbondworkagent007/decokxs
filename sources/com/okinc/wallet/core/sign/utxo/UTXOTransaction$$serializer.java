package com.okinc.wallet.core.sign.utxo;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class UTXOTransaction$$serializer implements GeneratedSerializer<UTXOTransaction> {
    public static final int $stable;
    public static final UTXOTransaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UTXOTransaction$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UTXOTransaction$$serializer uTXOTransaction$$serializer = new UTXOTransaction$$serializer();
        INSTANCE = uTXOTransaction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.utxo.UTXOTransaction", uTXOTransaction$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("balance", false);
        pluginGeneratedSerialDescriptor.addElement("minOutput", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("fee", false);
        pluginGeneratedSerialDescriptor.addElement("txin", false);
        pluginGeneratedSerialDescriptor.addElement("publicKey", true);
        pluginGeneratedSerialDescriptor.addElement("changeAddress", true);
        pluginGeneratedSerialDescriptor.addElement("derivationPath", true);
        pluginGeneratedSerialDescriptor.addElement("masterFingerprint", true);
        pluginGeneratedSerialDescriptor.addElement("dummyInfo", true);
        pluginGeneratedSerialDescriptor.addElement("dustLimit", true);
        pluginGeneratedSerialDescriptor.addElement("changeAddressType", true);
        pluginGeneratedSerialDescriptor.addElement("token", true);
        pluginGeneratedSerialDescriptor.addElement("isRaise", true);
        pluginGeneratedSerialDescriptor.addElement("signatureList", true);
        pluginGeneratedSerialDescriptor.addElement("memo", true);
        pluginGeneratedSerialDescriptor.addElement("memoPos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = UTXOTransaction.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[6], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(DummyInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[16]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UTXOTransaction deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        Boolean bool;
        Integer num2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        DummyInfo dummyInfo;
        String strDecodeStringElement;
        String str8;
        List list;
        String str9;
        String str10;
        List list2;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2;
        int i3;
        DummyInfo dummyInfo2;
        String str15;
        String str16;
        String str17;
        KSerializer[] kSerializerArr;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = UTXOTransaction.$childSerializers;
        Integer num3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            DummyInfo dummyInfo3 = (DummyInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DummyInfo$$serializer.INSTANCE, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, intSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr2[16], null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            list2 = list5;
            str2 = str20;
            str = str19;
            str11 = strDecodeStringElement6;
            dummyInfo = dummyInfo3;
            str9 = str18;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, intSerializer, null);
            list = list4;
            str8 = strDecodeStringElement3;
            str4 = str22;
            str3 = str21;
            bool = bool2;
            str12 = strDecodeStringElement4;
            str7 = strDecodeStringElement2;
            str5 = str23;
            i = 524287;
            str6 = strDecodeStringElement5;
        } else {
            int i4 = 0;
            boolean z = true;
            DummyInfo dummyInfo4 = null;
            String str24 = null;
            String str25 = null;
            Integer num4 = null;
            List list6 = null;
            Boolean bool3 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String str30 = null;
            List list7 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        z = false;
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 0:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        i4 |= 1;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 1:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        i4 |= 2;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 2:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        i4 |= 4;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 3:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        i4 |= 8;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 4:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 5:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = list7;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 6:
                        dummyInfo2 = dummyInfo4;
                        str15 = str24;
                        str16 = str29;
                        str17 = str30;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list7);
                        i4 |= 64;
                        list7 = list3;
                        str29 = str16;
                        dummyInfo4 = dummyInfo2;
                        kSerializerArr2 = kSerializerArr;
                        str30 = str17;
                        str24 = str15;
                        break;
                    case 7:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str30);
                        i4 |= 128;
                        str29 = str29;
                        str24 = str24;
                        dummyInfo4 = dummyInfo4;
                        break;
                    case 8:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str29);
                        i4 |= 256;
                        str24 = str24;
                        break;
                    case 9:
                        str13 = str24;
                        str14 = str29;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str25);
                        i4 |= 512;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 10:
                        str13 = str24;
                        str14 = str29;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str26);
                        i4 |= 1024;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 11:
                        str13 = str24;
                        str14 = str29;
                        dummyInfo4 = (DummyInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DummyInfo$$serializer.INSTANCE, dummyInfo4);
                        i4 |= 2048;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 12:
                        str13 = str24;
                        str14 = str29;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str27);
                        i4 |= 4096;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 13:
                        str13 = str24;
                        str14 = str29;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num4);
                        i4 |= 8192;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 14:
                        str13 = str24;
                        str14 = str29;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str28);
                        i4 |= 16384;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 15:
                        str14 = str29;
                        str13 = str24;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool3);
                        i2 = 32768;
                        i4 |= i2;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 16:
                        str14 = str29;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr2[16], list6);
                        i2 = 65536;
                        str13 = str24;
                        i4 |= i2;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 17:
                        str14 = str29;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str24);
                        i3 = 131072;
                        i4 = i3 | i4;
                        str13 = str24;
                        str24 = str13;
                        str29 = str14;
                        break;
                    case 18:
                        str14 = str29;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, num3);
                        i3 = 262144;
                        i4 = i3 | i4;
                        str13 = str24;
                        str24 = str13;
                        str29 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str31 = str29;
            str = str25;
            num = num4;
            bool = bool3;
            num2 = num3;
            str2 = str26;
            str3 = str27;
            str4 = str28;
            str5 = str24;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement9;
            dummyInfo = dummyInfo4;
            strDecodeStringElement = strDecodeStringElement10;
            str8 = strDecodeStringElement12;
            list = list7;
            str9 = str31;
            str10 = str30;
            list2 = list6;
            i = i4;
            str11 = strDecodeStringElement8;
            str12 = strDecodeStringElement11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UTXOTransaction(i, str7, str8, str12, strDecodeStringElement, str6, str11, list, str10, str9, str, str2, dummyInfo, str3, num, str4, bool, list2, str5, num2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UTXOTransaction.write$Self$OKWalletCore_wallet_lib(uTXOTransaction, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
