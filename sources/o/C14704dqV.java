package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14704dqV extends AbstractC14702dqT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int isConnected = 8;
    public final long ejfBZ;
    public C16449ekD fARcdN;
    public final int fetchVPNInfo = C13754dXa.Fragment.OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC14702dqT
    public long DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC14702dqT
    public int gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX INFO: renamed from: o.dqV$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC14702dqT EZpvd() {
            return new C14704dqV();
        }
    }

    @Override // o.AbstractC14702dqT
    public C55113xdn djBIcL() {
        C16449ekD c16449ekD = this.fARcdN;
        if (c16449ekD != null) {
            return c16449ekD.EZpvd;
        }
        return null;
    }

    @Override // o.AbstractC14702dqT
    public android.widget.TextView valueOf() {
        C16449ekD c16449ekD = this.fARcdN;
        if (c16449ekD != null) {
            return c16449ekD.copydefault;
        }
        return null;
    }

    @Override // o.AbstractC14702dqT
    public android.widget.TextView AYXKKw() {
        C16449ekD c16449ekD = this.fARcdN;
        if (c16449ekD != null) {
            return c16449ekD.OLrzqt;
        }
        return null;
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16449ekD c16449ekDKWHzl = C16449ekD.KWHzl(layoutInflater, viewGroup, false);
        this.fARcdN = c16449ekDKWHzl;
        Intrinsics.copydefault(c16449ekDKWHzl);
        ConstraintLayout root = c16449ekDKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }
}
