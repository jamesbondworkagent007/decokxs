package o;

import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import com.okinc.business.defi.biz.database.extra.repository.SupportPnlChainDatabaseRepository$getPnlChainList$2;
import com.okinc.business.defi.biz.database.extra.repository.SupportPnlChainDatabaseRepository$savePnlChainList$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11285cIo {
    public final cHZ AEQbTJ;
    public final CoroutineDispatcher copydefault;

    public C11285cIo(@NotNull cHZ chz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(chz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = chz;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 o.cHZ)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:19)) : (r2v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.cHZ, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:17) call: o.cIo.<init>(o.cHZ, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C11285cIo(cHZ chz, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chz, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<SupportPnlChainEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(this.copydefault, new SupportPnlChainDatabaseRepository$savePnlChainList$2(this, list, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<SupportPnlChainEntity>> continuation) {
        return BuildersKt.withContext(this.copydefault, new SupportPnlChainDatabaseRepository$getPnlChainList$2(this, null), continuation);
    }
}
