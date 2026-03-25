package com.okinc.business.defi.biz.net.bean;

import android.os.Parcelable;
import com.okinc.liveness.lca.EopTrackEvent;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ResponseSingeResult$$serializer<T> implements GeneratedSerializer<ResponseSingeResult<T>> {
    public static final int $stable = 8;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    private ResponseSingeResult$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.ResponseSingeResult", this, 6);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("msg", true);
        pluginGeneratedSerialDescriptor.addElement("error_code", true);
        pluginGeneratedSerialDescriptor.addElement(EopTrackEvent.KEY_ERROR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.addElement("detailMsg", true);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.serialization.KSerializer<T> */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResponseSingeResult$$serializer(@NotNull KSerializer<T> kSerializer) {
        this();
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.typeSerial0 = kSerializer;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(this.typeSerial0)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ResponseSingeResult<T> deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        Parcelable parcelable;
        String str2;
        int i;
        String str3;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = iDecodeIntElement;
            parcelable = (Parcelable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, this.typeSerial0, null);
            str3 = strDecodeStringElement4;
            i2 = 63;
            str = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            Parcelable parcelable2 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i3 |= 32;
                        parcelable2 = (Parcelable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, this.typeSerial0, parcelable2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement7;
            parcelable = parcelable2;
            str2 = strDecodeStringElement8;
            i = iDecodeIntElement2;
            str3 = strDecodeStringElement6;
            i2 = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ResponseSingeResult<>(i2, i, str2, strDecodeStringElement, str3, str, parcelable, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ResponseSingeResult<T> responseSingeResult) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(responseSingeResult, "");
        SerialDescriptor serialDescriptor = this.descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ResponseSingeResult.write$Self$OKWallet_wallet_impl(responseSingeResult, compositeEncoderBeginStructure, serialDescriptor, this.typeSerial0);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
