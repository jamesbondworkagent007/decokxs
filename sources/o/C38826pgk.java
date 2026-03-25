package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.MarketDepthMapFragment$onVisible$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C35964oKf;
import o.C37882pEe;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pgk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38826pgk extends AbstractC32998moE implements InterfaceC37933pGb {
    public C55173xeu AEQbTJ;
    public C39808pzN AYXKKw;
    public java.util.List<java.lang.String> AhwBna;
    public MarketCoinInfo djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public C55113xdn valueOf;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pgn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38826pgk.KWHzl();
        }
    });
    public java.lang.String copydefault = "";
    public java.lang.String EZpvd = "";
    public java.lang.String AkhnZx = "0";
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pgr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38826pgk.OLrzqt(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.pgk$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.gHZMYf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C37882pEe KWHzl() {
        return C37882pEe.Companion.AEQbTJ();
    }

    private final C37882pEe copydefault() {
        return (C37882pEe) this.KWHzl.getValue();
    }

    public final C39559pud OLrzqt() {
        return (C39559pud) this.OLrzqt.getValue();
    }

    public static final C39559pud OLrzqt(C38826pgk c38826pgk) {
        androidx.fragment.app.Fragment parentFragment;
        androidx.fragment.app.Fragment parentFragment2 = c38826pgk.getParentFragment();
        if (parentFragment2 != null && (parentFragment = parentFragment2.getParentFragment()) != null) {
            c38826pgk = parentFragment;
        }
        return (C39559pud) new ViewModelProvider(c38826pgk).get(C39559pud.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(AbstractC54531xLw abstractC54531xLw) {
        java.lang.String instrumentId;
        java.lang.String strGEmmrt;
        MarketCoinInfo marketCoinInfo = this.djBIcL;
        if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
            return;
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
        if (bizInstrumentValueOf != null) {
            this.AhwBna = abstractC54531xLw.KWHzl(bizInstrumentValueOf);
        }
        if (C33129mqd.KWHzl((java.util.Collection) this.AhwBna)) {
            java.util.List<java.lang.String> list = this.AhwBna;
            if (list == null || list.size() != 1) {
                java.util.List<java.lang.String> list2 = this.AhwBna;
                strGEmmrt = C33129mqd.gEmmrt(list2 != null ? list2.get(1) : null);
            } else {
                java.util.List<java.lang.String> list3 = this.AhwBna;
                this.AkhnZx = C33129mqd.gEmmrt(list3 != null ? list3.get(0) : null);
                AEQbTJ();
            }
        } else {
            strGEmmrt = "0";
        }
        this.AkhnZx = strGEmmrt;
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "MarketDepthMapFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        ActivityResultCaller activityResultCaller;
        if (getActivity() == null || !(getActivity() instanceof ActivityC38834pgs)) {
            if (getActivity() != null && (getActivity() instanceof ActivityC38952pjD)) {
                FragmentActivity activity = getActivity();
                Intrinsics.copydefault(activity, "");
                ((ActivityC38952pjD) activity).EZpvd(this);
            }
        } else {
            if (this instanceof C55427xjj) {
                activityResultCaller = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C55427xjj)) {
                    parentFragment = null;
                }
                activityResultCaller = (C55427xjj) parentFragment;
            }
            C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
            if (c55427xjj != null) {
                c55427xjj.EZpvd(this);
            }
        }
        C32866mlf.onEvent$default("app_depth_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 instanceof C39014pkM) {
            this.djBIcL = ((C39014pkM) parentFragment2).DbNXlk().hDKMBd();
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketDepthMapFragment$onVisible$1(this, null));
        KWHzl(true);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        ActivityResultCaller activityResultCaller;
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        copydefault().EZpvd();
        KWHzl(false);
        if (this instanceof C55427xjj) {
            activityResultCaller = this;
        } else {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                parentFragment = parentFragment.getParentFragment();
            }
            if (!(parentFragment instanceof C55427xjj)) {
                parentFragment = null;
            }
            activityResultCaller = (C55427xjj) parentFragment;
        }
        C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
        if (c55427xjj != null) {
            c55427xjj.copydefault((InterfaceC37933pGb) null);
        }
        FragmentActivity activity = getActivity();
        ActivityC38952pjD activityC38952pjD = activity instanceof ActivityC38952pjD ? (ActivityC38952pjD) activity : null;
        if (activityC38952pjD != null) {
            activityC38952pjD.copydefault((InterfaceC37933pGb) null);
        }
    }

    public final void KWHzl(boolean z) {
        if (z) {
            OLrzqt().KWHzl().observe(this, new ActionBar(new Function1() { // from class: o.pgu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38826pgk.AEQbTJ(this.copydefault, (java.lang.String) obj);
                }
            }));
            OLrzqt().gEmmrt().observe(this, new ActionBar(new Function1() { // from class: o.pgl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38826pgk.OLrzqt(this.KWHzl, (java.lang.String) obj);
                }
            }));
        } else {
            OLrzqt().KWHzl().removeObservers(this);
            OLrzqt().gEmmrt().removeObservers(this);
        }
    }

    public static final Unit AEQbTJ(C38826pgk c38826pgk, java.lang.String str) {
        c38826pgk.copydefault = str;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C38826pgk c38826pgk, java.lang.String str) {
        c38826pgk.EZpvd = str;
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = (C39808pzN) view.findViewById(C35964oKf.StateListAnimator.RjCdvp);
        this.valueOf = (C55113xdn) view.findViewById(C35964oKf.StateListAnimator.OhcwxsRkSIEV);
        C55173xeu c55173xeu = (C55173xeu) view.findViewById(C35964oKf.StateListAnimator.invokespecialaKhcqp);
        this.AEQbTJ = c55173xeu;
        if (c55173xeu != null) {
            java.lang.String string = getString(C35964oKf.Fragment.getConnectivityMgr);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
        }
        showLoading();
    }

    private final void AEQbTJ() {
        java.lang.String instrumentId;
        java.lang.String instrumentType;
        copydefault().EZpvd();
        C37882pEe c37882pEeCopydefault = copydefault();
        MarketCoinInfo marketCoinInfo = this.djBIcL;
        if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
            instrumentId = "";
        }
        MarketCoinInfo marketCoinInfo2 = this.djBIcL;
        if (marketCoinInfo2 == null || (instrumentType = marketCoinInfo2.getInstrumentType()) == null) {
            instrumentType = "";
        }
        c37882pEeCopydefault.EZpvd(instrumentId, instrumentType, this.AkhnZx, Integer.MAX_VALUE, true, new Function1() { // from class: o.pgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38826pgk.KWHzl(this.OLrzqt, (C37882pEe.TaskDescription) obj);
            }
        });
    }

    public static final Unit KWHzl(C38826pgk c38826pgk, C37882pEe.TaskDescription taskDescription) {
        java.util.ArrayList<pAQ> arrayListOLrzqt;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.util.ArrayList<pAQ> arrayListKWHzl = taskDescription.KWHzl();
        if ((arrayListKWHzl == null || arrayListKWHzl.isEmpty()) && ((arrayListOLrzqt = taskDescription.OLrzqt()) == null || arrayListOLrzqt.isEmpty())) {
            C55173xeu c55173xeu = c38826pgk.AEQbTJ;
            if (c55173xeu != null) {
                c55173xeu.setVisibility(0);
            }
            c38826pgk.copydefault().EZpvd();
        } else {
            c38826pgk.KWHzl(taskDescription);
            C55173xeu c55173xeu2 = c38826pgk.AEQbTJ;
            if (c55173xeu2 != null) {
                c55173xeu2.setVisibility(8);
            }
        }
        c38826pgk.dismissLoading();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38826pgk, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final C37882pEe.TaskDescription taskDescription) {
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = java.lang.System.currentTimeMillis();
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function1 = new Function1() { // from class: o.pgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38826pgk.KWHzl(taskDescription, this, longRef, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.pgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C38826pgk.valueOf(function1, obj);
            }
        }).subscribeOn(yBP.KWHzl()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.pgp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38826pgk.OLrzqt(longRef, this, (C37882pEe.TaskDescription) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pgq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38826pgk.KWHzl(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.pgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38826pgk.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.gEmmrt = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38826pgk.copydefault(function13, obj);
            }
        });
    }

    public static final C37882pEe.TaskDescription valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C37882pEe.TaskDescription) function1.invoke(obj);
    }

    public static final C37882pEe.TaskDescription KWHzl(C37882pEe.TaskDescription taskDescription, C38826pgk c38826pgk, Ref.LongRef longRef, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int size = taskDescription.OLrzqt().size();
        for (int i = 0; i < size; i++) {
            c38826pgk.KWHzl(taskDescription, i, true);
        }
        int size2 = taskDescription.KWHzl().size();
        for (int i2 = 0; i2 < size2; i2++) {
            c38826pgk.KWHzl(taskDescription, i2, false);
        }
        java.lang.System.currentTimeMillis();
        long j = longRef.element;
        return taskDescription;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Ref.LongRef longRef, C38826pgk c38826pgk, C37882pEe.TaskDescription taskDescription) {
        ActivityResultCaller activityResultCaller;
        java.lang.System.currentTimeMillis();
        long j = longRef.element;
        if (c38826pgk.getActivity() != null && (c38826pgk.getActivity() instanceof ActivityC38834pgs)) {
            if (c38826pgk instanceof C55427xjj) {
                activityResultCaller = c38826pgk;
            } else {
                androidx.fragment.app.Fragment parentFragment = c38826pgk.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof C55427xjj)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof C55427xjj)) {
                    parentFragment = null;
                }
                activityResultCaller = (C55427xjj) parentFragment;
            }
            C55427xjj c55427xjj = (C55427xjj) activityResultCaller;
            if (c55427xjj == null || !c55427xjj.AuCTel()) {
                C39808pzN c39808pzN = c38826pgk.AYXKKw;
                if (c39808pzN != null) {
                    MarketCoinInfo marketCoinInfo = c38826pgk.djBIcL;
                    java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                    MarketCoinInfo marketCoinInfo2 = c38826pgk.djBIcL;
                    java.lang.String instrumentType = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
                    float fDjBIcL = C33129mqd.djBIcL(c38826pgk.copydefault);
                    java.lang.String str = c38826pgk.EZpvd;
                    java.lang.String str2 = c38826pgk.AkhnZx;
                    c39808pzN.setData(instrumentId, instrumentType, fDjBIcL, str, str2 == null ? "1" : str2, taskDescription.OLrzqt(), taskDescription.KWHzl());
                }
            } else {
                c38826pgk.copydefault().EZpvd();
            }
        }
        if (c38826pgk.getActivity() != null && (c38826pgk.getActivity() instanceof ActivityC38952pjD)) {
            FragmentActivity activity = c38826pgk.getActivity();
            Intrinsics.copydefault(activity, "");
            if (!((ActivityC38952pjD) activity).EZpvd()) {
                C39808pzN c39808pzN2 = c38826pgk.AYXKKw;
                if (c39808pzN2 != null) {
                    MarketCoinInfo marketCoinInfo3 = c38826pgk.djBIcL;
                    java.lang.String instrumentId2 = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
                    MarketCoinInfo marketCoinInfo4 = c38826pgk.djBIcL;
                    java.lang.String instrumentType2 = marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null;
                    float fDjBIcL2 = C33129mqd.djBIcL(c38826pgk.copydefault);
                    java.lang.String str3 = c38826pgk.EZpvd;
                    java.lang.String str4 = c38826pgk.AkhnZx;
                    c39808pzN2.setData(instrumentId2, instrumentType2, fDjBIcL2, str3, str4 == null ? "1" : str4, taskDescription.OLrzqt(), taskDescription.KWHzl());
                }
            } else {
                c38826pgk.copydefault().EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTotalDepth$default(C38826pgk c38826pgk, C37882pEe.TaskDescription taskDescription, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        c38826pgk.KWHzl(taskDescription, i, z);
    }

    public final void KWHzl(C37882pEe.TaskDescription taskDescription, int i, boolean z) {
        if (z) {
            if (i == 0) {
                taskDescription.OLrzqt().get(i).copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(taskDescription.OLrzqt().get(i).OLrzqt())));
                return;
            } else {
                taskDescription.OLrzqt().get(i).copydefault(C33129mqd.djBIcL(java.lang.Float.valueOf(taskDescription.OLrzqt().get(i - 1).EZpvd())) + C33129mqd.djBIcL(java.lang.Double.valueOf(taskDescription.OLrzqt().get(i).OLrzqt())));
                return;
            }
        }
        if (i == 0) {
            taskDescription.KWHzl().get(i).copydefault(C33129mqd.djBIcL(java.lang.Double.valueOf(taskDescription.KWHzl().get(i).OLrzqt())));
        } else {
            taskDescription.KWHzl().get(i).copydefault(C33129mqd.djBIcL(java.lang.Float.valueOf(taskDescription.KWHzl().get(i - 1).EZpvd())) + C33129mqd.djBIcL(java.lang.Double.valueOf(taskDescription.KWHzl().get(i).OLrzqt())));
        }
    }

    @Override // o.InterfaceC37933pGb
    public void AhwBna() {
        if (getActivity() == null || !isVisibled()) {
            return;
        }
        AEQbTJ();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        C55113xdn c55113xdn = this.valueOf;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        C55113xdn c55113xdn2 = this.valueOf;
        if (c55113xdn2 != null) {
            c55113xdn2.setAnimation(C52761wXj.PendingIntent.isConnected);
        }
        C55113xdn c55113xdn3 = this.valueOf;
        if (c55113xdn3 != null) {
            c55113xdn3.KWHzl(0L);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        C55113xdn c55113xdn = this.valueOf;
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        C55113xdn c55113xdn2 = this.valueOf;
        if (c55113xdn2 != null) {
            c55113xdn2.copydefault();
        }
    }
}
