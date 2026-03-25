package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.domain.usecase.getchainlist.GetLimitChainListBehavior$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import o.InterfaceC28245kUg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUO implements kUJ {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final kYD KWHzl;

    @yCM
    public kUO(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.KWHzl = kyd;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kUO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kUJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        GetLimitChainListBehavior$invoke$1 getLimitChainListBehavior$invoke$1;
        if (continuation instanceof GetLimitChainListBehavior$invoke$1) {
            getLimitChainListBehavior$invoke$1 = (GetLimitChainListBehavior$invoke$1) continuation;
            int i = getLimitChainListBehavior$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLimitChainListBehavior$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLimitChainListBehavior$invoke$1 = new GetLimitChainListBehavior$invoke$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = getLimitChainListBehavior$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLimitChainListBehavior$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            kYD kyd = this.KWHzl;
            getLimitChainListBehavior$invoke$1.label = 1;
            objDjBIcL = kyd.djBIcL(getLimitChainListBehavior$invoke$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objDjBIcL;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            pUU.KWHzl("GetLimitChainListBehavior", "swap limit, supportLimitSwap=" + CollectionsKt___CollectionsKt.joinToString$default((java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl(), null, "[", "]", 0, null, new Function1() { // from class: o.kUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kUO.EZpvd((DefiChainInfo) obj);
                }
            }, 25, null));
        }
        return abstractC43419rot;
    }

    public static final java.lang.CharSequence EZpvd(DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        return defiChainInfo.getChainId() + ":" + defiChainInfo.getSupportLimitSwap();
    }

    @Override // o.kUJ
    public java.util.List<DefiChainInfo> AEQbTJ() {
        return this.KWHzl.KWHzl();
    }

    @Override // o.kUJ
    public InterfaceC28245kUg EZpvd(@NotNull C28243kUe c28243kUe) {
        Intrinsics.checkNotNullParameter(c28243kUe, "");
        if (c28243kUe.KWHzl() == TradeMode.Advanced && !c28243kUe.copydefault().getSupportCefiMode()) {
            return InterfaceC28245kUg.StateListAnimator.OLrzqt;
        }
        return InterfaceC28245kUg.Activity.copydefault;
    }
}
