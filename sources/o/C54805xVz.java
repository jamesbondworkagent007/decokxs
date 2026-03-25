package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.unify_trade.utils.FlowExKt$observe$2;
import com.okinc.unify_trade.utils.FlowExKt$observeForever$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54805xVz {
    public static /* synthetic */ void observe$default(Flow flow, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function12 = new Function1() { // from class: o.xVy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C54805xVz.OLrzqt((java.lang.Throwable) obj2);
                }
            };
        }
        EZpvd(flow, lifecycleOwner, function1, (Function1<? super java.lang.Throwable, Unit>) function12);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("FlowException", "Flow observe error: " + th.getMessage());
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static final <T> void EZpvd(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new FlowExKt$observe$2(lifecycleOwner, flow, function12, function1, null), 3, null);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Job observeForever$default(Flow flow, CoroutineScope coroutineScope, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.xVw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C54805xVz.KWHzl((java.lang.Throwable) obj2);
                }
            };
        }
        return EZpvd(flow, coroutineScope, (Function1<? super java.lang.Throwable, Unit>) function1, function12);
    }

    public static final <T> Job EZpvd(@NotNull Flow<? extends T> flow, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FlowExKt$observeForever$3(flow, function1, function12, null), 3, null);
    }
}
