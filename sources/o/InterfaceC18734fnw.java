package o;

import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressChainUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18734fnw {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, long j, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AddressChainUiData>, Unit>> continuation);

    /* JADX INFO: renamed from: o.fnw$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object invoke$default(InterfaceC18734fnw interfaceC18734fnw, java.lang.String str, Function1 function1, long j, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                j = 500;
            }
            return interfaceC18734fnw.AEQbTJ(str, function1, j, continuation);
        }
    }
}
