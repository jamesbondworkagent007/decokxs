package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PopupInfoItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fXJ {
    public static final fXJ KWHzl = new fXJ();

    private fXJ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.fragment.app.FragmentActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull FragmentActivity fragmentActivity, @androidx.annotation.IdRes int i, @NotNull PreExecTransactionRes preExecTransactionRes) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        java.util.List<PopupInfoItem> popupInfoList = preExecTransactionRes.getPopupInfoList();
        if (popupInfoList == null || popupInfoList.isEmpty()) {
            return;
        }
        InterfaceC57493yjU interfaceC57493yjU = fragmentActivity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) fragmentActivity : null;
        if (interfaceC57493yjU != null) {
            interfaceC57493yjU.djBIcL();
        }
        OLrzqt(fragmentActivity, i, null, preExecTransactionRes.getPopupInfoList().iterator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.fragment.app.FragmentActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(final FragmentActivity fragmentActivity, @androidx.annotation.IdRes final int i, androidx.fragment.app.Fragment fragment, final java.util.Iterator<PopupInfoItem> it) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragment != null) {
            fragmentTransactionBeginTransaction.remove(fragment);
        }
        if (it.hasNext()) {
            final fZS fzsOLrzqt = fZS.Companion.OLrzqt(it.next());
            fzsOLrzqt.AEQbTJ(new Function0() { // from class: o.fXK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fXJ.OLrzqt(fragmentActivity);
                }
            });
            fzsOLrzqt.OLrzqt(new Function0() { // from class: o.fXO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fXJ.KWHzl(fragmentActivity, i, fzsOLrzqt, it);
                }
            });
            fragmentTransactionBeginTransaction.add(i, fzsOLrzqt);
        } else {
            if (fragment != null) {
                android.os.Bundle bundle = android.os.Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(bundle, "");
                FragmentKt.setFragmentResult(fragment, "request_key_kys_tip_fragment", bundle);
            }
            InterfaceC57493yjU interfaceC57493yjU = fragmentActivity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) fragmentActivity : null;
            if (interfaceC57493yjU != null) {
                interfaceC57493yjU.DbNXlk();
            }
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final Unit OLrzqt(FragmentActivity fragmentActivity) {
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, int i, fZS fzs, java.util.Iterator it) {
        KWHzl.OLrzqt(fragmentActivity, i, fzs, it);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull FragmentActivity fragmentActivity, @NotNull PreExecTransactionRes preExecTransactionRes, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.util.List<PopupInfoItem> popupInfoList = preExecTransactionRes.getPopupInfoList();
        if (popupInfoList == null || popupInfoList.isEmpty()) {
            function0.invoke();
        } else {
            fragmentActivity.getSupportFragmentManager().setFragmentResultListener("request_key_kys_tip_fragment", lifecycleOwner, new FragmentResultListener() { // from class: o.fXG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    fXJ.OLrzqt(function0, str, bundle);
                }
            });
        }
    }

    public static final void OLrzqt(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        function0.invoke();
    }
}
