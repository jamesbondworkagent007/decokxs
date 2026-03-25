package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.tee.repository.TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1;
import com.okinc.trade.manager.common.position.TradePositionManager;
import kotlin.jvm.internal.Intrinsics;
import o.xDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGX {
    private static int AEQbTJ = 0;
    private static int copydefault = 1;
    public final java.util.HashMap<java.lang.String, java.lang.Object> EZpvd = new java.util.HashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object AEQbTJ(int i, int i2, java.lang.Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = ~i2;
        int i12 = (~(i7 | i4)) | (~(i8 | i11)) | (~(i8 | i3));
        int i13 = ~(i11 | i9);
        int i14 = i3 + i4 + i5 + (1938118820 * i6) + ((-1869228383) * i);
        int i15 = i14 * i14;
        int i16 = (i3 * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i5) + ((-1907359744) * i6) + (1374945280 * i) + (1516044288 * i15);
        int i17 = ((i3 * 647972376) - 1941852458) + (i4 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i5 * 647973227) + (i6 * (-1260466036)) + (i * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        return i18 != 1 ? i18 != 2 ? AEQbTJ(objArr) : OLrzqt(objArr) : KWHzl(objArr);
    }

    public xGX() {
        C56121xwo.copydefault.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("非法线程");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends java.lang.Object> it = list.iterator();
        while (true) {
            boolean zCopydefault = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC57556yke) it2.next()).AhwBna();
                    }
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (next instanceof AbstractC55747xpl) {
                TradePositionManager.Companion.AEQbTJ("addTasks tradeListener:" + next);
                AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) next;
                java.lang.Object obj = this.EZpvd.get(abstractC55747xpl.AhwBna());
                if (obj == null || !(obj instanceof xFY)) {
                    this.EZpvd.put(abstractC55747xpl.AhwBna(), new xFY(abstractC55747xpl.AhwBna(), abstractC55747xpl));
                } else {
                    ((xFY) obj).OLrzqt(abstractC55747xpl);
                }
            } else {
                java.lang.Object obj2 = null;
                if (next instanceof AbstractC55657xoA) {
                    AbstractC55657xoA abstractC55657xoA = (AbstractC55657xoA) next;
                    java.lang.Object obj3 = this.EZpvd.get(abstractC55657xoA.AEQbTJ());
                    if (obj3 == null || !(obj3 instanceof xEZ)) {
                        this.EZpvd.put(abstractC55657xoA.AEQbTJ(), new xEZ(abstractC55657xoA.AEQbTJ(), abstractC55657xoA));
                    } else {
                        int i2 = copydefault + 51;
                        AEQbTJ = i2 % 128;
                        if (i2 % 2 != 0) {
                            ((xEZ) obj3).KWHzl(abstractC55657xoA);
                            obj2.hashCode();
                            throw null;
                        }
                        ((xEZ) obj3).KWHzl(abstractC55657xoA);
                    }
                } else if (next instanceof AbstractC55708xoz) {
                    AbstractC55708xoz abstractC55708xoz = (AbstractC55708xoz) next;
                    java.lang.Object obj4 = this.EZpvd.get(abstractC55708xoz.AEQbTJ());
                    if (obj4 == null || !(obj4 instanceof C54350xFd)) {
                        this.EZpvd.put(abstractC55708xoz.AEQbTJ(), new C54350xFd(abstractC55708xoz.AEQbTJ(), abstractC55708xoz));
                    } else {
                        ((C54350xFd) obj4).copydefault(abstractC55708xoz);
                    }
                } else if (next instanceof AbstractC55660xoD) {
                    AbstractC55660xoD abstractC55660xoD = (AbstractC55660xoD) next;
                    java.lang.Object obj5 = this.EZpvd.get(abstractC55660xoD.AEQbTJ());
                    if (obj5 == null || !(obj5 instanceof xFD)) {
                        this.EZpvd.put(abstractC55660xoD.AEQbTJ(), new xFD(abstractC55660xoD.AEQbTJ(), abstractC55660xoD));
                    } else {
                        ((xFD) obj5).copydefault(abstractC55660xoD);
                    }
                } else if (next instanceof AbstractC55738xpc) {
                    AbstractC55738xpc abstractC55738xpc = (AbstractC55738xpc) next;
                    java.lang.Object obj6 = this.EZpvd.get(abstractC55738xpc.AEQbTJ());
                    if (obj6 == null || !(obj6 instanceof C54386xGm)) {
                        this.EZpvd.put(abstractC55738xpc.AEQbTJ(), new C54386xGm(abstractC55738xpc.AEQbTJ(), abstractC55738xpc));
                    } else {
                        ((C54386xGm) obj6).AEQbTJ(abstractC55738xpc);
                    }
                } else if (next instanceof AbstractC55664xoH) {
                    AbstractC55664xoH abstractC55664xoH = (AbstractC55664xoH) next;
                    java.lang.Object obj7 = this.EZpvd.get(abstractC55664xoH.AEQbTJ());
                    if (obj7 == null) {
                        C54345xEz c54345xEz = new C54345xEz(abstractC55664xoH.AEQbTJ(), abstractC55664xoH);
                        AbstractC57556yke abstractC57556ykeKWHzl = c54345xEz.KWHzl();
                        if (abstractC57556ykeKWHzl != null) {
                            int i3 = AEQbTJ + 57;
                            copydefault = i3 % 128;
                            if (i3 % 2 == 0) {
                                arrayList.add(abstractC57556ykeKWHzl);
                                throw null;
                            }
                            arrayList.add(abstractC57556ykeKWHzl);
                        }
                        this.EZpvd.put(abstractC55664xoH.AEQbTJ(), c54345xEz);
                    } else if (obj7 instanceof C54345xEz) {
                        ((C54345xEz) obj7).KWHzl(abstractC55664xoH);
                    }
                } else if (next instanceof AbstractC55760xpy) {
                    AbstractC55760xpy abstractC55760xpy = (AbstractC55760xpy) next;
                    java.lang.Object obj8 = this.EZpvd.get(abstractC55760xpy.AEQbTJ());
                    if (obj8 == null) {
                        xFS xfs = new xFS(abstractC55760xpy.AEQbTJ(), abstractC55760xpy);
                        AbstractC57556yke abstractC57556ykeEZpvd = xfs.EZpvd();
                        if (abstractC57556ykeEZpvd != null) {
                            arrayList.add(abstractC57556ykeEZpvd);
                        }
                        this.EZpvd.put(abstractC55760xpy.AEQbTJ(), xfs);
                    } else if (obj8 instanceof xFS) {
                        ((xFS) obj8).OLrzqt(abstractC55760xpy);
                    }
                } else if (next instanceof AbstractC55758xpw) {
                    AbstractC55758xpw abstractC55758xpw = (AbstractC55758xpw) next;
                    java.lang.Object obj9 = this.EZpvd.get(abstractC55758xpw.AEQbTJ());
                    if (obj9 == null) {
                        C54366xFt c54366xFt = new C54366xFt(abstractC55758xpw.AEQbTJ(), abstractC55758xpw);
                        AbstractC57556yke abstractC57556ykeKWHzl2 = c54366xFt.KWHzl();
                        if (abstractC57556ykeKWHzl2 != null) {
                            arrayList.add(abstractC57556ykeKWHzl2);
                        }
                        this.EZpvd.put(abstractC55758xpw.AEQbTJ(), c54366xFt);
                    } else if (obj9 instanceof C54366xFt) {
                        ((C54366xFt) obj9).EZpvd(abstractC55758xpw);
                    }
                } else if (next instanceof AbstractC55759xpx) {
                    AbstractC55759xpx abstractC55759xpx = (AbstractC55759xpx) next;
                    java.lang.Object obj10 = this.EZpvd.get(abstractC55759xpx.AEQbTJ());
                    if (obj10 == null) {
                        C54384xGk c54384xGk = new C54384xGk(abstractC55759xpx.AEQbTJ(), abstractC55759xpx);
                        AbstractC57556yke abstractC57556ykeCopydefault = c54384xGk.copydefault();
                        if (abstractC57556ykeCopydefault != null) {
                            arrayList.add(abstractC57556ykeCopydefault);
                        }
                        this.EZpvd.put(abstractC55759xpx.AEQbTJ(), c54384xGk);
                    } else if (obj10 instanceof C54384xGk) {
                        int i4 = AEQbTJ + 9;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        ((C54384xGk) obj10).KWHzl(abstractC55759xpx);
                    }
                } else if (next instanceof AbstractC55761xpz) {
                    AbstractC55761xpz abstractC55761xpz = (AbstractC55761xpz) next;
                    java.lang.Object obj11 = this.EZpvd.get(abstractC55761xpz.AEQbTJ());
                    if (obj11 == null) {
                        C54370xFx c54370xFx = new C54370xFx(abstractC55761xpz.AEQbTJ(), abstractC55761xpz);
                        AbstractC57556yke abstractC57556ykeKWHzl3 = c54370xFx.KWHzl();
                        if (abstractC57556ykeKWHzl3 != null) {
                            arrayList.add(abstractC57556ykeKWHzl3);
                        }
                        this.EZpvd.put(abstractC55761xpz.AEQbTJ(), c54370xFx);
                    } else if (obj11 instanceof C54370xFx) {
                        ((C54370xFx) obj11).OLrzqt(abstractC55761xpz);
                    }
                } else if (next instanceof AbstractC55713xpD) {
                    AbstractC55713xpD abstractC55713xpD = (AbstractC55713xpD) next;
                    java.lang.Object obj12 = this.EZpvd.get(abstractC55713xpD.AEQbTJ());
                    if (obj12 != null && (obj12 instanceof C54383xGj)) {
                        int i6 = copydefault + 97;
                        AEQbTJ = i6 % 128;
                        int i7 = i6 % 2;
                        ((C54383xGj) obj12).KWHzl();
                        this.EZpvd.remove(abstractC55713xpD.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55713xpD.AEQbTJ(), new C54383xGj(abstractC55713xpD.AEQbTJ(), abstractC55713xpD));
                } else if (next instanceof AbstractC55716xpG) {
                    AbstractC55716xpG abstractC55716xpG = (AbstractC55716xpG) next;
                    java.lang.Object obj13 = this.EZpvd.get(abstractC55716xpG.AEQbTJ());
                    if (obj13 != null && (obj13 instanceof C54357xFk)) {
                        ((C54357xFk) obj13).djBIcL();
                        this.EZpvd.remove(abstractC55716xpG.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55716xpG.AEQbTJ(), new C54357xFk(abstractC55716xpG.AEQbTJ(), abstractC55716xpG));
                } else if (next instanceof AbstractC55757xpv) {
                    AbstractC55757xpv abstractC55757xpv = (AbstractC55757xpv) next;
                    java.lang.Object obj14 = this.EZpvd.get(abstractC55757xpv.AEQbTJ());
                    if (obj14 == null) {
                        C54367xFu c54367xFu = new C54367xFu(abstractC55757xpv.AEQbTJ(), abstractC55757xpv);
                        AbstractC57556yke abstractC57556ykeCopydefault2 = c54367xFu.copydefault();
                        if (abstractC57556ykeCopydefault2 != null) {
                            arrayList.add(abstractC57556ykeCopydefault2);
                        }
                        this.EZpvd.put(abstractC55757xpv.AEQbTJ(), c54367xFu);
                    } else if (obj14 instanceof C54367xFu) {
                        ((C54367xFu) obj14).AEQbTJ(abstractC55757xpv);
                    }
                } else if (next instanceof AbstractC55746xpk) {
                    int i8 = AEQbTJ + 101;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    AbstractC55746xpk abstractC55746xpk = (AbstractC55746xpk) next;
                    java.lang.Object obj15 = this.EZpvd.get(abstractC55746xpk.AEQbTJ());
                    if (obj15 != null && (obj15 instanceof xGL)) {
                        ((xGL) obj15).KWHzl();
                        this.EZpvd.remove(abstractC55746xpk.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55746xpk.AEQbTJ(), new xGL(abstractC55746xpk.AEQbTJ(), abstractC55746xpk));
                } else if (next instanceof AbstractC55729xpT) {
                    AbstractC55729xpT abstractC55729xpT = (AbstractC55729xpT) next;
                    java.lang.Object obj16 = this.EZpvd.get(abstractC55729xpT.AEQbTJ());
                    if (obj16 != null) {
                        int i10 = copydefault + 103;
                        AEQbTJ = i10 % 128;
                        int i11 = i10 % 2;
                        if (obj16 instanceof xFU) {
                            ((xFU) obj16).copydefault();
                            this.EZpvd.remove(abstractC55729xpT.AEQbTJ());
                        }
                    }
                    this.EZpvd.put(abstractC55729xpT.AEQbTJ(), new xFU(abstractC55729xpT.AEQbTJ(), abstractC55729xpT));
                } else if (next instanceof AbstractC55723xpN) {
                    int i12 = copydefault + 29;
                    AEQbTJ = i12 % 128;
                    int i13 = i12 % 2;
                    AbstractC55723xpN abstractC55723xpN = (AbstractC55723xpN) next;
                    java.lang.Object obj17 = this.EZpvd.get(abstractC55723xpN.EZpvd());
                    if (obj17 == null || !(obj17 instanceof C54353xFg)) {
                        this.EZpvd.put(abstractC55723xpN.EZpvd(), new C54353xFg(abstractC55723xpN.EZpvd(), abstractC55723xpN));
                    } else {
                        ((C54353xFg) obj17).OLrzqt(abstractC55723xpN);
                    }
                } else if (next instanceof AbstractC55724xpO) {
                    AbstractC55724xpO abstractC55724xpO = (AbstractC55724xpO) next;
                    java.lang.Object obj18 = this.EZpvd.get(abstractC55724xpO.OLrzqt());
                    if (obj18 != null && (obj18 instanceof xFA)) {
                        ((xFA) obj18).copydefault();
                        this.EZpvd.remove(abstractC55724xpO.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55724xpO.OLrzqt(), new xFA(abstractC55724xpO.OLrzqt(), abstractC55724xpO));
                } else if (next instanceof AbstractC55728xpS) {
                    AbstractC55728xpS abstractC55728xpS = (AbstractC55728xpS) next;
                    java.lang.Object obj19 = this.EZpvd.get(abstractC55728xpS.OLrzqt());
                    if (obj19 != null && !(true ^ (obj19 instanceof xFR))) {
                        ((xFR) obj19).copydefault();
                        this.EZpvd.remove(abstractC55728xpS.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55728xpS.OLrzqt(), new xFR(abstractC55728xpS.OLrzqt(), abstractC55728xpS));
                } else if (next instanceof AbstractC55721xpL) {
                    AbstractC55721xpL abstractC55721xpL = (AbstractC55721xpL) next;
                    java.lang.Object obj20 = this.EZpvd.get(abstractC55721xpL.AEQbTJ());
                    if (obj20 != null && (obj20 instanceof xFB)) {
                        ((xFB) obj20).KWHzl();
                        this.EZpvd.remove(abstractC55721xpL.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55721xpL.AEQbTJ(), new xFB(abstractC55721xpL.AEQbTJ(), abstractC55721xpL));
                } else if (next instanceof AbstractC55730xpU) {
                    AbstractC55730xpU abstractC55730xpU = (AbstractC55730xpU) next;
                    java.lang.Object obj21 = this.EZpvd.get(abstractC55730xpU.copydefault());
                    if (obj21 != null && (obj21 instanceof C54398xGy)) {
                        ((C54398xGy) obj21).copydefault();
                        this.EZpvd.remove(abstractC55730xpU.copydefault());
                    }
                    this.EZpvd.put(abstractC55730xpU.copydefault(), new C54398xGy(abstractC55730xpU.copydefault(), abstractC55730xpU));
                } else if (next instanceof AbstractC55663xoG) {
                    AbstractC55663xoG abstractC55663xoG = (AbstractC55663xoG) next;
                    java.lang.Object obj22 = this.EZpvd.get(abstractC55663xoG.AEQbTJ());
                    if (obj22 == null || !(obj22 instanceof xGP)) {
                        this.EZpvd.put(abstractC55663xoG.AEQbTJ(), new xGP(abstractC55663xoG.AEQbTJ(), abstractC55663xoG));
                    } else {
                        ((xGP) obj22).copydefault(abstractC55663xoG);
                    }
                } else if ((next instanceof AbstractC55677xoU) || (next instanceof AbstractC55673xoQ) || (next instanceof AbstractC55675xoS)) {
                    AbstractC55755xpt abstractC55755xpt = (AbstractC55755xpt) next;
                    if (abstractC55755xpt instanceof AbstractC55677xoU) {
                        zCopydefault = ((AbstractC55677xoU) next).KWHzl();
                    } else if (abstractC55755xpt instanceof AbstractC55673xoQ) {
                        zCopydefault = ((AbstractC55673xoQ) next).OLrzqt();
                    } else if (abstractC55755xpt instanceof AbstractC55675xoS) {
                        zCopydefault = ((AbstractC55675xoS) next).copydefault();
                    }
                    java.lang.Object obj23 = this.EZpvd.get(abstractC55755xpt.AEQbTJ());
                    if (obj23 != null && (obj23 instanceof xGO)) {
                        ((xGO) obj23).djBIcL();
                        this.EZpvd.remove(abstractC55755xpt.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55755xpt.AEQbTJ(), new xGO(abstractC55755xpt, zCopydefault));
                } else if (next instanceof AbstractC55672xoP) {
                    AbstractC55672xoP abstractC55672xoP = (AbstractC55672xoP) next;
                    java.lang.Object obj24 = this.EZpvd.get(abstractC55672xoP.AEQbTJ());
                    if (obj24 != null && (obj24 instanceof C54344xEy)) {
                        int i14 = copydefault + 23;
                        AEQbTJ = i14 % 128;
                        if (i14 % 2 != 0) {
                            ((C54344xEy) obj24).EZpvd();
                            this.EZpvd.remove(abstractC55672xoP.AEQbTJ());
                            throw null;
                        }
                        ((C54344xEy) obj24).EZpvd();
                        this.EZpvd.remove(abstractC55672xoP.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55672xoP.AEQbTJ(), new C54344xEy((AbstractC55755xpt) next));
                } else if (next instanceof AbstractC55740xpe) {
                    AbstractC55740xpe abstractC55740xpe = (AbstractC55740xpe) next;
                    if (this.EZpvd.get(abstractC55740xpe.fIwbmz()) != null) {
                        java.lang.Object obj25 = this.EZpvd.get(abstractC55740xpe.fIwbmz());
                        Intrinsics.copydefault(obj25, "");
                        ((C54358xFl) obj25).copydefault();
                    }
                    this.EZpvd.put(abstractC55740xpe.fIwbmz(), new C54358xFl(abstractC55740xpe));
                } else if (next instanceof AbstractC55680xoX) {
                    AbstractC55680xoX abstractC55680xoX = (AbstractC55680xoX) next;
                    java.lang.Object obj26 = this.EZpvd.get(abstractC55680xoX.AEQbTJ());
                    if (obj26 != null && (obj26 instanceof xEE)) {
                        ((xEE) obj26).fIwbmz();
                        this.EZpvd.remove(abstractC55680xoX.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55680xoX.AEQbTJ(), new xEE(abstractC55680xoX.AEQbTJ(), abstractC55680xoX));
                } else if (next instanceof AbstractC55661xoE) {
                    AbstractC55661xoE abstractC55661xoE = (AbstractC55661xoE) next;
                    java.lang.Object obj27 = this.EZpvd.get(abstractC55661xoE.copydefault());
                    if (obj27 != null && (obj27 instanceof xDX)) {
                        ((xDX) obj27).djBIcL();
                        this.EZpvd.remove(abstractC55661xoE.copydefault());
                    }
                    this.EZpvd.put(abstractC55661xoE.copydefault(), new xDX(abstractC55661xoE.copydefault(), (AbstractC55662xoF) next));
                } else if (next instanceof AbstractC55706xox) {
                    AbstractC55706xox abstractC55706xox = (AbstractC55706xox) next;
                    java.lang.Object obj28 = this.EZpvd.get(abstractC55706xox.copydefault());
                    if (obj28 != null && (obj28 instanceof xDX)) {
                        ((xDX) obj28).djBIcL();
                        this.EZpvd.remove(abstractC55706xox.copydefault());
                    }
                    this.EZpvd.put(abstractC55706xox.copydefault(), new xDX(abstractC55706xox.copydefault(), (AbstractC55662xoF) next));
                } else if (next instanceof AbstractC55753xpr) {
                    AbstractC55753xpr abstractC55753xpr = (AbstractC55753xpr) next;
                    java.lang.Object obj29 = this.EZpvd.get(abstractC55753xpr.OLrzqt());
                    if (obj29 != null && (obj29 instanceof xGB)) {
                        int i15 = copydefault + 93;
                        AEQbTJ = i15 % 128;
                        if (i15 % 2 != 0) {
                            this.EZpvd.remove(abstractC55753xpr.OLrzqt());
                            obj2.hashCode();
                            throw null;
                        }
                        this.EZpvd.remove(abstractC55753xpr.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55753xpr.OLrzqt(), new xGB(abstractC55753xpr.OLrzqt(), abstractC55753xpr));
                } else if (next instanceof AbstractC55669xoM) {
                    AbstractC55669xoM abstractC55669xoM = (AbstractC55669xoM) next;
                    java.lang.Object obj30 = this.EZpvd.get(abstractC55669xoM.gEmmrt());
                    if (obj30 == null) {
                        this.EZpvd.put(abstractC55669xoM.gEmmrt(), new C54343xEx(abstractC55669xoM.gEmmrt(), abstractC55669xoM));
                    } else if (obj30 instanceof C54343xEx) {
                        ((C54343xEx) obj30).EZpvd(abstractC55669xoM);
                    }
                } else if (next instanceof AbstractC55741xpf) {
                    AbstractC55741xpf abstractC55741xpf = (AbstractC55741xpf) next;
                    java.lang.Object obj31 = this.EZpvd.get(abstractC55741xpf.AYXKKw());
                    if (obj31 == null) {
                        this.EZpvd.put(abstractC55741xpf.AYXKKw(), new xEU(abstractC55741xpf.AYXKKw(), abstractC55741xpf));
                    } else if (obj31 instanceof xEU) {
                        ((xEU) obj31).AEQbTJ(abstractC55741xpf);
                    }
                } else if (next instanceof AbstractC55666xoJ) {
                    AbstractC55666xoJ abstractC55666xoJ = (AbstractC55666xoJ) next;
                    java.lang.Object obj32 = this.EZpvd.get(abstractC55666xoJ.OLrzqt());
                    if (obj32 != null && (obj32 instanceof C54340xEu)) {
                        ((C54340xEu) obj32).EZpvd();
                        this.EZpvd.remove(abstractC55666xoJ.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55666xoJ.OLrzqt(), new C54340xEu(abstractC55666xoJ.OLrzqt(), abstractC55666xoJ));
                } else if (next instanceof AbstractC55667xoK) {
                    AbstractC55667xoK abstractC55667xoK = (AbstractC55667xoK) next;
                    java.lang.Object obj33 = this.EZpvd.get(abstractC55667xoK.EZpvd());
                    if (obj33 != null && (obj33 instanceof C54335xEp)) {
                        ((C54335xEp) obj33).AEQbTJ();
                        this.EZpvd.remove(abstractC55667xoK.EZpvd());
                    }
                    this.EZpvd.put(abstractC55667xoK.EZpvd(), new C54335xEp(abstractC55667xoK.EZpvd(), abstractC55667xoK));
                } else if (next instanceof AbstractC55665xoI) {
                    AbstractC55665xoI abstractC55665xoI = (AbstractC55665xoI) next;
                    java.lang.Object obj34 = this.EZpvd.get(abstractC55665xoI.KWHzl());
                    if (obj34 != null && (obj34 instanceof C54339xEt)) {
                        ((C54339xEt) obj34).KWHzl();
                        this.EZpvd.remove(abstractC55665xoI.KWHzl());
                    }
                    this.EZpvd.put(abstractC55665xoI.KWHzl(), new C54339xEt(abstractC55665xoI.KWHzl(), abstractC55665xoI));
                } else if (next instanceof AbstractC55720xpK) {
                    AbstractC55720xpK abstractC55720xpK = (AbstractC55720xpK) next;
                    java.lang.Object obj35 = this.EZpvd.get(abstractC55720xpK.copydefault());
                    if (obj35 != null && (obj35 instanceof xDP)) {
                        ((xDP) obj35).valueOf();
                        this.EZpvd.remove(abstractC55720xpK.copydefault());
                    }
                    xDP.Activity activity = xDP.Companion;
                    activity.OLrzqt();
                    this.EZpvd.put(abstractC55720xpK.copydefault(), activity.KWHzl(abstractC55720xpK.copydefault(), abstractC55720xpK, abstractC55720xpK.EZpvd(), abstractC55720xpK.AEQbTJ()));
                } else if (next instanceof AbstractC55714xpE) {
                    AbstractC55714xpE abstractC55714xpE = (AbstractC55714xpE) next;
                    java.lang.Object obj36 = this.EZpvd.get(abstractC55714xpE.OLrzqt());
                    if (obj36 != null && (obj36 instanceof C54322xEc)) {
                        ((C54322xEc) obj36).KWHzl();
                        this.EZpvd.remove(abstractC55714xpE.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55714xpE.OLrzqt(), new C54322xEc(abstractC55714xpE.OLrzqt(), abstractC55714xpE));
                } else if (next instanceof AbstractC55731xpV) {
                    AbstractC55731xpV abstractC55731xpV = (AbstractC55731xpV) next;
                    java.lang.Object obj37 = this.EZpvd.get(abstractC55731xpV.AEQbTJ());
                    if (obj37 != null && (obj37 instanceof C54390xGq)) {
                        ((C54390xGq) obj37).KWHzl();
                        this.EZpvd.remove(abstractC55731xpV.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55731xpV.AEQbTJ(), new C54390xGq(abstractC55731xpV.AEQbTJ(), abstractC55731xpV));
                } else if (next instanceof AbstractC55719xpJ) {
                    AbstractC55719xpJ abstractC55719xpJ = (AbstractC55719xpJ) next;
                    java.lang.Object obj38 = this.EZpvd.get(abstractC55719xpJ.EZpvd());
                    if (obj38 != null && (obj38 instanceof xDQ)) {
                        ((xDQ) obj38).EZpvd();
                        this.EZpvd.remove(abstractC55719xpJ.EZpvd());
                    }
                    this.EZpvd.put(abstractC55719xpJ.EZpvd(), new xDQ(abstractC55719xpJ.EZpvd(), abstractC55719xpJ));
                } else if (next instanceof AbstractC55722xpM) {
                    AbstractC55722xpM abstractC55722xpM = (AbstractC55722xpM) next;
                    java.lang.Object obj39 = this.EZpvd.get(abstractC55722xpM.EZpvd());
                    if (obj39 != null && (obj39 instanceof xDN)) {
                        ((xDN) obj39).EZpvd();
                        this.EZpvd.remove(abstractC55722xpM.EZpvd());
                    }
                    this.EZpvd.put(abstractC55722xpM.EZpvd(), new xDN(abstractC55722xpM.EZpvd(), abstractC55722xpM));
                } else if (next instanceof AbstractC55733xpX) {
                    AbstractC55733xpX abstractC55733xpX = (AbstractC55733xpX) next;
                    java.lang.Object obj40 = this.EZpvd.get(abstractC55733xpX.EZpvd());
                    if (obj40 != null && (obj40 instanceof C54399xGz)) {
                        ((C54399xGz) obj40).KWHzl();
                        this.EZpvd.remove(abstractC55733xpX.EZpvd());
                    }
                    this.EZpvd.put(abstractC55733xpX.EZpvd(), new C54399xGz(abstractC55733xpX.EZpvd(), abstractC55733xpX));
                } else if (next instanceof AbstractC55725xpP) {
                    AbstractC55725xpP abstractC55725xpP = (AbstractC55725xpP) next;
                    java.lang.Object obj41 = this.EZpvd.get(abstractC55725xpP.EZpvd());
                    if (obj41 != null && (obj41 instanceof xFQ)) {
                        ((xFQ) obj41).KWHzl();
                        this.EZpvd.remove(abstractC55725xpP.EZpvd());
                    }
                    this.EZpvd.put(abstractC55725xpP.EZpvd(), new xFQ(abstractC55725xpP.EZpvd(), abstractC55725xpP));
                } else if (next instanceof AbstractC55718xpI) {
                    AbstractC55718xpI abstractC55718xpI = (AbstractC55718xpI) next;
                    java.lang.Object obj42 = this.EZpvd.get(abstractC55718xpI.copydefault());
                    if (obj42 != null && !(true ^ (obj42 instanceof xER))) {
                        ((xER) obj42).EZpvd();
                        this.EZpvd.remove(abstractC55718xpI.copydefault());
                    }
                    this.EZpvd.put(abstractC55718xpI.copydefault(), new xER(abstractC55718xpI.copydefault(), abstractC55718xpI));
                } else if (next instanceof AbstractC55717xpH) {
                    AbstractC55717xpH abstractC55717xpH = (AbstractC55717xpH) next;
                    java.lang.Object obj43 = this.EZpvd.get(abstractC55717xpH.OLrzqt());
                    if (obj43 != null && (obj43 instanceof xET)) {
                        ((xET) obj43).KWHzl();
                        this.EZpvd.remove(abstractC55717xpH.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55717xpH.OLrzqt(), new xET(abstractC55717xpH.OLrzqt(), abstractC55717xpH));
                } else if (next instanceof AbstractC55715xpF) {
                    AbstractC55715xpF abstractC55715xpF = (AbstractC55715xpF) next;
                    java.lang.Object obj44 = this.EZpvd.get(abstractC55715xpF.OLrzqt());
                    if (obj44 != null && (obj44 instanceof xGC)) {
                        ((xGC) obj44).KWHzl();
                        this.EZpvd.remove(abstractC55715xpF.OLrzqt());
                    }
                    this.EZpvd.put(abstractC55715xpF.OLrzqt(), new xGC(abstractC55715xpF.OLrzqt(), abstractC55715xpF));
                } else if (next instanceof AbstractC55737xpb) {
                    AbstractC55737xpb abstractC55737xpb = (AbstractC55737xpb) next;
                    java.lang.Object obj45 = this.EZpvd.get(abstractC55737xpb.AEQbTJ());
                    if (obj45 == null) {
                        C54403xHc c54403xHc = new C54403xHc(abstractC55737xpb.AEQbTJ(), abstractC55737xpb);
                        AbstractC57556yke abstractC57556ykeCopydefault3 = c54403xHc.copydefault();
                        if (abstractC57556ykeCopydefault3 != null) {
                            arrayList.add(abstractC57556ykeCopydefault3);
                        }
                        this.EZpvd.put(abstractC55737xpb.AEQbTJ(), c54403xHc);
                    } else if (obj45 instanceof C54403xHc) {
                        ((C54403xHc) obj45).copydefault((AbstractC55755xpt) next);
                    }
                } else if (next instanceof xAF) {
                    xAF xaf = (xAF) next;
                    java.lang.Object obj46 = this.EZpvd.get(xaf.OLrzqt());
                    if (obj46 != null && (obj46 instanceof C54326xEg)) {
                        ((C54326xEg) obj46).isConnected();
                        this.EZpvd.remove(xaf.OLrzqt());
                    }
                    this.EZpvd.put(xaf.OLrzqt(), new C54326xEg(xaf.OLrzqt(), xaf));
                } else if (next instanceof AbstractC55678xoV) {
                    AbstractC55678xoV abstractC55678xoV = (AbstractC55678xoV) next;
                    java.lang.Object obj47 = this.EZpvd.get(abstractC55678xoV.AEQbTJ());
                    if (obj47 != null && (obj47 instanceof xES)) {
                        ((xES) obj47).EZpvd();
                        this.EZpvd.remove(abstractC55678xoV.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55678xoV.AEQbTJ(), new xES(abstractC55678xoV.AEQbTJ(), abstractC55678xoV));
                } else if (next instanceof AbstractC55736xpa) {
                    AbstractC55736xpa abstractC55736xpa = (AbstractC55736xpa) next;
                    java.lang.Object obj48 = this.EZpvd.get(abstractC55736xpa.OLrzqt());
                    if (obj48 == null) {
                        this.EZpvd.put(abstractC55736xpa.OLrzqt(), new xFV(abstractC55736xpa));
                    } else if (obj48 instanceof xFV) {
                        ((xFV) obj48).AEQbTJ(abstractC55736xpa);
                    }
                } else if (next instanceof AbstractC55739xpd) {
                    AbstractC55739xpd abstractC55739xpd = (AbstractC55739xpd) next;
                    java.lang.Object obj49 = this.EZpvd.get(abstractC55739xpd.AEQbTJ());
                    if (obj49 == null || !(obj49 instanceof C54349xFc)) {
                        this.EZpvd.put(abstractC55739xpd.AEQbTJ(), new C54349xFc(abstractC55739xpd.AEQbTJ(), abstractC55739xpd));
                    } else {
                        int i16 = copydefault + 11;
                        AEQbTJ = i16 % 128;
                        if (i16 % 2 != 0) {
                            ((C54349xFc) obj49).EZpvd(abstractC55739xpd);
                            int i17 = 26 / 0;
                        } else {
                            ((C54349xFc) obj49).EZpvd(abstractC55739xpd);
                        }
                    }
                } else if (next instanceof AbstractC55659xoC) {
                    AbstractC55659xoC abstractC55659xoC = (AbstractC55659xoC) next;
                    java.lang.Object obj50 = this.EZpvd.get(abstractC55659xoC.AEQbTJ());
                    if (obj50 != null && (obj50 instanceof C54332xEm)) {
                        ((C54332xEm) obj50).copydefault();
                        this.EZpvd.remove(abstractC55659xoC.AEQbTJ());
                    }
                    this.EZpvd.put(abstractC55659xoC.AEQbTJ(), new C54332xEm(abstractC55659xoC.AEQbTJ(), abstractC55659xoC));
                } else if (next instanceof AbstractC55674xoR) {
                    AbstractC55674xoR abstractC55674xoR = (AbstractC55674xoR) next;
                    java.lang.Object obj51 = this.EZpvd.get(abstractC55674xoR.AEQbTJ());
                    if (obj51 == null) {
                        xGU xgu = new xGU(abstractC55674xoR.AEQbTJ(), abstractC55674xoR);
                        AbstractC57556yke abstractC57556ykeKWHzl4 = xgu.KWHzl();
                        if (abstractC57556ykeKWHzl4 != null) {
                            arrayList.add(abstractC57556ykeKWHzl4);
                        }
                        this.EZpvd.put(abstractC55674xoR.AEQbTJ(), xgu);
                    } else if (obj51 instanceof xGU) {
                        ((xGU) obj51).AEQbTJ((AbstractC55755xpt<?>) next);
                    }
                } else if (next instanceof AbstractC55679xoW) {
                    AbstractC55679xoW abstractC55679xoW = (AbstractC55679xoW) next;
                    java.lang.Object obj52 = this.EZpvd.get(abstractC55679xoW.AEQbTJ());
                    if (obj52 == null) {
                        xEV xev = new xEV(abstractC55679xoW.AEQbTJ(), abstractC55679xoW);
                        AbstractC57556yke abstractC57556ykeKWHzl5 = xev.KWHzl();
                        if (abstractC57556ykeKWHzl5 != null) {
                            arrayList.add(abstractC57556ykeKWHzl5);
                        }
                        this.EZpvd.put(abstractC55679xoW.AEQbTJ(), xev);
                    } else if (obj52 instanceof xGU) {
                        ((xGU) obj52).AEQbTJ((AbstractC55755xpt<?>) next);
                    }
                } else {
                    Intrinsics.copydefault(next, "");
                    AbstractC55755xpt<?> abstractC55755xpt2 = (AbstractC55755xpt) next;
                    java.lang.Object obj53 = this.EZpvd.get(abstractC55755xpt2.AEQbTJ());
                    if (obj53 == null) {
                        xGK xgk = new xGK(abstractC55755xpt2.AEQbTJ(), abstractC55755xpt2);
                        AbstractC57556yke abstractC57556ykeEZpvd2 = xgk.EZpvd();
                        if (abstractC57556ykeEZpvd2 != null) {
                            arrayList.add(abstractC57556ykeEZpvd2);
                        }
                        this.EZpvd.put(abstractC55755xpt2.AEQbTJ(), xgk);
                    } else if (obj53 instanceof xGK) {
                        ((xGK) obj53).KWHzl(abstractC55755xpt2);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033d A[PHI: r3 r4
  0x033d: PHI (r3v54 java.lang.Object) = (r3v53 java.lang.Object), (r3v57 java.lang.Object) binds: [B:153:0x033b, B:150:0x0329] A[DONT_GENERATE, DONT_INLINE]
  0x033d: PHI (r4v44 o.xoV) = (r4v43 o.xoV), (r4v47 o.xoV) binds: [B:153:0x033b, B:150:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull java.util.List<? extends java.lang.Object> list) {
        AbstractC55678xoV abstractC55678xoV;
        java.lang.Object obj;
        AbstractC55720xpK abstractC55720xpK;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("非法线程");
        }
        java.util.Iterator<? extends java.lang.Object> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i2 = copydefault + 31;
                AEQbTJ = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            java.lang.Object next = it.next();
            if (next instanceof AbstractC55729xpT) {
                AbstractC55729xpT abstractC55729xpT = (AbstractC55729xpT) next;
                java.lang.Object obj2 = this.EZpvd.get(abstractC55729xpT.AEQbTJ());
                copydefault(obj2, abstractC55729xpT);
                if (obj2 != null) {
                    this.EZpvd.remove(abstractC55729xpT.AEQbTJ());
                }
            } else if (next instanceof AbstractC55723xpN) {
                AbstractC55723xpN abstractC55723xpN = (AbstractC55723xpN) next;
                java.lang.Object obj3 = this.EZpvd.get(abstractC55723xpN.EZpvd());
                if (obj3 != null && (obj3 instanceof C54353xFg)) {
                    int i3 = copydefault + 13;
                    AEQbTJ = i3 % 128;
                    int i4 = i3 % 2;
                    if (((C54353xFg) obj3).OLrzqt(next)) {
                        this.EZpvd.remove(abstractC55723xpN.EZpvd());
                    }
                }
            } else if (next instanceof AbstractC55724xpO) {
                AbstractC55724xpO abstractC55724xpO = (AbstractC55724xpO) next;
                java.lang.Object obj4 = this.EZpvd.get(abstractC55724xpO.OLrzqt());
                if (obj4 != null && (obj4 instanceof xFA) && ((xFA) obj4).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55724xpO.OLrzqt());
                }
            } else if (next instanceof AbstractC55728xpS) {
                AbstractC55728xpS abstractC55728xpS = (AbstractC55728xpS) next;
                java.lang.Object obj5 = this.EZpvd.get(abstractC55728xpS.OLrzqt());
                if (obj5 != null && (obj5 instanceof xFR)) {
                    int i5 = AEQbTJ + 13;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    if (((xFR) obj5).OLrzqt(next)) {
                        this.EZpvd.remove(abstractC55728xpS.OLrzqt());
                    }
                }
            } else if (next instanceof AbstractC55721xpL) {
                AbstractC55721xpL abstractC55721xpL = (AbstractC55721xpL) next;
                java.lang.Object obj6 = this.EZpvd.get(abstractC55721xpL.AEQbTJ());
                if (obj6 != null && (obj6 instanceof xFB) && ((xFB) obj6).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55721xpL.AEQbTJ());
                }
            } else if (next instanceof AbstractC55730xpU) {
                AbstractC55730xpU abstractC55730xpU = (AbstractC55730xpU) next;
                java.lang.Object obj7 = this.EZpvd.get(abstractC55730xpU.copydefault());
                AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), new java.lang.Object[]{this, obj7, abstractC55730xpU}, 682788914, -682788912, TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl());
                if (obj7 != null) {
                    this.EZpvd.remove(abstractC55730xpU.copydefault());
                }
            } else if (next instanceof AbstractC55740xpe) {
                AbstractC55740xpe abstractC55740xpe = (AbstractC55740xpe) next;
                java.lang.Object obj8 = this.EZpvd.get(abstractC55740xpe.fIwbmz());
                copydefault(obj8);
                if (obj8 != null) {
                    this.EZpvd.remove(abstractC55740xpe.fIwbmz());
                }
            } else if (next instanceof AbstractC55747xpl) {
                AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) next;
                java.lang.Object obj9 = this.EZpvd.get(abstractC55747xpl.AhwBna());
                if (obj9 != null && (obj9 instanceof xFY) && ((xFY) obj9).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55747xpl.AhwBna());
                }
            } else if (next instanceof AbstractC55739xpd) {
                AbstractC55739xpd abstractC55739xpd = (AbstractC55739xpd) next;
                java.lang.Object obj10 = this.EZpvd.get(abstractC55739xpd.AEQbTJ());
                if (obj10 != null && (obj10 instanceof C54349xFc) && ((C54349xFc) obj10).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55739xpd.AEQbTJ());
                }
            } else if (next instanceof AbstractC55657xoA) {
                AbstractC55657xoA abstractC55657xoA = (AbstractC55657xoA) next;
                java.lang.Object obj11 = this.EZpvd.get(abstractC55657xoA.AEQbTJ());
                if (obj11 != null && (obj11 instanceof xEZ) && ((xEZ) obj11).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55657xoA.AEQbTJ());
                }
            } else if (next instanceof AbstractC55760xpy) {
                AbstractC55760xpy abstractC55760xpy = (AbstractC55760xpy) next;
                java.lang.Object obj12 = this.EZpvd.get(abstractC55760xpy.AEQbTJ());
                if (obj12 != null) {
                    int i7 = copydefault + 73;
                    AEQbTJ = i7 % 128;
                    int i8 = i7 % 2;
                    if ((obj12 instanceof xFS) && ((xFS) obj12).OLrzqt(next)) {
                        this.EZpvd.remove(abstractC55760xpy.AEQbTJ());
                    }
                }
            } else if (next instanceof AbstractC55664xoH) {
                AbstractC55664xoH abstractC55664xoH = (AbstractC55664xoH) next;
                java.lang.Object obj13 = this.EZpvd.get(abstractC55664xoH.AEQbTJ());
                if (obj13 != null && (obj13 instanceof C54345xEz) && ((C54345xEz) obj13).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55664xoH.AEQbTJ());
                }
            } else if (next instanceof AbstractC55758xpw) {
                AbstractC55758xpw abstractC55758xpw = (AbstractC55758xpw) next;
                java.lang.Object obj14 = this.EZpvd.get(abstractC55758xpw.AEQbTJ());
                if (obj14 != null) {
                    int i9 = copydefault + 49;
                    AEQbTJ = i9 % 128;
                    int i10 = i9 % 2;
                    if ((obj14 instanceof C54366xFt) && ((C54366xFt) obj14).OLrzqt(next)) {
                        this.EZpvd.remove(abstractC55758xpw.AEQbTJ());
                    }
                }
            } else if (next instanceof AbstractC55757xpv) {
                AbstractC55757xpv abstractC55757xpv = (AbstractC55757xpv) next;
                java.lang.Object obj15 = this.EZpvd.get(abstractC55757xpv.AEQbTJ());
                if (obj15 != null && (obj15 instanceof C54367xFu) && ((C54367xFu) obj15).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55757xpv.AEQbTJ());
                }
            } else if (next instanceof AbstractC55761xpz) {
                AbstractC55761xpz abstractC55761xpz = (AbstractC55761xpz) next;
                java.lang.Object obj16 = this.EZpvd.get(abstractC55761xpz.AEQbTJ());
                if (obj16 != null && !(true ^ (obj16 instanceof C54370xFx)) && ((C54370xFx) obj16).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55761xpz.AEQbTJ());
                }
            } else if (next instanceof AbstractC55713xpD) {
                AbstractC55713xpD abstractC55713xpD = (AbstractC55713xpD) next;
                java.lang.Object obj17 = this.EZpvd.get(abstractC55713xpD.AEQbTJ());
                if (obj17 != null && (obj17 instanceof C54383xGj)) {
                    ((C54383xGj) obj17).OLrzqt(next);
                }
                if (obj17 != null) {
                    this.EZpvd.remove(abstractC55713xpD.AEQbTJ());
                }
            } else if (next instanceof AbstractC55746xpk) {
                AbstractC55746xpk abstractC55746xpk = (AbstractC55746xpk) next;
                java.lang.Object obj18 = this.EZpvd.get(abstractC55746xpk.AEQbTJ());
                AEQbTJ(obj18, abstractC55746xpk);
                if (obj18 != null) {
                    this.EZpvd.remove(abstractC55746xpk.AEQbTJ());
                }
            } else if (next instanceof AbstractC55678xoV) {
                int i11 = AEQbTJ + 121;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    abstractC55678xoV = (AbstractC55678xoV) next;
                    obj = this.EZpvd.get(abstractC55678xoV.AEQbTJ());
                    int i12 = 62 / 0;
                    if (obj instanceof xES) {
                        xgq = (xES) obj;
                    }
                    if (xgq != null) {
                        xgq.OLrzqt(next);
                    }
                    if (obj == null) {
                        this.EZpvd.remove(abstractC55678xoV.AEQbTJ());
                    }
                } else {
                    abstractC55678xoV = (AbstractC55678xoV) next;
                    obj = this.EZpvd.get(abstractC55678xoV.AEQbTJ());
                    if (obj instanceof xES) {
                    }
                    if (xgq != null) {
                    }
                    if (obj == null) {
                    }
                }
            } else if (next instanceof AbstractC55755xpt) {
                AbstractC55755xpt<?> abstractC55755xpt = (AbstractC55755xpt) next;
                AEQbTJ(this.EZpvd.get(abstractC55755xpt.AEQbTJ()), abstractC55755xpt);
            } else if (next instanceof AbstractC55669xoM) {
                AbstractC55669xoM abstractC55669xoM = (AbstractC55669xoM) next;
                java.lang.Object obj19 = this.EZpvd.get(abstractC55669xoM.gEmmrt());
                if (obj19 != null && (obj19 instanceof C54343xEx) && ((C54343xEx) obj19).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55669xoM.gEmmrt());
                }
            } else if (next instanceof AbstractC55741xpf) {
                int i13 = AEQbTJ + 37;
                copydefault = i13 % 128;
                if (i13 % 2 == 0) {
                    this.EZpvd.get(((AbstractC55741xpf) next).AYXKKw());
                    throw null;
                }
                AbstractC55741xpf abstractC55741xpf = (AbstractC55741xpf) next;
                java.lang.Object obj20 = this.EZpvd.get(abstractC55741xpf.AYXKKw());
                if (obj20 != null) {
                    int i14 = AEQbTJ + 33;
                    copydefault = i14 % 128;
                    if (i14 % 2 == 0) {
                        boolean z = obj20 instanceof xEU;
                        throw null;
                    }
                    if ((obj20 instanceof xEU) && ((xEU) obj20).OLrzqt(next)) {
                        this.EZpvd.remove(abstractC55741xpf.AYXKKw());
                    }
                } else {
                    continue;
                }
            } else if (next instanceof AbstractC55680xoX) {
                AbstractC55680xoX abstractC55680xoX = (AbstractC55680xoX) next;
                java.lang.Object obj21 = this.EZpvd.get(abstractC55680xoX.AEQbTJ());
                if (obj21 != null && (obj21 instanceof xEE) && ((xEE) obj21).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55680xoX.AEQbTJ());
                }
            } else if (next instanceof AbstractC55706xox) {
                AbstractC55706xox abstractC55706xox = (AbstractC55706xox) next;
                java.lang.Object obj22 = this.EZpvd.get(abstractC55706xox.copydefault());
                if (obj22 != null && (obj22 instanceof xDX) && ((xDX) obj22).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55706xox.copydefault());
                }
            } else if (next instanceof AbstractC55661xoE) {
                AbstractC55661xoE abstractC55661xoE = (AbstractC55661xoE) next;
                java.lang.Object obj23 = this.EZpvd.get(abstractC55661xoE.copydefault());
                if (obj23 != null && (obj23 instanceof xDX) && ((xDX) obj23).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55661xoE.copydefault());
                }
            } else if (next instanceof AbstractC55753xpr) {
                AbstractC55753xpr abstractC55753xpr = (AbstractC55753xpr) next;
                java.lang.Object obj24 = this.EZpvd.get(abstractC55753xpr.OLrzqt());
                if (obj24 != null && (obj24 instanceof xGB) && ((xGB) obj24).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55753xpr.OLrzqt());
                }
            } else if (next instanceof AbstractC55666xoJ) {
                AbstractC55666xoJ abstractC55666xoJ = (AbstractC55666xoJ) next;
                java.lang.Object obj25 = this.EZpvd.get(abstractC55666xoJ.OLrzqt());
                if (obj25 != null && (obj25 instanceof C54340xEu) && ((C54340xEu) obj25).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55666xoJ.OLrzqt());
                }
            } else if (next instanceof AbstractC55667xoK) {
                AbstractC55667xoK abstractC55667xoK = (AbstractC55667xoK) next;
                java.lang.Object obj26 = this.EZpvd.get(abstractC55667xoK.EZpvd());
                if (obj26 != null && (obj26 instanceof C54335xEp) && ((C54335xEp) obj26).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55667xoK.EZpvd());
                }
            } else if (next instanceof AbstractC55665xoI) {
                AbstractC55665xoI abstractC55665xoI = (AbstractC55665xoI) next;
                java.lang.Object obj27 = this.EZpvd.get(abstractC55665xoI.KWHzl());
                if (obj27 != null && (obj27 instanceof C54339xEt) && ((C54339xEt) obj27).OLrzqt(next)) {
                    this.EZpvd.remove(abstractC55665xoI.KWHzl());
                }
            } else if (next instanceof AbstractC55720xpK) {
                int i15 = AEQbTJ + 19;
                copydefault = i15 % 128;
                if (i15 % 2 == 0) {
                    abstractC55720xpK = (AbstractC55720xpK) next;
                    java.lang.Object obj28 = this.EZpvd.get(abstractC55720xpK.copydefault());
                    KWHzl(obj28, abstractC55720xpK);
                    int i16 = 49 / 0;
                    if (obj28 != null) {
                        this.EZpvd.remove(abstractC55720xpK.copydefault());
                    }
                } else {
                    abstractC55720xpK = (AbstractC55720xpK) next;
                    java.lang.Object obj29 = this.EZpvd.get(abstractC55720xpK.copydefault());
                    KWHzl(obj29, abstractC55720xpK);
                    if (obj29 != null) {
                        this.EZpvd.remove(abstractC55720xpK.copydefault());
                    }
                }
            } else if (next instanceof AbstractC55714xpE) {
                int i17 = copydefault + 39;
                AEQbTJ = i17 % 128;
                if (i17 % 2 != 0) {
                    AbstractC55714xpE abstractC55714xpE = (AbstractC55714xpE) next;
                    KWHzl(this.EZpvd.get(abstractC55714xpE.OLrzqt()), abstractC55714xpE);
                    xgq.hashCode();
                    throw null;
                }
                AbstractC55714xpE abstractC55714xpE2 = (AbstractC55714xpE) next;
                java.lang.Object obj30 = this.EZpvd.get(abstractC55714xpE2.OLrzqt());
                KWHzl(obj30, abstractC55714xpE2);
                if (obj30 != null) {
                    this.EZpvd.remove(abstractC55714xpE2.OLrzqt());
                }
            } else if (next instanceof AbstractC55731xpV) {
                AbstractC55731xpV abstractC55731xpV = (AbstractC55731xpV) next;
                java.lang.Object obj31 = this.EZpvd.get(abstractC55731xpV.AEQbTJ());
                OLrzqt(obj31, abstractC55731xpV);
                if (obj31 != null) {
                    this.EZpvd.remove(abstractC55731xpV.AEQbTJ());
                }
            } else if (next instanceof AbstractC55719xpJ) {
                AbstractC55719xpJ abstractC55719xpJ = (AbstractC55719xpJ) next;
                java.lang.Object obj32 = this.EZpvd.get(abstractC55719xpJ.EZpvd());
                copydefault(obj32, abstractC55719xpJ);
                if (obj32 != null) {
                    this.EZpvd.remove(abstractC55719xpJ.EZpvd());
                }
            } else if (next instanceof AbstractC55722xpM) {
                AbstractC55722xpM abstractC55722xpM = (AbstractC55722xpM) next;
                java.lang.Object obj33 = this.EZpvd.get(abstractC55722xpM.EZpvd());
                AEQbTJ(obj33, abstractC55722xpM);
                if (obj33 != null) {
                    this.EZpvd.remove(abstractC55722xpM.EZpvd());
                }
            } else if (next instanceof AbstractC55733xpX) {
                AbstractC55733xpX abstractC55733xpX = (AbstractC55733xpX) next;
                java.lang.Object obj34 = this.EZpvd.get(abstractC55733xpX.EZpvd());
                KWHzl(obj34, abstractC55733xpX);
                if (obj34 != null) {
                    this.EZpvd.remove(abstractC55733xpX.EZpvd());
                }
            } else if (next instanceof AbstractC55725xpP) {
                AbstractC55725xpP abstractC55725xpP = (AbstractC55725xpP) next;
                java.lang.Object obj35 = this.EZpvd.get(abstractC55725xpP.EZpvd());
                AEQbTJ(obj35, abstractC55725xpP);
                if (obj35 != null) {
                    this.EZpvd.remove(abstractC55725xpP.EZpvd());
                }
            } else if (next instanceof AbstractC55718xpI) {
                AbstractC55718xpI abstractC55718xpI = (AbstractC55718xpI) next;
                java.lang.Object obj36 = this.EZpvd.get(abstractC55718xpI.copydefault());
                AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), new java.lang.Object[]{this, obj36, abstractC55718xpI}, -56426470, 56426470, TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl());
                if (obj36 != null) {
                    this.EZpvd.remove(abstractC55718xpI.copydefault());
                }
            } else if (!(!(next instanceof AbstractC55659xoC))) {
                AbstractC55659xoC abstractC55659xoC = (AbstractC55659xoC) next;
                java.lang.Object obj37 = this.EZpvd.get(abstractC55659xoC.AEQbTJ());
                AEQbTJ(obj37, abstractC55659xoC);
                if (obj37 != null) {
                    this.EZpvd.remove(abstractC55659xoC.AEQbTJ());
                }
            } else if (next instanceof AbstractC55717xpH) {
                AbstractC55717xpH abstractC55717xpH = (AbstractC55717xpH) next;
                java.lang.Object obj38 = this.EZpvd.get(abstractC55717xpH.OLrzqt());
                AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), new java.lang.Object[]{this, obj38, abstractC55717xpH}, -1568154757, 1568154758, TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl());
                if (obj38 != null) {
                    this.EZpvd.remove(abstractC55717xpH.OLrzqt());
                }
            } else if (next instanceof AbstractC55715xpF) {
                AbstractC55715xpF abstractC55715xpF = (AbstractC55715xpF) next;
                java.lang.Object obj39 = this.EZpvd.get(abstractC55715xpF.OLrzqt());
                KWHzl(obj39, abstractC55715xpF);
                if (obj39 != null) {
                    this.EZpvd.remove(abstractC55715xpF.OLrzqt());
                }
            } else if (next instanceof xAF) {
                xAF xaf = (xAF) next;
                java.lang.Object obj40 = this.EZpvd.get(xaf.OLrzqt());
                xgq = obj40 instanceof C54326xEg ? (C54326xEg) obj40 : null;
                if (xgq != null) {
                    xgq.OLrzqt(next);
                }
                if (obj40 != null) {
                    this.EZpvd.remove(xaf.OLrzqt());
                }
            } else if (next instanceof AbstractC55679xoW) {
                AbstractC55679xoW abstractC55679xoW = (AbstractC55679xoW) next;
                java.lang.Object obj41 = this.EZpvd.get(abstractC55679xoW.AEQbTJ());
                xgq = obj41 instanceof xEV ? (xEV) obj41 : null;
                if (xgq != null) {
                    xgq.OLrzqt(next);
                }
                if (obj41 != null) {
                    this.EZpvd.remove(abstractC55679xoW.AEQbTJ());
                }
            } else if (next instanceof AbstractC55736xpa) {
                AbstractC55736xpa abstractC55736xpa = (AbstractC55736xpa) next;
                java.lang.Object obj42 = this.EZpvd.get(abstractC55736xpa.OLrzqt());
                xgq = obj42 instanceof xFV ? (xFV) obj42 : null;
                if (xgq != null) {
                    xgq.OLrzqt(next);
                }
                if (obj42 != null) {
                    this.EZpvd.remove(abstractC55736xpa.OLrzqt());
                }
            }
        }
    }

    public final void AEQbTJ(java.lang.Object obj, AbstractC55746xpk abstractC55746xpk) {
        int i = 2 % 2;
        int i2 = AEQbTJ + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (obj != null && (obj instanceof xGL)) {
            ((xGL) obj).OLrzqt(abstractC55746xpk);
        }
        int i3 = AEQbTJ + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void copydefault(java.lang.Object obj, AbstractC55729xpT abstractC55729xpT) {
        int i = 2 % 2;
        int i2 = AEQbTJ;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
            if (obj == null) {
                return;
            }
        } else if (obj == null) {
            return;
        }
        if (obj instanceof xFU) {
            int i5 = i2 + 15;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            ((xFU) obj).OLrzqt(abstractC55729xpT);
            int i7 = AEQbTJ + 77;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        AbstractC55730xpU abstractC55730xpU = (AbstractC55730xpU) objArr[2];
        int i = 2 % 2;
        if (obj != null) {
            int i2 = AEQbTJ;
            int i3 = i2 + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (!(true ^ (obj instanceof C54398xGy))) {
                int i5 = i2 + 17;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                ((C54398xGy) obj).OLrzqt(abstractC55730xpU);
                if (i6 == 0) {
                    throw null;
                }
            }
        }
        return null;
    }

    public final void copydefault(java.lang.Object obj) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = AEQbTJ + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (obj instanceof C54358xFl) {
                ((C54358xFl) obj).copydefault();
            }
        }
        int i4 = copydefault + 23;
        AEQbTJ = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [895=4] */
    public final void AEQbTJ(java.lang.Object obj, AbstractC55755xpt<?> abstractC55755xpt) {
        int i = 2 % 2;
        int i2 = AEQbTJ;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
            if (obj == null) {
                return;
            }
        } else if (obj == null) {
            return;
        }
        if (obj instanceof xGQ) {
            int i5 = i2 + 93;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 64 / 0;
                if (!((xGQ) obj).OLrzqt(abstractC55755xpt)) {
                    return;
                }
            } else if (!((xGQ) obj).OLrzqt(abstractC55755xpt)) {
                return;
            }
            int i7 = copydefault + 43;
            AEQbTJ = i7 % 128;
            int i8 = i7 % 2;
            this.EZpvd.remove(abstractC55755xpt.AEQbTJ());
            int i9 = AEQbTJ + 21;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public final void KWHzl(java.lang.Object obj, AbstractC55720xpK abstractC55720xpK) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = AEQbTJ + 103;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (obj instanceof xDP) {
                int i5 = i3 + 49;
                AEQbTJ = i5 % 128;
                int i6 = i5 % 2;
                ((xDP) obj).OLrzqt(abstractC55720xpK);
                if (i6 != 0) {
                    java.lang.Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
        }
        int i7 = AEQbTJ + 107;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void KWHzl(java.lang.Object obj, AbstractC55714xpE abstractC55714xpE) {
        int i = 2 % 2;
        int i2 = AEQbTJ + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj != null && (obj instanceof C54322xEc)) {
            ((C54322xEc) obj).OLrzqt(abstractC55714xpE);
        }
        int i3 = copydefault + 123;
        AEQbTJ = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void OLrzqt(java.lang.Object obj, AbstractC55731xpV abstractC55731xpV) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        AEQbTJ = i3;
        int i4 = i2 % 2;
        if (obj == null || !(obj instanceof C54390xGq)) {
            return;
        }
        int i5 = i3 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        ((C54390xGq) obj).OLrzqt(abstractC55731xpV);
        if (i6 == 0) {
            throw null;
        }
    }

    public final void copydefault(java.lang.Object obj, AbstractC55719xpJ abstractC55719xpJ) {
        int i = 2 % 2;
        java.lang.Object obj2 = null;
        if (obj != null && (obj instanceof xDQ)) {
            int i2 = copydefault + 61;
            AEQbTJ = i2 % 128;
            int i3 = i2 % 2;
            ((xDQ) obj).OLrzqt(abstractC55719xpJ);
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = copydefault + 59;
        AEQbTJ = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public final void AEQbTJ(java.lang.Object obj, AbstractC55722xpM abstractC55722xpM) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        AEQbTJ = i3 % 128;
        int i4 = i3 % 2;
        if (obj != null) {
            int i5 = i2 + 75;
            AEQbTJ = i5 % 128;
            if (i5 % 2 == 0) {
                if (obj instanceof xDN) {
                    ((xDN) obj).OLrzqt(abstractC55722xpM);
                }
            } else {
                boolean z = obj instanceof xDN;
                java.lang.Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
        int i6 = AEQbTJ + 15;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
    }

    public final void KWHzl(java.lang.Object obj, AbstractC55733xpX abstractC55733xpX) {
        int i = 2 % 2;
        int i2 = AEQbTJ + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            int i5 = i3 + 89;
            AEQbTJ = i5 % 128;
            if (i5 % 2 == 0) {
                if (!(obj instanceof C54399xGz)) {
                    return;
                }
                ((C54399xGz) obj).OLrzqt(abstractC55733xpX);
                return;
            }
            boolean z = obj instanceof C54399xGz;
            throw null;
        }
    }

    public final void AEQbTJ(java.lang.Object obj, AbstractC55725xpP abstractC55725xpP) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = AEQbTJ;
            int i3 = i2 + 51;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (obj instanceof xFQ) {
                int i5 = i2 + 25;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                ((xFQ) obj).OLrzqt(abstractC55725xpP);
                if (i6 == 0) {
                    throw null;
                }
            }
        }
    }

    private static /* synthetic */ java.lang.Object AEQbTJ(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        AbstractC55718xpI abstractC55718xpI = (AbstractC55718xpI) objArr[2];
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        AEQbTJ = i3;
        java.lang.Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null && !(!(obj instanceof xER))) {
            int i4 = i3 + 79;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ((xER) obj).OLrzqt(abstractC55718xpI);
        }
        return null;
    }

    public final void AEQbTJ(java.lang.Object obj, AbstractC55659xoC abstractC55659xoC) {
        int i = 2 % 2;
        if (obj == null || !(obj instanceof C54332xEm)) {
            return;
        }
        int i2 = AEQbTJ + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ((C54332xEm) obj).OLrzqt(abstractC55659xoC);
        int i4 = copydefault + 13;
        AEQbTJ = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        AbstractC55717xpH abstractC55717xpH = (AbstractC55717xpH) objArr[2];
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AEQbTJ = i3 % 128;
        int i4 = i3 % 2;
        java.lang.Object obj2 = null;
        if (obj != null) {
            int i5 = i2 + 121;
            AEQbTJ = i5 % 128;
            if (i5 % 2 == 0) {
                if (!(true ^ (obj instanceof xET))) {
                    ((xET) obj).OLrzqt(abstractC55717xpH);
                }
            } else {
                boolean z = obj instanceof xET;
                obj2.hashCode();
                throw null;
            }
        }
        return null;
    }

    public final void KWHzl(java.lang.Object obj, AbstractC55715xpF abstractC55715xpF) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = copydefault + 99;
            int i3 = i2 % 128;
            AEQbTJ = i3;
            int i4 = i2 % 2;
            if (obj instanceof xGC) {
                int i5 = i3 + 15;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                ((xGC) obj).OLrzqt(abstractC55715xpF);
            }
        }
        int i7 = AEQbTJ + 107;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void EZpvd(java.lang.Object obj, AbstractC55730xpU abstractC55730xpU) {
        int iKWHzl = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl2 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl3 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), iKWHzl, new java.lang.Object[]{this, obj, abstractC55730xpU}, 682788914, -682788912, iKWHzl2, iKWHzl3);
    }

    public final void KWHzl(java.lang.Object obj, AbstractC55718xpI abstractC55718xpI) {
        int iKWHzl = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl2 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl3 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), iKWHzl, new java.lang.Object[]{this, obj, abstractC55718xpI}, -56426470, 56426470, iKWHzl2, iKWHzl3);
    }

    public final void AEQbTJ(java.lang.Object obj, AbstractC55717xpH abstractC55717xpH) {
        int iKWHzl = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl2 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        int iKWHzl3 = TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl();
        AEQbTJ(TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1.KWHzl(), iKWHzl, new java.lang.Object[]{this, obj, abstractC55717xpH}, -1568154757, 1568154758, iKWHzl2, iKWHzl3);
    }
}
