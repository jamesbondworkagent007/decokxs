package o;

import android.view.View;
import androidx.core.widget.ImageViewCompat;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.token.DefiRecommendTokenBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26624jfo extends AbstractC27119jpF<C26589jfF, C23843iLj> {
    public final Function2<java.lang.Long, java.lang.Long, Unit> EZpvd;
    public final Function2<java.lang.Long, TokenInvestDetail, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Long, TokenInvestDetail, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<java.lang.Long, java.lang.Long, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super com.okinc.business.invest_biz.data.bean.TokenInvestDetail, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26624jfo(@NotNull Function2<? super java.lang.Long, ? super TokenInvestDetail, Unit> function2, @NotNull Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function22) {
        super(DefiRecommendTokenBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.OLrzqt = function2;
        this.EZpvd = function22;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23843iLj c23843iLj, @NotNull C26589jfF c26589jfF) {
        Intrinsics.checkNotNullParameter(c23843iLj, "");
        Intrinsics.checkNotNullParameter(c26589jfF, "");
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = c23843iLj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, c26589jfF.AEQbTJ(), 0, C52761wXj.Activity.zuBGHE, 0.0f, 20, null);
        c23843iLj.AhwBna.setText(c26589jfF.EZpvd());
        c23843iLj.djBIcL.setText(c26589jfF.AYXKKw());
        c23843iLj.AYXKKw.setText(C27492jwH.formatTvl$default(C27492jwH.OLrzqt, c26589jfF.valueOf(), false, true, 2, null));
        if (c26589jfF.djBIcL()) {
            c23843iLj.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            ImageViewCompat.setImageTintList(c23843iLj.EZpvd, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        } else {
            c23843iLj.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            ImageViewCompat.setImageTintList(c23843iLj.EZpvd, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)));
        }
        android.widget.LinearLayout linearLayout = c23843iLj.OLrzqt;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this, c26589jfF, c23843iLj));
        android.widget.FrameLayout root = c23843iLj.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, c26589jfF));
    }

    /* JADX INFO: renamed from: o.jfo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C26589jfF KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C26624jfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C26624jfo c26624jfo, C26589jfF c26589jfF) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c26624jfo;
            this.KWHzl = c26589jfF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2<java.lang.Long, TokenInvestDetail, Unit> function2EZpvd = this.copydefault.EZpvd();
                if (function2EZpvd != null) {
                    function2EZpvd.invoke(java.lang.Long.valueOf(this.KWHzl.copydefault()), this.KWHzl.KWHzl());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jfo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26624jfo EZpvd;
        public final /* synthetic */ C26589jfF KWHzl;
        public final /* synthetic */ C23843iLj OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C26624jfo c26624jfo, C26589jfF c26589jfF, C23843iLj c23843iLj) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c26624jfo;
            this.KWHzl = c26589jfF;
            this.OLrzqt = c23843iLj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt().invoke(java.lang.Long.valueOf(this.KWHzl.copydefault()), this.KWHzl.OLrzqt());
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                android.content.Context context = this.OLrzqt.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                long jCopydefault = this.KWHzl.copydefault();
                C27508jwX.startInvestDetailActivity$default(c27508jwX, context, java.lang.Long.valueOf(jCopydefault), null, "investsubscribeentrance", this.KWHzl.OLrzqt(), true, 2, null);
            }
        }
    }
}
