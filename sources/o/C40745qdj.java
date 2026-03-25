package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40745qdj extends AbstractC49393unh {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C42644raM AEQbTJ;

    /* JADX INFO: renamed from: o.qdj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qdj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<FuturesUnitVo> list, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
            Intrinsics.checkNotNullParameter(futuresUnitVo, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverFuturesFilterBottomSheet", "show futuresUnitVoList: " + list);
            ((C40745qdj) jSA.EZpvd(new C40745qdj(), C56390yDp.OLrzqt("list", new java.util.ArrayList(list)), C56390yDp.OLrzqt("key.selected_type", java.lang.Integer.valueOf(futuresTypeEnum.ordinal())), C56390yDp.OLrzqt("key.selected_unit", futuresUnitVo))).show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.KWHzl().setVisibility(0);
        wxq.setStyle(1);
        java.lang.String string = getString(qZH.PendingIntent.fhUrPt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.qdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C40745qdj.EZpvd(this.copydefault, view);
            }
        });
        wxq.AEQbTJ().setVisibility(8);
    }

    public static final void EZpvd(C40745qdj c40745qdj, android.view.View view) {
        c40745qdj.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        FuturesTypeEnum futuresTypeEnum;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            dismissAllowingStateLoss();
            return;
        }
        int i = arguments.getInt("key.selected_type");
        FuturesTypeEnum[] futuresTypeEnumArrValues = FuturesTypeEnum.values();
        int length = futuresTypeEnumArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                futuresTypeEnum = null;
                break;
            }
            futuresTypeEnum = futuresTypeEnumArrValues[i2];
            if (futuresTypeEnum.ordinal() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (futuresTypeEnum == null) {
            dismissAllowingStateLoss();
            return;
        }
        FuturesUnitVo futuresUnitVo = (FuturesUnitVo) BundleCompat.getParcelable(arguments, "key.selected_unit", FuturesUnitVo.class);
        if (futuresUnitVo == null) {
            dismissAllowingStateLoss();
            return;
        }
        java.util.ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "list", FuturesUnitVo.class);
        if (parcelableArrayList == null) {
            dismissAllowingStateLoss();
            return;
        }
        final C42644raM c42644raMEZpvd = C42644raM.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        final C40744qdi c40744qdi = new C40744qdi(parcelableArrayList, futuresUnitVo);
        final Function1 function1 = new Function1() { // from class: o.qdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40745qdj.EZpvd(c42644raMEZpvd, c40744qdi, (FuturesTypeEnum) obj);
            }
        };
        function1.invoke(futuresTypeEnum);
        java.util.List listGHZMYf = yDV.gHZMYf(FuturesTypeEnum.values());
        listGHZMYf.remove(FuturesTypeEnum.PERPETUAL_AND_EXPIRY);
        C40741qdf c40741qdf = new C40741qdf(listGHZMYf, futuresTypeEnum, new Function1() { // from class: o.qdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40745qdj.OLrzqt(function1, (FuturesTypeEnum) obj);
            }
        });
        c42644raMEZpvd.EZpvd.setLayoutManager(new GridLayoutManager(getContext(), 2));
        c42644raMEZpvd.EZpvd.addItemDecoration(new C57584ylF(2, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42644raMEZpvd.EZpvd.setAdapter(c40741qdf);
        c42644raMEZpvd.AEQbTJ.setLayoutManager(new GridLayoutManager(getContext(), 3));
        c42644raMEZpvd.AEQbTJ.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42644raMEZpvd.AEQbTJ.setAdapter(c40744qdi);
        C52794wYp c52794wYp = c42644raMEZpvd.OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, c40741qdf, c40744qdi));
        this.AEQbTJ = c42644raMEZpvd;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C42644raM c42644raM, C40744qdi c40744qdi, FuturesTypeEnum futuresTypeEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        c42644raM.AhwBna.setEnabled(true);
        c40744qdi.AEQbTJ(c42644raM.AhwBna.isEnabled());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, FuturesTypeEnum futuresTypeEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        function1.invoke(futuresTypeEnum);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qdj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C40744qdi EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C40745qdj OLrzqt;
        public final /* synthetic */ C40741qdf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C40745qdj c40745qdj, C40741qdf c40741qdf, C40744qdi c40744qdi) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c40745qdj;
            this.copydefault = c40741qdf;
            this.EZpvd = c40744qdi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C40745qdj c40745qdj = this.OLrzqt;
                java.lang.String name = C40745qdj.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                FragmentKt.setFragmentResult(c40745qdj, name, BundleKt.bundleOf(C56390yDp.OLrzqt("key.selected_type", java.lang.Integer.valueOf(this.copydefault.copydefault().ordinal())), C56390yDp.OLrzqt("key.selected_unit", this.EZpvd.copydefault())));
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
