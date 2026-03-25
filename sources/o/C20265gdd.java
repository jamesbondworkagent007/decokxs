package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20265gdd extends C20267gdf<C8972bMm<?>> {
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
        return ((C8972bMm) ejfBZ()).copydefault(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String OLrzqt(boolean z) {
        return ((C8972bMm) ejfBZ()).copydefault(this.copydefault, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((C8972bMm) ejfBZ()).copydefault(this.copydefault, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20267gdf, o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String EZpvd(boolean z) {
        return ((C8972bMm) ejfBZ()).OLrzqt(this.copydefault, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String EZpvd() {
        return ((C8972bMm) ejfBZ()).KWHzl(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20267gdf, o.C20264gdc, o.AbstractC20202gcT
    public java.lang.String OLrzqt() {
        return ((C8972bMm) ejfBZ()).OLrzqt(this.copydefault);
    }
}
