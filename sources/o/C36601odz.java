package o;

import android.view.View;
import androidx.core.view.MenuProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36601odz implements MenuProvider {
    public final MenuProvider AEQbTJ;
    public Function1<? super android.view.MenuItem, java.lang.Boolean> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super android.view.MenuItem, java.lang.Boolean> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.MenuItem, java.lang.Boolean>, kotlin.jvm.functions.Function1<android.view.MenuItem, java.lang.Boolean> */
    public final Function1<android.view.MenuItem, java.lang.Boolean> copydefault() {
        return this.EZpvd;
    }

    public C36601odz(@NotNull MenuProvider menuProvider) {
        Intrinsics.checkNotNullParameter(menuProvider, "");
        this.AEQbTJ = menuProvider;
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(@NotNull android.view.Menu menu, @NotNull android.view.MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        this.AEQbTJ.onCreateMenu(menu, menuInflater);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(@NotNull android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        Function1<? super android.view.MenuItem, java.lang.Boolean> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(menuItem);
        }
        return this.AEQbTJ.onMenuItemSelected(menuItem);
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(@NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        this.AEQbTJ.onPrepareMenu(menu);
        android.view.MenuItem menuItemFindItem = menu.findItem(C35399nuc.StateListAnimator.Th);
        android.view.View actionView = menuItemFindItem.getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new StateListAnimator(actionView, 1000L, menuItemFindItem, this));
        }
    }

    @Override // androidx.core.view.MenuProvider
    public void onMenuClosed(@NotNull android.view.Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "");
        this.AEQbTJ.onMenuClosed(menu);
    }

    /* JADX INFO: renamed from: o.odz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.MenuItem AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C36601odz KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.MenuItem menuItem, C36601odz c36601odz) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = menuItem;
            this.KWHzl = c36601odz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1<android.view.MenuItem, java.lang.Boolean> function1Copydefault;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!this.AEQbTJ.isEnabled() || (function1Copydefault = this.KWHzl.copydefault()) == null) {
                    return;
                }
                Intrinsics.copydefault(this.AEQbTJ);
                function1Copydefault.invoke(this.AEQbTJ);
            }
        }
    }
}
