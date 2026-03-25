package com.okinc.tradecore.main.mvp.mediator;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class BaseSegment extends AbsPresenter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSegment(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public static /* synthetic */ void switchCoin$default(BaseSegment baseSegment, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchCoin");
        }
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = false;
        }
        baseSegment.AEQbTJ(str, str2, str3, str4, z3, z2);
    }
}
