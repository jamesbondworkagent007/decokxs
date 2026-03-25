package com.okinc.tradingbot.impl.order.strategy.dcd.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradingbot.impl.order.strategy.dcd.view.DcdPnlChartView;
import com.okinc.unify_trade.bot.data.DcdPnlChartData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33057mpK;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C52761wXj;
import o.C55173xeu;
import o.C55298xhM;
import o.C55312xha;
import o.C55320xhi;
import o.C55353xiO;
import o.C55688xof;
import o.C55863xrv;
import o.C56052xvY;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.uLQ;
import o.uXU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class DcdPnlChartView extends LinearLayout implements DefaultLifecycleObserver {
    public final C55863xrv AEQbTJ;
    public uXU OLrzqt;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DcdPnlChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DcdPnlChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: com.okinc.tradingbot.impl.order.strategy.dcd.view.DcdPnlChartView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ DcdPnlChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdPnlChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C48033uCm.Activity.DQnQnb, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (uXU) viewDataBindingInflate;
        this.AEQbTJ = new C55863xrv();
        setOrientation(1);
        ejfBZ();
        AuCTel();
    }

    private final void AuCTel() {
        Context context = getContext();
        Intrinsics.copydefault(context, "");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        this.AEQbTJ.KWHzl().observe(fragmentActivity, new TaskDescription(new Function1() { // from class: o.vMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DcdPnlChartView.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
        this.AEQbTJ.gEmmrt().AhwBna().observe(fragmentActivity, new TaskDescription(new Function1() { // from class: o.vMP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DcdPnlChartView.AEQbTJ(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit EZpvd(DcdPnlChartView dcdPnlChartView, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        dcdPnlChartView.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DcdPnlChartView dcdPnlChartView, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        dcdPnlChartView.EZpvd("");
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onResume(lifecycleOwner);
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.AEQbTJ.copydefault())) {
            this.AEQbTJ.values();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        this.AEQbTJ.OLrzqt();
    }

    private final void ejfBZ() {
        isConnected();
        KWHzl();
        gEmmrt();
        OLrzqt();
        copydefault();
        EZpvd();
    }

    public final void copydefault(@NotNull DcdPnlChartData dcdPnlChartData) {
        Intrinsics.checkNotNullParameter(dcdPnlChartData, "");
        this.AEQbTJ.copydefault(dcdPnlChartData.getInstId(), dcdPnlChartData.getBotState(), dcdPnlChartData.getNotionalValue(), dcdPnlChartData.getNotionCcy(), dcdPnlChartData.getCurrencyValue(), dcdPnlChartData.getCurrencyCcy(), dcdPnlChartData.getMApy(), dcdPnlChartData.getStrikePx(), dcdPnlChartData.getTime(), dcdPnlChartData.getLastPx());
        valueOf();
        fetchVPNInfo();
        EZpvd(this.AEQbTJ.copydefault());
        AEQbTJ();
    }

    private final void isConnected() {
        C55173xeu c55173xeu = this.OLrzqt.AYXKKw;
        c55173xeu.setEmptyTypeImage(6);
        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.DrNnAm));
    }

    public final void valueOf() {
        C55173xeu c55173xeu = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(this.AEQbTJ.DbNXlk() ? 0 : 8);
        ConstraintLayout constraintLayout = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(this.AEQbTJ.DbNXlk() ^ true ? 0 : 8);
    }

    public final void EZpvd(String str) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.OLrzqt.fIwbmz.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(this.AEQbTJ.AEQbTJ(str));
    }

    public final void KWHzl() {
        TabLayout.Tab tabNewTab = this.OLrzqt.values.newTab();
        tabNewTab.setText("< " + this.AEQbTJ.djBIcL());
        tabNewTab.setTag("less_type");
        TabLayout.Tab tabNewTab2 = this.OLrzqt.values.newTab();
        tabNewTab2.setText("≥ " + this.AEQbTJ.djBIcL());
        tabNewTab2.setTag("greater_type");
        this.OLrzqt.values.addTab(tabNewTab);
        this.OLrzqt.values.addTab(tabNewTab2);
        this.OLrzqt.values.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null) {
                return;
            }
            DcdPnlChartView.this.AEQbTJ.OLrzqt(C33129mqd.gEmmrt(tab.getTag()));
            DcdPnlChartView.this.fetchVPNInfo();
        }
    }

    public final void AhwBna() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.OLrzqt.isConnected.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(this.AEQbTJ.AYXKKw());
    }

    public final void values() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.OLrzqt.AkhnZx.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        C55863xrv c55863xrv = this.AEQbTJ;
        c55320xhiKWHzl.setText(c55863xrv.KWHzl(c55863xrv.djBIcL()));
    }

    public final void AYXKKw() {
        String strAhwBna;
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.AhwBna.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        String strEZpvd = this.AEQbTJ.EZpvd();
        if (Intrinsics.EZpvd((Object) strEZpvd, (Object) "buy_success") || Intrinsics.EZpvd((Object) strEZpvd, (Object) "sell_fail")) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, C55298xhM.dp2px$default(-5.0f, null, 1, null), C55298xhM.dp2px$default(-16.0f, null, 1, null));
            }
            strAhwBna = uLQ.Companion.copydefault().AhwBna();
        } else {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, C55298xhM.dp2px$default(-3.0f, null, 1, null), C55298xhM.dp2px$default(-16.0f, null, 1, null));
            }
            strAhwBna = uLQ.Companion.AEQbTJ().AhwBna();
        }
        this.OLrzqt.AhwBna.setLayoutParams(marginLayoutParams);
        C55353xiO c55353xiO = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
        ViewGroup.LayoutParams layoutParams2 = c55353xiO.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2);
        }
        this.OLrzqt.AhwBna.setAnimationFromUrl(strAhwBna);
        this.OLrzqt.AhwBna.playAnimation();
    }

    public final void djBIcL() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf = this.OLrzqt.AuCTel.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(this.AEQbTJ.AhwBna());
        }
        C55312xha c55312xhaValueOf2 = this.OLrzqt.ejfBZ.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(this.AEQbTJ.valueOf());
    }

    public final void fetchVPNInfo() {
        AhwBna();
        AYXKKw();
        djBIcL();
        values();
        DbNXlk();
    }

    public final void EZpvd() {
        C55320xhi c55320xhiKWHzl;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fjfviF);
        C55312xha c55312xhaValueOf = this.OLrzqt.fIwbmz.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(iCopydefault);
    }

    public final void copydefault() {
        C56052xvY c56052xvY = C56052xvY.EZpvd;
        this.OLrzqt.valueOf.setBackgroundColor(c56052xvY.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.DcMfJK), 25));
        this.OLrzqt.gEmmrt.setBackgroundColor(c56052xvY.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq), 25));
    }

    public final void gEmmrt() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.zLjUOn);
        if (drawableKWHzl instanceof LayerDrawable) {
            Drawable drawable = ((LayerDrawable) drawableKWHzl).getDrawable(0);
            Intrinsics.copydefault(drawable);
            C33057mpK.copydefault(drawable, C33070mpX.copydefault(C52761wXj.Activity.DcMfJK));
        }
        this.OLrzqt.fJNWhG.setBackground(drawableKWHzl);
    }

    public final void OLrzqt() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.zLjUOn);
        if (drawableKWHzl instanceof LayerDrawable) {
            Drawable drawable = ((LayerDrawable) drawableKWHzl).getDrawable(0);
            Intrinsics.copydefault(drawable);
            C33057mpK.copydefault(drawable, C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        }
        this.OLrzqt.fARcdN.setBackground(drawableKWHzl);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.EZpvd(str);
        AEQbTJ();
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.copydefault(str);
        AEQbTJ();
    }

    public final void DbNXlk() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = this.OLrzqt.fetchVPNInfo.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(this.AEQbTJ.AkhnZx());
    }

    public final void AEQbTJ() {
        AhwBna();
        djBIcL();
        values();
        AkhnZx();
    }

    public final void AkhnZx() {
        if (C33129mqd.copydefault((Object) Integer.valueOf(this.OLrzqt.values.getTabCount()), (Object) 2)) {
            TabLayout.Tab tabAt = this.OLrzqt.values.getTabAt(0);
            if (tabAt != null) {
                String strAEQbTJ = this.AEQbTJ.AEQbTJ();
                C55863xrv c55863xrv = this.AEQbTJ;
                tabAt.setText(strAEQbTJ + " " + c55863xrv.KWHzl(c55863xrv.djBIcL()));
            }
            TabLayout.Tab tabAt2 = this.OLrzqt.values.getTabAt(1);
            if (tabAt2 != null) {
                String strIsConnected = this.AEQbTJ.isConnected();
                C55863xrv c55863xrv2 = this.AEQbTJ;
                tabAt2.setText(strIsConnected + " " + c55863xrv2.KWHzl(c55863xrv2.djBIcL()));
            }
        }
    }
}
