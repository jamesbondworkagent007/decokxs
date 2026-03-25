package com.okinc.okpaymentapi.data.remote.model.management;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class UiFlowControl$$serializer implements GeneratedSerializer<UiFlowControl> {
    public static final int $stable;
    public static final UiFlowControl$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UiFlowControl$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UiFlowControl$$serializer uiFlowControl$$serializer = new UiFlowControl$$serializer();
        INSTANCE = uiFlowControl$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl", uiFlowControl$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("showTOC", true);
        pluginGeneratedSerialDescriptor.addElement("showWarningBox", true);
        pluginGeneratedSerialDescriptor.addElement("showInformationBox", true);
        pluginGeneratedSerialDescriptor.addElement("skipTwoFactorAuth", true);
        pluginGeneratedSerialDescriptor.addElement("skipWireEducation", true);
        pluginGeneratedSerialDescriptor.addElement("allowManualAdditionInfoPage", true);
        pluginGeneratedSerialDescriptor.addElement("skipManagementSingleChannelSelectionScreen", true);
        pluginGeneratedSerialDescriptor.addElement("showWithdrawAccountsForDeposit", true);
        pluginGeneratedSerialDescriptor.addElement("showWithdrawHoldScreen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UiFlowControl deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        boolean z;
        boolean zDecodeBooleanElement3;
        boolean z2;
        boolean z3;
        Boolean bool;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, null);
            z5 = zDecodeBooleanElement4;
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            bool = bool2;
            z4 = zDecodeBooleanElement9;
            z = zDecodeBooleanElement7;
            zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            i = 511;
            zDecodeBooleanElement = zDecodeBooleanElement8;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement5;
        } else {
            boolean z6 = true;
            boolean zDecodeBooleanElement10 = false;
            int i4 = 0;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            Boolean bool3 = null;
            boolean zDecodeBooleanElement16 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i3 = 7;
                        break;
                    case 0:
                        i4 |= 1;
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i3 = 7;
                        break;
                    case 1:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 7;
                        break;
                    case 2:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i4 | 8;
                        i4 = i2;
                        break;
                    case 4:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i4 | 16;
                        i4 = i2;
                        break;
                    case 5:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i2 = i4 | 32;
                        i4 = i2;
                        break;
                    case 6:
                        i4 |= 64;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool3);
                        break;
                    case 7:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i2 = i4 | 128;
                        i4 = i2;
                        break;
                    case 8:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 = i4 | 256;
                        i4 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement2 = zDecodeBooleanElement16;
            z = zDecodeBooleanElement12;
            zDecodeBooleanElement3 = zDecodeBooleanElement13;
            z2 = zDecodeBooleanElement14;
            z3 = zDecodeBooleanElement15;
            bool = bool3;
            z4 = zDecodeBooleanElement11;
            z5 = zDecodeBooleanElement10;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UiFlowControl(i, z5, z3, z2, z, zDecodeBooleanElement, z4, bool, zDecodeBooleanElement2, zDecodeBooleanElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UiFlowControl uiFlowControl) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uiFlowControl, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UiFlowControl.write$Self$OKPayments_ok_payment_api(uiFlowControl, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
