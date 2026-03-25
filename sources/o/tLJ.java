package o;

import com.okinc.share.view.FootViewTheme;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tLJ extends android.widget.FrameLayout {
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tLJ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:10) call: o.tLJ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ tLJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tLJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tLJ.AEQbTJ(context, this);
            }
        });
        AEQbTJ().AEQbTJ.AhwBna().setIcon(null);
    }

    private final tOT AEQbTJ() {
        return (tOT) this.copydefault.getValue();
    }

    public static final tOT AEQbTJ(android.content.Context context, tLJ tlj) {
        tOT totKWHzl = tOT.KWHzl(android.view.LayoutInflater.from(context), tlj, true);
        Intrinsics.checkNotNullExpressionValue(totKWHzl, "");
        return totKWHzl;
    }

    public final void setQRCode(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().AEQbTJ.setQRCode(str);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().AEQbTJ.setTitle(str);
    }

    public final void setSubTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().AEQbTJ.setSubTitle(str);
    }

    public final void setTheme(@NotNull FootViewTheme footViewTheme) {
        Intrinsics.checkNotNullParameter(footViewTheme, "");
        AEQbTJ().AEQbTJ.setTheme(footViewTheme);
    }
}
