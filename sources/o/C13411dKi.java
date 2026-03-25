package o;

import com.okinc.business.defi.biz.net.bean.ListChainResponse;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.deeplink.DefiWalletReferralTokenDetailLinkHandler$executeLink$1;
import com.okinc.business.defi.deeplink.DefiWalletReferralTokenDetailLinkHandler$getChainIdAndJump$2;
import com.okinc.wallet.api.WalletReferralSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13411dKi implements InterfaceC43236rlV {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.dKi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dKi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("ref");
        java.lang.String string = obj != null ? obj.toString() : null;
        java.lang.String strAEQbTJ = interfaceC43232rlR.AEQbTJ();
        java.lang.String str = string == null ? "" : string;
        ReferralManager.StateListAnimator stateListAnimator = ReferralManager.Companion;
        java.lang.String strAhwBna = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).AhwBna(strAEQbTJ, "token");
        java.lang.String strValueOf = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).valueOf(strAEQbTJ, "token");
        if (strAhwBna == null || strAhwBna.length() == 0 || strValueOf == null || strValueOf.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new DefiWalletReferralTokenDetailLinkHandler$executeLink$1(context, this, strAhwBna, strValueOf, str, null), 2, null);
    }

    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<ListChainResponse> list, Continuation<? super Unit> continuation) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ListChainResponse) next).getSeoChainFullName())) {
                break;
            }
        }
        ListChainResponse listChainResponse = (ListChainResponse) next;
        java.lang.Long chainIndex = listChainResponse != null ? listChainResponse.getChainIndex() : null;
        if (chainIndex != null) {
            java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new DefiWalletReferralTokenDetailLinkHandler$getChainIdAndJump$2(this, chainIndex, str2, str3, null), continuation);
            return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ListChainResponse) it2.next()).getSeoChainFullName());
        }
        pUU.valueOf("DefiWalletReferralTokenDetailLinkHandler", "Chain not found in supported list: " + str + ", available chains: " + arrayList);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || activityAEQbTJ.isFinishing() || activityAEQbTJ.isDestroyed()) {
            return;
        }
        gKZ gkz = gKZ.EZpvd;
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activityAEQbTJ, gkz.OLrzqt(gkz.KWHzl("dex/coin/detail"), C56390yDp.OLrzqt("chainId", str), C56390yDp.OLrzqt("tokenContractAddress", str2), C56390yDp.OLrzqt("ref", str3), C56390yDp.OLrzqt("shareFrom", WalletReferralSource.TOKEN_INFO_URL.getEvent())), null, new Function1() { // from class: o.dKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13411dKi.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
