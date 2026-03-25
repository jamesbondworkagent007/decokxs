package o;

import com.okinc.business.defi.biz.database.wallet.entity.PartTeeStatusInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$getMaxExpiredTimestampAndCreatedTrue$2;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$insert$2;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$insertTeeStatusList$2;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$setHasShowExpiredAlert$2;
import com.okinc.business.defi.biz.database.wallet.repository.TeeStatusInfoRepository$updatePart$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11498cQm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final cKU copydefault;

    /* JADX INFO: renamed from: o.cQm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cQm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C11498cQm getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.OLrzqt(context);
        }

        public final C11498cQm OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).uzCIH();
        }
    }

    public C11498cQm(@NotNull cKU cku) {
        Intrinsics.checkNotNullParameter(cku, "");
        this.copydefault = cku;
    }

    public final java.lang.Object copydefault(@NotNull TeeStatusInfoEntity teeStatusInfoEntity, @NotNull Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$insert$2(this, teeStatusInfoEntity, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull PartTeeStatusInfoEntity partTeeStatusInfoEntity, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$updatePart$2(this, partTeeStatusInfoEntity, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<TeeStatusInfoEntity> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$insertTeeStatusList$2(this, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super TeeStatusInfoEntity> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$getTeeStatusInfoByAccountId$2(this, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$setHasShowExpiredAlert$2(this, str, z, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super TeeStatusInfoEntity> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TeeStatusInfoRepository$getMaxExpiredTimestampAndCreatedTrue$2(this, null), continuation);
    }
}
