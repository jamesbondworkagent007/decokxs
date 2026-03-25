package o;

import com.okinc.im.imui.glide.model.IMImageModel;
import kotlin.jvm.internal.Intrinsics;
import o.C5377Pj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34055nPt implements InterfaceC5390Pw<IMImageModel, java.io.InputStream> {
    @Override // o.InterfaceC5390Pw
    public void AEQbTJ() {
    }

    @Override // o.InterfaceC5390Pw
    public InterfaceC5386Ps<IMImageModel, java.io.InputStream> AEQbTJ(@NotNull PA pa) {
        Intrinsics.checkNotNullParameter(pa, "");
        InterfaceC5386Ps interfaceC5386PsOLrzqt = pa.OLrzqt(android.net.Uri.class, java.io.InputStream.class);
        Intrinsics.checkNotNullExpressionValue(interfaceC5386PsOLrzqt, "");
        InterfaceC5386Ps interfaceC5386PsAEQbTJ = new C5377Pj.ActionBar().AEQbTJ(pa);
        Intrinsics.checkNotNullExpressionValue(interfaceC5386PsAEQbTJ, "");
        return new C34054nPs(interfaceC5386PsOLrzqt, interfaceC5386PsAEQbTJ);
    }
}
