package o;

import android.content.SharedPreferences;
import com.okinc.im.usecase.sharepreference.UpdateSharePreferenceByPreferenceKeyUseCase$execute$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGC {
    public final CoroutineDispatcher AEQbTJ;
    public final android.content.SharedPreferences KWHzl;

    @yCM
    public oGC(@yCL(AEQbTJ = "IMSharePreference") @NotNull android.content.SharedPreferences sharedPreferences, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sharedPreferences;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull Function1<? super SharedPreferences.Editor, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AEQbTJ, new UpdateSharePreferenceByPreferenceKeyUseCase$execute$2(this, function1, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
