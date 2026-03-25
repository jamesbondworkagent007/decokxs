package com.okinc.okuser.data;

import com.okinc.okuser.data.UserInfo;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class UserInfo$SubUserAuth$$serializer implements GeneratedSerializer<UserInfo.SubUserAuth> {
    public static final int $stable;
    public static final UserInfo$SubUserAuth$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UserInfo$SubUserAuth$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UserInfo$SubUserAuth$$serializer userInfo$SubUserAuth$$serializer = new UserInfo$SubUserAuth$$serializer();
        INSTANCE = userInfo$SubUserAuth$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okuser.data.UserInfo.SubUserAuth", userInfo$SubUserAuth$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("isAllowLogin", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowDeposit", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowWithdraw", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowTransfer", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowTrading", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowCreateApi", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowOAuth", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowUseFinancial", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowUseAsset", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowInquireTrading", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowInquireAsset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UserInfo.SubUserAuth deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            z2 = zDecodeBooleanElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            z = zDecodeBooleanElement11;
            z3 = zDecodeBooleanElement9;
            z9 = zDecodeBooleanElement8;
            z6 = zDecodeBooleanElement7;
            z7 = zDecodeBooleanElement5;
            z5 = zDecodeBooleanElement10;
            z8 = zDecodeBooleanElement6;
            z10 = zDecodeBooleanElement4;
            z4 = zDecodeBooleanElement3;
            i = 2047;
        } else {
            boolean z12 = true;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            boolean zDecodeBooleanElement20 = false;
            boolean zDecodeBooleanElement21 = false;
            boolean zDecodeBooleanElement22 = false;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        z12 = z11;
                        break;
                    case 0:
                        i2 |= 1;
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        zDecodeBooleanElement22 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement21 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i2 |= 4;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 3:
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 |= 8;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 4:
                        zDecodeBooleanElement20 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 |= 16;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 5:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i2 |= 32;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 6:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i2 |= 64;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 7:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i2 |= 128;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 8:
                        zDecodeBooleanElement19 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 |= 256;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 9:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i2 |= 512;
                        z11 = z12;
                        z12 = z11;
                        break;
                    case 10:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i2 |= 1024;
                        z11 = z12;
                        z12 = z11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement13;
            z = zDecodeBooleanElement14;
            z2 = zDecodeBooleanElement12;
            i = i2;
            boolean z13 = zDecodeBooleanElement21;
            z3 = zDecodeBooleanElement15;
            z4 = zDecodeBooleanElement22;
            z5 = zDecodeBooleanElement19;
            z6 = zDecodeBooleanElement17;
            z7 = zDecodeBooleanElement18;
            z8 = zDecodeBooleanElement20;
            z9 = zDecodeBooleanElement16;
            z10 = z13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserInfo.SubUserAuth(i, z2, z4, z10, z7, z8, z6, z9, z3, z5, z, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UserInfo.SubUserAuth subUserAuth) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subUserAuth, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserInfo.SubUserAuth.write$Self$OKUser_okuser(subUserAuth, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
