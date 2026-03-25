package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.LocalizeEventReport;
import com.okinc.localization2.LocalizeInit$init$1;
import com.okinc.localization2.LocalizeInit$initInTheBackground$1;
import com.okinc.localization2.LocalizeInit$initInternal$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTN {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final android.content.Context AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public pTN(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = context;
        this.copydefault = coroutineDispatcher;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pTJ ptjAxsJAYsNCnLh = ((LocalizeDIModule.Application) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Application.class)).AxsJAYsNCnLh();
        if (C43308rmo.OLrzqt(this.AEQbTJ)) {
            BuildersKt__BuildersKt.runBlocking$default(null, new LocalizeInit$init$1(this, str, ptjAxsJAYsNCnLh, null), 1, null);
        } else {
            EZpvd(str, ptjAxsJAYsNCnLh);
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull pTJ ptj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ptj, "");
        pUU.KWHzl("LocalizeInit", "initInTheBackground, start");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(this.copydefault)), null, null, new LocalizeInit$initInTheBackground$1(this, str, ptj, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull pTJ ptj, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        LocalizeInit$initInternal$1 localizeInit$initInternal$1;
        long jCurrentTimeMillis;
        pTN ptn;
        if (continuation instanceof LocalizeInit$initInternal$1) {
            localizeInit$initInternal$1 = (LocalizeInit$initInternal$1) continuation;
            int i = localizeInit$initInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localizeInit$initInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                localizeInit$initInternal$1 = new LocalizeInit$initInternal$1(this, continuation);
            }
        }
        java.lang.Object obj = localizeInit$initInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = localizeInit$initInternal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            localizeInit$initInternal$1.L$0 = this;
            localizeInit$initInternal$1.L$1 = str;
            localizeInit$initInternal$1.J$0 = jCurrentTimeMillis;
            localizeInit$initInternal$1.label = 1;
            if (ptj.KWHzl(localizeInit$initInternal$1) == objCopydefault) {
                return objCopydefault;
            }
            ptn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = localizeInit$initInternal$1.J$0;
            java.lang.String str2 = (java.lang.String) localizeInit$initInternal$1.L$1;
            ptn = (pTN) localizeInit$initInternal$1.L$0;
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = j;
            str = str2;
        }
        if (C43308rmo.KWHzl(ptn.AEQbTJ)) {
            ptn.copydefault(str);
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        oJV ojv = oJV.AEQbTJ;
        Function0<Unit> function0FetchVPNInfo = ojv.fetchVPNInfo();
        if (function0FetchVPNInfo != null) {
            function0FetchVPNInfo.invoke();
        }
        ojv.AEQbTJ(jCurrentTimeMillis2);
        if (C43308rmo.KWHzl(ptn.AEQbTJ)) {
            LocalizeEventReport.INSTANCE.reportCostTime(jCurrentTimeMillis2);
        }
        pUU.KWHzl("LocalizeInit", "LocalizeInit, cost:" + jCurrentTimeMillis2);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C54807xWa.AEQbTJ()) {
            pUU.KWHzl("LocalizeInit", "initOKLocalizationReport, skip report");
            pSK.KWHzl.EZpvd(true);
        } else {
            pSQ psq = pSQ.copydefault;
            android.content.Context context = this.AEQbTJ;
            Intrinsics.copydefault(context, "");
            psq.KWHzl((android.app.Application) context, str);
        }
    }

    public final void EZpvd() {
        pSQ.copydefault.AuCTel();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
