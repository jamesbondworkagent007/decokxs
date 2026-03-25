package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.OkxTradePositionBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.ui.delegate.DefaultKlineDrawLineDelegate$setDrawgingData$1$3;
import com.okinc.kline.ui.delegate.DefaultKlineDrawLineDelegate$useLocalDrawgingData$1$1$1$3$1;
import com.okinc.kline.ui.delegate.DefaultKlineDrawLineDelegate$useLocalDrawgingData$1$1$1$4$1;
import com.okinc.kline.ui.delegate.DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$2;
import com.okinc.kline.ui.delegate.DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3;
import com.okinc.kline.ui.delegate.MyLifecycleEventObserver;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC39274ppH;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39295ppc implements InterfaceC39274ppH, InterfaceC39273ppG {
    public C36250oUv KWHzl;
    public InterfaceC39563puh.StateListAnimator OLrzqt;
    public LifecycleOwner copydefault;
    public java.lang.String AEQbTJ = "";
    public java.util.ArrayList<DrawLineData.DrawLineItem> EZpvd = new java.util.ArrayList<>();
    public java.util.ArrayList<LineDataBean> djBIcL = new java.util.ArrayList<>();
    public java.util.ArrayList<LineFibDataBean> valueOf = new java.util.ArrayList<>();
    public MyLifecycleEventObserver AYXKKw = new MyLifecycleEventObserver(this);

    /* JADX INFO: renamed from: o.ppc$Application */
    public static final class Application extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX INFO: renamed from: o.ppc$FragmentManager */
    public static final class FragmentManager extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX INFO: renamed from: o.ppc$LoaderManager */
    public static final class LoaderManager extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX INFO: renamed from: o.ppc$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.ArrayList<DrawingLinesData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AEQbTJ(@NotNull java.util.ArrayList<HistoryOrderData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AYXKKw(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void AhwBna(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.ArrayList<Triple<AbstractC36262oVg, java.lang.Boolean, KlineIndicatorBean>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.util.ArrayList<OkxTradePositionBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.ArrayList<PriceWarningItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.InterfaceC39563puh.Application
    public void RKDWNf() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.List<? extends oLY> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void gEmmrt(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.InterfaceC39563puh.Application
    public void gwTjWJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39563puh.Application
    public void values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        InterfaceC39274ppH.ActionBar.OLrzqt(this, klineSpotAverageBean);
    }

    @Override // o.InterfaceC39563puh.Application
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
        InterfaceC39274ppH.ActionBar.copydefault(this, str, list);
    }

    @Override // o.InterfaceC39563puh.Application
    public void copydefault(@NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
        InterfaceC39274ppH.ActionBar.EZpvd(this, arrayList);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf() {
        InterfaceC39274ppH.ActionBar.copydefault(this);
    }

    @Override // o.InterfaceC39563puh.Application
    public void valueOf(@NotNull java.util.List<? extends oLY> list) {
        InterfaceC39274ppH.ActionBar.KWHzl(this, list);
    }

    public void copydefault(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.copydefault = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this.AYXKKw);
    }

    public void copydefault(@NotNull C36250oUv c36250oUv) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.KWHzl = c36250oUv;
        this.OLrzqt = new C39562pug(this, null, false, false, 12, null);
    }

    /* JADX INFO: renamed from: o.ppc$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.ppc$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.ppc$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.ppc$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: o.ppc$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((DrawLineData.DrawLineItem) t).getTimeStamp(), ((DrawLineData.DrawLineItem) t2).getTimeStamp());
        }
    }

    @Override // o.InterfaceC39274ppH
    public void copydefault(@NotNull C36250oUv c36250oUv, @NotNull final java.lang.String str, final LifecycleOwner lifecycleOwner, boolean z) {
        AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(str, "");
        C36246oUr.copydefault().AEQbTJ(new java.util.ArrayList<>());
        this.AEQbTJ = str;
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true) && !z) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "0";
            if (lifecycleOwner == null || (abstractC58260yxtCopydefault = new C31947mJv().copydefault(str)) == null) {
                return;
            }
            final Function1 function1 = new Function1() { // from class: o.ppd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39295ppc.copydefault(objectRef, this, lifecycleOwner, str, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ppr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39295ppc.values(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ppp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39295ppc.KWHzl(objectRef, this, lifecycleOwner, str, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ppv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C39295ppc.isConnected(function12, obj);
                }
            });
            return;
        }
        KWHzl(c36250oUv, str, lifecycleOwner);
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(Ref.ObjectRef objectRef, C39295ppc c39295ppc, LifecycleOwner lifecycleOwner, java.lang.String str, java.util.List list) {
        java.lang.String str2 = "0";
        java.lang.String timeVersion = C33129mqd.KWHzl((java.util.Collection) list) ? ((DrawingDataEntity) list.get(0)).getTimeVersion() : "0";
        objectRef.element = timeVersion;
        InterfaceC39563puh.StateListAnimator stateListAnimator = c39295ppc.OLrzqt;
        if (stateListAnimator != null) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) timeVersion;
            if (charSequence != null && charSequence.length() != 0) {
                str2 = (java.lang.String) objectRef.element;
            }
            stateListAnimator.EZpvd(lifecycleOwner, str, str2);
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Ref.ObjectRef objectRef, C39295ppc c39295ppc, LifecycleOwner lifecycleOwner, java.lang.String str, java.lang.Throwable th) {
        objectRef.element = "0";
        InterfaceC39563puh.StateListAnimator stateListAnimator = c39295ppc.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.EZpvd(lifecycleOwner, str, "0");
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39274ppH
    public void KWHzl(@NotNull final C36250oUv c36250oUv, @NotNull final java.lang.String str, final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        Intrinsics.checkNotNullParameter(str, "");
        DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.ppt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39295ppc.OLrzqt(this.AEQbTJ, str, c36250oUv, lifecycleOwner, (java.util.ArrayList) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, java.util.ArrayList] */
    public static final Unit OLrzqt(final C39295ppc c39295ppc, final java.lang.String str, final C36250oUv c36250oUv, final LifecycleOwner lifecycleOwner, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c39295ppc.EZpvd = arrayList;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new java.util.ArrayList();
        c39295ppc.djBIcL.clear();
        c39295ppc.valueOf.clear();
        if (C33129mqd.KWHzl((java.util.Collection) c39295ppc.EZpvd)) {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.ppu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.AEQbTJ(objectRef, c39295ppc, objectRef2, c36250oUv, str, lifecycleOwner, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ppx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.fIwbmz(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.ppw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.OLrzqt(this.copydefault, c36250oUv, str, lifecycleOwner, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ppy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.fJNWhG(function12, obj);
                    }
                });
            }
        } else {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault2 = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault2 != null) {
                final Function1 function13 = new Function1() { // from class: o.ppg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.KWHzl(str, c39295ppc, lifecycleOwner, c36250oUv, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ppf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.fARcdN(function13, obj);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.ppi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.copydefault((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.pph
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.ejfBZ(function14, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.ArrayList] */
    public static final Unit AEQbTJ(Ref.ObjectRef objectRef, C39295ppc c39295ppc, Ref.ObjectRef objectRef2, C36250oUv c36250oUv, java.lang.String str, LifecycleOwner lifecycleOwner, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new FragmentManager().getType()));
            ?? Copydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            objectRef.element = Copydefault;
            Copydefault.removeAll(c39295ppc.EZpvd);
            ((java.util.ArrayList) objectRef2.element).addAll((java.util.Collection) objectRef.element);
            ((java.util.ArrayList) objectRef2.element).addAll(c39295ppc.EZpvd);
            int size = ((java.util.ArrayList) objectRef2.element).size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    java.util.List list2 = (java.util.List) objectRef2.element;
                    if (list2.size() > 1) {
                        C56407yEf.copydefault(list2, new Fragment());
                    }
                    int size2 = ((java.util.ArrayList) objectRef2.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        java.lang.Object obj = ((java.util.ArrayList) objectRef2.element).get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                        drawLineItem.setDelete(true);
                        DrawLineData drawLineData = DrawLineData.copydefault;
                        drawLineData.EZpvd().remove(drawLineItem);
                        drawLineData.EZpvd().add(drawLineItem);
                        c39295ppc.EZpvd.remove(drawLineItem);
                    }
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd(drawLineData2.EZpvd());
                } else {
                    c39295ppc.AEQbTJ(c36250oUv, (java.util.ArrayList<DrawLineData.DrawLineItem>) objectRef2.element);
                    return Unit.INSTANCE;
                }
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                uploadDrawingData$default(c39295ppc, str, c39295ppc.EZpvd, lifecycleOwner, false, false, 24, null);
                C37895pEr.copydefault.AEQbTJ((java.util.ArrayList) objectRef2.element, drawingDataBean.getTimeVersion(), str, c39295ppc.djBIcL, c39295ppc.valueOf);
                LifecycleOwner lifecycleOwner2 = c39295ppc.copydefault;
                if (lifecycleOwner2 == null) {
                    Intrinsics.gEmmrt("");
                    lifecycleOwner2 = null;
                }
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2);
                if (lifecycleScope != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$2(objectRef2, c39295ppc, c36250oUv, null), 3, null);
                }
            } else {
                LifecycleOwner lifecycleOwner3 = c39295ppc.copydefault;
                if (lifecycleOwner3 == null) {
                    Intrinsics.gEmmrt("");
                    lifecycleOwner3 = null;
                }
                LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner3);
                if (lifecycleScope2 != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope2, null, null, new DefaultKlineDrawLineDelegate$useLocalDrawingData$1$1$3(objectRef2, c39295ppc, c36250oUv, null), 3, null);
                }
            }
        } else {
            c39295ppc.AEQbTJ(c36250oUv, str, c39295ppc.EZpvd, lifecycleOwner);
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C39295ppc c39295ppc, C36250oUv c36250oUv, java.lang.String str, LifecycleOwner lifecycleOwner, java.lang.Throwable th) {
        c39295ppc.AEQbTJ(c36250oUv, str, c39295ppc.EZpvd, lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, C39295ppc c39295ppc, LifecycleOwner lifecycleOwner, C36250oUv c36250oUv, java.util.List list) {
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new LoaderManager().getType()));
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            int size = arrayListCopydefault.size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size <= c37895pEr.EZpvd() || !SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                arrayList = arrayListCopydefault;
            } else {
                if (arrayListCopydefault.size() > 1) {
                    C56407yEf.copydefault(arrayListCopydefault, new Dialog());
                }
                int size2 = arrayListCopydefault.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    arrayListCopydefault.get(i).setDelete(true);
                }
                arrayList = arrayListCopydefault;
                C37895pEr.copydefault.AEQbTJ(arrayList, "0", str, c39295ppc.djBIcL, c39295ppc.valueOf);
                uploadDrawingData$default(c39295ppc, str, arrayListCopydefault, lifecycleOwner, false, false, 24, null);
            }
            c39295ppc.AEQbTJ(c36250oUv, arrayList);
            pUU.copydefault("KlineDrawLine", "DefaultKlineDrawLineDelegate:getDrawingData size = " + arrayList.size());
        } else {
            pUU.copydefault("KlineDrawLine", "DefaultKlineDrawLineDelegate:getDrawingData null");
        }
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        pUU.copydefault("KlineDrawLine", "DefaultKlineDrawLineDelegate:getDrawingData error: " + th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // o.InterfaceC39563puh.Application
    public void OLrzqt(@NotNull final DrawingDataBean drawingDataBean) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C37897pEt.KWHzl.copydefault(drawingDataBean, true);
        this.djBIcL.clear();
        this.valueOf.clear();
        DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.ppe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39295ppc.AEQbTJ(this.KWHzl, objectRef, drawingDataBean, (java.util.ArrayList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.util.ArrayList] */
    public static final Unit AEQbTJ(C39295ppc c39295ppc, Ref.ObjectRef objectRef, DrawingDataBean drawingDataBean, java.util.ArrayList arrayList) {
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        c39295ppc.EZpvd = arrayList;
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            int i = 0;
            for (java.lang.Object obj : c39295ppc.EZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                if (drawLineItem.getIndexId().length() == 0) {
                    drawLineItem.setIndexId(C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis() + ((long) i)));
                }
                i++;
            }
            C37895pEr c37895pEr = C37895pEr.copydefault;
            ?? AEQbTJ = c37895pEr.AEQbTJ((java.util.ArrayList<DrawLineData.DrawLineItem>) objectRef.element, c39295ppc.EZpvd);
            objectRef.element = AEQbTJ;
            AEQbTJ.addAll(c39295ppc.EZpvd);
            if (((java.util.ArrayList) objectRef.element).size() > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    java.util.List list = (java.util.List) objectRef.element;
                    if (list.size() > 1) {
                        C56407yEf.copydefault(list, new Activity());
                    }
                    int size = ((java.util.ArrayList) objectRef.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i2 = 0; i2 < size - iEZpvd; i2++) {
                        ((DrawLineData.DrawLineItem) ((java.util.ArrayList) objectRef.element).get(i2)).setDelete(true);
                    }
                    java.lang.String str = c39295ppc.AEQbTJ;
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) objectRef.element;
                    LifecycleOwner lifecycleOwner3 = c39295ppc.copydefault;
                    if (lifecycleOwner3 == null) {
                        Intrinsics.gEmmrt("");
                        lifecycleOwner2 = null;
                    } else {
                        lifecycleOwner2 = lifecycleOwner3;
                    }
                    uploadDrawingData$default(c39295ppc, str, arrayList2, lifecycleOwner2, false, false, 24, null);
                }
            } else {
                java.lang.String str2 = c39295ppc.AEQbTJ;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) objectRef.element;
                LifecycleOwner lifecycleOwner4 = c39295ppc.copydefault;
                if (lifecycleOwner4 == null) {
                    Intrinsics.gEmmrt("");
                    lifecycleOwner = null;
                } else {
                    lifecycleOwner = lifecycleOwner4;
                }
                uploadDrawingData$default(c39295ppc, str2, arrayList3, lifecycleOwner, false, false, 24, null);
            }
        }
        C37895pEr c37895pEr2 = C37895pEr.copydefault;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList4 = (java.util.ArrayList) objectRef.element;
        java.lang.String timeVersion = drawingDataBean.getTimeVersion();
        java.lang.String str3 = c39295ppc.AEQbTJ;
        c37895pEr2.AEQbTJ(arrayList4, timeVersion, str3 == null ? "" : str3, c39295ppc.djBIcL, c39295ppc.valueOf);
        LifecycleOwner lifecycleOwner5 = c39295ppc.copydefault;
        if (lifecycleOwner5 == null) {
            Intrinsics.gEmmrt("");
            lifecycleOwner5 = null;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner5), null, null, new DefaultKlineDrawLineDelegate$setDrawgingData$1$3(objectRef, c39295ppc, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39563puh.Application
    public void ODXsMY() {
        final java.lang.String str = this.AEQbTJ;
        DrawLineData.copydefault.AEQbTJ(new Function1() { // from class: o.ppb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39295ppc.copydefault(this.OLrzqt, str, (java.util.ArrayList) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final Unit copydefault(final C39295ppc c39295ppc, final java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c39295ppc.EZpvd = arrayList;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new java.util.ArrayList();
        c39295ppc.djBIcL.clear();
        c39295ppc.valueOf.clear();
        if (C33129mqd.KWHzl((java.util.Collection) c39295ppc.EZpvd)) {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault != null) {
                final Function1 function1 = new Function1() { // from class: o.ppm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.copydefault(objectRef, c39295ppc, objectRef2, str, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ppn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.fetchVPNInfo(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.ppl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.EZpvd(this.AEQbTJ, str, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ppk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.AkhnZx(function12, obj);
                    }
                });
            }
        } else {
            AbstractC58260yxt<java.util.List<DrawingDataEntity>> abstractC58260yxtCopydefault2 = new C31947mJv().copydefault(str);
            if (abstractC58260yxtCopydefault2 != null) {
                final Function1 function13 = new Function1() { // from class: o.ppj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.copydefault(this.copydefault, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM<? super java.util.List<DrawingDataEntity>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ppo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.DbNXlk(function13, obj);
                    }
                };
                final Function1 function14 = new Function1() { // from class: o.pps
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39295ppc.AEQbTJ((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ppq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C39295ppc.AuCTel(function14, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.ArrayList] */
    public static final Unit copydefault(Ref.ObjectRef objectRef, C39295ppc c39295ppc, Ref.ObjectRef objectRef2, java.lang.String str, java.util.List list) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleOwner lifecycleOwner2 = null;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new Application().getType()));
            ?? Copydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            objectRef.element = Copydefault;
            Copydefault.removeAll(c39295ppc.EZpvd);
            ((java.util.ArrayList) objectRef2.element).addAll((java.util.Collection) objectRef.element);
            ((java.util.ArrayList) objectRef2.element).addAll(c39295ppc.EZpvd);
            int size = ((java.util.ArrayList) objectRef2.element).size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd()) {
                if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                    java.util.List list2 = (java.util.List) objectRef2.element;
                    if (list2.size() > 1) {
                        C56407yEf.copydefault(list2, new StateListAnimator());
                    }
                    int size2 = ((java.util.ArrayList) objectRef2.element).size();
                    int iEZpvd = c37895pEr.EZpvd();
                    for (int i = 0; i < size2 - iEZpvd; i++) {
                        java.lang.Object obj = ((java.util.ArrayList) objectRef2.element).get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
                        drawLineItem.setDelete(true);
                        DrawLineData drawLineData = DrawLineData.copydefault;
                        drawLineData.EZpvd().remove(drawLineItem);
                        drawLineData.EZpvd().add(drawLineItem);
                        c39295ppc.EZpvd.remove(drawLineItem);
                    }
                    DrawLineData drawLineData2 = DrawLineData.copydefault;
                    drawLineData2.EZpvd(drawLineData2.EZpvd());
                } else {
                    C36250oUv c36250oUv = c39295ppc.KWHzl;
                    if (c36250oUv != null) {
                        c39295ppc.AEQbTJ(c36250oUv, (java.util.ArrayList<DrawLineData.DrawLineItem>) objectRef2.element);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
                java.lang.String str2 = c39295ppc.AEQbTJ;
                java.util.ArrayList<DrawLineData.DrawLineItem> arrayList = c39295ppc.EZpvd;
                LifecycleOwner lifecycleOwner3 = c39295ppc.copydefault;
                if (lifecycleOwner3 == null) {
                    Intrinsics.gEmmrt("");
                    lifecycleOwner = null;
                } else {
                    lifecycleOwner = lifecycleOwner3;
                }
                uploadDrawingData$default(c39295ppc, str2, arrayList, lifecycleOwner, false, false, 24, null);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2 = (java.util.ArrayList) objectRef2.element;
                java.lang.String timeVersion = drawingDataBean.getTimeVersion();
                java.lang.String str3 = c39295ppc.AEQbTJ;
                c37895pEr2.AEQbTJ(arrayList2, timeVersion, str3 == null ? "" : str3, c39295ppc.djBIcL, c39295ppc.valueOf);
                C36250oUv c36250oUv2 = c39295ppc.KWHzl;
                if (c36250oUv2 != null) {
                    LifecycleOwner lifecycleOwner4 = c39295ppc.copydefault;
                    if (lifecycleOwner4 == null) {
                        Intrinsics.gEmmrt("");
                        lifecycleOwner4 = null;
                    }
                    if (lifecycleOwner4 != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner4)) != null) {
                        BuildersKt__Builders_commonKt.launch$default(lifecycleScope2, null, null, new DefaultKlineDrawLineDelegate$useLocalDrawgingData$1$1$1$3$1(objectRef2, c39295ppc, c36250oUv2, null), 3, null);
                    }
                }
            } else {
                C36250oUv c36250oUv3 = c39295ppc.KWHzl;
                if (c36250oUv3 != null) {
                    LifecycleOwner lifecycleOwner5 = c39295ppc.copydefault;
                    if (lifecycleOwner5 == null) {
                        Intrinsics.gEmmrt("");
                        lifecycleOwner5 = null;
                    }
                    if (lifecycleOwner5 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner5)) != null) {
                        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DefaultKlineDrawLineDelegate$useLocalDrawgingData$1$1$1$4$1(objectRef2, c39295ppc, c36250oUv3, null), 3, null);
                    }
                }
            }
        } else {
            C36250oUv c36250oUv4 = c39295ppc.KWHzl;
            if (c36250oUv4 != null) {
                java.util.ArrayList<DrawLineData.DrawLineItem> arrayList3 = c39295ppc.EZpvd;
                LifecycleOwner lifecycleOwner6 = c39295ppc.copydefault;
                if (lifecycleOwner6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    lifecycleOwner2 = lifecycleOwner6;
                }
                c39295ppc.AEQbTJ(c36250oUv4, str, arrayList3, lifecycleOwner2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C39295ppc c39295ppc, java.lang.String str, java.lang.Throwable th) {
        C36250oUv c36250oUv = c39295ppc.KWHzl;
        if (c36250oUv != null) {
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayList = c39295ppc.EZpvd;
            LifecycleOwner lifecycleOwner = c39295ppc.copydefault;
            if (lifecycleOwner == null) {
                Intrinsics.gEmmrt("");
                lifecycleOwner = null;
            }
            c39295ppc.AEQbTJ(c36250oUv, str, arrayList, lifecycleOwner);
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C39295ppc c39295ppc, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            DrawingDataBean drawingDataBean = new DrawingDataBean(null, null, null, 7, null);
            drawingDataBean.setLines((java.util.ArrayList) new Gson().fromJson(((DrawingDataEntity) list.get(0)).getLines(), new TaskDescription().getType()));
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListCopydefault = C37897pEt.KWHzl.copydefault(drawingDataBean);
            int size = arrayListCopydefault.size();
            C37895pEr c37895pEr = C37895pEr.copydefault;
            if (size > c37895pEr.EZpvd() && SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                if (arrayListCopydefault.size() > 1) {
                    C56407yEf.copydefault(arrayListCopydefault, new ActionBar());
                }
                int size2 = arrayListCopydefault.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    arrayListCopydefault.get(i).setDelete(true);
                }
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                java.lang.String str = c39295ppc.AEQbTJ;
                c37895pEr2.AEQbTJ(arrayListCopydefault, "0", str == null ? "" : str, c39295ppc.djBIcL, c39295ppc.valueOf);
                java.lang.String str2 = c39295ppc.AEQbTJ;
                LifecycleOwner lifecycleOwner = c39295ppc.copydefault;
                if (lifecycleOwner == null) {
                    Intrinsics.gEmmrt("");
                    lifecycleOwner = null;
                }
                uploadDrawingData$default(c39295ppc, str2, arrayListCopydefault, lifecycleOwner, false, false, 24, null);
            }
            C36250oUv c36250oUv = c39295ppc.KWHzl;
            if (c36250oUv != null) {
                c39295ppc.AEQbTJ(c36250oUv, arrayListCopydefault);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        LifecycleOwner lifecycleOwner = this.copydefault;
        if (lifecycleOwner == null) {
            Intrinsics.gEmmrt("");
            lifecycleOwner = null;
        }
        return lifecycleOwner.getLifecycle();
    }

    public static /* synthetic */ void checkSPData$default(C39295ppc c39295ppc, C36250oUv c36250oUv, java.lang.String str, java.util.ArrayList arrayList, LifecycleOwner lifecycleOwner, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            lifecycleOwner = null;
        }
        c39295ppc.AEQbTJ(c36250oUv, str, (java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList, lifecycleOwner);
    }

    public final void AEQbTJ(C36250oUv c36250oUv, java.lang.String str, java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, LifecycleOwner lifecycleOwner) {
        int size = arrayList.size();
        C37895pEr c37895pEr = C37895pEr.copydefault;
        if (size > c37895pEr.EZpvd()) {
            if (SPUtils.getBoolean("kline_drawing_data_clear", true)) {
                int size2 = arrayList.size();
                int iEZpvd = c37895pEr.EZpvd();
                for (int i = 0; i < size2 - iEZpvd; i++) {
                    DrawLineData.DrawLineItem drawLineItem = arrayList.get(0);
                    Intrinsics.checkNotNullExpressionValue(drawLineItem, "");
                    DrawLineData.copydefault.EZpvd().remove(drawLineItem);
                    arrayList.remove(0);
                }
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.EZpvd(drawLineData.EZpvd());
            } else {
                AEQbTJ(c36250oUv, arrayList);
                return;
            }
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && SPUtils.getBoolean("kline_drawing_data", true)) {
            uploadDrawingData$default(this, str, arrayList, lifecycleOwner, false, false, 24, null);
            DrawingDataBean drawingDataBean = new DrawingDataBean("0", str, null, 4, null);
            C37895pEr.copydefault.OLrzqt(drawingDataBean, this.djBIcL, this.valueOf);
            AEQbTJ(c36250oUv, C37897pEt.KWHzl.copydefault(drawingDataBean));
            return;
        }
        AEQbTJ(c36250oUv, arrayList);
    }

    public static /* synthetic */ void uploadDrawingData$default(C39295ppc c39295ppc, java.lang.String str, java.util.ArrayList arrayList, LifecycleOwner lifecycleOwner, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            lifecycleOwner = null;
        }
        c39295ppc.EZpvd(str, (java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList, lifecycleOwner, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, LifecycleOwner lifecycleOwner, boolean z, boolean z2) {
        InterfaceC39563puh.StateListAnimator stateListAnimator;
        java.lang.String json;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        JsonObject jsonObject = new JsonObject();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DrawLineData.DrawLineItem drawLineItem = (DrawLineData.DrawLineItem) obj;
            LineDataBean lineDataBean = new LineDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            LineFibDataBean lineFibDataBean = new LineFibDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
            java.lang.String indexId = drawLineItem.getIndexId();
            int length = indexId.length();
            T tCopydefault = indexId;
            if (length == 0) {
                tCopydefault = C37897pEt.KWHzl.copydefault(java.lang.System.currentTimeMillis() + ((long) i));
            }
            objectRef.element = tCopydefault;
            if (z || drawLineItem.isDelete()) {
                json = "";
            } else if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                lineFibDataBean.setId((java.lang.String) objectRef.element);
                C37895pEr c37895pEr = C37895pEr.copydefault;
                lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                lineFibDataBean.setState(c37895pEr.KWHzl(drawLineItem, str, true));
                lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                json = new Gson().toJson(lineFibDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.EZpvd)) {
                    this.valueOf.add(lineFibDataBean);
                }
            } else {
                lineDataBean.setId((java.lang.String) objectRef.element);
                C37895pEr c37895pEr2 = C37895pEr.copydefault;
                lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                lineDataBean.setState(c37895pEr2.EZpvd(drawLineItem, str, true));
                lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                json = new Gson().toJson(lineDataBean);
                if (C33129mqd.KWHzl((java.util.Collection) this.EZpvd)) {
                    this.djBIcL.add(lineDataBean);
                }
            }
            jsonObject.addProperty((java.lang.String) objectRef.element, json);
            i++;
        }
        if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null) || !SPUtils.getBoolean("kline_drawing_data", true) || lifecycleOwner == null || (stateListAnimator = this.OLrzqt) == null) {
            return;
        }
        stateListAnimator.AEQbTJ(lifecycleOwner, str, jsonObject, z, z2);
    }

    public final void AEQbTJ(C36250oUv c36250oUv, java.util.ArrayList<DrawLineData.DrawLineItem> arrayList) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
        if (chartViewOutSideConfigAkhnZx != null) {
            chartViewOutSideConfigAkhnZx.setLinesList(arrayList);
        }
        c36250oUv.invalidate();
    }

    @Override // o.InterfaceC39273ppG
    public void copydefault() {
        InterfaceC39563puh.StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault();
        }
        LifecycleOwner lifecycleOwner = null;
        this.KWHzl = null;
        LifecycleOwner lifecycleOwner2 = this.copydefault;
        if (lifecycleOwner2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            lifecycleOwner = lifecycleOwner2;
        }
        lifecycleOwner.getLifecycle().removeObserver(this.AYXKKw);
    }
}
