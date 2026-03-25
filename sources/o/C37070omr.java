package o;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.omr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37070omr implements InterfaceC57901yrE {
    public final MessageListViewModel EZpvd;

    public C37070omr(@NotNull MessageListViewModel messageListViewModel) {
        Intrinsics.checkNotNullParameter(messageListViewModel, "");
        this.EZpvd = messageListViewModel;
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        this.EZpvd.fARcdN();
    }

    @Override // o.InterfaceC57900yrD
    public void EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        this.EZpvd.fJNWhG();
    }
}
