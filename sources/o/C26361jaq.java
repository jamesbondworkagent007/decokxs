package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardModePreUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardModePreUseCaseImpl$save$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26361jaq implements InterfaceC26359jao {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C23642iDy EZpvd;

    @yCM
    public C26361jaq(@NotNull C23642iDy c23642iDy) {
        Intrinsics.checkNotNullParameter(c23642iDy, "");
        this.EZpvd = c23642iDy;
    }

    /* JADX INFO: renamed from: o.jaq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jaq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC26359jao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends DashboardListMode>> continuation) {
        DashboardModePreUseCaseImpl$invoke$1 dashboardModePreUseCaseImpl$invoke$1;
        java.lang.Object objAEQbTJ;
        DashboardListMode next;
        if (continuation instanceof DashboardModePreUseCaseImpl$invoke$1) {
            dashboardModePreUseCaseImpl$invoke$1 = (DashboardModePreUseCaseImpl$invoke$1) continuation;
            int i = dashboardModePreUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardModePreUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardModePreUseCaseImpl$invoke$1 = new DashboardModePreUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardModePreUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardModePreUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23642iDy c23642iDy = this.EZpvd;
            dashboardModePreUseCaseImpl$invoke$1.label = 1;
            objAEQbTJ = c23642iDy.AEQbTJ("invest_list_mode", -1, dashboardModePreUseCaseImpl$invoke$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            try {
                Result.Application application = Result.Companion;
                int iIntValue = ((java.lang.Number) objAEQbTJ).intValue();
                java.util.Iterator<DashboardListMode> it = DashboardListMode.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.getV() == iIntValue) {
                        break;
                    }
                }
                DashboardListMode dashboardListMode = next;
                if (dashboardListMode == null) {
                    dashboardListMode = DashboardListMode.TOKEN;
                }
                return Result.m7377constructorimpl(dashboardListMode);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objAEQbTJ = C56391yDq.EZpvd(th);
            }
        }
        return Result.m7377constructorimpl(objAEQbTJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC26359jao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull DashboardListMode dashboardListMode, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        DashboardModePreUseCaseImpl$save$1 dashboardModePreUseCaseImpl$save$1;
        if (continuation instanceof DashboardModePreUseCaseImpl$save$1) {
            dashboardModePreUseCaseImpl$save$1 = (DashboardModePreUseCaseImpl$save$1) continuation;
            int i = dashboardModePreUseCaseImpl$save$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardModePreUseCaseImpl$save$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardModePreUseCaseImpl$save$1 = new DashboardModePreUseCaseImpl$save$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardModePreUseCaseImpl$save$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardModePreUseCaseImpl$save$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23642iDy c23642iDy = this.EZpvd;
        int v = dashboardListMode.getV();
        dashboardModePreUseCaseImpl$save$1.label = 1;
        java.lang.Object objCopydefault2 = c23642iDy.copydefault("invest_list_mode", v, dashboardModePreUseCaseImpl$save$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
