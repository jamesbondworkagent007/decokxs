package com.okinc.business.defi.wallet.hardware.bean;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class HardWareConnectGuide$$serializer implements GeneratedSerializer<HardWareConnectGuide> {
    public static final int $stable;
    public static final HardWareConnectGuide$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HardWareConnectGuide$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HardWareConnectGuide$$serializer hardWareConnectGuide$$serializer = new HardWareConnectGuide$$serializer();
        INSTANCE = hardWareConnectGuide$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide", hardWareConnectGuide$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("imageRes", false);
        pluginGeneratedSerialDescriptor.addElement("primaryText", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryText", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryHasClickSpan", true);
        pluginGeneratedSerialDescriptor.addElement("imageMarginBottom", true);
        pluginGeneratedSerialDescriptor.addElement("imageDimensionRatio", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = HardWareConnectGuide.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(kSerializerArr[2]), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HardWareConnectGuide deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        int i;
        Float f;
        String str;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HardWareConnectGuide.$childSerializers;
        Float f2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            CharSequence charSequence3 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            CharSequence charSequence4 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, null);
            Float f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, null);
            charSequence = charSequence4;
            str = strDecodeStringElement;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            bool = bool2;
            f = f3;
            charSequence2 = charSequence3;
            i = 63;
        } else {
            int i2 = 0;
            boolean z = true;
            CharSequence charSequence5 = null;
            String str3 = null;
            bool = null;
            CharSequence charSequence6 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        i2 |= 2;
                        charSequence6 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], charSequence6);
                        break;
                    case 2:
                        i2 |= 4;
                        charSequence5 = (CharSequence) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], charSequence5);
                        break;
                    case 3:
                        i2 |= 8;
                        bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool);
                        break;
                    case 4:
                        i2 |= 16;
                        f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, f2);
                        break;
                    case 5:
                        i2 |= 32;
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            CharSequence charSequence7 = charSequence6;
            f = f2;
            str = strDecodeStringElement2;
            str2 = str3;
            charSequence = charSequence5;
            charSequence2 = charSequence7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HardWareConnectGuide(i, str, charSequence2, charSequence, bool, f, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HardWareConnectGuide hardWareConnectGuide) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(hardWareConnectGuide, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HardWareConnectGuide.write$Self$OKWallet_wallet_impl(hardWareConnectGuide, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
