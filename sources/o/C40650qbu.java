package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.okmarket.ui.market.quote.WrapContentGridLayoutManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40650qbu extends AbstractC49393unh {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C42640raI KWHzl;

    /* JADX INFO: renamed from: o.qbu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qbu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull DexPeriodEnum dexPeriodEnum) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverDexFilterBottomSheet", "show selectedPeriod: " + dexPeriodEnum);
            ((C40650qbu) jSA.EZpvd(new C40650qbu(), C56390yDp.OLrzqt("select_target", dexPeriodEnum.name()))).show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.hrjNmC));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        java.lang.String string = requireArguments().getString("select_target", "ONE_DAY");
        DexPeriodEnum.StateListAnimator stateListAnimator = DexPeriodEnum.Companion;
        Intrinsics.copydefault((java.lang.Object) string);
        C40648qbs c40648qbs = new C40648qbs(stateListAnimator.KWHzl(string));
        C42640raI c42640raIOLrzqt = C42640raI.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        c42640raIOLrzqt.KWHzl.setLayoutManager(new WrapContentGridLayoutManager(getContext(), 3));
        c42640raIOLrzqt.KWHzl.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42640raIOLrzqt.KWHzl.setAdapter(c40648qbs);
        C52794wYp c52794wYp = c42640raIOLrzqt.copydefault;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, c40648qbs));
        this.KWHzl = c42640raIOLrzqt;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.qbu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C40650qbu KWHzl;
        public final /* synthetic */ C40648qbs OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40650qbu c40650qbu, C40648qbs c40648qbs) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c40650qbu;
            this.OLrzqt = c40648qbs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C40650qbu c40650qbu = this.KWHzl;
                java.lang.String name = C40650qbu.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                FragmentKt.setFragmentResult(c40650qbu, name, BundleKt.bundleOf(C56390yDp.OLrzqt("select_target", this.OLrzqt.KWHzl().name())));
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.qbu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C40650qbu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C40650qbu c40650qbu) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c40650qbu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
