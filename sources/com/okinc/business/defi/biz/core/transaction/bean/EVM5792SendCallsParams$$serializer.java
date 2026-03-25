package com.okinc.business.defi.biz.core.transaction.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class EVM5792SendCallsParams$$serializer implements GeneratedSerializer<EVM5792SendCallsParams> {
    public static final int $stable;
    public static final EVM5792SendCallsParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EVM5792SendCallsParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EVM5792SendCallsParams$$serializer eVM5792SendCallsParams$$serializer = new EVM5792SendCallsParams$$serializer();
        INSTANCE = eVM5792SendCallsParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams", eVM5792SendCallsParams$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("atomicRequired", false);
        pluginGeneratedSerialDescriptor.addElement("calls", false);
        pluginGeneratedSerialDescriptor.addElement("capabilities", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = EVM5792SendCallsParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), kSerializerArr[5], BuiltinSerializersKt.getNullable(kSerializerArr[6])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EVM5792SendCallsParams deserialize(@NotNull Decoder decoder) {
        String str;
        Boolean bool;
        Map map;
        List list;
        String str2;
        int i;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EVM5792SendCallsParams.$childSerializers;
        int i2 = 3;
        int i3 = 4;
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            map = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            str2 = str8;
            bool = bool3;
            list = list2;
            str = str7;
            i = 127;
            str3 = str5;
            str4 = str6;
        } else {
            int i4 = 0;
            boolean z = true;
            String str9 = null;
            Map map2 = null;
            List list3 = null;
            String str10 = null;
            str = null;
            String str11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 0:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str11);
                        i4 |= 1;
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str9);
                        i4 |= 2;
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 2:
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str10);
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 4:
                        i4 |= 16;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool2);
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 5:
                        i4 |= 32;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list3);
                        i2 = 3;
                        i3 = 4;
                        break;
                    case 6:
                        i4 |= 64;
                        map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], map2);
                        i2 = 3;
                        i3 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str12 = str11;
            bool = bool2;
            map = map2;
            list = list3;
            str2 = str10;
            i = i4;
            str3 = str12;
            str4 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EVM5792SendCallsParams(i, str3, str4, str, str2, bool, list, map, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EVM5792SendCallsParams eVM5792SendCallsParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eVM5792SendCallsParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EVM5792SendCallsParams.write$Self$OKWallet_wallet_impl(eVM5792SendCallsParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
