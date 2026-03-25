package o;

import com.okinc.dexkline.market.domain.model.cointag.CoinTag;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34635nfn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXB implements InterfaceC34635nfn {
    public final java.util.List<CoinTag> AEQbTJ;
    public final java.util.List<TagWrapper> EZpvd;
    public final java.lang.String KWHzl;
    public final HoldActivity copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mXB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mXB copy$default(mXB mxb, HoldActivity holdActivity, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            holdActivity = mxb.copydefault;
        }
        if ((i & 2) != 0) {
            str = mxb.KWHzl;
        }
        if ((i & 4) != 0) {
            list = mxb.AEQbTJ;
        }
        if ((i & 8) != 0) {
            list2 = mxb.EZpvd;
        }
        return mxb.AEQbTJ(holdActivity, str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mXB AEQbTJ(@NotNull HoldActivity holdActivity, @NotNull java.lang.String str, @NotNull java.util.List<? extends CoinTag> list, @NotNull java.util.List<TagWrapper> list2) {
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new mXB(holdActivity, str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TagWrapper> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CoinTag> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldActivity copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mXB)) {
            return false;
        }
        mXB mxb = (mXB) obj;
        return this.copydefault == mxb.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) mxb.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, mxb.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, mxb.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SniperHolderUiModel(status=" + this.copydefault + ", holderWalletAddress=" + this.KWHzl + ", tagList=" + this.AEQbTJ + ", newTagList=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.dexkline.market.domain.model.cointag.CoinTag> */
    /* JADX WARN: Multi-variable type inference failed */
    public mXB(@NotNull HoldActivity holdActivity, @NotNull java.lang.String str, @NotNull java.util.List<? extends CoinTag> list, @NotNull java.util.List<TagWrapper> list2) {
        Intrinsics.checkNotNullParameter(holdActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = holdActivity;
        this.KWHzl = str;
        this.AEQbTJ = list;
        this.EZpvd = list2;
    }

    @Override // o.InterfaceC34635nfn
    public boolean AEQbTJ(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.copydefault(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public boolean KWHzl(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.KWHzl(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public java.lang.Object copydefault(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.AEQbTJ(this, interfaceC34635nfn);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r1v0 com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:73)) : (r4v0 java.util.List))
 A[MD:(com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity, java.lang.String, java.util.List<? extends com.okinc.dexkline.market.domain.model.cointag.CoinTag>, java.util.List<com.okinc.dexkline.market.features.tag.domain.TagWrapper>):void (m)] (LINE:69) call: o.mXB.<init>(com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ mXB(HoldActivity holdActivity, java.lang.String str, java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(holdActivity, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2);
    }
}
