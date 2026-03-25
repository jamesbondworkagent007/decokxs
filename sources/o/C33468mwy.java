package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.core.ok_app.modeswitch.view.ModeSegmentView$createView$2;
import com.okinc.core.ok_app.modeswitch.view.ModeSegmentView$createView$3$onTabSelected$1;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33244msm;
import o.C33160mrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33468mwy {
    public final java.lang.String OLrzqt = "ModeSwitch-Segment@" + hashCode();

    public final java.lang.String copydefault(AbstractC33244msm abstractC33244msm) {
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl)) {
            return C33070mpX.AYXKKw(C33160mrH.TaskDescription.ejfBZ);
        }
        return Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl) ? C33070mpX.AYXKKw(C33160mrH.TaskDescription.AhwBna) : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl) ? C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl) : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl) ? C33070mpX.AYXKKw(C33160mrH.TaskDescription.uzCIH) : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl) ? C33070mpX.AYXKKw(C33160mrH.TaskDescription.AuCTel) : "";
    }

    public final java.lang.String EZpvd(AbstractC33244msm abstractC33244msm) {
        return (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl)) ? "appExchangeTabID" : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl) ? "tradeSimpleModeOptionId" : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl) ? "tradeAdvanceModeOptionId" : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl) ? "proPayModeOptionId" : Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl) ? "appWalletTabID" : "";
    }

    public final android.view.View copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull final kotlin.Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl(this.OLrzqt, "create segment: source=" + appModeSwitchViewSource);
        final C33301mtq c33301mtqEZpvd = C33301mtq.EZpvd(android.view.LayoutInflater.from(context), null, false);
        Intrinsics.checkNotNullExpressionValue(c33301mtqEZpvd, "");
        final TabLayout.Tab tabNewTab = c33301mtqEZpvd.copydefault.newTab();
        tabNewTab.setText(copydefault(pair.getFirst()));
        tabNewTab.setId(0);
        tabNewTab.setContentDescription(EZpvd(pair.getFirst()));
        c33301mtqEZpvd.copydefault.addTab(tabNewTab, false);
        final TabLayout.Tab tabNewTab2 = c33301mtqEZpvd.copydefault.newTab();
        tabNewTab2.setText(copydefault(pair.getSecond()));
        tabNewTab2.setId(1);
        tabNewTab2.setContentDescription(EZpvd(pair.getSecond()));
        c33301mtqEZpvd.copydefault.addTab(tabNewTab2, false);
        C33422mwE c33422mwE = new C33422mwE(this.OLrzqt);
        C55249xgQ c55249xgQ = c33301mtqEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        c33422mwE.KWHzl(c55249xgQ, lifecycleOwner, C33123mqX.Companion.KWHzl().AYXKKw(), new Function1() { // from class: o.mwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33468mwy.copydefault(pair, tabNewTab, tabNewTab2, this, c33301mtqEZpvd, (AbstractC33244msm) obj);
            }
        });
        C33377mvM c33377mvM = C33377mvM.copydefault;
        C55249xgQ c55249xgQ2 = c33301mtqEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
        c33377mvM.copydefault(c55249xgQ2, lifecycleOwner, new ModeSegmentView$createView$2(c33301mtqEZpvd, pair, context, null));
        c33301mtqEZpvd.copydefault.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(c33301mtqEZpvd, lifecycleOwner, pair, context, this, appModeSwitchViewSource, function2));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.core.ok_app.modeswitch.view.ModeSegmentView$createView$4
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                super.onDestroy(lifecycleOwner2);
                c33301mtqEZpvd.copydefault.clearOnTabSelectedListeners();
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
        });
        ConstraintLayout root = c33301mtqEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
        ConstraintLayout root2 = c33301mtqEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        return root2;
    }

    public static final Unit copydefault(kotlin.Pair pair, TabLayout.Tab tab, TabLayout.Tab tab2, C33468mwy c33468mwy, C33301mtq c33301mtq, AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (!Intrinsics.EZpvd(abstractC33244msm, pair.getFirst())) {
            tab = Intrinsics.EZpvd(abstractC33244msm, pair.getSecond()) ? tab2 : null;
        }
        if (tab != null && tab.isSelected()) {
            return Unit.INSTANCE;
        }
        if (tab != null) {
            pUU.KWHzl(c33468mwy.OLrzqt, "select tab " + ((java.lang.Object) tab.getContentDescription()));
            c33301mtq.copydefault.selectTab(tab);
            c33301mtq.KWHzl.setContentDescription(((java.lang.Object) tab.getContentDescription()) + "_selected");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mwy$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function2<AbstractC33244msm, AbstractC33244msm, Unit> AEQbTJ;
        public final /* synthetic */ AppModeSwitchViewSource AYXKKw;
        public final /* synthetic */ kotlin.Pair<AbstractC33244msm, AbstractC33244msm> EZpvd;
        public final /* synthetic */ C33301mtq KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ LifecycleOwner copydefault;
        public final /* synthetic */ C33468mwy djBIcL;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<? extends o.msm, ? extends o.msm> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super o.msm, ? super o.msm, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(C33301mtq c33301mtq, LifecycleOwner lifecycleOwner, kotlin.Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair, android.content.Context context, C33468mwy c33468mwy, AppModeSwitchViewSource appModeSwitchViewSource, Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
            this.KWHzl = c33301mtq;
            this.copydefault = lifecycleOwner;
            this.EZpvd = pair;
            this.OLrzqt = context;
            this.djBIcL = c33468mwy;
            this.AYXKKw = appModeSwitchViewSource;
            this.AEQbTJ = function2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ConstraintLayout root = this.KWHzl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            if (root.getVisibility() == 0) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new ModeSegmentView$createView$3$onTabSelected$1(tab, this.EZpvd, this.OLrzqt, this.KWHzl, this.djBIcL, this.AYXKKw, this.AEQbTJ, null), 3, null);
            }
        }
    }
}
