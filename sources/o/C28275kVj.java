package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28275kVj implements InterfaceC28276kVk {
    public final kYD EZpvd;

    @yCM
    public C28275kVj(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.EZpvd = kyd;
    }

    @Override // o.InterfaceC28276kVk
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return this.EZpvd.valueOf(continuation);
    }

    @Override // o.InterfaceC28276kVk
    public java.util.ArrayList<DefiChainInfo> OLrzqt() {
        return new java.util.ArrayList<>(this.EZpvd.gEmmrt());
    }

    @Override // o.InterfaceC28276kVk
    public void copydefault(@NotNull java.util.List<DefiChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.copydefault(list);
    }
}
