package o;

import com.okinc.web.WebActivity;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43517rql extends AbstractC57329ygP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static SoftReference<TaskDescription> KWHzl;

    /* JADX INFO: renamed from: o.rql$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
        void OLrzqt(java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "window";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        TaskDescription taskDescription;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ instanceof WebActivity) {
            ((WebActivity) activityAEQbTJ).finish();
        }
        SoftReference<TaskDescription> softReference = KWHzl;
        if (softReference != null && (taskDescription = softReference.get()) != null) {
            taskDescription.OLrzqt(message.data);
        }
        SoftReference<TaskDescription> softReference2 = KWHzl;
        if (softReference2 != null) {
            softReference2.clear();
        }
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("nftThirdLogin", "web3/nft/js/nftThirdLogin");
    }

    /* JADX INFO: renamed from: o.rql$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rql.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            C43517rql.KWHzl = new SoftReference(taskDescription);
        }
    }
}
