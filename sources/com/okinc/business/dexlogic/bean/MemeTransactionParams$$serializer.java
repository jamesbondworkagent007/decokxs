package com.okinc.business.dexlogic.bean;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TokenBase$$serializer;
import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class MemeTransactionParams$$serializer implements GeneratedSerializer<MemeTransactionParams> {
    public static final int $stable;
    public static final MemeTransactionParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MemeTransactionParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MemeTransactionParams$$serializer memeTransactionParams$$serializer = new MemeTransactionParams$$serializer();
        INSTANCE = memeTransactionParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MemeTransactionParams", memeTransactionParams$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("tokenBase", false);
        pluginGeneratedSerialDescriptor.addElement("transaction_direction", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        pluginGeneratedSerialDescriptor.addElement("currencyToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        TokenBase$$serializer tokenBase$$serializer = TokenBase$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{tokenBase$$serializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(tokenBase$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MemeTransactionParams deserialize(@NotNull Decoder decoder) {
        TokenBase tokenBase;
        String str;
        int i;
        String str2;
        TokenBase tokenBase2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            TokenBase$$serializer tokenBase$$serializer = TokenBase$$serializer.INSTANCE;
            TokenBase tokenBase3 = (TokenBase) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, tokenBase$$serializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            tokenBase = (TokenBase) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, tokenBase$$serializer, null);
            str = strDecodeStringElement3;
            i = 31;
            str2 = strDecodeStringElement2;
            tokenBase2 = tokenBase3;
            i2 = iDecodeIntElement;
        } else {
            TokenBase tokenBase4 = null;
            String strDecodeStringElement4 = null;
            TokenBase tokenBase5 = null;
            int i3 = 0;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    tokenBase5 = (TokenBase) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, TokenBase$$serializer.INSTANCE, tokenBase5);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    tokenBase4 = (TokenBase) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, TokenBase$$serializer.INSTANCE, tokenBase4);
                    i3 |= 16;
                }
            }
            tokenBase = tokenBase4;
            str = strDecodeStringElement;
            i = i3;
            str2 = strDecodeStringElement4;
            tokenBase2 = tokenBase5;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MemeTransactionParams(i, tokenBase2, i2, str2, str, tokenBase, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MemeTransactionParams memeTransactionParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(memeTransactionParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MemeTransactionParams.write$Self$OKDex_dex_impl(memeTransactionParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
