package com.okinc.assets.backend.api.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.assets.backend.api.model.BalancePortfolio;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class BalancePortfolio$Account$$serializer implements GeneratedSerializer<BalancePortfolio.Account> {
    public static final int $stable;
    public static final BalancePortfolio$Account$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BalancePortfolio$Account$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BalancePortfolio$Account$$serializer balancePortfolio$Account$$serializer = new BalancePortfolio$Account$$serializer();
        INSTANCE = balancePortfolio$Account$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.assets.backend.api.model.BalancePortfolio.Account", balancePortfolio$Account$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(TypedValues.AttributesType.S_TARGET, false);
        pluginGeneratedSerialDescriptor.addElement("valuation", false);
        pluginGeneratedSerialDescriptor.addElement("rate", false);
        pluginGeneratedSerialDescriptor.addElement("canDeposit", true);
        pluginGeneratedSerialDescriptor.addElement("canWithdraw", true);
        pluginGeneratedSerialDescriptor.addElement("canTransfer", true);
        pluginGeneratedSerialDescriptor.addElement("canBuy", true);
        pluginGeneratedSerialDescriptor.addElement("canTrade", true);
        pluginGeneratedSerialDescriptor.addElement("canEarn", true);
        pluginGeneratedSerialDescriptor.addElement("canLoan", true);
        pluginGeneratedSerialDescriptor.addElement("canReserve", true);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.Notification.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("sortOrder", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BalancePortfolio.Account deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        String str;
        String str2;
        Boolean bool8;
        int i;
        String str3;
        int i2;
        Boolean bool9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Boolean bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            bool5 = bool17;
            bool3 = bool16;
            bool7 = bool14;
            bool8 = bool13;
            bool6 = bool12;
            bool = bool10;
            bool2 = bool15;
            bool4 = bool11;
            str = strDecodeStringElement2;
            i = 8191;
            str2 = strDecodeStringElement;
            i2 = iDecodeIntElement2;
        } else {
            int i5 = 12;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            String strDecodeStringElement3 = null;
            Boolean bool24 = null;
            String strDecodeStringElement4 = null;
            int i6 = 0;
            iDecodeIntElement = 0;
            boolean z = true;
            Boolean bool25 = null;
            int iDecodeIntElement3 = 0;
            String str4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool9 = bool24;
                        z = false;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 0:
                        bool9 = bool24;
                        i6 |= 1;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 1:
                        bool9 = bool24;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 2:
                        bool9 = bool24;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 3:
                        bool9 = bool24;
                        bool23 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool23);
                        i6 |= 8;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 4:
                        bool9 = bool24;
                        bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool20);
                        i6 |= 16;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 5:
                        bool9 = bool24;
                        bool22 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool22);
                        i6 |= 32;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 6:
                        bool24 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool24);
                        i6 |= 64;
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 7:
                        bool25 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool25);
                        i6 |= 128;
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 8:
                        bool18 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool18);
                        i6 |= 256;
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 9:
                        bool19 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool19);
                        i6 |= 512;
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 10:
                        bool21 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool21);
                        i6 |= 1024;
                        break;
                    case 11:
                        i6 |= 2048;
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str4);
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    case 12:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i6 |= 4096;
                        bool9 = bool24;
                        bool24 = bool9;
                        i5 = 12;
                        i3 = 11;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool26 = bool24;
            bool = bool23;
            bool2 = bool18;
            bool3 = bool19;
            bool4 = bool20;
            bool5 = bool21;
            bool6 = bool22;
            bool7 = bool25;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            bool8 = bool26;
            i = i6;
            str3 = str4;
            i2 = iDecodeIntElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BalancePortfolio.Account(i, i2, str2, str, bool, bool4, bool6, bool8, bool7, bool2, bool3, bool5, str3, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BalancePortfolio.Account account) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(account, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BalancePortfolio.Account.write$Self$OKAssets_assets_pro_api(account, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
