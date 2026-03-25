package o;

import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43040rhl extends InterfaceC43015rhM {
    java.lang.String AEQbTJ(boolean z);

    void copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, @NotNull AbstractC48864udi.ActionBar actionBar);

    /* JADX INFO: renamed from: o.rhl$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void updateMiniApp$default(InterfaceC43040rhl interfaceC43040rhl, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, AbstractC48864udi.ActionBar actionBar, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMiniApp");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC43040rhl.copydefault(str, str2, str3, z, actionBar);
        }

        public static /* synthetic */ java.lang.String getUpdateAccount$default(InterfaceC43040rhl interfaceC43040rhl, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpdateAccount");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC43040rhl.AEQbTJ(z);
        }
    }
}
