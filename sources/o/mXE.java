package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.mXE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mXE extends android.widget.LinearLayout {
    public boolean AEQbTJ;
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mXE(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.mXE.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mXE(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mXE(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mXE.copydefault(context, this);
            }
        });
    }

    private final oNC copydefault() {
        return (oNC) this.KWHzl.getValue();
    }

    public static final oNC copydefault(android.content.Context context, mXE mxe) {
        return oNC.EZpvd(android.view.LayoutInflater.from(context), mxe, true);
    }

    public final void setDescription(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        oNC oncCopydefault = copydefault();
        oncCopydefault.AEQbTJ.setText(str);
        oncCopydefault.AEQbTJ.getViewTreeObserver().addOnGlobalLayoutListener(new ActionBar(oncCopydefault, this));
    }

    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ oNC AEQbTJ;
        public final /* synthetic */ mXE KWHzl;

        public ActionBar(oNC onc, mXE mxe) {
            this.AEQbTJ = onc;
            this.KWHzl = mxe;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.AEQbTJ.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.AEQbTJ.AEQbTJ.getLineCount() > 2) {
                this.AEQbTJ.AEQbTJ.setMaxLines(this.KWHzl.AEQbTJ ? 100 : 2);
                this.AEQbTJ.OLrzqt.setVisibility(0);
                android.widget.ImageView imageView = this.AEQbTJ.OLrzqt;
                final mXE mxe = this.KWHzl;
                mUO.setOnDoubleCheckClickListener$default(imageView, 0L, new Function1() { // from class: o.mXF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mXE.ActionBar.OLrzqt(mxe, (android.view.View) obj);
                    }
                }, 1, null);
                return;
            }
            this.AEQbTJ.OLrzqt.setVisibility(8);
        }

        public static final Unit OLrzqt(mXE mxe, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (mxe.AEQbTJ) {
                mxe.KWHzl();
            } else {
                mxe.AEQbTJ();
            }
            mxe.AEQbTJ = !mxe.AEQbTJ;
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ() {
        oNC oncCopydefault = copydefault();
        oncCopydefault.AEQbTJ.setMaxLines(100);
        oncCopydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        ViewGroup.LayoutParams layoutParams = oncCopydefault.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = -1;
        layoutParams2.topToBottom = oncCopydefault.AEQbTJ.getId();
        oncCopydefault.OLrzqt.setLayoutParams(layoutParams2);
    }

    public final void KWHzl() {
        oNC oncCopydefault = copydefault();
        oncCopydefault.AEQbTJ.setMaxLines(2);
        oncCopydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        ViewGroup.LayoutParams layoutParams = oncCopydefault.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = oncCopydefault.AEQbTJ.getId();
        layoutParams2.topToBottom = -1;
        oncCopydefault.OLrzqt.setLayoutParams(layoutParams2);
    }
}
