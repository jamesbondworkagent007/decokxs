package o;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.unify_trade.biz.SignalBotTradingSign;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotSignParamsPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50713vYp extends AbstractC54505xKx<AbstractC50754vaC, SignalBotSignParamsPresenter> {
    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    @Override // o.AbstractC54505xKx
    public boolean bs_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.ibnZAm;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        final C55241xgI c55241xgI = gGvvIC().copydefault;
        c55241xgI.post(new java.lang.Runnable() { // from class: o.vYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50713vYp.EZpvd(c55241xgI);
            }
        });
        gGvvIC().EZpvd.setAdapter(new C47976uAj(this, C50715vYr.Companion.EZpvd(dxcTrN().copydefault().getValue(), dxcTrN().copydefault(dxcTrN().copydefault().getValue())), null, 4, null));
        new TabLayoutMediator(gGvvIC().copydefault, gGvvIC().EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C50713vYp.copydefault(this.copydefault, tab, i);
            }
        }).attach();
    }

    public static final void EZpvd(C55241xgI c55241xgI) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2 = c55241xgI.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return;
        }
        boolean z = parent instanceof android.view.ViewGroup;
        android.view.ViewGroup viewGroup = z ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        android.view.ViewGroup viewGroup2 = z ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
        }
    }

    public static final void copydefault(C50713vYp c50713vYp, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C50713vYp.OLrzqt(view);
            }
        });
        tab.setText(((SignalBotTradingSign) SignalBotSignParamsPresenter.buildTradingSignList$default(c50713vYp.dxcTrN(), null, 1, null).get(i)).getAction());
    }
}
