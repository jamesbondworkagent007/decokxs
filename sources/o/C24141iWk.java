package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import com.okinc.business.invest_biz.ui.page.order.details.viewbinder.InvestOrderDetailsInvestmentBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24141iWk extends AbstractC27119jpF<iVX.Application, iIO> {
    public static final C24141iWk copydefault = new C24141iWk();

    private C24141iWk() {
        super(InvestOrderDetailsInvestmentBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iIO iio, @NotNull iVX.Application application) {
        java.lang.String platformName;
        Intrinsics.checkNotNullParameter(iio, "");
        Intrinsics.checkNotNullParameter(application, "");
        android.content.Context context = iio.getRoot().getContext();
        if (application.KWHzl().getInvestmentId() != null) {
            ConstraintLayout root = iio.getRoot();
            root.setOnClickListener(new Application(root, 1000L, context, application));
            iio.OLrzqt.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.fiXcQa, 0);
        } else {
            iio.getRoot().setOnClickListener(null);
            iio.OLrzqt.setCompoundDrawablesRelative(null, null, null, null);
        }
        iio.OLrzqt.setText(application.KWHzl().getInvestmentName());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) application.KWHzl().getInvestmentClassify())) {
            Intrinsics.copydefault(context);
            int i = C25493ixk.FragmentManager.DsrFlB;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String platformName2 = application.KWHzl().getPlatformName();
            if (platformName2 == null) {
                platformName2 = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("protocolName", platformName2);
            pairArr[1] = C56390yDp.OLrzqt("protocolType", application.KWHzl().getInvestmentClassify());
            platformName = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
        } else {
            platformName = application.KWHzl().getPlatformName();
            if (platformName == null) {
                platformName = "";
            }
        }
        iio.AEQbTJ.setText(platformName);
        android.widget.TextView textView = iio.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String platformName3 = application.KWHzl().getPlatformName();
        textView.setVisibility((platformName3 == null || platformName3.length() == 0 || application.KWHzl().getInvestmentClassify().length() <= 0) ? 8 : 0);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Intrinsics.copydefault(context);
        C27569jxf.setSDAvatarLayout$default(c27569jxf, context, iio.KWHzl, application.KWHzl().getInvestLogo(), 0, 0.0f, 24, (java.lang.Object) null);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(iio.getRoot());
        if (application.EZpvd() != null) {
            constraintSet.constrainPercentWidth(C25493ixk.ActionBar.hfdhUn, 0.6f);
            constraintSet.applyTo(iio.getRoot());
            Group group = iio.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            java.lang.String amount = application.EZpvd().getAmount();
            if (amount == null || amount.length() == 0) {
                iio.djBIcL.setText("--");
                iio.AhwBna.setText("--");
                return;
            } else {
                iio.djBIcL.setText(C27492jwH.OLrzqt.EZpvd(application.EZpvd().getDirection(), application.EZpvd().getAmount()));
                iio.AhwBna.setText(application.EZpvd().getTokenSymbol());
                return;
            }
        }
        constraintSet.constrainPercentWidth(C25493ixk.ActionBar.hfdhUn, 1.0f);
        constraintSet.applyTo(iio.getRoot());
        Group group2 = iio.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group2, "");
        group2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.iWk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ iVX.Application AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.content.Context context, iVX.Application application) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = context;
            this.AEQbTJ = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                Intrinsics.copydefault(this.copydefault);
                C27508jwX.startInvestDetailActivity$default(c27508jwX, this.copydefault, this.AEQbTJ.KWHzl().getInvestmentId(), this.AEQbTJ.KWHzl().getInvestmentCategory(), null, null, false, 28, null);
            }
        }
    }
}
