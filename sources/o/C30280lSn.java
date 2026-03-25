package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mDC;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanOrderStatusTag;

/* JADX INFO: renamed from: o.lSn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C30280lSn extends C43318rmy<C3952Avg, AbstractC31892mHu> {
    public static final Activity Companion = new Activity(null);
    public final Function1<C3952Avg, Unit> EZpvd;

    /* JADX INFO: renamed from: o.lSn$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyPlanOrderStatusTag.values().length];
            try {
                iArr[RecurringBuyPlanOrderStatusTag.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyPlanOrderStatusTag.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringBuyPlanOrderStatusTag.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.Avg, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30280lSn(@NotNull Function1<? super C3952Avg, Unit> function1) {
        super(mDC.TaskDescription.djSkpj, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31892mHu> c43312rms, @NotNull final C3952Avg c3952Avg) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c3952Avg, "");
        super.onBindViewHolder((C43312rms) c43312rms, c3952Avg);
        AbstractC31892mHu abstractC31892mHu = (AbstractC31892mHu) c43312rms.OLrzqt();
        if (abstractC31892mHu != null) {
            android.widget.ImageView imageView = abstractC31892mHu.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, c3952Avg.AEQbTJ(), null, 0, 0, 14, null);
            abstractC31892mHu.AEQbTJ.setText(c3952Avg.copydefault());
            abstractC31892mHu.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lSo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30280lSn.KWHzl(this.AEQbTJ, c3952Avg, view);
                }
            });
            if (c3952Avg.AYXKKw() != RecurringBuyPlanOrderStatusTag.NONE) {
                if (c3952Avg.djBIcL()) {
                    abstractC31892mHu.valueOf.setText(c3952Avg.KWHzl());
                    abstractC31892mHu.OLrzqt.setText(c3952Avg.OLrzqt());
                    android.widget.TextView textView = abstractC31892mHu.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(0);
                    android.widget.TextView textView2 = abstractC31892mHu.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                    android.widget.TextView textView3 = abstractC31892mHu.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    OLrzqt(textView3, 0.0f);
                    abstractC31892mHu.getRoot().setClickable(true);
                } else {
                    abstractC31892mHu.valueOf.setText(c3952Avg.OLrzqt());
                    android.widget.TextView textView4 = abstractC31892mHu.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setVisibility(0);
                    android.widget.TextView textView5 = abstractC31892mHu.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setVisibility(8);
                    android.widget.TextView textView6 = abstractC31892mHu.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    OLrzqt(textView6, 0.5f);
                    abstractC31892mHu.getRoot().setClickable(false);
                }
                C55251xgS c55251xgS = abstractC31892mHu.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                c55251xgS.setVisibility(0);
                int i = ActionBar.AEQbTJ[c3952Avg.AYXKKw().ordinal()];
                if (i == 1) {
                    abstractC31892mHu.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.fIwbmz));
                    abstractC31892mHu.KWHzl.setOKDSStyle(10);
                    return;
                } else if (i == 2) {
                    abstractC31892mHu.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.ejfBZ));
                    abstractC31892mHu.KWHzl.setOKDSStyle(9);
                    return;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55251xgS c55251xgS2 = abstractC31892mHu.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                    c55251xgS2.setVisibility(8);
                    return;
                }
            }
            abstractC31892mHu.valueOf.setText(c3952Avg.KWHzl());
            abstractC31892mHu.OLrzqt.setText(c3952Avg.OLrzqt());
            android.widget.TextView textView7 = abstractC31892mHu.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            textView7.setVisibility(0);
            android.widget.TextView textView8 = abstractC31892mHu.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            textView8.setVisibility(0);
            C55251xgS c55251xgS3 = abstractC31892mHu.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(8);
            android.widget.TextView textView9 = abstractC31892mHu.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView9, "");
            OLrzqt(textView9, 0.0f);
            abstractC31892mHu.getRoot().setClickable(true);
        }
    }

    public static final void KWHzl(C30280lSn c30280lSn, C3952Avg c3952Avg, android.view.View view) {
        c30280lSn.EZpvd.invoke(c3952Avg);
    }

    private final void OLrzqt(android.view.View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.verticalBias = f;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: o.lSn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
