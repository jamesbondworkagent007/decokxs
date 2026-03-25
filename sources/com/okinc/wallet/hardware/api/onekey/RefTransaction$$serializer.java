package com.okinc.wallet.hardware.api.onekey;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class RefTransaction$$serializer implements GeneratedSerializer<RefTransaction> {
    public static final int $stable;
    public static final RefTransaction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RefTransaction$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RefTransaction$$serializer refTransaction$$serializer = new RefTransaction$$serializer();
        INSTANCE = refTransaction$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.RefTransaction", refTransaction$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("hash", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("inputs", false);
        pluginGeneratedSerialDescriptor.addElement("bin_outputs", false);
        pluginGeneratedSerialDescriptor.addElement("outputs", true);
        pluginGeneratedSerialDescriptor.addElement("lock_time", false);
        pluginGeneratedSerialDescriptor.addElement("extra_data", true);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement("overwintered", true);
        pluginGeneratedSerialDescriptor.addElement("version_group_id", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("branch_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RefTransaction.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, longSerializer, kSerializerArr[2], kSerializerArr[3], BuiltinSerializersKt.getNullable(kSerializerArr[4]), longSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RefTransaction deserialize(@NotNull Decoder decoder) {
        Long l;
        String str;
        List list;
        List list2;
        Long l2;
        Boolean bool;
        int i;
        String str2;
        long j;
        long j2;
        Long l3;
        Long l4;
        List list3;
        List list4;
        List list5;
        List list6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RefTransaction.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        int i5 = 8;
        Long l5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            List list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            list = list9;
            l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            str2 = strDecodeStringElement;
            l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, longSerializer, null);
            bool = bool2;
            l = l6;
            str = str3;
            l4 = l7;
            list2 = list8;
            i = 4095;
            list3 = list7;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            int i6 = 11;
            int i7 = 0;
            Long l8 = null;
            Long l9 = null;
            Long l10 = null;
            List list10 = null;
            List list11 = null;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            boolean z = true;
            String str4 = null;
            List list12 = null;
            Boolean bool3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list4 = list10;
                        list5 = list11;
                        z = false;
                        list10 = list4;
                        list11 = list5;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 0:
                        list6 = list10;
                        i7 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 1:
                        list6 = list10;
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i7 |= 2;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 2:
                        list6 = list10;
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list11);
                        i7 |= 4;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 3:
                        i7 |= 8;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list10);
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 4:
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], list12);
                        i7 |= 16;
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i7 |= 32;
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 6:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str4);
                        i2 = i7 | 64;
                        i7 = i2;
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 7:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l5);
                        i2 = i7 | 128;
                        i7 = i2;
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 8:
                        i7 |= 256;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool3);
                        list4 = list10;
                        list5 = list11;
                        list10 = list4;
                        list11 = list5;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 9:
                        i7 |= 512;
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, l10);
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 10:
                        i7 |= 1024;
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, l9);
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    case 11:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, LongSerializer.INSTANCE, l8);
                        i7 |= 2048;
                        list6 = list10;
                        list10 = list6;
                        i3 = 7;
                        i4 = 6;
                        i5 = 8;
                        i6 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list13 = list10;
            List list14 = list11;
            l = l5;
            str = str4;
            list = list12;
            list2 = list13;
            l2 = l9;
            bool = bool3;
            i = i7;
            str2 = strDecodeStringElement2;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            l3 = l8;
            l4 = l10;
            list3 = list14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RefTransaction(i, str2, j, list3, list2, list, j2, str, l, bool, l4, l2, l3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RefTransaction refTransaction) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(refTransaction, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RefTransaction.write$Self$OKHardwareWallet_hardware_wallet_api(refTransaction, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
