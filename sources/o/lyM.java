package o;

import com.okinc.buysell.data.GetBannerResp;
import com.okinc.buysell.domain.GetBannersUseCase$invoke$1;
import com.okinc.buysell.domain.GetBannersUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyM {
    public final InterfaceC31764mDa AEQbTJ;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final int EZpvd = 300;

    @yCM
    public lyM(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.AEQbTJ = interfaceC31764mDa;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyM lym, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return lym.EZpvd(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super AbstractC43419rot<GetBannerResp, OKServerException>> continuation) throws java.lang.Throwable {
        GetBannersUseCase$invoke$1 getBannersUseCase$invoke$1;
        if (continuation instanceof GetBannersUseCase$invoke$1) {
            getBannersUseCase$invoke$1 = (GetBannersUseCase$invoke$1) continuation;
            int i = getBannersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBannersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getBannersUseCase$invoke$1 = new GetBannersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getBannersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBannersUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            GetBannersUseCase$invoke$2 getBannersUseCase$invoke$2 = new GetBannersUseCase$invoke$2(z, this, null);
            getBannersUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, getBannersUseCase$invoke$2, getBannersUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objWithContext;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(lyC.AEQbTJ.KWHzl((GetBannerBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final int EZpvd() {
            return lyM.EZpvd;
        }
    }
}
