package o;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27020jnM extends FragmentStateAdapter {
    public final java.util.List<C27022jnO> AEQbTJ;
    public InvestUniv3SubscribeInfo EZpvd;
    public InvestUniv3SubscribeInfo KWHzl;

    /* JADX INFO: renamed from: o.jnM$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ZapMode.values().length];
            try {
                iArr[ZapMode.SINGLE_CRYPTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ZapMode.DUAL_CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27020jnM(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.AEQbTJ = new java.util.ArrayList();
        this.KWHzl = new InvestUniv3SubscribeInfo((java.lang.Long) null, 0L, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, 0, (java.util.List) null, 0L, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (InvestUniv3SubscribePromptInformation) null, (java.util.List) null, (InvestTokenWithAmount) null, (java.lang.String) null, 0L, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, 0, false, false, false, -1, 3, (DefaultConstructorMarker) null);
        this.EZpvd = new InvestUniv3SubscribeInfo((java.lang.Long) null, 0L, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, 0, (java.util.List) null, 0L, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (InvestUniv3SubscribePromptInformation) null, (java.util.List) null, (InvestTokenWithAmount) null, (java.lang.String) null, 0L, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, 0, false, false, false, -1, 3, (DefaultConstructorMarker) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        int i2 = Activity.copydefault[this.AEQbTJ.get(i).copydefault().ordinal()];
        if (i2 == 1) {
            return C27056jnw.Companion.OLrzqt(this.KWHzl);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C27037jnd.Companion.OLrzqt(this.EZpvd);
    }

    public final void copydefault(@NotNull java.util.List<C27022jnO> list, @NotNull InvestUniv3SubscribeInfo investUniv3SubscribeInfo, @NotNull InvestUniv3SubscribeInfo investUniv3SubscribeInfo2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investUniv3SubscribeInfo, "");
        Intrinsics.checkNotNullParameter(investUniv3SubscribeInfo2, "");
        this.KWHzl = investUniv3SubscribeInfo;
        this.EZpvd = investUniv3SubscribeInfo2;
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        notifyDataSetChanged();
    }
}
