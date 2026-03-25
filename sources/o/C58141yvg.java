package o;

import com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket$open$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import o.InterfaceC58092yuk;
import o.InterfaceC60094zvb;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58141yvg implements InterfaceC58092yuk {
    public final Activity KWHzl;
    public final C58149yvo OLrzqt;
    public final C58146yvl copydefault;

    /* JADX INFO: renamed from: o.yvg$Activity */
    public interface Activity {
        void AEQbTJ(@NotNull WebSocketListener webSocketListener);
    }

    public C58141yvg(@NotNull C58146yvl c58146yvl, @NotNull C58149yvo c58149yvo, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(c58146yvl, "");
        Intrinsics.checkNotNullParameter(c58149yvo, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = c58146yvl;
        this.OLrzqt = c58149yvo;
        this.KWHzl = activity;
    }

    @Override // o.InterfaceC58092yuk
    public InterfaceC58090yui<InterfaceC58092yuk.Activity> AEQbTJ() {
        AbstractC58185ywX<InterfaceC58092yuk.Activity> abstractC58185ywXAEQbTJ = this.OLrzqt.AEQbTJ();
        final Function1<InterfaceC60094zvb, Unit> function1 = new Function1<InterfaceC60094zvb, Unit>() { // from class: com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket$open$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC60094zvb interfaceC60094zvb) {
                invoke2(interfaceC60094zvb);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InterfaceC60094zvb interfaceC60094zvb) {
                this.this$0.KWHzl.AEQbTJ(this.this$0.OLrzqt);
            }
        };
        AbstractC58185ywX<InterfaceC58092yuk.Activity> abstractC58185ywXEZpvd = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.yvi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C58141yvg.copydefault(function1, obj);
            }
        });
        final OkHttpWebSocket$open$2 okHttpWebSocket$open$2 = new OkHttpWebSocket$open$2(this);
        AbstractC58185ywX<InterfaceC58092yuk.Activity> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58227yxM() { // from class: o.yvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C58141yvg.AEQbTJ(okHttpWebSocket$open$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return C58135yva.AEQbTJ(abstractC58185ywXKWHzl);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
    }

    @Override // o.InterfaceC58092yuk
    public boolean AEQbTJ(@NotNull AbstractC58082yua abstractC58082yua) {
        boolean zSend;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(abstractC58082yua, "");
            if (abstractC58082yua instanceof AbstractC58082yua.TaskDescription) {
                zSend = this.copydefault.send(((AbstractC58082yua.TaskDescription) abstractC58082yua).KWHzl());
            } else if (abstractC58082yua instanceof AbstractC58082yua.ActionBar) {
                byte[] bArrKWHzl = ((AbstractC58082yua.ActionBar) abstractC58082yua).KWHzl();
                zSend = this.copydefault.send(ByteString.Companion.of(bArrKWHzl, 0, bArrKWHzl.length));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return zSend;
    }

    @Override // o.InterfaceC58092yuk
    public boolean AEQbTJ(@NotNull C58088yug c58088yug) {
        boolean zClose;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c58088yug, "");
            zClose = this.copydefault.close(c58088yug.EZpvd(), c58088yug.KWHzl());
        }
        return zClose;
    }

    @Override // o.InterfaceC58092yuk
    public void EZpvd() {
        synchronized (this) {
            this.copydefault.cancel();
        }
    }

    public final void copydefault(InterfaceC58092yuk.Activity activity) {
        if (activity instanceof InterfaceC58092yuk.Activity.TaskDescription) {
            C58146yvl c58146yvl = this.copydefault;
            java.lang.Object objAEQbTJ = ((InterfaceC58092yuk.Activity.TaskDescription) activity).AEQbTJ();
            Intrinsics.copydefault(objAEQbTJ, "");
            c58146yvl.OLrzqt((WebSocket) objAEQbTJ);
            return;
        }
        if (activity instanceof InterfaceC58092yuk.Activity.StateListAnimator) {
            AEQbTJ(C58088yug.copydefault);
        } else if ((activity instanceof InterfaceC58092yuk.Activity.Application) || (activity instanceof InterfaceC58092yuk.Activity.ActionBar)) {
            copydefault();
        }
    }

    public final void copydefault() {
        synchronized (this) {
            this.copydefault.copydefault();
            this.OLrzqt.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.yvg$ActionBar */
    public static final class ActionBar implements InterfaceC58092yuk.Application {
        public final Activity OLrzqt;

        public ActionBar(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.OLrzqt = activity;
        }

        @Override // o.InterfaceC58092yuk.Application
        public InterfaceC58092yuk AEQbTJ() {
            return new C58141yvg(new C58146yvl(), new C58149yvo(), this.OLrzqt);
        }
    }
}
