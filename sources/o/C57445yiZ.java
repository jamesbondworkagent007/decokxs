package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57441yiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57445yiZ {
    public static final C57445yiZ copydefault = new C57445yiZ();

    private C57445yiZ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: androidx.fragment.app.FragmentActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull final FragmentActivity fragmentActivity, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.IdRes final int i, @NotNull final RiskPageInfoBean riskPageInfoBean, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Function0<Unit> function05) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(riskPageInfoBean, "");
        InterfaceC57493yjU interfaceC57493yjU = fragmentActivity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) fragmentActivity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.djBIcL();
        }
        C57441yiV.TaskDescription taskDescription = C57441yiV.Companion;
        final C57441yiV c57441yiVAEQbTJ = taskDescription.AEQbTJ(riskPageInfoBean.getSecondTitle(), riskPageInfoBean.getSecondSubTitle(), (4 & 4) != 0 ? "" : null, riskPageInfoBean.getSecondPrimaryBtnContent(), riskPageInfoBean.getSecondSecondaryBtnContent(), (4 & 32) != 0 ? "" : riskPageInfoBean.getReportTitle(), false, new Function0() { // from class: o.yjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57445yiZ.OLrzqt(function03, fragmentManager, fragmentActivity);
            }
        }, new Function0() { // from class: o.yje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57445yiZ.AEQbTJ(function04, fragmentActivity);
            }
        }, (4 & 512) != 0 ? null : function05);
        fragmentManager.beginTransaction().add(i, taskDescription.AEQbTJ(riskPageInfoBean.getFirstTitle(), riskPageInfoBean.getFirstSubTitle(), riskPageInfoBean.getFristSubTitleClickableText(), riskPageInfoBean.getFirstPrimaryBtnContent(), riskPageInfoBean.getFirstSecondaryBtnContent(), riskPageInfoBean.getReportTitle(), true, new Function0() { // from class: o.yjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57445yiZ.OLrzqt(function0, fragmentActivity);
            }
        }, new Function0() { // from class: o.yji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57445yiZ.EZpvd(fragmentManager, function02, riskPageInfoBean, i, c57441yiVAEQbTJ, fragmentActivity);
            }
        }, function05), "SafeRelatedRiskFirstPage").commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.fragment.app.FragmentActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Function0 function0, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity) {
        if (function0 != null) {
            function0.invoke();
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("SafeRelatedRiskSecondPage");
        if (fragmentFindFragmentByTag != null) {
            InterfaceC57493yjU interfaceC57493yjU = fragmentActivity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) fragmentActivity : null;
            if (interfaceC57493yjU != null) {
                interfaceC57493yjU.DbNXlk();
            }
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, FragmentActivity fragmentActivity) {
        if (function0 != null) {
            function0.invoke();
        }
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0, FragmentActivity fragmentActivity) {
        if (function0 != null) {
            function0.invoke();
        }
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: androidx.fragment.app.FragmentActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, RiskPageInfoBean riskPageInfoBean, int i, C57441yiV c57441yiV, FragmentActivity fragmentActivity) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("SafeRelatedRiskFirstPage");
        if (fragmentFindFragmentByTag != null) {
            if (function0 != null) {
                function0.invoke();
            }
            if (!riskPageInfoBean.isShowSinglePage()) {
                fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).add(i, c57441yiV, "SafeRelatedRiskSecondPage").commitAllowingStateLoss();
            } else {
                InterfaceC57493yjU interfaceC57493yjU = fragmentActivity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) fragmentActivity : null;
                if (interfaceC57493yjU != null) {
                    interfaceC57493yjU.DbNXlk();
                }
                fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }
}
