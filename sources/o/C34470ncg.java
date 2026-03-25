package o;

import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.InterfaceC34465ncb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34470ncg implements InterfaceC34464nca {
    public final androidx.fragment.app.Fragment copydefault;

    public C34470ncg(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
    }

    @Override // o.InterfaceC34464nca
    public void AEQbTJ(@NotNull InterfaceC34465ncb interfaceC34465ncb) {
        Intrinsics.checkNotNullParameter(interfaceC34465ncb, "");
        if (interfaceC34465ncb instanceof InterfaceC34465ncb.TaskDescription) {
            EZpvd((InterfaceC34465ncb.TaskDescription) interfaceC34465ncb);
        } else if (interfaceC34465ncb instanceof InterfaceC34465ncb.Activity) {
            OLrzqt(((InterfaceC34465ncb.Activity) interfaceC34465ncb).EZpvd());
        }
    }

    public final void EZpvd(InterfaceC34465ncb.TaskDescription taskDescription) {
        android.content.Context contextRequireContext = this.copydefault.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        mUO.AEQbTJ(contextRequireContext, taskDescription.EZpvd(), taskDescription.OLrzqt(), C35964oKf.Fragment.DcMfJKDDUqPf);
    }

    private final void OLrzqt(java.lang.String str) {
        mUO.OLrzqt(this.copydefault.requireContext(), str);
    }
}
