package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.MarketDepthFragment$onVisible$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C37882pEe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38820pge extends AbstractC32998moE implements InterfaceC37933pGb {
    public MarketCoinInfo AYXKKw;
    public C36035oMw KWHzl;
    public AbstractC54531xLw valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public java.lang.String copydefault = "kline_dark";
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pgf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C38820pge.OLrzqt();
        }
    });
    public java.lang.String gEmmrt = "";
    public boolean EZpvd = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.AxsJAY;
    }

    /* JADX INFO: renamed from: o.pge$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pge.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C38820pge KWHzl(@NotNull MarketCoinInfo marketCoinInfo, boolean z) {
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            C38820pge c38820pge = new C38820pge();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("market_detail_info", marketCoinInfo);
            bundle.putBoolean("isNeedLoadDepth", z);
            c38820pge.setArguments(bundle);
            return c38820pge;
        }
    }

    public static final C37882pEe OLrzqt() {
        return C37882pEe.Companion.AEQbTJ();
    }

    public final C37882pEe AEQbTJ() {
        return (C37882pEe) this.OLrzqt.getValue();
    }

    @Override // o.InterfaceC37933pGb
    public void AhwBna() {
        if (getActivity() == null || !isVisibled()) {
            return;
        }
        copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "MarketDepthFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        java.lang.String instrumentId;
        C55052xcf c55052xcf;
        java.lang.String instrumentType;
        ActivityResultCaller activityResultCaller;
        java.lang.String str = "";
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
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        if (C39216poC.copydefault.copydefault()) {
            if (parentFragment2 instanceof C39014pkM) {
                this.AYXKKw = ((C39014pkM) parentFragment2).DbNXlk().hDKMBd();
            }
        } else if (parentFragment2 instanceof oYA) {
            this.AYXKKw = ((oYA) parentFragment2).QbewEr();
        }
        C37882pEe.Application application = C37882pEe.Companion;
        MarketCoinInfo marketCoinInfo = this.AYXKKw;
        if (marketCoinInfo == null || (instrumentId = marketCoinInfo.getInstrumentId()) == null) {
            instrumentId = "";
        }
        MarketCoinInfo marketCoinInfo2 = this.AYXKKw;
        if (marketCoinInfo2 != null && (instrumentType = marketCoinInfo2.getInstrumentType()) != null) {
            str = instrumentType;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(application.EZpvd(instrumentId, str));
        this.gEmmrt = strValueOf;
        C36035oMw c36035oMw = this.KWHzl;
        if (c36035oMw != null && (c55052xcf = c36035oMw.gEmmrt) != null) {
            c55052xcf.setTitle(xMR.copydefault.copydefault(strValueOf));
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketDepthFragment$onVisible$1(this, null));
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        if (Intrinsics.EZpvd((java.lang.Object) "kline_follow_app", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) || Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            return;
        }
        this.copydefault = SPUtils.getString("kline_theme_type", "kline_dark");
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        ActivityResultCaller activityResultCaller;
        AEQbTJ().EZpvd();
        this.valueOf = null;
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

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.RelativeLayout relativeLayout;
        android.widget.LinearLayout linearLayout;
        ActivityResultCaller activityResultCaller;
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C36035oMw.KWHzl(view);
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
        OLrzqt(new C37882pEe.TaskDescription("", ""));
        android.os.Bundle arguments = getArguments();
        this.AYXKKw = arguments != null ? (MarketCoinInfo) arguments.getParcelable("market_detail_info") : null;
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? arguments2.getBoolean("isNeedLoadDepth", true) : true;
        C36035oMw c36035oMw = this.KWHzl;
        if (c36035oMw != null && (linearLayout = c36035oMw.AYXKKw) != null) {
            linearLayout.setMinimumHeight(C33518mxv.EZpvd(getActivity(), C33129mqd.djBIcL(20)));
        }
        C36035oMw c36035oMw2 = this.KWHzl;
        if (c36035oMw2 == null || (relativeLayout = c36035oMw2.djBIcL) == null) {
            return;
        }
        relativeLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: o.pge$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C38820pge KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C38820pge c38820pge) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c38820pge;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(android.view.View view) {
            BizInstrument bizInstrumentValueOf;
            java.util.ArrayList arrayList;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.AEQbTJ("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), Activity.copydefault);
                this.KWHzl.copydefault(false);
                AbstractC54531xLw abstractC54531xLw = this.KWHzl.valueOf;
                if (abstractC54531xLw != null) {
                    MarketCoinInfo marketCoinInfo = this.KWHzl.AYXKKw;
                    java.lang.String instrumentId = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
                    Intrinsics.copydefault((java.lang.Object) instrumentId);
                    bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId);
                } else {
                    bizInstrumentValueOf = null;
                }
                AbstractC54531xLw abstractC54531xLw2 = this.KWHzl.valueOf;
                if (abstractC54531xLw2 == null) {
                    arrayList = null;
                } else {
                    if (bizInstrumentValueOf == null) {
                        return;
                    }
                    java.util.List<java.lang.String> listKWHzl = abstractC54531xLw2.KWHzl(bizInstrumentValueOf);
                    if (listKWHzl != null) {
                        arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                        for (java.lang.String str : listKWHzl) {
                            arrayList.add(new TradeMenuItemBean(xMR.copydefault.copydefault(str), Intrinsics.EZpvd((java.lang.Object) this.KWHzl.gEmmrt, (java.lang.Object) str), str, null, false, null, 56, null));
                        }
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                C32869mli.onNewOKexEventWithParams$default("KLine_Pop_Depth_View", null, this.KWHzl.new ActionBar(), 1, null);
                C39793pyz c39793pyz = new C39793pyz();
                c39793pyz.OLrzqt(arrayList);
                c39793pyz.setOnDismissListener(this.KWHzl.new TaskDescription());
                c39793pyz.OLrzqt(this.KWHzl.new Application(c39793pyz));
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c39793pyz.show(childFragmentManager);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    public final void KWHzl() {
        C55052xcf c55052xcf;
        C36035oMw c36035oMw = this.KWHzl;
        if (c36035oMw == null || (c55052xcf = c36035oMw.gEmmrt) == null) {
            return;
        }
        c55052xcf.setVisibility(this.EZpvd ? 0 : 8);
        c55052xcf.setOnClickListener(new PendingIntent(c55052xcf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.pge$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity copydefault = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("orderbook_precision_entry", "orderbook_precision_entry", true);
        }
    }

    /* JADX INFO: renamed from: o.pge$ActionBar */
    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            java.lang.String instrumentType;
            java.lang.String instrumentId;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            MarketCoinInfo marketCoinInfo = C38820pge.this.AYXKKw;
            if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
                instrumentType = "";
            }
            eventParamsList.put("deal_type", instrumentType, false);
            MarketCoinInfo marketCoinInfo2 = C38820pge.this.AYXKKw;
            if (marketCoinInfo2 != null && (instrumentId = marketCoinInfo2.getInstrumentId()) != null) {
                str = instrumentId;
            }
            eventParamsList.put("deal_name", str, false);
        }
    }

    /* JADX INFO: renamed from: o.pge$TaskDescription */
    public static final class TaskDescription implements DialogInterface.OnDismissListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(android.content.DialogInterface dialogInterface) {
            C38820pge.this.copydefault(true);
        }
    }

    /* JADX INFO: renamed from: o.pge$Application */
    public static final class Application implements Function2<java.lang.Integer, C55276xgr, Unit> {
        public final /* synthetic */ C39793pyz OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C39793pyz c39793pyz) {
            this.OLrzqt = c39793pyz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Integer num, C55276xgr c55276xgr) {
            EZpvd(num.intValue(), c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(int i, C55276xgr c55276xgr) {
            C55052xcf c55052xcf;
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            C38820pge c38820pge = C38820pge.this;
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            c38820pge.gEmmrt = (java.lang.String) objOLrzqt;
            C36035oMw c36035oMw = C38820pge.this.KWHzl;
            if (c36035oMw != null && (c55052xcf = c36035oMw.gEmmrt) != null) {
                xMR xmr = xMR.copydefault;
                java.lang.String str = C38820pge.this.gEmmrt;
                c55052xcf.setTitle(xmr.copydefault(str != null ? str : ""));
            }
            C38820pge.this.copydefault();
            C38820pge.this.copydefault(true);
            final C38820pge c38820pge2 = C38820pge.this;
            C32869mli.onNewOKexEventWithParams$default("app_k_depth_click", null, new Function1<EventParamsList, Unit>() { // from class: o.pge.Application.4
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                    AEQbTJ(eventParamsList);
                    return Unit.INSTANCE;
                }

                public final void AEQbTJ(EventParamsList eventParamsList) {
                    java.lang.String instrumentType;
                    java.lang.String instrumentId;
                    java.lang.String str2 = "";
                    Intrinsics.checkNotNullParameter(eventParamsList, "");
                    MarketCoinInfo marketCoinInfo = c38820pge2.AYXKKw;
                    if (marketCoinInfo == null || (instrumentType = marketCoinInfo.getInstrumentType()) == null) {
                        instrumentType = "";
                    }
                    eventParamsList.put("deal_type", instrumentType, false);
                    MarketCoinInfo marketCoinInfo2 = c38820pge2.AYXKKw;
                    if (marketCoinInfo2 != null && (instrumentId = marketCoinInfo2.getInstrumentId()) != null) {
                        str2 = instrumentId;
                    }
                    eventParamsList.put("deal_name", str2, false);
                    eventParamsList.put("depth", c38820pge2.gEmmrt, false);
                }
            }, 1, null);
            this.OLrzqt.dismiss();
        }
    }

    public final void copydefault() {
        java.lang.String instrumentType;
        java.lang.String instrumentId;
        java.lang.String strDjBIcL;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof oYA) {
            this.AYXKKw = ((oYA) parentFragment).QbewEr();
        }
        AEQbTJ().EZpvd();
        AbstractC54531xLw abstractC54531xLw = this.valueOf;
        if (abstractC54531xLw != null) {
            MarketCoinInfo marketCoinInfo = this.AYXKKw;
            java.lang.String instrumentId2 = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            Intrinsics.copydefault((java.lang.Object) instrumentId2);
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(instrumentId2);
            if (bizInstrumentValueOf != null) {
                MarketCoinInfo marketCoinInfo2 = this.AYXKKw;
                java.lang.String instrumentType2 = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
                if (Intrinsics.EZpvd((java.lang.Object) instrumentType2, (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) instrumentType2, (java.lang.Object) "SPOT") || (strDjBIcL = abstractC54531xLw.EZpvd(bizInstrumentValueOf)) == null || strDjBIcL.length() == 0) {
                    strDjBIcL = abstractC54531xLw.djBIcL(bizInstrumentValueOf);
                }
                C36035oMw c36035oMw = this.KWHzl;
                if (c36035oMw != null && (textView3 = c36035oMw.AEQbTJ) != null) {
                    textView3.setText(C59449zhJ.replace$default(getResources().getText(C35964oKf.Fragment.hbZCHz).toString(), "USDT", strDjBIcL == null ? "" : strDjBIcL, false, 4, (java.lang.Object) null));
                }
                C36035oMw c36035oMw2 = this.KWHzl;
                if (c36035oMw2 != null && (textView2 = c36035oMw2.copydefault) != null) {
                    textView2.setText(C33069mpW.copydefault(this, C35964oKf.Fragment.HJWChPiaHEvk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("unit", C33129mqd.gEmmrt(abstractC54531xLw.OLrzqt(bizInstrumentValueOf))))));
                }
                C36035oMw c36035oMw3 = this.KWHzl;
                if (c36035oMw3 != null && (textView = c36035oMw3.values) != null) {
                    textView.setText(C33069mpW.copydefault(this, C35964oKf.Fragment.aBDePw, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("unit", C33129mqd.gEmmrt(abstractC54531xLw.OLrzqt(bizInstrumentValueOf))))));
                }
            }
        }
        if (this.EZpvd) {
            C37882pEe c37882pEeAEQbTJ = AEQbTJ();
            MarketCoinInfo marketCoinInfo3 = this.AYXKKw;
            java.lang.String str = (marketCoinInfo3 == null || (instrumentId = marketCoinInfo3.getInstrumentId()) == null) ? "" : instrumentId;
            MarketCoinInfo marketCoinInfo4 = this.AYXKKw;
            C37882pEe.subDepth$default(c37882pEeAEQbTJ, str, (marketCoinInfo4 == null || (instrumentType = marketCoinInfo4.getInstrumentType()) == null) ? "" : instrumentType, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.gEmmrt) ? null : this.gEmmrt, 50, false, new Function1() { // from class: o.pgj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C38820pge.AEQbTJ(this.OLrzqt, (C37882pEe.TaskDescription) obj);
                }
            }, 16, null);
        }
    }

    public static final Unit AEQbTJ(C38820pge c38820pge, C37882pEe.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c38820pge.OLrzqt(taskDescription);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38820pge, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C37882pEe.TaskDescription taskDescription) {
        C39807pzM c39807pzM;
        ActivityResultCaller activityResultCaller;
        C39807pzM c39807pzM2;
        if (getActivity() != null && (getActivity() instanceof ActivityC38834pgs)) {
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
            if (c55427xjj == null || !c55427xjj.AuCTel()) {
                C36035oMw c36035oMw = this.KWHzl;
                if (c36035oMw != null && (c39807pzM2 = c36035oMw.valueOf) != null) {
                    c39807pzM2.copydefault(taskDescription);
                }
            } else {
                AEQbTJ().EZpvd();
            }
        }
        if (getActivity() == null || !(getActivity() instanceof ActivityC38952pjD)) {
            return;
        }
        FragmentActivity activity = getActivity();
        Intrinsics.copydefault(activity, "");
        if (((ActivityC38952pjD) activity).EZpvd()) {
            AEQbTJ().EZpvd();
            return;
        }
        C36035oMw c36035oMw2 = this.KWHzl;
        if (c36035oMw2 == null || (c39807pzM = c36035oMw2.valueOf) == null) {
            return;
        }
        c39807pzM.copydefault(taskDescription);
    }

    public final void copydefault(boolean z) {
        C55052xcf c55052xcf;
        C36035oMw c36035oMw = this.KWHzl;
        if (c36035oMw == null || (c55052xcf = c36035oMw.gEmmrt) == null) {
            return;
        }
        c55052xcf.setSelected(!z);
    }
}
