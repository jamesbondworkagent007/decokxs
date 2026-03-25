package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.market.features.overview.domain.MemeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34390nbF extends ConstraintLayout {
    public final C36087oOu EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34390nbF(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:24) call: o.nbF.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34390nbF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34390nbF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36087oOu c36087oOuOLrzqt = C36087oOu.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36087oOuOLrzqt, "");
        this.EZpvd = c36087oOuOLrzqt;
    }

    private final void OLrzqt(float f) {
        if (f == 0.0f) {
            return;
        }
        C36087oOu c36087oOu = this.EZpvd;
        int i = C52761wXj.ActionBar.OBJEWx;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c36087oOu.EZpvd.setColorFilter(mUM.EZpvd(i, context));
        android.view.ViewTreeObserver viewTreeObserver = c36087oOu.EZpvd.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new Activity(c36087oOu, f));
        }
    }

    /* JADX INFO: renamed from: o.nbF$Activity */
    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C36087oOu AEQbTJ;
        public final /* synthetic */ float OLrzqt;

        public Activity(C36087oOu c36087oOu, float f) {
            this.AEQbTJ = c36087oOu;
            this.OLrzqt = f;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.ViewTreeObserver viewTreeObserver = this.AEQbTJ.EZpvd.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            int width = this.AEQbTJ.copydefault.getWidth();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.EZpvd.getLayoutParams();
            layoutParams.width = java.lang.Math.max((int) ((width * java.lang.Math.min(this.OLrzqt, 100.0f)) / 100), C55298xhM.dp2px$default(2.0f, null, 1, null));
            this.AEQbTJ.EZpvd.setLayoutParams(layoutParams);
        }
    }

    public final void setData(@NotNull final MemeInfo memeInfo) {
        Intrinsics.checkNotNullParameter(memeInfo, "");
        OLrzqt(C33129mqd.djBIcL(memeInfo.copydefault()));
        android.widget.TextView textView = this.EZpvd.OLrzqt;
        java.lang.Float fCopydefault = memeInfo.copydefault();
        textView.setText(fCopydefault != null ? pTB.formatICUPercent$default(fCopydefault, null, null, null, null, null, 31, null) : null);
        mUO.setOnDoubleCheckClickListener$default(this.EZpvd.valueOf, 0L, new Function1() { // from class: o.nbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34390nbF.EZpvd(this.EZpvd, memeInfo, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C34390nbF c34390nbF, MemeInfo memeInfo, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c34390nbF.getContext();
        if (context != null) {
            mUO.AEQbTJ(context, C33070mpX.AYXKKw(C35964oKf.Fragment.fmB), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKDCKfqPDCfLja), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("site", memeInfo.OLrzqt()))), C35964oKf.Fragment.DcMfJKDDUqPf);
        }
        return Unit.INSTANCE;
    }
}
