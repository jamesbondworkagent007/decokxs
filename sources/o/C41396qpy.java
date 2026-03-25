package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.market.ext.EditTextExtKt$onTextChanged$1;
import com.okinc.market.ext.EditTextExtKt$textChangesFlow$1;
import com.okinc.market.ext.EditTextExtKt$textChangesFlow$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41396qpy {
    public static final Flow<java.lang.CharSequence> copydefault(@NotNull android.widget.EditText editText, boolean z) {
        Intrinsics.checkNotNullParameter(editText, "");
        return FlowKt.onStart(FlowKt.callbackFlow(new EditTextExtKt$textChangesFlow$1(editText, null)), new EditTextExtKt$textChangesFlow$2(z, editText, null));
    }

    public static /* synthetic */ Job onTextChanged$default(android.widget.EditText editText, LifecycleCoroutineScope lifecycleCoroutineScope, long j, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 100;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        return EZpvd(editText, lifecycleCoroutineScope, j2, z, function1);
    }

    public static final Job EZpvd(@NotNull android.widget.EditText editText, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, long j, boolean z, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new EditTextExtKt$onTextChanged$1(editText, z, j, function1, null), 3, null);
    }
}
