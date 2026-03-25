package com.okinc.planet.biz_userprofile.view.share;

import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
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

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class HistoryTotalPnlData$$serializer implements GeneratedSerializer<HistoryTotalPnlData> {
    public static final int $stable;
    public static final HistoryTotalPnlData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HistoryTotalPnlData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HistoryTotalPnlData$$serializer historyTotalPnlData$$serializer = new HistoryTotalPnlData$$serializer();
        INSTANCE = historyTotalPnlData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData", historyTotalPnlData$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("ratio", true);
        pluginGeneratedSerialDescriptor.addElement("statTime", true);
        pluginGeneratedSerialDescriptor.addElement("pnl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, PlanetNumericString$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HistoryTotalPnlData deserialize(@NotNull Decoder decoder) {
        String str;
        int i;
        String str2;
        String strAEQbTJ;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            PlanetNumericString planetNumericString = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            i = 7;
            str2 = strDecodeStringElement2;
            strAEQbTJ = planetNumericString != null ? planetNumericString.AEQbTJ() : null;
        } else {
            int i2 = 0;
            boolean z = true;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strAEQbTJ2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    PlanetNumericString planetNumericString2 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ2 != null ? PlanetNumericString.OLrzqt(strAEQbTJ2) : null);
                    strAEQbTJ2 = planetNumericString2 != null ? planetNumericString2.AEQbTJ() : null;
                    i2 |= 4;
                }
            }
            str = strDecodeStringElement3;
            i = i2;
            str2 = strDecodeStringElement4;
            strAEQbTJ = strAEQbTJ2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HistoryTotalPnlData(i, str, str2, strAEQbTJ, null, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HistoryTotalPnlData historyTotalPnlData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(historyTotalPnlData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HistoryTotalPnlData.EZpvd(historyTotalPnlData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
