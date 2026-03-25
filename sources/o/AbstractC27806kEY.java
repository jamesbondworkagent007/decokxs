package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.MarketBaseQuoteFragment$performLongClick$1$1;
import com.okinc.business.market.market.MarketBaseQuoteFragment$requestData$1;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.core.widget.SortTextView;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.tradeapi.bean.SourceResp;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC27554jxQ;
import o.C27985kKq;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kEY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC27806kEY extends AbstractC32998moE implements MarketToolDialog.TaskDescription, AbstractC27554jxQ.ActionBar {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public CoinQuote AYXKKw;
    public RecyclerView AhwBna;
    public boolean EZpvd;
    public Job copydefault;
    public android.widget.FrameLayout gEmmrt;
    public android.view.View isConnected;
    public final C59534zip valueOf = new C59534zip();
    public java.lang.String djBIcL = "";
    public boolean AkhnZx = true;
    public final Observer<SourceResp<InterfaceC54581xNr>> AuCTel = new Observer() { // from class: o.kFg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC27806kEY.EZpvd(this.copydefault, (SourceResp) obj);
        }
    };
    public final MutableLiveData<java.lang.String> fetchVPNInfo = C42955rgF.copydefault.copydefault();
    public java.lang.String KWHzl = "";
    public java.lang.String DbNXlk = "ANY";
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.kFh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27806kEY.EZpvd();
        }
    });
    public java.lang.String fARcdN = "all";
    public boolean AEQbTJ = true;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.kFd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27806kEY.KWHzl(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.kEY$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketToolDialog.Action.values().length];
            try {
                iArr[MarketToolDialog.Action.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketToolDialog.Action.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketToolDialog.Action.ALERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketToolDialog.Action.EDIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    public abstract AbstractC54646xQb AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    public void AkhnZx() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinQuote OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt(CoinQuote coinQuote) {
        return "inst_list";
    }

    public abstract void OLrzqt(@NotNull C59534zip c59534zip);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.Object> copydefault(@NotNull java.util.List<CoinQuote> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull InterfaceC54581xNr interfaceC54581xNr) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
    }

    public abstract java.lang.String[] djBIcL();

    public boolean fetchVPNInfo() {
        return true;
    }

    public abstract java.lang.Boolean[] gEmmrt();

    public void isConnected() {
    }

    /* JADX INFO: renamed from: o.kEY$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kEY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final void EZpvd(AbstractC27806kEY abstractC27806kEY, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        if (Intrinsics.EZpvd(sourceResp.isSuccess(), java.lang.Boolean.TRUE) && sourceResp.getData() != null) {
            java.lang.Object data = sourceResp.getData();
            Intrinsics.copydefault(data);
            abstractC27806kEY.copydefault((InterfaceC54581xNr) data);
            return;
        }
        abstractC27806kEY.fIwbmz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt fJNWhG() {
        return (C38383pWt) this.fJNWhG.getValue();
    }

    public static final C38383pWt EZpvd() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? arguments.getString("inst_type") : null;
        OLrzqt(this.valueOf);
        AhwBna();
        this.gEmmrt = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.OKSWiw);
        this.AhwBna = (RecyclerView) view.findViewById(qZH.StateListAnimator.IKQXqd);
        this.isConnected = view.findViewById(qZH.StateListAnimator.onReceive);
        RecyclerView recyclerView = this.AhwBna;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.valueOf);
        }
        EZpvd(true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk);
        if (viewGroup != null) {
            C6873aXb.OLrzqt(viewGroup);
        }
    }

    public void AhwBna() {
        android.view.View view = getView();
        C42951rgB c42951rgB = view != null ? (C42951rgB) view.findViewById(qZH.StateListAnimator.dGrqPl) : null;
        if (c42951rgB != null) {
            c42951rgB.setCallback(gEmmrt(), djBIcL(), new Function2() { // from class: o.kFa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC27806kEY.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2);
                }
            });
        }
        if (c42951rgB != null) {
            c42951rgB.setVolumeSortChange(new yHT() { // from class: o.kFb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return AbstractC27806kEY.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final Unit EZpvd(AbstractC27806kEY abstractC27806kEY, int i, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        abstractC27806kEY.EZpvd(i, sortType);
        abstractC27806kEY.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC27806kEY abstractC27806kEY, int i, SortTextView.SortType sortType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i2 == 1) {
            abstractC27806kEY.fetchVPNInfo.setValue("Volume");
        } else {
            abstractC27806kEY.fetchVPNInfo.setValue("Turnover");
        }
        if (i3 == 0) {
            abstractC27806kEY.djBIcL = "";
        } else if (i3 != 1) {
            if (i2 == 1) {
                abstractC27806kEY.djBIcL = "volume_descending_sort";
            } else {
                abstractC27806kEY.djBIcL = "turnover_descending_sort";
            }
        } else if (i2 == 1) {
            abstractC27806kEY.djBIcL = "volume_ascending_sort";
        } else {
            abstractC27806kEY.djBIcL = "turnover_ascending_sort";
        }
        abstractC27806kEY.AkhnZx();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r5v0, r2v0 */
    private final void EZpvd(int i, SortTextView.SortType sortType) {
        C27985kKq.ActionBar actionBar = C27985kKq.ActionBar.copydefault;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = actionBar.KWHzl();
        int iOrdinal = sortType.ordinal();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append(iOrdinal);
        this.djBIcL = mapKWHzl.get(sb.toString());
        if (i == 3) {
            this.djBIcL = actionBar.OLrzqt(sortType.ordinal());
        }
    }

    public void KWHzl(java.util.List<CoinQuote> list) {
        values();
        C59534zip c59534zip = this.valueOf;
        if (list == null) {
            list = new java.util.ArrayList<>();
        }
        c59534zip.setItems(copydefault(list, this.djBIcL));
        this.valueOf.notifyDataSetChanged();
        android.view.View view = this.isConnected;
        if (view != null) {
            java.util.List<?> items = this.valueOf.getItems();
            view.setVisibility((items == null || items.isEmpty()) ? 0 : 8);
        }
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        Intrinsics.checkNotNullParameter(action, "");
        if (this.AYXKKw == null) {
            return;
        }
        int i = TaskDescription.OLrzqt[action.ordinal()];
        if (i == 1) {
            C27858kFy c27858kFy = C27858kFy.EZpvd;
            CoinQuote coinQuote = this.AYXKKw;
            Intrinsics.copydefault(coinQuote);
            c27858kFy.OLrzqt(this, coinQuote, AEQbTJ(), "favorites_discover", new Function0() { // from class: o.kEZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC27806kEY.valueOf(this.OLrzqt);
                }
            });
            return;
        }
        if (i == 2) {
            C27858kFy c27858kFy2 = C27858kFy.EZpvd;
            CoinQuote coinQuote2 = this.AYXKKw;
            Intrinsics.copydefault(coinQuote2);
            c27858kFy2.EZpvd(this, coinQuote2, AEQbTJ(), new Function0() { // from class: o.kFc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC27806kEY.djBIcL(this.AEQbTJ);
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf();
        } else {
            C27858kFy c27858kFy3 = C27858kFy.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            CoinQuote coinQuote3 = this.AYXKKw;
            Intrinsics.copydefault(coinQuote3);
            c27858kFy3.copydefault(contextRequireContext, coinQuote3, "favorites_discover");
        }
    }

    public static final Unit valueOf(AbstractC27806kEY abstractC27806kEY) {
        abstractC27806kEY.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC27806kEY abstractC27806kEY) {
        abstractC27806kEY.isConnected();
        return Unit.INSTANCE;
    }

    public void valueOf() {
        java.lang.Object objM7377constructorimpl;
        if (!C55608xnE.OLrzqt()) {
            if (!C55608xnE.isLogin$default(null, 1, null)) {
                try {
                    Result.Application application = Result.Companion;
                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    interfaceC8104awT.OLrzqt(fragmentActivityRequireActivity, new LoginRoute(null, null, null, null, null, null, null, null, null, false, false, 2047, null));
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Result.m7376boximpl(objM7377constructorimpl);
            } else {
                C27858kFy c27858kFy = C27858kFy.EZpvd;
                FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                c27858kFy.KWHzl(fragmentActivityRequireActivity2);
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) ActivityC46706tcI.class);
        intent.putExtra("type", false);
        intent.putExtra("exclude_ids", "COIN");
        startActivity(intent);
    }

    @Override // o.AbstractC27554jxQ.ActionBar
    public boolean OLrzqt(@NotNull android.view.View view, int i, CoinQuote coinQuote) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        if (!fetchVPNInfo() || coinQuote == null) {
            return true;
        }
        this.AYXKKw = coinQuote;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketBaseQuoteFragment$performLongClick$1$1(coinQuote, this, iArr, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return true;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroup;
        onInvisible();
        AhwBna();
        if (!this.EZpvd) {
            this.EZpvd = true;
            android.view.View view = getView();
            if (view != null && (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) != null) {
                C6873aXb.EZpvd(viewGroup);
            }
        }
        DbNXlk();
    }

    public final void EZpvd(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AkhnZx || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AkhnZx = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public void DbNXlk() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketBaseQuoteFragment$requestData$1(this, null));
    }

    public final void values() {
        AEQbTJ(true);
        EZpvd(false);
        KWHzl(false);
    }

    public void fIwbmz() {
        AEQbTJ(false);
        EZpvd(false);
        if (this.valueOf.getItemCount() == 0) {
            KWHzl(true);
        }
    }

    public void AEQbTJ(boolean z) {
        if (this.AEQbTJ) {
            this.AEQbTJ = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    public final C55173xeu KWHzl() {
        return (C55173xeu) this.values.getValue();
    }

    public static final C55173xeu KWHzl(AbstractC27806kEY abstractC27806kEY) {
        android.content.Context contextRequireContext = abstractC27806kEY.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    public final void KWHzl(boolean z) {
        android.widget.FrameLayout frameLayout = this.gEmmrt;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            android.widget.FrameLayout frameLayout2 = this.gEmmrt;
            if (frameLayout2 == null || frameLayout2 == null) {
                return;
            }
            frameLayout2.removeAllViews();
            return;
        }
        C55173xeu c55173xeuKWHzl = KWHzl();
        java.lang.String string = getString(qZH.PendingIntent.DsL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeuKWHzl.setTitle(string);
        KWHzl().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
        C55173xeu c55173xeuKWHzl2 = KWHzl();
        java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeuKWHzl2.setRetry(string2);
        KWHzl().setRetryClickListener(new View.OnClickListener() { // from class: o.kFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC27806kEY.KWHzl(this.OLrzqt, view);
            }
        });
        KWHzl().setEmptyTypeImage(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        KWHzl().setLayoutParams(layoutParams);
        if (KWHzl().getParent() != null) {
            android.view.ViewParent parent = KWHzl().getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(KWHzl());
        }
        android.widget.FrameLayout frameLayout3 = this.gEmmrt;
        if (frameLayout3 != null) {
            frameLayout3.addView(KWHzl());
        }
    }

    public static final void KWHzl(AbstractC27806kEY abstractC27806kEY, android.view.View view) {
        android.widget.FrameLayout frameLayout = abstractC27806kEY.gEmmrt;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        abstractC27806kEY.AkhnZx = true;
        abstractC27806kEY.EZpvd(true);
        abstractC27806kEY.onVisible();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
