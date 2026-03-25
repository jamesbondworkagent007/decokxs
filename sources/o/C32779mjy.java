package o;

import androidx.compose.material3.TooltipKt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.components.security.scanner.DeviceScanner;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.components.security.scanner.ui.DeviceScanViewModelWithLifecycle$checkAndDestroyIfNeeded$1;
import com.okinc.components.security.scanner.ui.DeviceScanViewModelWithLifecycle$initializeState$1;
import com.okinc.components.security.scanner.ui.DeviceScanViewModelWithLifecycle$startScan$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32788mkG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32779mjy extends AndroidViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<java.lang.Integer> AEQbTJ;
    public final MutableLiveData<C32762mjh> AYXKKw;
    public final MutableLiveData<C32765mjk> AhwBna;
    public final android.content.Context AkhnZx;
    public final AtomicBoolean AuCTel;
    public final LiveData<C32762mjh> AuCTelauCTel;
    public java.lang.String AubY;
    public boolean DbNXlk;
    public final MutableLiveData<C32768mjn> EZpvd;
    public final MutableLiveData<java.lang.Integer> OLrzqt;
    public final MutableLiveData<java.util.Map<java.lang.Integer, C32809mkb>> copydefault;
    public final MutableLiveData<java.util.List<EnsecureAppInfo>> djBIcL;
    public java.util.Map<java.lang.Integer, Function0<Unit>> ejfBZ;
    public final AtomicBoolean fARcdN;
    public java.util.Map<java.lang.Integer, kotlin.Pair<java.lang.Boolean, Function0<Unit>>> fIwbmz;
    public boolean fJNWhG;
    public final android.os.Handler fetchVPNInfo;
    public final MutableLiveData<java.lang.Integer> gEmmrt;
    public long getFieldNames;
    public final LiveData<java.lang.Integer> getNewProxyInstance;
    public final LiveData<C32768mjn> hDKMBd;
    public java.lang.Integer isConnected;
    public final LiveData<java.util.Map<java.lang.Integer, C32809mkb>> iwGUEr;
    public final java.util.List<java.lang.Integer> uzCIH;
    public final C58216yxB valueOf;
    public final LiveData<java.lang.Integer> values;
    public final AtomicBoolean wlaJM;
    public final LiveData<java.lang.Integer> zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32768mjn> AYXKKw() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32762mjh> djBIcL() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.Map<java.lang.Integer, C32809mkb>> gEmmrt() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32779mjy(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.AkhnZx = application.getApplicationContext();
        this.valueOf = new C58216yxB();
        this.fARcdN = new AtomicBoolean(false);
        this.AuCTel = new AtomicBoolean(false);
        this.wlaJM = new AtomicBoolean(false);
        MutableLiveData<C32762mjh> mutableLiveData = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData;
        this.AuCTelauCTel = mutableLiveData;
        MutableLiveData<C32768mjn> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.hDKMBd = mutableLiveData2;
        MutableLiveData<java.lang.Integer> mutableLiveData3 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData3;
        this.values = mutableLiveData3;
        MutableLiveData<java.lang.Integer> mutableLiveData4 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData4;
        this.getNewProxyInstance = mutableLiveData4;
        MutableLiveData<java.lang.Integer> mutableLiveData5 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData5;
        this.zLjUOn = mutableLiveData5;
        MutableLiveData<java.util.Map<java.lang.Integer, C32809mkb>> mutableLiveData6 = new MutableLiveData<>();
        this.copydefault = mutableLiveData6;
        this.iwGUEr = mutableLiveData6;
        this.djBIcL = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.fetchVPNInfo = new android.os.Handler(android.os.Looper.getMainLooper());
        this.uzCIH = new java.util.ArrayList();
        this.ejfBZ = new LinkedHashMap();
        this.fIwbmz = new LinkedHashMap();
        AhwBna();
        ejfBZ();
    }

    /* JADX INFO: renamed from: o.mjy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void DbNXlk() {
        this.fARcdN.set(true);
        this.wlaJM.set(false);
        if (!this.fJNWhG) {
            ejfBZ();
        }
        fIwbmz();
    }

    public final void AkhnZx() {
        this.fARcdN.set(false);
        KWHzl();
    }

    public final void values() {
        this.AuCTel.set(true);
        this.wlaJM.set(false);
        KWHzl(true);
    }

    public final void isConnected() {
        this.AuCTel.set(false);
        KWHzl(false);
        KWHzl();
    }

    public final void KWHzl() {
        if (this.wlaJM.get()) {
            return;
        }
        int scanstatus$default = C32788mkG.StateListAnimator.readScanstatus$default(C32788mkG.Companion, null, 1, null);
        boolean z = scanstatus$default == DeviceScanner.ScannerStatus.RUNNING.getValue() || scanstatus$default == DeviceScanner.ScannerStatus.PENDING.getValue();
        boolean zFetchVPNInfo = fetchVPNInfo();
        if (z || this.fARcdN.get() || zFetchVPNInfo) {
            return;
        }
        this.wlaJM.set(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceScanViewModelWithLifecycle$checkAndDestroyIfNeeded$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        C32730mjB.AEQbTJ.copydefault();
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceScanViewModelWithLifecycle$initializeState$1(this, null), 3, null);
    }

    public final void ejfBZ() {
        if (this.fJNWhG) {
            return;
        }
        this.fJNWhG = true;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C32764mjj.class, new java.lang.String[0]).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.mjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.EZpvd(this.EZpvd, (C32764mjj) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32779mjy.KWHzl(function1, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C32768mjn.class, new java.lang.String[0]).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.mjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.EZpvd(this.copydefault, (C32768mjn) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32779mjy.EZpvd(function12, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(C32765mjk.class, new java.lang.String[0]).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.mjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.OLrzqt(this.copydefault, (C32765mjk) obj);
            }
        };
        this.valueOf.OLrzqt(interfaceC58217yxCAEQbTJ, interfaceC58217yxCAEQbTJ2, abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32779mjy.AhwBna(function13, obj);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C32779mjy c32779mjy, C32764mjj c32764mjj) {
        Intrinsics.copydefault(c32764mjj);
        c32779mjy.copydefault(c32764mjj);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C32779mjy c32779mjy, C32768mjn c32768mjn) {
        c32779mjy.EZpvd.postValue(c32768mjn);
        c32779mjy.gEmmrt.postValue(java.lang.Integer.valueOf(c32768mjn.AEQbTJ()));
        c32779mjy.OLrzqt.postValue(java.lang.Integer.valueOf(c32768mjn.copydefault()));
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C32779mjy c32779mjy, C32765mjk c32765mjk) {
        if (c32765mjk.copydefault()) {
            c32779mjy.values();
        } else {
            c32779mjy.isConnected();
        }
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        if (this.fJNWhG) {
            this.fJNWhG = false;
            this.valueOf.OLrzqt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startScanItem$default(C32779mjy c32779mjy, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        c32779mjy.KWHzl(i, (Function0<Unit>) function0);
    }

    public final void KWHzl(int i, Function0<Unit> function0) {
        if (this.uzCIH.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        this.uzCIH.add(java.lang.Integer.valueOf(i));
        this.ejfBZ.put(java.lang.Integer.valueOf(i), function0);
        if (this.isConnected == null) {
            fARcdN();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void completeScanItem$default(C32779mjy c32779mjy, int i, boolean z, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        c32779mjy.OLrzqt(i, z, (Function0<Unit>) function0);
    }

    public final void OLrzqt(int i, boolean z, Function0<Unit> function0) {
        java.lang.Integer num = this.isConnected;
        if (num != null && num.intValue() == i) {
            copydefault(i, z, function0);
        } else {
            this.fIwbmz.put(java.lang.Integer.valueOf(i), new kotlin.Pair<>(java.lang.Boolean.valueOf(z), function0));
        }
    }

    public final void copydefault(final int i, final boolean z, Function0<Unit> function0) {
        if (function0 != null) {
            this.ejfBZ.put(java.lang.Integer.valueOf(i), function0);
        }
        long jCurrentTimeMillis = TooltipKt.TooltipDuration - (java.lang.System.currentTimeMillis() - this.getFieldNames);
        if (jCurrentTimeMillis > 0) {
            this.fetchVPNInfo.postDelayed(new java.lang.Runnable() { // from class: o.mjK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32779mjy.copydefault(this.copydefault, i, z);
                }
            }, jCurrentTimeMillis);
        } else {
            KWHzl(i, z);
        }
    }

    public static final void copydefault(C32779mjy c32779mjy, int i, boolean z) {
        c32779mjy.KWHzl(i, z);
    }

    public final void fARcdN() {
        if (this.uzCIH.isEmpty()) {
            return;
        }
        final int iIntValue = this.uzCIH.remove(0).intValue();
        this.isConnected = java.lang.Integer.valueOf(iIntValue);
        this.getFieldNames = java.lang.System.currentTimeMillis();
        AEQbTJ(iIntValue, false, false, true);
        final kotlin.Pair<java.lang.Boolean, Function0<Unit>> pair = this.fIwbmz.get(java.lang.Integer.valueOf(iIntValue));
        if (pair != null) {
            this.fIwbmz.remove(java.lang.Integer.valueOf(iIntValue));
            this.fetchVPNInfo.postDelayed(new java.lang.Runnable() { // from class: o.mjL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32779mjy.OLrzqt(this.AEQbTJ, iIntValue, pair);
                }
            }, TooltipKt.TooltipDuration);
        }
    }

    public static final void OLrzqt(C32779mjy c32779mjy, int i, kotlin.Pair pair) {
        c32779mjy.copydefault(i, ((java.lang.Boolean) pair.getFirst()).booleanValue(), (Function0<Unit>) pair.getSecond());
    }

    public final void KWHzl(int i, boolean z) {
        AEQbTJ(i, true, z, true);
        this.isConnected = null;
        this.getFieldNames = 0L;
        Function0<Unit> function0 = this.ejfBZ.get(java.lang.Integer.valueOf(i));
        if (function0 != null) {
            function0.invoke();
        }
        this.ejfBZ.remove(java.lang.Integer.valueOf(i));
        fARcdN();
    }

    public final void AuCTel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceScanViewModelWithLifecycle$startScan$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull C32764mjj c32764mjj) {
        Intrinsics.checkNotNullParameter(c32764mjj, "");
        int iEZpvd = c32764mjj.EZpvd();
        if (iEZpvd == 0) {
            KWHzl(c32764mjj.OLrzqt());
        } else {
            if (iEZpvd != 1) {
                return;
            }
            EZpvd(c32764mjj.OLrzqt());
        }
    }

    public final void EZpvd(java.util.List<EnsecureAppInfo> list) {
        java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> mapCopydefault = copydefault(list);
        java.util.List<EnsecureAppInfo> listAhwBna = mapCopydefault.get(1);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List<EnsecureAppInfo> listAhwBna2 = mapCopydefault.get(2);
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        AEQbTJ(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            if (!((EnsecureAppInfo) obj).isIgnored()) {
                arrayList.add(obj);
            }
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listAhwBna2) {
            if (!((EnsecureAppInfo) obj2).isIgnored()) {
                arrayList2.add(obj2);
            }
        }
        OLrzqt(1, !arrayList.isEmpty(), new Function0() { // from class: o.mjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32779mjy.copydefault(this.EZpvd, arrayList2);
            }
        });
    }

    public static final Unit copydefault(final C32779mjy c32779mjy, java.util.List list) {
        c32779mjy.KWHzl(2, new Function0() { // from class: o.mjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32779mjy.AYXKKw(this.KWHzl);
            }
        });
        completeScanItem$default(c32779mjy, 2, !list.isEmpty(), null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C32779mjy c32779mjy) {
        startScanItem$default(c32779mjy, 3, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C32779mjy c32779mjy, java.util.List list, final java.util.List list2) {
        c32779mjy.EZpvd.postValue(new C32768mjn(90, 0, 90));
        c32779mjy.KWHzl(4, new Function0() { // from class: o.mjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32779mjy.EZpvd(this.copydefault, list2);
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((EnsecureAppInfo) obj).isIgnored()) {
                arrayList.add(obj);
            }
        }
        completeScanItem$default(c32779mjy, 4, !arrayList.isEmpty(), null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C32779mjy c32779mjy, final java.util.List list) {
        c32779mjy.EZpvd.postValue(new C32768mjn(100, 0, 100));
        c32779mjy.fetchVPNInfo.postDelayed(new java.lang.Runnable() { // from class: o.mjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32779mjy.gEmmrt(this.AEQbTJ, list);
            }
        }, 500L);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C32779mjy c32779mjy, final java.util.List list) {
        c32779mjy.OLrzqt(new Function1() { // from class: o.mjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.EZpvd(list, (C32762mjh) obj);
            }
        });
    }

    public static final C32762mjh EZpvd(java.util.List list, C32762mjh c32762mjh) {
        Intrinsics.checkNotNullParameter(c32762mjh, "");
        DeviceScanner.ScannerStatus scannerStatus = DeviceScanner.ScannerStatus.COMPLETED;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
            ensecureAppInfo.setIgnored(C32788mkG.Companion.copydefault(ensecureAppInfo.getPackageName()));
        }
        return C32762mjh.copy$default(c32762mjh, scannerStatus, list, false, jCurrentTimeMillis, null, 20, null);
    }

    public final java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> copydefault(java.util.List<EnsecureAppInfo> list) {
        java.util.List<EnsecureAppInfo> value = this.djBIcL.getValue();
        java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> mapOLrzqt = C32788mkG.Companion.OLrzqt(list, value != null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) value) : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapOLrzqt.size()));
        java.util.Iterator<T> it = mapOLrzqt.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.List<EnsecureAppInfo> list2 = (java.util.List) entry.getValue();
            if (list2 != null) {
                for (EnsecureAppInfo ensecureAppInfo : list2) {
                    ensecureAppInfo.setIgnored(C32788mkG.Companion.copydefault(ensecureAppInfo.getPackageName()));
                }
            } else {
                list2 = null;
            }
            linkedHashMap.put(key, list2);
        }
        return linkedHashMap;
    }

    public final void OLrzqt(Function1<? super C32762mjh, C32762mjh> function1) {
        C32762mjh value = this.AYXKKw.getValue();
        if (value != null) {
            this.AYXKKw.postValue(function1.invoke(value));
        }
    }

    public final void KWHzl(boolean z) {
        this.AhwBna.postValue(new C32765mjk(z, 0L, 2, null));
    }

    public final boolean fetchVPNInfo() {
        return C32786mkE.KWHzl.OLrzqt(this.AkhnZx);
    }

    public final void fIwbmz() {
        AhwBna();
    }

    public final void KWHzl(int i, int i2, int i3) {
        this.AEQbTJ.postValue(java.lang.Integer.valueOf(i));
        this.gEmmrt.postValue(java.lang.Integer.valueOf(i2));
    }

    public final Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> EZpvd() {
        java.lang.Integer value = this.AEQbTJ.getValue();
        int iIntValue = value != null ? value.intValue() : 0;
        java.lang.Integer value2 = this.gEmmrt.getValue();
        int iIntValue2 = value2 != null ? value2.intValue() : 0;
        java.lang.Integer value3 = this.OLrzqt.getValue();
        int iIntValue3 = value3 != null ? value3.intValue() : 0;
        if (iIntValue > 0) {
            return new Triple<>(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(iIntValue2), java.lang.Integer.valueOf(iIntValue3));
        }
        return null;
    }

    public final java.util.Map<java.lang.Integer, C32809mkb> AEQbTJ() {
        return this.copydefault.getValue();
    }

    public final void copydefault() {
        this.AEQbTJ.postValue(0);
        this.gEmmrt.postValue(0);
        this.OLrzqt.postValue(0);
        this.copydefault.postValue(C56424yEw.KWHzl());
        this.AYXKKw.postValue(new C32762mjh(null, null, false, 0L, null, 31, null));
        this.djBIcL.postValue(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) yDY.AhwBna()));
    }

    public final void AEQbTJ(final int i, boolean z, boolean z2, boolean z3) {
        final C32809mkb c32809mkb = new C32809mkb(i, z, z2, z3);
        this.fetchVPNInfo.post(new java.lang.Runnable() { // from class: o.mjH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C32779mjy.AEQbTJ(this.EZpvd, i, c32809mkb);
            }
        });
    }

    public static final void AEQbTJ(C32779mjy c32779mjy, int i, C32809mkb c32809mkb) {
        java.util.Map<java.lang.Integer, C32809mkb> linkedHashMap;
        java.util.Map<java.lang.Integer, C32809mkb> value = c32779mjy.copydefault.getValue();
        if (value == null || (linkedHashMap = C56424yEw.isConnected(value)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (Intrinsics.EZpvd(linkedHashMap.get(java.lang.Integer.valueOf(i)), c32809mkb)) {
            return;
        }
        linkedHashMap.put(java.lang.Integer.valueOf(i), c32809mkb);
        c32779mjy.copydefault.setValue(linkedHashMap);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        fJNWhG();
    }

    public final void OLrzqt(@NotNull final java.util.List<EnsecureAppInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default("DeviceScanning_BlackApp_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.EZpvd(list, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.util.List list, C32779mjy c32779mjy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("scanned", java.lang.String.valueOf(list.size()), false);
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
                arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
            }
            EventParamsList.put$default(eventParamsList, "name", C33129mqd.gEmmrt(arrayList), false, 4, null);
        }
        java.lang.String str = c32779mjy.AubY;
        if (str != null) {
            eventParamsList.put("scene", C32677miB.OLrzqt.KWHzl(str), false);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.util.List<EnsecureAppInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C32866mlf.onEvent$default("DeviceScanning_OverRight_Button_View", (TrackChannel[]) null, new Function1() { // from class: o.mjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32779mjy.AEQbTJ(list, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.util.List list, C32779mjy c32779mjy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("scanned", java.lang.String.valueOf(list.size()), false);
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                EnsecureAppInfo ensecureAppInfo = (EnsecureAppInfo) it.next();
                arrayList.add(C56390yDp.OLrzqt(ensecureAppInfo.getAppName(), ensecureAppInfo.getPackageName()));
            }
            EventParamsList.put$default(eventParamsList, "name", C33129mqd.gEmmrt(arrayList), false, 4, null);
        }
        java.lang.String str = c32779mjy.AubY;
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "scene", C32677miB.OLrzqt.KWHzl(str), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.util.List<EnsecureAppInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ C32788mkG.Companion.copydefault(((EnsecureAppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> mapCopydefault = copydefault(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        java.util.List<EnsecureAppInfo> listAhwBna = mapCopydefault.get(3);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        final java.util.List<EnsecureAppInfo> listAhwBna2 = mapCopydefault.get(4);
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        OLrzqt(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2));
        if (this.DbNXlk) {
            if (mapCopydefault.get(1) != null) {
                AEQbTJ(1, true, !r5.isEmpty(), true);
            }
            if (mapCopydefault.get(2) != null) {
                AEQbTJ(2, true, !r0.isEmpty(), true);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listAhwBna) {
            if (!((EnsecureAppInfo) obj2).isIgnored()) {
                arrayList2.add(obj2);
            }
        }
        OLrzqt(3, !arrayList2.isEmpty(), new Function0() { // from class: o.mjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32779mjy.OLrzqt(this.EZpvd, listAhwBna2, list);
            }
        });
    }
}
