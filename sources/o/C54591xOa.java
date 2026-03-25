package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.InstTypeData;
import com.okinc.unify_trade.biz.InstTypeGroup;
import com.okinc.unify_trade.exception.BizSystemException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54591xOa extends xNW {
    public final xBD hDKMBd = new xBD();
    public final C54267xCb AEQbTJ = new C54267xCb();
    public final java.util.ArrayList<InstTypeData> copydefault = new java.util.ArrayList<>();
    public final java.util.ArrayList<ChargeGroupData> AuCTel = new java.util.ArrayList<>();
    public final java.util.ArrayList<FutureGroupInfo> EZpvd = new java.util.ArrayList<>();
    public final java.util.ArrayList<FutureGroupInfo> ejfBZ = new java.util.ArrayList<>();
    public final java.util.ArrayList<FutureGroupInfo> AYXKKw = new java.util.ArrayList<>();
    public java.util.HashMap<java.lang.String, FutureGroupInfo> fJNWhG = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, FutureGroupInfo> KWHzl = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, FutureGroupInfo> AhwBna = new java.util.HashMap<>();
    public java.lang.String OLrzqt = "GLOBAL";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, FutureGroupInfo> AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.xNW
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FutureGroupInfo> AuCTelauCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "InstGroupProvider";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, FutureGroupInfo> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FutureGroupInfo> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChargeGroupData> uzCIH() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, FutureGroupInfo> wlaJM() {
        return this.fJNWhG;
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.List<InstTypeGroup>> xklZsXlph = zsXlph();
        xklZsXlph.AYXKKw();
        xklZsXlph.KWHzl(new Function1() { // from class: o.xNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54591xOa.KWHzl(this.AEQbTJ, xklZsXlph, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklZsXlph, 0L, 1, null);
    }

    public static final Unit KWHzl(C54591xOa c54591xOa, xKL xkl, ResponseData responseData) {
        java.lang.String displayLocalisation;
        InstTypeGroup instTypeGroup;
        InstTypeGroup instTypeGroup2;
        InstTypeGroup instTypeGroup3;
        InstTypeGroup instTypeGroup4;
        Intrinsics.checkNotNullParameter(responseData, "");
        pUU.KWHzl(c54591xOa.fJNWhG(), c54591xOa.EZpvd() + " resp is:" + responseData + "; cost: " + (java.lang.System.currentTimeMillis() - c54591xOa.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                java.util.List list = (java.util.List) responseData.getData();
                c54591xOa.copydefault((list == null || (instTypeGroup4 = (InstTypeGroup) list.get(0)) == null) ? null : instTypeGroup4.getAvailableType());
                java.util.List list2 = (java.util.List) responseData.getData();
                c54591xOa.OLrzqt((list2 == null || (instTypeGroup3 = (InstTypeGroup) list2.get(0)) == null) ? null : instTypeGroup3.getBaseGroup());
                java.util.List list3 = (java.util.List) responseData.getData();
                c54591xOa.EZpvd((list3 == null || (instTypeGroup2 = (InstTypeGroup) list3.get(0)) == null) ? null : instTypeGroup2.getContractGroup());
                java.util.List list4 = (java.util.List) responseData.getData();
                if (list4 == null || (instTypeGroup = (InstTypeGroup) list4.get(0)) == null || (displayLocalisation = instTypeGroup.getDisplayLocalisation()) == null) {
                    displayLocalisation = "GLOBAL";
                }
                c54591xOa.OLrzqt = displayLocalisation;
                xNW.notifyResult$default(c54591xOa, true, null, 2, null);
            }
        } else {
            java.lang.Exception value = xkl.AhwBna().getValue();
            BizSystemException bizSystemException = value instanceof BizSystemException ? (BizSystemException) value : null;
            if (bizSystemException != null) {
                C6777aVl.Companion.EZpvd(bizSystemException);
            }
            c54591xOa.AEQbTJ(c54591xOa.bE_(), c54591xOa.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.ArrayList<FutureGroupData> arrayList) {
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            Intrinsics.copydefault(arrayList);
            for (FutureGroupData futureGroupData : arrayList) {
                if (Intrinsics.EZpvd((java.lang.Object) futureGroupData.getInstType(), (java.lang.Object) "SWAP") && C33129mqd.KWHzl((java.util.Collection) futureGroupData.getList())) {
                    this.ejfBZ.clear();
                    this.ejfBZ.addAll(futureGroupData.getList());
                }
                if (Intrinsics.EZpvd((java.lang.Object) futureGroupData.getInstType(), (java.lang.Object) "FUTURES") && C33129mqd.KWHzl((java.util.Collection) futureGroupData.getList())) {
                    this.EZpvd.clear();
                    this.EZpvd.addAll(futureGroupData.getList());
                }
                if (Intrinsics.EZpvd((java.lang.Object) futureGroupData.getInstType(), (java.lang.Object) "OPTION") && C33129mqd.KWHzl((java.util.Collection) futureGroupData.getList())) {
                    this.AYXKKw.clear();
                    this.AYXKKw.addAll(futureGroupData.getList());
                }
            }
            AubY();
        }
    }

    public final void OLrzqt(java.util.ArrayList<ChargeGroupData> arrayList) {
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            this.AuCTel.clear();
            java.util.ArrayList<ChargeGroupData> arrayList2 = this.AuCTel;
            Intrinsics.copydefault(arrayList);
            arrayList2.addAll(arrayList);
        }
    }

    public final void copydefault(java.util.ArrayList<InstTypeData> arrayList) {
        if (arrayList != null) {
            this.copydefault.clear();
            this.copydefault.addAll(arrayList);
        }
    }

    public final java.util.ArrayList<AbstractC54531xLw> iwGUEr() {
        java.util.ArrayList<AbstractC54531xLw> arrayList = new java.util.ArrayList<>();
        for (InstTypeData instTypeData : this.copydefault) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(instTypeData.getInstType()) : null;
            if (abstractC54531xLwOLrzqt != null) {
                arrayList.add(abstractC54531xLwOLrzqt);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull java.util.List<ChargeGroupData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AuCTel.clear();
        this.AuCTel.addAll(list);
    }

    public final java.util.ArrayList<java.lang.String> getFieldNames() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((InstTypeData) it.next()).getInstType());
        }
        return arrayList;
    }

    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> zLjUOn() {
        return KWHzl(this.AuCTel);
    }

    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> KWHzl(java.util.ArrayList<ChargeGroupData> arrayList) {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map = new java.util.HashMap<>();
        for (ChargeGroupData chargeGroupData : arrayList) {
            map.put(chargeGroupData.getId(), chargeGroupData.getTypes());
        }
        return map;
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.hDKMBd, this.AEQbTJ);
    }

    private final xKL<java.util.List<InstTypeGroup>> zsXlph() {
        return hDKMBd() ? this.AEQbTJ : this.hDKMBd;
    }

    public final void AubY() {
        java.util.Iterator<T> it = this.ejfBZ.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            FutureGroupInfo futureGroupInfo = (FutureGroupInfo) next;
            futureGroupInfo.setSort(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)));
            java.util.HashMap<java.lang.String, FutureGroupInfo> map = this.fJNWhG;
            java.lang.String ccyType = futureGroupInfo.getCcyType();
            if (ccyType != null) {
                str = ccyType;
            }
            map.put(str, futureGroupInfo);
            i2++;
        }
        int i3 = 0;
        for (java.lang.Object obj : this.EZpvd) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            FutureGroupInfo futureGroupInfo2 = (FutureGroupInfo) obj;
            futureGroupInfo2.setSort(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i3)));
            java.util.HashMap<java.lang.String, FutureGroupInfo> map2 = this.KWHzl;
            java.lang.String ccyType2 = futureGroupInfo2.getCcyType();
            if (ccyType2 == null) {
                ccyType2 = "";
            }
            map2.put(ccyType2, futureGroupInfo2);
            i3++;
        }
        for (java.lang.Object obj2 : this.AYXKKw) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            FutureGroupInfo futureGroupInfo3 = (FutureGroupInfo) obj2;
            futureGroupInfo3.setSort(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)));
            java.util.HashMap<java.lang.String, FutureGroupInfo> map3 = this.AhwBna;
            java.lang.String ccyType3 = futureGroupInfo3.getCcyType();
            if (ccyType3 == null) {
                ccyType3 = "";
            }
            map3.put(ccyType3, futureGroupInfo3);
            i++;
        }
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) ((InstTypeData) it.next()).getInstType(), (java.lang.Object) str)) {
                z = true;
            }
        }
        return z;
    }
}
