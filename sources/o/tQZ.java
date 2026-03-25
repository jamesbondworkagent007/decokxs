package o;

import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.usecase.ISingleFileUploadUseCase$invoke$1;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface tQZ {
    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull ImageItem imageItem, byte[] bArr, android.graphics.Bitmap bitmap, @NotNull Function2<? super java.lang.String, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super kotlin.Pair<SingleFileUploadUseCase.UploadedFile, java.lang.String>> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.tQZ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object invoke$default(tQZ tqz, android.content.Context context, ImageItem imageItem, byte[] bArr, android.graphics.Bitmap bitmap, Function2 function2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return tqz.AEQbTJ(context, imageItem, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : bitmap, (i & 16) != 0 ? new ISingleFileUploadUseCase$invoke$1(null) : function2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
