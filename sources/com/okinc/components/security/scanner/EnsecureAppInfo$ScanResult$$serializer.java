package com.okinc.components.security.scanner;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class EnsecureAppInfo$ScanResult$$serializer implements GeneratedSerializer<EnsecureAppInfo.ScanResult> {
    public static final int $stable;
    public static final EnsecureAppInfo$ScanResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EnsecureAppInfo$ScanResult$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EnsecureAppInfo$ScanResult$$serializer ensecureAppInfo$ScanResult$$serializer = new EnsecureAppInfo$ScanResult$$serializer();
        INSTANCE = ensecureAppInfo$ScanResult$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.components.security.scanner.EnsecureAppInfo.ScanResult", ensecureAppInfo$ScanResult$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.REASON, false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.LEVEL, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, EnsecureAppInfo.ScanResult.$childSerializers[1]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EnsecureAppInfo.ScanResult deserialize(@NotNull Decoder decoder) {
        EnsecureAppInfo.RiskLevel riskLevel;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = EnsecureAppInfo.ScanResult.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            riskLevel = (EnsecureAppInfo.RiskLevel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            i = 3;
        } else {
            EnsecureAppInfo.RiskLevel riskLevel2 = null;
            String strDecodeStringElement2 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    riskLevel2 = (EnsecureAppInfo.RiskLevel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], riskLevel2);
                    i2 |= 2;
                }
            }
            riskLevel = riskLevel2;
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EnsecureAppInfo.ScanResult(i, strDecodeStringElement, riskLevel, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EnsecureAppInfo.ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scanResult, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EnsecureAppInfo.ScanResult.write$Self$OKSecurity_ok_security_impl(scanResult, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
