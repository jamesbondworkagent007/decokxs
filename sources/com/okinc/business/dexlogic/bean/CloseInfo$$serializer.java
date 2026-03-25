package com.okinc.business.dexlogic.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CloseInfo$$serializer implements GeneratedSerializer<CloseInfo> {
    public static final int $stable;
    public static final CloseInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CloseInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CloseInfo$$serializer closeInfo$$serializer = new CloseInfo$$serializer();
        INSTANCE = closeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.CloseInfo", closeInfo$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("defiPlatformInfo", true);
        pluginGeneratedSerialDescriptor.addElement("fromToken", true);
        pluginGeneratedSerialDescriptor.addElement("toToken", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("minimumReceived", true);
        pluginGeneratedSerialDescriptor.addElement("estimateTokenFee", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{DefiPlatformInfo$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), BuiltinSerializersKt.getNullable(dexMultiTokenInfoBean$$serializer), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CloseInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        String str2;
        DefiPlatformInfo defiPlatformInfo;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DefiPlatformInfo$$serializer.INSTANCE, null);
            DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, dexMultiTokenInfoBean$$serializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            defiPlatformInfo = defiPlatformInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean4;
            i = 63;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
        } else {
            int i3 = 0;
            boolean z2 = true;
            String strDecodeStringElement5 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = null;
            DefiPlatformInfo defiPlatformInfo3 = null;
            String strDecodeStringElement6 = null;
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        defiPlatformInfo3 = (DefiPlatformInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, DefiPlatformInfo$$serializer.INSTANCE, defiPlatformInfo3);
                        i2 = 5;
                        break;
                    case 1:
                        i3 |= 2;
                        dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean6);
                        break;
                    case 2:
                        i3 |= 4;
                        dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DexMultiTokenInfoBean$$serializer.INSTANCE, dexMultiTokenInfoBean5);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement6;
            str = strDecodeStringElement2;
            i = i3;
            DexMultiTokenInfoBean dexMultiTokenInfoBean7 = dexMultiTokenInfoBean6;
            str2 = strDecodeStringElement5;
            defiPlatformInfo = defiPlatformInfo3;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean5;
            dexMultiTokenInfoBean2 = dexMultiTokenInfoBean7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CloseInfo(i, defiPlatformInfo, dexMultiTokenInfoBean2, dexMultiTokenInfoBean, str, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CloseInfo closeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(closeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CloseInfo.write$Self$OKDex_dex_impl(closeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
