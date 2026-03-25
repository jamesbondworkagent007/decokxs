package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class NewBieUserState {
    private String needReversePosPop;
    private boolean riskReminded;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewBieUserState copy$default(NewBieUserState newBieUserState, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = newBieUserState.riskReminded;
        }
        if ((i & 2) != 0) {
            str = newBieUserState.needReversePosPop;
        }
        if ((i & 4) != 0) {
            str2 = newBieUserState.ts;
        }
        return newBieUserState.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.riskReminded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.needReversePosPop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewBieUserState copy(boolean z, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new NewBieUserState(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewBieUserState)) {
            return false;
        }
        NewBieUserState newBieUserState = (NewBieUserState) obj;
        return this.riskReminded == newBieUserState.riskReminded && Intrinsics.EZpvd((Object) this.needReversePosPop, (Object) newBieUserState.needReversePosPop) && Intrinsics.EZpvd((Object) this.ts, (Object) newBieUserState.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedReversePosPop() {
        return this.needReversePosPop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRiskReminded() {
        return this.riskReminded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.riskReminded);
        String str = this.needReversePosPop;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedReversePosPop(String str) {
        this.needReversePosPop = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskReminded(boolean z) {
        this.riskReminded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewBieUserState(riskReminded=" + this.riskReminded + ", needReversePosPop=" + this.needReversePosPop + ", ts=" + this.ts + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.NewBieUserState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewBieUserState> serializer() {
            return NewBieUserState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewBieUserState(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, NewBieUserState$$serializer.INSTANCE.getDescriptor());
        }
        this.riskReminded = (i & 1) == 0 ? false : z;
        this.needReversePosPop = str;
        if ((i & 4) == 0) {
            this.ts = "";
        } else {
            this.ts = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(NewBieUserState newBieUserState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newBieUserState.riskReminded) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, newBieUserState.riskReminded);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, newBieUserState.needReversePosPop);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) newBieUserState.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, newBieUserState.ts);
    }

    public NewBieUserState(boolean z, String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.riskReminded = z;
        this.needReversePosPop = str;
        this.ts = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String):void (m)] (LINE:297) call: com.okinc.unify_trade.biz.NewBieUserState.<init>(boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewBieUserState(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, (i & 4) != 0 ? "" : str2);
    }
}
