package com.okinc.business.web3pay.lib.features.convert.model;

import com.okinc.business.web3pay.lib.features.convert.model.CurrencyList;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CurrencyList$Currency$$serializer implements GeneratedSerializer<CurrencyList.Currency> {
    public static final int $stable;
    public static final CurrencyList$Currency$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyList$Currency$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyList$Currency$$serializer currencyList$Currency$$serializer = new CurrencyList$Currency$$serializer();
        INSTANCE = currencyList$Currency$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Currency", currencyList$Currency$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("underMaintenance", false);
        pluginGeneratedSerialDescriptor.addElement("chains", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CurrencyList.Currency.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BooleanSerializer.INSTANCE, kSerializerArr[8]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyList.Currency deserialize(@NotNull Decoder decoder) {
        boolean z;
        List list;
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CurrencyList.Currency.$childSerializers;
        int i3 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str3 = strDecodeStringElement2;
            z = zDecodeBooleanElement;
            str = strDecodeStringElement6;
            str2 = str7;
            str5 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str6 = strDecodeStringElement3;
            i2 = 511;
            i = iDecodeIntElement;
        } else {
            String str8 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean zDecodeBooleanElement2 = false;
            int i4 = 0;
            int iDecodeIntElement2 = 0;
            boolean z2 = true;
            List list2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 = 7;
                        break;
                    case 4:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i3 = 7;
                        break;
                    case 5:
                        i4 |= 32;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str8);
                        i3 = 7;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = 7;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 128;
                        i3 = 7;
                        break;
                    case 8:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list2);
                        i4 |= 256;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            list = list2;
            str = strDecodeStringElement7;
            i = iDecodeIntElement2;
            str2 = str8;
            i2 = i4;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement;
            String str9 = strDecodeStringElement9;
            str5 = strDecodeStringElement8;
            str6 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyList.Currency(i2, str3, i, str6, str5, str4, str2, str, z, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyList.Currency currency) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(currency, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyList.Currency.write$Self$OKPayCore_web3pay_lib(currency, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
