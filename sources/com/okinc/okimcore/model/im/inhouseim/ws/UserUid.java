package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserUid {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long updateTime;
    public final String userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserUid copy$default(UserUid userUid, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userUid.userUid;
        }
        if ((i & 2) != 0) {
            j = userUid.updateTime;
        }
        return userUid.KWHzl(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserUid KWHzl(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UserUid(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserUid)) {
            return false;
        }
        UserUid userUid = (UserUid) obj;
        return Intrinsics.EZpvd((Object) this.userUid, (Object) userUid.userUid) && this.updateTime == userUid.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userUid.hashCode() * 31) + Long.hashCode(this.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserUid(userUid=" + this.userUid + ", updateTime=" + this.updateTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.UserUid.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserUid> serializer() {
            return UserUid$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserUid(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UserUid$$serializer.INSTANCE.getDescriptor());
        }
        this.userUid = str;
        this.updateTime = j;
    }

    public static final /* synthetic */ void EZpvd(UserUid userUid, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, userUid.userUid);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, userUid.updateTime);
    }

    public UserUid(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUid = str;
        this.updateTime = j;
    }
}
