package o;

import com.okinc.wallet.api.bean.WalletRechargeBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19681gLj implements InterfaceC19683gLl {
    public final InterfaceC54829xWw EZpvd;

    @yCM
    public C19681gLj(@NotNull InterfaceC54829xWw interfaceC54829xWw) {
        Intrinsics.checkNotNullParameter(interfaceC54829xWw, "");
        this.EZpvd = interfaceC54829xWw;
    }

    @Override // o.InterfaceC19683gLl
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(this.EZpvd, abstractActivityC33041mov, new WalletRechargeBean(str, str2, "dex", "balance", (java.util.ArrayList) arrayList, (java.util.ArrayList) arrayList2, false, (java.lang.String) null, num != null ? num.intValue() : -1, 192, (DefaultConstructorMarker) null), 0, null, 12, null);
    }
}
