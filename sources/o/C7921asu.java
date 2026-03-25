package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7921asu extends android.widget.LinearLayout {
    public android.view.View AEQbTJ;
    public android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7921asu(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClose(android.view.View view) {
        this.copydefault = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMore(android.view.View view) {
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.asu.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C7921asu(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7921asu(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        android.view.LayoutInflater.from(context).inflate(C7343ahz.Activity.AuCTelauCTel, (android.view.ViewGroup) this, true);
        android.view.View viewFindViewById = findViewById(C7343ahz.TaskDescription.djBIcL);
        this.copydefault = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o.asz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7921asu.EZpvd(context, view);
                }
            });
        }
        android.view.View viewFindViewById2 = findViewById(C7343ahz.TaskDescription.DTwDnp);
        this.AEQbTJ = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o.asx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7921asu.KWHzl(context, view);
                }
            });
        }
        setPaddingRelative(getPaddingStart(), C33570myu.OLrzqt(), getPaddingEnd(), getPaddingBottom());
    }

    public static final void EZpvd(android.content.Context context, android.view.View view) {
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }

    public static final void KWHzl(android.content.Context context, android.view.View view) {
        if (context instanceof AppCompatActivity) {
            C7923asw c7923asw = new C7923asw();
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c7923asw.show(supportFragmentManager);
        }
    }

    public final void setup(com.okinc.mln.miniapp.Config config, boolean z) {
        boolean z2 = z || (config != null && config.getShowMenuClose());
        android.view.View view = this.copydefault;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
        boolean z3 = config != null && config.getShowMenuMore();
        android.view.View view2 = this.AEQbTJ;
        if (view2 != null) {
            view2.setVisibility(z3 ? 0 : 8);
        }
    }
}
