package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25493ixk;

/* JADX INFO: renamed from: o.jfH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26591jfH extends ViewModel {
    public final MutableStateFlow<java.lang.Boolean> KWHzl = StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.jfH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jfH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.List<InterfaceC27436jvE> AEQbTJ(InvestSubscriptionProtocolModel investSubscriptionProtocolModel) {
        java.util.List<InvestItem> listOLrzqt;
        java.util.Collection collectionAhwBna;
        java.util.List<InvestItem> listOLrzqt2;
        java.util.List<InvestItem> listEZpvd;
        java.util.Collection collectionAhwBna2;
        java.util.List<InvestItem> listEZpvd2;
        java.util.Collection collectionAhwBna3;
        java.util.List<InvestItem> listOLrzqt3;
        java.util.List<InvestItem> listEZpvd3;
        java.util.Collection collectionAhwBna4;
        java.util.List<InvestItem> listEZpvd4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.KWHzl.getValue().booleanValue()) {
            if (investSubscriptionProtocolModel != null && (listEZpvd = investSubscriptionProtocolModel.EZpvd()) != null && C33129mqd.KWHzl((java.util.Collection) listEZpvd)) {
                arrayList.add(new C26587jfD(C33070mpX.AYXKKw(C25493ixk.FragmentManager.aKErDB)));
                if (investSubscriptionProtocolModel == null || (listEZpvd2 = investSubscriptionProtocolModel.EZpvd()) == null) {
                    collectionAhwBna2 = yDY.AhwBna();
                } else {
                    collectionAhwBna2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
                    for (InvestItem investItem : listEZpvd2) {
                        java.lang.String strOLrzqt = investItem.OLrzqt();
                        java.lang.String strKWHzl = investItem.KWHzl();
                        java.lang.String strEZpvd = investItem.EZpvd();
                        TokenInvestDetail tokenInvestDetailAEQbTJ = investItem.AEQbTJ();
                        long jCopydefault = investItem.copydefault();
                        TokenInvestDetail tokenInvestDetailAEQbTJ2 = investItem.AEQbTJ();
                        collectionAhwBna2.add(new C26589jfF(jCopydefault, strOLrzqt, strKWHzl, strEZpvd, tokenInvestDetailAEQbTJ, false, false, tokenInvestDetailAEQbTJ2 != null ? java.lang.Long.valueOf(tokenInvestDetailAEQbTJ2.EZpvd()) : null, investItem.djBIcL(), 96, null));
                    }
                }
                arrayList.addAll(collectionAhwBna2);
            }
            if (investSubscriptionProtocolModel != null && (listOLrzqt = investSubscriptionProtocolModel.OLrzqt()) != null && C33129mqd.KWHzl((java.util.Collection) listOLrzqt)) {
                arrayList.add(new C27433jvB(16.0f));
                arrayList.add(new C26587jfD(C33070mpX.AYXKKw(C25493ixk.FragmentManager.dNCPSb)));
                if (investSubscriptionProtocolModel == null || (listOLrzqt2 = investSubscriptionProtocolModel.OLrzqt()) == null) {
                    collectionAhwBna = yDY.AhwBna();
                } else {
                    collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                    for (InvestItem investItem2 : listOLrzqt2) {
                        java.lang.String strOLrzqt2 = investItem2.OLrzqt();
                        java.lang.String strKWHzl2 = investItem2.KWHzl();
                        java.lang.String strEZpvd2 = investItem2.EZpvd();
                        TokenInvestDetail tokenInvestDetailAEQbTJ3 = investItem2.AEQbTJ();
                        long jCopydefault2 = investItem2.copydefault();
                        TokenInvestDetail tokenInvestDetailAEQbTJ4 = investItem2.AEQbTJ();
                        collectionAhwBna.add(new C26589jfF(jCopydefault2, strOLrzqt2, strKWHzl2, strEZpvd2, tokenInvestDetailAEQbTJ3, false, true, tokenInvestDetailAEQbTJ4 != null ? java.lang.Long.valueOf(tokenInvestDetailAEQbTJ4.EZpvd()) : null, investItem2.djBIcL(), 32, null));
                    }
                }
                arrayList.addAll(collectionAhwBna);
            }
        } else if (investSubscriptionProtocolModel != null && (listEZpvd3 = investSubscriptionProtocolModel.EZpvd()) != null && C33129mqd.KWHzl((java.util.Collection) listEZpvd3)) {
            arrayList.add(new C26587jfD(C33070mpX.AYXKKw(C25493ixk.FragmentManager.aKErDB)));
            if (investSubscriptionProtocolModel == null || (listEZpvd4 = investSubscriptionProtocolModel.EZpvd()) == null) {
                collectionAhwBna4 = yDY.AhwBna();
            } else {
                collectionAhwBna4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd4, 10));
                for (InvestItem investItem3 : listEZpvd4) {
                    java.lang.String strOLrzqt3 = investItem3.OLrzqt();
                    java.lang.String strKWHzl3 = investItem3.KWHzl();
                    java.lang.String strEZpvd3 = investItem3.EZpvd();
                    TokenInvestDetail tokenInvestDetailAEQbTJ5 = investItem3.AEQbTJ();
                    long jCopydefault3 = investItem3.copydefault();
                    TokenInvestDetail tokenInvestDetailAEQbTJ6 = investItem3.AEQbTJ();
                    collectionAhwBna4.add(new C26589jfF(jCopydefault3, strOLrzqt3, strKWHzl3, strEZpvd3, tokenInvestDetailAEQbTJ5, false, false, tokenInvestDetailAEQbTJ6 != null ? java.lang.Long.valueOf(tokenInvestDetailAEQbTJ6.EZpvd()) : null, investItem3.djBIcL(), 96, null));
                }
            }
            arrayList.addAll(collectionAhwBna4);
        } else {
            arrayList.add(new C26587jfD(C33070mpX.AYXKKw(C25493ixk.FragmentManager.dNCPSb)));
            if (investSubscriptionProtocolModel == null || (listOLrzqt3 = investSubscriptionProtocolModel.OLrzqt()) == null) {
                collectionAhwBna3 = yDY.AhwBna();
            } else {
                collectionAhwBna3 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt3, 10));
                for (InvestItem investItem4 : listOLrzqt3) {
                    java.lang.String strOLrzqt4 = investItem4.OLrzqt();
                    java.lang.String strKWHzl4 = investItem4.KWHzl();
                    java.lang.String strEZpvd4 = investItem4.EZpvd();
                    TokenInvestDetail tokenInvestDetailAEQbTJ7 = investItem4.AEQbTJ();
                    long jCopydefault4 = investItem4.copydefault();
                    TokenInvestDetail tokenInvestDetailAEQbTJ8 = investItem4.AEQbTJ();
                    collectionAhwBna3.add(new C26589jfF(jCopydefault4, strOLrzqt4, strKWHzl4, strEZpvd4, tokenInvestDetailAEQbTJ7, false, true, tokenInvestDetailAEQbTJ8 != null ? java.lang.Long.valueOf(tokenInvestDetailAEQbTJ8.EZpvd()) : null, investItem4.djBIcL(), 32, null));
                }
            }
            arrayList.addAll(collectionAhwBna3);
        }
        if (KWHzl(investSubscriptionProtocolModel)) {
            arrayList.add(new C26625jfp(this.KWHzl.getValue().booleanValue()));
        }
        return arrayList;
    }

    public final void AEQbTJ() {
        this.KWHzl.setValue(java.lang.Boolean.valueOf(!r0.getValue().booleanValue()));
    }

    public final boolean KWHzl(InvestSubscriptionProtocolModel investSubscriptionProtocolModel) {
        java.util.List<InvestItem> listEZpvd;
        java.util.List<InvestItem> listOLrzqt;
        return (investSubscriptionProtocolModel == null || (listEZpvd = investSubscriptionProtocolModel.EZpvd()) == null || !C33129mqd.KWHzl((java.util.Collection) listEZpvd) || investSubscriptionProtocolModel == null || (listOLrzqt = investSubscriptionProtocolModel.OLrzqt()) == null || !C33129mqd.KWHzl((java.util.Collection) listOLrzqt)) ? false : true;
    }
}
