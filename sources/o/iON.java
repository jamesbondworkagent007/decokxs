package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iON implements InterfaceC25466ixJ {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public final CoroutineScope KWHzl;
    public final android.content.Context OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public android.content.Context AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager getChildFragmentManager() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager getParentFragmentManager() {
        return this.AEQbTJ;
    }

    public iON(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = context;
        this.AEQbTJ = fragmentManager;
        this.KWHzl = coroutineScope;
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        android.content.Context context = this.OLrzqt;
        if (context instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) context;
        }
        return null;
    }
}
