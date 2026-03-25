package o;

import com.okinc.business.market.features.meme.aped_together.domain.FetchApedTogetherUseCase$invoke$1;
import com.okinc.business.market.features.meme.aped_together.domain.FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28655keq {
    public final C29715kyq AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC28656ker KWHzl;
    public final jAH OLrzqt;
    public final C27634jyr copydefault;

    @yCM
    public C28655keq(@NotNull InterfaceC28656ker interfaceC28656ker, @NotNull C27634jyr c27634jyr, @NotNull jAH jah, @NotNull C29715kyq c29715kyq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28656ker, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC28656ker;
        this.copydefault = c27634jyr;
        this.OLrzqt = jah;
        this.AEQbTJ = c29715kyq;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8663invokeyxL6bBk$default(C28655keq c28655keq, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return c28655keq.copydefault(str, str2, str3, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Continuation<? super Result<? extends java.util.List<C28653keo>>> continuation) throws java.lang.Throwable {
        FetchApedTogetherUseCase$invoke$1 fetchApedTogetherUseCase$invoke$1;
        if (continuation instanceof FetchApedTogetherUseCase$invoke$1) {
            fetchApedTogetherUseCase$invoke$1 = (FetchApedTogetherUseCase$invoke$1) continuation;
            int i2 = fetchApedTogetherUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchApedTogetherUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                fetchApedTogetherUseCase$invoke$1 = new FetchApedTogetherUseCase$invoke$1(this, continuation);
            }
        }
        FetchApedTogetherUseCase$invoke$1 fetchApedTogetherUseCase$invoke$12 = fetchApedTogetherUseCase$invoke$1;
        java.lang.Object objWithContext = fetchApedTogetherUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = fetchApedTogetherUseCase$invoke$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 fetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new FetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, this, str, str3, str2, i);
            fetchApedTogetherUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchApedTogetherUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, fetchApedTogetherUseCase$invoke$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
