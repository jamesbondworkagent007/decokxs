package o;

import android.content.SharedPreferences;
import com.okinc.okuser.data.User;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXK extends AbstractC43215rlA implements InterfaceC46553tYp {
    @Override // o.InterfaceC46553tYp
    public ValuationCurrencyBean zLjUOn() {
        ValuationCurrencyBean valuationCurrencyBeanEZpvd = tXM.OLrzqt.EZpvd();
        return valuationCurrencyBeanEZpvd == null ? new ValuationCurrencyBean() : valuationCurrencyBeanEZpvd;
    }

    @Override // o.InterfaceC46553tYp
    public java.lang.String QVAiDq() {
        return tXM.OLrzqt.valueOf();
    }

    @Override // o.InterfaceC46553tYp
    public int QKVWgx() {
        return tXM.OLrzqt.KWHzl();
    }

    @Override // o.InterfaceC46553tYp
    public java.lang.String QUSxYX() {
        return tXM.OLrzqt.gEmmrt();
    }

    @Override // o.InterfaceC46553tYp
    public java.lang.String RJOkX() {
        return tXM.OLrzqt.djBIcL();
    }

    @Override // o.InterfaceC46553tYp
    public double QbewEr() {
        return tXM.OLrzqt.AYXKKw();
    }

    @Override // o.InterfaceC46553tYp
    public int QfsBiF() {
        return tXM.OLrzqt.AhwBna();
    }

    @Override // o.InterfaceC46553tYp
    public int OcIXYQ() {
        return tXM.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC46553tYp
    public void AEQbTJ(@NotNull android.content.Context context, int i, boolean z) {
        java.lang.Object next;
        java.lang.String isoCode;
        Intrinsics.checkNotNullParameter(context, "");
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        java.lang.String str = (userOLrzqt != null ? userOLrzqt.getLoginName() : null) + "total_assets_unit";
        java.util.Iterator<T> it = QOLQEE().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ValuationCurrencyBean) next).getCurrencyId() == i) {
                    break;
                }
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        if (valuationCurrencyBean == null || (isoCode = valuationCurrencyBean.getIsoCode()) == null) {
            isoCode = "";
        }
        if (z) {
            android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.putString(str, isoCode);
            editorEdit.apply();
        } else {
            C43246rlf c43246rlf = C43246rlf.OLrzqt;
            java.lang.String string = c43246rlf.valueOf().getSharedPreferences("config", 0).getString(str, "");
            if (!C59449zhJ.equals$default(string, "BTC", false, 2, null) && !C59449zhJ.equals$default(string, "USDT", false, 2, null)) {
                android.content.SharedPreferences sharedPreferences2 = c43246rlf.valueOf().getSharedPreferences("config", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "");
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                Intrinsics.checkNotNullExpressionValue(editorEdit2, "");
                editorEdit2.putString(str, isoCode);
                editorEdit2.apply();
            }
        }
        tXM.OLrzqt.AEQbTJ(context, i);
    }

    @Override // o.InterfaceC46553tYp
    public void AEQbTJ(@NotNull InterfaceC46547tYj interfaceC46547tYj) {
        Intrinsics.checkNotNullParameter(interfaceC46547tYj, "");
        tXM.OLrzqt.EZpvd(interfaceC46547tYj);
    }

    @Override // o.InterfaceC46553tYp
    public void copydefault(@NotNull java.util.ArrayList<ValuationCurrencyBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        tXM.OLrzqt.OLrzqt(arrayList);
    }

    @Override // o.InterfaceC46553tYp
    public java.util.ArrayList<ValuationCurrencyBean> QOLQEE() {
        java.util.ArrayList<ValuationCurrencyBean> arrayListAEQbTJ = tXM.OLrzqt.AEQbTJ();
        return arrayListAEQbTJ == null ? new java.util.ArrayList<>() : arrayListAEQbTJ;
    }

    @Override // o.InterfaceC46553tYp
    public void fJNWhG() {
        tXM.OLrzqt.OLrzqt();
    }
}
