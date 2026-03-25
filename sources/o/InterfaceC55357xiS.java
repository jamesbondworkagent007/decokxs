package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55357xiS {
    void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR, boolean z);

    /* JADX INFO: renamed from: o.xiS$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void applyState$default(InterfaceC55357xiS interfaceC55357xiS, C55425xjh c55425xjh, C55356xiR c55356xiR, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyState");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC55357xiS.AEQbTJ(c55425xjh, c55356xiR, z);
        }
    }
}
