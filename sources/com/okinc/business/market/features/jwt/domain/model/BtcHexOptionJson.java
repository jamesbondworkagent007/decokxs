package com.okinc.business.market.features.jwt.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class BtcHexOptionJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String from;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BtcHexOptionJson copy$default(BtcHexOptionJson btcHexOptionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = btcHexOptionJson.from;
        }
        return btcHexOptionJson.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcHexOptionJson EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BtcHexOptionJson(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BtcHexOptionJson) && Intrinsics.EZpvd((Object) this.from, (Object) ((BtcHexOptionJson) obj).from);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.from.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcHexOptionJson(from=" + this.from + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.model.BtcHexOptionJson.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BtcHexOptionJson> serializer() {
            return BtcHexOptionJson$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BtcHexOptionJson(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BtcHexOptionJson$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
    }

    public BtcHexOptionJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }
}
