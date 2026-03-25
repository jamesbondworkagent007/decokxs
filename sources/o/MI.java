package o;

import com.amplitude.id.IdentityUpdateType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MI {

    public interface ActionBar {
        ActionBar AEQbTJ(java.lang.String str);

        void AEQbTJ();

        ActionBar KWHzl(java.lang.String str);
    }

    void AEQbTJ(@NotNull MF mf, @NotNull IdentityUpdateType identityUpdateType);

    ActionBar EZpvd();

    MF KWHzl();

    boolean OLrzqt();

    void copydefault(@NotNull MK mk);

    static /* synthetic */ void setIdentity$default(MI mi, MF mf, IdentityUpdateType identityUpdateType, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIdentity");
        }
        if ((i & 2) != 0) {
            identityUpdateType = IdentityUpdateType.Updated;
        }
        mi.AEQbTJ(mf, identityUpdateType);
    }
}
