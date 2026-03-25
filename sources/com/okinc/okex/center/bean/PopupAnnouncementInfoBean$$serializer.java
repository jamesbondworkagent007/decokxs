package com.okinc.okex.center.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class PopupAnnouncementInfoBean$$serializer implements GeneratedSerializer<PopupAnnouncementInfoBean> {
    public static final int $stable;
    public static final PopupAnnouncementInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PopupAnnouncementInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PopupAnnouncementInfoBean$$serializer popupAnnouncementInfoBean$$serializer = new PopupAnnouncementInfoBean$$serializer();
        INSTANCE = popupAnnouncementInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.PopupAnnouncementInfoBean", popupAnnouncementInfoBean$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("popupAnnouncement", true);
        pluginGeneratedSerialDescriptor.addElement("selfServiceTools", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(PopupAnnouncementItem$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SelfServiceTools$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PopupAnnouncementInfoBean deserialize(@NotNull Decoder decoder) {
        PopupAnnouncementItem popupAnnouncementItem;
        SelfServiceTools selfServiceTools;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            popupAnnouncementItem = (PopupAnnouncementItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PopupAnnouncementItem$$serializer.INSTANCE, null);
            selfServiceTools = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, null);
            i = 3;
        } else {
            popupAnnouncementItem = null;
            SelfServiceTools selfServiceTools2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    popupAnnouncementItem = (PopupAnnouncementItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PopupAnnouncementItem$$serializer.INSTANCE, popupAnnouncementItem);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    selfServiceTools2 = (SelfServiceTools) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SelfServiceTools$$serializer.INSTANCE, selfServiceTools2);
                    i2 |= 2;
                }
            }
            selfServiceTools = selfServiceTools2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PopupAnnouncementInfoBean(i, popupAnnouncementItem, selfServiceTools, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PopupAnnouncementInfoBean popupAnnouncementInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(popupAnnouncementInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PopupAnnouncementInfoBean.write$Self$OKSupport_support_impl(popupAnnouncementInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
