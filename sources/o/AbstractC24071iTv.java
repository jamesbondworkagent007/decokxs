package o;

import kotlin.jvm.functions.Function0;
import o.AbstractC27165jpz;

/* JADX INFO: renamed from: o.iTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC24071iTv<T extends AbstractC27165jpz> extends AbstractC24072iTw<T> {
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iTA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC24071iTv.gEmmrt();
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iTB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC24071iTv.valueOf();
        }
    });

    public static final android.animation.ValueAnimator gEmmrt() {
        return android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
    }

    public static final android.animation.ValueAnimator valueOf() {
        return android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
    }
}
