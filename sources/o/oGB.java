package o;

import com.okinc.im.usecase.sharepreference.GetSharePreferenceByPreferenceKeyUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGB {
    public final android.content.SharedPreferences AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oGB(@yCL(AEQbTJ = "IMSharePreference") @NotNull android.content.SharedPreferences sharedPreferences, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = sharedPreferences;
        this.copydefault = coroutineDispatcher;
    }

    public final <T> java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetSharePreferenceByPreferenceKeyUseCase$execute$2(this, str, null), continuation);
    }
}
