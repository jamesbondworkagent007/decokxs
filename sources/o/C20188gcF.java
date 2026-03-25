package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20188gcF extends C20264gdc<C9100bPH> {
    public int copydefault;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getInt("index") : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public InterfaceC9730bbB.StateListAnimator AEQbTJ() {
        return ((C9100bPH) ejfBZ()).copydefault(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String OLrzqt(boolean z) {
        return ((C9100bPH) ejfBZ()).copydefault(this.copydefault, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C9100bPH) ejfBZ()).copydefault(this.copydefault, str);
    }
}
