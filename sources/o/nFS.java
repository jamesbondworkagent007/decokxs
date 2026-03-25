package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nFS extends AnchorPopupWindow {
    public Function0<Unit> AhwBna;
    public C33928nLa EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nFS(@NotNull android.content.Context context) {
        android.widget.ImageView imageView;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C33928nLa c33928nLaKWHzl = C33928nLa.KWHzl(android.view.LayoutInflater.from(context), null, false);
        this.EZpvd = c33928nLaKWHzl;
        setContentView(c33928nLaKWHzl != null ? c33928nLaKWHzl.getRoot() : null);
        setFocusable(false);
        setOutsideTouchable(false);
        setBackgroundDrawable(new ColorDrawable(0));
        C33928nLa c33928nLa = this.EZpvd;
        if (c33928nLa == null || (imageView = c33928nLa.KWHzl) == null) {
            return;
        }
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        C33928nLa c33928nLa = this.EZpvd;
        if (c33928nLa == null || (textView = c33928nLa.EZpvd) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void KWHzl(@NotNull android.view.View view, @NotNull AnchorPopupWindow.VerticalPosition verticalPosition, @NotNull AnchorPopupWindow.HorizontalPosition horizontalPosition) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(verticalPosition, "");
        Intrinsics.checkNotNullParameter(horizontalPosition, "");
        copydefault(view, AnchorPopupWindow.Style.Gray, verticalPosition, horizontalPosition, true);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nFS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final nFS KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            nFS nfs = new nFS(context);
            nfs.EZpvd(str);
            nfs.EZpvd(function0);
            return nfs;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ nFS AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, nFS nfs) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = nfs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
