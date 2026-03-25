package com.okinc.business.defi.biz.core.transaction.bean;

import com.okinc.business.defi.api.model.tx.SignAuthType;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class BatchBroadcastModel$$serializer implements GeneratedSerializer<BatchBroadcastModel> {
    public static final int $stable;
    public static final BatchBroadcastModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BatchBroadcastModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BatchBroadcastModel$$serializer batchBroadcastModel$$serializer = new BatchBroadcastModel$$serializer();
        INSTANCE = batchBroadcastModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel", batchBroadcastModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("txList", false);
        pluginGeneratedSerialDescriptor.addElement("bizId", true);
        pluginGeneratedSerialDescriptor.addElement("isBatch", true);
        pluginGeneratedSerialDescriptor.addElement("estTime", true);
        pluginGeneratedSerialDescriptor.addElement("isBtcMint", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("txType", true);
        pluginGeneratedSerialDescriptor.addElement("signAuthType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = BatchBroadcastModel.$childSerializers;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[1]);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BatchBroadcastModel deserialize(@NotNull Decoder decoder) {
        SignAuthType signAuthType;
        String str;
        Integer num;
        List list;
        Boolean bool;
        String str2;
        int i;
        Boolean bool2;
        List list2;
        List list3;
        List list4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = BatchBroadcastModel.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        int i5 = 4;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            signAuthType = (SignAuthType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            list = list5;
            str = str4;
            num = num2;
            str2 = str3;
            bool = bool5;
            bool2 = bool4;
            list2 = list6;
            i = 255;
        } else {
            int i6 = 0;
            boolean z = true;
            Boolean bool6 = null;
            SignAuthType signAuthType2 = null;
            String str5 = null;
            String str6 = null;
            Integer num3 = null;
            List list7 = null;
            List list8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list3 = list7;
                        list4 = list8;
                        z = false;
                        list8 = list4;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 0:
                        list3 = list7;
                        i6 |= 1;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], list8);
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 1:
                        i6 |= 2;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], list7);
                        list4 = list8;
                        list8 = list4;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 2:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool3);
                        i6 |= 4;
                        list3 = list7;
                        list4 = list8;
                        list8 = list4;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 3:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str5);
                        i6 |= 8;
                        list3 = list7;
                        list4 = list8;
                        list8 = list4;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 4:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 16;
                        break;
                    case 5:
                        i6 |= 32;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num3);
                        list3 = list7;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 6:
                        i6 |= 64;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str6);
                        list3 = list7;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    case 7:
                        i6 |= 128;
                        signAuthType2 = (SignAuthType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], signAuthType2);
                        list3 = list7;
                        list7 = list3;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 4;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list9 = list7;
            List list10 = list8;
            signAuthType = signAuthType2;
            str = str6;
            num = num3;
            list = list10;
            bool = bool6;
            str2 = str5;
            i = i6;
            bool2 = bool3;
            list2 = list9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BatchBroadcastModel(i, list, list2, bool2, str2, bool, num, str, signAuthType, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BatchBroadcastModel.write$Self$OKWallet_wallet_impl(batchBroadcastModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
