package com.okinc.business.dex.api.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class EditLimitOrderData$$serializer implements GeneratedSerializer<EditLimitOrderData> {
    public static final int $stable;
    public static final EditLimitOrderData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EditLimitOrderData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EditLimitOrderData$$serializer editLimitOrderData$$serializer = new EditLimitOrderData$$serializer();
        INSTANCE = editLimitOrderData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.api.bean.EditLimitOrderData", editLimitOrderData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("fromTokenInfo", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenInfo", false);
        pluginGeneratedSerialDescriptor.addElement("commonInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        EditTokenInfo$$serializer editTokenInfo$$serializer = EditTokenInfo$$serializer.INSTANCE;
        return new KSerializer[]{editTokenInfo$$serializer, editTokenInfo$$serializer, EditCommonInfo$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EditLimitOrderData deserialize(@NotNull Decoder decoder) {
        int i;
        EditTokenInfo editTokenInfo;
        EditCommonInfo editCommonInfo;
        EditTokenInfo editTokenInfo2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        EditTokenInfo editTokenInfo3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            EditTokenInfo$$serializer editTokenInfo$$serializer = EditTokenInfo$$serializer.INSTANCE;
            EditTokenInfo editTokenInfo4 = (EditTokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, editTokenInfo$$serializer, null);
            editTokenInfo = (EditTokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, editTokenInfo$$serializer, null);
            editCommonInfo = (EditCommonInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, EditCommonInfo$$serializer.INSTANCE, null);
            editTokenInfo2 = editTokenInfo4;
            i = 7;
        } else {
            int i2 = 0;
            boolean z = true;
            EditCommonInfo editCommonInfo2 = null;
            EditTokenInfo editTokenInfo5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    editTokenInfo5 = (EditTokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, EditTokenInfo$$serializer.INSTANCE, editTokenInfo5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    editTokenInfo3 = (EditTokenInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, EditTokenInfo$$serializer.INSTANCE, editTokenInfo3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    editCommonInfo2 = (EditCommonInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, EditCommonInfo$$serializer.INSTANCE, editCommonInfo2);
                    i2 |= 4;
                }
            }
            i = i2;
            editTokenInfo = editTokenInfo3;
            editCommonInfo = editCommonInfo2;
            editTokenInfo2 = editTokenInfo5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EditLimitOrderData(i, editTokenInfo2, editTokenInfo, editCommonInfo, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EditLimitOrderData editLimitOrderData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(editLimitOrderData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EditLimitOrderData.write$Self$OKDex_dex_api(editLimitOrderData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
