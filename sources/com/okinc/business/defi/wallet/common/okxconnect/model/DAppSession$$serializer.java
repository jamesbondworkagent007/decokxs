package com.okinc.business.defi.wallet.common.okxconnect.model;

import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.okinc.wallet.core.sign.ton.X25519KeyPair$$serializer;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.push.notifications.PushMessagingService;
import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DAppSession$$serializer implements GeneratedSerializer<DAppSession> {
    public static final int $stable;
    public static final DAppSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAppSession$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DAppSession$$serializer dAppSession$$serializer = new DAppSession$$serializer();
        INSTANCE = dAppSession$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession", dAppSession$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(CoreNetworkModuleKt.KEY_CLIENT_ID, false);
        pluginGeneratedSerialDescriptor.addElement(PushMessagingService.KEY_TOPIC, false);
        pluginGeneratedSerialDescriptor.addElement("walletId", false);
        pluginGeneratedSerialDescriptor.addElement("keyPair", false);
        pluginGeneratedSerialDescriptor.addElement("dAppInfo", false);
        pluginGeneratedSerialDescriptor.addElement("isTonConnected", false);
        pluginGeneratedSerialDescriptor.addElement("connectedCaipChains", false);
        pluginGeneratedSerialDescriptor.addElement("hasCosmosChainConnected", true);
        pluginGeneratedSerialDescriptor.addElement("redirect", false);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("protocalVersion", true);
        pluginGeneratedSerialDescriptor.addElement("lastActiveTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("isSupportSplitData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DAppSession.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, X25519KeyPair$$serializer.INSTANCE, DAppInfo$$serializer.INSTANCE, booleanSerializer, kSerializerArr[6], BuiltinSerializersKt.getNullable(booleanSerializer), stringSerializer, longSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DAppSession deserialize(@NotNull Decoder decoder) {
        DAppInfo dAppInfo;
        int i;
        Boolean bool;
        String str;
        String str2;
        String str3;
        boolean zDecodeBooleanElement;
        String str4;
        boolean z;
        long j;
        List list;
        Integer num;
        Long l;
        X25519KeyPair x25519KeyPair;
        X25519KeyPair x25519KeyPair2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DAppSession.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            X25519KeyPair x25519KeyPair3 = (X25519KeyPair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, null);
            DAppInfo dAppInfo2 = (DAppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DAppInfo$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            num = num3;
            bool = bool2;
            str2 = strDecodeStringElement4;
            dAppInfo = dAppInfo2;
            j = jDecodeLongElement;
            list = list2;
            str4 = strDecodeStringElement;
            i = 8191;
            z = zDecodeBooleanElement2;
            x25519KeyPair = x25519KeyPair3;
            str = strDecodeStringElement3;
            str3 = strDecodeStringElement2;
        } else {
            int i4 = 12;
            int i5 = 0;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            List list3 = null;
            DAppInfo dAppInfo3 = null;
            Boolean bool3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            X25519KeyPair x25519KeyPair4 = null;
            boolean z2 = true;
            long jDecodeLongElement2 = 0;
            Long l2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        x25519KeyPair2 = x25519KeyPair4;
                        z2 = false;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        x25519KeyPair4 = (X25519KeyPair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, x25519KeyPair4);
                        i5 |= 8;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        dAppInfo3 = (DAppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DAppInfo$$serializer.INSTANCE, dAppInfo3);
                        i5 |= 16;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i5 |= 32;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], list3);
                        i5 |= 64;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 128;
                        i4 = 12;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i3);
                        i5 |= 512;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num2);
                        i5 |= 1024;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, l2);
                        i5 |= 2048;
                        x25519KeyPair2 = x25519KeyPair4;
                        x25519KeyPair4 = x25519KeyPair2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 12:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 4096;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            X25519KeyPair x25519KeyPair5 = x25519KeyPair4;
            dAppInfo = dAppInfo3;
            i = i5;
            bool = bool3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement5;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            str4 = strDecodeStringElement6;
            z = zDecodeBooleanElement4;
            j = jDecodeLongElement2;
            list = list3;
            num = num2;
            l = l2;
            x25519KeyPair = x25519KeyPair5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DAppSession(i, str4, str3, str, x25519KeyPair, dAppInfo, z, list, bool, str2, j, num, l, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DAppSession.write$Self$OKWallet_wallet_impl(dAppSession, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
