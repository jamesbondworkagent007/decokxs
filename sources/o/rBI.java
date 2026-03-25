package o;

import com.okinc.ok_kyc_core.domain.usecase.ISingleFileUploadUseCase$invoke$1;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rBI {
    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.io.File file, byte[] bArr, @NotNull java.lang.String str, int i, @NotNull SingleFileUploadUseCase.FileType fileType, boolean z, @NotNull Function2<? super java.lang.String, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super kotlin.Pair<SingleFileUploadUseCase.UploadedFile, java.lang.String>> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.rBI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object invoke$default(rBI rbi, android.content.Context context, java.io.File file, byte[] bArr, java.lang.String str, int i, SingleFileUploadUseCase.FileType fileType, boolean z, Function2 function2, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return rbi.AEQbTJ(context, file, bArr, str, i, fileType, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? new ISingleFileUploadUseCase$invoke$1(null) : function2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
