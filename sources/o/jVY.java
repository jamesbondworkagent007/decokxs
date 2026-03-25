package o;

import com.okinc.business.market.features.filter_tag.domain.FilterTagType;
import com.okinc.business.market.features.filter_tag.domain.GetFilterTagsUseCase$invoke$1;
import com.okinc.business.market.features.filter_tag.domain.GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVY {
    public final kKG AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final jVZ copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FilterTagType.values().length];
            try {
                iArr[FilterTagType.HOLDER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FilterTagType.TRADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterTagType.HISTORY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public jVY(@NotNull kKG kkg, @NotNull jVZ jvz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(jvz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = kkg;
        this.copydefault = jvz;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull FilterTagType filterTagType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<C26211jWa>>> continuation) {
        GetFilterTagsUseCase$invoke$1 getFilterTagsUseCase$invoke$1;
        if (continuation instanceof GetFilterTagsUseCase$invoke$1) {
            getFilterTagsUseCase$invoke$1 = (GetFilterTagsUseCase$invoke$1) continuation;
            int i = getFilterTagsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFilterTagsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getFilterTagsUseCase$invoke$1 = new GetFilterTagsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getFilterTagsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFilterTagsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String strCopydefault = this.AEQbTJ.copydefault(str2);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, filterTagType, this, str, strCopydefault, str2);
            getFilterTagsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getFilterTagsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
