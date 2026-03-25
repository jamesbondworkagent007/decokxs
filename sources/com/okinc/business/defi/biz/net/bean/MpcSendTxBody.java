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
public final class MpcSendTxBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final String encKey;
    private final int funcType;
    private final String mpcId;
    private final int signType;
    private final int step;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcSendTxBody copy$default(MpcSendTxBody mpcSendTxBody, int i, String str, String str2, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mpcSendTxBody.funcType;
        }
        if ((i4 & 2) != 0) {
            str = mpcSendTxBody.mpcId;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = mpcSendTxBody.data;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = mpcSendTxBody.encKey;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            i2 = mpcSendTxBody.step;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            i3 = mpcSendTxBody.signType;
        }
        return mpcSendTxBody.copy(i, str4, str5, str6, i5, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.funcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.encKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcSendTxBody copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MpcSendTxBody(i, str, str2, str3, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpcSendTxBody)) {
            return false;
        }
        MpcSendTxBody mpcSendTxBody = (MpcSendTxBody) obj;
        return this.funcType == mpcSendTxBody.funcType && Intrinsics.EZpvd((Object) this.mpcId, (Object) mpcSendTxBody.mpcId) && Intrinsics.EZpvd((Object) this.data, (Object) mpcSendTxBody.data) && Intrinsics.EZpvd((Object) this.encKey, (Object) mpcSendTxBody.encKey) && this.step == mpcSendTxBody.step && this.signType == mpcSendTxBody.signType;
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
    public final int getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.funcType) * 31) + this.mpcId.hashCode()) * 31) + this.data.hashCode()) * 31) + this.encKey.hashCode()) * 31) + Integer.hashCode(this.step)) * 31) + Integer.hashCode(this.signType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcSendTxBody(funcType=" + this.funcType + ", mpcId=" + this.mpcId + ", data=" + this.data + ", encKey=" + this.encKey + ", step=" + this.step + ", signType=" + this.signType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.MpcSendTxBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpcSendTxBody> serializer() {
            return MpcSendTxBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpcSendTxBody(int i, int i2, String str, String str2, String str3, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, MpcSendTxBody$$serializer.INSTANCE.getDescriptor());
        }
        this.funcType = i2;
        this.mpcId = str;
        this.data = str2;
        this.encKey = str3;
        this.step = i3;
        this.signType = i4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MpcSendTxBody mpcSendTxBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, mpcSendTxBody.funcType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, mpcSendTxBody.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, mpcSendTxBody.data);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, mpcSendTxBody.encKey);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, mpcSendTxBody.step);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, mpcSendTxBody.signType);
    }

    public MpcSendTxBody(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.funcType = i;
        this.mpcId = str;
        this.data = str2;
        this.encKey = str3;
        this.step = i2;
        this.signType = i3;
    }
}
