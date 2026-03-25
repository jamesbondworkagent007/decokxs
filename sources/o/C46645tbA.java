package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.okmarket.ui.market.remind.fragment.PriceEditViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C52812wZg;
import o.qZH;
import o.wYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46645tbA extends ConstraintLayout {
    public static final Dialog Companion = new Dialog(null);
    public static final int KWHzl = 8;
    public final C42939rfq AEQbTJ;
    public final AssistContent AYXKKw;
    public C46690tbt AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46645tbA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46645tbA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:55) call: o.tbA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46645tbA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46645tbA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42939rfq c42939rfqAEQbTJ = C42939rfq.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42939rfqAEQbTJ, "");
        this.AEQbTJ = c42939rfqAEQbTJ;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.tbz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46645tbA.valueOf(this.AEQbTJ);
            }
        });
        this.AhwBna = new C46690tbt(null, 0, null, null, null, 0, 63, null);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46645tbA.EZpvd();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46645tbA.valueOf();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46645tbA.AhwBna();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46645tbA.gEmmrt();
            }
        });
        this.AYXKKw = new AssistContent();
        wYX wyx = c42939rfqAEQbTJ.KWHzl;
        java.util.List<kotlin.Pair<java.lang.Integer, wYO>> listFetchVPNInfo = fetchVPNInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        java.util.Iterator<T> it = listFetchVPNInfo.iterator();
        while (it.hasNext()) {
            arrayList.add((wYO) ((kotlin.Pair) it.next()).getSecond());
        }
        wyx.setSelectionChipBeans(arrayList);
        wyx.setOnChipClickListener(this.AYXKKw);
        wyx.setOnChipSelectionChangeListener(new Activity(wyx, this, c42939rfqAEQbTJ));
        wYX wyx2 = c42939rfqAEQbTJ.OLrzqt;
        java.util.List<kotlin.Pair<java.lang.String, wYO>> listDbNXlk = DbNXlk();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
        java.util.Iterator<T> it2 = listDbNXlk.iterator();
        while (it2.hasNext()) {
            arrayList2.add((wYO) ((kotlin.Pair) it2.next()).getSecond());
        }
        wyx2.setSelectionChipBeans(arrayList2);
        wyx2.setOnChipClickListener(this.AYXKKw);
        wyx2.setOnChipSelectionChangeListener(new Application(wyx2, this));
        LinearLayoutCompat linearLayoutCompat = c42939rfqAEQbTJ.EZpvd;
        linearLayoutCompat.setOnClickListener(new FragmentManager(linearLayoutCompat, 1000L, c42939rfqAEQbTJ, this));
        LinearLayoutCompat linearLayoutCompat2 = c42939rfqAEQbTJ.AhwBna;
        linearLayoutCompat2.setOnClickListener(new Fragment(linearLayoutCompat2, 1000L, c42939rfqAEQbTJ, this));
        LinearLayoutCompat linearLayoutCompat3 = c42939rfqAEQbTJ.AYXKKw;
        linearLayoutCompat3.setOnClickListener(new LoaderManager(linearLayoutCompat3, 1000L, this, c42939rfqAEQbTJ));
        AppCompatImageView appCompatImageView = c42939rfqAEQbTJ.AEQbTJ;
        appCompatImageView.setOnClickListener(new PendingIntent(appCompatImageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.tbA$Dialog */
    public static final class Dialog {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tbA.Dialog.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Dialog() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceEditViewModel AkhnZx() {
        return (PriceEditViewModel) this.gEmmrt.getValue();
    }

    public static final PriceEditViewModel valueOf(C46645tbA c46645tbA) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c46645tbA);
        if (viewModelStoreOwner != null) {
            return (PriceEditViewModel) new ViewModelProvider(viewModelStoreOwner).get(PriceEditViewModel.class);
        }
        return null;
    }

    public final java.util.List<C55276xgr> djBIcL() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List EZpvd() {
        return yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.htlTjW), "Price", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.fjfviF), "MA5", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.QwvEab), "MA10", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.fdOvFl), "MA20", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.igXuih), "MA50", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.aUsmxb), "MA100", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.fERRXa), "MA200", null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<C55276xgr> values() {
        return (java.util.List) this.valueOf.getValue();
    }

    public static final java.util.List valueOf() {
        return yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.WS), 0, null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.DCUTEIddSDPG), 1, null, true, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.hCLrkq), 2, null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(qZH.PendingIntent.DBxZfM), 3, null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<kotlin.Pair<java.lang.Integer, wYO>> fetchVPNInfo() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List AhwBna() {
        return yDY.gEmmrt(C56390yDp.OLrzqt(1, new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.DcqEDu), 44, true, true)), C56390yDp.OLrzqt(2, new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.UrRBLY), 44, false, true)), C56390yDp.OLrzqt(0, new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.KDccX), 44, false, true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<kotlin.Pair<java.lang.String, wYO>> DbNXlk() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List gEmmrt() {
        return yDY.gEmmrt(C56390yDp.OLrzqt("0", new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.fHqPtx), 44, true, true)), C56390yDp.OLrzqt("1", new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.DWgRXt), 44, false, true)));
    }

    /* JADX INFO: renamed from: o.tbA$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C46645tbA AEQbTJ;
        public final /* synthetic */ C42939rfq EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C42939rfq c42939rfq, C46645tbA c46645tbA) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c42939rfq;
            this.AEQbTJ = c46645tbA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            androidx.fragment.app.FragmentManager childFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.EZpvd.gEmmrt.getText());
                java.util.List<C55276xgr> listDjBIcL = this.AEQbTJ.djBIcL();
                java.util.ArrayList<C55276xgr> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listDjBIcL) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((C55276xgr) obj).AhwBna(), (java.lang.Object) strGEmmrt)) {
                        arrayList.add(obj);
                    }
                }
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.EZpvd.djBIcL.getText());
                for (C55276xgr c55276xgr : arrayList) {
                    c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) c55276xgr.AhwBna(), (java.lang.Object) strGEmmrt2));
                }
                qXX qxx = new qXX(arrayList, C33070mpX.AYXKKw(qZH.PendingIntent.QVsKAR));
                qxx.OLrzqt(new ActionBar(this.EZpvd, this.AEQbTJ, qxx));
                C46645tbA c46645tbA = this.AEQbTJ;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c46645tbA));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                C46825teV c46825teV = (C46825teV) ((androidx.fragment.app.Fragment) objM7377constructorimpl);
                if (c46825teV == null || (childFragmentManager = c46825teV.getChildFragmentManager()) == null) {
                    return;
                }
                qxx.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C42939rfq KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C46645tbA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C42939rfq c42939rfq, C46645tbA c46645tbA) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c42939rfq;
            this.copydefault = c46645tbA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            androidx.fragment.app.FragmentManager childFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.KWHzl.djBIcL.getText());
                java.util.List<C55276xgr> listDjBIcL = this.copydefault.djBIcL();
                java.util.ArrayList<C55276xgr> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listDjBIcL) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((C55276xgr) obj).AhwBna(), (java.lang.Object) strGEmmrt)) {
                        arrayList.add(obj);
                    }
                }
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.KWHzl.gEmmrt.getText());
                for (C55276xgr c55276xgr : arrayList) {
                    c55276xgr.copydefault(Intrinsics.EZpvd((java.lang.Object) c55276xgr.AhwBna(), (java.lang.Object) strGEmmrt2));
                }
                qXX qxx = new qXX(arrayList, C33070mpX.AYXKKw(qZH.PendingIntent.QVsKAR));
                qxx.OLrzqt(new StateListAnimator(this.KWHzl, this.copydefault, qxx));
                C46645tbA c46645tbA = this.copydefault;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c46645tbA));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                C46825teV c46825teV = (C46825teV) ((androidx.fragment.app.Fragment) objM7377constructorimpl);
                if (c46825teV == null || (childFragmentManager = c46825teV.getChildFragmentManager()) == null) {
                    return;
                }
                qxx.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C46645tbA EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42939rfq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C46645tbA c46645tbA, C42939rfq c42939rfq) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c46645tbA;
            this.copydefault = c42939rfq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            androidx.fragment.app.FragmentManager childFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.util.List<C55276xgr> listValues = this.EZpvd.values();
                for (C55276xgr c55276xgr : listValues) {
                    c55276xgr.copydefault(Intrinsics.EZpvd(c55276xgr.OLrzqt(), java.lang.Integer.valueOf(this.EZpvd.AhwBna.gEmmrt())));
                }
                qXX qxx = new qXX(listValues, C33070mpX.AYXKKw(qZH.PendingIntent.dUDNAs));
                qxx.OLrzqt(new TaskDescription(this.copydefault, this.EZpvd, qxx));
                C46645tbA c46645tbA = this.EZpvd;
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c46645tbA));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                C46825teV c46825teV = (C46825teV) ((androidx.fragment.app.Fragment) objM7377constructorimpl);
                if (c46825teV == null || (childFragmentManager = c46825teV.getChildFragmentManager()) == null) {
                    return;
                }
                qxx.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C46645tbA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C46645tbA c46645tbA) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c46645tbA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$AssistContent */
    public static final class AssistContent implements wYX.ActionBar {
        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            wys.setSelected(!wys.isSelected());
        }
    }

    /* JADX INFO: renamed from: o.tbA$Activity */
    public static final class Activity implements wYX.TaskDescription {
        public final /* synthetic */ C46645tbA AEQbTJ;
        public final /* synthetic */ wYX KWHzl;
        public final /* synthetic */ C42939rfq copydefault;

        public Activity(wYX wyx, C46645tbA c46645tbA, C42939rfq c42939rfq) {
            this.KWHzl = wyx;
            this.AEQbTJ = c46645tbA;
            this.copydefault = c42939rfq;
        }

        @Override // o.wYX.TaskDescription
        public void copydefault(wYS wys, wYO wyo, boolean z) {
            java.lang.Object obj;
            java.lang.Object next;
            java.lang.String strAYXKKw;
            java.lang.CharSequence charSequenceAYXKKw;
            Intrinsics.checkNotNullParameter(wys, "");
            Intrinsics.checkNotNullParameter(wyo, "");
            if (z) {
                for (wYS wys2 : this.KWHzl.EZpvd()) {
                    if (!Intrinsics.EZpvd(wys2, wys)) {
                        wys2.setSelected(false);
                    }
                }
                C46690tbt c46690tbt = this.AEQbTJ.AhwBna;
                java.util.Iterator it = this.AEQbTJ.fetchVPNInfo().iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd(((wYO) ((kotlin.Pair) next).getSecond()).EZpvd(), wyo.EZpvd())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                kotlin.Pair pair = (kotlin.Pair) next;
                c46690tbt.OLrzqt(pair != null ? ((java.lang.Number) pair.getFirst()).intValue() : 1);
                if (this.AEQbTJ.AhwBna.OLrzqt() == 0) {
                    AppCompatTextView appCompatTextView = this.copydefault.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    appCompatTextView.setVisibility(8);
                    Group group = this.copydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(group, "");
                    group.setVisibility(0);
                    java.lang.String strCopydefault = this.AEQbTJ.AhwBna.copydefault();
                    if (strCopydefault == null || strCopydefault.length() == 0) {
                        this.copydefault.gEmmrt.setText(C33070mpX.AYXKKw(qZH.PendingIntent.QVsKAR));
                        this.copydefault.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                    } else {
                        AppCompatTextView appCompatTextView2 = this.copydefault.gEmmrt;
                        java.lang.String strCopydefault2 = this.AEQbTJ.AhwBna.copydefault();
                        appCompatTextView2.setText(strCopydefault2 != null ? C46653tbI.KWHzl(strCopydefault2) : null);
                        this.copydefault.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    }
                    java.lang.String strEZpvd = this.AEQbTJ.AhwBna.EZpvd();
                    if (strEZpvd == null || strEZpvd.length() == 0) {
                        this.copydefault.djBIcL.setText(C33070mpX.AYXKKw(qZH.PendingIntent.QSLkRj));
                        this.copydefault.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                    } else {
                        AppCompatTextView appCompatTextView3 = this.copydefault.djBIcL;
                        java.lang.String strEZpvd2 = this.AEQbTJ.AhwBna.EZpvd();
                        appCompatTextView3.setText(strEZpvd2 != null ? C46653tbI.KWHzl(strEZpvd2) : null);
                        this.copydefault.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    }
                    android.widget.TextView textView = this.copydefault.AkhnZx;
                    java.util.List listValues = this.AEQbTJ.values();
                    C46645tbA c46645tbA = this.AEQbTJ;
                    java.util.Iterator it2 = listValues.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it2.next();
                        if (Intrinsics.EZpvd(((C55276xgr) next2).OLrzqt(), java.lang.Integer.valueOf(c46645tbA.AhwBna.gEmmrt()))) {
                            obj = next2;
                            break;
                        }
                    }
                    C55276xgr c55276xgr = (C55276xgr) obj;
                    if (c55276xgr == null || (charSequenceAYXKKw = c55276xgr.AhwBna()) == null) {
                        charSequenceAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.DCUTEIddSDPG);
                    }
                    textView.setText(charSequenceAYXKKw);
                } else {
                    AppCompatTextView appCompatTextView4 = this.copydefault.DbNXlk;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                    appCompatTextView4.setVisibility(0);
                    AppCompatTextView appCompatTextView5 = this.copydefault.DbNXlk;
                    if (this.AEQbTJ.AhwBna.OLrzqt() == 1) {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.DGUQLI);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.heceqZ);
                    }
                    appCompatTextView5.setText(strAYXKKw);
                    Group group2 = this.copydefault.copydefault;
                    Intrinsics.checkNotNullExpressionValue(group2, "");
                    group2.setVisibility(8);
                }
                PriceEditViewModel priceEditViewModelAkhnZx = this.AEQbTJ.AkhnZx();
                if (priceEditViewModelAkhnZx != null) {
                    priceEditViewModelAkhnZx.copydefault(this.AEQbTJ.AhwBna);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$Application */
    public static final class Application implements wYX.TaskDescription {
        public final /* synthetic */ wYX KWHzl;
        public final /* synthetic */ C46645tbA OLrzqt;

        public Application(wYX wyx, C46645tbA c46645tbA) {
            this.KWHzl = wyx;
            this.OLrzqt = c46645tbA;
        }

        @Override // o.wYX.TaskDescription
        public void copydefault(wYS wys, wYO wyo, boolean z) {
            java.lang.Object next;
            java.lang.String str;
            Intrinsics.checkNotNullParameter(wys, "");
            Intrinsics.checkNotNullParameter(wyo, "");
            if (z) {
                for (wYS wys2 : this.KWHzl.EZpvd()) {
                    if (!Intrinsics.EZpvd(wys2, wys)) {
                        wys2.setSelected(false);
                    }
                }
                C46690tbt c46690tbt = this.OLrzqt.AhwBna;
                java.util.Iterator it = this.OLrzqt.DbNXlk().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd(((wYO) ((kotlin.Pair) next).getSecond()).EZpvd(), wyo.EZpvd())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                kotlin.Pair pair = (kotlin.Pair) next;
                if (pair == null || (str = (java.lang.String) pair.getFirst()) == null) {
                    str = "0";
                }
                c46690tbt.EZpvd(str);
                PriceEditViewModel priceEditViewModelAkhnZx = this.OLrzqt.AkhnZx();
                if (priceEditViewModelAkhnZx != null) {
                    priceEditViewModelAkhnZx.copydefault(this.OLrzqt.AhwBna);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tbA$StateListAnimator */
    public static final class StateListAnimator implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C42939rfq AEQbTJ;
        public final /* synthetic */ C46645tbA EZpvd;
        public final /* synthetic */ qXX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C42939rfq c42939rfq, C46645tbA c46645tbA, qXX qxx) {
            this.AEQbTJ = c42939rfq;
            this.EZpvd = c46645tbA;
            this.copydefault = qxx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            OLrzqt(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C55276xgr c55276xgr) {
            java.lang.CharSequence charSequenceAhwBna = c55276xgr != null ? c55276xgr.AhwBna() : null;
            java.lang.String str = charSequenceAhwBna instanceof java.lang.String ? (java.lang.String) charSequenceAhwBna : null;
            if (str == null) {
                return;
            }
            this.AEQbTJ.gEmmrt.setText(str);
            this.AEQbTJ.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            C46690tbt c46690tbt = this.EZpvd.AhwBna;
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            c46690tbt.OLrzqt(objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null);
            PriceEditViewModel priceEditViewModelAkhnZx = this.EZpvd.AkhnZx();
            if (priceEditViewModelAkhnZx != null) {
                priceEditViewModelAkhnZx.copydefault(this.EZpvd.AhwBna);
            }
            this.copydefault.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.tbA$ActionBar */
    public static final class ActionBar implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C46645tbA KWHzl;
        public final /* synthetic */ qXX OLrzqt;
        public final /* synthetic */ C42939rfq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C42939rfq c42939rfq, C46645tbA c46645tbA, qXX qxx) {
            this.copydefault = c42939rfq;
            this.KWHzl = c46645tbA;
            this.OLrzqt = qxx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            OLrzqt(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C55276xgr c55276xgr) {
            java.lang.CharSequence charSequenceAhwBna = c55276xgr != null ? c55276xgr.AhwBna() : null;
            java.lang.String str = charSequenceAhwBna instanceof java.lang.String ? (java.lang.String) charSequenceAhwBna : null;
            if (str == null) {
                return;
            }
            this.copydefault.djBIcL.setText(str);
            this.copydefault.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            C46690tbt c46690tbt = this.KWHzl.AhwBna;
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            c46690tbt.copydefault(objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null);
            PriceEditViewModel priceEditViewModelAkhnZx = this.KWHzl.AkhnZx();
            if (priceEditViewModelAkhnZx != null) {
                priceEditViewModelAkhnZx.copydefault(this.KWHzl.AhwBna);
            }
            this.OLrzqt.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.tbA$TaskDescription */
    public static final class TaskDescription implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C46645tbA AEQbTJ;
        public final /* synthetic */ qXX KWHzl;
        public final /* synthetic */ C42939rfq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C42939rfq c42939rfq, C46645tbA c46645tbA, qXX qxx) {
            this.OLrzqt = c42939rfq;
            this.AEQbTJ = c46645tbA;
            this.KWHzl = qxx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            AEQbTJ(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(C55276xgr c55276xgr) {
            java.lang.CharSequence charSequenceAhwBna = c55276xgr != null ? c55276xgr.AhwBna() : null;
            java.lang.String str = charSequenceAhwBna instanceof java.lang.String ? (java.lang.String) charSequenceAhwBna : null;
            if (str == null) {
                return;
            }
            this.OLrzqt.AkhnZx.setText(str);
            C46690tbt c46690tbt = this.AEQbTJ.AhwBna;
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            java.lang.Integer num = objOLrzqt instanceof java.lang.Integer ? (java.lang.Integer) objOLrzqt : null;
            c46690tbt.copydefault(num != null ? num.intValue() : 1);
            PriceEditViewModel priceEditViewModelAkhnZx = this.AEQbTJ.AkhnZx();
            if (priceEditViewModelAkhnZx != null) {
                priceEditViewModelAkhnZx.copydefault(this.AEQbTJ.AhwBna);
            }
            this.KWHzl.dismissAllowingStateLoss();
        }
    }

    public final void AYXKKw() {
        final AppCompatImageView appCompatImageView = this.AEQbTJ.AEQbTJ;
        appCompatImageView.post(new java.lang.Runnable() { // from class: o.tbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46645tbA.KWHzl(appCompatImageView);
            }
        });
    }

    public static final void KWHzl(AppCompatImageView appCompatImageView) {
        Intrinsics.copydefault(appCompatImageView);
        android.app.Activity activityKWHzl = C41431qqg.KWHzl(appCompatImageView);
        if (activityKWHzl != null) {
            C52812wZg c52812wZg = new C52812wZg(activityKWHzl);
            C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
            if (c52794wYpIsConnected != null) {
                c52794wYpIsConnected.setText(C33070mpX.AYXKKw(qZH.PendingIntent.values));
            }
            C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
            if (c52794wYpAkhnZx != null) {
                c52794wYpAkhnZx.setVisibility(8);
            }
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(appCompatImageView);
            stateListAnimator.EZpvd(1);
            stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.dUDNAs));
            stateListAnimator.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.DGOPHZDGOPHZ));
            c52812wZg.AEQbTJ(stateListAnimator);
            c52812wZg.OLrzqt(1);
            c52812wZg.fARcdN();
        }
    }

    public final void setIndicator(@NotNull C46690tbt c46690tbt) {
        Intrinsics.checkNotNullParameter(c46690tbt, "");
        this.AhwBna = c46690tbt;
        C42939rfq c42939rfq = this.AEQbTJ;
        java.util.Iterator<T> it = fetchVPNInfo().iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            ((wYO) pair.getSecond()).KWHzl(((java.lang.Number) pair.getFirst()).intValue() == c46690tbt.OLrzqt());
        }
        wYX wyx = c42939rfq.KWHzl;
        java.util.List<kotlin.Pair<java.lang.Integer, wYO>> listFetchVPNInfo = fetchVPNInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        java.util.Iterator<T> it2 = listFetchVPNInfo.iterator();
        while (it2.hasNext()) {
            arrayList.add((wYO) ((kotlin.Pair) it2.next()).getSecond());
        }
        wyx.setSelectionChipBeans(arrayList);
    }
}
