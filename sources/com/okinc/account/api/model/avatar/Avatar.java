package com.okinc.account.api.model.avatar;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class Avatar {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String preDefinedAvatarFullUrl;
    private final int preDefinedAvatarId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Avatar() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = avatar.preDefinedAvatarFullUrl;
        }
        if ((i2 & 2) != 0) {
            i = avatar.preDefinedAvatarId;
        }
        return avatar.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.preDefinedAvatarFullUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.preDefinedAvatarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Avatar copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Avatar(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.EZpvd((Object) this.preDefinedAvatarFullUrl, (Object) avatar.preDefinedAvatarFullUrl) && this.preDefinedAvatarId == avatar.preDefinedAvatarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreDefinedAvatarFullUrl() {
        return this.preDefinedAvatarFullUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPreDefinedAvatarId() {
        return this.preDefinedAvatarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.preDefinedAvatarFullUrl.hashCode() * 31) + Integer.hashCode(this.preDefinedAvatarId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Avatar(preDefinedAvatarFullUrl=" + this.preDefinedAvatarFullUrl + ", preDefinedAvatarId=" + this.preDefinedAvatarId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.avatar.Avatar.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Avatar> serializer() {
            return Avatar$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Avatar(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.preDefinedAvatarFullUrl = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.preDefinedAvatarId = 0;
        } else {
            this.preDefinedAvatarId = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(Avatar avatar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) avatar.preDefinedAvatarFullUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, avatar.preDefinedAvatarFullUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && avatar.preDefinedAvatarId == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, avatar.preDefinedAvatarId);
    }

    public Avatar(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.preDefinedAvatarFullUrl = str;
        this.preDefinedAvatarId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:8) call: com.okinc.account.api.model.avatar.Avatar.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ Avatar(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
