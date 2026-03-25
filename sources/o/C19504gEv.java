package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10619brq;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19504gEv extends AbstractC33073mpa {
    public boolean EZpvd;
    public long OLrzqt;
    public AbstractC12782ctV fJNWhG;
    public InterfaceC58217yxC fetchVPNInfo;
    public int gEmmrt;
    public Application valueOf;
    public final int AkhnZx = 10;
    public final java.util.List<java.lang.Object> DbNXlk = new java.util.ArrayList();
    public final MutableLiveData<java.util.List<java.lang.Object>> AYXKKw = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> values = new MutableLiveData<>();
    public final MutableLiveData<C10594brR> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AuCTel = new MutableLiveData<>();
    public java.lang.String fIwbmz = "";
    public java.lang.String KWHzl = "";
    public int AhwBna = -1;
    public final MutableLiveData<java.util.List<DeFiApyDataInfoData>> ejfBZ = new MutableLiveData<>();
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.gER
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19504gEv.values();
        }
    });
    public java.lang.String isConnected = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C10594brR> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<java.lang.Object>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<DeFiApyDataInfoData>> valueOf() {
        return this.ejfBZ;
    }

    private final InterfaceC25424iwU fIwbmz() {
        return (InterfaceC25424iwU) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC25424iwU values() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final void copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, boolean z) {
        java.lang.String strAkhnZx;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fIwbmz = str;
        this.OLrzqt = j;
        this.KWHzl = str2;
        this.EZpvd = z;
        C10598brV c10598brV = C10598brV.AEQbTJ;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = c10598brV.OLrzqt(j);
        if (customChainCoinMetaOLrzqt != null && (strAkhnZx = customChainCoinMetaOLrzqt.AkhnZx()) != null) {
            str3 = strAkhnZx;
        }
        this.isConnected = str3;
        this.AhwBna = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AYXKKw() : -1;
        CustomChainCoinMeta customChainCoinMetaOLrzqt2 = c10598brV.OLrzqt(j);
        this.valueOf = new Application(this, str, customChainCoinMetaOLrzqt2 != null ? customChainCoinMetaOLrzqt2.copydefault() : 0L, j, str2, null, 16, null);
    }

    private final AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> fARcdN() {
        InterfaceC25424iwU interfaceC25424iwUFIwbmz;
        C10594brR value = this.copydefault.getValue();
        if (!this.EZpvd || (interfaceC25424iwUFIwbmz = fIwbmz()) == null || !interfaceC25424iwUFIwbmz.EZpvd(this.fIwbmz) || value == null) {
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        boolean zAEQbTJ = C33129mqd.AEQbTJ(value.values(), 0);
        InterfaceC25424iwU interfaceC25424iwUFIwbmz2 = fIwbmz();
        if (interfaceC25424iwUFIwbmz2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (zAEQbTJ) {
                arrayList.add(java.lang.Long.valueOf(value.KWHzl().AhwBna()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (!zAEQbTJ) {
                arrayList2.add(java.lang.Long.valueOf(value.KWHzl().AhwBna()));
            }
            Unit unit = Unit.INSTANCE;
            AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXOLrzqt = interfaceC25424iwUFIwbmz2.OLrzqt(arrayList, arrayList2);
            if (abstractC58185ywXOLrzqt != null) {
                return abstractC58185ywXOLrzqt;
            }
        }
        AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public final void fetchVPNInfo() {
        AEQbTJ(false, new Function1() { // from class: o.gEw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.EZpvd(this.EZpvd, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit EZpvd(final C19504gEv c19504gEv, final AbstractC12782ctV abstractC12782ctV) {
        AbstractC58260yxt<kotlin.Pair<C10594brR, java.lang.String>> abstractC58260yxtOLrzqt = C10619brq.TaskDescription.getInstance$default(C10619brq.Companion, null, 1, null).OLrzqt(c19504gEv.fIwbmz, c19504gEv.OLrzqt);
        final Function1 function1 = new Function1() { // from class: o.gEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.KWHzl(this.AEQbTJ, abstractC12782ctV, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<C10594brR, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.copydefault((java.lang.Throwable) obj);
            }
        };
        c19504gEv.call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.ejfBZ(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final C19504gEv c19504gEv, AbstractC12782ctV abstractC12782ctV, kotlin.Pair pair) {
        java.lang.String address;
        ChainAddress chainAddressCopydefault;
        if (((java.lang.CharSequence) pair.getSecond()).length() > 0) {
            pUU.copydefault("CustomCoinViewModel", "error message :" + pair.getSecond() + " coinId = " + c19504gEv.OLrzqt);
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.StyleableRes), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C10594brR c10594brR = (C10594brR) pair.getFirst();
        if (c10594brR != null) {
            c19504gEv.copydefault.setValue(c10594brR);
            MutableLiveData<java.lang.String> mutableLiveData = c19504gEv.AEQbTJ;
            if (abstractC12782ctV == null || (chainAddressCopydefault = abstractC12782ctV.copydefault(java.lang.Long.valueOf(c10594brR.AEQbTJ()))) == null || (address = chainAddressCopydefault.getAddress()) == null) {
                address = "";
            }
            mutableLiveData.setValue(address);
            java.lang.String str = c19504gEv.KWHzl;
            if (str == null || str.length() == 0) {
                java.lang.String value = c19504gEv.AEQbTJ.getValue();
                c19504gEv.KWHzl = value != null ? value : "";
            }
        }
        AbstractC58185ywX<java.util.List<DeFiApyDataInfoData>> abstractC58185ywXFARcdN = c19504gEv.fARcdN();
        final Function1 function1 = new Function1() { // from class: o.gEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<DeFiApyDataInfoData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.valueOf((java.lang.Throwable) obj);
            }
        };
        c19504gEv.call().AEQbTJ(abstractC58185ywXFARcdN.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.fJNWhG(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C19504gEv c19504gEv, java.util.List list) {
        c19504gEv.ejfBZ.setValue(list);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        C55326xho.toast$default(th.toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.gEmmrt = 0;
        this.values.setValue(java.lang.Boolean.FALSE);
        AbstractC58260yxt<java.util.List<C10746buK>> abstractC58260yxtCopydefault = copydefault(this.fIwbmz, this.OLrzqt, this.gEmmrt);
        final Function1 function1 = new Function1() { // from class: o.gED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.AYXKKw(this.copydefault, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<C10746buK>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.fARcdN(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.fetchVPNInfo = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.AuCTel(function12, obj);
            }
        });
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C19504gEv c19504gEv, java.util.List list) {
        if (list.isEmpty() && (c19504gEv.DbNXlk.isEmpty() || (c19504gEv.DbNXlk.size() == 1 && (CollectionsKt___CollectionsKt.AuCTelauCTel(c19504gEv.DbNXlk) instanceof C14316djE)))) {
            if (c19504gEv.DbNXlk.isEmpty()) {
                c19504gEv.DbNXlk.add(new C14316djE(null, 0, 2, null));
            }
            c19504gEv.AYXKKw.setValue(c19504gEv.DbNXlk);
        } else {
            Application application = c19504gEv.valueOf;
            if (application != null) {
                C10762bua.AEQbTJ.KWHzl().KWHzl(application);
            }
            c19504gEv.DbNXlk.clear();
            java.util.List<java.lang.Object> list2 = c19504gEv.DbNXlk;
            Intrinsics.copydefault(list);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10746buK) it.next()).KWHzl());
            }
            list2.addAll(arrayList);
            c19504gEv.AYXKKw.setValue(c19504gEv.DbNXlk);
            c19504gEv.gEmmrt += c19504gEv.DbNXlk.size();
            if (list.size() < c19504gEv.AkhnZx) {
                c19504gEv.values.setValue(java.lang.Boolean.TRUE);
            }
        }
        c19504gEv.fetchVPNInfo = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C19504gEv c19504gEv, java.lang.Throwable th) {
        pUU.AEQbTJ("refreshData error " + th);
        if (c19504gEv.DbNXlk.isEmpty()) {
            c19504gEv.DbNXlk.add(new C14317djF(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk), 0, null, 24, null));
            c19504gEv.AYXKKw.setValue(c19504gEv.DbNXlk);
        }
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58260yxt<java.util.List<C10746buK>> abstractC58260yxtCopydefault = copydefault(this.fIwbmz, this.OLrzqt, this.gEmmrt);
        final Function1 function1 = new Function1() { // from class: o.gEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.copydefault(this.KWHzl, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<C10746buK>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19504gEv.KWHzl((java.lang.Throwable) obj);
            }
        };
        this.fetchVPNInfo = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19504gEv.fetchVPNInfo(function12, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C19504gEv c19504gEv, java.util.List list) {
        java.util.List<java.lang.Object> list2 = c19504gEv.DbNXlk;
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10746buK) it.next()).KWHzl());
        }
        list2.addAll(arrayList);
        c19504gEv.AYXKKw.setValue(c19504gEv.DbNXlk);
        c19504gEv.gEmmrt += list.size();
        if (list.size() < c19504gEv.AkhnZx) {
            c19504gEv.values.setValue(java.lang.Boolean.TRUE);
        }
        c19504gEv.fetchVPNInfo = null;
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<C10746buK>> copydefault(@NotNull java.lang.String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C10747buL.AEQbTJ.KWHzl(str, j, this.AkhnZx, i);
    }

    public final int copydefault(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        if (coinAndAddressHistoryDetail == null) {
            return 5;
        }
        int txStatus = coinAndAddressHistoryDetail.getTxStatus();
        if (txStatus == 1) {
            if (coinAndAddressHistoryDetail.getRepeatTxType() == 1) {
                return 2;
            }
            return (coinAndAddressHistoryDetail.getRepeatTxType() == 2 || coinAndAddressHistoryDetail.getRepeatTxType() == 3) ? 3 : 1;
        }
        if (txStatus == 2) {
            return 5;
        }
        if (txStatus == 3) {
            return 4;
        }
        if (txStatus != 5) {
            return txStatus != 6 ? 5 : 7;
        }
        return 6;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C19504gEv c19504gEv, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        c19504gEv.fJNWhG = abstractC12782ctV;
        c19504gEv.copydefault.setValue(abstractC12782ctV.ejfBZ(c19504gEv.OLrzqt));
        MutableLiveData<java.lang.String> mutableLiveData = c19504gEv.AEQbTJ;
        ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(java.lang.Long.valueOf(c19504gEv.OLrzqt));
        if (chainAddressOLrzqt == null || (address = chainAddressOLrzqt.getAddress()) == null) {
            address = "";
        }
        mutableLiveData.setValue(address);
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC12782ctV abstractC12782ctV = this.fJNWhG;
        if (abstractC12782ctV == null || z) {
            C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
            java.lang.String str = this.fIwbmz;
            if (str == null) {
                return;
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = instance$default.OLrzqt(str, true);
            final Function1 function12 = new Function1() { // from class: o.gEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19504gEv.KWHzl(this.copydefault, function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gEA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C19504gEv.AkhnZx(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gEE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19504gEv.KWHzl(function1, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gEB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C19504gEv.values(function13, obj);
                }
            });
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            return;
        }
        function1.invoke(abstractC12782ctV);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Application application = this.valueOf;
        if (application != null) {
            C10762bua.AEQbTJ.KWHzl().OLrzqt(application);
        }
    }

    /* JADX INFO: renamed from: o.gEv$Application */
    public final class Application extends AbstractC10767buf {
        public final /* synthetic */ C19504gEv copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r11v0 o.gEv)
  (r12v0 java.lang.String)
  (r13v0 long)
  (r15v0 long)
  (r17v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:274)) : (r18v0 java.util.List))
 A[MD:(o.gEv, java.lang.String, long, long, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:269) call: o.gEv.Application.<init>(o.gEv, java.lang.String, long, long, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ Application(C19504gEv c19504gEv, java.lang.String str, long j, long j2, java.lang.String str2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c19504gEv, str, j, j2, str2, (i & 16) != 0 ? yDY.AhwBna() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C19504gEv c19504gEv, java.lang.String str, long j, @NotNull long j2, @NotNull java.lang.String str2, java.util.List<java.lang.String> list) {
            super("CustomNetworkChainTxObserver", str, j, j2, str2, list);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = c19504gEv;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
        @Override // o.AbstractC10707btY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(@NotNull C10746buK c10746buK) {
            Intrinsics.checkNotNullParameter(c10746buK, "");
            pUU.copydefault("CustomNetworkChainTxObserver changed " + c10746buK);
            java.util.Iterator it = this.copydefault.DbNXlk.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                java.lang.Object next = it.next();
                if ((next instanceof CoinAndAddressHistoryDetail) && Intrinsics.EZpvd((java.lang.Object) ((CoinAndAddressHistoryDetail) next).getTxId(), (java.lang.Object) c10746buK.gEmmrt())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 && i < this.copydefault.DbNXlk.size()) {
                this.copydefault.DbNXlk.set(i, c10746buK.KWHzl());
                this.copydefault.AYXKKw().setValue(this.copydefault.DbNXlk);
            }
            this.copydefault.djBIcL().setValue(java.lang.Boolean.TRUE);
        }
    }
}
