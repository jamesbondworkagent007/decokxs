package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXH<T> {
    public java.util.List<C36343oYg> AEQbTJ;
    public android.graphics.Path AYXKKw;
    public android.graphics.Path AhwBna;
    public java.util.List<C36343oYg> AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String DbNXlk;
    public final Function1<T, java.lang.String> EZpvd;
    public java.util.List<C36343oYg> KWHzl;
    public final java.util.List<T> OLrzqt;
    public java.util.List<C36343oYg> copydefault;
    public final oXM djBIcL;
    public kotlin.Pair<java.lang.Integer, oXL<T>> ejfBZ;
    public final Function1<T, java.lang.String> fIwbmz;
    public java.util.Map<java.lang.Integer, oXL<T>> fJNWhG;
    public android.graphics.Path fetchVPNInfo;
    public boolean gEmmrt;
    public final Function1<T, java.lang.Float> isConnected;
    public final InterfaceC56387yDm valueOf;
    public kotlin.Pair<java.lang.Integer, oXL<T>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36343oYg> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36343oYg> AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Integer, oXL<T>> AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        this.AhwBna = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36343oYg> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        this.AYXKKw = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<T> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36343oYg> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.graphics.Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        this.fetchVPNInfo = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<T, java.lang.Float> fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oXM gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Integer, oXL<T>> isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Path valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Float> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public oXH(@NotNull java.util.List<? extends T> list, @NotNull Function1<? super T, java.lang.Float> function1, @NotNull oXM oxm, @NotNull Function1<? super T, java.lang.String> function12, @NotNull Function1<? super T, java.lang.String> function13) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(oxm, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.OLrzqt = list;
        this.isConnected = function1;
        this.djBIcL = oxm;
        this.EZpvd = function12;
        this.fIwbmz = function13;
        this.fetchVPNInfo = new android.graphics.Path();
        this.AhwBna = new android.graphics.Path();
        this.AYXKKw = new android.graphics.Path();
        this.KWHzl = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oXH.AEQbTJ(this.OLrzqt);
            }
        });
        this.AkhnZx = yDY.AhwBna();
        this.fJNWhG = new LinkedHashMap();
    }

    public final java.lang.Float AYXKKw() {
        return (java.lang.Float) this.valueOf.getValue();
    }

    public static final java.lang.Float AEQbTJ(oXH oxh) {
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(oxh.OLrzqt);
        if (objFirstOrNull != null) {
            return java.lang.Float.valueOf(oxh.isConnected.invoke((T) objFirstOrNull).floatValue());
        }
        return null;
    }

    public final java.lang.Float EZpvd(java.lang.Object obj) {
        if ((obj == null ? null : obj) == null) {
            return null;
        }
        return this.isConnected.invoke(obj);
    }

    public final java.lang.String AEQbTJ(java.lang.Object obj) {
        java.lang.String strInvoke;
        return (obj == null || (strInvoke = this.fIwbmz.invoke(obj)) == null) ? "" : strInvoke;
    }

    public final void EZpvd(kotlin.Pair<java.lang.Integer, oXL<T>> pair) {
        oXL<T> second;
        this.values = pair;
        this.DbNXlk = java.lang.String.valueOf((pair == null || (second = pair.getSecond()) == null) ? null : this.EZpvd.invoke(second.KWHzl()));
    }

    public final void AEQbTJ(kotlin.Pair<java.lang.Integer, oXL<T>> pair) {
        oXL<T> second;
        this.ejfBZ = pair;
        this.AuCTel = java.lang.String.valueOf((pair == null || (second = pair.getSecond()) == null) ? null : this.EZpvd.invoke(second.KWHzl()));
    }

    public final void OLrzqt(@NotNull java.util.Map<java.lang.Integer, oXL<T>> map) {
        java.lang.Float fValueOf;
        boolean z;
        T next;
        java.lang.Object objKWHzl;
        java.lang.Object objKWHzl2;
        T next2;
        java.lang.Object objKWHzl3;
        java.lang.Object objKWHzl4;
        Map.Entry entry;
        oXL<T> second;
        oXL<T> second2;
        T next3;
        C36343oYg c36343oYgCopydefault;
        C36343oYg c36343oYgCopydefault2;
        oXL oxl;
        C36343oYg c36343oYgCopydefault3;
        C36343oYg c36343oYgCopydefault4;
        Intrinsics.checkNotNullParameter(map, "");
        this.fJNWhG = map;
        java.util.Iterator<T> it = C56427yEz.DbNXlk(map).iterator();
        while (true) {
            fValueOf = null;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            oXL oxl2 = (oXL) ((Map.Entry) it.next()).getValue();
            java.lang.Float fValueOf2 = (oxl2 == null || (c36343oYgCopydefault4 = oxl2.copydefault()) == null) ? null : java.lang.Float.valueOf(c36343oYgCopydefault4.gEmmrt());
            Map.Entry entry2 = (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(map.entrySet());
            if (!Intrinsics.copydefault(fValueOf2, (entry2 == null || (oxl = (oXL) entry2.getValue()) == null || (c36343oYgCopydefault3 = oxl.copydefault()) == null) ? null : java.lang.Float.valueOf(c36343oYgCopydefault3.gEmmrt()))) {
                z = false;
                break;
            }
        }
        java.util.Iterator<T> it2 = map.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                oXL oxl3 = (oXL) ((Map.Entry) next).getValue();
                float fFloatValue = (oxl3 == null || (objKWHzl2 = oxl3.KWHzl()) == null) ? Float.MAX_VALUE : this.isConnected.invoke((T) objKWHzl2).floatValue();
                do {
                    T next4 = it2.next();
                    oXL oxl4 = (oXL) ((Map.Entry) next4).getValue();
                    float fFloatValue2 = (oxl4 == null || (objKWHzl = oxl4.KWHzl()) == null) ? Float.MAX_VALUE : this.isConnected.invoke((T) objKWHzl).floatValue();
                    if (java.lang.Float.compare(fFloatValue, fFloatValue2) > 0) {
                        next = next4;
                        fFloatValue = fFloatValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry3 = (Map.Entry) next;
        if (z) {
            java.util.Iterator<T> it3 = map.entrySet().iterator();
            if (it3.hasNext()) {
                next3 = it3.next();
                if (it3.hasNext()) {
                    oXL oxl5 = (oXL) ((Map.Entry) next3).getValue();
                    float fEZpvd = (oxl5 == null || (c36343oYgCopydefault2 = oxl5.copydefault()) == null) ? Float.MIN_VALUE : c36343oYgCopydefault2.EZpvd();
                    do {
                        T next5 = it3.next();
                        oXL oxl6 = (oXL) ((Map.Entry) next5).getValue();
                        float fEZpvd2 = (oxl6 == null || (c36343oYgCopydefault = oxl6.copydefault()) == null) ? Float.MIN_VALUE : c36343oYgCopydefault.EZpvd();
                        if (java.lang.Float.compare(fEZpvd, fEZpvd2) < 0) {
                            next3 = next5;
                            fEZpvd = fEZpvd2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next3 = null;
            }
            entry = (Map.Entry) next3;
        } else {
            java.util.Iterator<T> it4 = map.entrySet().iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                if (it4.hasNext()) {
                    oXL oxl7 = (oXL) ((Map.Entry) next2).getValue();
                    float fFloatValue3 = (oxl7 == null || (objKWHzl4 = oxl7.KWHzl()) == null) ? Float.MIN_VALUE : this.isConnected.invoke((T) objKWHzl4).floatValue();
                    do {
                        T next6 = it4.next();
                        oXL oxl8 = (oXL) ((Map.Entry) next6).getValue();
                        float fFloatValue4 = (oxl8 == null || (objKWHzl3 = oxl8.KWHzl()) == null) ? Float.MIN_VALUE : this.isConnected.invoke((T) objKWHzl3).floatValue();
                        if (java.lang.Float.compare(fFloatValue3, fFloatValue4) < 0) {
                            next2 = next6;
                            fFloatValue3 = fFloatValue4;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next2 = null;
            }
            entry = (Map.Entry) next2;
        }
        EZpvd((kotlin.Pair) (entry != null ? C56390yDp.OLrzqt(entry.getKey(), entry.getValue()) : null));
        AEQbTJ((kotlin.Pair) (entry3 != null ? C56390yDp.OLrzqt(entry3.getKey(), entry3.getValue()) : null));
        kotlin.Pair<java.lang.Integer, oXL<T>> pair = this.values;
        java.lang.Float fValueOf3 = (pair == null || (second2 = pair.getSecond()) == null) ? null : java.lang.Float.valueOf(this.isConnected.invoke(second2.KWHzl()).floatValue());
        kotlin.Pair<java.lang.Integer, oXL<T>> pair2 = this.ejfBZ;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            fValueOf = java.lang.Float.valueOf(this.isConnected.invoke(second.KWHzl()).floatValue());
        }
        Objects.toString(fValueOf3);
        Objects.toString(fValueOf);
    }

    public final void KWHzl(int i) {
        this.copydefault.clear();
        this.KWHzl.clear();
        this.AEQbTJ.clear();
        for (C36343oYg c36343oYg : this.AkhnZx) {
            int iCopydefault = c36343oYg.copydefault(java.lang.Integer.valueOf(i));
            oXN oxn = oXN.KWHzl;
            if (iCopydefault == oxn.copydefault()) {
                this.copydefault.add(c36343oYg);
            } else if (iCopydefault == oxn.KWHzl()) {
                this.KWHzl.add(c36343oYg);
            } else if (iCopydefault == oxn.AEQbTJ()) {
                this.AEQbTJ.add(c36343oYg);
            }
        }
    }

    public final oXL<T> copydefault(int i) {
        T next;
        java.util.Iterator<T> it = this.fJNWhG.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iAbs = java.lang.Math.abs(((java.lang.Number) ((Map.Entry) next).getKey()).intValue() - i);
                do {
                    T next2 = it.next();
                    int iAbs2 = java.lang.Math.abs(((java.lang.Number) ((Map.Entry) next2).getKey()).intValue() - i);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (oXL) entry.getValue();
        }
        return null;
    }

    public final void copydefault(@NotNull java.util.List<C36343oYg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AkhnZx = list;
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C36343oYg) it.next()).KWHzl();
        }
        this.AkhnZx.size();
    }

    public final java.util.List<C36343oYg> EZpvd(int i) {
        if (i == -1) {
            return null;
        }
        java.util.List<C36343oYg> list = this.AkhnZx;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            if (((C36343oYg) t).copydefault() == i) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
