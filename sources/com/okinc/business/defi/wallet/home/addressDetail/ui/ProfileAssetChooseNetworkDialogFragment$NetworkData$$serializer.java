package com.okinc.business.defi.wallet.home.addressDetail.ui;

import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer implements GeneratedSerializer<ProfileAssetChooseNetworkDialogFragment.NetworkData> {
    public static final int $stable;
    public static final ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer profileAssetChooseNetworkDialogFragment$NetworkData$$serializer = new ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer();
        INSTANCE = profileAssetChooseNetworkDialogFragment$NetworkData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment.NetworkData", profileAssetChooseNetworkDialogFragment$NetworkData$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("coinUrl", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("symbol", false);
        pluginGeneratedSerialDescriptor.addElement("originAsset", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("hotNetworkRank", true);
        pluginGeneratedSerialDescriptor.addElement("isHotNetwork", true);
        pluginGeneratedSerialDescriptor.addElement("isSelect", true);
        pluginGeneratedSerialDescriptor.addElement("tagContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, LongSerializer.INSTANCE, IntSerializer.INSTANCE, booleanSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProfileAssetChooseNetworkDialogFragment.NetworkData deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        int i2;
        String str4;
        long j;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            str3 = strDecodeStringElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement;
            str = strDecodeStringElement5;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            str2 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            j = jDecodeLongElement;
            i = 511;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z3 = true;
            int iDecodeIntElement2 = 0;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        z3 = z2;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 3:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 4:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 |= 16;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i3 |= 32;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i3 |= 128;
                        z2 = z3;
                        z3 = z2;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        z2 = z3;
                        z3 = z2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            strDecodeStringElement = strDecodeStringElement8;
            i = i3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement9;
            boolean z4 = zDecodeBooleanElement4;
            str3 = strDecodeStringElement6;
            long j2 = jDecodeLongElement2;
            z = z4;
            i2 = iDecodeIntElement2;
            str4 = strDecodeStringElement10;
            j = j2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProfileAssetChooseNetworkDialogFragment.NetworkData(i, str3, str4, str2, str, j, i2, z, zDecodeBooleanElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProfileAssetChooseNetworkDialogFragment.NetworkData networkData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(networkData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProfileAssetChooseNetworkDialogFragment.NetworkData.write$Self$OKWallet_wallet_impl(networkData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
