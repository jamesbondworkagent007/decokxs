package o;

import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20261gdZ extends C20250gdO<C8972bMm<EVM5792ContractSignData>> {
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20250gdO, o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (((C8972bMm) ejfBZ()).dUDNAs().gHZMYf() || ((C8972bMm) ejfBZ()).dUDNAs().AEQbTJ(WalletType.HardwareWallet)) {
            return;
        }
        gEmmrt().KWHzl.setPrimaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.shouldAnimateActionModeView));
        gEmmrt().KWHzl.setSecondaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateStatusGuard));
    }

    @Override // o.AbstractC20238gdC, o.AbstractC20237gdB
    public java.lang.Object AEQbTJ(@NotNull BaseModel<?> baseModel, boolean z) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        java.lang.Object objAEQbTJ = super.AEQbTJ(baseModel, z);
        final int iDpInt$default = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
        Function1 function1 = new Function1() { // from class: o.geb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20261gdZ.OLrzqt(iDpInt$default, obj);
            }
        };
        if (!(objAEQbTJ instanceof java.util.List)) {
            if (objAEQbTJ instanceof java.lang.Object[]) {
                for (java.lang.Object obj : (java.lang.Object[]) objAEQbTJ) {
                    function1.invoke(obj);
                }
            } else {
                function1.invoke(objAEQbTJ);
            }
        } else {
            java.util.Iterator it = ((java.lang.Iterable) objAEQbTJ).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
        return objAEQbTJ;
    }

    public static final Unit OLrzqt(int i, java.lang.Object obj) {
        if (obj instanceof C57428yiI) {
            if (((C57428yiI) obj).getPaddingBottom() > i) {
                android.view.View view = (android.view.View) obj;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
            }
        } else if ((obj instanceof C57466yiu) && ((C57466yiu) obj).getPaddingBottom() > i) {
            android.view.View view2 = (android.view.View) obj;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i);
        }
        return Unit.INSTANCE;
    }
}
