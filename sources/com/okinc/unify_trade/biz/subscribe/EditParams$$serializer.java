package com.okinc.unify_trade.biz.subscribe;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class EditParams$$serializer implements GeneratedSerializer<EditParams> {
    public static final int $stable;
    public static final EditParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditParams$$serializer editParams$$serializer = new EditParams$$serializer();
        INSTANCE = editParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.subscribe.EditParams", editParams$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("currentCycleId", true);
        pluginGeneratedSerialDescriptor.addElement("pxSteps", true);
        pluginGeneratedSerialDescriptor.addElement("tpPct", true);
        pluginGeneratedSerialDescriptor.addElement("initOrdAmt", true);
        pluginGeneratedSerialDescriptor.addElement("safetyOrdAmt", true);
        pluginGeneratedSerialDescriptor.addElement("maxSafetyOrds", true);
        pluginGeneratedSerialDescriptor.addElement("reserveFunds", true);
        pluginGeneratedSerialDescriptor.addElement("triggerParams", true);
        pluginGeneratedSerialDescriptor.addElement("volMult", true);
        pluginGeneratedSerialDescriptor.addElement("pxStepsMult", true);
        pluginGeneratedSerialDescriptor.addElement("slPct", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EditParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditParams deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        KSerializer[] kSerializerArr;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = EditParams.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        int i5 = 7;
        String str14 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr2[7], null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            list = list2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str4 = str22;
            str6 = str20;
            str9 = str17;
            str2 = str21;
            str8 = str15;
            i = 2047;
            str10 = str18;
            str7 = str16;
            str5 = str19;
        } else {
            int i6 = 0;
            boolean z = true;
            String str23 = null;
            List list3 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        kSerializerArr2 = kSerializerArr2;
                        break;
                    case 0:
                        str11 = str29;
                        str12 = str31;
                        kSerializerArr = kSerializerArr2;
                        i6 |= 1;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str30);
                        str13 = str28;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 1:
                        str11 = str29;
                        str12 = str31;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str28);
                        i6 |= 2;
                        kSerializerArr = kSerializerArr2;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 2:
                        str11 = str29;
                        str12 = str31;
                        i6 |= 4;
                        kSerializerArr = kSerializerArr2;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str27);
                        str13 = str28;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 3:
                        str11 = str29;
                        str12 = str31;
                        i6 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str26);
                        str13 = str28;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 4:
                        str12 = str31;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str29);
                        i6 |= 16;
                        kSerializerArr = kSerializerArr2;
                        str13 = str28;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 5:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str31);
                        i6 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str13 = str28;
                        str11 = str29;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 6:
                        i6 |= 64;
                        kSerializerArr = kSerializerArr2;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str24);
                        str13 = str28;
                        str11 = str29;
                        str12 = str31;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr2[i5], list3);
                        str13 = str28;
                        str11 = str29;
                        str12 = str31;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr2;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str25);
                        str13 = str28;
                        str11 = str29;
                        str12 = str31;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 9:
                        i6 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str14);
                        str13 = str28;
                        str11 = str29;
                        str12 = str31;
                        kSerializerArr2 = kSerializerArr;
                        str31 = str12;
                        str29 = str11;
                        str28 = str13;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 10:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str23);
                        i6 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str32 = str28;
            str = str23;
            list = list3;
            str2 = str25;
            str3 = str27;
            str4 = str14;
            i = i6;
            str5 = str31;
            str6 = str24;
            str7 = str32;
            str8 = str30;
            str9 = str26;
            str10 = str29;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditParams(i, str8, str7, str3, str9, str10, str5, str6, list, str2, str4, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditParams editParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditParams.write$Self$OKTradeCore_trade_core(editParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
