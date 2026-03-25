package o;

import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.trade.source.ICommonDataSourceImpl$loadWatchList$1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xPU implements InterfaceC54647xQc {
    public Function0<Unit> copydefault;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xPS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xPU.AEQbTJ();
        }
    });
    public final ConcurrentHashMap<java.lang.String, WatchListData> AEQbTJ = new ConcurrentHashMap<>();
    public final C58216yxB KWHzl = new C58216yxB();
    public boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54647xQc
    public void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    public final C56131xwy KWHzl() {
        return (C56131xwy) this.EZpvd.getValue();
    }

    public static final C56131xwy AEQbTJ() {
        return new C56131xwy();
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        pUU.KWHzl("MarketWatchHelper", "addWatchList()  BizInstrument called with: info = " + bizInstrument.getInstId());
        if (OLrzqt(bizInstrument)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        if (C55608xnE.isLogin$default(null, 1, null)) {
            copydefault("0", bizInstrument, mutableLiveData);
        } else {
            copydefault(bizInstrument, "0", mutableLiveData);
        }
    }

    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        pUU.KWHzl("MarketWatchHelper", "addWatchList() WatchListData called with: info = " + watchListData.getInstId());
        if (EZpvd(watchListData)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        if (C55608xnE.isLogin$default(null, 1, null)) {
            KWHzl("0", watchListData, mutableLiveData);
        } else {
            KWHzl(watchListData, "0", mutableLiveData);
        }
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        pUU.KWHzl("MarketWatchHelper", "removeWatchList() called with: info = " + bizInstrument.getInstId());
        if (z && !OLrzqt(bizInstrument)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        if (C55608xnE.isLogin$default(null, 1, null)) {
            copydefault("1", bizInstrument, mutableLiveData);
        } else {
            copydefault(bizInstrument, "1", mutableLiveData);
        }
    }

    @Override // o.InterfaceC54647xQc
    public void OLrzqt(@NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        pUU.KWHzl("MarketWatchHelper", "removeWatchList() called with: info = " + watchListData.getInstId());
        if (z && !EZpvd(watchListData)) {
            pUU.KWHzl("MarketWatchHelper", "check fail");
            if (mutableLiveData != null) {
                mutableLiveData.postValue(new BizResp(false, ""));
                return;
            }
            return;
        }
        if (C55608xnE.isLogin$default(null, 1, null)) {
            KWHzl("1", watchListData, mutableLiveData);
        } else {
            KWHzl(watchListData, "1", mutableLiveData);
        }
    }

    @Override // o.InterfaceC54647xQc
    public void copydefault(@NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (C55608xnE.isLogin$default(null, 1, null)) {
            copydefault("2", bizInstrument, mutableLiveData);
        } else {
            copydefault(bizInstrument, "2", mutableLiveData);
        }
    }

    public void copydefault(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        C56131xwy c56131xwyKWHzl = KWHzl();
        xUV xuv = xUV.EZpvd;
        this.KWHzl.AEQbTJ(c56131xwyKWHzl.KWHzl(str, xuv.KWHzl(bizInstrument), xuv.OLrzqt(bizInstrument), xuv.copydefault(bizInstrument), xuv.AEQbTJ(bizInstrument), new TaskDescription(str, bizInstrument, mutableLiveData)));
    }

    public static final class TaskDescription implements InterfaceC55701xos<Unit> {
        public final /* synthetic */ MutableLiveData<BizResp> EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ BizInstrument OLrzqt;

        public TaskDescription(java.lang.String str, BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
            this.KWHzl = str;
            this.OLrzqt = bizInstrument;
            this.EZpvd = mutableLiveData;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            java.lang.String msg;
            if (z) {
                Function0 function0 = xPU.this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
                if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "1")) {
                    xPU.this.OLrzqt(qWJ.OLrzqt(this.OLrzqt));
                } else if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "0")) {
                    xPU.this.AEQbTJ(qWJ.OLrzqt(this.OLrzqt));
                }
            }
            if (exc != null) {
                msg = exc instanceof BizApiException ? ((BizApiException) exc).getMsg() : exc instanceof BizSystemException ? ((BizSystemException) exc).getMessage() : null;
            }
            MutableLiveData<BizResp> mutableLiveData = this.EZpvd;
            if (mutableLiveData != null) {
                if (msg == null) {
                    msg = "";
                }
                mutableLiveData.postValue(new BizResp(z, msg));
            }
            java.lang.String str = this.KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                return;
            }
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (java.lang.Object) null);
        }
    }

    public static final class StateListAnimator implements InterfaceC55701xos<Unit> {
        public final /* synthetic */ WatchListData EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ MutableLiveData<BizResp> copydefault;

        public StateListAnimator(java.lang.String str, WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
            this.OLrzqt = str;
            this.EZpvd = watchListData;
            this.copydefault = mutableLiveData;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
        @Override // o.InterfaceC55701xos
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void EZpvd(boolean z, Unit unit, java.lang.Exception exc) {
            java.lang.String message;
            if (z) {
                Function0 function0 = xPU.this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
                if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "1")) {
                    xPU.this.OLrzqt(this.EZpvd);
                } else if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "0")) {
                    xPU.this.AEQbTJ(this.EZpvd);
                }
            }
            if (exc != null) {
                if (exc instanceof BizApiException) {
                    message = ((BizApiException) exc).getMsg();
                } else {
                    message = exc instanceof BizSystemException ? ((BizSystemException) exc).getMessage() : null;
                }
            }
            MutableLiveData<BizResp> mutableLiveData = this.copydefault;
            if (mutableLiveData != null) {
                if (message == null) {
                    message = "";
                }
                mutableLiveData.postValue(new BizResp(z, message));
            }
            java.lang.String str = this.OLrzqt;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDGTeJD), 0, 1, (java.lang.Object) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (java.lang.Object) null);
            }
        }
    }

    public void KWHzl(@NotNull java.lang.String str, @NotNull WatchListData watchListData, MutableLiveData<BizResp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        StateListAnimator stateListAnimator = new StateListAnimator(str, watchListData, mutableLiveData);
        this.KWHzl.AEQbTJ(KWHzl().KWHzl(str, watchListData.getInstId(), watchListData.getInstType(), watchListData.getAlias(), watchListData.getExpTime(), stateListAnimator));
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        pVZ.safeLaunch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null))), null, null, new ICommonDataSourceImpl$loadWatchList$1(null), 3, null);
        if (!C55608xnE.isLogin$default(null, 1, null)) {
            djBIcL();
            function1.invoke(java.lang.Boolean.TRUE);
        } else {
            this.KWHzl.AEQbTJ(KWHzl().OLrzqt(new Application(function1)));
            new C54452xIy().OLrzqt(new Activity());
        }
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Boolean, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            if (z && list != null) {
                pUU.KWHzl("getWatchList", "getWatchList sucess");
                xPU.this.AEQbTJ.clear();
                xPU xpu = xPU.this;
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    xpu.AEQbTJ((WatchListData) it.next());
                }
            }
            this.KWHzl.invoke(java.lang.Boolean.TRUE);
        }
    }

    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends ChargeGroupData>> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<ChargeGroupData> list, java.lang.Exception exc) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            if (!z || list == null || (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null) {
                return;
            }
            interfaceC54581xNrOLrzqt.KWHzl(list);
        }
    }

    public final void djBIcL() {
        for (WatchListBean watchListBean : qVA.EZpvd()) {
            AEQbTJ(new WatchListData(watchListBean.getAlias(), watchListBean.getExpTime(), watchListBean.getInstId(), watchListBean.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(BizInstrument bizInstrument, java.lang.String str, MutableLiveData<BizResp> mutableLiveData) {
        Function0<Unit> function0;
        java.lang.Object next;
        java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
        java.lang.String strAYXKKw = "";
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    WatchListBean.ActionBar actionBar = WatchListBean.Companion;
                    xUV xuv = xUV.EZpvd;
                    java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
                    java.lang.String str2 = strCopydefault == null ? "" : strCopydefault;
                    java.lang.String strAEQbTJ = xuv.AEQbTJ(bizInstrument);
                    WatchListBean watchListBeanAEQbTJ = actionBar.AEQbTJ(new WatchListData(str2, strAEQbTJ == null ? "" : strAEQbTJ, xuv.KWHzl(bizInstrument), xuv.OLrzqt(bizInstrument), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
                    java.util.Iterator<T> it = arrayListEZpvd.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            WatchListBean watchListBean = (WatchListBean) next;
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getInstType(), (java.lang.Object) watchListBean.getInstType()) || !Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getInstId(), (java.lang.Object) watchListBean.getInstId()) || !Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getAlias(), (java.lang.Object) watchListBean.getAlias())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (((WatchListBean) next) == null) {
                        arrayListEZpvd.add(0, watchListBeanAEQbTJ);
                        qVA.copydefault(arrayListEZpvd);
                    }
                    xUV xuv2 = xUV.EZpvd;
                    java.lang.String strCopydefault2 = xuv2.copydefault(bizInstrument);
                    java.lang.String str3 = strCopydefault2 == null ? "" : strCopydefault2;
                    java.lang.String strAEQbTJ2 = xuv2.AEQbTJ(bizInstrument);
                    AEQbTJ(new WatchListData(str3, strAEQbTJ2 == null ? "" : strAEQbTJ2, xuv2.KWHzl(bizInstrument), xuv2.OLrzqt(bizInstrument), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
                }
                break;
            case 49:
                if (str.equals("1")) {
                    WatchListBean watchListBeanOLrzqt = OLrzqt(arrayListEZpvd, bizInstrument);
                    if (watchListBeanOLrzqt != null) {
                        arrayListEZpvd.remove(watchListBeanOLrzqt);
                    }
                    qVA.copydefault(arrayListEZpvd);
                    xUV xuv3 = xUV.EZpvd;
                    java.lang.String strCopydefault3 = xuv3.copydefault(bizInstrument);
                    java.lang.String str4 = strCopydefault3 == null ? "" : strCopydefault3;
                    java.lang.String strAEQbTJ3 = xuv3.AEQbTJ(bizInstrument);
                    OLrzqt(new WatchListData(str4, strAEQbTJ3 == null ? "" : strAEQbTJ3, xuv3.KWHzl(bizInstrument), xuv3.OLrzqt(bizInstrument), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
                }
                break;
            case 50:
                if (str.equals("2")) {
                    WatchListBean watchListBeanOLrzqt2 = OLrzqt(arrayListEZpvd, bizInstrument);
                    if (watchListBeanOLrzqt2 != null) {
                        arrayListEZpvd.remove(watchListBeanOLrzqt2);
                        arrayListEZpvd.add(0, watchListBeanOLrzqt2);
                    }
                    qVA.copydefault(arrayListEZpvd);
                }
                break;
        }
        boolean z = !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || arrayListEZpvd.size() <= 50;
        if (z && (function0 = this.copydefault) != null) {
            function0.invoke();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && arrayListEZpvd.size() > 50) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener);
        }
        if (mutableLiveData != null) {
            mutableLiveData.postValue(new BizResp(z, strAYXKKw));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDGTeJD), 0, 1, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (java.lang.Object) null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(WatchListData watchListData, java.lang.String str, MutableLiveData<BizResp> mutableLiveData) {
        Function0<Unit> function0;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.util.ArrayList<WatchListBean> arrayListEZpvd = qVA.EZpvd();
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    WatchListBean watchListBeanAEQbTJ = WatchListBean.Companion.AEQbTJ(watchListData);
                    java.util.Iterator<T> it = arrayListEZpvd.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            WatchListBean watchListBean = (WatchListBean) next;
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getInstType(), (java.lang.Object) watchListBean.getInstType()) || !Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getInstId(), (java.lang.Object) watchListBean.getInstId()) || !Intrinsics.EZpvd((java.lang.Object) watchListBeanAEQbTJ.getAlias(), (java.lang.Object) watchListBean.getAlias())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (((WatchListBean) next) == null) {
                        arrayListEZpvd.add(0, watchListBeanAEQbTJ);
                        qVA.copydefault(arrayListEZpvd);
                    }
                    AEQbTJ(watchListData);
                }
                break;
            case 49:
                if (str.equals("1")) {
                    java.util.Iterator<T> it2 = arrayListEZpvd.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            WatchListBean watchListBean2 = (WatchListBean) next2;
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListBean2.getInstType(), (java.lang.Object) watchListData.getInstType()) || !Intrinsics.EZpvd((java.lang.Object) watchListBean2.getInstId(), (java.lang.Object) watchListData.getInstId()) || !Intrinsics.EZpvd((java.lang.Object) watchListBean2.getAlias(), (java.lang.Object) watchListData.getAlias())) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    WatchListBean watchListBean3 = (WatchListBean) next2;
                    if (watchListBean3 != null) {
                        arrayListEZpvd.remove(watchListBean3);
                    }
                    qVA.copydefault(arrayListEZpvd);
                    OLrzqt(watchListData);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    java.util.Iterator<T> it3 = arrayListEZpvd.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next3 = it3.next();
                            WatchListBean watchListBean4 = (WatchListBean) next3;
                            if (!Intrinsics.EZpvd((java.lang.Object) watchListBean4.getInstType(), (java.lang.Object) watchListData.getInstType()) || !Intrinsics.EZpvd((java.lang.Object) watchListBean4.getInstId(), (java.lang.Object) watchListData.getInstId()) || !Intrinsics.EZpvd((java.lang.Object) watchListBean4.getAlias(), (java.lang.Object) watchListData.getAlias())) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    WatchListBean watchListBean5 = (WatchListBean) next3;
                    if (watchListBean5 != null) {
                        arrayListEZpvd.remove(watchListBean5);
                        arrayListEZpvd.add(0, watchListBean5);
                    }
                    qVA.copydefault(arrayListEZpvd);
                }
                break;
        }
        boolean z = !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || arrayListEZpvd.size() <= 50;
        if (z && (function0 = this.copydefault) != null) {
            function0.invoke();
        }
        java.lang.String strAYXKKw = (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || arrayListEZpvd.size() <= 50) ? "" : C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener);
        if (mutableLiveData != null) {
            mutableLiveData.postValue(new BizResp(z, strAYXKKw));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDGTeJD), 0, 1, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.svY), 0, 1, (java.lang.Object) null);
        }
    }

    public WatchListBean OLrzqt(@NotNull java.util.List<WatchListBean> list, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return qVD.AEQbTJ.EZpvd(list, bizInstrument);
    }

    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instType = bizInstrument.getInstType();
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        return EZpvd(instType, strKWHzl, strCopydefault != null ? strCopydefault : "") != null;
    }

    @Override // o.InterfaceC54647xQc
    public boolean EZpvd(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return EZpvd(watchListData.getInstType(), watchListData.getInstId(), watchListData.getAlias()) != null;
    }

    @Override // o.InterfaceC54647xQc
    public boolean OLrzqt(@NotNull java.lang.String str, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        xUV xuv = xUV.EZpvd;
        java.lang.String strKWHzl = xuv.KWHzl(bizInstrument);
        java.lang.String strCopydefault = xuv.copydefault(bizInstrument);
        return EZpvd(str, strKWHzl, strCopydefault != null ? strCopydefault : "") != null;
    }

    @Override // o.InterfaceC54647xQc
    public java.util.ArrayList<WatchListData> AEQbTJ(@NotNull java.util.List<WatchListData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("MarketWatchHelper", "convertWatchListData() called with: list = " + list.size());
        this.AEQbTJ.clear();
        java.util.ArrayList<WatchListData> arrayList = new java.util.ArrayList<>();
        for (WatchListData watchListData : list) {
            WatchListData watchListData2 = new WatchListData(watchListData.getAlias(), watchListData.getExpTime(), watchListData.getInstId(), watchListData.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
            arrayList.add(watchListData2);
            AEQbTJ(watchListData2);
        }
        return arrayList;
    }

    public WatchListData EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.AEQbTJ.get(str + "-" + str2 + "-" + str3);
    }

    @Override // o.InterfaceC54647xQc
    public void AEQbTJ(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.AEQbTJ.put(watchListData.getInstType() + "-" + watchListData.getInstId() + "-" + watchListData.getAlias(), watchListData);
    }

    public void OLrzqt(@NotNull WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        this.AEQbTJ.remove(watchListData.getInstType() + "-" + watchListData.getInstId() + "-" + watchListData.getAlias());
    }

    @Override // o.InterfaceC54647xQc
    public void bH_() {
        this.copydefault = null;
        this.KWHzl.dispose();
    }

    @Override // o.InterfaceC54647xQc
    public boolean bI_() {
        return !this.KWHzl.isDisposed();
    }
}
