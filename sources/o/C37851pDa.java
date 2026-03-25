package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.kline.ui.view.model.MarketDealItem;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37851pDa extends ViewModel {
    public InterfaceC58217yxC djBIcL;
    public MutableLiveData<java.util.ArrayList<MarketDealItem>> AEQbTJ = new MutableLiveData<>();
    public final CopyOnWriteArrayList<MarketDealItem> KWHzl = new CopyOnWriteArrayList<>();
    public java.util.ArrayList<xOA> copydefault = new java.util.ArrayList<>(100);
    public final java.util.ArrayList<xOA> OLrzqt = new java.util.ArrayList<>(100);
    public MutableLiveData<java.lang.String> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC58217yxC interfaceC58217yxC) {
        this.djBIcL = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<xOA> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<xOA> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<MarketDealItem> copydefault() {
        return this.KWHzl;
    }

    public final void AEQbTJ() {
        this.KWHzl.clear();
    }

    public final void EZpvd(@NotNull java.util.List<xOA> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            xOA xoa = (xOA) obj;
            if (i < 25) {
                MarketDealItem marketDealItem = new MarketDealItem(null, null, null, null, 0L, 31, null);
                marketDealItem.setPrice(xoa.EZpvd());
                marketDealItem.setAmount(xoa.copydefault());
                marketDealItem.setSide(xoa.OLrzqt());
                marketDealItem.setCreatedDate(C33129mqd.valueOf(xoa.KWHzl()));
                boolean z = false;
                for (MarketDealItem marketDealItem2 : this.KWHzl) {
                    if (Intrinsics.EZpvd((java.lang.Object) marketDealItem2.getPrice(), (java.lang.Object) marketDealItem.getPrice()) && Intrinsics.EZpvd((java.lang.Object) marketDealItem2.getAmount(), (java.lang.Object) marketDealItem.getAmount()) && Intrinsics.EZpvd((java.lang.Object) marketDealItem2.getSide(), (java.lang.Object) marketDealItem.getSide()) && marketDealItem2.getCreatedDate() == marketDealItem.getCreatedDate()) {
                        z = true;
                    }
                }
                if (!z) {
                    if (this.KWHzl.size() == 25) {
                        this.KWHzl.remove(24);
                    }
                    this.KWHzl.add(i2, marketDealItem);
                    i2++;
                }
            }
            i++;
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<xOA> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            xOA xoa = (xOA) obj;
            if (i < 100) {
                if (this.copydefault.size() == 100) {
                    this.copydefault.remove(99);
                }
                java.util.ArrayList<xOA> arrayList = this.copydefault;
                xOA xoa2 = new xOA();
                xoa2.EZpvd(xoa.EZpvd());
                xoa2.OLrzqt(xoa.copydefault());
                xoa2.copydefault(xoa.OLrzqt());
                xoa2.KWHzl(xoa.KWHzl());
                Unit unit = Unit.INSTANCE;
                arrayList.add(i, xoa2);
            }
            i++;
        }
    }
}
