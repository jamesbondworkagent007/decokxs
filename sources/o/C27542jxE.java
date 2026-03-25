package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.invest_biz.utils.ProductDetailsNavigation$navigate$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27542jxE {
    public static final C27542jxE copydefault = new C27542jxE();

    private C27542jxE() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, java.lang.Long l, java.lang.Long l2, java.lang.String str, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof LifecycleOwner) {
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
            C27493jwI.safeLaunch$default(CoroutineScope, null, null, new ProductDetailsNavigation$navigate$1(context, CoroutineScope, l, l2, str, num, z, null), 3, null);
        }
    }
}
