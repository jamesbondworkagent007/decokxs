package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.InstConfig;
import com.okinc.widget.dialog.view.CenterLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C55001xbh;
import o.InterfaceC49872uwj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49876uwn extends AbstractC49550uqf implements InterfaceC49872uwj.Application {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public AbstractC49570uqz AEQbTJ;
    public InstConfig AYXKKw;
    public boolean AhwBna;
    public Function1<? super java.lang.String, Unit> ejfBZ;
    public C49886uwx isConnected;
    public java.lang.Float valueOf = java.lang.Float.valueOf(0.95f);
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String AkhnZx = "";
    public java.lang.String OLrzqt = "";
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.uwl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49876uwn.EZpvd();
        }
    });
    public final java.util.ArrayList<C49777uuu> values = new java.util.ArrayList<>();
    public final RecyclerView.OnScrollListener fJNWhG = new Activity();
    public final uBH djBIcL = new uBH(new Function0() { // from class: o.uwm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49876uwn.gEmmrt(this.copydefault);
        }
    });
    public final uBH fARcdN = new uBH(new Function0() { // from class: o.uwk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49876uwn.AhwBna(this.OLrzqt);
        }
    });
    public final android.os.Handler DbNXlk = new android.os.Handler();
    public final java.lang.Runnable EZpvd = new java.lang.Runnable() { // from class: o.uwq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C49876uwn.copydefault(this.EZpvd);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public boolean KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public java.lang.Float OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super java.lang.String, Unit> function1) {
        this.ejfBZ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.uwn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uwn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uwn$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C49876uwn newSwapInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, InstConfig instConfig, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function1 = null;
            }
            return actionBar.OLrzqt(str, str2, instConfig, function1);
        }

        public final C49876uwn OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, InstConfig instConfig, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C49876uwn c49876uwn = new C49876uwn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("inst_id", str);
            bundle.putString("instType", "SWAP");
            bundle.putString("margin_mode", "cross");
            bundle.putString("current_lever", str2);
            bundle.putSerializable("inst_config", instConfig);
            c49876uwn.setArguments(bundle);
            c49876uwn.OLrzqt(function1);
            return c49876uwn;
        }
    }

    public final C43316rmw AYXKKw() {
        return (C43316rmw) this.gEmmrt.getValue();
    }

    public static final C43316rmw EZpvd() {
        return new C43316rmw();
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        C49886uwx c49886uwx;
        super.onCreate(bundle);
        C54797xVr c54797xVr = C54797xVr.copydefault;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("current_lever")) == null) {
            string = "";
        }
        this.OLrzqt = C54797xVr.getCorrectShowLeverage$default(c54797xVr, string, false, null, false, 14, null);
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = (InstConfig) (arguments2 != null ? arguments2.getSerializable("inst_config") : null);
        C49886uwx c49886uwx2 = new C49886uwx();
        this.isConnected = c49886uwx2;
        c49886uwx2.KWHzl(this);
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            C49886uwx c49886uwx3 = this.isConnected;
            if (c49886uwx3 == null) {
                Intrinsics.gEmmrt("");
                c49886uwx = null;
            } else {
                c49886uwx = c49886uwx3;
            }
            java.lang.String string2 = arguments3.getString("inst_id", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = arguments3.getString("instType", "SWAP");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String string4 = arguments3.getString("margin_mode", "");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String string5 = arguments3.getString("posSide", "");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            java.lang.String string6 = arguments3.getString("lastPrice", "");
            Intrinsics.checkNotNullExpressionValue(string6, "");
            c49886uwx.KWHzl(string2, string3, string4, string5, string6, (TradePositionManager.PositionItem) arguments3.getParcelable("positionsItem"));
        }
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC49570uqz abstractC49570uqz = (AbstractC49570uqz) DataBindingUtil.inflate(layoutInflater, C49511upt.StateListAnimator.KWHzl, viewGroup, false);
        this.AEQbTJ = abstractC49570uqz;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        return abstractC49570uqz.getRoot();
    }

    /* JADX INFO: renamed from: o.uwn$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                AbstractC49570uqz abstractC49570uqz = C49876uwn.this.AEQbTJ;
                if (abstractC49570uqz == null) {
                    Intrinsics.gEmmrt("");
                    abstractC49570uqz = null;
                }
                RecyclerView.LayoutManager layoutManager = abstractC49570uqz.AhwBna.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    C49876uwn.this.KWHzl(linearLayoutManager, false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    @Override // o.AbstractC49550uqf, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt(getString(C49511upt.Activity.gEmmrt));
        djBIcL(this.OLrzqt);
        AbstractC49570uqz abstractC49570uqz = this.AEQbTJ;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        final C55001xbh c55001xbh = abstractC49570uqz.OLrzqt;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.addTextChangedListener(this.djBIcL);
        c55001xbh.addTextChangedListener(this.fARcdN);
        c55001xbh.setModel(C55001xbh.ActionBar.copy$default(c55001xbh.DbNXlk(), 0, 0, 2, 3, null));
        c55001xbh.requestFocus();
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.uwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49876uwn.EZpvd(c55001xbh);
            }
        }, 100L);
        AbstractC49570uqz abstractC49570uqz2 = this.AEQbTJ;
        if (abstractC49570uqz2 == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz2 = null;
        }
        abstractC49570uqz2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49876uwn.djBIcL(this.AEQbTJ, view2);
            }
        });
        android.content.Context context = getContext();
        if (context != null) {
            AbstractC49570uqz abstractC49570uqz3 = this.AEQbTJ;
            if (abstractC49570uqz3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz3 = null;
            }
            abstractC49570uqz3.AhwBna.setLayoutManager(new CenterLayoutManager(context, 0, false));
            AYXKKw().register(C49777uuu.class, new C49776uut(new Function2() { // from class: o.uws
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C49876uwn.AEQbTJ(this.AEQbTJ, (C49777uuu) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            }));
            AbstractC49570uqz abstractC49570uqz4 = this.AEQbTJ;
            if (abstractC49570uqz4 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz4 = null;
            }
            abstractC49570uqz4.AhwBna.setAdapter(AYXKKw());
            AbstractC49570uqz abstractC49570uqz5 = this.AEQbTJ;
            if (abstractC49570uqz5 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz5 = null;
            }
            abstractC49570uqz5.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.uwo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C49876uwn.valueOf(this.OLrzqt, view2);
                }
            });
            if (this.values.size() > 6) {
                AbstractC49570uqz abstractC49570uqz6 = this.AEQbTJ;
                if (abstractC49570uqz6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC49570uqz6 = null;
                }
                abstractC49570uqz6.AhwBna.addOnScrollListener(this.fJNWhG);
            } else {
                AbstractC49570uqz abstractC49570uqz7 = this.AEQbTJ;
                if (abstractC49570uqz7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC49570uqz7 = null;
                }
                abstractC49570uqz7.DbNXlk.setVisibility(8);
                AbstractC49570uqz abstractC49570uqz8 = this.AEQbTJ;
                if (abstractC49570uqz8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC49570uqz8 = null;
                }
                abstractC49570uqz8.AhwBna.removeOnScrollListener(this.fJNWhG);
            }
            if (this.AEQbTJ == null) {
                Intrinsics.gEmmrt("");
            }
        }
        AbstractC49570uqz abstractC49570uqz9 = this.AEQbTJ;
        if (abstractC49570uqz9 == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz9 = null;
        }
        abstractC49570uqz9.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.uwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49876uwn.AEQbTJ(this.copydefault, view2);
            }
        });
        AbstractC49570uqz abstractC49570uqz10 = this.AEQbTJ;
        if (abstractC49570uqz10 == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz10 = null;
        }
        abstractC49570uqz10.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.uww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49876uwn.AYXKKw(this.EZpvd, view2);
            }
        });
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        C49886uwx c49886uwx = this.isConnected;
        if (c49886uwx == null) {
            Intrinsics.gEmmrt("");
            c49886uwx = null;
        }
        java.lang.String strOLrzqt = c49886uwx.OLrzqt();
        C49886uwx c49886uwx2 = this.isConnected;
        if (c49886uwx2 == null) {
            Intrinsics.gEmmrt("");
            c49886uwx2 = null;
        }
        EZpvd(C54799xVt.getTitleByIdAndType$default(c54799xVt, strOLrzqt, c49886uwx2.EZpvd(), false, false, 8, null));
        refreshLeverage$default(this, null, 1, null);
    }

    public static final void EZpvd(C55001xbh c55001xbh) {
        java.lang.Object systemService = c55001xbh.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c55001xbh, 0);
        }
    }

    public static final void djBIcL(C49876uwn c49876uwn, android.view.View view) {
        c49876uwn.AEQbTJ(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, c49876uwn.OLrzqt, false, null, false, 14, null));
    }

    public static final Unit AEQbTJ(C49876uwn c49876uwn, C49777uuu c49777uuu, boolean z) {
        Intrinsics.checkNotNullParameter(c49777uuu, "");
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        RecyclerView.LayoutManager layoutManager = abstractC49570uqz.AhwBna.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            c49876uwn.KWHzl(linearLayoutManager, true);
        }
        if (z) {
            AbstractC49570uqz abstractC49570uqz3 = c49876uwn.AEQbTJ;
            if (abstractC49570uqz3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz3 = null;
            }
            abstractC49570uqz3.OLrzqt.removeTextChangedListener(c49876uwn.fARcdN);
            c49876uwn.AYXKKw(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, c49777uuu.AEQbTJ(), false, null, false, 14, null));
            AbstractC49570uqz abstractC49570uqz4 = c49876uwn.AEQbTJ;
            if (abstractC49570uqz4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49570uqz2 = abstractC49570uqz4;
            }
            abstractC49570uqz2.OLrzqt.addTextChangedListener(c49876uwn.fARcdN);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(C49876uwn c49876uwn, android.view.View view) {
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        abstractC49570uqz.AhwBna.smoothScrollToPosition(c49876uwn.values.size() - 1);
    }

    public static final void AEQbTJ(C49876uwn c49876uwn, android.view.View view) {
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        java.lang.String strSubS$default = C33129mqd.subS$default(abstractC49570uqz.OLrzqt.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        if (C33129mqd.gEmmrt(strSubS$default, c49876uwn.fetchVPNInfo)) {
            return;
        }
        AbstractC49570uqz abstractC49570uqz3 = c49876uwn.AEQbTJ;
        if (abstractC49570uqz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49570uqz2 = abstractC49570uqz3;
        }
        abstractC49570uqz2.OLrzqt.setPlainNumericText(strSubS$default);
    }

    public static final void AYXKKw(C49876uwn c49876uwn, android.view.View view) {
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        java.lang.String strAddS$default = C33129mqd.addS$default(abstractC49570uqz.OLrzqt.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        if (C33129mqd.AEQbTJ(strAddS$default, c49876uwn.AkhnZx)) {
            return;
        }
        AbstractC49570uqz abstractC49570uqz3 = c49876uwn.AEQbTJ;
        if (abstractC49570uqz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49570uqz2 = abstractC49570uqz3;
        }
        abstractC49570uqz2.OLrzqt.setPlainNumericText(strAddS$default);
    }

    public static /* synthetic */ void refreshLeverage$default(C49876uwn c49876uwn, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c49876uwn.copydefault(str);
    }

    private final void copydefault(java.lang.String str) {
        InstConfig instConfig = this.AYXKKw;
        if (instConfig != null) {
            KWHzl("", instConfig.getLeverLow(), instConfig.getLeverHigh());
            try {
                int i = 0;
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) instConfig.getLeverPercents(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() == 1 && Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                for (java.lang.Object obj : listSplit$default) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str2 = (java.lang.String) obj;
                    arrayList.add(new C49777uuu(str2 + "x", str2, C33129mqd.OLrzqt(str2, gEmmrt()), i));
                    i++;
                }
                if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                    OLrzqt(arrayList);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(LinearLayoutManager linearLayoutManager, boolean z) {
        java.lang.Object next;
        linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        AbstractC49570uqz abstractC49570uqz = null;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != this.values.size() - 1) {
            AbstractC49570uqz abstractC49570uqz2 = this.AEQbTJ;
            if (abstractC49570uqz2 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz2 = null;
            }
            abstractC49570uqz2.DbNXlk.setVisibility(0);
        } else {
            AbstractC49570uqz abstractC49570uqz3 = this.AEQbTJ;
            if (abstractC49570uqz3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz3 = null;
            }
            abstractC49570uqz3.DbNXlk.setVisibility(8);
        }
        if (z) {
            java.util.Iterator<T> it = this.values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C49777uuu) next).KWHzl()) {
                        break;
                    }
                }
            }
            C49777uuu c49777uuu = (C49777uuu) next;
            int iCopydefault = c49777uuu != null ? c49777uuu.copydefault() : -1;
            if (iCopydefault == -1) {
                return;
            }
            AbstractC49570uqz abstractC49570uqz4 = this.AEQbTJ;
            if (abstractC49570uqz4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49570uqz = abstractC49570uqz4;
            }
            abstractC49570uqz.AhwBna.smoothScrollToPosition(iCopydefault);
        }
    }

    public static final Unit gEmmrt(C49876uwn c49876uwn) {
        java.lang.String str;
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        java.lang.String strIsConnected = abstractC49570uqz.OLrzqt.isConnected();
        if (C33129mqd.AEQbTJ(strIsConnected) != C33129mqd.AEQbTJ(c49876uwn.OLrzqt)) {
            if ((c49876uwn.fetchVPNInfo.length() > 0 || (str = c49876uwn.AkhnZx) == null || str.length() == 0) && !Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) "") && (C33129mqd.subD$default(strIsConnected, c49876uwn.fetchVPNInfo, null, null, null, 14, null) < AudioStats.AUDIO_AMPLITUDE_NONE || C33129mqd.subD$default(strIsConnected, c49876uwn.AkhnZx, null, null, null, 14, null) > AudioStats.AUDIO_AMPLITUDE_NONE)) {
                strIsConnected = "";
            }
            c49876uwn.OLrzqt = strIsConnected;
            AbstractC49570uqz abstractC49570uqz3 = c49876uwn.AEQbTJ;
            if (abstractC49570uqz3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz3 = null;
            }
            abstractC49570uqz3.AYXKKw.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(c49876uwn.OLrzqt, 1, null, null, null, 14, null), c49876uwn.AkhnZx));
            AbstractC49570uqz abstractC49570uqz4 = c49876uwn.AEQbTJ;
            if (abstractC49570uqz4 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz4 = null;
            }
            abstractC49570uqz4.gEmmrt.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(c49876uwn.OLrzqt, 1, null, null, null, 14, null), c49876uwn.fetchVPNInfo));
            if (Intrinsics.EZpvd((java.lang.Object) c49876uwn.OLrzqt, (java.lang.Object) "")) {
                AbstractC49570uqz abstractC49570uqz5 = c49876uwn.AEQbTJ;
                if (abstractC49570uqz5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC49570uqz2 = abstractC49570uqz5;
                }
                abstractC49570uqz2.AEQbTJ.setEnabled(false);
            } else {
                AbstractC49570uqz abstractC49570uqz6 = c49876uwn.AEQbTJ;
                if (abstractC49570uqz6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC49570uqz2 = abstractC49570uqz6;
                }
                abstractC49570uqz2.AEQbTJ.setEnabled(true);
                c49876uwn.djBIcL(c49876uwn.OLrzqt);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C49876uwn c49876uwn) {
        c49876uwn.valueOf();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C49876uwn c49876uwn) {
        AbstractC49570uqz abstractC49570uqz = c49876uwn.AEQbTJ;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        RecyclerView.LayoutManager layoutManager = abstractC49570uqz.AhwBna.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            c49876uwn.KWHzl(linearLayoutManager, true);
        }
    }

    private final void OLrzqt(java.util.List<C49777uuu> list) {
        this.values.clear();
        this.values.addAll(list);
        AbstractC49570uqz abstractC49570uqz = null;
        if (this.values.size() > 6) {
            AbstractC49570uqz abstractC49570uqz2 = this.AEQbTJ;
            if (abstractC49570uqz2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49570uqz = abstractC49570uqz2;
            }
            abstractC49570uqz.AhwBna.addOnScrollListener(this.fJNWhG);
        } else {
            AbstractC49570uqz abstractC49570uqz3 = this.AEQbTJ;
            if (abstractC49570uqz3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49570uqz3 = null;
            }
            abstractC49570uqz3.AhwBna.removeOnScrollListener(this.fJNWhG);
            AbstractC49570uqz abstractC49570uqz4 = this.AEQbTJ;
            if (abstractC49570uqz4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49570uqz = abstractC49570uqz4;
            }
            abstractC49570uqz.DbNXlk.setVisibility(8);
        }
        C33064mpR.OLrzqt(AYXKKw(), (java.util.List<? extends java.lang.Object>) this.values);
        this.DbNXlk.removeCallbacks(this.EZpvd);
        this.DbNXlk.postDelayed(this.EZpvd, 100L);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AbstractC49570uqz abstractC49570uqz = this.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        abstractC49570uqz.OLrzqt.removeTextChangedListener(this.djBIcL);
        AbstractC49570uqz abstractC49570uqz3 = this.AEQbTJ;
        if (abstractC49570uqz3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz3 = null;
        }
        abstractC49570uqz3.AhwBna.removeOnScrollListener(this.fJNWhG);
        AbstractC49570uqz abstractC49570uqz4 = this.AEQbTJ;
        if (abstractC49570uqz4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49570uqz2 = abstractC49570uqz4;
        }
        abstractC49570uqz2.OLrzqt.removeTextChangedListener(this.fARcdN);
        this.DbNXlk.removeCallbacks(this.EZpvd);
        super.onDestroyView();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C33129mqd.AEQbTJ(str3) > AudioStats.AUDIO_AMPLITUDE_NONE && (!Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) str2) || !Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) str3))) {
            C54797xVr c54797xVr = C54797xVr.copydefault;
            this.fetchVPNInfo = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str2, false, null, false, 14, null);
            this.AkhnZx = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str3, false, null, false, 14, null);
        }
        AbstractC49570uqz abstractC49570uqz = this.AEQbTJ;
        AbstractC49570uqz abstractC49570uqz2 = null;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        abstractC49570uqz.AYXKKw.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(this.OLrzqt, 1, null, null, null, 14, null), str3));
        AbstractC49570uqz abstractC49570uqz3 = this.AEQbTJ;
        if (abstractC49570uqz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49570uqz2 = abstractC49570uqz3;
        }
        abstractC49570uqz2.gEmmrt.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(this.OLrzqt, 1, null, null, null, 14, null), str2));
    }

    private final void djBIcL(java.lang.String str) {
        AbstractC49570uqz abstractC49570uqz = this.AEQbTJ;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        abstractC49570uqz.KWHzl.setText(C49855uwS.getLeverShow$default(C49855uwS.copydefault, str, false, 2, null));
        AYXKKw(str);
    }

    private final void AYXKKw(java.lang.String str) {
        AbstractC49570uqz abstractC49570uqz = this.AEQbTJ;
        if (abstractC49570uqz == null) {
            Intrinsics.gEmmrt("");
            abstractC49570uqz = null;
        }
        abstractC49570uqz.OLrzqt.setPlainNumericText(str);
    }

    private final void AEQbTJ(java.lang.String str) {
        C49886uwx c49886uwx = this.isConnected;
        if (c49886uwx == null) {
            Intrinsics.gEmmrt("");
            c49886uwx = null;
        }
        c49886uwx.OLrzqt(str);
    }

    @Override // o.InterfaceC49872uwj.Application
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function1<? super java.lang.String, Unit> function1 = this.ejfBZ;
        if (function1 != null) {
            function1.invoke(str);
        }
        dismissAllowingStateLoss();
    }

    public final void valueOf() {
        java.util.Iterator<T> it = this.values.iterator();
        while (it.hasNext()) {
            ((C49777uuu) it.next()).KWHzl(false);
        }
        AYXKKw().notifyDataSetChanged();
    }
}
