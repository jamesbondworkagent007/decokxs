package o;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotExplainedPresenter;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50722vYy extends AbstractC49945uyC<uUQ, SignalBotExplainedPresenter> {
    public final int KWHzl = C48033uCm.Activity.bindToGooglePlayService;
    public final float AEQbTJ = 0.98f;
    public final java.util.ArrayList<C50662vWs> OLrzqt = yDY.copydefault(new C50662vWs(OtcExtraKeys.CRYPTO_ORDER_TYPE, C33070mpX.AYXKKw(C55688xof.Application.OsDdEf)), new C50662vWs("input_condition", C33070mpX.AYXKKw(C55688xof.Application.newSession)), new C50662vWs("out_condition", C33070mpX.AYXKKw(C55688xof.Application.mayLaunchUrl)));

    public static final boolean copydefault(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ uUQ EZpvd(C50722vYy c50722vYy) {
        return c50722vYy.values();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    /* JADX INFO: renamed from: o.vYy$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                int position = tab.getPosition();
                C50722vYy c50722vYy = C50722vYy.this;
                C50722vYy.EZpvd(c50722vYy).copydefault.setCurrentItem(position, c50722vYy.OLrzqt().AEQbTJ());
            }
        }
    }

    private final void copydefault() {
        values().OLrzqt.AEQbTJ(new StateListAnimator());
        values().copydefault.registerOnPageChangeCallback(new TaskDescription());
        values().copydefault.setAdapter(new C47976uAj(this, this.OLrzqt, null, 4, null));
        new TabLayoutMediator(values().OLrzqt.copydefault(), values().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C50722vYy.copydefault(this.copydefault, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: o.vYy$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public TaskDescription() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            C50722vYy.this.OLrzqt().OLrzqt(i2 > 0);
        }
    }

    public static final void copydefault(C50722vYy c50722vYy, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C50722vYy.copydefault(view);
            }
        });
        tab.setText(c50722vYy.OLrzqt.get(i).EZpvd());
    }
}
