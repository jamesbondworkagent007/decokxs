package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DT implements InterfaceC56293yA, CoroutineScope {
    public static final Activity copydefault = new Activity(null);
    public final CoroutineContext AEQbTJ;
    public final /* synthetic */ InterfaceC56293yA EZpvd;
    public final InterfaceC56293yA OLrzqt;

    public static final class ActionBar {
        public InterfaceC56293yA EZpvd = C58108yv.AEQbTJ();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56293yA EZpvd() {
            return this.EZpvd;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56293yA AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57843yq
    public boolean AEQbTJ(@NotNull C57737yo<?> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        return this.EZpvd.AEQbTJ(c57737yo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56293yA
    public <T> T EZpvd(@NotNull C57737yo<T> c57737yo, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return (T) this.EZpvd.EZpvd(c57737yo, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56293yA
    public <T> void EZpvd(@NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        this.EZpvd.EZpvd(c57737yo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57843yq
    public boolean EZpvd() {
        return this.EZpvd.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57843yq
    public <T> T OLrzqt(@NotNull C57737yo<T> c57737yo) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        return (T) this.EZpvd.OLrzqt(c57737yo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56293yA
    public <T> void OLrzqt(@NotNull C57737yo<T> c57737yo, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c57737yo, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.EZpvd.OLrzqt(c57737yo, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57843yq
    public java.util.Set<C57737yo<?>> copydefault() {
        return this.EZpvd.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.AEQbTJ;
    }

    public DT(ActionBar actionBar) {
        this.EZpvd = actionBar.EZpvd();
        this.AEQbTJ = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
        this.OLrzqt = actionBar.EZpvd();
    }

    public DT() {
        this(new ActionBar());
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
