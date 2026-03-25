package com.okinc.business.defi.wallet.passkey.common.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PasskeyWalletAccountInfoRes {
    private final List<PasskeyWalletAccountBean> accountList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PasskeyWalletAccountBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyWalletAccountInfoRes copy$default(PasskeyWalletAccountInfoRes passkeyWalletAccountInfoRes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = passkeyWalletAccountInfoRes.accountList;
        }
        return passkeyWalletAccountInfoRes.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PasskeyWalletAccountBean> component1() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletAccountInfoRes copy(@NotNull List<PasskeyWalletAccountBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PasskeyWalletAccountInfoRes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasskeyWalletAccountInfoRes) && Intrinsics.EZpvd(this.accountList, ((PasskeyWalletAccountInfoRes) obj).accountList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PasskeyWalletAccountBean> getAccountList() {
        return this.accountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.accountList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletAccountInfoRes(accountList=" + this.accountList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletAccountInfoRes> serializer() {
            return PasskeyWalletAccountInfoRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletAccountInfoRes(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyWalletAccountInfoRes$$serializer.INSTANCE.getDescriptor());
        }
        this.accountList = list;
    }

    public PasskeyWalletAccountInfoRes(@NotNull List<PasskeyWalletAccountBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountList = list;
    }
}
