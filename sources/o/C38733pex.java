package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38733pex extends AbstractC32998moE {
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public AbstractC32996moC OLrzqt;
    public C54822xWp copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.pex$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.QKVWgx;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.pex$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pex.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C38733pex copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C38733pex c38733pex = new C38733pex();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(oLT.gEmmrt(), str);
            bundle.putString(oLT.valueOf(), str2);
            c38733pex.setArguments(bundle);
            return c38733pex;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pXB.registerTradeFragmentTrack$default(pXB.EZpvd, this, "KlineBotFragment", new kotlin.Pair[0], null, 4, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C54822xWp c54822xWp;
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        AbstractC32996moC abstractC32996moCEZpvd = null;
        this.EZpvd = arguments != null ? arguments.getString(oLT.gEmmrt()) : null;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getString(oLT.valueOf()) : null;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
        } else {
            c54822xWp = null;
        }
        Intrinsics.copydefault(c54822xWp);
        this.copydefault = c54822xWp;
        if (c54822xWp == null) {
            Intrinsics.gEmmrt("");
            c54822xWp = null;
        }
        c54822xWp.KWHzl().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.peD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38733pex.EZpvd(this.OLrzqt, (MarketCoinInfo) obj);
            }
        }));
        uBU ubu = (uBU) C43251rlk.OLrzqt(uBU.class);
        if (ubu != null) {
            java.lang.String str = this.EZpvd;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.KWHzl;
            abstractC32996moCEZpvd = ubu.EZpvd(str, str2 != null ? str2 : "");
        }
        this.OLrzqt = abstractC32996moCEZpvd;
        if (abstractC32996moCEZpvd != null) {
            getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.HJWChPHhYHK, abstractC32996moCEZpvd, abstractC32996moCEZpvd.getClass().getName()).commitAllowingStateLoss();
        }
        view.post(new java.lang.Runnable() { // from class: o.peE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C38733pex.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final Unit EZpvd(C38733pex c38733pex, MarketCoinInfo marketCoinInfo) {
        uBU ubu;
        if (!Intrinsics.EZpvd((java.lang.Object) c38733pex.EZpvd, (java.lang.Object) marketCoinInfo.getInstrumentId()) || !Intrinsics.EZpvd((java.lang.Object) c38733pex.KWHzl, (java.lang.Object) marketCoinInfo.getInstrumentType())) {
            c38733pex.EZpvd = marketCoinInfo.getInstrumentId();
            c38733pex.KWHzl = marketCoinInfo.getInstrumentType();
            AbstractC32996moC abstractC32996moC = c38733pex.OLrzqt;
            if (abstractC32996moC != null && (ubu = (uBU) C43251rlk.OLrzqt(uBU.class)) != null) {
                java.lang.String str = c38733pex.EZpvd;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = c38733pex.KWHzl;
                ubu.KWHzl(abstractC32996moC, str, str2 != null ? str2 : "");
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C38733pex c38733pex) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38733pex, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }
}
