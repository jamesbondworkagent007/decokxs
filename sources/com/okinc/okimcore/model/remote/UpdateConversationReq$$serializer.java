package com.okinc.okimcore.model.remote;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
public final /* synthetic */ class UpdateConversationReq$$serializer implements GeneratedSerializer<UpdateConversationReq> {
    public static final int $stable;
    public static final UpdateConversationReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UpdateConversationReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UpdateConversationReq$$serializer updateConversationReq$$serializer = new UpdateConversationReq$$serializer();
        INSTANCE = updateConversationReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.UpdateConversationReq", updateConversationReq$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.CHANNEL_ID, false);
        pluginGeneratedSerialDescriptor.addElement("pinnedStatus", true);
        pluginGeneratedSerialDescriptor.addElement("isFlagged", true);
        pluginGeneratedSerialDescriptor.addElement("receiveMsgOption", true);
        pluginGeneratedSerialDescriptor.addElement("unreadCount", true);
        pluginGeneratedSerialDescriptor.addElement("lastReceivedMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("lastReadMsgSeq", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UpdateConversationReq deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        int i;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        Integer num9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, intSerializer, null);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            Integer num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            Integer num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            Integer num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, intSerializer, null);
            str = strDecodeStringElement;
            num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, intSerializer, null);
            num3 = num15;
            num4 = num14;
            num = num12;
            num6 = num13;
            num7 = num11;
            i = 255;
            num5 = num10;
        } else {
            int i4 = 0;
            boolean z2 = true;
            Integer num16 = null;
            Integer num17 = null;
            Integer num18 = null;
            Integer num19 = null;
            Integer num20 = null;
            Integer num21 = null;
            String strDecodeStringElement2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num8 = num21;
                        z = true;
                        z2 = false;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 0:
                        num8 = num21;
                        z = true;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        z = true;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num21);
                        i4 |= 2;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num9);
                        i4 |= 4;
                        num8 = num21;
                        z = true;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 3:
                        num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num16);
                        i4 |= 8;
                        break;
                    case 4:
                        i4 |= 16;
                        num20 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num20);
                        num8 = num21;
                        z = true;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 5:
                        i4 |= 32;
                        num19 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num19);
                        num8 = num21;
                        z = true;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 6:
                        i4 |= 64;
                        num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num18);
                        num8 = num21;
                        z = true;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 7:
                        i4 |= 128;
                        num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num17);
                        num8 = num21;
                        z = true;
                        num21 = num8;
                        i2 = 7;
                        i3 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num22 = num21;
            num = num16;
            num2 = num17;
            num3 = num18;
            num4 = num19;
            str = strDecodeStringElement2;
            i = i4;
            num5 = num22;
            num6 = num20;
            num7 = num9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UpdateConversationReq(i, str, num5, num7, num, num6, num4, num3, num2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UpdateConversationReq updateConversationReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(updateConversationReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UpdateConversationReq.write$Self$OKIMCore_okimcore(updateConversationReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
