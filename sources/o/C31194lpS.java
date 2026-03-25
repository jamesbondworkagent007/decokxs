package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.business.utils.EditTextUtilsKt$onTextChanged$1;
import com.okinc.business.utils.EditTextUtilsKt$textChanges$1;
import com.okinc.business.utils.EditTextUtilsKt$textChanges$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31194lpS {
    public static final void copydefault() {
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            return;
        }
        throw new java.lang.IllegalStateException(("Expected to be called on the main thread but was " + java.lang.Thread.currentThread().getName()).toString());
    }

    public static /* synthetic */ void onTextChanged$default(C55001xbh c55001xbh, LifecycleCoroutineScope lifecycleCoroutineScope, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 400;
        }
        EZpvd(c55001xbh, lifecycleCoroutineScope, j, function1);
    }

    public static final void EZpvd(@NotNull C55001xbh c55001xbh, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, long j, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25389ivm.safeLaunch$default(lifecycleCoroutineScope, null, null, new EditTextUtilsKt$onTextChanged$1(c55001xbh, j, function1, null), 3, null);
    }

    public static final Flow<java.lang.CharSequence> copydefault(@NotNull C55001xbh c55001xbh) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        return FlowKt.onStart(FlowKt.callbackFlow(new EditTextUtilsKt$textChanges$1(c55001xbh, null)), new EditTextUtilsKt$textChanges$2(c55001xbh, null));
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Regex("^-?\\d+(\\.\\d+)?$").matches(str);
    }
}
