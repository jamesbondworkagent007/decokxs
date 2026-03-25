package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52786wYh extends AbstractC52792wYn {
    public C55018xby AkhnZx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C55018xby c55018xby) {
        this.AkhnZx = c55018xby;
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55009xbp c55009xbpFIwbmz;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C55018xby c55018xby = this.AkhnZx;
        if (c55018xby != null && (c55009xbpFIwbmz = c55018xby.fIwbmz()) != null) {
            c55009xbpFIwbmz.copydefault();
        }
        copydefault(new Function2() { // from class: o.wYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC52786wYh.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        });
    }

    public static final Unit copydefault(AbstractC52786wYh abstractC52786wYh, int i, C55276xgr c55276xgr) {
        C55001xbh c55001xbhAkhnZx;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C55018xby c55018xby = abstractC52786wYh.AkhnZx;
        if (c55018xby != null && (c55001xbhAkhnZx = c55018xby.AkhnZx()) != null) {
            c55001xbhAkhnZx.setText(c55276xgr.AhwBna());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52792wYn
    public void copydefault(@NotNull C55276xgr c55276xgr, @NotNull Function1<? super C55276xgr, java.lang.Integer> function1) {
        C55018xby c55018xby;
        C55001xbh c55001xbhAkhnZx;
        java.util.List<C55276xgr> listDbNXlk;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        super.copydefault(c55276xgr, function1);
        if (function1.invoke(c55276xgr).intValue() >= 0) {
            C55198xfS c55198xfSIsConnected = isConnected();
            if (((c55198xfSIsConnected == null || (listDbNXlk = c55198xfSIsConnected.DbNXlk()) == null) ? 0 : listDbNXlk.size()) < function1.invoke(c55276xgr).intValue() || (c55018xby = this.AkhnZx) == null || (c55001xbhAkhnZx = c55018xby.AkhnZx()) == null) {
                return;
            }
            c55001xbhAkhnZx.setText(c55276xgr.AhwBna());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xby.setDefaultFunction$OKUILib_uilib$default(o.xby, boolean, int, int, java.lang.Object):void */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C55018xby c55018xby = this.AkhnZx;
        if (c55018xby != null) {
            C55018xby.setDefaultFunction$OKUILib_uilib$default(c55018xby, true, 0, 2, null);
            if (c55018xby.zLjUOn()) {
                c55018xby.setState(2);
            } else {
                c55018xby.setState(0);
            }
        }
    }
}
