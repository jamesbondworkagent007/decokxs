package o;

import com.amplitude.id.IdentityUpdateType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KH implements MK {
    public final C5241Kd AEQbTJ;

    public KH(@NotNull C5241Kd c5241Kd) {
        Intrinsics.checkNotNullParameter(c5241Kd, "");
        this.AEQbTJ = c5241Kd;
    }

    @Override // o.MK
    public void copydefault(java.lang.String str) {
        this.AEQbTJ.AEQbTJ(str);
    }

    @Override // o.MK
    public void EZpvd(java.lang.String str) {
        this.AEQbTJ.copydefault(str);
    }

    @Override // o.MK
    public void EZpvd(@NotNull MF mf, @NotNull IdentityUpdateType identityUpdateType) {
        Intrinsics.checkNotNullParameter(mf, "");
        Intrinsics.checkNotNullParameter(identityUpdateType, "");
        if (identityUpdateType == IdentityUpdateType.Initialized) {
            this.AEQbTJ.AEQbTJ(mf.EZpvd());
            this.AEQbTJ.copydefault(mf.OLrzqt());
        }
    }
}
