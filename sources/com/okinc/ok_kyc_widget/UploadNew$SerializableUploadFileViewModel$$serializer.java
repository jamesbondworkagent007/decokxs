package com.okinc.ok_kyc_widget;

import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_widget.UploadNew;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class UploadNew$SerializableUploadFileViewModel$$serializer implements GeneratedSerializer<UploadNew.SerializableUploadFileViewModel> {
    public static final int $stable;
    public static final UploadNew$SerializableUploadFileViewModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UploadNew$SerializableUploadFileViewModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UploadNew$SerializableUploadFileViewModel$$serializer uploadNew$SerializableUploadFileViewModel$$serializer = new UploadNew$SerializableUploadFileViewModel$$serializer();
        INSTANCE = uploadNew$SerializableUploadFileViewModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_widget.UploadNew.SerializableUploadFileViewModel", uploadNew$SerializableUploadFileViewModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("localUploadId", true);
        pluginGeneratedSerialDescriptor.addElement("imageId", false);
        pluginGeneratedSerialDescriptor.addElement("fileName", false);
        pluginGeneratedSerialDescriptor.addElement("fileType", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("uri", false);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = UploadNew.SerializableUploadFileViewModel.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, longSerializer, stringSerializer, kSerializerArr[3], stringSerializer, stringSerializer, kSerializerArr[6]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UploadNew.SerializableUploadFileViewModel deserialize(@NotNull Decoder decoder) {
        UploadNew.Status status;
        String str;
        String str2;
        int i;
        long j;
        SingleFileUploadUseCase.FileType fileType;
        String str3;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = UploadNew.SerializableUploadFileViewModel.$childSerializers;
        int i2 = 5;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            SingleFileUploadUseCase.FileType fileType2 = (SingleFileUploadUseCase.FileType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            status = (UploadNew.Status) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            str3 = strDecodeStringElement2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            fileType = fileType2;
            j2 = jDecodeLongElement2;
            j = jDecodeLongElement;
            i = 127;
        } else {
            long jDecodeLongElement3 = 0;
            int i3 = 0;
            boolean z = true;
            UploadNew.Status status2 = null;
            String strDecodeStringElement5 = null;
            SingleFileUploadUseCase.FileType fileType3 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        fileType3 = (SingleFileUploadUseCase.FileType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], fileType3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 6:
                        status2 = (UploadNew.Status) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], status2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            status = status2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            long j3 = jDecodeLongElement3;
            i = i3;
            j = jDecodeLongElement4;
            fileType = fileType3;
            str3 = strDecodeStringElement6;
            j2 = j3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UploadNew.SerializableUploadFileViewModel(i, j, j2, str3, fileType, str2, str, status, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UploadNew.SerializableUploadFileViewModel serializableUploadFileViewModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(serializableUploadFileViewModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UploadNew.SerializableUploadFileViewModel.write$Self$OKCompliance_ok_compliance_impl(serializableUploadFileViewModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
