package o;

import com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC44588sZk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44595sZr {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sZo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44595sZr.copydefault();
        }
    });

    @yCM
    public C44595sZr() {
    }

    /* JADX INFO: renamed from: o.sZr$TaskDescription */
    public static final class TaskDescription implements InterfaceC44588sZk {
        public Flow<java.util.List<CallAuctionData>> OLrzqt() {
            return InterfaceC44588sZk.Activity.copydefault(this);
        }
    }

    public final TaskDescription AEQbTJ() {
        return (TaskDescription) this.copydefault.getValue();
    }

    public static final TaskDescription copydefault() {
        return new TaskDescription();
    }

    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends java.util.List<CallAuctionData>>> continuation) {
        return AEQbTJ().OLrzqt();
    }
}
