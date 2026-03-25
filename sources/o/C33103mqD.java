package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33103mqD extends AbstractC43215rlA implements InterfaceC33172mrT {
    @Override // o.InterfaceC33172mrT
    public void copydefault(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle) {
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class);
        if (interfaceC33171mrS.ejfBZ()) {
            i = 2;
        } else {
            i = interfaceC33171mrS.fJNWhG() ? 5 : 1;
        }
        InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, i, false, 0, bundle, null, 32, null);
    }

    @Override // o.InterfaceC33172mrT
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (str != null) {
            bundle.putString("path", str);
        }
        copydefault(context, bundle);
    }
}
