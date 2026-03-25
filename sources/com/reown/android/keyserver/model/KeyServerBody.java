package com.reown.android.keyserver.model;

import com.reown.android.internal.common.signing.cacao.Cacao;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class KeyServerBody {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.keyserver.model.KeyServerBody.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ KeyServerBody(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private KeyServerBody() {
    }

    @JsonClass(generateAdapter = true)
    public static final class UnregisterIdentity extends KeyServerBody {
        public final String idAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnregisterIdentity copy$default(UnregisterIdentity unregisterIdentity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unregisterIdentity.idAuth;
            }
            return unregisterIdentity.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnregisterIdentity copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UnregisterIdentity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnregisterIdentity) && Intrinsics.EZpvd((Object) this.idAuth, (Object) ((UnregisterIdentity) obj).idAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdAuth() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.idAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnregisterIdentity(idAuth=" + this.idAuth + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnregisterIdentity(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.idAuth = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class RegisterIdentity extends KeyServerBody {
        public final Cacao cacao;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterIdentity copy$default(RegisterIdentity registerIdentity, Cacao cacao, int i, Object obj) {
            if ((i & 1) != 0) {
                cacao = registerIdentity.cacao;
            }
            return registerIdentity.copy(cacao);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Cacao component1() {
            return this.cacao;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterIdentity copy(@NotNull Cacao cacao) {
            Intrinsics.checkNotNullParameter(cacao, "");
            return new RegisterIdentity(cacao);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegisterIdentity) && Intrinsics.EZpvd(this.cacao, ((RegisterIdentity) obj).cacao);
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
            return "RegisterIdentity(cacao=" + this.cacao + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterIdentity(@NotNull Cacao cacao) {
            super(null);
            Intrinsics.checkNotNullParameter(cacao, "");
            this.cacao = cacao;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class RegisterInvite extends KeyServerBody {
        public final String idAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RegisterInvite copy$default(RegisterInvite registerInvite, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerInvite.idAuth;
            }
            return registerInvite.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegisterInvite copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RegisterInvite(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegisterInvite) && Intrinsics.EZpvd((Object) this.idAuth, (Object) ((RegisterInvite) obj).idAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdAuth() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.idAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RegisterInvite(idAuth=" + this.idAuth + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegisterInvite(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.idAuth = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UnregisterInvite extends KeyServerBody {
        public final String idAuth;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UnregisterInvite copy$default(UnregisterInvite unregisterInvite, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unregisterInvite.idAuth;
            }
            return unregisterInvite.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnregisterInvite copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UnregisterInvite(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnregisterInvite) && Intrinsics.EZpvd((Object) this.idAuth, (Object) ((UnregisterInvite) obj).idAuth);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIdAuth() {
            return this.idAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.idAuth.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnregisterInvite(idAuth=" + this.idAuth + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnregisterInvite(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.idAuth = str;
        }
    }
}
