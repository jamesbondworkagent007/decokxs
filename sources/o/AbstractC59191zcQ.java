package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59191zcQ extends AbstractC59242zdO {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final InterfaceC59098zad AEQbTJ;
    public final InterfaceC59297zeQ EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return this.copydefault;
    }

    public abstract AbstractC59191zcQ KWHzl(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AbstractC59191zcQ KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59297zeQ gEmmrt() {
        return this.EZpvd;
    }

    public AbstractC59191zcQ(@NotNull InterfaceC59297zeQ interfaceC59297zeQ, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC59297zeQ, "");
        this.EZpvd = interfaceC59297zeQ;
        this.copydefault = z;
        this.AEQbTJ = C59370zfk.OLrzqt(ErrorScopeKind.STUB_TYPE_SCOPE, interfaceC59297zeQ.toString());
    }

    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return C59308zeb.OLrzqt.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        return z == AEQbTJ() ? this : KWHzl(z);
    }

    /* JADX INFO: renamed from: o.zcQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zcQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
