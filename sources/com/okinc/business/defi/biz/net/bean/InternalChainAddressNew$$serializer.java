package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.ArrayList;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class InternalChainAddressNew$$serializer implements GeneratedSerializer<InternalChainAddressNew> {
    public static final int $stable;
    public static final InternalChainAddressNew$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InternalChainAddressNew$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InternalChainAddressNew$$serializer internalChainAddressNew$$serializer = new InternalChainAddressNew$$serializer();
        INSTANCE = internalChainAddressNew$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.InternalChainAddressNew", internalChainAddressNew$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("eoaAddress", true);
        pluginGeneratedSerialDescriptor.addElement("proxyAddres", true);
        pluginGeneratedSerialDescriptor.addElement("addressType", false);
        pluginGeneratedSerialDescriptor.addElement("isDefault", false);
        pluginGeneratedSerialDescriptor.addElement("baseSignChainIndex", true);
        pluginGeneratedSerialDescriptor.addElement("baseChainSign", true);
        pluginGeneratedSerialDescriptor.addElement("chainPubKey", true);
        pluginGeneratedSerialDescriptor.addElement("chainSign", true);
        pluginGeneratedSerialDescriptor.addElement("chainIndexList", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InternalChainAddressNew.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[9]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InternalChainAddressNew deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        int i;
        String str;
        String str2;
        Long l;
        int i2;
        String str3;
        String str4;
        int i3;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InternalChainAddressNew.$childSerializers;
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str6 = strDecodeStringElement4;
            str4 = str7;
            l = l2;
            str5 = strDecodeStringElement5;
            i2 = iDecodeIntElement2;
            str3 = strDecodeStringElement3;
            i = 1023;
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            i3 = iDecodeIntElement;
        } else {
            ArrayList arrayList2 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            boolean z = true;
            Long l3 = null;
            int iDecodeIntElement4 = 0;
            String str8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 7;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 = 7;
                        break;
                    case 1:
                        i5 |= 2;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 = 7;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 7;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        i5 |= 32;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l3);
                        break;
                    case 6:
                        i5 |= 64;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str8);
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    case 9:
                        i5 |= 512;
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], arrayList2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            arrayList = arrayList2;
            i = i5;
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement10;
            l = l3;
            i2 = iDecodeIntElement4;
            str3 = strDecodeStringElement6;
            str4 = str8;
            i3 = iDecodeIntElement3;
            String str9 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            str6 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InternalChainAddressNew(i, str2, str, str3, i3, i2, l, str4, str6, str5, arrayList, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InternalChainAddressNew internalChainAddressNew) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(internalChainAddressNew, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InternalChainAddressNew.write$Self$OKWallet_wallet_impl(internalChainAddressNew, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
