package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginReq;
import com.okinc.unify_trade.biz.ContractGridAdjustMarginResp;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.bot.presenter.ContractGridOperateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53858wtS extends AbstractC49945uyC<AbstractC48655uZl, ContractGridOperateViewModel> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public boolean AuCTel;
    public java.lang.String copydefault;
    public EntrySignalOrderAmtParam fetchVPNInfo;
    public final int AYXKKw = C48033uCm.Activity.HJWChPDXdlte;
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.wtV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53858wtS.AuCTel(this.copydefault);
        }
    });
    public java.lang.String values = "";
    public java.lang.String isConnected = "";
    public java.lang.String AEQbTJ = "0";
    public java.lang.String djBIcL = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String KWHzl = "";
    public java.lang.String valueOf = "";
    public java.lang.String AkhnZx = "";
    public final uBH AhwBna = new uBH(new Function0() { // from class: o.wtW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53858wtS.fetchVPNInfo(this.copydefault);
        }
    });
    public final uBH DbNXlk = new uBH(new Function0() { // from class: o.wue
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53858wtS.DbNXlk(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.wtS$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    public static final /* synthetic */ AbstractC48655uZl AhwBna(C53858wtS c53858wtS) {
        return c53858wtS.values();
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getNewProxyInstance() {
        return (java.util.List) this.fJNWhG.getValue();
    }

    public static final java.util.List AuCTel(C53858wtS c53858wtS) {
        return yDY.gEmmrt(C56390yDp.OLrzqt(c53858wtS.getString(C55688xof.Application.setText), "add"), C56390yDp.OLrzqt(c53858wtS.getString(C55688xof.Application.withContextAvailableforInline), "reduce"));
    }

    /* JADX INFO: renamed from: o.wtS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53858wtS copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, EntrySignalOrderAmtParam entrySignalOrderAmtParam) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C53858wtS c53858wtS = new C53858wtS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bot_inst_id", str);
            bundle.putString("bot_inst_type", str2);
            bundle.putString("algoId", str3);
            bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str4);
            bundle.putString(FirebaseAnalytics.Param.LEVEL, str5);
            bundle.putBoolean(OtcExtraKeys.MODE, z);
            bundle.putParcelable("data", entrySignalOrderAmtParam);
            c53858wtS.setArguments(bundle);
            return c53858wtS;
        }
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
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        wlaJM();
        AubY();
        zLjUOn();
        uzCIH();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void getFieldNames() {
        android.os.Bundle arguments = getArguments();
        this.djBIcL = arguments != null ? arguments.getString("bot_inst_id") : null;
        android.os.Bundle arguments2 = getArguments();
        this.gEmmrt = arguments2 != null ? arguments2.getString("bot_inst_type") : null;
        android.os.Bundle arguments3 = getArguments();
        this.KWHzl = arguments3 != null ? arguments3.getString("algoId") : null;
        android.os.Bundle arguments4 = getArguments();
        this.valueOf = arguments4 != null ? arguments4.getString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) : null;
        android.os.Bundle arguments5 = getArguments();
        this.AkhnZx = arguments5 != null ? arguments5.getString(FirebaseAnalytics.Param.LEVEL) : null;
        android.os.Bundle arguments6 = getArguments();
        this.AuCTel = arguments6 != null ? arguments6.getBoolean(OtcExtraKeys.MODE) : false;
        android.os.Bundle arguments7 = getArguments();
        this.fetchVPNInfo = arguments7 != null ? (EntrySignalOrderAmtParam) arguments7.getParcelable("data") : null;
    }

    private final void wlaJM() {
        kotlin.Pair pairOLrzqt;
        values().values.setText(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.djBIcL, this.gEmmrt, false, false, 8, null));
        java.lang.String str = this.valueOf;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long")) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C56033xvF.valueOf("long")), getString(C55688xof.Application.IResultReceiver2));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short")) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C56033xvF.valueOf("short")), getString(C55688xof.Application.IResultReceiver_Parcel));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C56033xvF.valueOf("neutral")), getString(C55688xof.Application.IResultReceiverStubProxy));
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        values().DbNXlk.setOKDSStyle(iIntValue);
        values().AhwBna.setOKDSStyle(iIntValue);
        values().DbNXlk.setText(str2);
        values().AhwBna.setText(this.AkhnZx);
        C55249xgQ c55249xgQ = values().KWHzl;
        java.util.Iterator<T> it = getNewProxyInstance().iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            TabLayout.Tab tabNewTab = c55249xgQ.newTab();
            tabNewTab.setText((java.lang.CharSequence) pair.getFirst());
            tabNewTab.setTag(pair.getSecond());
            c55249xgQ.addTab(tabNewTab);
        }
        KWHzl(this.AEQbTJ);
        fARcdN();
        xMV xmvHDKMBd = hDKMBd();
        if (xmvHDKMBd != null) {
            values().AYXKKw.setMaxDecimal(C33129mqd.AhwBna(xmvHDKMBd.copydefault()));
            values().AYXKKw.setInputUnit(xmvHDKMBd.EZpvd());
            values().AYXKKw.post(new java.lang.Runnable() { // from class: o.wtZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C53858wtS.AkhnZx(this.KWHzl);
                }
            });
        }
        AuCTel();
    }

    /* JADX INFO: renamed from: o.wtS$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C53858wtS EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53858wtS c53858wtS) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c53858wtS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.wtS$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53858wtS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53858wtS c53858wtS) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c53858wtS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.sjbWxX);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.onMessageChannelReady);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new Fragment(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wtS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C53858wtS OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53858wtS c53858wtS) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c53858wtS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.fJNWhG();
            }
        }
    }

    public static final void AkhnZx(C53858wtS c53858wtS) {
        c53858wtS.values().AYXKKw.zsXlph();
    }

    /* JADX INFO: renamed from: o.wtS$FragmentManager */
    public static final class FragmentManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public FragmentManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (C53858wtS.AhwBna(C53858wtS.this).AYXKKw.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(C53858wtS.AhwBna(C53858wtS.this).AYXKKw, false, 1, null);
            }
            C53858wtS.this.AEQbTJ = "0";
            C53858wtS c53858wtS = C53858wtS.this;
            c53858wtS.KWHzl(c53858wtS.AEQbTJ);
            ContractGridOperateViewModel contractGridOperateViewModelOLrzqt = C53858wtS.this.OLrzqt();
            java.lang.String str = C53858wtS.this.KWHzl;
            if (str == null) {
                str = "";
            }
            contractGridOperateViewModelOLrzqt.copydefault(str, C53858wtS.this.iwGUEr(), C53858wtS.this.AEQbTJ);
            C53858wtS.this.fARcdN();
            C53858wtS.this.fIwbmz();
        }
    }

    private final void AubY() {
        values().AYXKKw.KWHzl(this.AhwBna);
        values().KWHzl.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new FragmentManager());
        values().fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.wuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53858wtS.AEQbTJ(this.EZpvd, view);
            }
        });
        values().AYXKKw.setPercentSeekBarListener(new Function1() { // from class: o.wua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53858wtS.EZpvd(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
            }
        });
        C55258xgZ c55258xgZ = values().AEQbTJ;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        C52794wYp c52794wYp = values().OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public static final void AEQbTJ(C53858wtS c53858wtS, android.view.View view) {
        java.lang.String strAYXKKw;
        if (c53858wtS.isAdded()) {
            if (Intrinsics.EZpvd((java.lang.Object) c53858wtS.iwGUEr(), (java.lang.Object) "add")) {
                strAYXKKw = c53858wtS.AuCTel ? C33070mpX.AYXKKw(C55688xof.Application.hkDICb) : C33070mpX.AYXKKw(C55688xof.Application.inahnb);
            } else {
                strAYXKKw = c53858wtS.AuCTel ? C33070mpX.AYXKKw(C55688xof.Application.addSocket) : C33070mpX.AYXKKw(C55688xof.Application.fZc);
            }
            android.content.Context contextRequireContext = c53858wtS.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
            java.lang.String string = c53858wtS.getString(C55688xof.Application.QWSkGZ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wub
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C53858wtS.copydefault(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit EZpvd(C53858wtS c53858wtS, float f) {
        java.lang.String safeString$default;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        if (c53858wtS.values().AYXKKw.zLjUOn()) {
            try {
                c53858wtS.copydefault = C33129mqd.gEmmrt(java.lang.Float.valueOf(f));
                xMV xmvHDKMBd = c53858wtS.hDKMBd();
                if (xmvHDKMBd == null || (c54536xMLOLrzqt = xmvHDKMBd.OLrzqt(C33129mqd.mulS$default(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)), c53858wtS.isConnected(), null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
                    safeString$default = "";
                }
                c53858wtS.KWHzl(safeString$default);
            } catch (java.lang.Exception unused) {
                c53858wtS.KWHzl("");
            }
        } else {
            c53858wtS.KWHzl("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wtS$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    private final void zLjUOn() {
        C56111xwe<ContractGridAdjustMarginResp> c56111xweKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweKWHzl.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wtR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53858wtS.EZpvd(this.AEQbTJ, (ContractGridAdjustMarginResp) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().AEQbTJ().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Observer() { // from class: o.wtU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53858wtS.KWHzl((java.lang.Exception) obj);
            }
        });
        C56111xwe<ContractGridAdjustMarginResp> c56111xweOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wtY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53858wtS.KWHzl(this.AEQbTJ, (ContractGridAdjustMarginResp) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = OLrzqt().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner4, new Activity(new Function1() { // from class: o.wtX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53858wtS.copydefault(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit EZpvd(C53858wtS c53858wtS, ContractGridAdjustMarginResp contractGridAdjustMarginResp) {
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginResp, "");
        C55326xho.toast$default(C55688xof.Application.OnBackPressedDispatcherOnBackPressedCancellable, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        c53858wtS.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(C53858wtS c53858wtS, ContractGridAdjustMarginResp contractGridAdjustMarginResp) {
        Intrinsics.checkNotNullParameter(contractGridAdjustMarginResp, "");
        showErrorMsg$default(c53858wtS, null, 1, null);
        c53858wtS.KWHzl(contractGridAdjustMarginResp.getMaxAmt(), contractGridAdjustMarginResp.getLever());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53858wtS c53858wtS, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c53858wtS.OLrzqt(exc.getMessage());
        return Unit.INSTANCE;
    }

    private final void uzCIH() {
        ContractGridOperateViewModel contractGridOperateViewModelOLrzqt = OLrzqt();
        java.lang.String str = this.KWHzl;
        if (str == null) {
            str = "";
        }
        contractGridOperateViewModelOLrzqt.copydefault(str, iwGUEr(), this.AEQbTJ);
    }

    private final xMV hDKMBd() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument suggestedInstrument$default;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String str = this.gEmmrt;
            if (str == null) {
                str = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            java.lang.String str2 = this.gEmmrt;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2 == null ? "" : str2, this.djBIcL, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (abstractC54531xLwOLrzqt != null) {
            return AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily != null ? instFamily : "", null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String iwGUEr() {
        return getNewProxyInstance().get(values().KWHzl.getSelectedTabPosition()).getSecond();
    }

    public final void fARcdN() {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (Intrinsics.EZpvd((java.lang.Object) iwGUEr(), (java.lang.Object) "add")) {
            C55312xha c55312xhaAhwBna = values().fetchVPNInfo.AhwBna();
            if (c55312xhaAhwBna != null && (c55320xhiKWHzl2 = c55312xhaAhwBna.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(getString(C55688xof.Application.setContentDescription));
            }
            values().valueOf.setText(getString(C55688xof.Application.fQQVvf));
            return;
        }
        C55312xha c55312xhaAhwBna2 = values().fetchVPNInfo.AhwBna();
        if (c55312xhaAhwBna2 != null && (c55320xhiKWHzl = c55312xhaAhwBna2.KWHzl()) != null) {
            c55320xhiKWHzl.setText(getString(C55688xof.Application.onTabSelected));
        }
        values().valueOf.setText(getString(C55688xof.Application.hKJZrr));
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final java.lang.String isConnected() {
        return Intrinsics.EZpvd((java.lang.Object) iwGUEr(), (java.lang.Object) "add") ? this.values : this.isConnected;
    }

    public final void AEQbTJ(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) iwGUEr(), (java.lang.Object) "add")) {
            this.values = str;
        } else {
            this.isConnected = str;
        }
    }

    public final void copydefault() {
        if (values().AYXKKw.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(values().AYXKKw, false, 1, null);
            this.copydefault = null;
        }
    }

    public static final Unit fetchVPNInfo(C53858wtS c53858wtS) {
        java.lang.String strAkhnZx = c53858wtS.values().AYXKKw.AkhnZx();
        if (strAkhnZx.length() == 0) {
            strAkhnZx = "0";
        }
        if (C33129mqd.AEQbTJ(strAkhnZx) != C33129mqd.AEQbTJ(c53858wtS.AEQbTJ)) {
            c53858wtS.AEQbTJ = strAkhnZx;
            ContractGridOperateViewModel contractGridOperateViewModelOLrzqt = c53858wtS.OLrzqt();
            java.lang.String str = c53858wtS.KWHzl;
            if (str == null) {
                str = "";
            }
            contractGridOperateViewModelOLrzqt.copydefault(str, c53858wtS.iwGUEr(), c53858wtS.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C53858wtS c53858wtS) {
        c53858wtS.copydefault();
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str) {
        values().AYXKKw.OLrzqt(this.DbNXlk);
        C47988uAv.setInputContent$default(values().AYXKKw, str, false, false, 6, null);
        values().AYXKKw.KWHzl(this.DbNXlk);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String safeString$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        if (str == null || str2 == null) {
            return;
        }
        AEQbTJ(str);
        android.widget.TextView textView = values().isConnected;
        xMV xmvHDKMBd = hDKMBd();
        if (xmvHDKMBd == null || (c54536xMLCopydefault = xmvHDKMBd.copydefault(str)) == null || (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) == null || (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            safeString$default = "";
        }
        textView.setText(safeString$default);
        android.widget.TextView textView2 = values().gEmmrt;
        java.lang.String botLever$default = C56033xvF.getBotLever$default(str2, false, 2, null);
        if (botLever$default.length() == 0) {
            botLever$default = "--";
        }
        textView2.setText(botLever$default);
    }

    public static /* synthetic */ void showErrorMsg$default(C53858wtS c53858wtS, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c53858wtS.OLrzqt(str);
    }

    private final void OLrzqt(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            android.widget.TextView textView = values().djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            values().djBIcL.setText(str);
            return;
        }
        android.widget.TextView textView2 = values().djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    public final void fJNWhG() {
        java.lang.String safeString$default;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String strMulS$default = values().AYXKKw.zLjUOn() ? C33129mqd.mulS$default(C33129mqd.gEmmrt(this.copydefault), isConnected(), null, null, null, 14, null) : this.AEQbTJ;
        if (C33129mqd.OLrzqt((java.lang.Object) strMulS$default, (java.lang.Object) 0)) {
            ejfBZ();
            return;
        }
        xMV xmvHDKMBd = hDKMBd();
        if (xmvHDKMBd == null || (c54536xMLOLrzqt = xmvHDKMBd.OLrzqt(strMulS$default)) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
            safeString$default = "";
        }
        java.lang.String str = C33129mqd.OLrzqt((java.lang.Object) this.copydefault, (java.lang.Object) 1) ? "" : safeString$default;
        java.lang.String str2 = this.KWHzl;
        OLrzqt().AEQbTJ(new ContractGridAdjustMarginReq(str2 == null ? "" : str2, iwGUEr(), str, this.copydefault, values().EZpvd.isChecked()));
    }

    public final void AuCTel() {
        int iCopydefault;
        if (this.AuCTel) {
            AbstractC48655uZl abstractC48655uZlValues = values();
            C55251xgS c55251xgS = abstractC48655uZlValues.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            android.widget.TextView textView = abstractC48655uZlValues.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = abstractC48655uZlValues.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            fIwbmz();
            java.lang.String[] strArr = {"1", "5"};
            EntrySignalOrderAmtParam entrySignalOrderAmtParam = this.fetchVPNInfo;
            boolean zValueOf = yDV.valueOf(strArr, entrySignalOrderAmtParam != null ? entrySignalOrderAmtParam.getDeleType() : null);
            abstractC48655uZlValues.EZpvd.setEnabled(zValueOf);
            C55258xgZ c55258xgZ = abstractC48655uZlValues.AEQbTJ;
            if (zValueOf) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.Dmq);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            }
            c55258xgZ.setTextColor(iCopydefault);
        }
    }

    public final void fIwbmz() {
        android.widget.LinearLayout linearLayout = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((this.AuCTel && Intrinsics.EZpvd((java.lang.Object) iwGUEr(), (java.lang.Object) "add")) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        values().AYXKKw.OLrzqt(this.AhwBna);
        values().AYXKKw.setPercentSeekBarListener(null);
        values().AYXKKw.OLrzqt(this.DbNXlk);
    }
}
