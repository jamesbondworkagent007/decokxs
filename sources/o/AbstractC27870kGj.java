package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.dialog.MarketToolDialog;
import com.okinc.business.market.market.fragment.BaseMarketCateFragment$performLongClick$1$1;
import com.okinc.business.market.market.fragment.BaseMarketCateFragment$showLongPressGuide$1$1$1$2;
import com.okinc.business.market.market.fragment.BaseMarketCateFragment$updateBinderContentView$1;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.SortTextView;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.tradeapi.bean.TradeGroupData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC27554jxQ;
import o.C27985kKq;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC27870kGj extends AbstractC32998moE implements AbstractC27554jxQ.ActionBar, MarketToolDialog.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public TradeGroupData AYXKKw;
    public boolean AhwBna;
    public android.widget.FrameLayout AkhnZx;
    public C52812wZg EZpvd;
    public boolean djBIcL;
    public java.lang.String ejfBZ;
    public android.view.View fIwbmz;
    public CoinQuote gEmmrt;
    public boolean valueOf;
    public RecyclerView values;
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.kGh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27870kGj.AYXKKw(this.KWHzl);
        }
    });
    public final C59534zip isConnected = new C59534zip();
    public MutableLiveData<java.lang.String> DbNXlk = C42955rgF.copydefault.copydefault();
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.kGk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27870kGj.AuCTelauCTel();
        }
    });
    public final int copydefault = C55298xhM.dp2px$default(6.0f, null, 1, null);
    public final int AEQbTJ = C55298xhM.dp2px$default(30.0f, null, 1, null);
    public java.lang.String fetchVPNInfo = "";
    public boolean KWHzl = true;
    public boolean AuCTel = true;
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.kGm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC27870kGj.djBIcL(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.kGj$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.kGj$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<CoinQuote> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeGroupData AYXKKw() {
        return this.AYXKKw;
    }

    public abstract AbstractC54646xQb AhwBna();

    public abstract java.lang.String[] DbNXlk();

    public abstract void EZpvd(@NotNull C59534zip c59534zip);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> djBIcL() {
        return this.DbNXlk;
    }

    public abstract java.lang.String ejfBZ();

    public abstract void fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView gEmmrt() {
        return this.values;
    }

    public abstract void getFieldNames();

    public boolean iwGUEr() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fetchVPNInfo;
    }

    public abstract java.lang.Boolean[] values();

    /* JADX INFO: renamed from: o.kGj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kGj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C27954kJm isConnected() {
        return (C27954kJm) this.fJNWhG.getValue();
    }

    public static final C27954kJm AYXKKw(AbstractC27870kGj abstractC27870kGj) {
        androidx.fragment.app.Fragment parentFragment = abstractC27870kGj.getParentFragment();
        if (parentFragment != null) {
            abstractC27870kGj = parentFragment;
        }
        return (C27954kJm) new ViewModelProvider(abstractC27870kGj).get(C27954kJm.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt getNewProxyInstance() {
        return (C38383pWt) this.iwGUEr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38383pWt AuCTelauCTel() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? (TradeGroupData) arguments.getParcelable("market_tab_group_data") : null;
        this.AkhnZx = (android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.OKSWiw);
        this.values = (RecyclerView) view.findViewById(qZH.StateListAnimator.IKQXqd);
        this.fIwbmz = view.findViewById(qZH.StateListAnimator.onReceive);
        RecyclerView recyclerView = this.values;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.values;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.isConnected);
        }
        EZpvd(true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk);
        if (viewGroup != null) {
            C6873aXb.OLrzqt(viewGroup);
        }
        EZpvd(this.isConnected);
        fIwbmz();
    }

    public final void fIwbmz() {
        isConnected().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.kGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27870kGj.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(AbstractC27870kGj abstractC27870kGj, java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            abstractC27870kGj.ejfBZ = str;
            if (abstractC27870kGj.isVisibled()) {
                abstractC27870kGj.fARcdN();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        android.view.ViewGroup viewGroup;
        if (!this.djBIcL) {
            this.djBIcL = true;
            android.view.View view = getView();
            if (view != null && (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) != null) {
                C6873aXb.EZpvd(viewGroup);
            }
        }
        AuCTel();
        TradeGroupData tradeGroupData = this.AYXKKw;
        if (tradeGroupData != null) {
            C27986kKr.AEQbTJ.OLrzqt("market_tab_click", C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiat_amount", tradeGroupData.getType()), C56390yDp.OLrzqt("unified_amount", ejfBZ())));
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        this.valueOf = false;
        try {
            Result.Application application = Result.Companion;
            android.view.View view = getView();
            android.view.View viewFindViewById = view != null ? view.findViewById(qZH.StateListAnimator.DRGLNw) : null;
            android.widget.LinearLayout linearLayout = viewFindViewById != null ? (android.widget.LinearLayout) viewFindViewById.findViewById(qZH.StateListAnimator.TarCU) : null;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            C52812wZg c52812wZg = this.EZpvd;
            if (c52812wZg != null) {
                c52812wZg.KWHzl();
            }
            this.AhwBna = false;
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public void KWHzl(java.util.List<CoinQuote> list) {
        fJNWhG();
        if (!this.AhwBna) {
            this.isConnected.setItems(AEQbTJ(list == null ? new java.util.ArrayList<>() : list, this.fetchVPNInfo));
            this.isConnected.notifyDataSetChanged();
        }
        android.view.View view = this.fIwbmz;
        if (view != null) {
            java.util.List<?> items = this.isConnected.getItems();
            view.setVisibility((items == null || items.isEmpty()) ? 0 : 8);
        }
        if (list == null || !(!list.isEmpty()) || !zLjUOn() || this.valueOf) {
            return;
        }
        this.valueOf = true;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseMarketCateFragment$updateBinderContentView$1(this, null));
    }

    public final void AuCTel() {
        android.view.View view = getView();
        C42951rgB c42951rgB = view != null ? (C42951rgB) view.findViewById(qZH.StateListAnimator.GzAsTt) : null;
        android.content.Context context = getContext();
        if (context != null) {
            int color = context.getColor(C52761wXj.Activity.EZpvd);
            if (c42951rgB != null) {
                c42951rgB.setBackgroundColor(color);
            }
        }
        android.content.Context context2 = getContext();
        if (context2 != null && c42951rgB != null) {
            c42951rgB.setMiddleMarginEnd(C55298xhM.OLrzqt(118.0f, context2));
        }
        if (c42951rgB != null) {
            c42951rgB.setCallback(values(), DbNXlk(), new Function2() { // from class: o.kGr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC27870kGj.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2);
                }
            });
        }
        if (c42951rgB != null) {
            c42951rgB.setVolumeSortChange(new yHT() { // from class: o.kGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return AbstractC27870kGj.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue(), (SortTextView.SortType) obj2, ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(AbstractC27870kGj abstractC27870kGj, int i, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        abstractC27870kGj.EZpvd(i, sortType);
        abstractC27870kGj.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC27870kGj abstractC27870kGj, int i, SortTextView.SortType sortType, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i2 == 1) {
            abstractC27870kGj.DbNXlk.setValue("Volume");
        } else {
            abstractC27870kGj.DbNXlk.setValue("Turnover");
        }
        if (i3 == 0) {
            abstractC27870kGj.fetchVPNInfo = "";
        } else if (i3 != 1) {
            if (i2 == 1) {
                abstractC27870kGj.fetchVPNInfo = "volume_descending_sort";
            } else {
                abstractC27870kGj.fetchVPNInfo = "turnover_descending_sort";
            }
        } else if (i2 == 1) {
            abstractC27870kGj.fetchVPNInfo = "volume_ascending_sort";
        } else {
            abstractC27870kGj.fetchVPNInfo = "turnover_ascending_sort";
        }
        abstractC27870kGj.getFieldNames();
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
        this.fetchVPNInfo = mapKWHzl.get(sb.toString());
        if (i == 3) {
            this.fetchVPNInfo = actionBar.OLrzqt(sortType.ordinal());
        }
    }

    public final void fJNWhG() {
        EZpvd(false);
        AEQbTJ(false);
        copydefault(true);
    }

    public final void hDKMBd() {
        EZpvd(false);
        if (this.isConnected.getItemCount() == 0) {
            AEQbTJ(true);
        }
        copydefault(false);
    }

    public void copydefault(boolean z) {
        if (this.KWHzl) {
            this.KWHzl = false;
            pUU.EZpvd(getTAG(), "updateLoadState() called with: success = " + z);
            AbstractC42536rWm.addMarker$default(getOkQPL(), QPLType.LIFE_CYCLE, z ? QPLMarker.PAGE_LOADED : QPLMarker.PAGE_NOT_LOADED, getTAG(), 0L, 8, null);
        }
    }

    public final void EZpvd(boolean z) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        if (!this.AuCTel || (view = getView()) == null || (viewGroup = (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.DbNXlk)) == null) {
            return;
        }
        if (z) {
            pXA.KWHzl(viewGroup);
        } else {
            this.AuCTel = false;
            C57600ylV.AEQbTJ(viewGroup);
        }
    }

    public final C55173xeu AkhnZx() {
        return (C55173xeu) this.fARcdN.getValue();
    }

    public static final C55173xeu djBIcL(AbstractC27870kGj abstractC27870kGj) {
        android.content.Context contextRequireContext = abstractC27870kGj.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C55173xeu(contextRequireContext, null, 0, 6, null);
    }

    public final void AEQbTJ(boolean z) {
        android.widget.FrameLayout frameLayout = this.AkhnZx;
        if (frameLayout != null) {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            android.widget.FrameLayout frameLayout2 = this.AkhnZx;
            if (frameLayout2 == null || frameLayout2 == null) {
                return;
            }
            frameLayout2.removeAllViews();
            return;
        }
        C55173xeu c55173xeuAkhnZx = AkhnZx();
        java.lang.String string = getString(qZH.PendingIntent.DsL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeuAkhnZx.setTitle(string);
        AkhnZx().setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(qZH.PendingIntent.djSkpj));
        C55173xeu c55173xeuAkhnZx2 = AkhnZx();
        java.lang.String string2 = getString(qZH.PendingIntent.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeuAkhnZx2.setRetry(string2);
        AkhnZx().setRetryClickListener(new View.OnClickListener() { // from class: o.kGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC27870kGj.EZpvd(this.KWHzl, view);
            }
        });
        AkhnZx().setEmptyTypeImage(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        AkhnZx().setLayoutParams(layoutParams);
        if (AkhnZx().getParent() != null) {
            android.view.ViewParent parent = AkhnZx().getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(AkhnZx());
        }
        android.widget.FrameLayout frameLayout3 = this.AkhnZx;
        if (frameLayout3 != null) {
            frameLayout3.addView(AkhnZx());
        }
    }

    public static final void EZpvd(AbstractC27870kGj abstractC27870kGj, android.view.View view) {
        android.widget.FrameLayout frameLayout = abstractC27870kGj.AkhnZx;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        abstractC27870kGj.AuCTel = true;
        abstractC27870kGj.EZpvd(true);
        abstractC27870kGj.onVisible();
    }

    @Override // o.AbstractC27554jxQ.ActionBar
    public boolean OLrzqt(@NotNull android.view.View view, int i, CoinQuote coinQuote) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        if (!iwGUEr() || coinQuote == null) {
            return true;
        }
        this.gEmmrt = coinQuote;
        android.graphics.Point pointEZpvd = C41431qqg.EZpvd(view);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseMarketCateFragment$performLongClick$1$1(coinQuote, this, pointEZpvd, null), 3, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return true;
    }

    public java.lang.String uzCIH() {
        return C55608xnE.OLrzqt() ? "option_list" : "market_list";
    }

    @Override // com.okinc.business.market.market.dialog.MarketToolDialog.TaskDescription
    public void OLrzqt(@NotNull MarketToolDialog.Action action) {
        Intrinsics.checkNotNullParameter(action, "");
        int i = Application.KWHzl[action.ordinal()];
        if (i == 1) {
            C27858kFy c27858kFy = C27858kFy.EZpvd;
            CoinQuote coinQuote = this.gEmmrt;
            Intrinsics.copydefault(coinQuote);
            c27858kFy.OLrzqt(this, coinQuote, AhwBna(), "markets_discover", new Function0() { // from class: o.kGl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC27870kGj.copydefault();
                }
            });
            return;
        }
        if (i == 2) {
            C27858kFy c27858kFy2 = C27858kFy.EZpvd;
            CoinQuote coinQuote2 = this.gEmmrt;
            Intrinsics.copydefault(coinQuote2);
            c27858kFy2.EZpvd(this, coinQuote2, AhwBna(), new Function0() { // from class: o.kGn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC27870kGj.KWHzl();
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C27858kFy c27858kFy3 = C27858kFy.EZpvd;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c27858kFy3.KWHzl(contextRequireContext);
            return;
        }
        C27858kFy c27858kFy4 = C27858kFy.EZpvd;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        CoinQuote coinQuote3 = this.gEmmrt;
        Intrinsics.copydefault(coinQuote3);
        c27858kFy4.copydefault(contextRequireContext2, coinQuote3, "markets_discover");
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    private final boolean zLjUOn() {
        return C55608xnE.isLogin$default(null, 1, null) && !SPUtils.getBoolean("market_long_press_showed", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AubY() {
        FragmentActivity activity;
        java.lang.Object objM7377constructorimpl;
        RecyclerView recyclerView;
        Unit unit;
        java.lang.Object objM7377constructorimpl2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        android.view.View view;
        if (!zLjUOn() || (activity = getActivity()) == null) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            recyclerView = this.values;
            unit = null;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (recyclerView != null) {
            this.EZpvd = new C52812wZg(activity);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            java.lang.Integer numValueOf = linearLayoutManager != null ? java.lang.Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                RecyclerView recyclerView2 = this.values;
                android.view.View viewFindViewById = (recyclerView2 == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iIntValue)) == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? null : view.findViewById(qZH.StateListAnimator.DcMfJKfbSiEC);
                android.view.View view2 = getView();
                android.view.View viewFindViewById2 = view2 != null ? view2.findViewById(qZH.StateListAnimator.DRGLNw) : null;
                android.widget.LinearLayout linearLayout = viewFindViewById2 != null ? (android.widget.LinearLayout) viewFindViewById2.findViewById(qZH.StateListAnimator.TarCU) : null;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                if (linearLayout != null) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.getLocationOnScreen(iArr2);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.getLocationOnScreen(iArr);
                    }
                    try {
                        objM7377constructorimpl2 = Result.m7377constructorimpl(java.lang.Integer.valueOf(iArr[1] - iArr2[1]));
                    } catch (java.lang.Throwable th2) {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                        objM7377constructorimpl2 = null;
                    }
                    java.lang.Integer num = (java.lang.Integer) objM7377constructorimpl2;
                    int iIntValue2 = num != null ? num.intValue() : 0;
                    MarketToolDialog.Activity activity2 = MarketToolDialog.Companion;
                    activity2.AEQbTJ(iIntValue2 + C55298xhM.dp2px$default(6.0f, null, 1, null), activity2.KWHzl(), linearLayout);
                }
                if (viewFindViewById != null && linearLayout != null) {
                    LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new BaseMarketCateFragment$showLongPressGuide$1$1$1$2(viewFindViewById, linearLayout, this, null));
                }
                unit = Unit.INSTANCE;
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        Result.m7376boximpl(objM7377constructorimpl);
    }
}
