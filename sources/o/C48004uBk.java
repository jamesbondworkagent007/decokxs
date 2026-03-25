package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48004uBk extends android.widget.LinearLayout {
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;
    public AbstractC49602ure copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48004uBk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C48004uBk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickCallback(Function0<Unit> function0, Function0<Unit> function02) {
        this.OLrzqt = function0;
        this.KWHzl = function02;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.uBk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C48004uBk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48004uBk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        setGravity(16);
        AbstractC49602ure abstractC49602ure = (AbstractC49602ure) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49511upt.StateListAnimator.AwvSrB, this, true);
        this.copydefault = abstractC49602ure;
        abstractC49602ure.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.uBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48004uBk.EZpvd(this.copydefault, view);
            }
        });
        this.copydefault.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.uBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C48004uBk.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(C48004uBk c48004uBk, android.view.View view) {
        Function0<Unit> function0 = c48004uBk.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(C48004uBk c48004uBk, android.view.View view) {
        Function0<Unit> function0 = c48004uBk.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
