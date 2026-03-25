package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.core.util.SPUtils;
import com.okinc.market.watch.api.UnLoginWatchExtKt$addWatchList$1;
import com.okinc.market.watch.api.UnLoginWatchExtKt$removeFromWatchList$1;
import com.okinc.market.watch.api.UnLoginWatchExtKt$setUnLoginWatchList$1;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qVA {
    public static final java.util.ArrayList<WatchListBean> EZpvd() {
        return xUV.EZpvd.AEQbTJ();
    }

    public static final boolean copydefault(@NotNull java.util.ArrayList<WatchListBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        pUU.KWHzl("MarketWatchHelper", "saveUnLoginWatchList() called with: list = " + arrayList);
        if (arrayList.size() <= 50) {
            SPUtils.put(AbstractC54646xQb.Companion.EZpvd(), arrayList);
            return true;
        }
        C33134mqi.copydefault(C55688xof.Application.setToolbarNavigationClickListener);
        return false;
    }

    public static /* synthetic */ void setUnLoginWatchList$default(BizInstrument bizInstrument, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC55701xos = null;
        }
        OLrzqt(bizInstrument, str, interfaceC55701xos);
    }

    public static final void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, InterfaceC55701xos<BizResp> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (qVD.AEQbTJ.AEQbTJ()) {
            try {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null))), null, null, new UnLoginWatchExtKt$setUnLoginWatchList$1(MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null), str, bizInstrument, interfaceC55701xos, null), 3, null);
                return;
            } catch (java.lang.Exception unused) {
                if (interfaceC55701xos != null) {
                    interfaceC55701xos.EZpvd(false, new BizResp(false, ""), new java.lang.Exception(""));
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
        }
        EZpvd(str, bizInstrument, interfaceC55701xos);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void EZpvd(java.lang.String str, BizInstrument bizInstrument, InterfaceC55701xos<BizResp> interfaceC55701xos) {
        java.lang.Object next;
        java.util.ArrayList<WatchListBean> arrayListEZpvd = EZpvd();
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
                        copydefault(arrayListEZpvd);
                    }
                }
                break;
            case 49:
                if (str.equals("1")) {
                    WatchListBean watchListBeanEZpvd = qVD.AEQbTJ.EZpvd(arrayListEZpvd, bizInstrument);
                    if (watchListBeanEZpvd != null) {
                        arrayListEZpvd.remove(watchListBeanEZpvd);
                    }
                    copydefault(arrayListEZpvd);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    WatchListBean watchListBeanEZpvd2 = qVD.AEQbTJ.EZpvd(arrayListEZpvd, bizInstrument);
                    if (watchListBeanEZpvd2 != null) {
                        arrayListEZpvd.remove(watchListBeanEZpvd2);
                        arrayListEZpvd.add(0, watchListBeanEZpvd2);
                    }
                    copydefault(arrayListEZpvd);
                }
                break;
        }
        boolean z = !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || arrayListEZpvd.size() <= 50;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && arrayListEZpvd.size() > 50) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener);
        }
        if (interfaceC55701xos != null) {
            interfaceC55701xos.EZpvd(z, new BizResp(z, strAYXKKw), new java.lang.Exception(strAYXKKw));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull WatchListData watchListData) throws java.lang.Exception {
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(watchListData, "");
        java.util.ArrayList<WatchListBean> arrayListEZpvd = EZpvd();
        java.lang.Object obj = null;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    java.util.Iterator<T> it = arrayListEZpvd.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.lang.Object next = it.next();
                            WatchListBean watchListBean = (WatchListBean) next;
                            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) watchListBean.getInstType()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getInstId(), (java.lang.Object) watchListBean.getInstId()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getAlias(), (java.lang.Object) watchListBean.getAlias()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getChainId(), (java.lang.Object) watchListBean.getChainId()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getTokenContractAddress(), (java.lang.Object) watchListBean.getTokenContractAddress())) {
                                obj = next;
                            }
                        }
                    }
                    if (((WatchListBean) obj) == null) {
                        arrayListEZpvd.add(0, WatchListBean.Companion.AEQbTJ(watchListData));
                        copydefault(arrayListEZpvd);
                    }
                }
                break;
            case 49:
                if (str.equals("1")) {
                    arrayListEZpvd.remove(WatchListBean.Companion.AEQbTJ(watchListData));
                    copydefault(arrayListEZpvd);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    java.util.Iterator<T> it2 = arrayListEZpvd.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            java.lang.Object next2 = it2.next();
                            WatchListBean watchListBean2 = (WatchListBean) next2;
                            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) watchListBean2.getInstType()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getInstId(), (java.lang.Object) watchListBean2.getInstId()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getAlias(), (java.lang.Object) watchListBean2.getAlias()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getChainId(), (java.lang.Object) watchListBean2.getChainId()) && Intrinsics.EZpvd((java.lang.Object) watchListData.getTokenContractAddress(), (java.lang.Object) watchListBean2.getTokenContractAddress())) {
                                obj = next2;
                            }
                        }
                    }
                    WatchListBean watchListBean3 = (WatchListBean) obj;
                    if (watchListBean3 != null) {
                        arrayListEZpvd.remove(watchListBean3);
                        arrayListEZpvd.add(0, watchListBean3);
                    }
                    copydefault(arrayListEZpvd);
                }
                break;
        }
        boolean z = !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") || arrayListEZpvd.size() <= 50;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && arrayListEZpvd.size() > 50) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setToolbarNavigationClickListener);
        }
        if (!z) {
            throw new java.lang.Exception(strAYXKKw);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UnLoginWatchExtKt$removeFromWatchList$1 unLoginWatchExtKt$removeFromWatchList$1;
        if (continuation instanceof UnLoginWatchExtKt$removeFromWatchList$1) {
            unLoginWatchExtKt$removeFromWatchList$1 = (UnLoginWatchExtKt$removeFromWatchList$1) continuation;
            int i = unLoginWatchExtKt$removeFromWatchList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unLoginWatchExtKt$removeFromWatchList$1.label = i - Integer.MIN_VALUE;
            } else {
                unLoginWatchExtKt$removeFromWatchList$1 = new UnLoginWatchExtKt$removeFromWatchList$1(continuation);
            }
        }
        java.lang.Object obj = unLoginWatchExtKt$removeFromWatchList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unLoginWatchExtKt$removeFromWatchList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketFavDataBase marketFavDataBaseInstance$default = MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null);
                Result.Application application = Result.Companion;
                qWN qwn = new qWN(qWO.Companion.copydefault(marketFavDataBaseInstance$default));
                unLoginWatchExtKt$removeFromWatchList$1.label = 1;
                if (qwn.EZpvd(str, str2, unLoginWatchExtKt$removeFromWatchList$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        UnLoginWatchExtKt$addWatchList$1 unLoginWatchExtKt$addWatchList$1;
        if (continuation instanceof UnLoginWatchExtKt$addWatchList$1) {
            unLoginWatchExtKt$addWatchList$1 = (UnLoginWatchExtKt$addWatchList$1) continuation;
            int i = unLoginWatchExtKt$addWatchList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unLoginWatchExtKt$addWatchList$1.label = i - Integer.MIN_VALUE;
            } else {
                unLoginWatchExtKt$addWatchList$1 = new UnLoginWatchExtKt$addWatchList$1(continuation);
            }
        }
        java.lang.Object obj = unLoginWatchExtKt$addWatchList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unLoginWatchExtKt$addWatchList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketFavDataBase marketFavDataBaseInstance$default = MarketFavDataBase.TaskDescription.instance$default(MarketFavDataBase.Companion, null, 1, null);
                Result.Application application = Result.Companion;
                qWN qwn = new qWN(qWO.Companion.copydefault(marketFavDataBaseInstance$default));
                unLoginWatchExtKt$addWatchList$1.label = 1;
                if (qwn.copydefault(str, str2, unLoginWatchExtKt$addWatchList$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
