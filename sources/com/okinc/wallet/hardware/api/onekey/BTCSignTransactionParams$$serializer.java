package com.okinc.wallet.hardware.api.onekey;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class BTCSignTransactionParams$$serializer implements GeneratedSerializer<BTCSignTransactionParams> {
    public static final int $stable;
    public static final BTCSignTransactionParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BTCSignTransactionParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BTCSignTransactionParams$$serializer bTCSignTransactionParams$$serializer = new BTCSignTransactionParams$$serializer();
        INSTANCE = bTCSignTransactionParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams", bTCSignTransactionParams$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("coin", false);
        pluginGeneratedSerialDescriptor.addElement("inputs", false);
        pluginGeneratedSerialDescriptor.addElement("outputs", false);
        pluginGeneratedSerialDescriptor.addElement("refTxs", false);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.Account.KEY_ACCOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("locktime", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("expiry", true);
        pluginGeneratedSerialDescriptor.addElement("overwintered", true);
        pluginGeneratedSerialDescriptor.addElement("versionGroupId", true);
        pluginGeneratedSerialDescriptor.addElement("branchId", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = BTCSignTransactionParams.$childSerializers;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], BuiltinSerializersKt.getNullable(Account$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BTCSignTransactionParams deserialize(@NotNull Decoder decoder) {
        Long l;
        List list;
        Long l2;
        Boolean bool;
        Long l3;
        Long l4;
        Account account;
        Long l5;
        List list2;
        int i;
        List list3;
        Long l6;
        String str;
        List list4;
        List list5;
        KSerializer[] kSerializerArr;
        List list6;
        List list7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = BTCSignTransactionParams.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        Long l7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], null);
            List list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr2[2], null);
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], null);
            Account account2 = (Account) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Account$$serializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            Long l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, null);
            Long l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            Long l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, longSerializer, null);
            Long l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, longSerializer, null);
            i = 4095;
            list = list10;
            l4 = l13;
            l = l12;
            l3 = l11;
            l2 = l10;
            l6 = l9;
            l5 = l8;
            bool = bool2;
            account = account2;
            list3 = list9;
            list2 = list8;
            str = strDecodeStringElement;
        } else {
            int i4 = 11;
            Long l14 = null;
            Boolean bool3 = null;
            Long l15 = null;
            Long l16 = null;
            Account account3 = null;
            List list11 = null;
            String strDecodeStringElement2 = null;
            List list12 = null;
            List list13 = null;
            int i5 = 0;
            boolean z = true;
            Long l17 = null;
            Long l18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        list4 = list11;
                        list5 = list13;
                        kSerializerArr = kSerializerArr2;
                        list6 = list12;
                        z = false;
                        list12 = list6;
                        list13 = list5;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        list11 = list4;
                        break;
                    case 0:
                        list4 = list11;
                        list5 = list13;
                        kSerializerArr = kSerializerArr2;
                        list6 = list12;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        list12 = list6;
                        list13 = list5;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        list11 = list4;
                        break;
                    case 1:
                        list4 = list11;
                        kSerializerArr = kSerializerArr2;
                        list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr2[1], list12);
                        i5 |= 2;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        list11 = list4;
                        break;
                    case 2:
                        list7 = list13;
                        i5 |= 4;
                        list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr2[2], list11);
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        i5 |= 8;
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr2[3], list13);
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        i5 |= 16;
                        account3 = (Account) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Account$$serializer.INSTANCE, account3);
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        i5 |= 32;
                        l18 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l18);
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        i5 |= 64;
                        l17 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l17);
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 7:
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, l14);
                        i5 |= 128;
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool3);
                        i5 |= 256;
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 9:
                        i5 |= 512;
                        l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, LongSerializer.INSTANCE, l15);
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 10:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l7);
                        i5 |= 1024;
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 11:
                        i5 |= 2048;
                        l16 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, LongSerializer.INSTANCE, l16);
                        list7 = list13;
                        list13 = list7;
                        i4 = 11;
                        i2 = 10;
                        i3 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list14 = list11;
            List list15 = list12;
            l = l7;
            list = list13;
            l2 = l14;
            bool = bool3;
            l3 = l15;
            l4 = l16;
            account = account3;
            l5 = l18;
            list2 = list15;
            i = i5;
            list3 = list14;
            String str2 = strDecodeStringElement2;
            l6 = l17;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BTCSignTransactionParams(i, str, list2, list3, list, account, l5, l6, l2, bool, l3, l, l4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BTCSignTransactionParams bTCSignTransactionParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bTCSignTransactionParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BTCSignTransactionParams.write$Self$OKHardwareWallet_hardware_wallet_api(bTCSignTransactionParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
