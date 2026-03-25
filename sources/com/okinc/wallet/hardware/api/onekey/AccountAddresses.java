package com.okinc.wallet.hardware.api.onekey;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AccountAddresses {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<AccountAddress> change;
    private final List<AccountAddress> unused;
    private final List<AccountAddress> used;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountAddress> getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountAddress> getUnused() {
        return this.unused;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountAddress> getUsed() {
        return this.used;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.AccountAddresses.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountAddresses> serializer() {
            return AccountAddresses$$serializer.INSTANCE;
        }
    }

    static {
        AccountAddress$$serializer accountAddress$$serializer = AccountAddress$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(accountAddress$$serializer), new ArrayListSerializer(accountAddress$$serializer), new ArrayListSerializer(accountAddress$$serializer)};
    }

    public /* synthetic */ AccountAddresses(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AccountAddresses$$serializer.INSTANCE.getDescriptor());
        }
        this.change = list;
        this.used = list2;
        this.unused = list3;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(AccountAddresses accountAddresses, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], accountAddresses.change);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], accountAddresses.used);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], accountAddresses.unused);
    }

    public AccountAddresses(@NotNull List<AccountAddress> list, @NotNull List<AccountAddress> list2, @NotNull List<AccountAddress> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.change = list;
        this.used = list2;
        this.unused = list3;
    }
}
