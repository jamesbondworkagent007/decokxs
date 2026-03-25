package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC7007abF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19574gHk implements AbstractC7007abF.StateListAnimator<C19577gHn> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final java.util.ArrayList<C19577gHn> AEQbTJ;
    public final java.lang.String EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.AbstractC7007abF.StateListAnimator
    public boolean EZpvd() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C19577gHn> copydefault() {
        return this.AEQbTJ;
    }

    public C19574gHk(int i, @NotNull java.lang.String str, @NotNull java.util.ArrayList<C19577gHn> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.copydefault = i;
        this.EZpvd = str;
        this.AEQbTJ = arrayList;
    }

    /* JADX INFO: renamed from: o.gHk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gHk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC7007abF.StateListAnimator
    public int OLrzqt() {
        return this.AEQbTJ.size();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(I)Ljava/lang/Object; */
    @Override // o.AbstractC7007abF.StateListAnimator
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C19577gHn AEQbTJ(int i) {
        C19577gHn c19577gHn = this.AEQbTJ.get(i);
        Intrinsics.checkNotNullExpressionValue(c19577gHn, "");
        return c19577gHn;
    }
}
