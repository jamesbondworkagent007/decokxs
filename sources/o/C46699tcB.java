package o;

import android.os.MessageQueue;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.market.MarketContainerFragment;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okmarket.ui.market.SwitchMarketFragment$onResume$1;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C46699tcB extends AbstractC32998moE {
    public android.widget.FrameLayout AhwBna;
    public boolean valueOf;
    public boolean values;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.tcF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46699tcB.valueOf();
        }
    });
    public android.os.Handler DbNXlk = new android.os.Handler(android.os.Looper.getMainLooper());
    public final MessageQueue.IdleHandler AkhnZx = new MessageQueue.IdleHandler() { // from class: o.tcE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            return C46699tcB.copydefault(this.OLrzqt);
        }
    };
    public Function0<Unit> AYXKKw = new Function0() { // from class: o.tcC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46699tcB.KWHzl(this.AEQbTJ);
        }
    };
    public boolean isConnected = true;
    public boolean gEmmrt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.QfsBiF;
    }

    public static final MarketContainerFragment valueOf() {
        return new MarketContainerFragment();
    }

    public AbstractC32998moE KWHzl() {
        return (AbstractC32998moE) this.fetchVPNInfo.getValue();
    }

    public static final boolean copydefault(C46699tcB c46699tcB) {
        c46699tcB.djBIcL();
        return false;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.HJWChPHhYHK);
        pUU.EZpvd(getTAG(), "initView() ");
        this.DbNXlk.getLooper().getQueue().addIdleHandler(this.AkhnZx);
        AEQbTJ(true);
        android.widget.FrameLayout frameLayout = this.AhwBna;
        if (frameLayout != null) {
            C6873aXb.OLrzqt(frameLayout);
        }
    }

    public final void djBIcL() {
        pUU.EZpvd(getTAG(), "fillContent() called");
        if (pWO.KWHzl().KWHzl() || pWO.KWHzl().EZpvd()) {
            EZpvd();
        } else {
            gEmmrt();
        }
    }

    public static final Unit KWHzl(C46699tcB c46699tcB) {
        c46699tcB.AEQbTJ(false);
        android.widget.FrameLayout frameLayout = c46699tcB.AhwBna;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SwitchMarketFragment$onResume$1(null), 3, null);
        djBIcL();
    }

    public void AEQbTJ(boolean z) {
        android.widget.FrameLayout frameLayout;
        if (this.isConnected && (frameLayout = this.AhwBna) != null) {
            if (z) {
                pXA.KWHzl(frameLayout);
            } else {
                this.isConnected = false;
                C57600ylV.AEQbTJ(frameLayout);
            }
        }
    }

    public final void gEmmrt() {
        pUU.EZpvd(getTAG(), "showOldMarket() called");
    }

    public void EZpvd() {
        pUU.EZpvd(getTAG(), "showNewMarket() called");
        if (isDetached() || isRemoving() || getContext() == null || AhwBna()) {
            return;
        }
        pUU.EZpvd(getTAG(), "showNewMarket() hasDisplayed " + AhwBna());
        OLrzqt(true);
        try {
            AbstractC32998moE abstractC32998moEKWHzl = KWHzl();
            MarketContainerFragment marketContainerFragment = abstractC32998moEKWHzl instanceof MarketContainerFragment ? (MarketContainerFragment) abstractC32998moEKWHzl : null;
            if (marketContainerFragment != null) {
                marketContainerFragment.AEQbTJ(this.AYXKKw);
            }
            getChildFragmentManager().beginTransaction().replace(qZH.StateListAnimator.isReflectionWorking, KWHzl(), KWHzl().getClass().getSimpleName()).commitAllowingStateLoss();
            if (isVisibled()) {
                KWHzl().setUserVisibleHint(true);
                KWHzl().onVisible();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "show new market", e);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        KWHzl(true);
    }

    public void KWHzl(boolean z) {
        if (this.gEmmrt) {
            this.gEmmrt = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm okQPL = getOkQPL();
            QPLType qPLType = QPLType.LIFE_CYCLE;
            QPLMarker qPLMarker = z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED;
            java.lang.String name = getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            AbstractC42536rWm.addMarker$default(okQPL, qPLType, qPLMarker, name, 0L, 8, null);
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroup;
        if (KWHzl().isAdded()) {
            KWHzl().setUserVisibleHint(true);
        }
        if (this.values) {
            return;
        }
        this.values = true;
        android.view.View view = getView();
        if (view == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.HJWChPHhYHK)) == null) {
            return;
        }
        C6873aXb.EZpvd(viewGroup);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        if (KWHzl().isAdded()) {
            KWHzl().setUserVisibleHint(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SubHelper.AEQbTJ(this.AuCTel);
        super.onDestroy();
        this.DbNXlk.getLooper().getQueue().removeIdleHandler(this.AkhnZx);
    }
}
