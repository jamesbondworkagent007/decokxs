package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14703dqU extends AbstractC14702dqT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fetchVPNInfo = 8;
    public AbstractC16451ekF fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final int isConnected = C52761wXj.PendingIntent.fetchVPNInfo;
    public final long ejfBZ = 250;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC14702dqT
    public android.widget.TextView AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC14702dqT
    public long DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC14702dqT
    public int gEmmrt() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: o.dqU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AbstractC14702dqT KWHzl() {
            return new C14703dqU();
        }
    }

    @Override // o.AbstractC14702dqT
    public C55113xdn djBIcL() {
        AbstractC16451ekF abstractC16451ekF = this.fIwbmz;
        if (abstractC16451ekF != null) {
            return abstractC16451ekF.AEQbTJ;
        }
        return null;
    }

    @Override // o.AbstractC14702dqT
    public android.widget.TextView valueOf() {
        AbstractC16451ekF abstractC16451ekF = this.fIwbmz;
        if (abstractC16451ekF != null) {
            return abstractC16451ekF.OLrzqt;
        }
        return null;
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16451ekF abstractC16451ekF = (AbstractC16451ekF) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.RXzakW, viewGroup, false);
        this.fIwbmz = abstractC16451ekF;
        Intrinsics.copydefault(abstractC16451ekF);
        android.view.View root = abstractC16451ekF.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC14702dqT, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.fIwbmz = null;
    }
}
