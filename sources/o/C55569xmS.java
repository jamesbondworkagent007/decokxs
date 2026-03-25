package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xmS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55569xmS {
    public final java.util.HashMap<java.lang.String, java.lang.Object> KWHzl = new java.util.HashMap<>();

    public final void OLrzqt(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("非法线程");
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof AbstractC55571xmU) {
                AbstractC55571xmU abstractC55571xmU = (AbstractC55571xmU) obj;
                java.lang.Object obj2 = this.KWHzl.get(abstractC55571xmU.copydefault());
                if (obj2 != null && (obj2 instanceof C55511xlN)) {
                    ((C55511xlN) obj2).AYXKKw();
                    this.KWHzl.remove(abstractC55571xmU.copydefault());
                }
                this.KWHzl.put(abstractC55571xmU.copydefault(), new C55511xlN(abstractC55571xmU.copydefault(), abstractC55571xmU));
            }
            if (obj instanceof AbstractC55567xmQ) {
                AbstractC55567xmQ abstractC55567xmQ = (AbstractC55567xmQ) obj;
                java.lang.Object obj3 = this.KWHzl.get(abstractC55567xmQ.AEQbTJ());
                if (obj3 != null && (obj3 instanceof C55508xlK)) {
                    ((C55508xlK) obj3).djBIcL();
                    this.KWHzl.remove(abstractC55567xmQ.AEQbTJ());
                }
                this.KWHzl.put(abstractC55567xmQ.AEQbTJ(), new C55508xlK(abstractC55567xmQ.AEQbTJ(), abstractC55567xmQ));
            }
            if (obj instanceof AbstractC55576xmZ) {
                AbstractC55576xmZ abstractC55576xmZ = (AbstractC55576xmZ) obj;
                java.lang.Object obj4 = this.KWHzl.get(abstractC55576xmZ.OLrzqt());
                if (obj4 != null && (obj4 instanceof C55562xmL)) {
                    ((C55562xmL) obj4).AhwBna();
                    this.KWHzl.remove(abstractC55576xmZ.OLrzqt());
                }
                this.KWHzl.put(abstractC55576xmZ.OLrzqt(), new C55562xmL(abstractC55576xmZ.OLrzqt(), abstractC55576xmZ));
            }
            if (obj instanceof AbstractC55575xmY) {
                AbstractC55575xmY abstractC55575xmY = (AbstractC55575xmY) obj;
                java.lang.Object obj5 = this.KWHzl.get(abstractC55575xmY.EZpvd());
                if (obj5 != null && (obj5 instanceof C55521xlX)) {
                    ((C55521xlX) obj5).valueOf();
                    this.KWHzl.remove(abstractC55575xmY.EZpvd());
                }
                this.KWHzl.put(abstractC55575xmY.EZpvd(), new C55521xlX(abstractC55575xmY.EZpvd(), abstractC55575xmY));
            }
            if (obj instanceof AbstractC55574xmX) {
                AbstractC55574xmX abstractC55574xmX = (AbstractC55574xmX) obj;
                java.lang.Object obj6 = this.KWHzl.get(abstractC55574xmX.EZpvd());
                if (obj6 != null && (obj6 instanceof C55580xmd)) {
                    ((C55580xmd) obj6).AYXKKw();
                    this.KWHzl.remove(abstractC55574xmX.EZpvd());
                }
                this.KWHzl.put(abstractC55574xmX.EZpvd(), new C55580xmd(abstractC55574xmX.EZpvd(), abstractC55574xmX));
            }
            if (obj instanceof AbstractC55572xmV) {
                AbstractC55572xmV abstractC55572xmV = (AbstractC55572xmV) obj;
                java.lang.Object obj7 = this.KWHzl.get(abstractC55572xmV.KWHzl());
                if (obj7 != null && (obj7 instanceof C55594xmr)) {
                    ((C55594xmr) obj7).valueOf();
                    this.KWHzl.remove(abstractC55572xmV.KWHzl());
                }
                this.KWHzl.put(abstractC55572xmV.KWHzl(), new C55594xmr(abstractC55572xmV.KWHzl(), abstractC55572xmV));
            }
            if (obj instanceof AbstractC55630xna) {
                AbstractC55630xna abstractC55630xna = (AbstractC55630xna) obj;
                java.lang.Object obj8 = this.KWHzl.get(abstractC55630xna.AEQbTJ());
                if (obj8 != null && (obj8 instanceof AbstractC55554xmD)) {
                    ((AbstractC55554xmD) obj8).djBIcL();
                    this.KWHzl.remove(abstractC55630xna.AEQbTJ());
                }
                this.KWHzl.put(abstractC55630xna.AEQbTJ(), new C55568xmR(abstractC55630xna.AEQbTJ(), (AbstractC55573xmW) obj));
            }
            if (obj instanceof AbstractC55570xmT) {
                AbstractC55570xmT abstractC55570xmT = (AbstractC55570xmT) obj;
                java.lang.Object obj9 = this.KWHzl.get(abstractC55570xmT.AEQbTJ());
                if (obj9 != null && (obj9 instanceof AbstractC55554xmD)) {
                    ((AbstractC55554xmD) obj9).djBIcL();
                    this.KWHzl.remove(abstractC55570xmT.AEQbTJ());
                }
                this.KWHzl.put(abstractC55570xmT.AEQbTJ(), new C55506xlI(abstractC55570xmT.AEQbTJ(), (AbstractC55573xmW) obj));
            }
        }
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalArgumentException("非法线程");
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof AbstractC55571xmU) {
                AbstractC55571xmU abstractC55571xmU = (AbstractC55571xmU) obj;
                java.lang.Object obj2 = this.KWHzl.get(abstractC55571xmU.copydefault());
                if (obj2 != null && (obj2 instanceof C55511xlN)) {
                    ((C55511xlN) obj2).copydefault(obj);
                    this.KWHzl.remove(abstractC55571xmU.copydefault());
                }
            }
            if (obj instanceof AbstractC55567xmQ) {
                AbstractC55567xmQ abstractC55567xmQ = (AbstractC55567xmQ) obj;
                java.lang.Object obj3 = this.KWHzl.get(abstractC55567xmQ.AEQbTJ());
                if (obj3 != null && (obj3 instanceof C55508xlK)) {
                    ((C55508xlK) obj3).AEQbTJ(obj);
                    this.KWHzl.remove(abstractC55567xmQ.AEQbTJ());
                }
            }
            if (obj instanceof AbstractC55576xmZ) {
                AbstractC55576xmZ abstractC55576xmZ = (AbstractC55576xmZ) obj;
                java.lang.Object obj4 = this.KWHzl.get(abstractC55576xmZ.OLrzqt());
                if (obj4 != null && (obj4 instanceof C55562xmL)) {
                    ((C55562xmL) obj4).OLrzqt(obj);
                    this.KWHzl.remove(abstractC55576xmZ.OLrzqt());
                }
            }
            if (obj instanceof AbstractC55575xmY) {
                AbstractC55575xmY abstractC55575xmY = (AbstractC55575xmY) obj;
                java.lang.Object obj5 = this.KWHzl.get(abstractC55575xmY.EZpvd());
                if (obj5 != null && (obj5 instanceof C55521xlX)) {
                    ((C55521xlX) obj5).EZpvd(obj);
                    this.KWHzl.remove(abstractC55575xmY.EZpvd());
                }
            }
            if (obj instanceof AbstractC55574xmX) {
                AbstractC55574xmX abstractC55574xmX = (AbstractC55574xmX) obj;
                java.lang.Object obj6 = this.KWHzl.get(abstractC55574xmX.EZpvd());
                if (obj6 != null && (obj6 instanceof C55580xmd)) {
                    ((C55580xmd) obj6).AEQbTJ(obj);
                    this.KWHzl.remove(abstractC55574xmX.EZpvd());
                }
            }
            if (obj instanceof AbstractC55572xmV) {
                AbstractC55572xmV abstractC55572xmV = (AbstractC55572xmV) obj;
                java.lang.Object obj7 = this.KWHzl.get(abstractC55572xmV.KWHzl());
                if (obj7 != null && (obj7 instanceof C55594xmr)) {
                    ((C55594xmr) obj7).AEQbTJ(obj);
                    this.KWHzl.remove(abstractC55572xmV.KWHzl());
                }
            }
            if (obj instanceof AbstractC55573xmW) {
                AbstractC55573xmW abstractC55573xmW = (AbstractC55573xmW) obj;
                java.lang.Object obj8 = this.KWHzl.get(abstractC55573xmW.AEQbTJ());
                if (obj8 != null && (obj8 instanceof AbstractC55554xmD)) {
                    ((AbstractC55554xmD) obj8).EZpvd(obj);
                    this.KWHzl.remove(abstractC55573xmW.AEQbTJ());
                }
            }
        }
    }
}
