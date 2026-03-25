package o;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.oklive.app.ui.moderator.ModeratorStatusDialogHelper$checkAndShowDialog$2;
import com.okinc.oklive.app.ui.moderator.ModeratorStatusDialogHelper$createDialog$4$1$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.sTE;
import o.sWj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sUW {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final sTZ copydefault;

    @yCM
    public sUW(@NotNull sTZ stz) {
        Intrinsics.checkNotNullParameter(stz, "");
        this.copydefault = stz;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ModeratorStatusDialogHelper$checkAndShowDialog$2(this, str, context, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final ViewOnClickListenerC54939xaY KWHzl(final android.content.Context context, sTE ste, final java.lang.String str) {
        if (ste instanceof sTE.Activity) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(sWj.Activity.fJNWhG);
            viewOnClickListenerC54939xaY.copydefault(sWj.Activity.DbNXlk);
            viewOnClickListenerC54939xaY.EZpvd(sWj.Activity.KWHzl, new View.OnClickListener() { // from class: o.sUT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.gEmmrt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return viewOnClickListenerC54939xaY;
        }
        if (ste instanceof sTE.TaskDescription) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY2.setTitle(sWj.Activity.ejfBZ);
            viewOnClickListenerC54939xaY2.copydefault(sWj.Activity.values);
            viewOnClickListenerC54939xaY2.EZpvd(sWj.Activity.KWHzl, new View.OnClickListener() { // from class: o.sUZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.djBIcL(viewOnClickListenerC54939xaY2, view);
                }
            });
            viewOnClickListenerC54939xaY2.show();
            return viewOnClickListenerC54939xaY2;
        }
        if (ste instanceof sTE.StateListAnimator) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY3 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY3.setTitle(sWj.Activity.getFieldNames);
            viewOnClickListenerC54939xaY3.copydefault(sWj.Activity.fIwbmz);
            viewOnClickListenerC54939xaY3.EZpvd(sWj.Activity.KWHzl, new View.OnClickListener() { // from class: o.sVb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.AkhnZx(viewOnClickListenerC54939xaY3, view);
                }
            });
            viewOnClickListenerC54939xaY3.show();
            return viewOnClickListenerC54939xaY3;
        }
        if (ste instanceof sTE.ActionBar) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY4 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY4.setTitle(sWj.Activity.getNewProxyInstance);
            viewOnClickListenerC54939xaY4.copydefault(sWj.Activity.AkhnZx);
            viewOnClickListenerC54939xaY4.EZpvd(sWj.Activity.isConnected, new View.OnClickListener() { // from class: o.sVa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.OLrzqt(context, viewOnClickListenerC54939xaY4, str, view);
                }
            });
            viewOnClickListenerC54939xaY4.OLrzqt(sWj.Activity.hDKMBd, new View.OnClickListener() { // from class: o.sUX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.DbNXlk(viewOnClickListenerC54939xaY4, view);
                }
            });
            viewOnClickListenerC54939xaY4.show();
            return viewOnClickListenerC54939xaY4;
        }
        if (ste instanceof sTE.Fragment) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY5 = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY5.setTitle(sWj.Activity.AhwBna);
            viewOnClickListenerC54939xaY5.copydefault(sWj.Activity.OLrzqt);
            viewOnClickListenerC54939xaY5.EZpvd(sWj.Activity.isConnected, new View.OnClickListener() { // from class: o.sUY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    sUW.AYXKKw(viewOnClickListenerC54939xaY5, view);
                }
            });
            viewOnClickListenerC54939xaY5.show();
            return viewOnClickListenerC54939xaY5;
        }
        if (!(ste instanceof sTE.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY6 = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY6.setTitle(sWj.Activity.AEQbTJ);
        viewOnClickListenerC54939xaY6.copydefault(sWj.Activity.EZpvd);
        viewOnClickListenerC54939xaY6.EZpvd(sWj.Activity.KWHzl, new View.OnClickListener() { // from class: o.sVc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                sUW.AhwBna(viewOnClickListenerC54939xaY6, view);
            }
        });
        viewOnClickListenerC54939xaY6.show();
        return viewOnClickListenerC54939xaY6;
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AkhnZx(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(android.content.Context context, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.String str, android.view.View view) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new ModeratorStatusDialogHelper$createDialog$4$1$1(context, str, null), 3, null);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void DbNXlk(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
