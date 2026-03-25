package com.okinc.business.defi.wallet.tee.activate.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC17786fSf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class TeeCreated extends AbstractC17786fSf {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String accountName;
    private final long expireTimestamp;
    private final boolean isActive;
    private final String teeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeCreated copy$default(TeeCreated teeCreated, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeCreated.teeId;
        }
        if ((i & 2) != 0) {
            str2 = teeCreated.accountName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = teeCreated.accountId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = teeCreated.isActive;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            j = teeCreated.expireTimestamp;
        }
        return teeCreated.copy(str, str4, str5, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeCreated copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TeeCreated(str, str2, str3, z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeCreated)) {
            return false;
        }
        TeeCreated teeCreated = (TeeCreated) obj;
        return Intrinsics.EZpvd((Object) this.teeId, (Object) teeCreated.teeId) && Intrinsics.EZpvd((Object) this.accountName, (Object) teeCreated.accountName) && Intrinsics.EZpvd((Object) this.accountId, (Object) teeCreated.accountId) && this.isActive == teeCreated.isActive && this.expireTimestamp == teeCreated.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
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
        return (((((((this.teeId.hashCode() * 31) + this.accountName.hashCode()) * 31) + this.accountId.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + Long.hashCode(this.expireTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeCreated(teeId=" + this.teeId + ", accountName=" + this.accountName + ", accountId=" + this.accountId + ", isActive=" + this.isActive + ", expireTimestamp=" + this.expireTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.TeeCreated.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeCreated> serializer() {
            return TeeCreated$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeeCreated(int i, String str, String str2, String str3, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TeeCreated$$serializer.INSTANCE.getDescriptor());
        }
        this.teeId = str;
        this.accountName = str2;
        this.accountId = str3;
        this.isActive = z;
        this.expireTimestamp = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TeeCreated teeCreated, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, teeCreated.teeId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, teeCreated.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, teeCreated.accountId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, teeCreated.isActive);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, teeCreated.expireTimestamp);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeCreated(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.teeId = str;
        this.accountName = str2;
        this.accountId = str3;
        this.isActive = z;
        this.expireTimestamp = j;
    }
}
