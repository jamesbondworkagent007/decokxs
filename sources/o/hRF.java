package o;

import androidx.core.os.BundleCompat;
import androidx.lifecycle.ViewModelProvider;
import com.github.mikephil.charting.data.Entry;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.KLineTokenParam;
import com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hRF extends AbstractC21846hOm<hAQ> implements KLineSimpleView.Activity {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public KLineTokenParam AEQbTJ;
    public hRW EZpvd;
    public final InterfaceC56387yDm djBIcL = C31200lpY.copydefault(this);
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hRO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return hRF.KWHzl(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull hRW hrw) {
        Intrinsics.checkNotNullParameter(hrw, "");
        this.EZpvd = hrw;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hRF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final hRF AEQbTJ(@NotNull java.lang.String str, @NotNull KLineTokenParam kLineTokenParam) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(kLineTokenParam, "");
            hRF hrf = new hRF();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("token_base", kLineTokenParam);
            hrf.setArguments(bundle);
            return hrf;
        }
    }

    private final java.lang.String AEQbTJ() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public final C22590hiI OLrzqt() {
        return (C22590hiI) this.KWHzl.getValue();
    }

    public static final C22590hiI KWHzl(hRF hrf) {
        return (C22590hiI) new ViewModelProvider(hrf).get(C22590hiI.class);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hAQ KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAQ haqOLrzqt = hAQ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(haqOLrzqt, "");
        return haqOLrzqt;
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? (KLineTokenParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", KLineTokenParam.class)) : null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAQ haq, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(haq, "");
        haq.copydefault.setOnKlineTouchCallback(this);
        KLineSimpleView kLineSimpleView = haq.copydefault;
        java.lang.String strAEQbTJ = AEQbTJ();
        KLineTokenParam kLineTokenParam = this.AEQbTJ;
        kLineSimpleView.AEQbTJ(strAEQbTJ, kLineTokenParam != null ? kLineTokenParam.isCoinPair() : false);
    }

    @Override // o.AbstractC21846hOm
    public void EZpvd() {
        java.lang.String strOLrzqt;
        KLineSimpleView kLineSimpleView;
        super.EZpvd();
        hAQ haqAX_ = aX_();
        if (haqAX_ == null || (kLineSimpleView = haqAX_.copydefault) == null || (strOLrzqt = kLineSimpleView.OLrzqt()) == null) {
            strOLrzqt = "1";
        }
        EZpvd(strOLrzqt);
    }

    @Override // com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView.Activity
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        hRW hrw = this.EZpvd;
        if (hrw != null) {
            hrw.AEQbTJ(str, str2, z);
        }
    }

    @Override // com.okinc.business.dexui.main.market.detail.widget.KLineSimpleView.Activity
    public void EZpvd(@NotNull java.lang.String str) {
        java.lang.String fromChainId;
        AbstractC58185ywX<Triple<KLineSimpleView.KlineState, CandleResultBean, Triple<java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>>> abstractC58185ywXAEQbTJ;
        KLineSimpleView kLineSimpleView;
        java.lang.String strOLrzqt;
        java.lang.String fromTokenAddress;
        KLineSimpleView kLineSimpleView2;
        java.lang.String strOLrzqt2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        hRW hrw = this.EZpvd;
        if (hrw != null) {
            hrw.EZpvd(str);
        }
        KLineTokenParam kLineTokenParam = this.AEQbTJ;
        if (kLineTokenParam != null) {
            java.lang.String str3 = "1";
            if (kLineTokenParam.isCoinPair()) {
                C22590hiI c22590hiIOLrzqt = OLrzqt();
                java.lang.String strAEQbTJ = AEQbTJ();
                java.lang.String fromChainId2 = kLineTokenParam.getFromChainId();
                java.lang.String fromTokenAddress2 = kLineTokenParam.getFromTokenAddress();
                java.lang.String toChainId = kLineTokenParam.getToChainId();
                java.lang.String toTokenAddress = kLineTokenParam.getToTokenAddress();
                hAQ haqAX_ = aX_();
                abstractC58185ywXAEQbTJ = c22590hiIOLrzqt.KWHzl(strAEQbTJ, fromChainId2, fromTokenAddress2, toChainId, toTokenAddress, (haqAX_ == null || (kLineSimpleView2 = haqAX_.copydefault) == null || (strOLrzqt2 = kLineSimpleView2.OLrzqt()) == null) ? "1" : strOLrzqt2);
            } else {
                C22590hiI c22590hiIOLrzqt2 = OLrzqt();
                java.lang.String strAEQbTJ2 = AEQbTJ();
                KLineTokenParam kLineTokenParam2 = this.AEQbTJ;
                if (kLineTokenParam2 == null || (fromChainId = kLineTokenParam2.getFromChainId()) == null) {
                    fromChainId = "";
                }
                KLineTokenParam kLineTokenParam3 = this.AEQbTJ;
                if (kLineTokenParam3 != null && (fromTokenAddress = kLineTokenParam3.getFromTokenAddress()) != null) {
                    str2 = fromTokenAddress;
                }
                hAQ haqAX_2 = aX_();
                if (haqAX_2 != null && (kLineSimpleView = haqAX_2.copydefault) != null && (strOLrzqt = kLineSimpleView.OLrzqt()) != null) {
                    str3 = strOLrzqt;
                }
                abstractC58185ywXAEQbTJ = c22590hiIOLrzqt2.AEQbTJ(strAEQbTJ2, fromChainId, str2, str3);
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
            final Function1 function1 = new Function1() { // from class: o.hRJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hRF.EZpvd(this.EZpvd, (Triple) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hRI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    hRF.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hRH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hRF.EZpvd(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hRG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    hRF.copydefault(function12, obj);
                }
            });
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(hRF hrf, Triple triple) {
        KLineSimpleView kLineSimpleView;
        hRW hrw = hrf.EZpvd;
        if (hrw != null) {
            hrw.AEQbTJ((CandleResultBean) triple.getSecond());
        }
        hAQ haqAX_ = hrf.aX_();
        if (haqAX_ != null && (kLineSimpleView = haqAX_.copydefault) != null) {
            kLineSimpleView.EZpvd((KLineSimpleView.KlineState) triple.getFirst(), ((CandleResultBean) triple.getSecond()).getMaxPrice(), ((CandleResultBean) triple.getSecond()).getMinPrice(), (Triple<? extends java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>) triple.getThird());
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hrf, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(hRF hrf, java.lang.Throwable th) {
        KLineSimpleView kLineSimpleView;
        hRW hrw = hrf.EZpvd;
        if (hrw != null) {
            hrw.AEQbTJ(new CandleResultBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.util.List) null, 1023, (DefaultConstructorMarker) null));
        }
        hAQ haqAX_ = hrf.aX_();
        if (haqAX_ != null && (kLineSimpleView = haqAX_.copydefault) != null) {
            kLineSimpleView.EZpvd(KLineSimpleView.KlineState.FAIL, "", "", (Triple<? extends java.util.ArrayList<Entry>, kotlin.Pair<java.lang.Float, java.lang.Float>, kotlin.Pair<java.lang.String, java.lang.String>>) null);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hrf, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
