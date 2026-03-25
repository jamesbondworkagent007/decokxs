package com.okinc.business.appupdate.update;

import android.app.Activity;
import com.okinc.business.appupdate.api.IUpdate;
import com.okinc.business.appupdate.review.ReviewInfoManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IUpdate2 extends IUpdate {
    void addUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange);

    void removeUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange);

    @Override // com.okinc.business.appupdate.api.IUpdate
    void startReview(@NotNull Activity activity);

    @Override // com.okinc.business.appupdate.api.IUpdate
    void startReviewFlow(@NotNull Activity activity, @NotNull Function0<Unit> function0);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static void startReview(@NotNull IUpdate2 iUpdate2, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            ReviewInfoManager.INSTANCE.startReview(activity);
        }

        public static void startReviewFlow(@NotNull IUpdate2 iUpdate2, @NotNull Activity activity, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function0, "");
            ReviewInfoManager.INSTANCE.startReviewFlow(activity, function0);
        }
    }
}
