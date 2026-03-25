package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Choices$$serializer implements GeneratedSerializer<Choices> {
    public static final int $stable;
    public static final Choices$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Choices$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Choices$$serializer choices$$serializer = new Choices$$serializer();
        INSTANCE = choices$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.Choices", choices$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("search", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("values", true);
        pluginGeneratedSerialDescriptor.addElement(MetricsSQLiteCacheKt.METRICS_PARAMS, true);
        pluginGeneratedSerialDescriptor.addElement("uri", true);
        pluginGeneratedSerialDescriptor.addElement("isGroupedValueUri", true);
        pluginGeneratedSerialDescriptor.addElement("maxNumOfOptions", true);
        pluginGeneratedSerialDescriptor.addElement("groupedValues", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Choices.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[8])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Choices deserialize(@NotNull Decoder decoder) {
        List list;
        String str;
        Map map;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        List list2;
        int i;
        Boolean bool2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = Choices.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        int i5 = 8;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            bool = bool4;
            str2 = str9;
            i = 511;
            str = str8;
            str4 = str7;
            list = list4;
            bool2 = bool3;
            str3 = str6;
            map = map2;
        } else {
            int i6 = 0;
            boolean z = true;
            String str10 = null;
            Map map3 = null;
            String str11 = null;
            Boolean bool5 = null;
            String str12 = null;
            List list5 = null;
            List list6 = null;
            Boolean bool6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list3 = list6;
                        z = false;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 0:
                        list3 = list6;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 1;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 1:
                        list3 = list6;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                        i6 |= 2;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 2:
                        list3 = list6;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str12);
                        i6 |= 4;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 3:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list6);
                        i6 |= 8;
                        list3 = list6;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 4:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], map3);
                        i6 |= 16;
                        list3 = list6;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 5:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str10);
                        i6 |= 32;
                        list3 = list6;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool5);
                        i6 |= 64;
                        break;
                    case 7:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str11);
                        i6 |= 128;
                        list3 = list6;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    case 8:
                        i6 |= 256;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list5);
                        list3 = list6;
                        list6 = list3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool7 = bool6;
            list = list6;
            str = str10;
            map = map3;
            str2 = str11;
            bool = bool5;
            str3 = str5;
            str4 = str12;
            list2 = list5;
            i = i6;
            bool2 = bool7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Choices(i, bool2, str3, str4, list, map, str, bool, str2, list2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Choices choices) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(choices, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Choices.write$Self$OKCompliance_ok_compliance_impl(choices, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
