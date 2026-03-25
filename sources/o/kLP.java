package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.OneShotPreDrawListener;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kLP extends android.widget.FrameLayout {
    public final HomeChainFilterUiModel AEQbTJ;
    public java.lang.String EZpvd;
    public final java.util.List<HomeChainFilterUiModel> KWHzl;
    public kLR OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kLP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kLP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(kLR klr) {
        this.OLrzqt = klr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.kLP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ kLP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLP(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new HomeChainFilterUiModel("all", null, null, 6, null);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kLP.EZpvd(context, this);
            }
        });
        this.KWHzl = new java.util.ArrayList();
        this.EZpvd = "";
        C54989xbV c54989xbV = KWHzl().OLrzqt;
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-20);
        c54989xbV.OLrzqt().setVisibility(0);
        c54989xbV.setOnClickListener(new Application(c54989xbV, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C21648hHd KWHzl() {
        return (C21648hHd) this.copydefault.getValue();
    }

    public static final C21648hHd EZpvd(android.content.Context context, kLP klp) {
        return C21648hHd.copydefault(android.view.LayoutInflater.from(context), klp, true);
    }

    public final void setQuickPickOptions(@NotNull java.util.List<HomeChainFilterUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
    }

    public static /* synthetic */ void setSelection$default(kLP klp, HomeChainFilterUiModel homeChainFilterUiModel, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = -20;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        klp.setSelection(homeChainFilterUiModel, i, i2);
    }

    public final void setSelection(@NotNull HomeChainFilterUiModel homeChainFilterUiModel, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(homeChainFilterUiModel, "");
        this.EZpvd = homeChainFilterUiModel.AEQbTJ();
        EZpvd(i, i2);
        java.util.List<HomeChainFilterUiModel> list = this.KWHzl;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((HomeChainFilterUiModel) it.next()).AEQbTJ(), (java.lang.Object) this.EZpvd)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z || Intrinsics.EZpvd((java.lang.Object) homeChainFilterUiModel.AEQbTJ(), (java.lang.Object) this.AEQbTJ.AEQbTJ())) {
            homeChainFilterUiModel = this.AEQbTJ;
        }
        EZpvd(homeChainFilterUiModel, !z, i);
    }

    public final void EZpvd(boolean z) {
        android.view.View view = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public final void OLrzqt(boolean z) {
        C54989xbV c54989xbV = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c54989xbV, "");
        c54989xbV.setVisibility(z ? 0 : 8);
    }

    public final void OLrzqt(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl().djBIcL.setPadding(C55298xhM.OLrzqt(i, context), KWHzl().gEmmrt.getPaddingTop(), KWHzl().gEmmrt.getPaddingRight(), KWHzl().gEmmrt.getPaddingBottom());
    }

    public final void EZpvd(HomeChainFilterUiModel homeChainFilterUiModel, boolean z, int i) {
        java.lang.String strOLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) homeChainFilterUiModel.AEQbTJ(), (java.lang.Object) "all")) {
            strOLrzqt = getContext().getString(C23274hvD.Fragment.peekAvailableContext);
        } else {
            strOLrzqt = homeChainFilterUiModel.OLrzqt();
        }
        Intrinsics.copydefault((java.lang.Object) strOLrzqt);
        C54989xbV c54989xbV = KWHzl().OLrzqt;
        c54989xbV.setOKDSSize(i);
        c54989xbV.setSelected(z);
        c54989xbV.EZpvd().setText(strOLrzqt);
        c54989xbV.AEQbTJ().setVisibility(homeChainFilterUiModel.copydefault().length() > 0 ? 0 : 8);
        if (homeChainFilterUiModel.copydefault().length() > 0) {
            C33054mpH.AEQbTJ(c54989xbV.AEQbTJ(), homeChainFilterUiModel.copydefault());
            android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
            ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    C55296xhK.AEQbTJ(marginLayoutParams, C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
                }
                textViewEZpvd.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (z) {
            Intrinsics.copydefault(c54989xbV);
            Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(c54989xbV, new StateListAnimator(c54989xbV, this)), "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(int i, int i2) {
        KWHzl().EZpvd.removeAllViews();
        java.util.Iterator it = this.KWHzl.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) next;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) homeChainFilterUiModel.AEQbTJ(), (java.lang.Object) this.EZpvd);
            C54989xbV c54989xbVKWHzl = KWHzl(homeChainFilterUiModel, zEZpvd, i, i2);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            if (i3 == 0) {
                C54989xbV c54989xbV = KWHzl().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c54989xbV, "");
                if (c54989xbV.getVisibility() == 0) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams.setMarginStart(C55298xhM.copydefault(8.0f, context));
                }
            }
            KWHzl().EZpvd.addView(c54989xbVKWHzl, layoutParams);
            java.util.Iterator it2 = it;
            c54989xbVKWHzl.setOnClickListener(new TaskDescription(c54989xbVKWHzl, 1000L, this, homeChainFilterUiModel, i, i2));
            c54989xbVKWHzl.setContentDescription("web3_dex_market_home_tokens_list_chain_" + i3);
            boolean z = zEZpvd && homeChainFilterUiModel.copydefault().length() > 0;
            c54989xbVKWHzl.AEQbTJ().setVisibility(z ? 0 : 8);
            if (z) {
                C33054mpH.AEQbTJ(c54989xbVKWHzl.AEQbTJ(), homeChainFilterUiModel.copydefault());
                android.widget.TextView textViewEZpvd = c54989xbVKWHzl.EZpvd();
                ViewGroup.LayoutParams layoutParams2 = textViewEZpvd.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams != null) {
                        C55296xhK.AEQbTJ(marginLayoutParams, C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
                    }
                    textViewEZpvd.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            if (zEZpvd) {
                Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(c54989xbVKWHzl, new Activity(c54989xbVKWHzl, this, c54989xbVKWHzl)), "");
            }
            i3++;
            it = it2;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ kLP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, kLP klp) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = klp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                kLR klr = this.OLrzqt.OLrzqt;
                if (klr != null) {
                    klr.AEQbTJ(this.OLrzqt.EZpvd);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ HomeChainFilterUiModel copydefault;
        public final /* synthetic */ kLP valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, kLP klp, HomeChainFilterUiModel homeChainFilterUiModel, int i, int i2) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.valueOf = klp;
            this.copydefault = homeChainFilterUiModel;
            this.EZpvd = i;
            this.KWHzl = i2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.valueOf.setSelection(this.copydefault, this.EZpvd, this.KWHzl);
                kLR klr = this.valueOf.OLrzqt;
                if (klr != null) {
                    klr.copydefault(this.copydefault.AEQbTJ(), this.copydefault.OLrzqt());
                }
            }
        }
    }

    public final boolean EZpvd() {
        return !this.KWHzl.isEmpty();
    }

    public final C54989xbV KWHzl(HomeChainFilterUiModel homeChainFilterUiModel, boolean z, int i, int i2) {
        android.content.Context context = KWHzl().EZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(i2);
        c54989xbV.setOKDSSize(i);
        c54989xbV.setSelected(z);
        c54989xbV.EZpvd().setText(homeChainFilterUiModel.OLrzqt());
        return c54989xbV;
    }

    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C54989xbV KWHzl;
        public final /* synthetic */ kLP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, kLP klp, C54989xbV c54989xbV) {
            this.AEQbTJ = view;
            this.copydefault = klp;
            this.KWHzl = c54989xbV;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.copydefault.KWHzl().gEmmrt.smoothScrollTo(this.KWHzl.getLeft(), 0);
        }
    }

    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ kLP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, kLP klp) {
            this.EZpvd = view;
            this.KWHzl = klp;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.view.View view = this.KWHzl.KWHzl().copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.view.View view2 = view.getVisibility() == 0 ? this.KWHzl.KWHzl().copydefault : this.KWHzl.KWHzl().OLrzqt;
            Intrinsics.copydefault(view2);
            this.KWHzl.KWHzl().gEmmrt.smoothScrollTo(view2.getLeft() - this.KWHzl.KWHzl().djBIcL.getPaddingStart(), 0);
        }
    }
}
