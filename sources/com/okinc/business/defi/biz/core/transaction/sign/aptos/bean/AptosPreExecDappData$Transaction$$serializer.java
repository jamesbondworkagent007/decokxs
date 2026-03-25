package com.okinc.business.defi.biz.core.transaction.sign.aptos.bean;

import com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class AptosPreExecDappData$Transaction$$serializer implements GeneratedSerializer<AptosPreExecDappData.Transaction> {
    public static final int $stable;
    public static final AptosPreExecDappData$Transaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AptosPreExecDappData$Transaction$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AptosPreExecDappData$Transaction$$serializer aptosPreExecDappData$Transaction$$serializer = new AptosPreExecDappData$Transaction$$serializer();
        INSTANCE = aptosPreExecDappData$Transaction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.sign.aptos.bean.AptosPreExecDappData.Transaction", aptosPreExecDappData$Transaction$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("tyArg", true);
        pluginGeneratedSerialDescriptor.addElement("fungibleAssetMetadataAddress", true);
        pluginGeneratedSerialDescriptor.addElement("publicKey", true);
        pluginGeneratedSerialDescriptor.addElement("sequenceNumber", true);
        pluginGeneratedSerialDescriptor.addElement("maxGasAmount", true);
        pluginGeneratedSerialDescriptor.addElement("gasUnitPrice", true);
        pluginGeneratedSerialDescriptor.addElement("expirationTimestampSecs", true);
        pluginGeneratedSerialDescriptor.addElement("additionalSigners", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AptosPreExecDappData.Transaction.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AptosPreExecDappData.Transaction deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AptosPreExecDappData.Transaction.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str2 = str12;
            str6 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement2;
            strDecodeStringElement = strDecodeStringElement3;
            str7 = str11;
            str = str9;
            str5 = str10;
            i = 511;
        } else {
            int i5 = 0;
            boolean z = true;
            String str13 = null;
            String str14 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            strDecodeStringElement = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str15;
                        z = false;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        str8 = str15;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str16);
                        i5 |= 1;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i5 |= 2;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        i5 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        i5 |= 8;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        i5 |= 32;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str13);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 6:
                        i5 |= 64;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 8:
                        i5 |= 256;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list2);
                        str8 = str15;
                        str15 = str8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str17 = str15;
            str = str16;
            str2 = str13;
            list = list2;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = str17;
            str6 = strDecodeStringElement6;
            str7 = str14;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AptosPreExecDappData.Transaction(i, str, str5, str7, str4, strDecodeStringElement, str2, str3, str6, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AptosPreExecDappData.Transaction transaction) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transaction, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AptosPreExecDappData.Transaction.write$Self$OKWallet_wallet_impl(transaction, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
