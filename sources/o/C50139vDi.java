package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaAdjustMarginPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50139vDi extends AbstractC49945uyC<AbstractC48664uZu, ContractDcaAdjustMarginPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;
    public final int djBIcL = C48033uCm.Activity.aappFQ;
    public java.lang.String OLrzqt = "add";
    public final Function2<C47988uAv, java.lang.String, Unit> AYXKKw = new Function2() { // from class: o.vDj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C50139vDi.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.vDi$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.djBIcL;
    }

    public static final /* synthetic */ AbstractC48664uZu AEQbTJ(C50139vDi c50139vDi) {
        return c50139vDi.values();
    }

    public final xMV copydefault() {
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        java.lang.String str = this.AhwBna;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str);
        if (abstractC54531xLwOLrzqt == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            java.lang.String str3 = this.AhwBna;
            BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str3 == null ? "" : str3, this.valueOf, null, null, 12, null);
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str2 = instFamily;
            }
        }
        return AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
    }

    /* JADX INFO: renamed from: o.vDi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vDi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C50139vDi c50139vDi = new C50139vDi();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", str2);
            bundle.putString("algoId", str3);
            bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str4);
            bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, str5);
            c50139vDi.setArguments(bundle);
            c50139vDi.show(fragmentManager, "ContractDcaAdjustMarginDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? arguments.getString("instId") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AhwBna = arguments2 != null ? arguments2.getString("instType") : null;
        android.os.Bundle arguments3 = getArguments();
        this.AEQbTJ = arguments3 != null ? arguments3.getString("algoId") : null;
        android.os.Bundle arguments4 = getArguments();
        this.copydefault = arguments4 != null ? arguments4.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null;
        android.os.Bundle arguments5 = getArguments();
        this.gEmmrt = arguments5 != null ? arguments5.getString(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) : null;
        fJNWhG();
        ejfBZ();
        ContractDcaAdjustMarginPresenter contractDcaAdjustMarginPresenterOLrzqt = OLrzqt();
        java.lang.String str = this.AEQbTJ;
        contractDcaAdjustMarginPresenterOLrzqt.AEQbTJ(str != null ? str : "", "0", this.OLrzqt);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.getCustomView));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Dialog(imageViewKWHzl, 1000L, this));
    }

    public static final Unit KWHzl(C50139vDi c50139vDi, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str == null) {
            str = "";
        }
        c50139vDi.AEQbTJ(str);
        C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        values().valueOf.setText(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.valueOf, this.AhwBna, false, false, 8, null));
        C55249xgQ c55249xgQ = values().AEQbTJ;
        TabLayout.Tab tabNewTab = c55249xgQ.newTab();
        tabNewTab.setText(C33070mpX.AYXKKw(C55688xof.Application.setText));
        tabNewTab.setTag("add");
        c55249xgQ.addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = c55249xgQ.newTab();
        tabNewTab2.setText(C33070mpX.AYXKKw(C55688xof.Application.withContextAvailableforInline));
        tabNewTab2.setTag("reduce");
        c55249xgQ.addTab(tabNewTab2);
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
        final C47988uAv c47988uAv = values().KWHzl;
        xMV xmvCopydefault = copydefault();
        c47988uAv.setInputUnit(xmvCopydefault != null ? xmvCopydefault.EZpvd() : null);
        xMV xmvCopydefault2 = copydefault();
        c47988uAv.setMaxDecimal(C33129mqd.AhwBna(xmvCopydefault2 != null ? xmvCopydefault2.copydefault() : null));
        c47988uAv.setOnTextChangeCallback(this.AYXKKw);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50139vDi.AEQbTJ(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
        c47988uAv.post(new java.lang.Runnable() { // from class: o.vDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50139vDi.EZpvd(c47988uAv);
            }
        });
        C55251xgS c55251xgS = values().AhwBna;
        java.lang.String str = this.copydefault;
        if (str == null) {
            str = "";
        }
        c55251xgS.setText(C56033xvF.AhwBna(str));
        java.lang.String str2 = this.copydefault;
        if (str2 == null) {
            str2 = "";
        }
        c55251xgS.setOKDSStyle(C56033xvF.valueOf(str2));
        C55251xgS c55251xgS2 = values().copydefault;
        java.lang.String str3 = this.gEmmrt;
        if (str3 == null) {
            str3 = "";
        }
        c55251xgS2.setText(str3);
        java.lang.String str4 = this.copydefault;
        c55251xgS2.setOKDSStyle(C56033xvF.valueOf(str4 != null ? str4 : ""));
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C55258xgZ c55258xgZ = values().AYXKKw;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vDi$StateListAnimator */
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
            C50139vDi c50139vDi = C50139vDi.this;
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            c50139vDi.copydefault(tag instanceof java.lang.String ? (java.lang.String) tag : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C47988uAv c47988uAv, C50139vDi c50139vDi, float f) {
        java.lang.String safeString$default;
        C54536xML c54536xMLCopydefault;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(f), 0)) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
            c50139vDi.AEQbTJ(c47988uAv.AkhnZx());
            return Unit.INSTANCE;
        }
        c47988uAv.setOnTextChangeCallback(null);
        xMV xmvCopydefault = c50139vDi.copydefault();
        if (xmvCopydefault == null) {
            safeString$default = "";
        } else {
            ContractGridAdjustMarginResp value = c50139vDi.OLrzqt().EZpvd().getValue();
            C54536xML c54536xMLOLrzqt = xmvCopydefault.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(f), value != null ? value.getMaxAmt() : null, null, null, null, 14, null));
            if (c54536xMLOLrzqt == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
            }
        }
        C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
        c50139vDi.AEQbTJ(c47988uAv.AkhnZx());
        c47988uAv.setOnTextChangeCallback(c50139vDi.AYXKKw);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C47988uAv c47988uAv) {
        c47988uAv.zsXlph();
    }

    /* JADX INFO: renamed from: o.vDi$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50139vDi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50139vDi c50139vDi) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c50139vDi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.isAdded()) {
                    android.content.Context contextRequireContext = this.copydefault.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                    viewOnClickListenerC54939xaY.EZpvd(Intrinsics.EZpvd((java.lang.Object) this.copydefault.OLrzqt, (java.lang.Object) "add") ? C33070mpX.AYXKKw(C55688xof.Application.DcMfJKsuEgdN) : C33070mpX.AYXKKw(C55688xof.Application.abAflu));
                    java.lang.String string = this.copydefault.getString(C55688xof.Application.QWSkGZ);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vDi$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C50139vDi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50139vDi c50139vDi) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c50139vDi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.vDi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50139vDi KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50139vDi c50139vDi) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c50139vDi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (C50139vDi.AEQbTJ(this.KWHzl).KWHzl.getFieldNames()) {
                    return;
                }
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Float.valueOf(C50139vDi.AEQbTJ(this.KWHzl).KWHzl.fJNWhG()));
                if (C33129mqd.valueOf(strGEmmrt, 0)) {
                    strGEmmrt = "";
                }
                ContractDcaAdjustMarginPresenter contractDcaAdjustMarginPresenterOLrzqt = this.KWHzl.OLrzqt();
                java.lang.String str = this.KWHzl.AEQbTJ;
                contractDcaAdjustMarginPresenterOLrzqt.KWHzl(str != null ? str : "", C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(C50139vDi.AEQbTJ(this.KWHzl).KWHzl.AkhnZx()))), strGEmmrt, this.KWHzl.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.vDi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public final void copydefault(java.lang.String str) {
        if (str == null) {
            str = "add";
        }
        this.OLrzqt = str;
        ContractDcaAdjustMarginPresenter contractDcaAdjustMarginPresenterOLrzqt = OLrzqt();
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null) {
            str2 = "";
        }
        contractDcaAdjustMarginPresenterOLrzqt.AEQbTJ(str2, "0", this.OLrzqt);
        values().AYXKKw.setText(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "add") ? C55688xof.Application.setContentDescription : C55688xof.Application.onTabSelected));
        android.widget.TextView textView = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "add") ^ true ? 4 : 0);
        values().KWHzl.OLrzqt(true);
    }

    private final void ejfBZ() {
        TradeLiveData<ContractGridAdjustMarginResp> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new FragmentManager(new Function1() { // from class: o.vDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50139vDi.EZpvd(this.AEQbTJ, (ContractGridAdjustMarginResp) obj);
            }
        }));
        TradeLiveData<ContractGridAdjustMarginResp> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new FragmentManager(new Function1() { // from class: o.vDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50139vDi.KWHzl(this.EZpvd, (ContractGridAdjustMarginResp) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Observer() { // from class: o.vDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50139vDi.copydefault((java.lang.Exception) obj);
            }
        });
    }

    public static final Unit EZpvd(C50139vDi c50139vDi, ContractGridAdjustMarginResp contractGridAdjustMarginResp) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginResp, "");
        android.widget.TextView textView = c50139vDi.values().gEmmrt;
        xMV xmvCopydefault = c50139vDi.copydefault();
        if (xmvCopydefault != null) {
            java.lang.String maxAmt = contractGridAdjustMarginResp.getMaxAmt();
            if (maxAmt == null) {
                maxAmt = "";
            }
            C54536xML c54536xMLCopydefault2 = xmvCopydefault.copydefault(maxAmt);
            if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                str = safeString$default;
            }
        }
        textView.setText(str);
        c50139vDi.AEQbTJ(c50139vDi.values().KWHzl.AkhnZx());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50139vDi c50139vDi, ContractGridAdjustMarginResp contractGridAdjustMarginResp) {
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginResp, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        c50139vDi.isConnected();
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.String maxAmt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        xMV xmvCopydefault = copydefault();
        java.lang.String str2 = "";
        if (xmvCopydefault != null) {
            ContractGridAdjustMarginResp value = OLrzqt().EZpvd().getValue();
            if (value == null || (maxAmt = value.getMaxAmt()) == null) {
                maxAmt = "";
            }
            C54536xML c54536xMLOLrzqt = xmvCopydefault.OLrzqt(maxAmt);
            if (c54536xMLOLrzqt != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
                str2 = safeString$default;
            }
        }
        values().EZpvd.setEnabled(C33129mqd.AEQbTJ(str, 0));
        if (C33129mqd.AEQbTJ(str, str2)) {
            values().KWHzl.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.DlABUU));
        } else {
            values().KWHzl.copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }
}
