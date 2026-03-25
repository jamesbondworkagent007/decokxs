package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31214lpm extends AbstractC32998moE {
    public C58216yxB QfsBiF = new C58216yxB();

    public void OLrzqt() {
    }

    public void bc_() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB gasjUx() {
        return this.QfsBiF;
    }

    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return -1;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.QfsBiF = new C58216yxB();
        super.onViewCreated(view, bundle);
        bc_();
    }

    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.QfsBiF.dispose();
    }
}
