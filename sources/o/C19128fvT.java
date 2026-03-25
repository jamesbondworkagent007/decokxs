package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.defi.wallet.mine.search.ui.view.adapter.HotContentPage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19128fvT extends FragmentStateAdapter {
    public final java.lang.String AEQbTJ;
    public java.util.List<? extends HotContentPage> EZpvd;

    /* JADX INFO: renamed from: o.fvT$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HotContentPage.values().length];
            try {
                iArr[HotContentPage.TOKENS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HotContentPage.DAPPS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19128fvT(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = str;
        this.EZpvd = yDY.AhwBna();
    }

    public final void KWHzl(@NotNull java.util.List<? extends HotContentPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        int i2 = Activity.EZpvd[this.EZpvd.get(i).ordinal()];
        if (i2 == 1) {
            return C19082fua.Companion.KWHzl(this.AEQbTJ);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C19024ftV.Companion.KWHzl(this.AEQbTJ);
    }

    public final HotContentPage AEQbTJ(int i) {
        return (HotContentPage) CollectionsKt___CollectionsKt.AkhnZx(this.EZpvd, i);
    }
}
