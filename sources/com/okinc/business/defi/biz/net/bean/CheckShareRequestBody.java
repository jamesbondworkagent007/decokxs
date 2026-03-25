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
public final class CheckShareRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String mpcId;
    private final String shareSign;
    private final String shareTxt;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckShareRequestBody copy$default(CheckShareRequestBody checkShareRequestBody, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = checkShareRequestBody.mpcId;
        }
        if ((i2 & 2) != 0) {
            i = checkShareRequestBody.type;
        }
        if ((i2 & 4) != 0) {
            str2 = checkShareRequestBody.shareTxt;
        }
        if ((i2 & 8) != 0) {
            str3 = checkShareRequestBody.shareSign;
        }
        return checkShareRequestBody.copy(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shareTxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.shareSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckShareRequestBody copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CheckShareRequestBody(str, i, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckShareRequestBody)) {
            return false;
        }
        CheckShareRequestBody checkShareRequestBody = (CheckShareRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) checkShareRequestBody.mpcId) && this.type == checkShareRequestBody.type && Intrinsics.EZpvd((Object) this.shareTxt, (Object) checkShareRequestBody.shareTxt) && Intrinsics.EZpvd((Object) this.shareSign, (Object) checkShareRequestBody.shareSign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareSign() {
        return this.shareSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareTxt() {
        return this.shareTxt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mpcId.hashCode() * 31) + Integer.hashCode(this.type)) * 31) + this.shareTxt.hashCode()) * 31) + this.shareSign.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckShareRequestBody(mpcId=" + this.mpcId + ", type=" + this.type + ", shareTxt=" + this.shareTxt + ", shareSign=" + this.shareSign + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckShareRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckShareRequestBody> serializer() {
            return CheckShareRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckShareRequestBody(int i, String str, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CheckShareRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.type = i2;
        this.shareTxt = str2;
        this.shareSign = str3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckShareRequestBody checkShareRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkShareRequestBody.mpcId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, checkShareRequestBody.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, checkShareRequestBody.shareTxt);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, checkShareRequestBody.shareSign);
    }

    public CheckShareRequestBody(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.mpcId = str;
        this.type = i;
        this.shareTxt = str2;
        this.shareSign = str3;
    }
}
