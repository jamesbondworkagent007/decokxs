package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.market_place.common.BotSelectedItemBinder;
import com.okinc.unify_trade.bot.data.BotSelectedData;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51353vlS extends AbstractC49945uyC<AbstractC48383uPl, EmptyPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public Function0<Unit> OLrzqt;
    public Function1<? super java.lang.String, Unit> gEmmrt;
    public final int copydefault = C48033uCm.Activity.WS;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vlU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51353vlS.fJNWhG();
        }
    });
    public final java.util.ArrayList<java.lang.Object> AYXKKw = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX INFO: renamed from: o.vlS$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vlS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final C43316rmw ejfBZ() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw fJNWhG() {
        return new C43316rmw();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wPQ.OLrzqt(view);
        fIwbmz();
        fARcdN();
        isConnected();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    private final void fIwbmz() {
        ejfBZ().register(java.lang.String.class, new C51360vlZ());
        ejfBZ().register(BotSelectedData.class, new BotSelectedItemBinder(new Function1() { // from class: o.vlQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51353vlS.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        }));
        values().KWHzl.addItemDecoration(new C51354vlT(this.AYXKKw.size()));
        values().KWHzl.setAdapter(ejfBZ());
        values().KWHzl.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public static final Unit AEQbTJ(C51353vlS c51353vlS, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51353vlS.dismissAllowingStateLoss();
        Function1<? super java.lang.String, Unit> function1 = c51353vlS.gEmmrt;
        if (function1 == null) {
            Intrinsics.gEmmrt("");
            function1 = null;
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        C33064mpR.OLrzqt(ejfBZ(), (java.util.List<? extends java.lang.Object>) this.AYXKKw);
    }

    public final void EZpvd(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw.clear();
        this.AYXKKw.addAll(list);
        this.gEmmrt = function1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        C32866mlf.onEvent$default("BotPlaceOrder_Sheet_BotList_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
