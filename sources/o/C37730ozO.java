package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37730ozO {
    public static final int AEQbTJ;
    public static final C37718ozC AhwBna;
    public static final C37726ozK EZpvd;
    public static CoroutineScope copydefault;
    public static final C37730ozO OLrzqt = new C37730ozO();
    public static java.util.HashMap<java.lang.Integer, Job> KWHzl = new java.util.HashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37726ozK OLrzqt() {
        return EZpvd;
    }

    private C37730ozO() {
    }

    public final CoroutineScope AEQbTJ() {
        CoroutineScope coroutineScope = copydefault;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        copydefault = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    static {
        C37718ozC c37718ozC = new C37718ozC();
        AhwBna = c37718ozC;
        EZpvd = new C37726ozK(c37718ozC);
        AEQbTJ = 8;
    }

    public final void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        KWHzl.put(java.lang.Integer.valueOf(bindingAdapterPosition), BuildersKt__Builders_commonKt.launch$default(AEQbTJ(), sDN.copydefault.copydefault(), null, function2, 2, null));
    }

    public final void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        Job job = KWHzl.get(java.lang.Integer.valueOf(bindingAdapterPosition));
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        KWHzl.remove(java.lang.Integer.valueOf(bindingAdapterPosition));
    }
}
