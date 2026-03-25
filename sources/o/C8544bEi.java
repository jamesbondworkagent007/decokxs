package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46550tYm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bEi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8544bEi {
    public WalletCurrencyBean EZpvd = C54864xYd.AEQbTJ.copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull WalletCurrencyBean walletCurrencyBean) {
        Intrinsics.checkNotNullParameter(walletCurrencyBean, "");
        this.EZpvd = walletCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCurrencyBean KWHzl() {
        return this.EZpvd;
    }

    public final AbstractC58185ywX<Unit> EZpvd(final java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXOLrzqt = C13933dbt.okServerExceptionFilter$default(InterfaceC46550tYm.ActionBar.getCurrencyList$default((InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class), false, 1, null), null, 1, null).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null)));
        final Function1 function1 = new Function1() { // from class: o.bEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8544bEi.EZpvd(this.EZpvd, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8544bEi.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(C8544bEi c8544bEi, java.lang.String str, ResponseData responseData) {
        WalletCurrencyBean walletCurrencyBean;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.ArrayList arrayList = (java.util.ArrayList) responseData.getData();
        ValuationCurrencyBean valuationCurrencyBean = null;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (C59449zhJ.gEmmrt(((ValuationCurrencyBean) next).getIsoCode(), str, true)) {
                    obj = next;
                    break;
                }
            }
            valuationCurrencyBean = (ValuationCurrencyBean) obj;
        }
        if (valuationCurrencyBean == null) {
            walletCurrencyBean = C54864xYd.AEQbTJ.copydefault();
        } else {
            walletCurrencyBean = new WalletCurrencyBean(valuationCurrencyBean.getIsoCode(), valuationCurrencyBean.getSymbol(), valuationCurrencyBean.getUsdToThisRate(), valuationCurrencyBean.getPrecision(), 12);
        }
        c8544bEi.EZpvd = walletCurrencyBean;
        return Unit.INSTANCE;
    }
}
