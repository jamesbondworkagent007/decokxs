package o;

import aws.smithy.kotlin.runtime.serde.json.LexerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EZ {
    public final java.util.List<LexerState> AEQbTJ;
    public final java.util.List<Function1<java.util.List<LexerState>, Unit>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EZ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.EZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EZ copy$default(EZ ez, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = ez.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = ez.copydefault;
        }
        return ez.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EZ EZpvd(@NotNull java.util.List<LexerState> list, @NotNull java.util.List<Function1<java.util.List<LexerState>, Unit>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new EZ(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EZ)) {
            return false;
        }
        EZ ez = (EZ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, ez.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, ez.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StateManager(state=" + this.AEQbTJ + ", pendingMutations=" + this.copydefault + ')';
    }

    public EZ(@NotNull java.util.List<LexerState> list, @NotNull java.util.List<Function1<java.util.List<LexerState>, Unit>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = list;
        this.copydefault = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE 
  (wrap:aws.smithy.kotlin.runtime.serde.json.LexerState[]:0x0006: FILLED_NEW_ARRAY 
  (wrap:aws.smithy.kotlin.runtime.serde.json.LexerState:0x0004: SGET  A[WRAPPED] (LINE:25) aws.smithy.kotlin.runtime.serde.json.LexerState.Initial aws.smithy.kotlin.runtime.serde.json.LexerState)
 A[WRAPPED] (LINE:25) elemType: aws.smithy.kotlin.runtime.serde.json.LexerState)
 STATIC call: o.yDY.AhwBna(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:25)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:26) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.util.List<aws.smithy.kotlin.runtime.serde.json.LexerState>, java.util.List<kotlin.jvm.functions.Function1<java.util.List<aws.smithy.kotlin.runtime.serde.json.LexerState>, kotlin.Unit>>):void (m)] (LINE:24) call: o.EZ.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ EZ(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna(LexerState.Initial) : list, (i & 2) != 0 ? new java.util.ArrayList() : list2);
    }

    public final int AEQbTJ() {
        return this.AEQbTJ.size();
    }

    public final LexerState KWHzl() {
        return (LexerState) C56455yG.EZpvd(this.AEQbTJ);
    }

    public final void AEQbTJ(@NotNull Function1<? super java.util.List<LexerState>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.add(function1);
    }

    public final void OLrzqt() {
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.AEQbTJ);
        }
        this.copydefault.clear();
    }
}
