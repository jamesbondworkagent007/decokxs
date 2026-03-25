package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33012moS;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33015moV {
    public static final C33015moV AEQbTJ = new C33015moV();

    private C33015moV() {
    }

    public final C33012moS AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, @NotNull C33012moS.PendingIntent pendingIntent, @NotNull C33012moS.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C33012moS c33012moSAEQbTJ = C33012moS.Companion.AEQbTJ(list, charSequence, charSequence2, z ? C33057mpK.EZpvd(C52761wXj.TaskDescription.DztXDE, activity, C32113mPz.ActionBar.AhwBna) : null);
        c33012moSAEQbTJ.AEQbTJ(pendingIntent);
        c33012moSAEQbTJ.copydefault(stateListAnimator);
        return c33012moSAEQbTJ;
    }

    public final C33012moS copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<? extends java.lang.Object> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, @NotNull C33012moS.PendingIntent pendingIntent, @NotNull C33012moS.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C33012moS c33012moSAEQbTJ = AEQbTJ(fragmentActivity, list, charSequence, charSequence2, z, pendingIntent, stateListAnimator);
        c33012moSAEQbTJ.show(fragmentActivity.getSupportFragmentManager(), C33012moS.class.getSimpleName());
        return c33012moSAEQbTJ;
    }
}
