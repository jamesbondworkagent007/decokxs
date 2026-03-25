package com.onesignal;

import android.content.Context;
import androidx.compose.material3.TooltipKt;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OSFocusHandler;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57712ynb;
import o.C57714ynd;
import o.C57826ypj;
import o.HandlerThreadC57819ypc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OSFocusHandler {
    public static final ActionBar Companion = new ActionBar(null);
    public static boolean EZpvd = false;
    public static boolean KWHzl = false;
    public static boolean OLrzqt = false;
    public Runnable AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return OLrzqt;
    }

    public final void AhwBna() {
        valueOf();
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppFocus");
        OneSignal.DAIeex();
    }

    public final void AYXKKw() {
        if (EZpvd) {
            EZpvd = false;
            this.AEQbTJ = null;
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            OneSignal.DarRvM();
            return;
        }
        djBIcL();
    }

    public final void gEmmrt() {
        Runnable runnable = new Runnable() { // from class: o.yoe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OSFocusHandler.copydefault();
            }
        };
        HandlerThreadC57819ypc.copydefault().AEQbTJ(TooltipKt.TooltipDuration, runnable);
        Unit unit = Unit.INSTANCE;
        this.AEQbTJ = runnable;
    }

    public static final void copydefault() {
        EZpvd = true;
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler setting stop state: true");
    }

    public final void OLrzqt(@NotNull String str, long j, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(OnLostFocusWorker.class).setConstraints(EZpvd()).setInitialDelay(j, TimeUnit.MILLISECONDS).addTag(str).build();
        Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "");
        C57826ypj.OLrzqt(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
    }

    public final void copydefault(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        C57826ypj.OLrzqt(context).cancelAllWorkByTag(str);
    }

    public final void djBIcL() {
        EZpvd = false;
        Runnable runnable = this.AEQbTJ;
        if (runnable == null) {
            return;
        }
        HandlerThreadC57819ypc.copydefault().EZpvd(runnable);
    }

    public final void valueOf() {
        djBIcL();
        KWHzl = false;
    }

    public final Constraints EZpvd() {
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue(constraintsBuild, "");
        return constraintsBuild;
    }

    public static final class OnLostFocusWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
            super(context, workerParameters);
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(workerParameters, "");
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() {
            OSFocusHandler.Companion.AEQbTJ();
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
            return resultSuccess;
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.onesignal.OSFocusHandler.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ() {
            C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
            if (c57712ynbCopydefault == null || c57712ynbCopydefault.copydefault() == null) {
                OneSignal.djBIcL(false);
            }
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.KWHzl = true;
            OneSignal.AxsJAYsNCnLh();
            OSFocusHandler.OLrzqt = true;
        }
    }
}
