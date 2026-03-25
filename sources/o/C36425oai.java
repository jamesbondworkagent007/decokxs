package o;

import android.view.View;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallSTerminateMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36425oai implements sEG {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public ViewOnClickListenerC54939xaY copydefault;

    /* JADX INFO: renamed from: o.oai$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oai.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ViewOnClickListenerC54939xaY EZpvd(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return new ViewOnClickListenerC54939xaY(activity);
        }
    }

    @Override // o.sEG
    public void OLrzqt() {
        C55326xho.toast$default(C35399nuc.LoaderManager.QXDzTk, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
    }

    public final void EZpvd() {
        android.app.Activity ownerActivity;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.copydefault;
        if (viewOnClickListenerC54939xaY == null || !viewOnClickListenerC54939xaY.isShowing() || (ownerActivity = viewOnClickListenerC54939xaY.getOwnerActivity()) == null || ownerActivity.isFinishing()) {
            return;
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.sEG
    public void AEQbTJ(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            EZpvd();
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYEZpvd = Companion.EZpvd(activityAEQbTJ);
            viewOnClickListenerC54939xaYEZpvd.copydefault(C35399nuc.LoaderManager.DlmWDR);
            viewOnClickListenerC54939xaYEZpvd.EZpvd(C35399nuc.LoaderManager.zLjUOn, new View.OnClickListener() { // from class: o.oal
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36425oai.KWHzl(viewOnClickListenerC54939xaYEZpvd, function0, view);
                }
            });
            viewOnClickListenerC54939xaYEZpvd.OLrzqt(C35399nuc.LoaderManager.AubY, new View.OnClickListener() { // from class: o.oak
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36425oai.AEQbTJ(viewOnClickListenerC54939xaYEZpvd, view);
                }
            });
            viewOnClickListenerC54939xaYEZpvd.setCancelable(true);
            viewOnClickListenerC54939xaYEZpvd.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaYEZpvd.show();
            this.copydefault = viewOnClickListenerC54939xaYEZpvd;
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.sEG
    public java.lang.String AEQbTJ(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        if (oKMessageContent instanceof OKCallSTerminateMessage) {
            return C37127onv.AEQbTJ.EZpvd((OKCallSTerminateMessage) oKMessageContent);
        }
        if (oKMessageContent instanceof OKAudioCallRecordMessage) {
            return C37127onv.AEQbTJ.OLrzqt((OKAudioCallRecordMessage) oKMessageContent);
        }
        return null;
    }
}
