package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.market.discover.features.markets.card.future.CardFuturesListFragment;
import com.okinc.market.discover.features.markets.card.spot.CardSpotListFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZW extends FragmentStateAdapter implements mAR, pWJ {
    public final java.util.List<pWN> AEQbTJ;
    public final java.util.HashMap<pWN, androidx.fragment.app.Fragment> EZpvd;
    public final android.view.ViewGroup OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sZW(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.ViewGroup viewGroup, @NotNull java.util.List<pWN> list) {
        super(fragmentManager, fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = viewGroup;
        this.AEQbTJ = list;
        this.EZpvd = new java.util.HashMap<>();
    }

    public final androidx.fragment.app.Fragment KWHzl(int i) {
        return this.EZpvd.get(this.AEQbTJ.get(i));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(4);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    @Override // o.pWJ
    public int OLrzqt() {
        return this.AEQbTJ.size();
    }

    public final java.lang.CharSequence copydefault(int i) {
        return C33070mpX.AYXKKw(this.AEQbTJ.get(i).OLrzqt());
    }

    public final int AEQbTJ(int i) {
        return this.AEQbTJ.get(i).OLrzqt();
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String strKWHzl = this.AEQbTJ.get(i).KWHzl();
        return strKWHzl == null ? "" : strKWHzl;
    }

    @Override // o.pWJ
    public java.lang.String OLrzqt(int i) {
        return this.AEQbTJ.get(i).AEQbTJ();
    }

    private final mAS AEQbTJ() {
        return new TaskDescription(C33570myu.AEQbTJ(), C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), 298.0f));
    }

    @Override // o.mAR
    public java.util.List<mAS> KWHzl() {
        int itemCount = getItemCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(getItemCount());
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                java.lang.Object objKWHzl = KWHzl(i);
                if (objKWHzl == null) {
                    objKWHzl = AEQbTJ();
                }
                Intrinsics.copydefault(objKWHzl, "");
                arrayList.add((mAS) objKWHzl);
                if (i == itemCount) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public final class TaskDescription implements mAS {
        public final float KWHzl;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float EZpvd() {
            return this.copydefault;
        }

        public TaskDescription(float f, float f2) {
            this.KWHzl = f;
            this.copydefault = f2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.fragment.app.Fragment createFragment(int i) {
        pWN pwn = this.AEQbTJ.get(i);
        java.util.HashMap<pWN, androidx.fragment.app.Fragment> map = this.EZpvd;
        androidx.fragment.app.Fragment cardSpotListFragment = map.get(pwn);
        if (cardSpotListFragment == null) {
            java.lang.String strAEQbTJ = pwn.AEQbTJ();
            switch (strAEQbTJ.hashCode()) {
                case -1956807563:
                    cardSpotListFragment = !strAEQbTJ.equals("OPTION") ? new CardSpotListFragment() : new C40554qaD();
                    break;
                case 2552066:
                    if (strAEQbTJ.equals("SPOT")) {
                        cardSpotListFragment = new CardSpotListFragment();
                        break;
                    }
                    break;
                case 214415088:
                    if (strAEQbTJ.equals("FUTURES")) {
                        cardSpotListFragment = new CardFuturesListFragment();
                        break;
                    }
                    break;
                case 1724028365:
                    if (strAEQbTJ.equals("Watchlist")) {
                        cardSpotListFragment = new kDF();
                        break;
                    }
                    break;
                case 1983970406:
                    if (strAEQbTJ.equals("CEDEFI")) {
                        cardSpotListFragment = new pZZ();
                        break;
                    }
                    break;
            }
            map.put(pwn, cardSpotListFragment);
        }
        return cardSpotListFragment;
    }

    @Override // o.pWJ
    public int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (pWN pwn : this.AEQbTJ) {
            if (Intrinsics.EZpvd((java.lang.Object) pwn.AEQbTJ(), (java.lang.Object) str)) {
                return this.AEQbTJ.indexOf(pwn);
            }
        }
        return 0;
    }
}
