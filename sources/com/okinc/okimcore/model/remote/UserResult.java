package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int errorCode;
    private final String errorMsg;
    private final boolean isSuccess;
    private final long userUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserResult copy$default(UserResult userResult, long j, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = userResult.userUid;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            z = userResult.isSuccess;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = userResult.errorCode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = userResult.errorMsg;
        }
        return userResult.copy(j2, z2, i3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserResult copy(long j, boolean z, int i, String str) {
        return new UserResult(j, z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserResult)) {
            return false;
        }
        UserResult userResult = (UserResult) obj;
        return this.userUid == userResult.userUid && this.isSuccess == userResult.isSuccess && this.errorCode == userResult.errorCode && Intrinsics.EZpvd((Object) this.errorMsg, (Object) userResult.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.userUid);
        int iHashCode2 = Boolean.hashCode(this.isSuccess);
        int iHashCode3 = Integer.hashCode(this.errorCode);
        String str = this.errorMsg;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserResult(userUid=" + this.userUid + ", isSuccess=" + this.isSuccess + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UserResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserResult> serializer() {
            return UserResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserResult(int i, long j, boolean z, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, UserResult$$serializer.INSTANCE.getDescriptor());
        }
        this.userUid = j;
        this.isSuccess = z;
        this.errorCode = i2;
        this.errorMsg = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UserResult userResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, userResult.userUid);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, userResult.isSuccess);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, userResult.errorCode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userResult.errorMsg);
    }

    public UserResult(long j, boolean z, int i, String str) {
        this.userUid = j;
        this.isSuccess = z;
        this.errorCode = i;
        this.errorMsg = str;
    }
}
