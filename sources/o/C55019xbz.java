package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55019xbz extends C55008xbo {
    public final InterfaceC56387yDm AuCTelauCTel;
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55019xbz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55019xbz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DCUTEIdCUTEI int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.xbz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55019xbz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DCUTEIdCUTEI : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55019xbz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C54957xaq c54957xaqAEQbTJ;
        android.widget.LinearLayout linearLayout;
        C54957xaq c54957xaqAEQbTJ2;
        android.widget.LinearLayout linearLayout2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = true;
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.xbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55019xbz.OLrzqt(this.EZpvd);
            }
        });
        InterfaceC52764wXm.Application.loadFromAttributes$default(KWHzl(), attributeSet, C52761wXj.ActionBar.DCUTEIdCUTEI, 0, 4, null);
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null) {
            C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz, ContextCompat.getDrawable(context, C52761wXj.TaskDescription.ODCBUN), 0, 0, 6, null);
        }
        C55009xbp c55009xbpFIwbmz2 = fIwbmz();
        if (c55009xbpFIwbmz2 != null && (c54957xaqAEQbTJ2 = c55009xbpFIwbmz2.AEQbTJ()) != null && (linearLayout2 = c54957xaqAEQbTJ2.KWHzl) != null) {
            linearLayout2.setFocusable(true);
        }
        C55009xbp c55009xbpFIwbmz3 = fIwbmz();
        if (c55009xbpFIwbmz3 != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz3.AEQbTJ()) != null && (linearLayout = c54957xaqAEQbTJ.KWHzl) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.xbC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55019xbz.EZpvd(this.AEQbTJ, view);
                }
            });
        }
        C55009xbp c55009xbpFIwbmz4 = fIwbmz();
        if (c55009xbpFIwbmz4 != null) {
            c55009xbpFIwbmz4.setImageTint(KWHzl().copydefault());
        }
    }

    private final C54968xbA KWHzl() {
        return (C54968xbA) this.AuCTelauCTel.getValue();
    }

    public static final C54968xbA OLrzqt(C55019xbz c55019xbz) {
        return new C54968xbA(c55019xbz);
    }

    public static final void EZpvd(C55019xbz c55019xbz, android.view.View view) {
        c55019xbz.copydefault();
    }

    public final void copydefault() {
        if (this.EZpvd) {
            C55009xbp c55009xbpFIwbmz = fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.isConnected();
            }
            C55009xbp c55009xbpFIwbmz2 = fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz2, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.invokespecialgBtXYZ), 0, 0, 6, null);
            }
        } else {
            C55009xbp c55009xbpFIwbmz3 = fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.values();
            }
            C55009xbp c55009xbpFIwbmz4 = fIwbmz();
            if (c55009xbpFIwbmz4 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz4, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.ODCBUN), 0, 0, 6, null);
            }
        }
        C55009xbp c55009xbpFIwbmz5 = fIwbmz();
        if (c55009xbpFIwbmz5 != null) {
            c55009xbpFIwbmz5.setImageTint(KWHzl().copydefault());
        }
        this.EZpvd = !this.EZpvd;
    }
}
