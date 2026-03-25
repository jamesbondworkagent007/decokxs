package o;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.core.LinkStatus;
import com.okinc.lifecycle.impl.deeplink.handler.ShortCodeLinkHandler$executeLink$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pLV implements InterfaceC43236rlV {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final pMI AEQbTJ;
    public final InterfaceC43294rma EZpvd;
    public final InterfaceC38081pLn KWHzl;
    public final InterfaceC38084pLq copydefault;

    @yCM
    public pLV(@NotNull InterfaceC43294rma interfaceC43294rma, @NotNull pMI pmi, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq) {
        Intrinsics.checkNotNullParameter(interfaceC43294rma, "");
        Intrinsics.checkNotNullParameter(pmi, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        this.EZpvd = interfaceC43294rma;
        this.AEQbTJ = pmi;
        this.KWHzl = interfaceC38081pLn;
        this.copydefault = interfaceC38084pLq;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ShortCodeLinkHandler$executeLink$1(this, interfaceC43232rlR, context, map, null), 3, null);
    }

    public final void EZpvd(LinkState linkState) {
        this.KWHzl.OLrzqt(linkState);
        this.copydefault.EZpvd();
        this.copydefault.KWHzl("", LinkStatus.FAIL.getStatus());
        this.KWHzl.OLrzqt();
    }
}
