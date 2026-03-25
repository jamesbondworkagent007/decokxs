package o;

import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17262ezV implements InterfaceC17258ezR {
    public final C12827cuN EZpvd;
    public final C10337bmZ OLrzqt;
    public final InterfaceC17225eyl copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C17262ezV() {
        this(null, null, null, 7, null);
    }

    public C17262ezV(@NotNull C12827cuN c12827cuN, @NotNull C10337bmZ c10337bmZ, @NotNull InterfaceC17225eyl interfaceC17225eyl) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10337bmZ, "");
        Intrinsics.checkNotNullParameter(interfaceC17225eyl, "");
        this.EZpvd = c12827cuN;
        this.OLrzqt = c10337bmZ;
        this.copydefault = interfaceC17225eyl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:15) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:15)) : (r2v0 o.cuN))
  (wrap:o.bmZ:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bmZ:0x0010: SGET  A[WRAPPED] (LINE:16) o.bmZ.KWHzl o.bmZ) : (r3v0 o.bmZ))
  (wrap:o.eyl:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eyl:0x001d: CONSTRUCTOR (wrap:o.byG:0x0016: SGET  A[WRAPPED] (LINE:18) o.byG.EZpvd o.byG) A[MD:(o.byG):void (m), WRAPPED] (LINE:17) call: o.eyo.<init>(o.byG):void type: CONSTRUCTOR) : (r4v0 o.eyl))
 A[MD:(o.cuN, o.bmZ, o.eyl):void (m)] (LINE:14) call: o.ezV.<init>(o.cuN, o.bmZ, o.eyl):void type: THIS */
    public /* synthetic */ C17262ezV(C12827cuN c12827cuN, C10337bmZ c10337bmZ, InterfaceC17225eyl interfaceC17225eyl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C10337bmZ.KWHzl : c10337bmZ, (i & 4) != 0 ? new C17228eyo(C10954byG.EZpvd) : interfaceC17225eyl);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<AbstractC12782ctV> KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.OLrzqt(str, z);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<AbstractC12784ctX> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.djBIcL(str);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<java.lang.Integer> EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        return abstractC12782ctV.djBIcL(str);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(str, "");
        return abstractC12784ctX.KWHzl(str);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58177ywP copydefault() {
        return this.OLrzqt.OLrzqt();
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<java.util.List<AbstractC12782ctV>> AEQbTJ(boolean z, boolean z2) {
        return C12827cuN.fetchAllWallets$default(this.EZpvd, z, z2, false, 4, null);
    }

    @Override // o.InterfaceC17258ezR
    public void copydefault(@NotNull WalletStatus walletStatus) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        this.EZpvd.EZpvd(walletStatus);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC58260yxt<java.lang.Boolean> KWHzl(boolean z) {
        return this.EZpvd.OLrzqt(z);
    }

    @Override // o.InterfaceC17258ezR
    public AbstractC12782ctV KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull AbstractC12784ctX abstractC12784ctX) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C10854bwM c10854bwMAEQbTJ = this.copydefault.AEQbTJ();
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.fetchVPNInfo() : -1L);
        java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listKWHzl) {
            if (((AbstractC12782ctV) obj).QwvEab() == WalletType.AAWallet) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.util.List<ChainAddress> listValueOf = ((AbstractC12782ctV) next).valueOf();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            java.util.Iterator<T> it2 = listValueOf.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ChainAddress) it2.next()).getEoaAddress());
            }
            if (arrayList2.contains(strEZpvd)) {
                break;
            }
        }
        return (AbstractC12782ctV) next;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC17258ezR
    public boolean copydefault(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull AbstractC12782ctV abstractC12782ctV, AbstractC12782ctV abstractC12782ctV2) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.Iterator<T> it = abstractC12784ctX.KWHzl().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) next;
            java.lang.String[] strArr = new java.lang.String[2];
            strArr[0] = abstractC12782ctV.DbNXlk();
            strArr[1] = abstractC12782ctV2 != null ? abstractC12782ctV2.DbNXlk() : null;
            if (!yDY.gEmmrt(strArr).contains(abstractC12782ctV3.DbNXlk())) {
                obj = next;
                break;
            }
        }
        return ((AbstractC12782ctV) obj) != null;
    }
}
