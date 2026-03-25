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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TeeActivateOperateSuccessState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final boolean autoRenew;
    private final long expirePeriodDay;
    private final long expireTimestamp;
    private final boolean isActive;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeActivateOperateSuccessState copy(boolean z, long j, long j2, boolean z2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TeeActivateOperateSuccessState(z, j, j2, z2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeActivateOperateSuccessState)) {
            return false;
        }
        TeeActivateOperateSuccessState teeActivateOperateSuccessState = (TeeActivateOperateSuccessState) obj;
        return this.isActive == teeActivateOperateSuccessState.isActive && this.expireTimestamp == teeActivateOperateSuccessState.expireTimestamp && this.expirePeriodDay == teeActivateOperateSuccessState.expirePeriodDay && this.autoRenew == teeActivateOperateSuccessState.autoRenew && Intrinsics.EZpvd((Object) this.teeId, (Object) teeActivateOperateSuccessState.teeId) && Intrinsics.EZpvd((Object) this.accountId, (Object) teeActivateOperateSuccessState.accountId);
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
    public final long getExpirePeriodDay() {
        return this.expirePeriodDay;
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
        return (((((((((Boolean.hashCode(this.isActive) * 31) + Long.hashCode(this.expireTimestamp)) * 31) + Long.hashCode(this.expirePeriodDay)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.teeId.hashCode()) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeActivateOperateSuccessState(isActive=" + this.isActive + ", expireTimestamp=" + this.expireTimestamp + ", expirePeriodDay=" + this.expirePeriodDay + ", autoRenew=" + this.autoRenew + ", teeId=" + this.teeId + ", accountId=" + this.accountId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.TeeActivateOperateSuccessState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeActivateOperateSuccessState> serializer() {
            return TeeActivateOperateSuccessState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeActivateOperateSuccessState(int i, boolean z, long j, long j2, boolean z2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, TeeActivateOperateSuccessState$$serializer.INSTANCE.getDescriptor());
        }
        this.isActive = z;
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z2;
        this.teeId = str;
        this.accountId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TeeActivateOperateSuccessState teeActivateOperateSuccessState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, teeActivateOperateSuccessState.isActive);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, teeActivateOperateSuccessState.expireTimestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, teeActivateOperateSuccessState.expirePeriodDay);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, teeActivateOperateSuccessState.autoRenew);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, teeActivateOperateSuccessState.teeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, teeActivateOperateSuccessState.accountId);
    }

    public TeeActivateOperateSuccessState(boolean z, long j, long j2, boolean z2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.isActive = z;
        this.expireTimestamp = j;
        this.expirePeriodDay = j2;
        this.autoRenew = z2;
        this.teeId = str;
        this.accountId = str2;
    }
}
