package o;

import com.okinc.lifecycle.api.business.shortlink.ShortLinkFailureReason;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$getShortLinkInfo$1;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$1;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$2;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$3;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$4;
import com.okinc.lifecycle.impl.serviceImpl.core.CoreLifecycleLinkServiceImpl$processExternalLink$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AbstractC2726AWw;
import o.pKG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pOs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38167pOs extends AbstractC38168pOt {
    public static final int copydefault = ATC.$stable;
    public final java.lang.String EZpvd;
    public final ATC KWHzl;
    public final InterfaceC38120pMz OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC38168pOt
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    public C38167pOs(@NotNull ATC atc, @NotNull InterfaceC38120pMz interfaceC38120pMz) {
        Intrinsics.checkNotNullParameter(atc, "");
        Intrinsics.checkNotNullParameter(interfaceC38120pMz, "");
        this.KWHzl = atc;
        this.OLrzqt = interfaceC38120pMz;
        this.EZpvd = "CoreLifecycleLinkServiceImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super pKG> continuation) throws java.lang.Throwable {
        CoreLifecycleLinkServiceImpl$getShortLinkInfo$1 coreLifecycleLinkServiceImpl$getShortLinkInfo$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof CoreLifecycleLinkServiceImpl$getShortLinkInfo$1) {
            coreLifecycleLinkServiceImpl$getShortLinkInfo$1 = (CoreLifecycleLinkServiceImpl$getShortLinkInfo$1) continuation;
            int i = coreLifecycleLinkServiceImpl$getShortLinkInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coreLifecycleLinkServiceImpl$getShortLinkInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                coreLifecycleLinkServiceImpl$getShortLinkInfo$1 = new CoreLifecycleLinkServiceImpl$getShortLinkInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = coreLifecycleLinkServiceImpl$getShortLinkInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coreLifecycleLinkServiceImpl$getShortLinkInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AVV avvEZpvd = this.KWHzl.EZpvd(str);
            C33077mpe c33077mpe = new C33077mpe(new CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$1(avvEZpvd), new CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$2(avvEZpvd), new CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$3(avvEZpvd), new CoreLifecycleLinkServiceImpl$getShortLinkInfo$wrapper$4(avvEZpvd), null, 16, null);
            coreLifecycleLinkServiceImpl$getShortLinkInfo$1.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(coreLifecycleLinkServiceImpl$getShortLinkInfo$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        AbstractC2726AWw abstractC2726AWw = (AbstractC2726AWw) objAEQbTJ;
        if (abstractC2726AWw instanceof AbstractC2726AWw.ActionBar) {
            AbstractC2726AWw.ActionBar actionBar = (AbstractC2726AWw.ActionBar) abstractC2726AWw;
            return new pKG.ActionBar(actionBar.OLrzqt(), actionBar.AEQbTJ());
        }
        if (abstractC2726AWw instanceof AbstractC2726AWw.TaskDescription) {
            return new pKG.StateListAnimator(ShortLinkFailureReason.valueOf(((AbstractC2726AWw.TaskDescription) abstractC2726AWw).OLrzqt().name()));
        }
        return new pKG.StateListAnimator(ShortLinkFailureReason.API_FAIL);
    }

    @Override // o.pKD
    public boolean AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new CoreLifecycleLinkServiceImpl$processExternalLink$1(this, str, null), 1, null)).booleanValue();
    }

    @Override // o.pKD
    public void OLrzqt() {
        this.OLrzqt.copydefault();
    }
}
