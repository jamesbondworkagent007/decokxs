package com.okinc.unify_trade.biz;

import java.util.ArrayList;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class OptionPnlReq$$serializer implements GeneratedSerializer<OptionPnlReq> {
    public static final int $stable;
    public static final OptionPnlReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OptionPnlReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OptionPnlReq$$serializer optionPnlReq$$serializer = new OptionPnlReq$$serializer();
        INSTANCE = optionPnlReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.OptionPnlReq", optionPnlReq$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("inclRealPos", false);
        pluginGeneratedSerialDescriptor.addElement("selectTime", true);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("riskUnit", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("chargeUnit", true);
        pluginGeneratedSerialDescriptor.addElement("indexPriceArr", true);
        pluginGeneratedSerialDescriptor.addElement("datumPointPrice", true);
        pluginGeneratedSerialDescriptor.addElement("simPos", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OptionPnlReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[6], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OptionPnlReq deserialize(@NotNull Decoder decoder) {
        String str;
        ArrayList arrayList;
        int i;
        String str2;
        ArrayList arrayList2;
        boolean z;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OptionPnlReq.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        int i4 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            ArrayList arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str = str11;
            str5 = str10;
            str3 = str8;
            str4 = str9;
            str2 = str7;
            arrayList = arrayList3;
            i = 511;
            l = l2;
            z = zDecodeBooleanElement;
        } else {
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String str12 = null;
            String str13 = null;
            ArrayList arrayList4 = null;
            String str14 = null;
            ArrayList arrayList5 = null;
            String str15 = null;
            Long l3 = null;
            String str16 = null;
            int i5 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str6 = str15;
                        z2 = false;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 0:
                        str6 = str15;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i5 |= 1;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 1:
                        str6 = str15;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l3);
                        i5 |= 2;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 2:
                        str6 = str15;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        i5 |= 4;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 3:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str15);
                        i5 |= 8;
                        str6 = str15;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 4:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str12);
                        i5 |= 16;
                        str6 = str15;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str13);
                        i5 |= 32;
                        str6 = str15;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 6:
                        arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, kSerializerArr[i4], arrayList4);
                        i5 |= 64;
                        break;
                    case 7:
                        String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str16);
                        i5 |= 128;
                        str6 = str15;
                        str16 = str17;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    case 8:
                        i5 |= 256;
                        arrayList5 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], arrayList5);
                        str6 = str15;
                        str15 = str6;
                        i2 = 7;
                        i3 = 5;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str16;
            arrayList = arrayList4;
            i = i5;
            str2 = str14;
            arrayList2 = arrayList5;
            z = zDecodeBooleanElement2;
            str3 = str15;
            l = l3;
            str4 = str12;
            str5 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OptionPnlReq(i, z, l, str2, str3, str4, str5, arrayList, str, arrayList2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OptionPnlReq optionPnlReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(optionPnlReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OptionPnlReq.write$Self$OKTradeCore_trade_core(optionPnlReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
