package o;

import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7551alv extends C57943yru {
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public Function1<? super RefreshState, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7551alv() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7551alv(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMovingListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnStateChangedListener(Function1<? super RefreshState, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:android.content.Context:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.content.Context) : (r2v0 android.content.Context))
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:10) call: o.alv.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C7551alv(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : attributeSet);
    }

    public C7551alv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.C57943yru, o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@NotNull InterfaceC57934yrl interfaceC57934yrl, @NotNull RefreshState refreshState, @NotNull RefreshState refreshState2) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Intrinsics.checkNotNullParameter(refreshState, "");
        Intrinsics.checkNotNullParameter(refreshState2, "");
        super.OLrzqt(interfaceC57934yrl, refreshState, refreshState2);
        Function1<? super RefreshState, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(refreshState2);
        }
    }

    @Override // o.C57943yru, o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void copydefault(boolean z, float f, int i, int i2, int i3) {
        super.copydefault(z, f, i, i2, i3);
        Function1<? super java.lang.Integer, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf((int) C7865arr.AEQbTJ(i)));
        }
    }
}
