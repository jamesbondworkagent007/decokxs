package com.okinc.business.market.data.model.watchlist;

import com.okinc.unify_trade.biz.BotWebHook;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class UpdateFavoriteTokensRequest$$serializer implements GeneratedSerializer<UpdateFavoriteTokensRequest> {
    public static final int $stable;
    public static final UpdateFavoriteTokensRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UpdateFavoriteTokensRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UpdateFavoriteTokensRequest$$serializer updateFavoriteTokensRequest$$serializer = new UpdateFavoriteTokensRequest$$serializer();
        INSTANCE = updateFavoriteTokensRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest", updateFavoriteTokensRequest$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(BotWebHook.KEY_ACTION, false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("userUniqueId", false);
        pluginGeneratedSerialDescriptor.addElement("tokens", false);
        pluginGeneratedSerialDescriptor.addElement("groupIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = UpdateFavoriteTokensRequest.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, stringSerializer, kSerializerArr[4], BuiltinSerializersKt.getNullable(kSerializerArr[5])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UpdateFavoriteTokensRequest deserialize(@NotNull Decoder decoder) {
        List list;
        List list2;
        FavoriteAction favoriteAction;
        int i;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = UpdateFavoriteTokensRequest.$childSerializers;
        int i2 = 3;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FavoriteAction favoriteAction2 = (FavoriteAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            favoriteAction = favoriteAction2;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 63;
            str3 = strDecodeStringElement2;
            list2 = list3;
        } else {
            boolean z = true;
            int i3 = 0;
            List list4 = null;
            List list5 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            FavoriteAction favoriteAction3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        favoriteAction3 = (FavoriteAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], favoriteAction3);
                        i3 |= 1;
                        i2 = 3;
                        continue;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 4:
                        i3 |= 16;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], list5);
                        break;
                    case 5:
                        i3 |= 32;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list4;
            list2 = list5;
            favoriteAction = favoriteAction3;
            i = i3;
            str = strDecodeStringElement;
            String str4 = strDecodeStringElement6;
            str2 = strDecodeStringElement5;
            str3 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UpdateFavoriteTokensRequest(i, favoriteAction, str3, str2, str, list2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UpdateFavoriteTokensRequest updateFavoriteTokensRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(updateFavoriteTokensRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UpdateFavoriteTokensRequest.KWHzl(updateFavoriteTokensRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
