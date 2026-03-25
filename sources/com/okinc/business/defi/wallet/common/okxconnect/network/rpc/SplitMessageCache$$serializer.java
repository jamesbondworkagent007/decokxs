package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import com.reown.android.push.notifications.PushMessagingService;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
public final /* synthetic */ class SplitMessageCache$$serializer implements GeneratedSerializer<SplitMessageCache> {
    public static final int $stable;
    public static final SplitMessageCache$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SplitMessageCache$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SplitMessageCache$$serializer splitMessageCache$$serializer = new SplitMessageCache$$serializer();
        INSTANCE = splitMessageCache$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache", splitMessageCache$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(PushMessagingService.KEY_TOPIC, false);
        pluginGeneratedSerialDescriptor.addElement("packageGroupId", false);
        pluginGeneratedSerialDescriptor.addElement("totalCount", false);
        pluginGeneratedSerialDescriptor.addElement("packages", false);
        pluginGeneratedSerialDescriptor.addElement("sentPackages", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SplitMessageCache.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.INSTANCE, kSerializerArr[3], kSerializerArr[4], LongSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SplitMessageCache deserialize(@NotNull Decoder decoder) {
        int i;
        long jDecodeLongElement;
        Set set;
        int i2;
        String str;
        String str2;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SplitMessageCache.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            set = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            str2 = strDecodeStringElement;
            i2 = iDecodeIntElement;
            list = list2;
            str = strDecodeStringElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            i = 63;
        } else {
            Set set2 = null;
            String strDecodeStringElement3 = null;
            int i3 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement4 = null;
            List list3 = null;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        i3 |= 8;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        break;
                    case 4:
                        i3 |= 16;
                        set2 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], set2);
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            jDecodeLongElement = jDecodeLongElement2;
            set = set2;
            i2 = iDecodeIntElement2;
            List list4 = list3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            list = list4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SplitMessageCache(i, str2, str, i2, list, set, jDecodeLongElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SplitMessageCache splitMessageCache) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(splitMessageCache, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SplitMessageCache.write$Self$OKWallet_wallet_impl(splitMessageCache, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
