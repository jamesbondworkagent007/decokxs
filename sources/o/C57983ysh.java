package o;

import androidx.lifecycle.LifecycleOwner;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57983ysh implements InterfaceC57918yrV {
    public volatile com.tencent.matrix.lifecycle.State AYXKKw;
    public final ConcurrentHashMap<InterfaceC57916yrT, C57977ysb> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57983ysh() {
        this(false, 1, null);
    }

    public C57983ysh(boolean z) {
        this.copydefault = z;
        this.AYXKKw = com.tencent.matrix.lifecycle.State.INIT;
        this.KWHzl = new ConcurrentHashMap<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:134) call: o.ysh.<init>(boolean):void type: THIS */
    public /* synthetic */ C57983ysh(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // o.InterfaceC57914yrR
    public boolean AEQbTJ() {
        return this.AYXKKw == com.tencent.matrix.lifecycle.State.ON;
    }

    @Override // o.InterfaceC57915yrS
    public void KWHzl(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            C57977ysb c57977ysb = this.KWHzl.get(interfaceC57916yrT);
            if (c57977ysb != null) {
                C57985ysj.OLrzqt(c57977ysb, (LifecycleOwner) null);
            } else {
                this.KWHzl.put(interfaceC57916yrT, new C57977ysb(interfaceC57916yrT, this));
                if (this.copydefault) {
                    Function1<InterfaceC57916yrT, Unit> dispatch = this.AYXKKw.getDispatch();
                    if (dispatch != null) {
                        KWHzl(dispatch, interfaceC57916yrT);
                    }
                } else {
                    Function1<InterfaceC57916yrT, Unit> dispatch2 = this.AYXKKw.getDispatch();
                    if (dispatch2 != null) {
                        dispatch2.invoke(interfaceC57916yrT);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC57915yrS
    public void AEQbTJ(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            this.KWHzl.remove(interfaceC57916yrT);
        }
    }

    public final void valueOf() {
        synchronized (this) {
            com.tencent.matrix.lifecycle.State state = this.AYXKKw;
            com.tencent.matrix.lifecycle.State state2 = com.tencent.matrix.lifecycle.State.ON;
            if (state == state2) {
                return;
            }
            this.AYXKKw = state2;
            EZpvd();
        }
    }

    public final void djBIcL() {
        synchronized (this) {
            com.tencent.matrix.lifecycle.State state = this.AYXKKw;
            com.tencent.matrix.lifecycle.State state2 = com.tencent.matrix.lifecycle.State.OFF;
            if (state == state2) {
                return;
            }
            this.AYXKKw = state2;
            EZpvd();
        }
    }

    public final void KWHzl(final Function1<? super InterfaceC57916yrT, Unit> function1, final InterfaceC57916yrT interfaceC57916yrT) {
        if ((interfaceC57916yrT instanceof InterfaceC57909yrM) && ((InterfaceC57909yrM) interfaceC57916yrT).copydefault()) {
            MatrixLifecycleThread.EZpvd.OLrzqt().post(new java.lang.Runnable() { // from class: o.ysk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57983ysh.copydefault(function1, interfaceC57916yrT);
                }
            });
        } else {
            MatrixLifecycleThread.EZpvd.copydefault().execute(new TaskDescription(function1, interfaceC57916yrT));
        }
    }

    public static final void copydefault(Function1 function1, InterfaceC57916yrT interfaceC57916yrT) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
        function1.invoke(interfaceC57916yrT);
    }

    /* JADX INFO: renamed from: o.ysh$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ InterfaceC57916yrT EZpvd;
        public final /* synthetic */ Function1<InterfaceC57916yrT, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super o.yrT, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super InterfaceC57916yrT, Unit> function1, InterfaceC57916yrT interfaceC57916yrT) {
            this.copydefault = function1;
            this.EZpvd = interfaceC57916yrT;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.copydefault.invoke(this.EZpvd);
        }

        public java.lang.String toString() {
            return java.lang.String.valueOf(this.EZpvd);
        }
    }

    public final void EZpvd() {
        if (this.copydefault) {
            com.tencent.matrix.lifecycle.State state = this.AYXKKw;
            for (Map.Entry<InterfaceC57916yrT, C57977ysb> entry : this.KWHzl.entrySet()) {
                Function1<InterfaceC57916yrT, Unit> dispatch = state.getDispatch();
                if (dispatch != null) {
                    KWHzl(dispatch, entry.getKey());
                }
            }
            return;
        }
        for (Map.Entry<InterfaceC57916yrT, C57977ysb> entry2 : this.KWHzl.entrySet()) {
            Function1<InterfaceC57916yrT, Unit> dispatch2 = this.AYXKKw.getDispatch();
            if (dispatch2 != null) {
                dispatch2.invoke(entry2.getKey());
            }
        }
    }
}
