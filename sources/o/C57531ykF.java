package o;

import androidx.camera.video.AudioStats;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.bean.ComparableArrayList;
import com.okinc.websocket.bean.DepthData;
import com.okinc.websocket.bean.OKWSEvent;
import com.okinc.websocket.bean.WSDepthResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57531ykF implements InterfaceC57562ykk {
    public WSDepthResponse OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public java.lang.String KWHzl = "";
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.ykF$ActionBar */
    public static final class ActionBar extends TypeToken<java.util.ArrayList<DepthData>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.ykF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC57562ykk
    public void EZpvd(@NotNull final OKIncomingData oKIncomingData, @NotNull Function1<? super OKIncomingData, Unit> function1, Function2<? super OKWSEvent, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.ykI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C57531ykF.AEQbTJ(oKIncomingData, this, interfaceC58251yxk);
            }
        }).subscribeOn(C43357rnk.KWHzl.OLrzqt()).observeOn(C58266yxz.OLrzqt()).subscribe(new Application(oKIncomingData, function1, function2));
    }

    public static final void AEQbTJ(OKIncomingData oKIncomingData, C57531ykF c57531ykF, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        c57531ykF.copydefault = c57531ykF.AEQbTJ(oKIncomingData.getAction(), (java.lang.String) payload);
        interfaceC58251yxk.onNext(java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r2)));
    }

    /* JADX INFO: renamed from: o.ykF$Application */
    public static final class Application implements InterfaceC58256yxp<java.lang.Boolean> {
        public final /* synthetic */ Function1<OKIncomingData, Unit> EZpvd;
        public final /* synthetic */ OKIncomingData KWHzl;
        public final /* synthetic */ Function2<OKWSEvent, java.lang.String, Unit> OLrzqt;

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKIncomingData, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.websocket.bean.OKWSEvent, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(OKIncomingData oKIncomingData, Function1<? super OKIncomingData, Unit> function1, Function2<? super OKWSEvent, ? super java.lang.String, Unit> function2) {
            this.KWHzl = oKIncomingData;
            this.EZpvd = function1;
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // o.InterfaceC58256yxp
        public /* synthetic */ void onNext(java.lang.Boolean bool) {
            AEQbTJ(bool.booleanValue());
        }

        public void AEQbTJ(boolean z) {
            C57570yks.KWHzl.KWHzl("OKDepthChannelBuffer", "3++++>>  success : " + z + ", " + C57531ykF.this.copydefault);
            if (z) {
                this.KWHzl.setPayload(C57531ykF.this.copydefault);
                this.EZpvd.invoke(this.KWHzl);
                return;
            }
            Function2<OKWSEvent, java.lang.String, Unit> function2 = this.OLrzqt;
            if (function2 != null) {
                function2.invoke(OKWSEvent.CHECK_SUM_ERROR, "depth channel checkSum error: " + C57531ykF.this.KWHzl);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            Function2<OKWSEvent, java.lang.String, Unit> function2 = this.OLrzqt;
            if (function2 != null) {
                function2.invoke(OKWSEvent.ERROR, "depth channel error: " + C57531ykF.this.KWHzl);
            }
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        DepthData depthData;
        WSDepthResponse wSDepthResponse;
        try {
            java.util.ArrayList<DepthData> arrayList = (java.util.ArrayList) C33490mxT.KWHzl(str2, new ActionBar());
            C57570yks c57570yks = C57570yks.KWHzl;
            c57570yks.KWHzl("OKDepthChannelBuffer", "2 --- event depth data action:" + str);
            if (arrayList == null) {
                return "";
            }
            if (arrayList.size() > 0) {
                WSDepthResponse.ActionBar actionBar = WSDepthResponse.Companion;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.OLrzqt())) {
                    WSDepthResponse wSDepthResponse2 = new WSDepthResponse();
                    this.OLrzqt = wSDepthResponse2;
                    wSDepthResponse2.setData(arrayList);
                    wSDepthResponse2.setAction(str);
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.KWHzl()) && (depthData = (DepthData) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) != null && (wSDepthResponse = this.OLrzqt) != null) {
                    Intrinsics.copydefault(wSDepthResponse);
                    if (CollectionsKt___CollectionsKt.firstOrNull(wSDepthResponse.getData()) != null) {
                        WSDepthResponse wSDepthResponse3 = this.OLrzqt;
                        Intrinsics.copydefault(wSDepthResponse3);
                        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(wSDepthResponse3.getData());
                        Intrinsics.copydefault(objFirstOrNull);
                        DepthData depthData2 = (DepthData) objFirstOrNull;
                        java.util.Iterator<T> it = depthData.getAsks().iterator();
                        while (it.hasNext()) {
                            handleListData$OKNetwork_websocket$default(this, depthData2.getAsks(), (ComparableArrayList) it.next(), false, 4, null);
                        }
                        java.util.Iterator<T> it2 = depthData.getBids().iterator();
                        while (it2.hasNext()) {
                            copydefault(depthData2.getBids(), (ComparableArrayList) it2.next(), false);
                        }
                    }
                }
                WSDepthResponse wSDepthResponse4 = this.OLrzqt;
                return (wSDepthResponse4 == null || ((DepthData) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? "" : C33490mxT.OLrzqt(wSDepthResponse4.getData());
            }
            c57570yks.EZpvd("OKDepthChannelBuffer", "depth channel return data.size is 0!");
            return "";
        } catch (java.lang.Exception e) {
            C57570yks.KWHzl.EZpvd("OKDepthChannelBuffer", "parse and merge depth channel data error----->" + e);
            return "";
        }
    }

    public static /* synthetic */ void handleListData$OKNetwork_websocket$default(C57531ykF c57531ykF, java.util.ArrayList arrayList, ComparableArrayList comparableArrayList, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c57531ykF.copydefault(arrayList, comparableArrayList, z);
    }

    public final void copydefault(@NotNull java.util.ArrayList<ComparableArrayList> arrayList, @NotNull ComparableArrayList comparableArrayList, boolean z) {
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(comparableArrayList, "");
        try {
            java.lang.String str = comparableArrayList.get(0);
            Intrinsics.checkNotNullExpressionValue(str, "");
            d = java.lang.Double.parseDouble(str);
        } catch (java.lang.Exception unused) {
            pUU.valueOf("OKDepthChannelBuffer", "getting depth price error will use 0.0");
            d = 0.0d;
        }
        try {
            java.lang.String str2 = comparableArrayList.get(1);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            d2 = java.lang.Double.parseDouble(str2);
        } catch (java.lang.Exception unused2) {
            pUU.valueOf("OKDepthChannelBuffer", "getting depth count error will use 0.0");
            d2 = 0.0d;
        }
        if (z) {
            AEQbTJ(java.util.Arrays.binarySearch(arrayList.toArray(), java.lang.Double.valueOf(d)), d2, arrayList, comparableArrayList, d);
        } else {
            AEQbTJ(C57576yky.AEQbTJ.OLrzqt(arrayList, java.lang.Double.valueOf(d)), d2, arrayList, comparableArrayList, d);
        }
    }

    public final void AEQbTJ(int i, double d, @NotNull java.util.ArrayList<ComparableArrayList> arrayList, @NotNull ComparableArrayList comparableArrayList, double d2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(comparableArrayList, "");
        try {
            if (i >= 0) {
                if (d > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    arrayList.set(i, comparableArrayList);
                } else {
                    Intrinsics.copydefault(arrayList.remove(i));
                }
            } else if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE || d <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            } else {
                arrayList.add(~i, comparableArrayList);
            }
        } catch (java.lang.Exception e) {
            C57570yks.KWHzl.EZpvd("OKDepthChannelBuffer", "depth incremental update data error-> " + e);
        }
    }
}
