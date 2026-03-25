package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo$$serializer;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.push.notifications.PushMessagingService;
import java.util.List;
import java.util.Set;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppConnectRequest$$serializer implements GeneratedSerializer<DAppConnectRequest> {
    public static final int $stable;
    public static final DAppConnectRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppConnectRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppConnectRequest$$serializer dAppConnectRequest$$serializer = new DAppConnectRequest$$serializer();
        INSTANCE = dAppConnectRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest", dAppConnectRequest$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("protocolVer", false);
        pluginGeneratedSerialDescriptor.addElement(PushMessagingService.KEY_TOPIC, false);
        pluginGeneratedSerialDescriptor.addElement(CoreNetworkModuleKt.KEY_CLIENT_ID, false);
        pluginGeneratedSerialDescriptor.addElement("dAppInfo", false);
        pluginGeneratedSerialDescriptor.addElement("requestId", false);
        pluginGeneratedSerialDescriptor.addElement("requests", false);
        pluginGeneratedSerialDescriptor.addElement("redirect", false);
        pluginGeneratedSerialDescriptor.addElement("protocolVersion", true);
        pluginGeneratedSerialDescriptor.addElement("hasLegacyTonRequest", true);
        pluginGeneratedSerialDescriptor.addElement("requiredCaipChains", true);
        pluginGeneratedSerialDescriptor.addElement("optionalCaipChains", true);
        pluginGeneratedSerialDescriptor.addElement("firstTonAddrRequest", true);
        pluginGeneratedSerialDescriptor.addElement("firstTonProofRequest", true);
        pluginGeneratedSerialDescriptor.addElement("isTonRequested", true);
        pluginGeneratedSerialDescriptor.addElement("connectRequestMethods", true);
        pluginGeneratedSerialDescriptor.addElement("hasCosmosRequest", true);
        pluginGeneratedSerialDescriptor.addElement("isStarknetRequired", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DAppConnectRequest.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, DAppInfo$$serializer.INSTANCE, stringSerializer, kSerializerArr[5], stringSerializer, BuiltinSerializersKt.getNullable(intSerializer), booleanSerializer, kSerializerArr[9], kSerializerArr[10], BuiltinSerializersKt.getNullable(DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DAppConnectRequest$Request$TonProof$$serializer.INSTANCE), booleanSerializer, kSerializerArr[14], booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppConnectRequest deserialize(@NotNull Decoder decoder) {
        Integer num;
        int i;
        Set set;
        DAppConnectRequest.Request.TonAddress tonAddress;
        List list;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        boolean zDecodeBooleanElement2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        List list2;
        DAppConnectRequest.Request.TonProof tonProof;
        List list3;
        DAppInfo dAppInfo;
        int i2;
        Set set2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DAppConnectRequest.$childSerializers;
        int i4 = 8;
        int i5 = 10;
        int i6 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            DAppInfo dAppInfo2 = (DAppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, DAppInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            Set set3 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            DAppConnectRequest.Request.TonAddress tonAddress2 = (DAppConnectRequest.Request.TonAddress) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE, null);
            DAppConnectRequest.Request.TonProof tonProof2 = (DAppConnectRequest.Request.TonProof) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, DAppConnectRequest$Request$TonProof$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            str2 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            tonProof = tonProof2;
            tonAddress = tonAddress2;
            list = list4;
            str4 = strDecodeStringElement;
            num = num2;
            str = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
            dAppInfo = dAppInfo2;
            i2 = 131071;
            set = set3;
            list2 = list5;
            i = iDecodeIntElement;
        } else {
            int i7 = 16;
            int i8 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean z3 = true;
            Integer num3 = null;
            DAppConnectRequest.Request.TonProof tonProof3 = null;
            DAppConnectRequest.Request.TonAddress tonAddress3 = null;
            List list6 = null;
            List list7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Set set4 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            DAppInfo dAppInfo3 = null;
            List list8 = null;
            int iDecodeIntElement2 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        set2 = set4;
                        z3 = false;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 0:
                        set2 = set4;
                        i8 |= 1;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 1:
                        set2 = set4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 2:
                        set2 = set4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 3:
                        set2 = set4;
                        dAppInfo3 = (DAppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, DAppInfo$$serializer.INSTANCE, dAppInfo3);
                        i8 |= 8;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 4:
                        set2 = set4;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 5:
                        set4 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], set4);
                        i8 |= 32;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 7:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num3);
                        i8 |= 128;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 8:
                        i3 = i4;
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i8 |= 256;
                        i4 = i3;
                        i7 = 16;
                        break;
                    case 9:
                        i8 |= 512;
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, kSerializerArr[i6], list7);
                        i3 = 8;
                        i4 = i3;
                        i7 = 16;
                        break;
                    case 10:
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list8);
                        i8 |= 1024;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 11:
                        tonAddress3 = (DAppConnectRequest.Request.TonAddress) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE, tonAddress3);
                        i8 |= 2048;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 12:
                        tonProof3 = (DAppConnectRequest.Request.TonProof) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, DAppConnectRequest$Request$TonProof$$serializer.INSTANCE, tonProof3);
                        i8 |= 4096;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 13:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i8 |= 8192;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 14:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], list6);
                        i8 |= 16384;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 15:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i8 |= 32768;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    case 16:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i7);
                        i8 = 65536 | i8;
                        set2 = set4;
                        set4 = set2;
                        i7 = 16;
                        i6 = 9;
                        i5 = 10;
                        i4 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num3;
            i = iDecodeIntElement2;
            set = set4;
            tonAddress = tonAddress3;
            list = list7;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            zDecodeBooleanElement2 = zDecodeBooleanElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            z = zDecodeBooleanElement7;
            z2 = zDecodeBooleanElement8;
            list2 = list8;
            tonProof = tonProof3;
            list3 = list6;
            dAppInfo = dAppInfo3;
            i2 = i8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppConnectRequest(i2, i, str4, str3, dAppInfo, str, set, str2, num, z, list, list2, tonAddress, tonProof, z2, list3, zDecodeBooleanElement, zDecodeBooleanElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppConnectRequest dAppConnectRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dAppConnectRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppConnectRequest.write$Self$OKWallet_wallet_impl(dAppConnectRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
