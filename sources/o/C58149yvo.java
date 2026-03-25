package o;

import io.reactivex.processors.BehaviorProcessor;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import o.InterfaceC58092yuk;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58149yvo extends WebSocketListener {
    public final yBC<InterfaceC58092yuk.Activity> AEQbTJ;

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.yBC<T>, java.lang.Object, o.yBC<o.yuk$Activity> */
    public C58149yvo() {
        yBC ybcFetchVPNInfo = BehaviorProcessor.values().fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(ybcFetchVPNInfo, "");
        this.AEQbTJ = ybcFetchVPNInfo;
    }

    public final AbstractC58185ywX<InterfaceC58092yuk.Activity> AEQbTJ() {
        AbstractC58185ywX<InterfaceC58092yuk.Activity> abstractC58185ywXAYXKKw = this.AEQbTJ.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAYXKKw, "");
        return abstractC58185ywXAYXKKw;
    }

    public final void OLrzqt() {
        this.AEQbTJ.onComplete();
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(response, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.TaskDescription(webSocket));
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.C1015Activity(new AbstractC58082yua.ActionBar(byteString.toByteArray())));
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(@NotNull WebSocket webSocket, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.C1015Activity(new AbstractC58082yua.TaskDescription(str)));
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.StateListAnimator(new C58088yug(i, str)));
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.Application(new C58088yug(i, str)));
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(@NotNull WebSocket webSocket, @NotNull java.lang.Throwable th, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "");
        Intrinsics.checkNotNullParameter(th, "");
        this.AEQbTJ.onNext(new InterfaceC58092yuk.Activity.ActionBar(th));
    }
}
