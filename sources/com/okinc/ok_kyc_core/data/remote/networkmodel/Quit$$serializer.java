package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43772rvb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Quit$$serializer implements GeneratedSerializer<Quit> {
    public static final int $stable;
    public static final Quit$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Quit$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Quit$$serializer quit$$serializer = new Quit$$serializer();
        INSTANCE = quit$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.Quit", quit$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("shouldShow", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("iconState", true);
        pluginGeneratedSerialDescriptor.addElement("primaryLabel", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryLabel", true);
        pluginGeneratedSerialDescriptor.addElement("questionModule", true);
        pluginGeneratedSerialDescriptor.addElement("questionList", true);
        pluginGeneratedSerialDescriptor.addElement("primaryStyle", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryStyle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Quit.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(INSTANCE);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(kSerializerArr[7]);
        C43772rvb c43772rvb = C43772rvb.copydefault;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(c43772rvb), BuiltinSerializersKt.getNullable(c43772rvb)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Quit deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        String str;
        ButtonStyle buttonStyle;
        ButtonStyle buttonStyle2;
        String str2;
        String str3;
        String str4;
        Quit quit;
        String str5;
        Boolean bool;
        int i;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Quit.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        int i4 = 8;
        int i5 = 7;
        ButtonStyle buttonStyle3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Quit quit2 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, INSTANCE, null);
            ArrayList arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            C43772rvb c43772rvb = C43772rvb.copydefault;
            ButtonStyle buttonStyle4 = (ButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, c43772rvb, null);
            arrayList = arrayList2;
            buttonStyle2 = (ButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, c43772rvb, null);
            quit = quit2;
            str5 = str12;
            str2 = str10;
            buttonStyle = buttonStyle4;
            i = 1023;
            str = str9;
            str4 = str8;
            str3 = str11;
            bool = bool2;
        } else {
            int i6 = 0;
            boolean z = true;
            Quit quit3 = null;
            String str13 = null;
            ArrayList arrayList3 = null;
            String str14 = null;
            ButtonStyle buttonStyle5 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str6 = str16;
                        str7 = str17;
                        z = false;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 0:
                        str6 = str16;
                        str7 = str17;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool3);
                        i6 |= 1;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 1:
                        str7 = str17;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str16);
                        i6 |= 2;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 2:
                        str7 = str17;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        i6 |= 4;
                        str6 = str16;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 3:
                        str7 = str17;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str15);
                        i6 |= 8;
                        str6 = str16;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 4:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str17);
                        i6 |= 16;
                        str6 = str16;
                        str7 = str17;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str13);
                        i6 |= 32;
                        str6 = str16;
                        str7 = str17;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 6:
                        quit3 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, INSTANCE, quit3);
                        i6 |= 64;
                        str6 = str16;
                        str7 = str17;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 7:
                        arrayList3 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], arrayList3);
                        i6 |= 128;
                        str6 = str16;
                        str7 = str17;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 8:
                        buttonStyle5 = (ButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, C43772rvb.copydefault, buttonStyle5);
                        i6 |= 256;
                        break;
                    case 9:
                        i6 |= 512;
                        buttonStyle3 = (ButtonStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, C43772rvb.copydefault, buttonStyle3);
                        str6 = str16;
                        str7 = str17;
                        str17 = str7;
                        str16 = str6;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str18 = str16;
            arrayList = arrayList3;
            str = str14;
            buttonStyle = buttonStyle5;
            buttonStyle2 = buttonStyle3;
            str2 = str15;
            str3 = str17;
            str4 = str18;
            quit = quit3;
            str5 = str13;
            bool = bool3;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Quit(i, bool, str4, str, str2, str3, str5, quit, arrayList, buttonStyle, buttonStyle2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Quit quit) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(quit, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Quit.write$Self$OKCompliance_ok_compliance_impl(quit, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
