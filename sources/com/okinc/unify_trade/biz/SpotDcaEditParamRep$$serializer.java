package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class SpotDcaEditParamRep$$serializer implements GeneratedSerializer<SpotDcaEditParamRep> {
    public static final int $stable;
    public static final SpotDcaEditParamRep$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SpotDcaEditParamRep$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotDcaEditParamRep$$serializer spotDcaEditParamRep$$serializer = new SpotDcaEditParamRep$$serializer();
        INSTANCE = spotDcaEditParamRep$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SpotDcaEditParamRep", spotDcaEditParamRep$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("algoId", true);
        pluginGeneratedSerialDescriptor.addElement("currentCycleId", true);
        pluginGeneratedSerialDescriptor.addElement("pxSteps", true);
        pluginGeneratedSerialDescriptor.addElement("tpPct", true);
        pluginGeneratedSerialDescriptor.addElement("initOrdAmt", false);
        pluginGeneratedSerialDescriptor.addElement("safetyOrdAmt", false);
        pluginGeneratedSerialDescriptor.addElement("maxSafetyOrds", false);
        pluginGeneratedSerialDescriptor.addElement("reserveFunds", false);
        pluginGeneratedSerialDescriptor.addElement("triggerParams", true);
        pluginGeneratedSerialDescriptor.addElement("volMult", true);
        pluginGeneratedSerialDescriptor.addElement("pxStepsMult", true);
        pluginGeneratedSerialDescriptor.addElement("slPct", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SpotDcaEditParamRep.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(kSerializerArr[8]), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotDcaEditParamRep deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String strDecodeStringElement2;
        String str6;
        List list;
        String strDecodeStringElement3;
        String str7;
        int i2;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SpotDcaEditParamRep.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        String strDecodeStringElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            i = 4095;
            list = list2;
            str6 = str10;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            str4 = strDecodeStringElement7;
            str7 = strDecodeStringElement5;
            str = str9;
        } else {
            int i6 = 11;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            i = 0;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str11;
                        z2 = false;
                        str11 = str8;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 0:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str12);
                        i |= 1;
                        str8 = str11;
                        str11 = str8;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str11);
                        i |= 2;
                        str11 = str8;
                        i6 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        break;
                    case 2:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i2 = i | 128;
                        i = i2;
                        break;
                    case 8:
                        i |= 256;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], list3);
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 10:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 = i | 1024;
                        i = i2;
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str13 = str11;
            str = str12;
            strDecodeStringElement = strDecodeStringElement10;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            z = zDecodeBooleanElement2;
            strDecodeStringElement2 = strDecodeStringElement4;
            str6 = str13;
            list = list3;
            String str14 = strDecodeStringElement16;
            strDecodeStringElement3 = strDecodeStringElement11;
            str7 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SpotDcaEditParamRep(i, str, str6, str7, str5, str4, str3, str2, z, list, strDecodeStringElement3, strDecodeStringElement2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SpotDcaEditParamRep spotDcaEditParamRep) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(spotDcaEditParamRep, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SpotDcaEditParamRep.write$Self$OKTradeCore_trade_core(spotDcaEditParamRep, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
