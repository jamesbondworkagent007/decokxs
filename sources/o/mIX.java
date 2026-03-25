package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.cruilib.utils.RecurringBuyPlanOrderStatus;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mIX extends mIP<mHM, AbstractC31892mHu> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<mHM, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.mHM, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mIX(@NotNull Function1<? super mHM, Unit> function1) {
        super(mDC.TaskDescription.djSkpj);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lcom/okinc/cruilib/model/listitem/OKCRListItem;Lo/rms;)V */
    @Override // o.mIP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final mHM mhm, @NotNull C43312rms<AbstractC31892mHu> c43312rms) {
        Intrinsics.checkNotNullParameter(mhm, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31892mHu abstractC31892mHu = (AbstractC31892mHu) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC31892mHu.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadUrl$default(imageView, mhm.KWHzl(), null, 0, 0, 14, null);
        abstractC31892mHu.AEQbTJ.setText(KWHzl(mhm.OLrzqt()));
        abstractC31892mHu.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.mJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mIX.KWHzl(this.EZpvd, mhm, view);
            }
        });
        if (copydefault(mhm)) {
            if (mhm.copydefault()) {
                abstractC31892mHu.valueOf.setText(mhm.AEQbTJ());
                abstractC31892mHu.OLrzqt.setText(mhm.AhwBna());
                android.widget.TextView textView = abstractC31892mHu.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                android.widget.TextView textView2 = abstractC31892mHu.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                android.widget.TextView textView3 = abstractC31892mHu.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                AEQbTJ(textView3, 0.0f);
                abstractC31892mHu.getRoot().setClickable(true);
            } else {
                abstractC31892mHu.valueOf.setText(mhm.AhwBna());
                android.widget.TextView textView4 = abstractC31892mHu.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                android.widget.TextView textView5 = abstractC31892mHu.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(8);
                android.widget.TextView textView6 = abstractC31892mHu.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                AEQbTJ(textView6, 0.5f);
                abstractC31892mHu.getRoot().setClickable(false);
            }
            C55251xgS c55251xgS = abstractC31892mHu.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            if (mhm.AYXKKw() == RecurringBuyPlanOrderStatus.PENDING) {
                abstractC31892mHu.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.fIwbmz));
                abstractC31892mHu.KWHzl.setOKDSStyle(10);
                return;
            } else {
                abstractC31892mHu.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.ejfBZ));
                abstractC31892mHu.KWHzl.setOKDSStyle(9);
                return;
            }
        }
        abstractC31892mHu.valueOf.setText(mhm.AEQbTJ());
        abstractC31892mHu.OLrzqt.setText(mhm.AhwBna());
        android.widget.TextView textView7 = abstractC31892mHu.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        textView7.setVisibility(0);
        android.widget.TextView textView8 = abstractC31892mHu.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        textView8.setVisibility(0);
        C55251xgS c55251xgS2 = abstractC31892mHu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(8);
        android.widget.TextView textView9 = abstractC31892mHu.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView9, "");
        AEQbTJ(textView9, 0.0f);
        abstractC31892mHu.getRoot().setClickable(true);
    }

    public static final void KWHzl(mIX mix, mHM mhm, android.view.View view) {
        mix.OLrzqt.invoke(mhm);
    }

    public final void AEQbTJ(android.view.View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.verticalBias = f;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final java.lang.String KWHzl(long j) {
        return pTA.format$default(new Date(j), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.NONE, null, null, false, 28, null);
    }

    public final boolean copydefault(mHM mhm) {
        return mhm.AYXKKw() == RecurringBuyPlanOrderStatus.FAILED || mhm.AYXKKw() == RecurringBuyPlanOrderStatus.PENDING;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
