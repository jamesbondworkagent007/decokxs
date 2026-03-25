package o;

import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.core.graphics.drawable.DrawableKt;
import com.bumptech.glide.Glide;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mDD {
    public final java.util.HashMap<java.lang.String, ImageBitmap> KWHzl = new java.util.HashMap<>();

    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super ImageBitmap> continuation) {
        ImageBitmap imageBitmap = this.KWHzl.get(str);
        if (imageBitmap != null && !AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap).isRecycled()) {
            return imageBitmap;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || !mHE.EZpvd(context)) {
            return null;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        StateListAnimator stateListAnimator = new StateListAnimator(cancellableContinuationImpl, new AtomicBoolean(false), this, str);
        Glide.AEQbTJ(context).EZpvd(str).OLrzqt(stateListAnimator);
        cancellableContinuationImpl.invokeOnCancellation(new Activity(context, stateListAnimator));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ mDD KWHzl;
        public final /* synthetic */ AtomicBoolean OLrzqt;
        public final /* synthetic */ CancellableContinuation<ImageBitmap> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.graphics.ImageBitmap> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super ImageBitmap> cancellableContinuation, AtomicBoolean atomicBoolean, mDD mdd, java.lang.String str) {
            this.copydefault = cancellableContinuation;
            this.OLrzqt = atomicBoolean;
            this.KWHzl = mdd;
            this.AEQbTJ = str;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            if (this.copydefault.isActive() && this.OLrzqt.compareAndSet(false, true)) {
                ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null));
                this.KWHzl.KWHzl.put(this.AEQbTJ, imageBitmapAsImageBitmap);
                CancellableContinuation<ImageBitmap> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(imageBitmapAsImageBitmap));
            }
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            if (this.copydefault.isActive() && this.OLrzqt.compareAndSet(false, true)) {
                CancellableContinuation<ImageBitmap> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(null));
            }
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            this.KWHzl.KWHzl.remove(this.AEQbTJ);
        }
    }

    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ StateListAnimator KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.content.Context context, StateListAnimator stateListAnimator) {
            this.OLrzqt = context;
            this.KWHzl = stateListAnimator;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Throwable th) {
            Glide.AEQbTJ(this.OLrzqt).EZpvd((InterfaceC5462Sq<?>) this.KWHzl);
        }
    }
}
