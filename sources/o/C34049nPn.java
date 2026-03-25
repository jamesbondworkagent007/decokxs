package o;

import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.debug.OKIMClearIMDBExtension$Companion$clearIMDatabase$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C34049nPn;
import o.mMP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nPn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34049nPn extends AbstractC43215rlA implements mMP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ = 1;
    public final int copydefault = 301;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "Clear Local IM Database";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return true;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityAEQbTJ);
        viewOnClickListenerC54939xaY.EZpvd("Clear Local IM Database", "App will close after the operation is complete. The IM database will be re-synced the next time you enter Messages again.");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) "Confirm", new View.OnClickListener() { // from class: o.nPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34049nPn.EZpvd(activityAEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.EZpvd("Cancel", new View.OnClickListener() { // from class: o.nPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34049nPn.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return true;
    }

    public static final void EZpvd(android.app.Activity activity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        Companion.copydefault(activity);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.nPn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public final void copydefault(@NotNull android.app.Activity activity) {
            LifecycleCoroutineScope lifecycleScope;
            Intrinsics.checkNotNullParameter(activity, "");
            LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
            if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new OKIMClearIMDBExtension$Companion$clearIMDatabase$1(activity, null), 3, null);
        }

        public final void EZpvd(@NotNull final android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.nPr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C34049nPn.StateListAnimator.AEQbTJ(activity);
                }
            });
        }

        public static final void AEQbTJ(android.app.Activity activity) {
            ActivityCompat.finishAffinity(activity);
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }
}
