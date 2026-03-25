package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.android.material.tabs.TabLayout;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.LeverageReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C55688xof;
import o.InterfaceC49844uwH;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C49841uwE extends AbstractC49732uuB implements InterfaceC49844uwH.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C49850uwN KWHzl;
    public boolean OLrzqt;
    public InterfaceC58217yxC djBIcL;
    public boolean valueOf;
    public float copydefault = 0.95f;
    public int gEmmrt = 1;
    public java.lang.String AEQbTJ = "";

    /* JADX INFO: renamed from: o.uwE$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "MarginAdjustLeverageDFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.gEmmrt = i;
    }

    /* JADX INFO: renamed from: o.uwE$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uwE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C49841uwE EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, boolean z, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49841uwE c49841uwE = new C49841uwE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instType", str2);
            bundle.putString("instId", str);
            bundle.putString("marginModel", str3);
            bundle.putString(OtcExtraKeys.SIDE, str4);
            bundle.putString("ccy", str5);
            bundle.putBoolean("PARAM_IS_SINGLE", z);
            if (bool != null) {
                bundle.putBoolean("showArbitrageTip", bool.booleanValue());
            }
            c49841uwE.setArguments(bundle);
            c49841uwE.KWHzl(function1);
            return c49841uwE;
        }
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        C49850uwN c49850uwN;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getBoolean("PARAM_IS_SINGLE", false) : false;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("ccy")) == null) {
            string = "";
        }
        this.AEQbTJ = string;
        C49850uwN c49850uwN2 = new C49850uwN();
        this.KWHzl = c49850uwN2;
        c49850uwN2.EZpvd(this);
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            C49850uwN c49850uwN3 = this.KWHzl;
            if (c49850uwN3 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN = null;
            } else {
                c49850uwN = c49850uwN3;
            }
            java.lang.String string2 = arguments3.getString("instId", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = arguments3.getString("instType", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String string4 = arguments3.getString("marginModel", "");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            c49850uwN.AEQbTJ(string2, string3, string4, arguments3.getString(OtcExtraKeys.SIDE, null), this.AEQbTJ, this.OLrzqt);
            this.valueOf = arguments3.getBoolean("showArbitrageTip", false);
        }
        getNewProxyInstance();
    }

    @Override // o.AbstractC49393unh
    public java.util.Map<java.lang.String, java.lang.String> AhwBna() {
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        C49850uwN c49850uwN = this.KWHzl;
        C49850uwN c49850uwN2 = null;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        pairArr[0] = C56390yDp.OLrzqt("instId", C33129mqd.gEmmrt(c49850uwN.copydefault()));
        C49850uwN c49850uwN3 = this.KWHzl;
        if (c49850uwN3 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN3 = null;
        }
        pairArr[1] = C56390yDp.OLrzqt("instType", C33129mqd.gEmmrt(c49850uwN3.AYXKKw()));
        C49850uwN c49850uwN4 = this.KWHzl;
        if (c49850uwN4 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN4 = null;
        }
        pairArr[2] = C56390yDp.OLrzqt("marginModel", C33129mqd.gEmmrt(c49850uwN4.gEmmrt()));
        C49850uwN c49850uwN5 = this.KWHzl;
        if (c49850uwN5 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN5 = null;
        }
        pairArr[3] = C56390yDp.OLrzqt(OtcExtraKeys.SIDE, C33129mqd.gEmmrt(c49850uwN5.isConnected()));
        C49850uwN c49850uwN6 = this.KWHzl;
        if (c49850uwN6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49850uwN2 = c49850uwN6;
        }
        pairArr[4] = C56390yDp.OLrzqt("ccy", C33129mqd.gEmmrt(c49850uwN2.AEQbTJ()));
        return C56424yEw.gEmmrt(pairArr);
    }

    @Override // o.AbstractC49732uuB, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (this.OLrzqt) {
            android.content.Context context = getContext();
            if (context != null && (strKWHzl = C33069mpW.KWHzl(context, C49511upt.Activity.OBJEWx, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", this.AEQbTJ)))) != null) {
                str = strKWHzl;
            }
            wxq.setTitle(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        boolean z;
        java.lang.String strEZpvd;
        TabLayout.Tab text;
        TabLayout.Tab text2;
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C49850uwN c49850uwN = this.KWHzl;
        C49850uwN c49850uwN2 = null;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        if (c49850uwN.fJNWhG()) {
            C49850uwN c49850uwN3 = this.KWHzl;
            if (c49850uwN3 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN3 = null;
            }
            if (c49850uwN3.fARcdN()) {
                z = true;
            }
        } else {
            z = false;
        }
        copydefault(z, this.OLrzqt);
        if (z) {
            C55249xgQ c55249xgQAkhnZx = AkhnZx();
            C49850uwN c49850uwN4 = this.KWHzl;
            if (c49850uwN4 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN4 = null;
            }
            BizInstrument bizInstrumentAhwBna = c49850uwN4.AhwBna();
            if (bizInstrumentAhwBna == null || (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) == null || (text = c55249xgQAkhnZx.newTab().setText(tradeSymbol)) == null) {
                text = c55249xgQAkhnZx.newTab().setText("");
                Intrinsics.checkNotNullExpressionValue(text, "");
            }
            c55249xgQAkhnZx.addTab(text);
            java.lang.String quoteSymbol = this.AEQbTJ;
            if (quoteSymbol.length() == 0) {
                C49850uwN c49850uwN5 = this.KWHzl;
                if (c49850uwN5 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN5 = null;
                }
                BizInstrument bizInstrumentAhwBna2 = c49850uwN5.AhwBna();
                quoteSymbol = bizInstrumentAhwBna2 != null ? bizInstrumentAhwBna2.getQuoteSymbol() : null;
            }
            if (quoteSymbol == null || (text2 = c55249xgQAkhnZx.newTab().setText(quoteSymbol)) == null) {
                text2 = c55249xgQAkhnZx.newTab().setText("");
                Intrinsics.checkNotNullExpressionValue(text2, "");
            }
            c55249xgQAkhnZx.addTab(text2);
            c55249xgQAkhnZx.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity());
            C49850uwN c49850uwN6 = this.KWHzl;
            if (c49850uwN6 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN6 = null;
            }
            if (c49850uwN6.fIwbmz()) {
                text = text2;
            }
            c55249xgQAkhnZx.selectTab(text);
        }
        C49850uwN c49850uwN7 = this.KWHzl;
        if (c49850uwN7 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN7 = null;
        }
        c49850uwN7.OLrzqt(fetchVPNInfo());
        C49850uwN c49850uwN8 = this.KWHzl;
        if (c49850uwN8 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN8 = null;
        }
        if (c49850uwN8.fARcdN()) {
            C49850uwN c49850uwN9 = this.KWHzl;
            if (c49850uwN9 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN9 = null;
            }
            strEZpvd = c49850uwN9.EZpvd();
        } else {
            strEZpvd = null;
        }
        AYXKKw(strEZpvd);
        OLrzqt(java.lang.Boolean.valueOf(this.valueOf));
        C49850uwN c49850uwN10 = this.KWHzl;
        if (c49850uwN10 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN10 = null;
        }
        C56109xwc<ResponseData<java.util.List<? extends AdjustLeverRequiredData>>> c56109xwcFetchVPNInfo = c49850uwN10.values().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcFetchVPNInfo.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.uwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49841uwE.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        }));
        C49850uwN c49850uwN11 = this.KWHzl;
        if (c49850uwN11 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN11 = null;
        }
        C56111xwe<java.util.List<LeverageInfo>> c56111xweValueOf = c49850uwN11.valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValueOf.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.uwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49841uwE.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C49850uwN c49850uwN12 = this.KWHzl;
        if (c49850uwN12 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN12 = null;
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = c49850uwN12.fetchVPNInfo().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Observer() { // from class: o.uwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49841uwE.copydefault((java.lang.Exception) obj);
            }
        });
        C49850uwN c49850uwN13 = this.KWHzl;
        if (c49850uwN13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49850uwN2 = c49850uwN13;
        }
        C56111xwe<java.util.ArrayList<LeverageReq>> c56111xweAkhnZx = c49850uwN2.AkhnZx();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweAkhnZx.observe(viewLifecycleOwner4, new Application(new Function1() { // from class: o.uwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49841uwE.copydefault(this.OLrzqt, (java.util.ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.uwE$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C49850uwN c49850uwN = C49841uwE.this.KWHzl;
            if (c49850uwN == null) {
                Intrinsics.gEmmrt("");
                c49850uwN = null;
            }
            c49850uwN.djBIcL();
        }
    }

    public static final Unit EZpvd(C49841uwE c49841uwE, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c49841uwE.isConnected(((LeverageInfo) list.get(0)).getLever());
            c49841uwE.djBIcL(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, ((LeverageInfo) list.get(0)).getLever(), false, null, false, 14, null));
            C49850uwN c49850uwN = c49841uwE.KWHzl;
            java.lang.String strEZpvd = null;
            C49850uwN c49850uwN2 = null;
            if (c49850uwN == null) {
                Intrinsics.gEmmrt("");
                c49850uwN = null;
            }
            if (c49850uwN.fARcdN()) {
                C49850uwN c49850uwN3 = c49841uwE.KWHzl;
                if (c49850uwN3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49850uwN2 = c49850uwN3;
                }
                strEZpvd = c49850uwN2.EZpvd();
            }
            c49841uwE.AYXKKw(strEZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C33134mqi.AEQbTJ(message);
        }
    }

    public static final Unit copydefault(C49841uwE c49841uwE, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c49841uwE.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just("").delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49841uwE.copydefault(this.copydefault, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uwM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49841uwE.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49841uwE.copydefault((java.lang.Throwable) obj);
            }
        };
        this.djBIcL = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49841uwE.KWHzl(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C49841uwE c49841uwE, java.lang.String str, java.lang.String str2) {
        C49850uwN c49850uwN = c49841uwE.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        c49850uwN.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49850uwN c49850uwN = this.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        c49850uwN.KWHzl(str);
    }

    @Override // o.InterfaceC49844uwH.TaskDescription
    public java.lang.String KWHzl() {
        int selectedTabPosition = AkhnZx().getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            C49850uwN c49850uwN = this.KWHzl;
            if (c49850uwN == null) {
                Intrinsics.gEmmrt("");
                c49850uwN = null;
            }
            BizInstrument bizInstrumentAhwBna = c49850uwN.AhwBna();
            if (bizInstrumentAhwBna != null) {
                return bizInstrumentAhwBna.getTradeSymbol();
            }
        } else {
            if (selectedTabPosition != 1) {
                return "";
            }
            java.lang.String str = this.AEQbTJ;
            if (str.length() != 0) {
                return str;
            }
            C49850uwN c49850uwN2 = this.KWHzl;
            if (c49850uwN2 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN2 = null;
            }
            BizInstrument bizInstrumentAhwBna2 = c49850uwN2.AhwBna();
            if (bizInstrumentAhwBna2 != null) {
                return bizInstrumentAhwBna2.getQuoteSymbol();
            }
        }
        return null;
    }

    @Override // o.InterfaceC49844uwH.TaskDescription
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            KWHzl(str, "", "", "", "");
            AkhnZx("");
            copydefault(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    @Override // o.InterfaceC49844uwH.TaskDescription
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        BizInstrument suggestedInstrument$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        java.lang.String tradeSymbol2;
        java.lang.String quoteSymbol2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            C49850uwN c49850uwN = null;
            if (interfaceC54581xNrOLrzqt != null) {
                C49850uwN c49850uwN2 = this.KWHzl;
                if (c49850uwN2 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN2 = null;
                }
                java.lang.String strAYXKKw = c49850uwN2.AYXKKw();
                C49850uwN c49850uwN3 = this.KWHzl;
                if (c49850uwN3 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN3 = null;
                }
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strAYXKKw, c49850uwN3.copydefault(), null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                C49850uwN c49850uwN4 = this.KWHzl;
                if (c49850uwN4 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN4 = null;
                }
                abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c49850uwN4.AYXKKw());
            } else {
                abstractC54531xLwOLrzqt = null;
            }
            C49850uwN c49850uwN5 = this.KWHzl;
            if (c49850uwN5 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN5 = null;
            }
            if (c49850uwN5.fJNWhG()) {
                C49850uwN c49850uwN6 = this.KWHzl;
                if (c49850uwN6 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN6 = null;
                }
                if (c49850uwN6.fARcdN()) {
                    java.lang.String strKWHzl = KWHzl();
                    C49850uwN c49850uwN7 = this.KWHzl;
                    if (c49850uwN7 == null) {
                        Intrinsics.gEmmrt("");
                        c49850uwN7 = null;
                    }
                    BizInstrument bizInstrumentAhwBna = c49850uwN7.AhwBna();
                    EZpvd((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ONJgbh), (java.lang.CharSequence) (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getTradeSymbol() : null)) ? copydefault(abstractC54531xLwOLrzqt, instFamily, str2) : OLrzqt(abstractC54531xLwOLrzqt, instFamily, suggestedInstrument$default, str2, this.AEQbTJ)));
                }
            } else if (str2.length() > 0 && str3.length() > 0) {
                java.lang.String strCopydefault = copydefault(abstractC54531xLwOLrzqt, instFamily, str2);
                java.lang.String strShowContent$fmtQuote$default = showContent$fmtQuote$default(abstractC54531xLwOLrzqt, instFamily, suggestedInstrument$default, str3, null, 16, null);
                EZpvd((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.ONJgbh), (java.lang.CharSequence) (strCopydefault + " " + C33070mpX.AYXKKw(C49511upt.Activity.giSNqX) + " " + strShowContent$fmtQuote$default));
            } else if (str2.length() > 0) {
                java.lang.String strCopydefault2 = copydefault(abstractC54531xLwOLrzqt, instFamily, str2);
                java.lang.String string = getString(C55688xof.Application.ONJgbh);
                Intrinsics.checkNotNullExpressionValue(string, "");
                EZpvd((java.lang.CharSequence) string, (java.lang.CharSequence) strCopydefault2);
            } else if (str3.length() > 0) {
                java.lang.String strShowContent$fmtQuote$default2 = showContent$fmtQuote$default(abstractC54531xLwOLrzqt, instFamily, suggestedInstrument$default, str3, null, 16, null);
                java.lang.String string2 = getString(C55688xof.Application.ONJgbh);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                EZpvd((java.lang.CharSequence) string2, (java.lang.CharSequence) strShowContent$fmtQuote$default2);
            } else {
                EZpvd("", "");
            }
            if (str4.length() > 0 && str5.length() > 0) {
                C49850uwN c49850uwN8 = this.KWHzl;
                if (c49850uwN8 == null) {
                    Intrinsics.gEmmrt("");
                    c49850uwN8 = null;
                }
                BizInstrument bizInstrumentAhwBna2 = c49850uwN8.AhwBna();
                if (bizInstrumentAhwBna2 == null || (tradeSymbol2 = bizInstrumentAhwBna2.getTradeSymbol()) == null) {
                    tradeSymbol2 = "";
                }
                java.lang.String strCopydefault3 = copydefault(this, abstractC54531xLwOLrzqt, instFamily, str4, tradeSymbol2);
                C49850uwN c49850uwN9 = this.KWHzl;
                if (c49850uwN9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49850uwN = c49850uwN9;
                }
                BizInstrument bizInstrumentAhwBna3 = c49850uwN.AhwBna();
                if (bizInstrumentAhwBna3 == null || (quoteSymbol2 = bizInstrumentAhwBna3.getQuoteSymbol()) == null) {
                    quoteSymbol2 = "";
                }
                java.lang.String strCopydefault4 = copydefault(this, abstractC54531xLwOLrzqt, instFamily, str5, quoteSymbol2);
                java.lang.String string3 = getString(C55688xof.Application.ORmwhf);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                OLrzqt(string3, strCopydefault3 + " " + getString(C55688xof.Application.component1) + " " + strCopydefault4);
                return;
            }
            if (str4.length() > 0) {
                C49850uwN c49850uwN10 = this.KWHzl;
                if (c49850uwN10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49850uwN = c49850uwN10;
                }
                BizInstrument bizInstrumentAhwBna4 = c49850uwN.AhwBna();
                if (bizInstrumentAhwBna4 == null || (tradeSymbol = bizInstrumentAhwBna4.getTradeSymbol()) == null) {
                    tradeSymbol = "";
                }
                java.lang.String strCopydefault5 = copydefault(this, abstractC54531xLwOLrzqt, instFamily, str4, tradeSymbol);
                java.lang.String string4 = getString(C55688xof.Application.ORmwhf);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                OLrzqt(string4, strCopydefault5);
                return;
            }
            if (str5.length() > 0) {
                C49850uwN c49850uwN11 = this.KWHzl;
                if (c49850uwN11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49850uwN = c49850uwN11;
                }
                BizInstrument bizInstrumentAhwBna5 = c49850uwN.AhwBna();
                if (bizInstrumentAhwBna5 == null || (quoteSymbol = bizInstrumentAhwBna5.getQuoteSymbol()) == null) {
                    quoteSymbol = "";
                }
                java.lang.String strCopydefault6 = copydefault(this, abstractC54531xLwOLrzqt, instFamily, str5, quoteSymbol);
                java.lang.String string5 = getString(C55688xof.Application.ORmwhf);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                OLrzqt(string5, strCopydefault6);
                return;
            }
            OLrzqt("", "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL2;
        java.lang.String safeString$default;
        if (abstractC54531xLw == null) {
            c54536xMLDjBIcL = null;
        } else {
            if (str == null) {
                str = "";
            }
            C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLw, str, null, 2, null);
            if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str2);
            }
        }
        if (c54536xMLDjBIcL != null) {
            c54536xMLDjBIcL.EZpvd("4");
        }
        return (c54536xMLDjBIcL == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) == null || (c54536xMLDjBIcL2 = c54536xMLFetchVPNInfo.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static /* synthetic */ java.lang.String showContent$fmtQuote$default(AbstractC54531xLw abstractC54531xLw, java.lang.String str, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showContent$fmtQuote");
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return OLrzqt(abstractC54531xLw, str, bizInstrument, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(AbstractC54531xLw abstractC54531xLw, java.lang.String str, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL2;
        java.lang.String safeString$default;
        if (abstractC54531xLw == null) {
            c54536xMLDjBIcL = null;
        } else {
            if (str == null) {
                str = "";
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                str3 = bizInstrument != null ? bizInstrument.getQuoteSymbol() : null;
            }
            C54571xNh c54571xNhAhwBna = abstractC54531xLw.AhwBna(str, str3);
            if (c54571xNhAhwBna != null) {
                c54536xMLDjBIcL = c54571xNhAhwBna.djBIcL(str2);
            }
        }
        if (c54536xMLDjBIcL != null) {
            c54536xMLDjBIcL.EZpvd("4");
        }
        return (c54536xMLDjBIcL == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) == null || (c54536xMLDjBIcL2 = c54536xMLFetchVPNInfo.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) ? "" : safeString$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(C49841uwE c49841uwE, AbstractC54531xLw abstractC54531xLw, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        C49850uwN c49850uwN = c49841uwE.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        if (c49850uwN.fJNWhG()) {
            C49850uwN c49850uwN2 = c49841uwE.KWHzl;
            if (c49850uwN2 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN2 = null;
            }
            if (c49850uwN2.fARcdN()) {
                return pTB.formatDownToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) str2), 4, null, 2, null) + " USD";
            }
        }
        C49850uwN c49850uwN3 = c49841uwE.KWHzl;
        if (c49850uwN3 == null) {
            Intrinsics.gEmmrt("");
            c49850uwN3 = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) c49850uwN3.AYXKKw(), (java.lang.Object) "MARGIN")) {
            xLD xld = abstractC54531xLw instanceof xLD ? (xLD) abstractC54531xLw : null;
            if (xld == null) {
                c54536xMLCopydefault = null;
            } else {
                if (str == null) {
                    str = "";
                }
                xMV xmvValueOf = xld.valueOf(str, str3);
                if (xmvValueOf != null) {
                    c54536xMLCopydefault = xmvValueOf.copydefault(str2);
                }
            }
        } else {
            xLL xll = abstractC54531xLw instanceof xLL ? (xLL) abstractC54531xLw : null;
            if (xll != null) {
                if (str == null) {
                    str = "";
                }
                xMV xmvValueOf2 = xll.valueOf(str, str3);
                if (xmvValueOf2 != null) {
                    c54536xMLCopydefault = xmvValueOf2.copydefault(str2);
                }
            }
        }
        if (c54536xMLCopydefault != null) {
            c54536xMLCopydefault.EZpvd("4");
        }
        return (c54536xMLCopydefault == null || (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) == null || (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final void EZpvd(C49841uwE c49841uwE, java.lang.String str) {
        if (str == null || str.length() == 0) {
            C49850uwN c49850uwN = c49841uwE.KWHzl;
            if (c49850uwN == null) {
                Intrinsics.gEmmrt("");
                c49850uwN = null;
            }
            if (c49850uwN.ejfBZ()) {
                java.lang.String string = c49841uwE.getString(C49511upt.Activity.ODWQjV);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c49841uwE.AkhnZx(string);
            } else {
                java.lang.String string2 = c49841uwE.getString(C49511upt.Activity.DXXBbs);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c49841uwE.AkhnZx(string2);
            }
        } else {
            c49841uwE.AkhnZx(str);
        }
        c49841uwE.EZpvd(false);
    }

    public static final void AEQbTJ(C49841uwE c49841uwE, java.lang.String str) {
        c49841uwE.AkhnZx(str);
        c49841uwE.copydefault(false);
    }

    public static final void KWHzl(C49841uwE c49841uwE, java.lang.String str, java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        c49841uwE.copydefault(true);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String str3 = "";
        AbstractC54531xLw abstractC54531xLwOLrzqt = null;
        C49850uwN c49850uwN = null;
        if (interfaceC54581xNrOLrzqt != null) {
            C49850uwN c49850uwN2 = c49841uwE.KWHzl;
            if (c49850uwN2 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN2 = null;
            }
            java.lang.String strAYXKKw = c49850uwN2.AYXKKw();
            C49850uwN c49850uwN3 = c49841uwE.KWHzl;
            if (c49850uwN3 == null) {
                Intrinsics.gEmmrt("");
                c49850uwN3 = null;
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strAYXKKw, c49850uwN3.copydefault(), null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            C49850uwN c49850uwN4 = c49841uwE.KWHzl;
            if (c49850uwN4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c49850uwN = c49850uwN4;
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c49850uwN.AYXKKw());
        }
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            if (suggestedInstrument$default != null && (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) != null) {
                str3 = tradeSymbol;
            }
            EZpvd(abstractC54531xLwOLrzqt, instFamily, c49841uwE, str, str3);
            return;
        }
        if (str2.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "0")) {
            if (suggestedInstrument$default != null && (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) != null) {
                str3 = quoteSymbol;
            }
            EZpvd(abstractC54531xLwOLrzqt, instFamily, c49841uwE, str2, str3);
            return;
        }
        c49841uwE.AkhnZx("");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(AbstractC54531xLw abstractC54531xLw, java.lang.String str, C49841uwE c49841uwE, java.lang.String str2, java.lang.String str3) {
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        double dAEQbTJ = C33129mqd.AEQbTJ(str2);
        C49850uwN c49850uwN = null;
        if (abstractC54531xLw == null) {
            c54536xMLCopydefault = null;
        } else {
            if (str == null) {
                str = "";
            }
            xMV xmvAYXKKw = abstractC54531xLw.AYXKKw(str, str3);
            if (xmvAYXKKw != null) {
                c54536xMLCopydefault = xmvAYXKKw.copydefault(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.abs(dAEQbTJ))));
            }
        }
        java.lang.String strGEmmrt = c54536xMLCopydefault != null ? c54536xMLCopydefault.gEmmrt() : null;
        if (c54536xMLCopydefault == null || (c54536xMLIsConnected = c54536xMLCopydefault.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
            safeString$default = "";
        }
        C49850uwN c49850uwN2 = c49841uwE.KWHzl;
        if (c49850uwN2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49850uwN = c49850uwN2;
        }
        if (c49850uwN.fARcdN()) {
            if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
                int i = C49511upt.Activity.OuxcSI;
                java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
                Intrinsics.copydefault(mapGEmmrt, "");
                c49841uwE.AkhnZx(C33069mpW.copydefault(c49841uwE, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt));
                return;
            }
            int i2 = C49511upt.Activity.ffGIBT;
            java.util.Map mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
            Intrinsics.copydefault(mapGEmmrt2, "");
            c49841uwE.AkhnZx(C33069mpW.copydefault(c49841uwE, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt2));
            return;
        }
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            int i3 = C49511upt.Activity.fvQaOB;
            java.util.Map mapGEmmrt3 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
            Intrinsics.copydefault(mapGEmmrt3, "");
            c49841uwE.AkhnZx(C33069mpW.copydefault(c49841uwE, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt3));
            return;
        }
        int i4 = C49511upt.Activity.DCUTEI;
        java.util.Map mapGEmmrt4 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
        Intrinsics.copydefault(mapGEmmrt4, "");
        c49841uwE.AkhnZx(C33069mpW.copydefault(c49841uwE, i4, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt4));
    }

    @Override // o.InterfaceC49844uwH.TaskDescription
    public void EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            if (z) {
                EZpvd(this, str2);
            } else if (str2 != null && str2.length() != 0) {
                AEQbTJ(this, str2);
            } else {
                KWHzl(this, str3, str4);
            }
        }
    }

    @Override // o.InterfaceC49844uwH.TaskDescription
    public void AEQbTJ(boolean z) {
        Function2<java.lang.Boolean, java.lang.String, Unit> function2EjfBZ;
        dismissAllowingStateLoss();
        if (!z || (function2EjfBZ = ejfBZ()) == null) {
            return;
        }
        function2EjfBZ.invoke(java.lang.Boolean.TRUE, fetchVPNInfo());
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C49850uwN c49850uwN = this.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        c49850uwN.KWHzl();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C49850uwN c49850uwN = this.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        c49850uwN.OLrzqt();
    }

    @Override // o.AbstractC49732uuB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C49850uwN c49850uwN = this.KWHzl;
        if (c49850uwN == null) {
            Intrinsics.gEmmrt("");
            c49850uwN = null;
        }
        c49850uwN.AuCTel();
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit EZpvd(C49841uwE c49841uwE, ResponseData responseData) {
        AdjustLeverRequiredData adjustLeverRequiredData;
        Intrinsics.checkNotNullParameter(responseData, "");
        C49850uwN c49850uwN = null;
        boolean z = false;
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            adjustLeverRequiredData = (AdjustLeverRequiredData) ((java.util.List) data).get(0);
        } else {
            adjustLeverRequiredData = null;
        }
        C49850uwN c49850uwN2 = c49841uwE.KWHzl;
        if (c49850uwN2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49850uwN = c49850uwN2;
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            z = true;
        }
        c49850uwN.AEQbTJ(z, adjustLeverRequiredData, new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null));
        return Unit.INSTANCE;
    }
}
