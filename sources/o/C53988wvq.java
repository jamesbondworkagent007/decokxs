package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53988wvq extends FragmentStateAdapter {
    public boolean AEQbTJ;
    public final java.util.ArrayList<java.lang.String> EZpvd;
    public Function1<? super MarketArbCoinInfo, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super MarketArbCoinInfo, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53988wvq(@NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = arrayList;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String str = this.EZpvd.get(i);
        int iHashCode = str.hashCode();
        if (iHashCode != 1311490956) {
            if (iHashCode == 1724028365 && str.equals("Watchlist")) {
                return C33070mpX.AYXKKw(C55688xof.Application.prepare);
            }
        } else if (str.equals("fundingRateArbitrage")) {
            return C33070mpX.AYXKKw(C55688xof.Application.QbewEr);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.dNCPSb);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.fragment.app.Fragment createFragment(int i) {
        AbstractC54084wxg c54103wxz;
        java.lang.String str = this.EZpvd.get(i);
        int iHashCode = str.hashCode();
        if (iHashCode != 1311490956) {
            if (iHashCode == 1724028365 && str.equals("Watchlist")) {
                c54103wxz = new C54102wxy();
            } else {
                c54103wxz = new C54053wxB();
            }
        } else if (str.equals("fundingRateArbitrage")) {
            c54103wxz = new C54103wxz();
        }
        Function1<? super MarketArbCoinInfo, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            c54103wxz.EZpvd(function1);
        }
        c54103wxz.AEQbTJ(this.AEQbTJ);
        return c54103wxz;
    }
}
