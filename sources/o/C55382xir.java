package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.okinc.uilib.core.drawable.UnderlineType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55382xir {
    public UnderlineType EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final android.content.Context OLrzqt;

    /* JADX INFO: renamed from: o.xir$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UnderlineType.values().length];
            try {
                iArr[UnderlineType.SOLID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UnderlineType.DOTTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public C55382xir(@NotNull android.content.Context context, @androidx.annotation.ColorInt final int i) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.KWHzl = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.xis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55382xir.AEQbTJ(this.EZpvd, i);
            }
        });
        this.EZpvd = UnderlineType.DOTTED;
    }

    public final android.graphics.Paint AEQbTJ() {
        return (android.graphics.Paint) this.KWHzl.getValue();
    }

    public static final android.graphics.Paint AEQbTJ(C55382xir c55382xir, int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C55298xhM.EZpvd(0.5f, c55382xir.OLrzqt));
        paint.setColor(i);
        return paint;
    }

    public final void KWHzl(@NotNull UnderlineType underlineType) {
        DashPathEffect dashPathEffect;
        Intrinsics.checkNotNullParameter(underlineType, "");
        if (this.EZpvd == underlineType) {
            return;
        }
        this.EZpvd = underlineType;
        android.graphics.Paint paintAEQbTJ = AEQbTJ();
        int i = Activity.copydefault[underlineType.ordinal()];
        if (i == 1) {
            dashPathEffect = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dashPathEffect = new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f);
        }
        paintAEQbTJ.setPathEffect(dashPathEffect);
    }

    public final void AEQbTJ(@androidx.annotation.ColorInt int i) {
        AEQbTJ().setColor(i);
    }

    public final void OLrzqt(@NotNull android.graphics.Canvas canvas, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float strokeWidth = AEQbTJ().getStrokeWidth();
        canvas.drawLine(f, f3 + strokeWidth, f2, f3 + AEQbTJ().getStrokeWidth(), AEQbTJ());
    }

    public final float OLrzqt() {
        return AEQbTJ().getStrokeWidth();
    }
}
