package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC21019grp;
import o.C13754dXa;
import o.C13798dYr;
import o.C52761wXj;
import o.C9694baS;
import o.dYN;
import o.dYV;
import o.gFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13798dYr extends androidx.fragment.app.Fragment {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public long AYXKKw;
    public AbstractC16507elI OLrzqt;
    public boolean valueOf;
    public final java.lang.String KWHzl = "Brc20TransferFragment";
    public java.lang.String fetchVPNInfo = "";
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dYB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C13798dYr.KWHzl());
        }
    });
    public Function1<? super java.lang.String, Unit> djBIcL = new Function1() { // from class: o.dYI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C13798dYr.EZpvd((java.lang.String) obj);
        }
    };
    public Function1<? super java.lang.Boolean, Unit> AhwBna = new Function1() { // from class: o.dYH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C13798dYr.KWHzl(((java.lang.Boolean) obj).booleanValue());
        }
    };
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dYK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13798dYr.AhwBna(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.dYJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13798dYr.AkhnZx(this.copydefault);
        }
    });

    public final void gEmmrt() {
    }

    public final int valueOf() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int KWHzl() {
        return C55298xhM.dp2px$default(5.0f, null, 1, null);
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    private final C59534zip fetchVPNInfo() {
        return (C59534zip) this.copydefault.getValue();
    }

    public static final C59534zip AhwBna(final C13798dYr c13798dYr) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(dYS.class, new TaskDescription(new Function1() { // from class: o.dYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.KWHzl(this.AEQbTJ, (dYS) obj);
            }
        }));
        c59534zip.register(dYT.class, new StateListAnimator(c13798dYr, new Function2() { // from class: o.dYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13798dYr.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue(), (dYT) obj2);
            }
        }));
        return c59534zip;
    }

    public static final Unit KWHzl(C13798dYr c13798dYr, dYS dys) {
        Intrinsics.checkNotNullParameter(dys, "");
        c13798dYr.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C13798dYr c13798dYr, boolean z, dYT dyt) {
        Intrinsics.checkNotNullParameter(dyt, "");
        UtxoInfo utxoInfoOLrzqt = dyt.OLrzqt();
        if (utxoInfoOLrzqt != null) {
            if (z) {
                c13798dYr.djBIcL().OLrzqt(utxoInfoOLrzqt);
                if (!c13798dYr.valueOf && c13798dYr.djBIcL().DbNXlk()) {
                    c13798dYr.valueOf = true;
                    c13798dYr.AYXKKw();
                }
            } else {
                c13798dYr.djBIcL().KWHzl(utxoInfoOLrzqt);
                if (c13798dYr.valueOf) {
                    c13798dYr.valueOf = false;
                    c13798dYr.AhwBna();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final dYV djBIcL() {
        return (dYV) this.gEmmrt.getValue();
    }

    public static final dYV AkhnZx(C13798dYr c13798dYr) {
        return (dYV) new ViewModelProvider(c13798dYr).get(dYV.class);
    }

    /* JADX INFO: renamed from: o.dYr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dYr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C13798dYr EZpvd(long j, @NotNull java.lang.String str, TransactionInfo transactionInfo, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.Boolean, Unit> function12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            C13798dYr c13798dYr = new C13798dYr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("coin_id", j);
            bundle.putString("wallet_id", str);
            bundle.putParcelable("send_scan_info", transactionInfo);
            bundle.putString("from_address", str2);
            c13798dYr.setArguments(bundle);
            c13798dYr.djBIcL = function1;
            c13798dYr.AhwBna = function12;
            return c13798dYr;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AYXKKw = arguments.getLong("coin_id");
            this.fetchVPNInfo = arguments.getString("wallet_id", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = AbstractC16507elI.AEQbTJ(layoutInflater, viewGroup, false);
        DbNXlk();
        values();
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (abstractC16507elI != null) {
            return abstractC16507elI.getRoot();
        }
        return null;
    }

    private final void DbNXlk() {
        java.lang.String string;
        C52794wYp c52794wYp;
        isConnected();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("from_address")) == null) {
            string = "";
        }
        java.lang.String str = string;
        long j = this.AYXKKw;
        if (j == 0 || j == -1) {
            C10856bwO.EZpvd(this.KWHzl, new OKWException("coinId:" + j + " is invalid", null));
        }
        djBIcL().copydefault(this.fetchVPNInfo, this.AYXKKw, str, 1);
        djBIcL().KWHzl().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.EZpvd(this.copydefault, (java.util.List) obj);
            }
        }));
        djBIcL().fJNWhG();
        djBIcL().valueOf().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.KWHzl(this.EZpvd, (java.lang.String) obj);
            }
        }));
        djBIcL().values().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.EZpvd(this.AEQbTJ, (XRC20BalanceDetailInfoResp) obj);
            }
        }));
        djBIcL().AYXKKw().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (abstractC16507elI != null && (c52794wYp = abstractC16507elI.KWHzl) != null) {
            c52794wYp.setEnabled(false);
        }
        djBIcL().AhwBna().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        djBIcL().AkhnZx().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        djBIcL().copydefault().observe(getViewLifecycleOwner(), new dYN.StateListAnimator(new Function1() { // from class: o.dYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.copydefault(this.AEQbTJ, (dYV.ActionBar) obj);
            }
        }));
    }

    public static final Unit EZpvd(final C13798dYr c13798dYr, java.util.List list) {
        C33546myW c33546myW;
        C33546myW c33546myW2;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        c13798dYr.OLrzqt();
        c13798dYr.fetchVPNInfo().setItems(list);
        c13798dYr.fetchVPNInfo().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c13798dYr, true, (java.lang.String) null, 2, (java.lang.Object) null);
        AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
        if (abstractC16507elI != null && (c33546myW2 = abstractC16507elI.AhwBna) != null) {
            c33546myW2.valueOf();
        }
        AbstractC16507elI abstractC16507elI2 = c13798dYr.OLrzqt;
        if (abstractC16507elI2 != null && (c33546myW = abstractC16507elI2.AhwBna) != null) {
            c33546myW.post(new java.lang.Runnable() { // from class: o.dYo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C13798dYr.DbNXlk(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(C13798dYr c13798dYr) {
        C13791dYk c13791dYk;
        MutableLiveData<java.util.List<dYU>> mutableLiveDataKWHzl;
        java.util.List<dYU> value;
        C13791dYk c13791dYk2;
        RecyclerView recyclerView;
        dYV dyvDjBIcL = c13798dYr.djBIcL();
        if (dyvDjBIcL != null && (mutableLiveDataKWHzl = dyvDjBIcL.KWHzl()) != null && (value = mutableLiveDataKWHzl.getValue()) != null) {
            int size = value.size();
            AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
            RecyclerView.LayoutManager layoutManager = (abstractC16507elI == null || (recyclerView = abstractC16507elI.copydefault) == null) ? null : recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == size - 1) {
                AbstractC16507elI abstractC16507elI2 = c13798dYr.OLrzqt;
                if (abstractC16507elI2 == null || (c13791dYk2 = abstractC16507elI2.AEQbTJ) == null) {
                    return;
                }
                c13791dYk2.jumpToState(C13754dXa.ActionBar.setSubscription);
                return;
            }
        }
        AbstractC16507elI abstractC16507elI3 = c13798dYr.OLrzqt;
        if (abstractC16507elI3 == null || (c13791dYk = abstractC16507elI3.AEQbTJ) == null) {
            return;
        }
        c13791dYk.jumpToState(C13754dXa.ActionBar.MediaBrowserCompatSubscription);
    }

    /* JADX INFO: renamed from: o.dYr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C13798dYr AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C13798dYr c13798dYr) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c13798dYr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AkhnZx();
            }
        }
    }

    /* JADX INFO: renamed from: o.dYr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C13798dYr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C13798dYr c13798dYr) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c13798dYr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            boolean z;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C13798dYr c13798dYr = this.copydefault;
                if (!c13798dYr.valueOf) {
                    this.copydefault.ejfBZ();
                    z = true;
                } else {
                    this.copydefault.copydefault();
                    z = false;
                }
                c13798dYr.valueOf = z;
            }
        }
    }

    public static final Unit KWHzl(C13798dYr c13798dYr, java.lang.String str) {
        java.lang.String strFJNWhG;
        AppCompatTextView appCompatTextView;
        int i = C13754dXa.FragmentManager.setShowHideAnimationEnabled;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str);
        C10854bwM c10854bwMEZpvd = c13798dYr.djBIcL().EZpvd();
        if (c10854bwMEZpvd == null || (strFJNWhG = c10854bwMEZpvd.fJNWhG()) == null) {
            strFJNWhG = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("currency", strFJNWhG);
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
        if (abstractC16507elI != null && (appCompatTextView = abstractC16507elI.values) != null) {
            appCompatTextView.setText(strCopydefault);
        }
        Function1<? super java.lang.String, Unit> function1 = c13798dYr.djBIcL;
        if (function1 != null) {
            function1.invoke(strCopydefault);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C13798dYr c13798dYr, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        C52794wYp c52794wYp;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String strFJNWhG;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        android.widget.TextView textView5;
        java.lang.String strEZpvd;
        android.widget.TextView textView6;
        java.lang.String strEZpvd2;
        java.lang.String availableWithoutSpending;
        java.lang.String availableReceiving;
        C52794wYp c52794wYp4;
        ConstraintLayout constraintLayout;
        java.lang.String transferableWithoutSpending = xRC20BalanceDetailInfoResp.getTransferableWithoutSpending();
        if (transferableWithoutSpending != null && C33129mqd.OLrzqt(transferableWithoutSpending, "0") && (availableWithoutSpending = xRC20BalanceDetailInfoResp.getAvailableWithoutSpending()) != null && C33129mqd.OLrzqt(availableWithoutSpending, "0") && (availableReceiving = xRC20BalanceDetailInfoResp.getAvailableReceiving()) != null && C33129mqd.OLrzqt(availableReceiving, "0")) {
            AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
            if (abstractC16507elI != null && (constraintLayout = abstractC16507elI.valueOf) != null) {
                constraintLayout.setVisibility(8);
            }
            AbstractC16507elI abstractC16507elI2 = c13798dYr.OLrzqt;
            if (abstractC16507elI2 != null && (c52794wYp4 = abstractC16507elI2.KWHzl) != null) {
                c52794wYp4.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        AbstractC16507elI abstractC16507elI3 = c13798dYr.OLrzqt;
        java.lang.String strEZpvd3 = null;
        if (abstractC16507elI3 != null && (textView6 = abstractC16507elI3.fARcdN) != null) {
            java.lang.String transferableWithoutSpending2 = xRC20BalanceDetailInfoResp.getTransferableWithoutSpending();
            if (transferableWithoutSpending2 != null) {
                C10854bwM c10854bwMEZpvd = c13798dYr.djBIcL().EZpvd();
                int iValueOf = c10854bwMEZpvd != null ? c10854bwMEZpvd.valueOf() : 0;
                C10854bwM c10854bwMEZpvd2 = c13798dYr.djBIcL().EZpvd();
                strEZpvd2 = C54870xYj.EZpvd(transferableWithoutSpending2, iValueOf, c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.AkhnZx() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strEZpvd2 = null;
            }
            textView6.setText(java.lang.String.valueOf(strEZpvd2));
        }
        AbstractC16507elI abstractC16507elI4 = c13798dYr.OLrzqt;
        if (abstractC16507elI4 != null && (textView5 = abstractC16507elI4.OLrzqt) != null) {
            java.lang.String availableWithoutSpending2 = xRC20BalanceDetailInfoResp.getAvailableWithoutSpending();
            if (availableWithoutSpending2 != null) {
                C10854bwM c10854bwMEZpvd3 = c13798dYr.djBIcL().EZpvd();
                int iValueOf2 = c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.valueOf() : 0;
                C10854bwM c10854bwMEZpvd4 = c13798dYr.djBIcL().EZpvd();
                strEZpvd = C54870xYj.EZpvd(availableWithoutSpending2, iValueOf2, c10854bwMEZpvd4 != null ? c10854bwMEZpvd4.AkhnZx() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strEZpvd = null;
            }
            textView5.setText(java.lang.String.valueOf(strEZpvd));
        }
        java.lang.String availableWithoutSpending3 = xRC20BalanceDetailInfoResp.getAvailableWithoutSpending();
        if (availableWithoutSpending3 != null && C33129mqd.AEQbTJ(availableWithoutSpending3, "0")) {
            AbstractC16507elI abstractC16507elI5 = c13798dYr.OLrzqt;
            if (abstractC16507elI5 != null && (c52794wYp3 = abstractC16507elI5.fetchVPNInfo) != null) {
                c52794wYp3.setVisibility(0);
            }
            AbstractC16507elI abstractC16507elI6 = c13798dYr.OLrzqt;
            if (abstractC16507elI6 != null && (c52794wYp2 = abstractC16507elI6.fetchVPNInfo) != null) {
                c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, c13798dYr));
            }
        } else {
            AbstractC16507elI abstractC16507elI7 = c13798dYr.OLrzqt;
            if (abstractC16507elI7 != null && (c52794wYp = abstractC16507elI7.fetchVPNInfo) != null) {
                c52794wYp.setVisibility(8);
            }
        }
        java.lang.String availableReceiving2 = xRC20BalanceDetailInfoResp.getAvailableReceiving();
        if (availableReceiving2 != null && C33129mqd.AEQbTJ(availableReceiving2, "0")) {
            java.lang.String availableReceiving3 = xRC20BalanceDetailInfoResp.getAvailableReceiving();
            if (availableReceiving3 != null && C33129mqd.AEQbTJ(availableReceiving3, "0")) {
                AbstractC16507elI abstractC16507elI8 = c13798dYr.OLrzqt;
                if (abstractC16507elI8 != null && (textView4 = abstractC16507elI8.djBIcL) != null) {
                    textView4.setVisibility(0);
                }
                java.lang.String availableReceiving4 = xRC20BalanceDetailInfoResp.getAvailableReceiving();
                if (availableReceiving4 != null) {
                    C10854bwM c10854bwMEZpvd5 = c13798dYr.djBIcL().EZpvd();
                    int iValueOf3 = c10854bwMEZpvd5 != null ? c10854bwMEZpvd5.valueOf() : 0;
                    C10854bwM c10854bwMEZpvd6 = c13798dYr.djBIcL().EZpvd();
                    strEZpvd3 = C54870xYj.EZpvd(availableReceiving4, iValueOf3, c10854bwMEZpvd6 != null ? c10854bwMEZpvd6.AkhnZx() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                java.lang.String strValueOf = java.lang.String.valueOf(strEZpvd3);
                int i = C13754dXa.FragmentManager.setHomeAsUpIndicator;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strValueOf);
                C10854bwM c10854bwMEZpvd7 = c13798dYr.djBIcL().EZpvd();
                if (c10854bwMEZpvd7 == null || (strFJNWhG = c10854bwMEZpvd7.fJNWhG()) == null) {
                    strFJNWhG = "";
                }
                pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strFJNWhG);
                java.lang.String strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strValueOf, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strValueOf, 0, false, 6, (java.lang.Object) null) + strValueOf.length(), 33);
                AbstractC16507elI abstractC16507elI9 = c13798dYr.OLrzqt;
                if (abstractC16507elI9 != null && (textView3 = abstractC16507elI9.djBIcL) != null) {
                    textView3.setText(spannableStringBuilder);
                }
            } else {
                AbstractC16507elI abstractC16507elI10 = c13798dYr.OLrzqt;
                if (abstractC16507elI10 != null && (textView2 = abstractC16507elI10.djBIcL) != null) {
                    textView2.setVisibility(8);
                }
            }
        } else {
            AbstractC16507elI abstractC16507elI11 = c13798dYr.OLrzqt;
            if (abstractC16507elI11 != null && (textView = abstractC16507elI11.djBIcL) != null) {
                textView.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13798dYr c13798dYr, java.lang.Boolean bool) {
        C33546myW c33546myW;
        C13791dYk c13791dYk;
        c13798dYr.OLrzqt();
        if (bool.booleanValue()) {
            AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
            if (abstractC16507elI != null && (c13791dYk = abstractC16507elI.AEQbTJ) != null) {
                c13791dYk.jumpToState(C13754dXa.ActionBar.gAnGwV);
            }
            AbstractC16507elI abstractC16507elI2 = c13798dYr.OLrzqt;
            if (abstractC16507elI2 != null && (c33546myW = abstractC16507elI2.AhwBna) != null) {
                c33546myW.AhwBna(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C13798dYr c13798dYr, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        AbstractC16507elI abstractC16507elI = c13798dYr.OLrzqt;
        if (abstractC16507elI != null && (c52794wYp = abstractC16507elI.KWHzl) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C13798dYr c13798dYr, java.lang.Boolean bool) {
        AbstractC16507elI abstractC16507elI;
        C33546myW c33546myW;
        if (bool.booleanValue() && (abstractC16507elI = c13798dYr.OLrzqt) != null && (c33546myW = abstractC16507elI.AhwBna) != null) {
            c33546myW.AhwBna(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C13798dYr c13798dYr, dYV.ActionBar actionBar) {
        if (!actionBar.copydefault()) {
            boolean zEZpvd = actionBar.EZpvd();
            java.lang.String strOLrzqt = actionBar.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            c13798dYr.copydefault(zEZpvd, strOLrzqt);
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(boolean z, java.lang.String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DGUQLIdZmdUa, new View.OnClickListener() { // from class: o.dYt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13798dYr.EZpvd(viewOnClickListenerC54939xaY, this, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.keySet, new View.OnClickListener() { // from class: o.dYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13798dYr.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C13798dYr c13798dYr, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        c13798dYr.djBIcL().fJNWhG();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C13798dYr c13798dYr, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        c13798dYr.requireActivity().finish();
    }

    /* JADX INFO: renamed from: o.dYr$Dialog */
    public static final class Dialog implements MotionLayout.TransitionListener {
        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
        }

        public Dialog() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
            C13798dYr.this.AEQbTJ();
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionCompleted(MotionLayout motionLayout, int i) {
            C13798dYr.this.AEQbTJ();
        }
    }

    private final void values() {
        android.widget.TextView textView;
        C52794wYp c52794wYp;
        android.widget.TextView textView2;
        C33546myW c33546myW;
        C33546myW c33546myW2;
        C33546myW c33546myW3;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C13791dYk c13791dYk;
        C13791dYk c13791dYk2;
        C13791dYk c13791dYk3;
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (abstractC16507elI != null && (c13791dYk3 = abstractC16507elI.AEQbTJ) != null) {
            c13791dYk3.jumpToState(C13754dXa.ActionBar.MediaBrowserCompatSubscriptionCallback);
        }
        AbstractC16507elI abstractC16507elI2 = this.OLrzqt;
        if (abstractC16507elI2 != null && (c13791dYk2 = abstractC16507elI2.AEQbTJ) != null) {
            c13791dYk2.addTransitionListener(new Dialog());
        }
        AbstractC16507elI abstractC16507elI3 = this.OLrzqt;
        if (abstractC16507elI3 != null && (c13791dYk = abstractC16507elI3.AEQbTJ) != null) {
            c13791dYk.setOnStopNestedScrollListener(new Function2() { // from class: o.dYz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13798dYr.AEQbTJ(this.EZpvd, (android.view.View) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        AbstractC16507elI abstractC16507elI4 = this.OLrzqt;
        if (abstractC16507elI4 != null && (recyclerView2 = abstractC16507elI4.copydefault) != null) {
            recyclerView2.setAdapter(fetchVPNInfo());
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        }
        AbstractC16507elI abstractC16507elI5 = this.OLrzqt;
        RecyclerView.LayoutManager layoutManager = (abstractC16507elI5 == null || (recyclerView = abstractC16507elI5.copydefault) == null) ? null : recyclerView.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        AbstractC16507elI abstractC16507elI6 = this.OLrzqt;
        if (abstractC16507elI6 != null && (c33546myW3 = abstractC16507elI6.AhwBna) != null) {
            c33546myW3.djBIcL(false);
        }
        AbstractC16507elI abstractC16507elI7 = this.OLrzqt;
        if (abstractC16507elI7 != null && (c33546myW2 = abstractC16507elI7.AhwBna) != null) {
            c33546myW2.AhwBna(true);
        }
        AbstractC16507elI abstractC16507elI8 = this.OLrzqt;
        if (abstractC16507elI8 != null && (c33546myW = abstractC16507elI8.AhwBna) != null) {
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.dYF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C13798dYr.KWHzl(this.OLrzqt, interfaceC57934yrl);
                }
            });
        }
        AbstractC16507elI abstractC16507elI9 = this.OLrzqt;
        if (abstractC16507elI9 != null && (textView2 = abstractC16507elI9.AuCTel) != null) {
            textView2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityCallbackStubProxy));
        }
        AbstractC16507elI abstractC16507elI10 = this.OLrzqt;
        if (abstractC16507elI10 != null && (c52794wYp = abstractC16507elI10.KWHzl) != null) {
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58247yxg abstractC58247yxgCopydefault = C58156yvv.copydefault(abstractC58247yxgThrottleFirst, viewLifecycleOwner);
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dYE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13798dYr.copydefault(this.EZpvd, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: o.dYC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13798dYr.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58247yxgCopydefault.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dYG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C13798dYr.EZpvd(function1, obj);
                }
            });
        }
        AbstractC16507elI abstractC16507elI11 = this.OLrzqt;
        if (abstractC16507elI11 != null && (textView = abstractC16507elI11.gEmmrt) != null) {
            textView.setOnClickListener(new Activity(textView, 1000L, this));
        }
        gEmmrt();
        C32866mlf.onEvent$default("Web3Send_Landing_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.dYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13798dYr.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C13798dYr c13798dYr, android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (i == 1) {
            c13798dYr.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C13798dYr c13798dYr, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c13798dYr.djBIcL().fARcdN();
    }

    public static final void copydefault(final C13798dYr c13798dYr, java.lang.Object obj) {
        java.lang.String strDbNXlk;
        android.content.Context context = c13798dYr.getContext();
        if (context == null) {
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        gFI.StateListAnimator stateListAnimator = gFI.Companion;
        AbstractC12782ctV abstractC12782ctVFetchVPNInfo = c13798dYr.djBIcL().fetchVPNInfo();
        if (abstractC12782ctVFetchVPNInfo == null || (strDbNXlk = abstractC12782ctVFetchVPNInfo.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        C10854bwM c10854bwMEZpvd = c13798dYr.djBIcL().EZpvd();
        java.lang.String strValueOf = java.lang.String.valueOf(c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()) : null);
        android.os.Bundle arguments = c13798dYr.getArguments();
        TransactionInfo transactionInfo = arguments != null ? (TransactionInfo) arguments.getParcelable("send_scan_info") : null;
        java.lang.String strIsConnected = c13798dYr.djBIcL().isConnected();
        TransactionType transactionType = TransactionType.TypeTransfer;
        java.lang.String strDjBIcL = c13798dYr.djBIcL().djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        application.KWHzl(c13798dYr, stateListAnimator.EZpvd(context, strDbNXlk, strValueOf, transactionInfo, "from_home", strIsConnected, transactionType, strDjBIcL), new Function2() { // from class: o.dYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C13798dYr.KWHzl(this.EZpvd, ((java.lang.Integer) obj2).intValue(), (android.content.Intent) obj3);
            }
        });
    }

    public static final Unit KWHzl(C13798dYr c13798dYr, int i, android.content.Intent intent) {
        FragmentActivity activity;
        android.os.Bundle extras;
        if (i == -1 && (activity = c13798dYr.getActivity()) != null) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                activity.setResult(-1, new android.content.Intent().putExtras(extras));
            } else {
                activity.setResult(-1);
            }
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault("error " + th);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C13798dYr c13798dYr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C10854bwM c10854bwMEZpvd = c13798dYr.djBIcL().EZpvd();
        java.lang.String strFJNWhG = c10854bwMEZpvd != null ? c10854bwMEZpvd.fJNWhG() : null;
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        eventParamsList.put("token_name", strFJNWhG, false);
        C10854bwM c10854bwMEZpvd2 = c13798dYr.djBIcL().EZpvd();
        java.lang.String strDNCPSb = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.dNCPSb() : null;
        eventParamsList.put(MTCoreConstants.Protocol.KEY_PROTOCOL, strDNCPSb != null ? strDNCPSb : "", false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        AppCompatTextView appCompatTextView;
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (((abstractC16507elI == null || (appCompatTextView = abstractC16507elI.values) == null) ? 0 : appCompatTextView.getBottom()) < valueOf()) {
            this.AhwBna.invoke(java.lang.Boolean.TRUE);
        } else {
            this.AhwBna.invoke(java.lang.Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        djBIcL().ejfBZ();
        fetchVPNInfo().notifyDataSetChanged();
        AYXKKw();
    }

    public final void AYXKKw() {
        android.widget.TextView textView;
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (abstractC16507elI == null || (textView = abstractC16507elI.gEmmrt) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDisplayUseLogoEnabled));
    }

    public final void AhwBna() {
        android.widget.TextView textView;
        AbstractC16507elI abstractC16507elI = this.OLrzqt;
        if (abstractC16507elI == null || (textView = abstractC16507elI.gEmmrt) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.giSNqX));
    }

    public final void copydefault() {
        djBIcL().fIwbmz();
        fetchVPNInfo().notifyDataSetChanged();
        AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        java.lang.String strDbNXlk;
        C9694baS.Application application = C9694baS.Companion;
        ActivityC21019grp.Activity activity = ActivityC21019grp.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC12782ctV abstractC12782ctVFetchVPNInfo = djBIcL().fetchVPNInfo();
        if (abstractC12782ctVFetchVPNInfo == null || (strDbNXlk = abstractC12782ctVFetchVPNInfo.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        C10854bwM c10854bwMEZpvd = djBIcL().EZpvd();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()) : null);
        java.lang.String strDjBIcL = djBIcL().djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strDjBIcL2 = djBIcL().djBIcL();
        if (strDjBIcL2 == null) {
            strDjBIcL2 = "";
        }
        application.KWHzl(this, activity.copydefault(context, strDbNXlk, strGEmmrt, strDjBIcL, strDjBIcL2, TransactionType.TypeInscribe, (448 & 64) != 0 ? null : null, (448 & 128) != 0 ? null : null, (448 & 256) != 0 ? null : null), new Function2() { // from class: o.dYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13798dYr.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(C13798dYr c13798dYr, int i, android.content.Intent intent) {
        FragmentActivity activity;
        if (i == -1 && (activity = c13798dYr.getActivity()) != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dYr$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends AbstractC59533zio<dYS, StateListAnimator> {
        public final Function1<dYS, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.dYS, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull Function1<? super dYS, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX INFO: renamed from: o.dYr$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends RecyclerView.ViewHolder {
            public final AbstractC16666eoI AEQbTJ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull AbstractC16666eoI abstractC16666eoI) {
                super(abstractC16666eoI.getRoot());
                Intrinsics.checkNotNullParameter(abstractC16666eoI, "");
                this.AEQbTJ = abstractC16666eoI;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC16666eoI abstractC16666eoIOLrzqt = AbstractC16666eoI.OLrzqt(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC16666eoIOLrzqt, "");
            return new StateListAnimator(abstractC16666eoIOLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final dYS dys) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(dys, "");
            stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.dYM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13798dYr.TaskDescription.copydefault(this.copydefault, dys, view);
                }
            });
        }

        public static final void copydefault(TaskDescription taskDescription, dYS dys, android.view.View view) {
            taskDescription.copydefault.invoke(dys);
        }
    }

    /* JADX INFO: renamed from: o.dYr$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final class StateListAnimator extends AbstractC59533zio<dYT, ActionBar> {
        public final /* synthetic */ C13798dYr EZpvd;
        public final Function2<java.lang.Boolean, dYT, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super o.dYT, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C13798dYr c13798dYr, Function2<? super java.lang.Boolean, ? super dYT, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.EZpvd = c13798dYr;
            this.KWHzl = function2;
        }

        /* JADX INFO: renamed from: o.dYr$StateListAnimator$ActionBar */
        public final class ActionBar extends RecyclerView.ViewHolder {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public final AbstractC16667eoJ copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC16667eoJ OLrzqt() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull StateListAnimator stateListAnimator, AbstractC16667eoJ abstractC16667eoJ) {
                super(abstractC16667eoJ.getRoot());
                Intrinsics.checkNotNullParameter(abstractC16667eoJ, "");
                this.AEQbTJ = stateListAnimator;
                this.copydefault = abstractC16667eoJ;
            }

            public final void KWHzl(@NotNull dYT dyt) {
                Intrinsics.checkNotNullParameter(dyt, "");
                java.lang.String strCopydefault = dyt.copydefault();
                java.lang.String strCopydefault2 = dyt.copydefault();
                C10854bwM c10854bwMEZpvd = this.AEQbTJ.EZpvd.djBIcL().EZpvd();
                int iValueOf = c10854bwMEZpvd != null ? c10854bwMEZpvd.valueOf() : 0;
                C10854bwM c10854bwMEZpvd2 = this.AEQbTJ.EZpvd.djBIcL().EZpvd();
                pUU.copydefault("amount is " + strCopydefault + " == " + C54870xYj.EZpvd(strCopydefault2, iValueOf, c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.AkhnZx() : 0, dyt.AEQbTJ(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null));
                android.widget.TextView textView = this.copydefault.AEQbTJ;
                java.lang.String strCopydefault3 = dyt.copydefault();
                C10854bwM c10854bwMEZpvd3 = this.AEQbTJ.EZpvd.djBIcL().EZpvd();
                int iValueOf2 = c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.valueOf() : 0;
                C10854bwM c10854bwMEZpvd4 = this.AEQbTJ.EZpvd.djBIcL().EZpvd();
                textView.setText(java.lang.String.valueOf(C54870xYj.EZpvd(strCopydefault3, iValueOf2, c10854bwMEZpvd4 != null ? c10854bwMEZpvd4.AkhnZx() : 0, dyt.AEQbTJ(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)));
                this.copydefault.copydefault.setText(dyt.KWHzl());
                if (dyt.EZpvd()) {
                    this.copydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.gqESXP);
                } else {
                    this.copydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.QqiRNA);
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC16667eoJ abstractC16667eoJKWHzl = AbstractC16667eoJ.KWHzl(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC16667eoJKWHzl, "");
            return new ActionBar(this, abstractC16667eoJKWHzl);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final dYT dyt) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(dyt, "");
            actionBar.KWHzl(dyt);
            actionBar.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.dYP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C13798dYr.StateListAnimator.AEQbTJ(dyt, actionBar, this, view);
                }
            });
        }

        public static final void AEQbTJ(dYT dyt, ActionBar actionBar, StateListAnimator stateListAnimator, android.view.View view) {
            if (dyt.EZpvd()) {
                actionBar.OLrzqt().OLrzqt.setImageResource(C52761wXj.TaskDescription.QqiRNA);
                actionBar.OLrzqt().OLrzqt.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.ORxRYg));
            } else {
                actionBar.OLrzqt().OLrzqt.setImageResource(C52761wXj.TaskDescription.gqESXP);
                actionBar.OLrzqt().OLrzqt.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            }
            dyt.copydefault(!dyt.EZpvd());
            stateListAnimator.KWHzl.invoke(java.lang.Boolean.valueOf(dyt.EZpvd()), dyt);
        }
    }

    public final void isConnected() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).showLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void OLrzqt() {
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).dismissLoading();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }
}
