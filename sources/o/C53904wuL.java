package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.itembinder.dca.DcaDealDetailType;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.GridTransDetailsPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wuL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53904wuL extends AbstractC49945uyC<uNV, GridTransDetailsPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final int OLrzqt = C48033uCm.Activity.zuWLRA;
    public final C59534zip KWHzl = new C59534zip();

    /* JADX INFO: renamed from: o.wuL$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.wuL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wuL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C53904wuL newInstance$default(Activity activity, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return activity.AEQbTJ(arrayList, str, str2);
        }

        public final C53904wuL AEQbTJ(@NotNull java.util.ArrayList<TransDetailsData> arrayList, java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C53904wuL c53904wuL = new C53904wuL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("grid_trans_detail_key", arrayList);
            bundle.putString("detail_title_key", str);
            bundle.putString("dca_trans_detail_cycleId", str2);
            c53904wuL.setArguments(bundle);
            return c53904wuL;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        fJNWhG();
        ejfBZ();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (strAYXKKw = arguments.getString("detail_title_key")) == null) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowTitleEnabled);
        }
        wxq.setTitle(strAYXKKw);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    private final void fARcdN() {
        java.lang.String string;
        GridTransDetailsPresenter gridTransDetailsPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("dca_trans_detail_cycleId")) == null) {
            string = "";
        }
        gridTransDetailsPresenterOLrzqt.AEQbTJ(string);
        GridTransDetailsPresenter gridTransDetailsPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        gridTransDetailsPresenterOLrzqt2.OLrzqt(arguments2 != null ? arguments2.getParcelableArrayList("grid_trans_detail_key") : null);
    }

    private final void fJNWhG() {
        values().copydefault.setLayoutManager(new LinearLayoutManager(getContext()));
        this.KWHzl.register(C57637ymF.class, new C57634ymC(new Function0() { // from class: o.wuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53904wuL.isConnected();
            }
        }));
        this.KWHzl.register(TransDetailsData.class, new wOH(getContext(), new Function2() { // from class: o.wuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53904wuL.AEQbTJ(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        this.KWHzl.register(DcaDealDetailType.class, new wOW());
        values().copydefault.setAdapter(this.KWHzl);
        C59534zip c59534zip = this.KWHzl;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.util.ArrayList<TransDetailsData> arrayListCopydefault = OLrzqt().copydefault();
        if (arrayListCopydefault == null) {
            arrayListCopydefault = new java.util.ArrayList<>();
        }
        C57636ymE.refreshDataOrEmpty$default(c59534zip, fragmentActivityRequireActivity, arrayListCopydefault, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0.0f, 8, (java.lang.Object) null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit isConnected() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C53904wuL c53904wuL, final java.lang.String str, final java.lang.String str2) {
        android.content.Context contextRequireContext = c53904wuL.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.Hx));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.DVmcag), new View.OnClickListener() { // from class: o.wuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53904wuL.EZpvd(this.EZpvd, str, str2, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfwDlxl), new View.OnClickListener() { // from class: o.wuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53904wuL.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C53904wuL c53904wuL, java.lang.String str, java.lang.String str2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c53904wuL.OLrzqt().EZpvd(str, str2);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void ejfBZ() {
        TradeLiveData<StrategyResponse> tradeLiveDataAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53904wuL.KWHzl(this.copydefault, (StrategyResponse) obj);
            }
        }));
        TradeLiveData<java.util.List<TransDetailsData>> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53904wuL.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(C53904wuL c53904wuL, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DcMfJKsfEqpH, 0, 1, (java.lang.Object) null);
        c53904wuL.OLrzqt().AEQbTJ(strategyResponse.getAlgoId(), c53904wuL.OLrzqt().OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53904wuL c53904wuL, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33064mpR.OLrzqt(c53904wuL.KWHzl, (java.util.List<? extends java.lang.Object>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wuL$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C53904wuL EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53904wuL c53904wuL) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c53904wuL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
