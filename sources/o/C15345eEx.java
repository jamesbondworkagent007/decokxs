package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.AddressAssetResp;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eEx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15345eEx extends AbstractC33073mpa {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eEu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15345eEx.EZpvd();
        }
    });
    public final java.util.ArrayList<eFG> EZpvd = new java.util.ArrayList<>();
    public final MutableLiveData<java.util.ArrayList<java.lang.Object>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> KWHzl = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.ArrayList<java.lang.Object>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    public static final C13934dbu EZpvd() {
        return new C13934dbu();
    }

    public final C13934dbu copydefault() {
        return (C13934dbu) this.OLrzqt.getValue();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<C10854bwM> listDbNXlk = C10954byG.EZpvd.valueOf().DbNXlk();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        for (C10854bwM c10854bwM : listDbNXlk) {
            arrayList2.add(new eFG(c10854bwM.AhwBna(), c10854bwM.copydefault(), c10854bwM.djBIcL(), null, "-- " + c10854bwM.fJNWhG(), null, 32, null));
        }
        yBK.EZpvd(C33527myD.subscribeOnIO$default(C32962mnV.unwrapResponseData$default(copydefault().fetchVPNInfo(str), (Function1) null, 1, (java.lang.Object) null), new Function1() { // from class: o.eEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15345eEx.OLrzqt(this.KWHzl, arrayList, arrayList2, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.eEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15345eEx.KWHzl(this.KWHzl, arrayList2, arrayList, (java.util.List) obj);
            }
        }, 2, (java.lang.Object) null), call());
    }

    public static final Unit OLrzqt(C15345eEx c15345eEx, java.util.ArrayList arrayList, java.util.List list, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c15345eEx.KWHzl.setValue(th.getMessage());
        arrayList.addAll(list);
        c15345eEx.copydefault.setValue(arrayList);
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        if (z) {
            arrayList.addAll(this.EZpvd);
            arrayList.add(new eFM(true));
        } else {
            java.util.ArrayList<eFG> arrayList2 = this.EZpvd;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList2) {
                if (C33129mqd.AEQbTJ(((eFG) obj).KWHzl(), "0")) {
                    arrayList3.add(obj);
                }
            }
            arrayList.addAll(arrayList3);
            arrayList.add(new eFM(false));
        }
        this.copydefault.setValue(arrayList);
    }

    public static final Unit KWHzl(C15345eEx c15345eEx, java.util.List list, java.util.ArrayList arrayList, java.util.List list2) {
        java.lang.String strEZpvd;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            AddressAssetResp addressAssetResp = (AddressAssetResp) it.next();
            if (C33129mqd.AEQbTJ(addressAssetResp.OLrzqt(), "0")) {
                i++;
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(addressAssetResp.EZpvd());
            if (c10854bwMKWHzl != null) {
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    strEZpvd = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    long jCopydefault = ((eFG) next).copydefault();
                    java.lang.Long lEZpvd = addressAssetResp.EZpvd();
                    if (lEZpvd != null && jCopydefault == lEZpvd.longValue()) {
                        break;
                    }
                }
                eFG efg = (eFG) next;
                if (efg != null) {
                    efg.AEQbTJ(addressAssetResp.OLrzqt());
                    java.lang.String strOLrzqt = addressAssetResp.OLrzqt();
                    if (strOLrzqt != null) {
                        strEZpvd = C54870xYj.EZpvd(strOLrzqt, c10854bwMKWHzl.valueOf(), c10854bwMKWHzl.AkhnZx(), c10854bwMKWHzl.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                    }
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    efg.copydefault(strEZpvd);
                    efg.OLrzqt(addressAssetResp.KWHzl());
                }
            }
        }
        c15345eEx.EZpvd.clear();
        c15345eEx.EZpvd.addAll(list);
        if (i <= 0 || i >= list.size()) {
            arrayList.addAll(list);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (C33129mqd.AEQbTJ(((eFG) obj).KWHzl(), "0")) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new eFM(false));
        }
        c15345eEx.copydefault.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
