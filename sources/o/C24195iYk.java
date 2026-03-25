package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24195iYk extends AbstractC52792wYn {
    public DashboardListMode AEQbTJ = DashboardListMode.TOKEN;
    public Function1<? super DashboardListMode, Unit> EZpvd;

    /* JADX INFO: renamed from: o.iYk$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DashboardListMode.values().length];
            try {
                iArr[DashboardListMode.TOKEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DashboardListMode.PROTOCOL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DashboardListMode.RECOMMEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super DashboardListMode, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public final void OLrzqt(@NotNull DashboardListMode dashboardListMode) {
        DashboardListMode dashboardListMode2;
        Intrinsics.checkNotNullParameter(dashboardListMode, "");
        int i = Activity.copydefault[dashboardListMode.ordinal()];
        if (i == 1) {
            dashboardListMode2 = DashboardListMode.TOKEN;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dashboardListMode2 = DashboardListMode.PROTOCOL;
        }
        this.AEQbTJ = dashboardListMode2;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.ULRxlR);
        DashboardListMode dashboardListMode = DashboardListMode.TOKEN;
        c55276xgrArr[0] = new C55276xgr(strAYXKKw, dashboardListMode, null, this.AEQbTJ == dashboardListMode, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.RKcVTr);
        DashboardListMode dashboardListMode2 = DashboardListMode.PROTOCOL;
        c55276xgrArr[1] = new C55276xgr(strAYXKKw2, dashboardListMode2, null, this.AEQbTJ == dashboardListMode2, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        c55198xfS.setSingleOneColumnData(yDY.gEmmrt(c55276xgrArr), new yHO() { // from class: o.iYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C24195iYk.KWHzl(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit KWHzl(C24195iYk c24195iYk, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        if (c55276xgr != null) {
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            DashboardListMode dashboardListMode = objOLrzqt instanceof DashboardListMode ? (DashboardListMode) objOLrzqt : null;
            if (dashboardListMode != null && (dashboardListMode == DashboardListMode.TOKEN || dashboardListMode == DashboardListMode.PROTOCOL)) {
                Function1<? super DashboardListMode, Unit> function1 = c24195iYk.EZpvd;
                if (function1 != null) {
                    function1.invoke(dashboardListMode);
                }
                c24195iYk.dismissAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }
}
