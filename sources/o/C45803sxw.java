package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.lite.onboarding.util.AdapterUtilKt$updateDataset$$inlined$updateDataset$1;
import com.okinc.okex.lite.onboarding.util.AdapterUtilKt$updateDataset$$inlined$updateDataset$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C45803sxw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final <E> Function2<E, E, java.lang.Boolean> KWHzl() {
        return new Function2() { // from class: o.sxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C45803sxw.KWHzl(obj, obj2));
            }
        };
    }

    public static final boolean KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        return Intrinsics.EZpvd(obj, obj2);
    }

    public static /* synthetic */ java.lang.Object updateDataset$default(AbstractC45801sxu abstractC45801sxu, java.util.List list, Function2 function2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = KWHzl();
        }
        return KWHzl(abstractC45801sxu, list, function2, continuation);
    }

    public static /* synthetic */ java.lang.Object updateDataset$default(C59534zip c59534zip, java.util.List list, Function2 function2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = KWHzl();
        }
        return EZpvd(c59534zip, list, function2, continuation);
    }

    public static final <E> java.lang.Object KWHzl(@NotNull AbstractC45801sxu<E, ? extends RecyclerView.ViewHolder> abstractC45801sxu, @NotNull java.util.List<? extends E> list, @NotNull Function2<? super E, ? super E, java.lang.Boolean> function2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AdapterUtilKt$updateDataset$$inlined$updateDataset$1(function2, list, abstractC45801sxu, null, abstractC45801sxu, abstractC45801sxu), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static final <E> java.lang.Object EZpvd(@NotNull C59534zip c59534zip, @NotNull java.util.List<? extends E> list, @NotNull Function2<? super E, ? super E, java.lang.Boolean> function2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new AdapterUtilKt$updateDataset$$inlined$updateDataset$2(function2, list, c59534zip, null, c59534zip, c59534zip), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
