package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.extension.LiveDataExtKt$dispatchValue$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36588odm {
    public static final <T> java.lang.Object KWHzl(@NotNull MutableLiveData<T> mutableLiveData, T t, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(sDN.copydefault.OLrzqt(), new LiveDataExtKt$dispatchValue$2(mutableLiveData, t, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
