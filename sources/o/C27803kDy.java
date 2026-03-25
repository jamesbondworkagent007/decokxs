package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27803kDy {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C46796tdt AEQbTJ;
    public android.widget.FrameLayout EZpvd;
    public android.widget.FrameLayout KWHzl;
    public android.widget.FrameLayout copydefault;
    public android.view.ViewStub djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(android.view.ViewStub viewStub) {
        this.djBIcL = viewStub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C46796tdt c46796tdt) {
        this.AEQbTJ = c46796tdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46796tdt EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(android.widget.FrameLayout frameLayout) {
        this.copydefault = frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.FrameLayout KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(android.widget.FrameLayout frameLayout) {
        this.KWHzl = frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.FrameLayout OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.widget.FrameLayout frameLayout) {
        this.EZpvd = frameLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.ViewStub copydefault() {
        return this.djBIcL;
    }

    /* JADX INFO: renamed from: o.kDy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kDy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C27803kDy EZpvd(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C27803kDy c27803kDy = new C27803kDy();
            c27803kDy.AEQbTJ((android.view.ViewStub) view.findViewById(qZH.StateListAnimator.OUcgGI));
            c27803kDy.EZpvd((android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.DbNXlk));
            c27803kDy.KWHzl((android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.OKSWiw));
            c27803kDy.AEQbTJ((C46796tdt) view.findViewById(qZH.StateListAnimator.IKQXqd));
            c27803kDy.OLrzqt((android.widget.FrameLayout) view.findViewById(qZH.StateListAnimator.sEAkxl));
            return c27803kDy;
        }
    }
}
