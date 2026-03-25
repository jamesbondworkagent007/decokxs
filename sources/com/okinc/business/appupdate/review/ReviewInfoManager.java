package com.okinc.business.appupdate.review;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewInfoManager {
    public static final int $stable = 0;
    public static final ReviewInfoManager INSTANCE = new ReviewInfoManager();
    private static final String START_APP_COUNT = "START_APP_COUNT";

    private ReviewInfoManager() {
    }

    public final void startReview(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        Integer num = SPUtils.getInt(START_APP_COUNT, 0);
        if (num != null && num.intValue() == 2) {
            SPUtils.put(START_APP_COUNT, -1);
            startReviewFlow(activity, new Function0() { // from class: com.okinc.business.appupdate.review.ReviewInfoManager$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else {
            if (num != null && num.intValue() == -1) {
                return;
            }
            SPUtils.put(START_APP_COUNT, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final void startReviewFlow(@NotNull final Activity activity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ReviewManager reviewManagerCreate = ReviewManagerFactory.create(activity);
        Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, "");
        reviewManagerCreate.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: com.okinc.business.appupdate.review.ReviewInfoManager$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReviewInfoManager.startReviewFlow$lambda$4$lambda$3(reviewManagerCreate, activity, function0, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startReviewFlow$lambda$4$lambda$3(ReviewManager reviewManager, Activity activity, final Function0 function0, Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() { // from class: com.okinc.business.appupdate.review.ReviewInfoManager$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    ReviewInfoManager.startReviewFlow$lambda$4$lambda$3$lambda$2$lambda$1(function0, task2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startReviewFlow$lambda$4$lambda$3$lambda$2$lambda$1(Function0 function0, Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        function0.invoke();
    }
}
