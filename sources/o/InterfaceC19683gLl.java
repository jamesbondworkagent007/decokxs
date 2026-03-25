package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19683gLl {
    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.lang.Integer num);

    /* JADX INFO: renamed from: o.gLl$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.gLl */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRechargeDialog$default(InterfaceC19683gLl interfaceC19683gLl, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRechargeDialog");
            }
            if ((i & 8) != 0) {
                arrayList = yDY.copydefault("dex", "gas_station");
            }
            interfaceC19683gLl.copydefault(abstractActivityC33041mov, str, str2, arrayList, (i & 16) != 0 ? null : arrayList2, (i & 32) != 0 ? null : num);
        }
    }
}
