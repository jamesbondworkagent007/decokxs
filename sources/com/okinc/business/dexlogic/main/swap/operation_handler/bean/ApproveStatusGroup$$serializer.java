package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ApproveStatusGroup$$serializer implements GeneratedSerializer<ApproveStatusGroup> {
    public static final int $stable;
    public static final ApproveStatusGroup$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ApproveStatusGroup$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ApproveStatusGroup$$serializer approveStatusGroup$$serializer = new ApproveStatusGroup$$serializer();
        INSTANCE = approveStatusGroup$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup", approveStatusGroup$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("needApprove", true);
        pluginGeneratedSerialDescriptor.addElement("approveStatus", true);
        pluginGeneratedSerialDescriptor.addElement("approvedAmount", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("needCancelApproveToken", false);
        pluginGeneratedSerialDescriptor.addElement("uniqueKeyForProviderList", true);
        pluginGeneratedSerialDescriptor.addElement("deFiPlatformId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ApproveStatusGroup.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, kSerializerArr[1], stringSerializer, stringSerializer, booleanSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ApproveStatusGroup deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str;
        boolean z;
        ApproveStatus approveStatus;
        int i;
        boolean z2;
        String str2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ApproveStatusGroup.$childSerializers;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            ApproveStatus approveStatus2 = (ApproveStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            approveStatus = approveStatus2;
            z = zDecodeBooleanElement;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement4;
            z2 = zDecodeBooleanElement2;
            i = 127;
        } else {
            ApproveStatus approveStatus3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int i3 = 0;
            boolean z3 = true;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i3 |= 1;
                        break;
                    case 1:
                        i3 |= 2;
                        approveStatus3 = (ApproveStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], approveStatus3);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                        i3 = i2;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                        i3 = i2;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement7;
            str = strDecodeStringElement8;
            z = zDecodeBooleanElement3;
            approveStatus = approveStatus3;
            i = i3;
            z2 = zDecodeBooleanElement4;
            str2 = strDecodeStringElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ApproveStatusGroup(i, z, approveStatus, strDecodeStringElement, str2, z2, str, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ApproveStatusGroup approveStatusGroup) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(approveStatusGroup, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ApproveStatusGroup.write$Self$OKDex_dex_impl(approveStatusGroup, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
