package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oYu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36357oYu implements InterfaceC49405unt<java.lang.Long, java.lang.Long> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oYs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36357oYu.valueOf();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.oYw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C36357oYu.copydefault(this.copydefault);
        }
    });

    @yCM
    public C36357oYu() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ java.lang.Long AEQbTJ(java.lang.Long l) {
        return KWHzl(l.longValue());
    }

    public java.lang.Long EZpvd(long j) {
        return (java.lang.Long) InterfaceC49405unt.Activity.EZpvd(this, java.lang.Long.valueOf(j));
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj) {
        return EZpvd(((java.lang.Number) obj).longValue());
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.oYu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oYu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final C36246oUr KWHzl() {
        return (C36246oUr) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C36246oUr valueOf() {
        return C36246oUr.copydefault();
    }

    public final oWN AEQbTJ() {
        return (oWN) this.EZpvd.getValue();
    }

    public static final oWN copydefault(C36357oYu c36357oYu) {
        return c36357oYu.KWHzl().DCJXGO().get("ds0");
    }

    public java.lang.Long KWHzl(long j) {
        if (AEQbTJ() != null) {
            return java.lang.Long.valueOf(C33129mqd.valueOf(java.lang.Long.valueOf(j + (((long) C33129mqd.AhwBna(C33129mqd.divS$default(oLT.djBIcL(), 2, null, null, null, 14, null))) * copydefault()))));
        }
        return java.lang.Long.valueOf(j);
    }

    public final long copydefault() {
        int iODWQjV = KWHzl().ODWQjV();
        if (iODWQjV == -1) {
            return 60000L;
        }
        if (iODWQjV != 0) {
            return 1000 * ((long) (KWHzl().ODWQjV() * 60));
        }
        return 1000L;
    }
}
