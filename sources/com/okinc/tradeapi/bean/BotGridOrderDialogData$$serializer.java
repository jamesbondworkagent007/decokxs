package com.okinc.tradeapi.bean;

import com.okinc.unify_trade.biz.PendingOrderLine;
import com.okinc.unify_trade.biz.PendingOrderLine$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class BotGridOrderDialogData$$serializer implements GeneratedSerializer<BotGridOrderDialogData> {
    public static final int $stable;
    public static final BotGridOrderDialogData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BotGridOrderDialogData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BotGridOrderDialogData$$serializer botGridOrderDialogData$$serializer = new BotGridOrderDialogData$$serializer();
        INSTANCE = botGridOrderDialogData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradeapi.bean.BotGridOrderDialogData", botGridOrderDialogData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("tickerPrice", true);
        pluginGeneratedSerialDescriptor.addElement("maxPx", false);
        pluginGeneratedSerialDescriptor.addElement("minPx", false);
        pluginGeneratedSerialDescriptor.addElement("gridCount", false);
        pluginGeneratedSerialDescriptor.addElement("orderLine", false);
        pluginGeneratedSerialDescriptor.addElement("isFinally", false);
        pluginGeneratedSerialDescriptor.addElement("digit", true);
        pluginGeneratedSerialDescriptor.addElement("isDraggingForCalculateGridNum", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, PendingOrderLine$$serializer.INSTANCE, booleanSerializer, IntSerializer.INSTANCE, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BotGridOrderDialogData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        boolean zDecodeBooleanElement;
        int i;
        boolean z;
        PendingOrderLine pendingOrderLine;
        String str;
        String str2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        int i4 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            PendingOrderLine pendingOrderLine2 = (PendingOrderLine) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PendingOrderLine$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            str = strDecodeStringElement3;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            i = iDecodeIntElement;
            z = zDecodeBooleanElement2;
            strDecodeStringElement2 = strDecodeStringElement6;
            pendingOrderLine = pendingOrderLine2;
            i2 = 255;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement4;
        } else {
            String strDecodeStringElement7 = null;
            PendingOrderLine pendingOrderLine3 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = 7;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 = 7;
                        break;
                    case 4:
                        i4 |= 16;
                        pendingOrderLine3 = (PendingOrderLine) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PendingOrderLine$$serializer.INSTANCE, pendingOrderLine3);
                        i3 = 7;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 7;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 7;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 128;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement4;
            pendingOrderLine = pendingOrderLine3;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement7;
            i2 = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BotGridOrderDialogData(i2, str, strDecodeStringElement, str2, strDecodeStringElement2, pendingOrderLine, z, i, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BotGridOrderDialogData.write$Self$OKTradeCore_trade_core(botGridOrderDialogData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
