package com.okinc.business.market.features.jwt.domain.model;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class BtcHex {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String from;
    private final BtcHexOptionJson options;
    private final String signStr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BtcHex copy$default(BtcHex btcHex, String str, BtcHexOptionJson btcHexOptionJson, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = btcHex.signStr;
        }
        if ((i & 2) != 0) {
            btcHexOptionJson = btcHex.options;
        }
        if ((i & 4) != 0) {
            str2 = btcHex.from;
        }
        return btcHex.copy(str, btcHexOptionJson, str2);
    }

    @SerialName("from")
    public static /* synthetic */ void getFrom$annotations() {
    }

    @SerialName("options")
    public static /* synthetic */ void getOptions$annotations() {
    }

    @SerialName("signStr")
    public static /* synthetic */ void getSignStr$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcHexOptionJson component2() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcHex copy(@NotNull String str, @NotNull BtcHexOptionJson btcHexOptionJson, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(btcHexOptionJson, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BtcHex(str, btcHexOptionJson, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BtcHex)) {
            return false;
        }
        BtcHex btcHex = (BtcHex) obj;
        return Intrinsics.EZpvd((Object) this.signStr, (Object) btcHex.signStr) && Intrinsics.EZpvd(this.options, btcHex.options) && Intrinsics.EZpvd((Object) this.from, (Object) btcHex.from);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcHexOptionJson getOptions() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignStr() {
        return this.signStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.signStr.hashCode() * 31) + this.options.hashCode()) * 31) + this.from.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcHex(signStr=" + this.signStr + ", options=" + this.options + ", from=" + this.from + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.model.BtcHex.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BtcHex> serializer() {
            return BtcHex$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BtcHex(int i, String str, BtcHexOptionJson btcHexOptionJson, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BtcHex$$serializer.INSTANCE.getDescriptor());
        }
        this.signStr = str;
        this.options = btcHexOptionJson;
        this.from = str2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BtcHex btcHex, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, btcHex.signStr);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, BtcHexOptionJson$$serializer.INSTANCE, btcHex.options);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, btcHex.from);
    }

    public BtcHex(@NotNull String str, @NotNull BtcHexOptionJson btcHexOptionJson, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(btcHexOptionJson, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.signStr = str;
        this.options = btcHexOptionJson;
        this.from = str2;
    }
}
