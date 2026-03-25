package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ResetMpcBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String accountName;
    private final String data;
    private final String encKey;
    private final int funcType;
    private final String mpcId;
    private final String oldMpcId;
    private final int step;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.funcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.oldMpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMpcBody copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ResetMpcBody(i, str, str2, str3, str4, str5, str6, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetMpcBody)) {
            return false;
        }
        ResetMpcBody resetMpcBody = (ResetMpcBody) obj;
        return this.funcType == resetMpcBody.funcType && Intrinsics.EZpvd((Object) this.encKey, (Object) resetMpcBody.encKey) && Intrinsics.EZpvd((Object) this.accountId, (Object) resetMpcBody.accountId) && Intrinsics.EZpvd((Object) this.accountName, (Object) resetMpcBody.accountName) && Intrinsics.EZpvd((Object) this.mpcId, (Object) resetMpcBody.mpcId) && Intrinsics.EZpvd((Object) this.oldMpcId, (Object) resetMpcBody.oldMpcId) && Intrinsics.EZpvd((Object) this.data, (Object) resetMpcBody.data) && this.step == resetMpcBody.step;
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
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncKey() {
        return this.encKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFuncType() {
        return this.funcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldMpcId() {
        return this.oldMpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.funcType) * 31) + this.encKey.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.accountName.hashCode()) * 31) + this.mpcId.hashCode()) * 31) + this.oldMpcId.hashCode()) * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.step);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMpcBody(funcType=" + this.funcType + ", encKey=" + this.encKey + ", accountId=" + this.accountId + ", accountName=" + this.accountName + ", mpcId=" + this.mpcId + ", oldMpcId=" + this.oldMpcId + ", data=" + this.data + ", step=" + this.step + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ResetMpcBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResetMpcBody> serializer() {
            return ResetMpcBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ResetMpcBody(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, ResetMpcBody$$serializer.INSTANCE.getDescriptor());
        }
        this.funcType = i2;
        this.encKey = str;
        this.accountId = str2;
        this.accountName = str3;
        this.mpcId = str4;
        this.oldMpcId = str5;
        this.data = str6;
        this.step = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ResetMpcBody resetMpcBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, resetMpcBody.funcType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, resetMpcBody.encKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, resetMpcBody.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, resetMpcBody.accountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, resetMpcBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, resetMpcBody.oldMpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, resetMpcBody.data);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, resetMpcBody.step);
    }

    public ResetMpcBody(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.funcType = i;
        this.encKey = str;
        this.accountId = str2;
        this.accountName = str3;
        this.mpcId = str4;
        this.oldMpcId = str5;
        this.data = str6;
        this.step = i2;
    }
}
