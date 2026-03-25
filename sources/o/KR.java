package o;

import com.amplitude.core.Storage;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KR implements Storage {
    public final java.util.List<C5242Ke> EZpvd = new java.util.ArrayList();
    public final java.lang.Object KWHzl = new java.lang.Object();
    public final ConcurrentHashMap<java.lang.String, java.lang.String> OLrzqt = new ConcurrentHashMap<>();

    @Override // com.amplitude.core.Storage
    public java.lang.Object EZpvd(@NotNull C5242Ke c5242Ke, @NotNull Continuation<? super Unit> continuation) {
        synchronized (this.KWHzl) {
            this.EZpvd.add(c5242Ke);
        }
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.Object EZpvd(@NotNull Storage.Constants constants, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.put(constants.getRawVal(), str);
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.amplitude.core.Storage
    public java.lang.String copydefault(@NotNull Storage.Constants constants) {
        Intrinsics.checkNotNullParameter(constants, "");
        return this.OLrzqt.get(constants.getRawVal());
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.util.List<java.lang.Object> OLrzqt() {
        java.util.List listAxsJAYsNCnLh;
        synchronized (this.KWHzl) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd);
            this.EZpvd.clear();
            Unit unit = Unit.INSTANCE;
        }
        return C56402yEa.EZpvd(listAxsJAYsNCnLh);
    }

    @Override // com.amplitude.core.Storage, o.KO
    public java.lang.Object EZpvd(@NotNull java.lang.Object obj, @NotNull Continuation<? super java.lang.String> continuation) {
        KW kw = KW.KWHzl;
        Intrinsics.copydefault(obj, "");
        return kw.OLrzqt((java.util.List<? extends C5242Ke>) obj);
    }

    @Override // com.amplitude.core.Storage
    public InterfaceC5274Lk copydefault(@NotNull C5255Kr c5255Kr, @NotNull C5244Kg c5244Kg, @NotNull CoroutineScope coroutineScope, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c5255Kr, "");
        Intrinsics.checkNotNullParameter(c5244Kg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new KU(c5255Kr, c5244Kg, coroutineScope, coroutineDispatcher);
    }

    public final void EZpvd() {
        synchronized (this.KWHzl) {
            this.EZpvd.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
