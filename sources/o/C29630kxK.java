package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.utils.CDNSourceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29630kxK extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29630kxK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29630kxK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.kxK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29630kxK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29630kxK(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29630kxK.copydefault(context, this);
            }
        });
    }

    private final C21594hFd EZpvd() {
        return (C21594hFd) this.AEQbTJ.getValue();
    }

    public static final C21594hFd copydefault(android.content.Context context, C29630kxK c29630kxK) {
        return C21594hFd.OLrzqt(android.view.LayoutInflater.from(context), c29630kxK, true);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().copydefault.setText(str + "x");
        android.widget.ImageView imageView = EZpvd().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.EZpvd;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.SignalFireAnimation;
        android.content.Context context = EZpvd().OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25386ivj.OLrzqt(imageView, cDNSourceManager.OLrzqt(imageSource, context), C52761wXj.TaskDescription.processStrongAuthMessage);
    }
}
