package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import o.C57792ypB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ync, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57713ync {
    public static final C57713ync OLrzqt = new C57713ync();

    /* JADX INFO: renamed from: o.ync$Activity */
    public interface Activity {
        void EZpvd();

        void copydefault();
    }

    private C57713ync() {
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(activity2, "");
        java.lang.String string = activity.getString(C57792ypB.ActionBar.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str3 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        java.lang.String string2 = activity.getString(C57792ypB.ActionBar.AhwBna);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String str4 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        new AlertDialog.Builder(activity).setTitle(str3).setMessage(str4).setPositiveButton(C57792ypB.ActionBar.AYXKKw, new DialogInterface.OnClickListener() { // from class: o.ynf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                C57713ync.EZpvd(activity2, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() { // from class: o.yne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                C57713ync.OLrzqt(activity2, dialogInterface, i);
            }
        }).show();
    }

    public static final void EZpvd(Activity activity, android.content.DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.EZpvd();
    }

    public static final void OLrzqt(Activity activity, android.content.DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.copydefault();
    }
}
