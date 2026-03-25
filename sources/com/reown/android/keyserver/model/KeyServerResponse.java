package com.reown.android.keyserver.model;

import com.reown.android.internal.common.signing.cacao.Cacao;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class KeyServerResponse {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.keyserver.model.KeyServerResponse.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ KeyServerResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KeyServerResponse() {
    }

    @JsonClass(generateAdapter = true)
    public static final class ResolveInvite extends KeyServerResponse {
        public final String inviteKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolveInvite copy$default(ResolveInvite resolveInvite, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resolveInvite.inviteKey;
            }
            return resolveInvite.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.inviteKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolveInvite copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ResolveInvite(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolveInvite) && Intrinsics.EZpvd((Object) this.inviteKey, (Object) ((ResolveInvite) obj).inviteKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInviteKey() {
            return this.inviteKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.inviteKey.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResolveInvite(inviteKey=" + this.inviteKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolveInvite(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.inviteKey = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class ResolveIdentity extends KeyServerResponse {
        public final Cacao cacao;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResolveIdentity copy$default(ResolveIdentity resolveIdentity, Cacao cacao, int i, Object obj) {
            if ((i & 1) != 0) {
                cacao = resolveIdentity.cacao;
            }
            return resolveIdentity.copy(cacao);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Cacao component1() {
            return this.cacao;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResolveIdentity copy(@NotNull Cacao cacao) {
            Intrinsics.checkNotNullParameter(cacao, "");
            return new ResolveIdentity(cacao);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResolveIdentity) && Intrinsics.EZpvd(this.cacao, ((ResolveIdentity) obj).cacao);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Cacao getCacao() {
            return this.cacao;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.cacao.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResolveIdentity(cacao=" + this.cacao + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolveIdentity(@NotNull Cacao cacao) {
            super(null);
            Intrinsics.checkNotNullParameter(cacao, "");
            this.cacao = cacao;
        }
    }
}
