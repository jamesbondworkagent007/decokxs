package o;

import com.okinc.tradingbot.impl.utils.DebounceUtil$debounce$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52693wUw {
    public static Job OLrzqt;
    public static final C52693wUw copydefault = new C52693wUw();
    public static final int AEQbTJ = 8;

    private C52693wUw() {
    }

    public static /* synthetic */ void debounce$default(C52693wUw c52693wUw, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c52693wUw.AEQbTJ(j, function1);
    }

    public final void AEQbTJ(long j, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Job job = OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        OLrzqt = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DebounceUtil$debounce$1(j, function1, null), 3, null);
    }
}
