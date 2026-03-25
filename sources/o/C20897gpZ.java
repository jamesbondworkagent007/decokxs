package o;

import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20897gpZ implements InterfaceC20888gpQ {
    public final C20959gqi OLrzqt;

    public C20897gpZ(@NotNull C20959gqi c20959gqi) {
        Intrinsics.checkNotNullParameter(c20959gqi, "");
        this.OLrzqt = c20959gqi;
    }

    @Override // o.InterfaceC20888gpQ
    public java.util.ArrayList<AddressGroupBean> KWHzl() {
        return this.OLrzqt.copydefault().getValue();
    }

    @Override // o.InterfaceC20888gpQ
    public java.lang.String EZpvd() {
        return this.OLrzqt.KWHzl();
    }

    @Override // o.InterfaceC20888gpQ
    public java.lang.Integer copydefault() {
        return this.OLrzqt.valueOf();
    }
}
