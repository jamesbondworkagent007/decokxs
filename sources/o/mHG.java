package o;

import com.okinc.cruilib.extension.OKEditTextExtensionsKt$textChangesWithDebounce$1;
import com.okinc.cruilib.extension.OKEditTextExtensionsKt$textChangesWithDebounce$2;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mHG {
    public static /* synthetic */ void textChangesWithDebounce$default(OKEditText oKEditText, long j, CoroutineScope coroutineScope, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        AEQbTJ(oKEditText, j, coroutineScope, function1);
    }

    public static final void AEQbTJ(@NotNull OKEditText oKEditText, long j, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(oKEditText, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(FlowKt.callbackFlow(new OKEditTextExtensionsKt$textChangesWithDebounce$1(oKEditText, null)), j), new OKEditTextExtensionsKt$textChangesWithDebounce$2(function1, null)), coroutineScope);
    }
}
