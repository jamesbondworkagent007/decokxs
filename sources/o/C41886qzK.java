package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.market.search.features.kline.compare.CompareNavSearchRootFragment$onSetupBottomAreaView$1$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C41886qzK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41886qzK extends AbstractC41889qzN {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C42906rfJ EZpvd;
    public final int OLrzqt = qZH.Activity.iwGUEr;
    public C41893qzR copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40285qQe
    public int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.qzK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qzK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C41886qzK EZpvd(@NotNull java.util.List<? extends BizInstrument> list) {
            java.lang.String instId;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(list, "");
            C41886qzK c41886qzK = new C41886qzK();
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("key.selected_instruments", new java.util.ArrayList(list));
            BizInstrument bizInstrument = (BizInstrument) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (bizInstrument != null && (instId = bizInstrument.getInstId()) != null) {
                str = instId;
            }
            pairArr[1] = C56390yDp.OLrzqt("key.filter_out_instrument_id_list", C56402yEa.EZpvd(str).toArray(new java.lang.String[0]));
            return (C41886qzK) jSA.EZpvd(c41886qzK, pairArr);
        }

        public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<? extends BizInstrument> list, @NotNull final Function1<? super java.util.List<? extends BizInstrument>, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C41886qzK c41886qzKEZpvd = EZpvd(list);
            jSA.KWHzl(c41886qzKEZpvd, fragmentManager, "CompareNavSearchRootFragment", new Function2() { // from class: o.qzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C41886qzK.Activity.AEQbTJ(function1, (java.lang.String) obj, (android.os.Bundle) obj2);
                }
            });
            c41886qzKEZpvd.show(fragmentManager, "CompareNavSearchRootFragment");
        }

        public static final Unit AEQbTJ(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
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
        java.lang.Object objM7377constructorimpl;
        java.lang.Object serializable;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                Result.Application application = Result.Companion;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("key.selected_instruments", java.util.ArrayList.class);
                } else {
                    serializable = (java.util.ArrayList) arguments.getSerializable("key.selected_instruments");
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
            if (arrayList != null) {
                DbNXlk().AEQbTJ(CollectionsKt___CollectionsKt.OqFWZa(arrayList));
            }
        }
        DbNXlk().KWHzl(10);
    }

    @Override // o.AbstractC40285qQe
    public void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        android.content.Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C41893qzR c41893qzR = new C41893qzR(context, null, 0, 6, null);
        frameLayout.addView(c41893qzR);
        c41893qzR.setListener(new Application());
        this.copydefault = c41893qzR;
    }

    /* JADX INFO: renamed from: o.qzK$Application */
    public static final class Application implements InterfaceC41894qzS {
        public Application() {
        }

        @Override // o.InterfaceC41894qzS
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C40375qTn.AEQbTJ.KWHzl(C41886qzK.this.getTag(), "Search keyword changed: " + str);
            C41886qzK.this.AEQbTJ(str);
            C41886qzK.this.OLrzqt(str);
            C41886qzK.this.copydefault(str);
        }

        @Override // o.InterfaceC41894qzS
        public void AEQbTJ(BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(bizInstrument, "");
            C41886qzK.this.DbNXlk().EZpvd(bizInstrument);
        }
    }

    @Override // o.AbstractC40285qQe
    public void EZpvd(@NotNull android.widget.FrameLayout frameLayout) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        Intrinsics.checkNotNullParameter(frameLayout, "");
        C42906rfJ c42906rfJAEQbTJ = C42906rfJ.AEQbTJ(getLayoutInflater(), frameLayout, true);
        this.EZpvd = c42906rfJAEQbTJ;
        if (c42906rfJAEQbTJ != null && (c52794wYp2 = c42906rfJAEQbTJ.EZpvd) != null) {
            c52794wYp2.setText(qZH.PendingIntent.hDKMBd);
        }
        C42906rfJ c42906rfJ = this.EZpvd;
        if (c42906rfJ == null || (c52794wYp = c42906rfJ.EZpvd) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    @Override // o.AbstractC40285qQe
    public void copydefault(@NotNull java.util.Set<? extends BizInstrument> set) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(set, "");
        C41893qzR c41893qzR = this.copydefault;
        if (c41893qzR != null) {
            c41893qzR.AEQbTJ(set);
        }
        C42906rfJ c42906rfJ = this.EZpvd;
        if (c42906rfJ == null || (c52794wYp = c42906rfJ.EZpvd) == null) {
            return;
        }
        c52794wYp.setEnabled(set.size() > 1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.qzK$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C41886qzK KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C41886qzK c41886qzK) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c41886qzK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), null, null, new CompareNavSearchRootFragment$onSetupBottomAreaView$1$1(this.KWHzl, null), 3, null);
            }
        }
    }
}
