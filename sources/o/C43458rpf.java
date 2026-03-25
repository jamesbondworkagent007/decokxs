package o;

import com.okinc.network.util.GroupTasksForDNS$start$1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43458rpf<T> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final Function1<java.lang.String, T>[] AEQbTJ;
    public final java.lang.String KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C43458rpf(@NotNull java.lang.String str, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super java.lang.String, ? extends T>... function1Arr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(function1Arr, "");
        this.KWHzl = str;
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = function1Arr;
    }

    public final void copydefault(@NotNull Function2<? super T, ? super java.lang.Integer, Unit> function2, @NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(this.copydefault).plus(new TaskDescription(CoroutineExceptionHandler.Key, atomicInteger, this, function1)));
        Function1<java.lang.String, T>[] function1Arr = this.AEQbTJ;
        int length = function1Arr.length;
        int i = 0;
        while (i < length) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new GroupTasksForDNS$start$1(function1Arr[i], this, atomicBoolean, function2, i, CoroutineScope, null), 3, null);
            i++;
            length = length;
            function1Arr = function1Arr;
        }
    }

    /* JADX INFO: renamed from: o.rpf$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ AtomicInteger AEQbTJ;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ C43458rpf copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, AtomicInteger atomicInteger, C43458rpf c43458rpf, Function1 function1) {
            super(key);
            this.AEQbTJ = atomicInteger;
            this.copydefault = c43458rpf;
            this.OLrzqt = function1;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Throwable th) {
            pUU.OLrzqt("GroupTasksForDNS", "GroupTasksForDNS", th);
            if (this.AEQbTJ.incrementAndGet() == this.copydefault.AEQbTJ.length) {
                this.OLrzqt.invoke(th);
            }
        }
    }

    /* JADX INFO: renamed from: o.rpf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rpf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
