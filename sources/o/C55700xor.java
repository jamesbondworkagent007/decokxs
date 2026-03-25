package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.unify_trade.TradeInitJob$marketEnsureOKTrade$1;
import com.okinc.unify_trade.TradeInitJob$marketEnsureOKTrade$2;
import com.okinc.unify_trade.TradeInitJob$marketEnsureOKTradeResume$1;
import com.okinc.unify_trade.TradeInitJob$marketEnsureOKTradeResume$2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55700xor {
    public Job OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void marketEnsureOKTrade$default(C55700xor c55700xor, CoroutineScope coroutineScope, C54588xNy c54588xNy, yHT yht, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c54588xNy = new C54588xNy();
        }
        if ((i & 4) != 0) {
            yht = new TradeInitJob$marketEnsureOKTrade$1(null);
        }
        c55700xor.EZpvd(coroutineScope, c54588xNy, yht);
    }

    public final void EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull C54588xNy c54588xNy, @NotNull yHT<? super java.lang.Boolean, ? super InterfaceC54581xNr, ? super java.lang.Exception, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(c54588xNy, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TradeInitJob$marketEnsureOKTrade$2(yht, c54588xNy, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void marketEnsureOKTradeResume$default(C55700xor c55700xor, LifecycleCoroutineScope lifecycleCoroutineScope, C54588xNy c54588xNy, yHT yht, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c54588xNy = new C54588xNy();
        }
        if ((i & 4) != 0) {
            yht = new TradeInitJob$marketEnsureOKTradeResume$1(null);
        }
        c55700xor.copydefault(lifecycleCoroutineScope, c54588xNy, yht);
    }

    public final void copydefault(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull C54588xNy c54588xNy, @NotNull yHT<? super java.lang.Boolean, ? super InterfaceC54581xNr, ? super java.lang.Exception, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        Intrinsics.checkNotNullParameter(c54588xNy, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt = lifecycleCoroutineScope.launchWhenResumed(new TradeInitJob$marketEnsureOKTradeResume$2(yht, c54588xNy, null));
    }

    public final void OLrzqt() {
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
