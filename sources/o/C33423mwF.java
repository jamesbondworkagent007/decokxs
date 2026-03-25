package o;

import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.modeswitch.view.ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1;
import com.okinc.core.ok_app.modeswitch.view.ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC33424mwG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33423mwF {
    public static final C33423mwF copydefault = new C33423mwF();

    private C33423mwF() {
    }

    public final android.view.View KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return new Application().copydefault(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
    }

    /* JADX INFO: renamed from: o.mwF$Application */
    public static final class Application {
        public AbstractC33424mwG KWHzl;

        public final android.view.View copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
            SharedFlow<Unit> sharedFlowAxsJAY;
            Flow flowOnStart;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
            Intrinsics.checkNotNullParameter(function2, "");
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            EZpvd(frameLayout, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
            if (oKComplianceRestrictionService != null && (sharedFlowAxsJAY = oKComplianceRestrictionService.AxsJAY()) != null && (flowOnStart = FlowKt.onStart(sharedFlowAxsJAY, new ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1(null))) != null) {
                C33367mvC.copydefault(flowOnStart, lifecycleOwner, Lifecycle.State.CREATED, new ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$2(frameLayout, this, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2, null));
            }
            return frameLayout;
        }

        public final void AEQbTJ(AbstractC33424mwG abstractC33424mwG, android.widget.FrameLayout frameLayout, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
            android.view.View viewKWHzl;
            if (Intrinsics.EZpvd(abstractC33424mwG, AbstractC33424mwG.Application.OLrzqt)) {
                viewKWHzl = new android.view.View(frameLayout.getContext());
            } else if (abstractC33424mwG instanceof AbstractC33424mwG.ActionBar) {
                C33468mwy c33468mwy = new C33468mwy();
                android.content.Context context = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                viewKWHzl = c33468mwy.copydefault(context, lifecycleOwner, ((AbstractC33424mwG.ActionBar) abstractC33424mwG).AEQbTJ(), appModeSwitchViewSource, function2);
            } else {
                C33463mwt c33463mwt = new C33463mwt();
                android.content.Context context2 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                viewKWHzl = c33463mwt.KWHzl(context2, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
            }
            frameLayout.addView(viewKWHzl, new FrameLayout.LayoutParams(-2, -2));
        }

        public final void EZpvd(android.widget.FrameLayout frameLayout, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, AppModeSwitchViewSource appModeSwitchViewSource, Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
            AbstractC33424mwG abstractC33424mwGAEQbTJ = AEQbTJ();
            if (Intrinsics.EZpvd(abstractC33424mwGAEQbTJ, this.KWHzl)) {
                return;
            }
            this.KWHzl = abstractC33424mwGAEQbTJ;
            frameLayout.removeAllViews();
            AEQbTJ(abstractC33424mwGAEQbTJ, frameLayout, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
        }

        public final AbstractC33424mwG AEQbTJ() {
            java.util.List<AbstractC33244msm> listFJNWhG = C33123mqX.Companion.KWHzl().fJNWhG();
            pUU.KWHzl("ModeSwitch-ViewFactory", "getModeSwitchModel, available modes: " + listFJNWhG);
            int size = listFJNWhG.size();
            if (size == 0 || size == 1) {
                return AbstractC33424mwG.Application.OLrzqt;
            }
            if (size == 2) {
                return new AbstractC33424mwG.ActionBar(new kotlin.Pair(listFJNWhG.get(0), listFJNWhG.get(1)));
            }
            return AbstractC33424mwG.StateListAnimator.copydefault;
        }
    }
}
