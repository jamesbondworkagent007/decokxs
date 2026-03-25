package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class PopupTextContent$$serializer implements GeneratedSerializer<PopupTextContent> {
    public static final int $stable;
    public static final PopupTextContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PopupTextContent$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PopupTextContent$$serializer popupTextContent$$serializer = new PopupTextContent$$serializer();
        INSTANCE = popupTextContent$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent", popupTextContent$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.TAG_STYLE, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.UNDERLINE, true);
        pluginGeneratedSerialDescriptor.addElement("dialog", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkTextStyle$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ButtonDialog$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PopupTextContent deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        LinkTextStyle linkTextStyle;
        String str;
        ButtonDialog buttonDialog;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            LinkTextStyle linkTextStyle2 = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, null);
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, null);
            str = str2;
            buttonDialog = (ButtonDialog) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ButtonDialog$$serializer.INSTANCE, null);
            bool = bool3;
            linkTextStyle = linkTextStyle2;
            i = 15;
        } else {
            int i2 = 0;
            boolean z = true;
            LinkTextStyle linkTextStyle3 = null;
            String str3 = null;
            ButtonDialog buttonDialog2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    linkTextStyle3 = (LinkTextStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, linkTextStyle3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    buttonDialog2 = (ButtonDialog) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ButtonDialog$$serializer.INSTANCE, buttonDialog2);
                    i2 |= 8;
                }
            }
            i = i2;
            bool = bool2;
            linkTextStyle = linkTextStyle3;
            str = str3;
            buttonDialog = buttonDialog2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PopupTextContent(i, str, linkTextStyle, bool, buttonDialog, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PopupTextContent popupTextContent) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(popupTextContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PopupTextContent.write$Self$OKCompliance_ok_compliance_impl(popupTextContent, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
