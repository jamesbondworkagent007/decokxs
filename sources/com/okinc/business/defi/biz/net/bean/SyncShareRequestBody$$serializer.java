package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class SyncShareRequestBody$$serializer implements GeneratedSerializer<SyncShareRequestBody> {
    public static final int $stable;
    public static final SyncShareRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SyncShareRequestBody$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SyncShareRequestBody$$serializer syncShareRequestBody$$serializer = new SyncShareRequestBody$$serializer();
        INSTANCE = syncShareRequestBody$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.SyncShareRequestBody", syncShareRequestBody$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("mpcId", false);
        pluginGeneratedSerialDescriptor.addElement("oldMpcId", false);
        pluginGeneratedSerialDescriptor.addElement("mpcStatus", false);
        pluginGeneratedSerialDescriptor.addElement("oldMpcStatus", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("escapeReason", true);
        pluginGeneratedSerialDescriptor.addElement("backupCloudType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SyncShareRequestBody deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str2 = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            str = strDecodeStringElement3;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            i4 = iDecodeIntElement2;
            str3 = strDecodeStringElement2;
            i = 127;
        } else {
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int i6 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 = i6 | 2;
                        break;
                    case 2:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 = i6 | 4;
                        break;
                    case 3:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 = i6 | 8;
                        break;
                    case 4:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 = i6 | 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 = i6 | 32;
                        break;
                    case 6:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i5 = i6 | 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i6 = i5;
            }
            iDecodeIntElement = iDecodeIntElement5;
            i = i6;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            int i7 = iDecodeIntElement8;
            i2 = iDecodeIntElement6;
            str3 = strDecodeStringElement6;
            i3 = iDecodeIntElement7;
            i4 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SyncShareRequestBody(i, str2, str3, i4, i2, i3, str, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SyncShareRequestBody syncShareRequestBody) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(syncShareRequestBody, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SyncShareRequestBody.write$Self$OKWallet_wallet_impl(syncShareRequestBody, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
