package o;

import androidx.core.view.MenuProvider;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nuS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35389nuS implements MenuProvider {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(@NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return false;
    }

    @yCM
    public C35389nuS() {
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(@NotNull android.view.Menu menu, @NotNull android.view.MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        menuInflater.inflate(C35399nuc.FragmentManager.OLrzqt, menu);
    }
}
