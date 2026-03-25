package com.okinc.business.defi.biz.core.transaction.sign.ton.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonInputData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String body;
    private final boolean ignoreCheckSig;
    private final String initCode;
    private final String initData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonInputData copy$default(TonInputData tonInputData, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonInputData.address;
        }
        if ((i & 2) != 0) {
            str2 = tonInputData.body;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = tonInputData.initCode;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = tonInputData.initData;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = tonInputData.ignoreCheckSig;
        }
        return tonInputData.copy(str, str5, str6, str7, z);
    }

    @SerialName(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName("ignore_chksig")
    public static /* synthetic */ void getIgnoreCheckSig$annotations() {
    }

    @SerialName("init_code")
    public static /* synthetic */ void getInitCode$annotations() {
    }

    @SerialName("init_data")
    public static /* synthetic */ void getInitData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.initData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.ignoreCheckSig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonInputData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TonInputData(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonInputData)) {
            return false;
        }
        TonInputData tonInputData = (TonInputData) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) tonInputData.address) && Intrinsics.EZpvd((Object) this.body, (Object) tonInputData.body) && Intrinsics.EZpvd((Object) this.initCode, (Object) tonInputData.initCode) && Intrinsics.EZpvd((Object) this.initData, (Object) tonInputData.initData) && this.ignoreCheckSig == tonInputData.ignoreCheckSig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIgnoreCheckSig() {
        return this.ignoreCheckSig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCode() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.address.hashCode() * 31) + this.body.hashCode()) * 31) + this.initCode.hashCode()) * 31) + this.initData.hashCode()) * 31) + Boolean.hashCode(this.ignoreCheckSig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonInputData(address=" + this.address + ", body=" + this.body + ", initCode=" + this.initCode + ", initData=" + this.initData + ", ignoreCheckSig=" + this.ignoreCheckSig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonInputData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonInputData> serializer() {
            return TonInputData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonInputData(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TonInputData$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.body = str2;
        this.initCode = str3;
        this.initData = str4;
        this.ignoreCheckSig = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonInputData tonInputData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonInputData.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonInputData.body);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonInputData.initCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonInputData.initData);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, tonInputData.ignoreCheckSig);
    }

    public TonInputData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.address = str;
        this.body = str2;
        this.initCode = str3;
        this.initData = str4;
        this.ignoreCheckSig = z;
    }
}
