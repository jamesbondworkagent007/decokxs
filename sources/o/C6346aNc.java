package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6346aNc extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Function0<Unit> EZpvd;
    public C5633aAE copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.aNc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aNc$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C6346aNc newInstance$default(TaskDescription taskDescription, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return taskDescription.OLrzqt(function0);
        }

        public final C6346aNc OLrzqt(Function0<Unit> function0) {
            C6346aNc c6346aNc = new C6346aNc();
            c6346aNc.EZpvd = function0;
            return c6346aNc;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C5633aAE.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setContentDescription("closeIcon");
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C5633aAE c5633aAE = this.copydefault;
        if (c5633aAE != null) {
            android.content.Context context = getContext();
            if (context != null) {
                android.widget.ImageView imageView = c5633aAE.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/passkey/passkey_third_party_reminder_illustration.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            }
            c5633aAE.AEQbTJ.setText(getString(C8206ayP.Dialog.zblBkD));
            c5633aAE.OLrzqt.setText(getString(C8206ayP.Dialog.ixgjPv));
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(getString(C8206ayP.Dialog.RAQtXZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("continue");
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.aNc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C6346aNc KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C6346aNc c6346aNc) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c6346aNc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.aNc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C6346aNc OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6346aNc c6346aNc) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c6346aNc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
