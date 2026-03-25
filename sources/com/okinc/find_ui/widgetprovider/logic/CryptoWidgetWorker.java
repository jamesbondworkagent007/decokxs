package com.okinc.find_ui.widgetprovider.logic;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.okinc.find_ui.widgetprovider.CryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.DoubleCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.FiveCryptoWidgetProvider;
import com.okinc.find_ui.widgetprovider.TripleCryptoWidgetProvider;
import com.okinc.unify_find.net.BizFindApiService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o.C35130npX;
import o.C35131npY;
import o.C35188nqc;
import o.C35191nqf;
import o.C35192nqg;
import o.C35195nqj;
import o.C35196nqk;
import o.C43296rmc;
import o.C43417ror;
import o.C43453rpa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CryptoWidgetWorker extends CoroutineWorker {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: com.okinc.find_ui.widgetprovider.logic.CryptoWidgetWorker$doWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoWidgetWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CryptoWidgetWorker cryptoWidgetWorker;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C43296rmc.AEQbTJ("CryptoWidgetWorker", "doWork() called");
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            if (!c43453rpa.KWHzl(applicationContext)) {
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry, "");
                return resultRetry;
            }
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(getApplicationContext());
            if (appWidgetManager == null) {
                ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure, "");
                return resultFailure;
            }
            StateListAnimator stateListAnimator = Companion;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (stateListAnimator.OLrzqt(appWidgetManager, applicationContext2, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            cryptoWidgetWorker = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cryptoWidgetWorker = (CryptoWidgetWorker) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        boolean z = cryptoWidgetWorker.getInputData().getBoolean("CREATE_REPEAT_WORK", true);
        C43296rmc.AEQbTJ("CryptoWidgetWorker", "shouldCreateWork " + z);
        if (z) {
            cryptoWidgetWorker.AEQbTJ();
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        return resultSuccess;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.find_ui.widgetprovider.logic.CryptoWidgetWorker.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=5] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0110 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0145 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0165 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0172 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OLrzqt(@NotNull AppWidgetManager appWidgetManager, @NotNull Context context, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$update$1 cryptoWidgetWorker$Companion$update$1;
            C35191nqf c35191nqf;
            Object objAEQbTJ;
            StateListAnimator stateListAnimator;
            Object objCopydefault;
            StateListAnimator stateListAnimator2;
            Context context2;
            AppWidgetManager appWidgetManager2;
            Job job;
            C35191nqf c35191nqf2;
            C35191nqf c35191nqf3;
            Job job2;
            Job job3;
            Object objOLrzqt;
            Job job4;
            Job job5;
            Job job6;
            Job job7;
            Job job8;
            Job job9;
            if (continuation instanceof CryptoWidgetWorker$Companion$update$1) {
                cryptoWidgetWorker$Companion$update$1 = (CryptoWidgetWorker$Companion$update$1) continuation;
                int i = cryptoWidgetWorker$Companion$update$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$update$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$update$1 = new CryptoWidgetWorker$Companion$update$1(this, continuation);
                }
            }
            Object objEZpvd = cryptoWidgetWorker$Companion$update$1.result;
            Object objCopydefault2 = C56442yFn.copydefault();
            switch (cryptoWidgetWorker$Companion$update$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(objEZpvd);
                    c35191nqf = new C35191nqf();
                    cryptoWidgetWorker$Companion$update$1.L$0 = this;
                    cryptoWidgetWorker$Companion$update$1.L$1 = appWidgetManager;
                    cryptoWidgetWorker$Companion$update$1.L$2 = context;
                    cryptoWidgetWorker$Companion$update$1.L$3 = c35191nqf;
                    cryptoWidgetWorker$Companion$update$1.label = 1;
                    objAEQbTJ = AEQbTJ(appWidgetManager, c35191nqf, context, cryptoWidgetWorker$Companion$update$1);
                    if (objAEQbTJ == objCopydefault2) {
                        return objCopydefault2;
                    }
                    stateListAnimator = this;
                    Job job10 = (Job) objAEQbTJ;
                    cryptoWidgetWorker$Companion$update$1.L$0 = stateListAnimator;
                    cryptoWidgetWorker$Companion$update$1.L$1 = appWidgetManager;
                    cryptoWidgetWorker$Companion$update$1.L$2 = context;
                    cryptoWidgetWorker$Companion$update$1.L$3 = c35191nqf;
                    cryptoWidgetWorker$Companion$update$1.L$4 = job10;
                    cryptoWidgetWorker$Companion$update$1.label = 2;
                    objCopydefault = stateListAnimator.copydefault(appWidgetManager, c35191nqf, context, cryptoWidgetWorker$Companion$update$1);
                    if (objCopydefault != objCopydefault2) {
                        return objCopydefault2;
                    }
                    stateListAnimator2 = stateListAnimator;
                    context2 = context;
                    appWidgetManager2 = appWidgetManager;
                    job = job10;
                    c35191nqf2 = c35191nqf;
                    objEZpvd = objCopydefault;
                    Job job11 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = stateListAnimator2;
                    cryptoWidgetWorker$Companion$update$1.L$1 = appWidgetManager2;
                    cryptoWidgetWorker$Companion$update$1.L$2 = context2;
                    cryptoWidgetWorker$Companion$update$1.L$3 = c35191nqf2;
                    cryptoWidgetWorker$Companion$update$1.L$4 = job;
                    cryptoWidgetWorker$Companion$update$1.L$5 = job11;
                    cryptoWidgetWorker$Companion$update$1.label = 3;
                    objEZpvd = stateListAnimator2.EZpvd(appWidgetManager2, c35191nqf2, context2, cryptoWidgetWorker$Companion$update$1);
                    if (objEZpvd != objCopydefault2) {
                        return objCopydefault2;
                    }
                    c35191nqf3 = c35191nqf2;
                    job2 = job;
                    job3 = job11;
                    C35191nqf c35191nqf4 = c35191nqf3;
                    Job job12 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = job2;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job3;
                    cryptoWidgetWorker$Companion$update$1.L$2 = job12;
                    cryptoWidgetWorker$Companion$update$1.L$3 = null;
                    cryptoWidgetWorker$Companion$update$1.L$4 = null;
                    cryptoWidgetWorker$Companion$update$1.L$5 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 4;
                    objOLrzqt = stateListAnimator2.OLrzqt(appWidgetManager2, c35191nqf4, context2, cryptoWidgetWorker$Companion$update$1);
                    if (objOLrzqt != objCopydefault2) {
                        return objCopydefault2;
                    }
                    job4 = job2;
                    job5 = job3;
                    job6 = job12;
                    objEZpvd = objOLrzqt;
                    job7 = job4;
                    Job job13 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = job5;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job6;
                    cryptoWidgetWorker$Companion$update$1.L$2 = job13;
                    cryptoWidgetWorker$Companion$update$1.label = 5;
                    if (job7.join(cryptoWidgetWorker$Companion$update$1) != objCopydefault2) {
                        return objCopydefault2;
                    }
                    job8 = job6;
                    job9 = job13;
                    cryptoWidgetWorker$Companion$update$1.L$0 = job8;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job9;
                    cryptoWidgetWorker$Companion$update$1.L$2 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 6;
                    if (job5.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    cryptoWidgetWorker$Companion$update$1.L$0 = job9;
                    cryptoWidgetWorker$Companion$update$1.L$1 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 7;
                    if (job8.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    cryptoWidgetWorker$Companion$update$1.L$0 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 8;
                    if (job9.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                case 1:
                    C35191nqf c35191nqf5 = (C35191nqf) cryptoWidgetWorker$Companion$update$1.L$3;
                    context = (Context) cryptoWidgetWorker$Companion$update$1.L$2;
                    AppWidgetManager appWidgetManager3 = (AppWidgetManager) cryptoWidgetWorker$Companion$update$1.L$1;
                    stateListAnimator = (StateListAnimator) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c35191nqf = c35191nqf5;
                    appWidgetManager = appWidgetManager3;
                    objAEQbTJ = objEZpvd;
                    Job job102 = (Job) objAEQbTJ;
                    cryptoWidgetWorker$Companion$update$1.L$0 = stateListAnimator;
                    cryptoWidgetWorker$Companion$update$1.L$1 = appWidgetManager;
                    cryptoWidgetWorker$Companion$update$1.L$2 = context;
                    cryptoWidgetWorker$Companion$update$1.L$3 = c35191nqf;
                    cryptoWidgetWorker$Companion$update$1.L$4 = job102;
                    cryptoWidgetWorker$Companion$update$1.label = 2;
                    objCopydefault = stateListAnimator.copydefault(appWidgetManager, c35191nqf, context, cryptoWidgetWorker$Companion$update$1);
                    if (objCopydefault != objCopydefault2) {
                    }
                    break;
                case 2:
                    job = (Job) cryptoWidgetWorker$Companion$update$1.L$4;
                    C35191nqf c35191nqf6 = (C35191nqf) cryptoWidgetWorker$Companion$update$1.L$3;
                    Context context3 = (Context) cryptoWidgetWorker$Companion$update$1.L$2;
                    AppWidgetManager appWidgetManager4 = (AppWidgetManager) cryptoWidgetWorker$Companion$update$1.L$1;
                    StateListAnimator stateListAnimator3 = (StateListAnimator) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    stateListAnimator2 = stateListAnimator3;
                    appWidgetManager2 = appWidgetManager4;
                    context2 = context3;
                    c35191nqf2 = c35191nqf6;
                    Job job112 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = stateListAnimator2;
                    cryptoWidgetWorker$Companion$update$1.L$1 = appWidgetManager2;
                    cryptoWidgetWorker$Companion$update$1.L$2 = context2;
                    cryptoWidgetWorker$Companion$update$1.L$3 = c35191nqf2;
                    cryptoWidgetWorker$Companion$update$1.L$4 = job;
                    cryptoWidgetWorker$Companion$update$1.L$5 = job112;
                    cryptoWidgetWorker$Companion$update$1.label = 3;
                    objEZpvd = stateListAnimator2.EZpvd(appWidgetManager2, c35191nqf2, context2, cryptoWidgetWorker$Companion$update$1);
                    if (objEZpvd != objCopydefault2) {
                    }
                    break;
                case 3:
                    job3 = (Job) cryptoWidgetWorker$Companion$update$1.L$5;
                    Job job14 = (Job) cryptoWidgetWorker$Companion$update$1.L$4;
                    C35191nqf c35191nqf7 = (C35191nqf) cryptoWidgetWorker$Companion$update$1.L$3;
                    context2 = (Context) cryptoWidgetWorker$Companion$update$1.L$2;
                    appWidgetManager2 = (AppWidgetManager) cryptoWidgetWorker$Companion$update$1.L$1;
                    stateListAnimator2 = (StateListAnimator) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c35191nqf3 = c35191nqf7;
                    job2 = job14;
                    C35191nqf c35191nqf42 = c35191nqf3;
                    Job job122 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = job2;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job3;
                    cryptoWidgetWorker$Companion$update$1.L$2 = job122;
                    cryptoWidgetWorker$Companion$update$1.L$3 = null;
                    cryptoWidgetWorker$Companion$update$1.L$4 = null;
                    cryptoWidgetWorker$Companion$update$1.L$5 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 4;
                    objOLrzqt = stateListAnimator2.OLrzqt(appWidgetManager2, c35191nqf42, context2, cryptoWidgetWorker$Companion$update$1);
                    if (objOLrzqt != objCopydefault2) {
                    }
                    break;
                case 4:
                    job6 = (Job) cryptoWidgetWorker$Companion$update$1.L$2;
                    Job job15 = (Job) cryptoWidgetWorker$Companion$update$1.L$1;
                    Job job16 = (Job) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    job4 = job16;
                    job5 = job15;
                    job7 = job4;
                    Job job132 = (Job) objEZpvd;
                    cryptoWidgetWorker$Companion$update$1.L$0 = job5;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job6;
                    cryptoWidgetWorker$Companion$update$1.L$2 = job132;
                    cryptoWidgetWorker$Companion$update$1.label = 5;
                    if (job7.join(cryptoWidgetWorker$Companion$update$1) != objCopydefault2) {
                    }
                    break;
                case 5:
                    job9 = (Job) cryptoWidgetWorker$Companion$update$1.L$2;
                    job8 = (Job) cryptoWidgetWorker$Companion$update$1.L$1;
                    job5 = (Job) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    cryptoWidgetWorker$Companion$update$1.L$0 = job8;
                    cryptoWidgetWorker$Companion$update$1.L$1 = job9;
                    cryptoWidgetWorker$Companion$update$1.L$2 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 6;
                    if (job5.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    cryptoWidgetWorker$Companion$update$1.L$0 = job9;
                    cryptoWidgetWorker$Companion$update$1.L$1 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 7;
                    if (job8.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    cryptoWidgetWorker$Companion$update$1.L$0 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 8;
                    if (job9.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    job9 = (Job) cryptoWidgetWorker$Companion$update$1.L$1;
                    job8 = (Job) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    cryptoWidgetWorker$Companion$update$1.L$0 = job9;
                    cryptoWidgetWorker$Companion$update$1.L$1 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 7;
                    if (job8.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    cryptoWidgetWorker$Companion$update$1.L$0 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 8;
                    if (job9.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    job9 = (Job) cryptoWidgetWorker$Companion$update$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    cryptoWidgetWorker$Companion$update$1.L$0 = null;
                    cryptoWidgetWorker$Companion$update$1.label = 8;
                    if (job9.join(cryptoWidgetWorker$Companion$update$1) == objCopydefault2) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object AEQbTJ(@NotNull AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf, @NotNull Context context, @NotNull Continuation<? super Job> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$updateSingle$1 cryptoWidgetWorker$Companion$updateSingle$1;
            AppWidgetManager appWidgetManager2;
            int[] iArr;
            if (continuation instanceof CryptoWidgetWorker$Companion$updateSingle$1) {
                cryptoWidgetWorker$Companion$updateSingle$1 = (CryptoWidgetWorker$Companion$updateSingle$1) continuation;
                int i = cryptoWidgetWorker$Companion$updateSingle$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$updateSingle$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$updateSingle$1 = new CryptoWidgetWorker$Companion$updateSingle$1(this, continuation);
                }
            }
            CryptoWidgetWorker$Companion$updateSingle$1 cryptoWidgetWorker$Companion$updateSingle$12 = cryptoWidgetWorker$Companion$updateSingle$1;
            Object obj = cryptoWidgetWorker$Companion$updateSingle$12.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = cryptoWidgetWorker$Companion$updateSingle$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) CryptoWidgetProvider.class));
                Intrinsics.copydefault(appWidgetIds);
                cryptoWidgetWorker$Companion$updateSingle$12.L$0 = appWidgetManager;
                cryptoWidgetWorker$Companion$updateSingle$12.L$1 = c35191nqf;
                cryptoWidgetWorker$Companion$updateSingle$12.L$2 = context;
                cryptoWidgetWorker$Companion$updateSingle$12.L$3 = appWidgetIds;
                cryptoWidgetWorker$Companion$updateSingle$12.label = 1;
                if (AEQbTJ(context, appWidgetIds, "SINGLE_COIN_PREFS_KEY_STRING", c35191nqf, cryptoWidgetWorker$Companion$updateSingle$12) == objCopydefault) {
                    return objCopydefault;
                }
                appWidgetManager2 = appWidgetManager;
                iArr = appWidgetIds;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) cryptoWidgetWorker$Companion$updateSingle$12.L$3;
                context = (Context) cryptoWidgetWorker$Companion$updateSingle$12.L$2;
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$updateSingle$12.L$1;
                appWidgetManager2 = (AppWidgetManager) cryptoWidgetWorker$Companion$updateSingle$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C35196nqk.EZpvd(iArr, context, appWidgetManager2, c35191nqf);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object AEQbTJ(Context context, int[] iArr, String str, C35191nqf c35191nqf, Continuation<? super Unit> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$getTopMainCoins$1 cryptoWidgetWorker$Companion$getTopMainCoins$1;
            if (continuation instanceof CryptoWidgetWorker$Companion$getTopMainCoins$1) {
                cryptoWidgetWorker$Companion$getTopMainCoins$1 = (CryptoWidgetWorker$Companion$getTopMainCoins$1) continuation;
                int i = cryptoWidgetWorker$Companion$getTopMainCoins$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$getTopMainCoins$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$getTopMainCoins$1 = new CryptoWidgetWorker$Companion$getTopMainCoins$1(this, continuation);
                }
            }
            Object obj = cryptoWidgetWorker$Companion$getTopMainCoins$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = cryptoWidgetWorker$Companion$getTopMainCoins$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int i3 = 0;
                SharedPreferences sharedPreferences = context.getSharedPreferences("App_Widget_Prefs_Crypto_new", 0);
                if (iArr != null) {
                    if ((!(iArr.length == 0)) && !c35191nqf.djBIcL()) {
                        if (Intrinsics.EZpvd((Object) str, (Object) "SINGLE_COIN_PREFS_KEY_STRING")) {
                            int length = iArr.length;
                            String string = "";
                            while (i3 < length) {
                                string = sharedPreferences.getString(str + "_" + iArr[i3], "");
                                if (string == null) {
                                    string = "";
                                }
                                i3++;
                            }
                            if (string.length() == 0) {
                                BizFindApiService bizFindApiService = (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
                                cryptoWidgetWorker$Companion$getTopMainCoins$1.L$0 = c35191nqf;
                                cryptoWidgetWorker$Companion$getTopMainCoins$1.label = 1;
                                if (C35130npX.KWHzl(bizFindApiService, context, cryptoWidgetWorker$Companion$getTopMainCoins$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                c35191nqf.copydefault(true);
                            }
                        } else {
                            List<String> listAhwBna = yDY.AhwBna();
                            int length2 = iArr.length;
                            while (i3 < length2) {
                                listAhwBna = C35192nqg.EZpvd(context, str + "_" + iArr[i3]);
                                i3++;
                            }
                            if (listAhwBna.isEmpty()) {
                                BizFindApiService bizFindApiService2 = (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
                                cryptoWidgetWorker$Companion$getTopMainCoins$1.L$0 = c35191nqf;
                                cryptoWidgetWorker$Companion$getTopMainCoins$1.label = 2;
                                if (C35130npX.KWHzl(bizFindApiService2, context, cryptoWidgetWorker$Companion$getTopMainCoins$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                c35191nqf.copydefault(true);
                            }
                        }
                    }
                }
            } else if (i2 == 1) {
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$getTopMainCoins$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c35191nqf.copydefault(true);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$getTopMainCoins$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c35191nqf.copydefault(true);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object copydefault(@NotNull AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf, @NotNull Context context, @NotNull Continuation<? super Job> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$updateTriple$1 cryptoWidgetWorker$Companion$updateTriple$1;
            AppWidgetManager appWidgetManager2;
            int[] iArr;
            if (continuation instanceof CryptoWidgetWorker$Companion$updateTriple$1) {
                cryptoWidgetWorker$Companion$updateTriple$1 = (CryptoWidgetWorker$Companion$updateTriple$1) continuation;
                int i = cryptoWidgetWorker$Companion$updateTriple$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$updateTriple$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$updateTriple$1 = new CryptoWidgetWorker$Companion$updateTriple$1(this, continuation);
                }
            }
            CryptoWidgetWorker$Companion$updateTriple$1 cryptoWidgetWorker$Companion$updateTriple$12 = cryptoWidgetWorker$Companion$updateTriple$1;
            Object obj = cryptoWidgetWorker$Companion$updateTriple$12.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = cryptoWidgetWorker$Companion$updateTriple$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) TripleCryptoWidgetProvider.class));
                Intrinsics.copydefault(appWidgetIds);
                cryptoWidgetWorker$Companion$updateTriple$12.L$0 = appWidgetManager;
                cryptoWidgetWorker$Companion$updateTriple$12.L$1 = c35191nqf;
                cryptoWidgetWorker$Companion$updateTriple$12.L$2 = context;
                cryptoWidgetWorker$Companion$updateTriple$12.L$3 = appWidgetIds;
                cryptoWidgetWorker$Companion$updateTriple$12.label = 1;
                if (AEQbTJ(context, appWidgetIds, "TRIPLE_COIN_PREFS_KEY_STRING", c35191nqf, cryptoWidgetWorker$Companion$updateTriple$12) == objCopydefault) {
                    return objCopydefault;
                }
                appWidgetManager2 = appWidgetManager;
                iArr = appWidgetIds;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) cryptoWidgetWorker$Companion$updateTriple$12.L$3;
                context = (Context) cryptoWidgetWorker$Companion$updateTriple$12.L$2;
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$updateTriple$12.L$1;
                appWidgetManager2 = (AppWidgetManager) cryptoWidgetWorker$Companion$updateTriple$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C35195nqj.OLrzqt(iArr, context, appWidgetManager2, c35191nqf);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object EZpvd(@NotNull AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf, @NotNull Context context, @NotNull Continuation<? super Job> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$updateDouble$1 cryptoWidgetWorker$Companion$updateDouble$1;
            AppWidgetManager appWidgetManager2;
            int[] iArr;
            if (continuation instanceof CryptoWidgetWorker$Companion$updateDouble$1) {
                cryptoWidgetWorker$Companion$updateDouble$1 = (CryptoWidgetWorker$Companion$updateDouble$1) continuation;
                int i = cryptoWidgetWorker$Companion$updateDouble$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$updateDouble$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$updateDouble$1 = new CryptoWidgetWorker$Companion$updateDouble$1(this, continuation);
                }
            }
            CryptoWidgetWorker$Companion$updateDouble$1 cryptoWidgetWorker$Companion$updateDouble$12 = cryptoWidgetWorker$Companion$updateDouble$1;
            Object obj = cryptoWidgetWorker$Companion$updateDouble$12.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = cryptoWidgetWorker$Companion$updateDouble$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) DoubleCryptoWidgetProvider.class));
                Intrinsics.copydefault(appWidgetIds);
                cryptoWidgetWorker$Companion$updateDouble$12.L$0 = appWidgetManager;
                cryptoWidgetWorker$Companion$updateDouble$12.L$1 = c35191nqf;
                cryptoWidgetWorker$Companion$updateDouble$12.L$2 = context;
                cryptoWidgetWorker$Companion$updateDouble$12.L$3 = appWidgetIds;
                cryptoWidgetWorker$Companion$updateDouble$12.label = 1;
                if (AEQbTJ(context, appWidgetIds, "TWO_INST_PREFS_KEY_STRING", c35191nqf, cryptoWidgetWorker$Companion$updateDouble$12) == objCopydefault) {
                    return objCopydefault;
                }
                appWidgetManager2 = appWidgetManager;
                iArr = appWidgetIds;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) cryptoWidgetWorker$Companion$updateDouble$12.L$3;
                context = (Context) cryptoWidgetWorker$Companion$updateDouble$12.L$2;
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$updateDouble$12.L$1;
                appWidgetManager2 = (AppWidgetManager) cryptoWidgetWorker$Companion$updateDouble$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C35131npY.OLrzqt(iArr, context, appWidgetManager2, c35191nqf);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OLrzqt(@NotNull AppWidgetManager appWidgetManager, @NotNull C35191nqf c35191nqf, @NotNull Context context, @NotNull Continuation<? super Job> continuation) throws Throwable {
            CryptoWidgetWorker$Companion$updateFive$1 cryptoWidgetWorker$Companion$updateFive$1;
            AppWidgetManager appWidgetManager2;
            int[] iArr;
            if (continuation instanceof CryptoWidgetWorker$Companion$updateFive$1) {
                cryptoWidgetWorker$Companion$updateFive$1 = (CryptoWidgetWorker$Companion$updateFive$1) continuation;
                int i = cryptoWidgetWorker$Companion$updateFive$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cryptoWidgetWorker$Companion$updateFive$1.label = i - Integer.MIN_VALUE;
                } else {
                    cryptoWidgetWorker$Companion$updateFive$1 = new CryptoWidgetWorker$Companion$updateFive$1(this, continuation);
                }
            }
            CryptoWidgetWorker$Companion$updateFive$1 cryptoWidgetWorker$Companion$updateFive$12 = cryptoWidgetWorker$Companion$updateFive$1;
            Object obj = cryptoWidgetWorker$Companion$updateFive$12.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = cryptoWidgetWorker$Companion$updateFive$12.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) FiveCryptoWidgetProvider.class));
                Intrinsics.copydefault(appWidgetIds);
                cryptoWidgetWorker$Companion$updateFive$12.L$0 = appWidgetManager;
                cryptoWidgetWorker$Companion$updateFive$12.L$1 = c35191nqf;
                cryptoWidgetWorker$Companion$updateFive$12.L$2 = context;
                cryptoWidgetWorker$Companion$updateFive$12.L$3 = appWidgetIds;
                cryptoWidgetWorker$Companion$updateFive$12.label = 1;
                if (AEQbTJ(context, appWidgetIds, "FIVE_INST_PREFS_KEY_STRING", c35191nqf, cryptoWidgetWorker$Companion$updateFive$12) == objCopydefault) {
                    return objCopydefault;
                }
                appWidgetManager2 = appWidgetManager;
                iArr = appWidgetIds;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) cryptoWidgetWorker$Companion$updateFive$12.L$3;
                context = (Context) cryptoWidgetWorker$Companion$updateFive$12.L$2;
                c35191nqf = (C35191nqf) cryptoWidgetWorker$Companion$updateFive$12.L$1;
                appWidgetManager2 = (AppWidgetManager) cryptoWidgetWorker$Companion$updateFive$12.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            return C35188nqc.OLrzqt(iArr, context, appWidgetManager2, c35191nqf);
        }
    }

    public final void AEQbTJ() {
        C43296rmc.EZpvd("CryptoWidgetProvider", "scheduleNextWork() called");
        WorkManager workManager = WorkManager.getInstance(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(workManager, "");
        workManager.enqueueUniqueWork("crypto_widget_work", ExistingWorkPolicy.APPEND_OR_REPLACE, new OneTimeWorkRequest.Builder(CryptoWidgetWorker.class).setInitialDelay(3L, TimeUnit.MINUTES).build());
    }
}
