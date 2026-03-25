package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.market.search.features.kline.monitor.MonitorNavSearchRootFragment$onSetupBottomAreaView$1$1;
import com.okinc.market.search.features.navigation.selection.domain.SelectedStatusMode;
import com.okinc.market.search.features.navigation.selection.ui.model.SelectionNavSearchSubPage;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC54581xNr;
import o.qBJ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class qBJ extends qBN {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C42906rfJ AEQbTJ;
    public final int gEmmrt = qZH.Activity.getNewProxyInstance;
    public final SelectedStatusMode valueOf = SelectedStatusMode.DISABLE_PRE_SELECTED;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public int EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public SelectedStatusMode bn_() {
        return this.valueOf;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qBJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final qBJ EZpvd(@NotNull java.util.List<java.lang.String> list, kotlin.Pair<java.lang.String, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(list, "");
            qBJ qbj = new qBJ();
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("key.pre_selected_instrument_id_list", list.toArray(new java.lang.String[0]));
            pairArr[1] = C56390yDp.OLrzqt("trade_type", pair != null ? pair.getFirst() : null);
            pairArr[2] = C56390yDp.OLrzqt("instId", pair != null ? pair.getSecond() : null);
            return (qBJ) jSA.EZpvd(qbj, pairArr);
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<java.lang.String> list, kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull final Function1<? super java.util.List<? extends BizInstrument>, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            qBJ qbjEZpvd = EZpvd(list, pair);
            jSA.KWHzl(qbjEZpvd, fragmentManager, "MonitorNavSearchRootFragment", new Function2() { // from class: o.qBM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return qBJ.Activity.copydefault(function1, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            qbjEZpvd.show(fragmentManager, "MonitorNavSearchRootFragment");
        }

        public static final java.lang.CharSequence copydefault(BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            return bizInstrument.getInstId();
        }

        public static final Unit copydefault(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
            java.lang.Object objM7377constructorimpl;
            java.lang.Object serializable;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            try {
                Result.Application application = Result.Companion;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("result", java.util.ArrayList.class);
                } else {
                    serializable = (java.util.ArrayList) bundle.getSerializable("result");
                }
                objM7377constructorimpl = Result.m7377constructorimpl(serializable);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("BundleExt", "getSerializableCompat error", thM7380exceptionOrNullimpl);
                thM7380exceptionOrNullimpl.printStackTrace();
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) ((java.io.Serializable) objM7377constructorimpl);
            C40375qTn.AEQbTJ.KWHzl("MonitorNavSearchRootFragment", "Instruments selected: " + (arrayList != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1() { // from class: o.qBL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qBJ.Activity.copydefault((BizInstrument) obj);
                }
            }, 31, null) : null));
            java.util.List listAxsJAYsNCnLh = arrayList != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList) : null;
            if (listAxsJAYsNCnLh == null) {
                listAxsJAYsNCnLh = yDY.AhwBna();
            }
            function1.invoke(listAxsJAYsNCnLh);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC40285qQe, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl();
    }

    public final void KWHzl() {
        InterfaceC54577xNn interfaceC54577xNnOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default;
        ViewPager2 viewPager2;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("trade_type") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("instId") : null;
        SelectionNavSearchSubPage selectionNavSearchSubPage = (!Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "FUTURES")) ? SelectionNavSearchSubPage.FUTURES : SelectionNavSearchSubPage.SPOT;
        int iEZpvd = super.AkhnZx().EZpvd(selectionNavSearchSubPage);
        C42821rde c42821rdeFetchVPNInfo = super.fetchVPNInfo();
        if (c42821rdeFetchVPNInfo != null && (viewPager2 = c42821rdeFetchVPNInfo.valueOf) != null) {
            viewPager2.setCurrentItem(iEZpvd, false);
        }
        if (string == null || string2 == null || (interfaceC54577xNnOLrzqt = pWO.OLrzqt()) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNnOLrzqt.copydefault()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, string, string2, null, null, 12, null)) == null) {
            return;
        }
        DbNXlk().AEQbTJ(yED.AEQbTJ(suggestedInstrument$default));
    }

    @Override // o.AbstractC40285qQe
    public void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        super.OLrzqt(frameLayout);
    }

    @Override // o.AbstractC40285qQe
    public void EZpvd(@NotNull android.widget.FrameLayout frameLayout) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(frameLayout, "");
        C42906rfJ c42906rfJAEQbTJ = C42906rfJ.AEQbTJ(getLayoutInflater(), frameLayout, true);
        this.AEQbTJ = c42906rfJAEQbTJ;
        if (c42906rfJAEQbTJ == null || (c52794wYp = c42906rfJAEQbTJ.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    @Override // o.AbstractC40285qQe
    public void copydefault(@NotNull java.util.Set<? extends BizInstrument> set) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(set, "");
        C42906rfJ c42906rfJ = this.AEQbTJ;
        if (c42906rfJ != null && (c52794wYp2 = c42906rfJ.EZpvd) != null) {
            if (set.isEmpty()) {
                strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.dNCPSb);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.dNCPSb) + "(" + set.size() + ")";
            }
            c52794wYp2.setText(strAYXKKw);
        }
        C42906rfJ c42906rfJ2 = this.AEQbTJ;
        if (c42906rfJ2 == null || (c52794wYp = c42906rfJ2.EZpvd) == null) {
            return;
        }
        c52794wYp.setEnabled(!set.isEmpty());
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ qBJ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, qBJ qbj) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = qbj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new MonitorNavSearchRootFragment$onSetupBottomAreaView$1$1(this.EZpvd, null), 3, null);
            }
        }
    }
}
