package o;

import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.usecase.referral.GetReferralDataUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35856oGf {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC44177sGd AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35856oGf(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC44177sGd;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oGf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ReferralData> continuation) {
        return BuildersKt.withContext(this.KWHzl, new GetReferralDataUseCase$execute$2(this, str, str2, null), continuation);
    }
}
