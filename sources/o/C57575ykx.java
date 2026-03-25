package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.websocket.bean.OKWSEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57575ykx implements InterfaceC57562ykk {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public int AEQbTJ = -1;
    public java.util.HashMap<java.lang.String, java.lang.Object> KWHzl = new java.util.HashMap<>();
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.Object> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX INFO: renamed from: o.ykx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC57562ykk
    public void EZpvd(@NotNull OKIncomingData oKIncomingData, @NotNull Function1<? super OKIncomingData, Unit> function1, Function2<? super OKWSEvent, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        final java.lang.String str = (java.lang.String) payload;
        AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.ykA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                C57575ykx.OLrzqt(str, this, interfaceC58251yxk);
            }
        }).subscribeOn(C43357rnk.KWHzl.EZpvd(ThreadPoolType.WEBSOCKET)).observeOn(C58266yxz.OLrzqt()).subscribe(new ActionBar(oKIncomingData, function1, function2));
    }

    public static final void OLrzqt(java.lang.String str, C57575ykx c57575ykx, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        try {
            java.lang.Object objAEQbTJ = C33490mxT.AEQbTJ(str);
            C57570yks c57570yks = C57570yks.KWHzl;
            c57570yks.KWHzl("OKDictChannelBuffer", "==receiveIncrementalData===>> payloadData : " + str + ", parseAs:" + (objAEQbTJ != null ? objAEQbTJ.getClass() : null));
            if (!(objAEQbTJ instanceof JsonArray)) {
                if (objAEQbTJ instanceof JsonObject) {
                    c57575ykx.EZpvd((JsonObject) objAEQbTJ);
                    interfaceC58251yxk.onNext(java.lang.Boolean.TRUE);
                    return;
                } else {
                    c57570yks.AEQbTJ("OKDictChannelBuffer", "return jsonObj is out of expect!");
                    interfaceC58251yxk.onNext(java.lang.Boolean.FALSE);
                    return;
                }
            }
            for (JsonElement jsonElement : CollectionsKt___CollectionsKt.AxsJAYsNCnLh((java.lang.Iterable) objAEQbTJ)) {
                if (jsonElement instanceof JsonObject) {
                    c57575ykx.EZpvd((JsonObject) jsonElement);
                } else if (jsonElement instanceof JsonArray) {
                    if (c57575ykx.AEQbTJ < ((JsonArray) jsonElement).size()) {
                        C57570yks.KWHzl.KWHzl("OKDictChannelBuffer", "22222++++>> " + jsonElement);
                        c57575ykx.KWHzl.put(((JsonArray) jsonElement).get(c57575ykx.AEQbTJ).toString(), ((JsonArray) jsonElement).toString());
                    }
                } else {
                    C57570yks.KWHzl.EZpvd("OKDictChannelBuffer", "return jsonObj is out of expect: " + jsonElement.getClass());
                }
            }
            interfaceC58251yxk.onNext(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            interfaceC58251yxk.onNext(java.lang.Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: o.ykx$ActionBar */
    public static final class ActionBar implements InterfaceC58256yxp<java.lang.Boolean> {
        public final /* synthetic */ Function2<OKWSEvent, java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ Function1<OKIncomingData, Unit> OLrzqt;
        public final /* synthetic */ OKIncomingData copydefault;

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
        public ActionBar(OKIncomingData oKIncomingData, Function1<? super OKIncomingData, Unit> function1, Function2<? super OKWSEvent, ? super java.lang.String, Unit> function2) {
            this.copydefault = oKIncomingData;
            this.OLrzqt = function1;
            this.AEQbTJ = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // o.InterfaceC58256yxp
        public /* synthetic */ void onNext(java.lang.Boolean bool) {
            KWHzl(bool.booleanValue());
        }

        public void KWHzl(boolean z) {
            C57570yks.KWHzl.KWHzl("OKDictChannelBuffer", "3333++++>>  bufferMap : " + C57575ykx.this.KWHzl + ", instance: " + C57575ykx.this);
            if (z) {
                this.copydefault.setPayload(C57575ykx.this.KWHzl);
                this.OLrzqt.invoke(this.copydefault);
            } else {
                Function2<OKWSEvent, java.lang.String, Unit> function2 = this.AEQbTJ;
                if (function2 != null) {
                    function2.invoke(OKWSEvent.ERROR, "Dict channel merge data error-1!");
                }
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            Function2<OKWSEvent, java.lang.String, Unit> function2 = this.AEQbTJ;
            if (function2 != null) {
                function2.invoke(OKWSEvent.ERROR, "Dict channel merge data error-2!");
            }
        }
    }

    public final void EZpvd(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get(this.OLrzqt);
        C57570yks.KWHzl.KWHzl("OKDictChannelBuffer", "saveJsonObjectToBuffer++++>>newKey : " + jsonElement + ", jsonObj: " + jsonObject);
        if (jsonElement != null) {
            this.KWHzl.put(jsonElement.toString(), jsonObject.toString());
        }
    }
}
