package o;

import androidx.core.view.MenuProvider;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36550odA implements MenuProvider {
    public OKConversation EZpvd;
    public boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(OKConversation oKConversation) {
        this.EZpvd = oKConversation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(@NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        return false;
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(@NotNull android.view.Menu menu, @NotNull android.view.MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        menuInflater.inflate(C35399nuc.FragmentManager.EZpvd, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(@NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        super.onPrepareMenu(menu);
        android.view.MenuItem menuItemFindItem = menu.findItem(C35399nuc.StateListAnimator.Th);
        android.view.View actionView = menuItemFindItem.getActionView();
        C35893oHp c35893oHp = actionView != null ? (C35893oHp) actionView.findViewById(C35399nuc.StateListAnimator.fiXcQa) : null;
        if (c35893oHp != null) {
            c35893oHp.setImageDrawable(C33070mpX.KWHzl(C35399nuc.ActionBar.QOLQEE));
        }
        menuItemFindItem.setEnabled(this.OLrzqt);
    }

    public static /* synthetic */ void setIsEnabledForAction$default(C36550odA c36550odA, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c36550odA.OLrzqt(z);
    }
}
