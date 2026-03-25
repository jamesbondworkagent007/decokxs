package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22901hoB implements InterfaceC22902hoC {
    public final C22950hoy AEQbTJ;
    public final WeakReference<InterfaceC22903hoD> KWHzl;
    public final AbstractC23101hrq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22902hoC OLrzqt() {
        return this.AEQbTJ;
    }

    public C22901hoB(@NotNull AbstractC23101hrq abstractC23101hrq, @NotNull WeakReference<InterfaceC22903hoD> weakReference, @NotNull C22950hoy c22950hoy) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(c22950hoy, "");
        this.OLrzqt = abstractC23101hrq;
        this.KWHzl = weakReference;
        this.AEQbTJ = c22950hoy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r7v0 o.hrq)
  (r8v0 java.lang.ref.WeakReference)
  (wrap:o.hoy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.hoy:0x0012: CONSTRUCTOR 
  (r7v0 o.hrq)
  (wrap:o.hoD:0x0009: CHECK_CAST (o.hoD) (wrap:java.lang.Object:0x0004: INVOKE (r8v0 java.lang.ref.WeakReference) VIRTUAL call: java.lang.ref.Reference.get():java.lang.Object A[MD:():T (c), WRAPPED] (LINE:25)))
  (null com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange)
  (4 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.hrq, o.hoD, com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: o.hoy.<init>(o.hrq, o.hoD, com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.forward.FromCoinChange, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 o.hoy))
 A[MD:(o.hrq, java.lang.ref.WeakReference<o.hoD>, o.hoy):void (m)] (LINE:20) call: o.hoB.<init>(o.hrq, java.lang.ref.WeakReference, o.hoy):void type: THIS */
    public /* synthetic */ C22901hoB(AbstractC23101hrq abstractC23101hrq, WeakReference weakReference, C22950hoy c22950hoy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC23101hrq, weakReference, (i & 4) != 0 ? new C22950hoy(abstractC23101hrq, (InterfaceC22903hoD) weakReference.get(), null, 4, null) : c22950hoy);
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup copydefault(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        TradeInputGroup tradeInputGroupCopydefault = OLrzqt().copydefault(quotePriceRes, str);
        if (this.OLrzqt.dmfpNf().getValue() != null) {
            this.OLrzqt.dmfpNf().setValue(tradeInputGroupCopydefault != null ? C22332hdP.EZpvd(tradeInputGroupCopydefault) : null);
        }
        return tradeInputGroupCopydefault;
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup djBIcL() {
        TradeInputGroup tradeInputGroupDjBIcL = OLrzqt().djBIcL();
        if (this.OLrzqt.dmfpNf().getValue() != null) {
            this.OLrzqt.dmfpNf().setValue(tradeInputGroupDjBIcL != null ? C22332hdP.EZpvd(tradeInputGroupDjBIcL) : null);
        }
        return tradeInputGroupDjBIcL;
    }

    @Override // o.InterfaceC22902hoC
    public java.lang.String EZpvd() {
        return OLrzqt().EZpvd();
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        TradeInputGroup tradeInputGroupCopydefault = OLrzqt().copydefault(str, z);
        if (this.OLrzqt.dmfpNf().getValue() != null) {
            this.OLrzqt.dmfpNf().setValue(tradeInputGroupCopydefault != null ? C22332hdP.EZpvd(tradeInputGroupCopydefault) : null);
        }
        return tradeInputGroupCopydefault;
    }

    @Override // o.InterfaceC22902hoC
    public boolean valueOf() {
        return OLrzqt().valueOf();
    }

    @Override // o.InterfaceC22902hoC
    public java.lang.String KWHzl() {
        return OLrzqt().KWHzl();
    }

    @Override // o.InterfaceC22902hoC
    public boolean copydefault() {
        return OLrzqt().copydefault();
    }

    @Override // o.InterfaceC22902hoC
    public TradeInputGroup OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        TradeInputGroup tradeInputGroupOLrzqt = OLrzqt().OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
        if (tradeInputGroupOLrzqt == null) {
            return null;
        }
        if (dexMultiTokenInfoBean == null && dexMultiTokenInfoBean2 == null) {
            return tradeInputGroupOLrzqt;
        }
        DexMultiTokenInfoBean data = tradeInputGroupOLrzqt.getFromData().getData().getCoinData().getData();
        DexMultiTokenInfoBean data2 = tradeInputGroupOLrzqt.getToData().getData().getCoinData().getData();
        if (dexMultiTokenInfoBean == null || !C30565ldZ.OLrzqt(dexMultiTokenInfoBean, data) || dexMultiTokenInfoBean2 == null || !C30565ldZ.OLrzqt(dexMultiTokenInfoBean2, data2)) {
            this.OLrzqt.dmfpNf().setValue(C22332hdP.EZpvd(tradeInputGroupOLrzqt));
        }
        return tradeInputGroupOLrzqt;
    }

    public final void AEQbTJ() {
        InterfaceC22903hoD interfaceC22903hoD = this.KWHzl.get();
        if (interfaceC22903hoD != null) {
            interfaceC22903hoD.KWHzl(this.AEQbTJ.AEQbTJ(), this.AEQbTJ.AYXKKw());
        }
    }

    public final void AYXKKw() {
        InterfaceC22903hoD interfaceC22903hoD = this.KWHzl.get();
        if (interfaceC22903hoD != null) {
            interfaceC22903hoD.EZpvd(this.AEQbTJ.AEQbTJ(), this.AEQbTJ.AYXKKw());
        }
    }
}
