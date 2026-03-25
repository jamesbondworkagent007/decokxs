package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31215lpn extends AbstractC31217lpp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public wZN AkhnZx;
    public float DbNXlk;
    public android.view.View fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31217lpp
    public android.animation.Animator copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(float f) {
        this.DbNXlk = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.lpn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lpn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31215lpn(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(-1);
        setHeight(-1);
        setOutsideTouchable(true);
        setElevation(0.0f);
        copydefault(C55298xhM.OLrzqt(4, context));
        setSoftInputMode(32);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        wZN wznKWHzl = wZN.KWHzl(android.view.LayoutInflater.from(EZpvd()));
        this.AkhnZx = wznKWHzl;
        wznKWHzl.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wznKWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C31215lpn.AEQbTJ(this.KWHzl, view2);
            }
        });
        wznKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C31215lpn.EZpvd(this.OLrzqt, view2);
            }
        });
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 55);
        }
        wznKWHzl.KWHzl.addView(view, layoutParams);
        Intrinsics.checkNotNullExpressionValue(wznKWHzl, "");
        this.fetchVPNInfo = view;
        super.setContentView(wznKWHzl.getRoot());
    }

    public static final void AEQbTJ(C31215lpn c31215lpn, android.view.View view) {
        c31215lpn.dismiss();
    }

    public static final void EZpvd(C31215lpn c31215lpn, android.view.View view) {
        c31215lpn.dismiss();
    }
}
