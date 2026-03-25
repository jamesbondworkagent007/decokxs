package o;

import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.preview.domain.usecase.TwitterPreviewUseCase$invoke$1;
import com.okinc.business.market.features.meme.preview.domain.usecase.TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28800khc {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC28744kgZ KWHzl;
    public final C28804khg OLrzqt;

    /* JADX INFO: renamed from: o.khc$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XPostType.values().length];
            try {
                iArr[XPostType.POST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[XPostType.PROFILE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[XPostType.COMMUNITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C28800khc(@NotNull InterfaceC28744kgZ interfaceC28744kgZ, @NotNull C28804khg c28804khg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28744kgZ, "");
        Intrinsics.checkNotNullParameter(c28804khg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC28744kgZ;
        this.OLrzqt = c28804khg;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull XPostType xPostType, @NotNull Continuation<? super Result<C28807khj>> continuation) throws java.lang.Throwable {
        TwitterPreviewUseCase$invoke$1 twitterPreviewUseCase$invoke$1;
        if (continuation instanceof TwitterPreviewUseCase$invoke$1) {
            twitterPreviewUseCase$invoke$1 = (TwitterPreviewUseCase$invoke$1) continuation;
            int i = twitterPreviewUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twitterPreviewUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                twitterPreviewUseCase$invoke$1 = new TwitterPreviewUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = twitterPreviewUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = twitterPreviewUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 twitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new TwitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, xPostType, this, str, str2);
            twitterPreviewUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, twitterPreviewUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, twitterPreviewUseCase$invoke$1);
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

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8665invokeBWLJW6A$default(C28800khc c28800khc, java.lang.String str, java.lang.String str2, XPostType xPostType, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            xPostType = XPostType.PROFILE;
        }
        return c28800khc.EZpvd(str, str2, xPostType, continuation);
    }
}
