package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC28637keY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28577kdR {
    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull C55173xeu c55173xeu, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        Intrinsics.checkNotNullParameter(function0, "");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28577kdR.AEQbTJ(function0, view);
            }
        });
        java.lang.String string = fragment.getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setRetry(string);
        java.lang.String string2 = fragment.getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
    }

    public static /* synthetic */ void setupMemeViewPager$default(ViewPager2 viewPager2, RecyclerView.Adapter adapter, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        AEQbTJ(viewPager2, (RecyclerView.Adapter<?>) adapter, i, z);
    }

    public static final void AEQbTJ(@NotNull ViewPager2 viewPager2, @NotNull RecyclerView.Adapter<?> adapter, int i, boolean z) {
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        viewPager2.setAdapter(adapter);
        viewPager2.setOffscreenPageLimit(i);
        viewPager2.setUserInputEnabled(z);
    }

    public static final void AEQbTJ(@NotNull InterfaceC28637keY interfaceC28637keY, @NotNull android.view.View view, @NotNull android.view.View view2, @NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(interfaceC28637keY, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(list, "");
        view.setVisibility(interfaceC28637keY instanceof InterfaceC28637keY.StateListAnimator ? 0 : 8);
        view2.setVisibility(interfaceC28637keY instanceof InterfaceC28637keY.TaskDescription ? 0 : 8);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setVisibility(interfaceC28637keY instanceof InterfaceC28637keY.Activity ? 0 : 8);
        }
    }
}
