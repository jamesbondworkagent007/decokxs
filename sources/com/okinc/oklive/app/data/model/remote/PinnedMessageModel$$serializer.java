package com.okinc.oklive.app.data.model.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.oklive.app.data.model.remote.PinnedMessageModel;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class PinnedMessageModel$$serializer implements GeneratedSerializer<PinnedMessageModel> {
    public static final int $stable;
    public static final PinnedMessageModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PinnedMessageModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PinnedMessageModel$$serializer pinnedMessageModel$$serializer = new PinnedMessageModel$$serializer();
        INSTANCE = pinnedMessageModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.oklive.app.data.model.remote.PinnedMessageModel", pinnedMessageModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("seq", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.CHANNEL_ID, true);
        pluginGeneratedSerialDescriptor.addElement("contentType", true);
        pluginGeneratedSerialDescriptor.addElement("textMessage", true);
        pluginGeneratedSerialDescriptor.addElement("senderName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(PinnedMessageModel$TextMessage$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(PinnedMessageModel$SenderName$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PinnedMessageModel deserialize(@NotNull Decoder decoder) {
        int i;
        PinnedMessageModel.TextMessage textMessage;
        PinnedMessageModel.SenderName senderName;
        Integer num;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PinnedMessageModel.TextMessage textMessage2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            str = str4;
            textMessage = (PinnedMessageModel.TextMessage) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PinnedMessageModel$TextMessage$$serializer.INSTANCE, null);
            senderName = (PinnedMessageModel.SenderName) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PinnedMessageModel$SenderName$$serializer.INSTANCE, null);
            num = num2;
            str2 = str3;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            PinnedMessageModel.SenderName senderName2 = null;
            Integer num3 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    textMessage2 = (PinnedMessageModel.TextMessage) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PinnedMessageModel$TextMessage$$serializer.INSTANCE, textMessage2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    senderName2 = (PinnedMessageModel.SenderName) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PinnedMessageModel$SenderName$$serializer.INSTANCE, senderName2);
                    i2 |= 16;
                }
            }
            i = i2;
            textMessage = textMessage2;
            senderName = senderName2;
            num = num3;
            str = str5;
            str2 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PinnedMessageModel(i, str2, str, num, textMessage, senderName, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PinnedMessageModel pinnedMessageModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pinnedMessageModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PinnedMessageModel.write$Self$OKLive_oklive_impl(pinnedMessageModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
