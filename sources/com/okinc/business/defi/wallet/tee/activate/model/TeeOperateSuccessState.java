package com.okinc.business.defi.wallet.tee.activate.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeOperateSuccessState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final boolean autoRenew;
    private final long expireTimestamp;
    private final boolean isActive;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeOperateSuccessState copy$default(TeeOperateSuccessState teeOperateSuccessState, long j, boolean z, String str, String str2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = teeOperateSuccessState.expireTimestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = teeOperateSuccessState.autoRenew;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            str = teeOperateSuccessState.teeId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = teeOperateSuccessState.accountId;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z2 = teeOperateSuccessState.isActive;
        }
        return teeOperateSuccessState.copy(j2, z3, str3, str4, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeOperateSuccessState copy(long j, boolean z, @NotNull String str, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TeeOperateSuccessState(j, z, str, str2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeOperateSuccessState)) {
            return false;
        }
        TeeOperateSuccessState teeOperateSuccessState = (TeeOperateSuccessState) obj;
        return this.expireTimestamp == teeOperateSuccessState.expireTimestamp && this.autoRenew == teeOperateSuccessState.autoRenew && Intrinsics.EZpvd((Object) this.teeId, (Object) teeOperateSuccessState.teeId) && Intrinsics.EZpvd((Object) this.accountId, (Object) teeOperateSuccessState.accountId) && this.isActive == teeOperateSuccessState.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.expireTimestamp) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.teeId.hashCode()) * 31) + this.accountId.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeOperateSuccessState(expireTimestamp=" + this.expireTimestamp + ", autoRenew=" + this.autoRenew + ", teeId=" + this.teeId + ", accountId=" + this.accountId + ", isActive=" + this.isActive + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeOperateSuccessState> serializer() {
            return TeeOperateSuccessState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeOperateSuccessState(int i, long j, boolean z, String str, String str2, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TeeOperateSuccessState$$serializer.INSTANCE.getDescriptor());
        }
        this.expireTimestamp = j;
        this.autoRenew = z;
        this.teeId = str;
        this.accountId = str2;
        this.isActive = z2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TeeOperateSuccessState teeOperateSuccessState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, teeOperateSuccessState.expireTimestamp);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, teeOperateSuccessState.autoRenew);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, teeOperateSuccessState.teeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, teeOperateSuccessState.accountId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, teeOperateSuccessState.isActive);
    }

    public TeeOperateSuccessState(long j, boolean z, @NotNull String str, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.expireTimestamp = j;
        this.autoRenew = z;
        this.teeId = str;
        this.accountId = str2;
        this.isActive = z2;
    }
}
