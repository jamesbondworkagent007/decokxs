package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.loy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31173loy {
    public final int AEQbTJ;
    public final Function1<java.lang.Boolean, Unit> AYXKKw;
    public final TransactionType AhwBna;
    public final Function0<java.lang.Boolean> EZpvd;
    public final Function1<java.lang.Boolean, Unit> KWHzl;
    public Function2<? super C55001xbh, ? super java.lang.String, Unit> OLrzqt;
    public boolean copydefault;
    public final TokenBase djBIcL;
    public final Function0<AbstractC31124loB> fetchVPNInfo;
    public final AbstractC28336kXq gEmmrt;
    public final Function0<C25265itU> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.kXq)
  (r2v0 com.okinc.business.dex.api.bean.TokenBase)
  (r3v0 int)
  (r4v0 com.okinc.business.dexlogic.bean.TransactionType)
  (r5v0 kotlin.jvm.functions.Function0)
  (r6v0 kotlin.jvm.functions.Function0)
  (r7v0 kotlin.jvm.functions.Function0)
  (r8v0 kotlin.jvm.functions.Function1)
  (r9v0 kotlin.jvm.functions.Function1)
 A[MD:(o.kXq, com.okinc.business.dex.api.bean.TokenBase, int, com.okinc.business.dexlogic.bean.TransactionType, kotlin.jvm.functions.Function0<? extends o.loB>, kotlin.jvm.functions.Function0<o.itU>, kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>):void (m)] call: o.loy.<init>(o.kXq, com.okinc.business.dex.api.bean.TokenBase, int, com.okinc.business.dexlogic.bean.TransactionType, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C31173loy(AbstractC28336kXq abstractC28336kXq, TokenBase tokenBase, int i, TransactionType transactionType, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC28336kXq, tokenBase, i, transactionType, function0, function02, function03, function1, function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function0<? extends o.loB> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31173loy(AbstractC28336kXq abstractC28336kXq, TokenBase tokenBase, int i, TransactionType transactionType, Function0<? extends AbstractC31124loB> function0, Function0<C25265itU> function02, Function0<java.lang.Boolean> function03, Function1<? super java.lang.Boolean, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC28336kXq, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.gEmmrt = abstractC28336kXq;
        this.djBIcL = tokenBase;
        this.AEQbTJ = i;
        this.AhwBna = transactionType;
        this.fetchVPNInfo = function0;
        this.valueOf = function02;
        this.EZpvd = function03;
        this.KWHzl = function1;
        this.AYXKKw = function12;
    }

    public final boolean OLrzqt(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && !C23313hvq.copydefault(str, 0) && C31194lpS.copydefault(str);
    }

    public final void copydefault() {
        this.gEmmrt.AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
    }

    public final void KWHzl() {
        C25265itU c25265itUInvoke;
        if (!C31172lox.KWHzl(this.AEQbTJ, C31172lox.Companion.OLrzqt()) || (c25265itUInvoke = this.valueOf.invoke()) == null) {
            return;
        }
        c25265itUInvoke.EZpvd();
    }

    public final void EZpvd(java.lang.String str) {
        if (this.AhwBna == TransactionType.Buy) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.gEmmrt.copydefault(this.djBIcL.getChainId(), this.djBIcL.getTokenContractAddress());
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            this.gEmmrt.KWHzl(str, tokenContractAddress);
        }
    }

    public final void AEQbTJ() {
        AbstractC31124loB abstractC31124loBInvoke;
        if (this.copydefault || (abstractC31124loBInvoke = this.fetchVPNInfo.invoke()) == null) {
            return;
        }
        if (this.OLrzqt == null) {
            this.OLrzqt = new Function2() { // from class: o.loz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C31173loy.AEQbTJ(this.AEQbTJ, (C55001xbh) obj, (java.lang.String) obj2);
                }
            };
        }
        Function2<? super C55001xbh, ? super java.lang.String, Unit> function2 = this.OLrzqt;
        if (function2 != null) {
            abstractC31124loBInvoke.EZpvd(function2);
        }
        this.copydefault = true;
    }

    public static final Unit AEQbTJ(C31173loy c31173loy, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (c31173loy.OLrzqt(str)) {
            c31173loy.gEmmrt.AEQbTJ(str, true);
            if (!c31173loy.EZpvd.invoke().booleanValue()) {
                c31173loy.copydefault();
            }
            c31173loy.KWHzl.invoke(java.lang.Boolean.FALSE);
        } else {
            c31173loy.KWHzl.invoke(java.lang.Boolean.FALSE);
            AbstractC31124loB abstractC31124loBInvoke = c31173loy.fetchVPNInfo.invoke();
            if (abstractC31124loBInvoke != null && !abstractC31124loBInvoke.KWHzl()) {
                c31173loy.gEmmrt.AEQbTJ("", false);
                c31173loy.gEmmrt.QbewEr();
                c31173loy.AYXKKw.invoke(java.lang.Boolean.TRUE);
                c31173loy.KWHzl();
                if (!c31173loy.EZpvd.invoke().booleanValue()) {
                    c31173loy.copydefault();
                }
            } else {
                c31173loy.copydefault();
            }
        }
        c31173loy.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        AbstractC31124loB abstractC31124loBInvoke;
        if (this.copydefault && (abstractC31124loBInvoke = this.fetchVPNInfo.invoke()) != null) {
            Function2<? super C55001xbh, ? super java.lang.String, Unit> function2 = this.OLrzqt;
            if (function2 != null) {
                abstractC31124loBInvoke.AEQbTJ(function2);
            }
            this.copydefault = false;
        }
    }
}
