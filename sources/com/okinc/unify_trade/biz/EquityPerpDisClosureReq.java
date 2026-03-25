package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class EquityPerpDisClosureReq {
    private String equityPerpDisclosure;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EquityPerpDisClosureReq copy$default(EquityPerpDisClosureReq equityPerpDisClosureReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityPerpDisClosureReq.equityPerpDisclosure;
        }
        return equityPerpDisClosureReq.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.equityPerpDisclosure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EquityPerpDisClosureReq copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EquityPerpDisClosureReq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EquityPerpDisClosureReq) && Intrinsics.EZpvd((Object) this.equityPerpDisclosure, (Object) ((EquityPerpDisClosureReq) obj).equityPerpDisclosure);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEquityPerpDisclosure() {
        return this.equityPerpDisclosure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.equityPerpDisclosure.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEquityPerpDisclosure(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.equityPerpDisclosure = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EquityPerpDisClosureReq(equityPerpDisclosure=" + this.equityPerpDisclosure + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.EquityPerpDisClosureReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EquityPerpDisClosureReq> serializer() {
            return EquityPerpDisClosureReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EquityPerpDisClosureReq(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EquityPerpDisClosureReq$$serializer.INSTANCE.getDescriptor());
        }
        this.equityPerpDisclosure = str;
    }

    public EquityPerpDisClosureReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.equityPerpDisclosure = str;
    }
}
