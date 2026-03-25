package com.okinc.business.dex.trade.core.domain.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class PriorityFee$$serializer implements GeneratedSerializer<PriorityFee> {
    public static final int $stable;
    public static final PriorityFee$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PriorityFee$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PriorityFee$$serializer priorityFee$$serializer = new PriorityFee$$serializer();
        INSTANCE = priorityFee$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.PriorityFee", priorityFee$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_BASE, true);
        pluginGeneratedSerialDescriptor.addElement("fastPriority", true);
        pluginGeneratedSerialDescriptor.addElement("marketPriority", true);
        pluginGeneratedSerialDescriptor.addElement("turboPriority", true);
        pluginGeneratedSerialDescriptor.addElement("isDefault", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        FeeInfo$$serializer feeInfo$$serializer = FeeInfo$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(feeInfo$$serializer), BuiltinSerializersKt.getNullable(feeInfo$$serializer), BuiltinSerializersKt.getNullable(feeInfo$$serializer), BuiltinSerializersKt.getNullable(feeInfo$$serializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PriorityFee deserialize(@NotNull Decoder decoder) {
        FeeInfo feeInfo;
        String str;
        FeeInfo feeInfo2;
        FeeInfo feeInfo3;
        int i;
        Boolean bool;
        FeeInfo feeInfo4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        FeeInfo feeInfo5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FeeInfo$$serializer feeInfo$$serializer = FeeInfo$$serializer.INSTANCE;
            FeeInfo feeInfo6 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, feeInfo$$serializer, null);
            FeeInfo feeInfo7 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, feeInfo$$serializer, null);
            FeeInfo feeInfo8 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, feeInfo$$serializer, null);
            FeeInfo feeInfo9 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, feeInfo$$serializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, null);
            feeInfo3 = feeInfo9;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            bool = bool2;
            i = 63;
            feeInfo = feeInfo8;
            feeInfo4 = feeInfo6;
            feeInfo2 = feeInfo7;
        } else {
            int i3 = 0;
            boolean z2 = true;
            Boolean bool3 = null;
            String str2 = null;
            feeInfo = null;
            FeeInfo feeInfo10 = null;
            FeeInfo feeInfo11 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        feeInfo11 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, FeeInfo$$serializer.INSTANCE, feeInfo11);
                        i2 = 5;
                        break;
                    case 1:
                        i3 |= 2;
                        feeInfo10 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FeeInfo$$serializer.INSTANCE, feeInfo10);
                        break;
                    case 2:
                        i3 |= 4;
                        feeInfo = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FeeInfo$$serializer.INSTANCE, feeInfo);
                        break;
                    case 3:
                        i3 |= 8;
                        feeInfo5 = (FeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FeeInfo$$serializer.INSTANCE, feeInfo5);
                        break;
                    case 4:
                        i3 |= 16;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool3);
                        break;
                    case 5:
                        i3 |= 32;
                        str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str2;
            feeInfo2 = feeInfo10;
            feeInfo3 = feeInfo5;
            i = i3;
            FeeInfo feeInfo12 = feeInfo11;
            bool = bool3;
            feeInfo4 = feeInfo12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PriorityFee(i, feeInfo4, feeInfo2, feeInfo, feeInfo3, bool, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PriorityFee priorityFee) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(priorityFee, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PriorityFee.write$Self$OKDex_dex_impl(priorityFee, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
