package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.data.domain.type.DataTabType;
import com.okinc.business.market.features.overview.ui.widget.CoinInfoGridCellId;
import com.okinc.business.market.features.token_detail.TokenDetail;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC29065kmc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29086kmx extends ConstraintLayout {
    public static boolean AEQbTJ;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public TokenDetailEventTrackingInfo KWHzl;
    public final int OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> djBIcL;

    /* JADX INFO: renamed from: o.kmx$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CoinInfoGridCellId.values().length];
            try {
                iArr[CoinInfoGridCellId.LIQUIDITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CoinInfoGridCellId.FDV.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CoinInfoGridCellId.MCAP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[CoinInfoGridCellId.HOLDERS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[CoinInfoGridCellId.CONTRACT_ADDRESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[CoinInfoGridCellId.RISK.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29086kmx(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:51) call: o.kmx.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29086kmx(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29086kmx(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29086kmx.KWHzl(context, this);
            }
        });
        this.OLrzqt = 5;
    }

    /* JADX INFO: renamed from: o.kmx$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kmx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final hFG OLrzqt() {
        return (hFG) this.copydefault.getValue();
    }

    public static final hFG KWHzl(android.content.Context context, C29086kmx c29086kmx) {
        return hFG.OLrzqt(android.view.LayoutInflater.from(context), c29086kmx);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kmx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C29086kmx c29086kmx, C29087kmy c29087kmy, TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c29086kmx.KWHzl(c29087kmy, tokenDetailEventTrackingInfo, function1);
    }

    public final void KWHzl(@NotNull C29087kmy c29087kmy, TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo, Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1) {
        Intrinsics.checkNotNullParameter(c29087kmy, "");
        this.djBIcL = function1;
        this.KWHzl = tokenDetailEventTrackingInfo;
        EZpvd(c29087kmy);
        AEQbTJ();
    }

    private final void AEQbTJ() {
        OLrzqt().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.kmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29086kmx.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(C29086kmx c29086kmx, android.view.View view) {
        AEQbTJ = !AEQbTJ;
        c29086kmx.copydefault();
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = c29086kmx.KWHzl;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.INFO_EXPAND, CoinDetailTabType.INFO);
        }
    }

    public final void copydefault() {
        hFG hfgOLrzqt = OLrzqt();
        java.util.List listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt(hfgOLrzqt.isConnected, hfgOLrzqt.AuCTelauCTel), C56390yDp.OLrzqt(hfgOLrzqt.values, hfgOLrzqt.wlaJM), C56390yDp.OLrzqt(hfgOLrzqt.DbNXlk, hfgOLrzqt.getNewProxyInstance), C56390yDp.OLrzqt(hfgOLrzqt.ejfBZ, hfgOLrzqt.zuBGHE), C56390yDp.OLrzqt(hfgOLrzqt.fARcdN, hfgOLrzqt.QKVWgx), C56390yDp.OLrzqt(hfgOLrzqt.fetchVPNInfo, hfgOLrzqt.iwGUEr), C56390yDp.OLrzqt(hfgOLrzqt.AuCTel, hfgOLrzqt.AxsJAY), C56390yDp.OLrzqt(hfgOLrzqt.fIwbmz, hfgOLrzqt.ORxRYg), C56390yDp.OLrzqt(hfgOLrzqt.AkhnZx, hfgOLrzqt.getFieldNames));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            java.lang.Object objComponent2 = ((kotlin.Pair) obj).component2();
            Intrinsics.checkNotNullExpressionValue(objComponent2, "");
            AppCompatTextView appCompatTextView = (AppCompatTextView) objComponent2;
            if (C33129mqd.OLrzqt(appCompatTextView.getText()) && !Intrinsics.EZpvd((java.lang.Object) appCompatTextView.getText(), (java.lang.Object) "--")) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<ConstraintLayout> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((ConstraintLayout) ((kotlin.Pair) it.next()).getFirst());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator it2 = listGEmmrt.iterator();
        while (it2.hasNext()) {
            arrayList3.add((ConstraintLayout) ((kotlin.Pair) it2.next()).getFirst());
        }
        java.util.List<ConstraintLayout> listGEmmrt2 = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList3, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
        C52794wYp c52794wYp = hfgOLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(arrayList2.size() > this.OLrzqt ? 0 : 8);
        for (ConstraintLayout constraintLayout : listGEmmrt2) {
            Intrinsics.copydefault(constraintLayout);
            constraintLayout.setVisibility(8);
        }
        int size = arrayList2.size();
        int i = this.OLrzqt;
        if (size <= i) {
            for (ConstraintLayout constraintLayout2 : arrayList2) {
                Intrinsics.copydefault(constraintLayout2);
                constraintLayout2.setVisibility(0);
            }
            return;
        }
        if (AEQbTJ) {
            for (ConstraintLayout constraintLayout3 : arrayList2) {
                Intrinsics.copydefault(constraintLayout3);
                constraintLayout3.setVisibility(0);
            }
            hfgOLrzqt.EZpvd.setText(getContext().getString(C23274hvD.Fragment.DGOPHZ));
            hfgOLrzqt.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.DNMMPQ, 0);
            return;
        }
        for (ConstraintLayout constraintLayout4 : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList2, i)) {
            Intrinsics.copydefault(constraintLayout4);
            constraintLayout4.setVisibility(0);
        }
        for (ConstraintLayout constraintLayout5 : CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) arrayList2, this.OLrzqt)) {
            Intrinsics.copydefault(constraintLayout5);
            constraintLayout5.setVisibility(8);
        }
        hfgOLrzqt.EZpvd.setText(getContext().getString(C23274hvD.Fragment.DcMfJKDCKfqP));
        hfgOLrzqt.EZpvd.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.DCUTEIddSDPG, 0);
    }

    public final void EZpvd(C29087kmy c29087kmy) {
        hFG hfgOLrzqt = OLrzqt();
        ConstraintLayout constraintLayout = hfgOLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AppCompatTextView appCompatTextView = hfgOLrzqt.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        setRowData(constraintLayout, appCompatTextView, OLrzqt(c29087kmy.OLrzqt()), EZpvd(c29087kmy.OLrzqt(), CoinInfoGridCellId.LIQUIDITY, DataTabType.LIQUIDITY_INFO.ordinal()), hfgOLrzqt.copydefault);
        AppCompatImageView appCompatImageView = hfgOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c29087kmy.EZpvd()) ? 0 : 8);
        ConstraintLayout constraintLayout2 = hfgOLrzqt.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        AppCompatTextView appCompatTextView2 = hfgOLrzqt.wlaJM;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strAhwBna = c29087kmy.AhwBna();
        RoundingMode roundingMode = RoundingMode.HALF_DOWN;
        setRowData(constraintLayout2, appCompatTextView2, C23319hvw.getNumberICU$default(strAhwBna, roundingMode, null, null, null, 14, null), EZpvd(c29087kmy.AhwBna(), CoinInfoGridCellId.HOLDERS, DataTabType.HOLDERS_CHANGE.ordinal()), hfgOLrzqt.KWHzl);
        ConstraintLayout constraintLayout3 = hfgOLrzqt.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        AppCompatTextView appCompatTextView3 = hfgOLrzqt.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        setRowData$default(this, constraintLayout3, appCompatTextView3, OLrzqt(c29087kmy.copydefault()), null, null, 24, null);
        C55258xgZ c55258xgZ = hfgOLrzqt.hDKMBd;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        ConstraintLayout constraintLayout4 = hfgOLrzqt.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        AppCompatTextView appCompatTextView4 = hfgOLrzqt.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        setRowData$default(this, constraintLayout4, appCompatTextView4, OLrzqt(c29087kmy.AYXKKw()), null, null, 24, null);
        C55258xgZ c55258xgZ2 = hfgOLrzqt.gHZMYf;
        c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, this));
        ConstraintLayout constraintLayout5 = hfgOLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        AppCompatTextView appCompatTextView5 = hfgOLrzqt.QKVWgx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
        setRowData$default(this, constraintLayout5, appCompatTextView5, "--", null, null, 24, null);
        ConstraintLayout constraintLayout6 = hfgOLrzqt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
        AppCompatTextView appCompatTextView6 = hfgOLrzqt.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
        setRowData$default(this, constraintLayout6, appCompatTextView6, C23319hvw.getNumberICU$default(c29087kmy.AEQbTJ(), roundingMode, null, null, null, 14, null), null, null, 24, null);
        C55258xgZ c55258xgZ3 = hfgOLrzqt.fJNWhG;
        c55258xgZ3.setOnClickListener(new Activity(c55258xgZ3, 1000L, this));
        ConstraintLayout constraintLayout7 = hfgOLrzqt.AuCTel;
        Intrinsics.checkNotNullExpressionValue(constraintLayout7, "");
        AppCompatTextView appCompatTextView7 = hfgOLrzqt.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
        setRowData$default(this, constraintLayout7, appCompatTextView7, C23319hvw.getNumberICU$default(c29087kmy.djBIcL(), roundingMode, null, null, null, 14, null), null, null, 24, null);
        C55258xgZ c55258xgZ4 = hfgOLrzqt.sSMYrx;
        c55258xgZ4.setOnClickListener(new FragmentManager(c55258xgZ4, 1000L, this));
        ConstraintLayout constraintLayout8 = hfgOLrzqt.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(constraintLayout8, "");
        AppCompatTextView appCompatTextView8 = hfgOLrzqt.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "");
        setRowData$default(this, constraintLayout8, appCompatTextView8, c29087kmy.valueOf(), null, null, 24, null);
        ConstraintLayout constraintLayout9 = hfgOLrzqt.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(constraintLayout9, "");
        if (constraintLayout9.getVisibility() == 0) {
            AppCompatImageView appCompatImageView2 = hfgOLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C33054mpH.loadUrl$default(appCompatImageView2, c29087kmy.KWHzl(), null, 0, 0, 14, null);
        }
        java.lang.String address$default = C25352ivB.formatAddress$default(c29087kmy.gEmmrt(), 6, 4, null, 4, null);
        ConstraintLayout constraintLayout10 = hfgOLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout10, "");
        AppCompatTextView appCompatTextView9 = hfgOLrzqt.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView9, "");
        setRowData$default(this, constraintLayout10, appCompatTextView9, address$default, null, null, 24, null);
        AppCompatImageView appCompatImageView3 = hfgOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
        appCompatImageView3.setVisibility(Intrinsics.EZpvd((java.lang.Object) address$default, (java.lang.Object) "--") ^ true ? 0 : 8);
        AppCompatImageView appCompatImageView4 = hfgOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
        if (appCompatImageView4.getVisibility() == 0) {
            ConstraintLayout constraintLayout11 = hfgOLrzqt.AkhnZx;
            constraintLayout11.setOnClickListener(new LoaderManager(constraintLayout11, 1000L, this, c29087kmy));
        }
        copydefault();
    }

    /* JADX INFO: renamed from: o.kmx$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29086kmx OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29086kmx c29086kmx) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c29086kmx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault(CoinInfoGridCellId.MCAP, C23274hvD.Fragment.OhRmUC, C23274hvD.Fragment.hTAtCx);
            }
        }
    }

    /* JADX INFO: renamed from: o.kmx$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C29086kmx AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29086kmx c29086kmx) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c29086kmx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault(CoinInfoGridCellId.MCAP, C23274hvD.Fragment.SUwuXE, C23274hvD.Fragment.OFQuKP);
            }
        }
    }

    /* JADX INFO: renamed from: o.kmx$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29086kmx EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ InterfaceC29065kmc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C29086kmx c29086kmx, InterfaceC29065kmc interfaceC29065kmc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c29086kmx;
            this.copydefault = interfaceC29065kmc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.kmx$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29086kmx EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C29086kmx c29086kmx) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c29086kmx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(CoinInfoGridCellId.MCAP, C23274hvD.Fragment.fruYXx, C23274hvD.Fragment.SaJVGb);
            }
        }
    }

    /* JADX INFO: renamed from: o.kmx$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29086kmx KWHzl;
        public final /* synthetic */ C29087kmy OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C29086kmx c29086kmx, C29087kmy c29087kmy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c29086kmx;
            this.OLrzqt = c29087kmy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.OLrzqt(new InterfaceC29065kmc.Activity(CoinInfoGridCellId.CONTRACT_ADDRESS, C23274hvD.Fragment.ComponentActivity22, this.OLrzqt.gEmmrt()));
            }
        }
    }

    /* JADX INFO: renamed from: o.kmx$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C29086kmx copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29086kmx c29086kmx) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c29086kmx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault(CoinInfoGridCellId.FDV, C23274hvD.Fragment.QTtQrx, C23274hvD.Fragment.onLost);
            }
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String scientificCurrency$default;
        return (str == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, true, true, false, false, null, false, false, 496, null)) == null) ? "--" : scientificCurrency$default;
    }

    public final InterfaceC29065kmc.TaskDescription EZpvd(java.lang.String str, CoinInfoGridCellId coinInfoGridCellId, int i) {
        if (str == null || str.length() == 0 || this.djBIcL == null) {
            return null;
        }
        return new InterfaceC29065kmc.TaskDescription(coinInfoGridCellId, CoinDetailTabType.DATA.ordinal(), i);
    }

    public final void copydefault(CoinInfoGridCellId coinInfoGridCellId, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
        OLrzqt(new InterfaceC29065kmc.StateListAnimator(coinInfoGridCellId, i, i2));
    }

    public static /* synthetic */ void setRowData$default(C29086kmx c29086kmx, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, java.lang.String str, InterfaceC29065kmc interfaceC29065kmc, android.widget.ImageView imageView, int i, java.lang.Object obj) {
        c29086kmx.setRowData(constraintLayout, appCompatTextView, str, (i & 8) != 0 ? null : interfaceC29065kmc, (i & 16) != 0 ? null : imageView);
    }

    public final void setRowData(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, java.lang.String str, InterfaceC29065kmc interfaceC29065kmc, android.widget.ImageView imageView) {
        constraintLayout.setVisibility((!C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) ? 8 : 0);
        if (constraintLayout.getVisibility() == 0) {
            appCompatTextView.setText(str);
            if (imageView != null) {
                imageView.setVisibility(interfaceC29065kmc != null ? 0 : 8);
            }
            if (interfaceC29065kmc != null) {
                constraintLayout.setOnClickListener(new Dialog(constraintLayout, 1000L, this, interfaceC29065kmc));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(InterfaceC29065kmc interfaceC29065kmc) {
        TokenDetailButtonName tokenDetailButtonName;
        if (interfaceC29065kmc instanceof InterfaceC29065kmc.StateListAnimator) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            InterfaceC29065kmc.StateListAnimator stateListAnimator = (InterfaceC29065kmc.StateListAnimator) interfaceC29065kmc;
            java.lang.String string = getContext().getString(stateListAnimator.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = getContext().getString(stateListAnimator.EZpvd());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            C25352ivB.OLrzqt(context, string, string2, C23274hvD.Fragment.QVAiDq);
        } else if (interfaceC29065kmc instanceof InterfaceC29065kmc.ActionBar) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            InterfaceC29065kmc.ActionBar actionBar = (InterfaceC29065kmc.ActionBar) interfaceC29065kmc;
            C25352ivB.OLrzqt(context2, actionBar.KWHzl(), actionBar.AEQbTJ(), C23274hvD.Fragment.QVAiDq);
        } else if (interfaceC29065kmc instanceof InterfaceC29065kmc.TaskDescription) {
            Function1<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, Unit> function1 = this.djBIcL;
            if (function1 != null) {
                InterfaceC29065kmc.TaskDescription taskDescription = (InterfaceC29065kmc.TaskDescription) interfaceC29065kmc;
                function1.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(taskDescription.AEQbTJ()), java.lang.Integer.valueOf(taskDescription.OLrzqt())));
            }
        } else if (interfaceC29065kmc instanceof InterfaceC29065kmc.Activity) {
            InterfaceC29065kmc.Activity activity = (InterfaceC29065kmc.Activity) interfaceC29065kmc;
            int iKWHzl = activity.KWHzl();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            hSW.copyAddress$default(iKWHzl, context3, activity.AEQbTJ(), null, null, 24, null);
        } else {
            if (!(interfaceC29065kmc instanceof InterfaceC29065kmc.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            ((InterfaceC29065kmc.Application) interfaceC29065kmc).EZpvd().invoke();
        }
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.KWHzl;
        if (tokenDetailEventTrackingInfo != null) {
            switch (TaskDescription.OLrzqt[interfaceC29065kmc.copydefault().ordinal()]) {
                case 1:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_LIQUIDITY;
                    break;
                case 2:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_FDV_EXPLAIN;
                    break;
                case 3:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_MARKET_CAP_EXPLAIN;
                    break;
                case 4:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_HOLDERS;
                    break;
                case 5:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_CONTRACT_ADDRESS_COPY;
                    break;
                case 6:
                    tokenDetailButtonName = TokenDetailButtonName.INFO_RISK;
                    break;
                default:
                    return;
            }
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, tokenDetailButtonName, CoinDetailTabType.INFO);
        }
    }

    public final void EZpvd(@NotNull TokenDetail tokenDetail) {
        Intrinsics.checkNotNullParameter(tokenDetail, "");
        hFG hfgOLrzqt = OLrzqt();
        java.lang.String strAhwBna = tokenDetail.AhwBna();
        if (strAhwBna != null) {
            ConstraintLayout constraintLayout = hfgOLrzqt.isConnected;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            AppCompatTextView appCompatTextView = hfgOLrzqt.AuCTelauCTel;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            setRowData(constraintLayout, appCompatTextView, OLrzqt(strAhwBna), EZpvd(strAhwBna, CoinInfoGridCellId.LIQUIDITY, DataTabType.LIQUIDITY_INFO.ordinal()), hfgOLrzqt.copydefault);
        }
        java.lang.String strAkhnZx = tokenDetail.AkhnZx();
        if (strAkhnZx != null) {
            ConstraintLayout constraintLayout2 = hfgOLrzqt.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            AppCompatTextView appCompatTextView2 = hfgOLrzqt.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            setRowData$default(this, constraintLayout2, appCompatTextView2, OLrzqt(strAkhnZx), null, null, 24, null);
        }
        java.lang.String strAYXKKw = tokenDetail.AYXKKw();
        if (strAYXKKw != null) {
            ConstraintLayout constraintLayout3 = hfgOLrzqt.values;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            AppCompatTextView appCompatTextView3 = hfgOLrzqt.wlaJM;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            setRowData(constraintLayout3, appCompatTextView3, C23319hvw.getNumberICU$default(strAYXKKw, RoundingMode.HALF_DOWN, null, null, null, 14, null), EZpvd(strAYXKKw, CoinInfoGridCellId.HOLDERS, DataTabType.HOLDERS_CHANGE.ordinal()), hfgOLrzqt.KWHzl);
        }
        copydefault();
    }

    public final void EZpvd(@NotNull C4147AzP c4147AzP) {
        Triple triple;
        Triple triple2;
        Intrinsics.checkNotNullParameter(c4147AzP, "");
        hFG hfgOLrzqt = OLrzqt();
        if (C33129mqd.AhwBna(c4147AzP.AEQbTJ()) == 0 && C33129mqd.AhwBna(c4147AzP.EZpvd()) == 0) {
            triple = new Triple(null, null, getContext().getString(C23274hvD.Fragment.MediaControllerCompatMediaControllerImplBase));
        } else {
            if (C33129mqd.AhwBna(c4147AzP.AEQbTJ()) > 0) {
                triple2 = new Triple(java.lang.Integer.valueOf(C52761wXj.TaskDescription.zNQIcI), java.lang.Integer.valueOf(C52761wXj.ActionBar.OuxcSI), c4147AzP.AEQbTJ());
            } else if (C33129mqd.AhwBna(c4147AzP.EZpvd()) > 0) {
                triple2 = new Triple(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZqidTP), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq), c4147AzP.EZpvd());
            } else {
                triple = new Triple(null, null, getContext().getString(C23274hvD.Fragment.MediaControllerCompatMediaControllerImplApi23));
            }
            triple = triple2;
        }
        java.lang.Integer num = (java.lang.Integer) triple.component1();
        java.lang.Integer num2 = (java.lang.Integer) triple.component2();
        java.lang.Object objComponent3 = triple.component3();
        Intrinsics.checkNotNullExpressionValue(objComponent3, "");
        ConstraintLayout constraintLayout = hfgOLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AppCompatTextView appCompatTextView = hfgOLrzqt.QKVWgx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        setRowData(constraintLayout, appCompatTextView, (java.lang.String) objComponent3, new InterfaceC29065kmc.TaskDescription(CoinInfoGridCellId.RISK, CoinDetailTabType.ASSESSMENT.ordinal(), 0), hfgOLrzqt.AhwBna);
        AppCompatImageView appCompatImageView = hfgOLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(num == null ? 8 : 0);
        if (num != null) {
            hfgOLrzqt.djBIcL.setImageResource(num.intValue());
            if (num2 != null) {
                hfgOLrzqt.djBIcL.setColorFilter(C25382ivf.KWHzl(num2.intValue()));
            }
        }
        copydefault();
    }
}
