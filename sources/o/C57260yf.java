package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DW;
import o.InterfaceC57207ye;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C57260yf implements InterfaceC57207ye {
    public final DW KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DW) A[MD:(o.DW):void (m)] call: o.yf.<init>(o.DW):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C57260yf(DW dw, DefaultConstructorMarker defaultConstructorMarker) {
        this(dw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57207ye
    public DW fetchVPNInfo() {
        return this.KWHzl;
    }

    public C57260yf(DW dw) {
        this.KWHzl = dw;
    }

    /* JADX INFO: renamed from: o.yf$TaskDescription */
    public static final class TaskDescription implements InterfaceC57207ye.StateListAnimator {
        public final HC<DW.Application.ActionBar, DW> OLrzqt = new HC<>(DY.KWHzl, new Function1<DW, Function1<? super DW.Application.ActionBar, ? extends Unit>>() { // from class: aws.smithy.kotlin.runtime.client.RetryStrategyClientConfigImpl$BuilderImpl$retryStrategyProperty$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Function1<DW.Application.ActionBar, Unit> invoke(@NotNull DW dw) {
                Intrinsics.checkNotNullParameter(dw, "");
                return dw.copydefault().OLrzqt();
            }
        }, null, 4, null);

        @Override // o.InterfaceC57207ye.StateListAnimator
        public void KWHzl(DW dw) {
            this.OLrzqt.OLrzqt(dw);
        }

        public InterfaceC57207ye copydefault() {
            return new C57260yf(this.OLrzqt.EZpvd().invoke(), null);
        }
    }
}
