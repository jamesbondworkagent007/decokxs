package o;

import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C24679iiQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24712iix {
    public final androidx.fragment.app.FragmentManager EZpvd;
    public final android.app.Activity KWHzl;
    public final AbstractC23101hrq OLrzqt;

    public abstract java.lang.String AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.FragmentManager EZpvd() {
        return this.EZpvd;
    }

    public java.lang.String KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.app.Activity OLrzqt() {
        return this.KWHzl;
    }

    public abstract boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC23101hrq copydefault() {
        return this.OLrzqt;
    }

    public boolean djBIcL() {
        return false;
    }

    public abstract java.lang.String gEmmrt();

    public AbstractC24712iix(androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.EZpvd = fragmentManager;
        this.KWHzl = activity;
        this.OLrzqt = abstractC23101hrq;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.iix */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showCheckDialog$default(AbstractC24712iix abstractC24712iix, androidx.fragment.app.FragmentManager fragmentManager, int i, int i2, int i3, int i4, Function0 function0, Function0 function02, Function0 function03, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i5, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCheckDialog");
        }
        abstractC24712iix.EZpvd(fragmentManager, (i5 & 2) != 0 ? C23274hvD.Fragment.getMediaItem : i, (i5 & 4) != 0 ? C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags : i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) == 0 ? i4 : -1, (i5 & 32) != 0 ? null : function0, (i5 & 64) != 0 ? null : function02, (i5 & 128) != 0 ? null : function03, (i5 & 256) == 0 ? onCheckedChangeListener : null);
    }

    public void EZpvd(androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @androidx.annotation.StringRes int i4, final Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        int i5;
        java.lang.String strAYXKKw;
        int i6;
        java.lang.String strAYXKKw2;
        this.OLrzqt.dvKsVJ().setValue(java.lang.Boolean.FALSE);
        if (this.KWHzl == null || fragmentManager == null) {
            return;
        }
        final Function0<Unit> function04 = i != -1 ? function02 : function03;
        C24679iiQ.TaskDescription taskDescription = C24679iiQ.Companion;
        java.lang.String strGEmmrt = gEmmrt();
        java.lang.String strAEQbTJ = AEQbTJ();
        java.lang.String strKWHzl = KWHzl();
        boolean zDjBIcL = djBIcL();
        if (i != -1) {
            strAYXKKw = C33070mpX.AYXKKw(i);
            i5 = i2;
        } else {
            i5 = i2;
            strAYXKKw = "";
        }
        if (i5 != -1) {
            strAYXKKw2 = C33070mpX.AYXKKw(i2);
            i6 = i4;
        } else {
            i6 = i4;
            strAYXKKw2 = "";
        }
        C24679iiQ c24679iiQKWHzl = taskDescription.KWHzl(strGEmmrt, strAEQbTJ, strKWHzl, java.lang.Boolean.valueOf(zDjBIcL), strAYXKKw, strAYXKKw2, i6 != -1 ? C33070mpX.AYXKKw(i4) : "", new Function0() { // from class: o.iiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC24712iix.AEQbTJ(function04);
            }
        }, new Function0() { // from class: o.iiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC24712iix.copydefault(function0);
            }
        }, onCheckedChangeListener);
        c24679iiQKWHzl.setCancelable(true);
        c24679iiQKWHzl.show(fragmentManager);
    }

    public static final Unit AEQbTJ(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
