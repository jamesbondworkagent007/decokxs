package o;

import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes9.dex */
public final class pBN extends AbstractActivityC37800pBd {
    @Override // o.AbstractActivityC37805pBi
    public boolean DbNXlk() {
        return false;
    }

    @Override // o.AbstractActivityC37805pBi
    public void values() {
        java.lang.Object next;
        java.lang.Object next2;
        java.util.ArrayList<PriceWindowData.PriceWindowItem> arrayListAEQbTJ = PriceWindowData.AEQbTJ.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        for (PriceWindowData.PriceWindowItem priceWindowItem : arrayListAEQbTJ) {
            java.lang.String contract = priceWindowItem.getContract();
            java.lang.String strAEQbTJ = pFI.AEQbTJ(priceWindowItem.getKlineType());
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            arrayList.add(new pWP(contract, strAEQbTJ, null, null, null, 28, null));
        }
        pWS.OLrzqt.KWHzl(arrayList);
        java.lang.String strAhwBna = AhwBna();
        java.lang.String strAEQbTJ2 = pFI.AEQbTJ(valueOf());
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ2, "");
        pWP pwp = new pWP(strAhwBna, strAEQbTJ2, AYXKKw(), null, null, 24, null);
        kotlin.Pair<java.lang.String, java.lang.String> pair = null;
        if (!Intrinsics.EZpvd((java.lang.Object) pwp.KWHzl(), (java.lang.Object) "OPTION")) {
            java.util.Iterator<T> it = gEmmrt().iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((PriceWindowData.PriceWindowItem) next2).getContract(), (java.lang.Object) AhwBna())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (next2 == null) {
                pWS.OLrzqt.OLrzqt(pwp, true);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((pWP) next).AEQbTJ(), (java.lang.Object) pwp.AEQbTJ())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = next != null ? null : C56390yDp.OLrzqt(pwp.KWHzl(), pwp.AEQbTJ());
        if (pairOLrzqt != null && (!Intrinsics.EZpvd((java.lang.Object) pairOLrzqt.getFirst(), (java.lang.Object) "OPTION"))) {
            pair = pairOLrzqt;
        }
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class);
        if (interfaceC43033rhe != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((pWP) it3.next()).AEQbTJ());
            }
            interfaceC43033rhe.KWHzl(supportFragmentManager, arrayList2, pair, new Function1() { // from class: o.pBM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pBN.KWHzl(this.copydefault, (java.util.List) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(pBN pbn, java.util.List list) {
        java.lang.String level;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            BizInstrument bizInstrument = (BizInstrument) it.next();
            java.util.ArrayList<PriceWindowData.PriceWindowItem> arrayListGEmmrt = pbn.gEmmrt();
            java.lang.String instId = bizInstrument.getInstId();
            int iKWHzl = pFI.KWHzl(bizInstrument.getInstType());
            SpotInstrument spotInstrument = bizInstrument instanceof SpotInstrument ? (SpotInstrument) bizInstrument : null;
            arrayListGEmmrt.add(new PriceWindowData.PriceWindowItem(instId, iKWHzl, null, null, (spotInstrument == null || (level = spotInstrument.getLevel()) == null) ? "" : level, pbn.AEQbTJ(bizInstrument.getInstId(), bizInstrument.getInstType()), pbn.KWHzl(bizInstrument.getInstId(), interfaceC54581xNrOLrzqt), 12, null));
        }
        PriceWindowData.AEQbTJ.OLrzqt(pbn.gEmmrt());
        C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.itxZVF));
        pbn.OLrzqt().notifyDataSetChanged();
        pBO.dxcTrN.fIwbmz();
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(java.lang.String str, InterfaceC54581xNr interfaceC54581xNr) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf = (str == null || interfaceC54581xNr == null || (abstractC54531xLwOLrzqt = interfaceC54581xNr.OLrzqt("SPOT")) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str);
        if (bizInstrumentValueOf != null) {
            return bizInstrumentValueOf.getDisplayId();
        }
        return str == null ? "" : str;
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = ((InterfaceC54577xNn) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.MANAGER)).copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
        if (minSuggestedInstrument$default != null) {
            return minSuggestedInstrument$default.isPreMarketPair();
        }
        return false;
    }

    @Override // o.AbstractActivityC37800pBd, o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37800pBd, o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37800pBd, o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37800pBd, o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC37800pBd, o.AbstractActivityC37805pBi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
