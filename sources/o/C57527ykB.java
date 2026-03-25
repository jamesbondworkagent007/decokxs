package o;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.bean.OKWSEvent;
import com.okinc.websocket.bean.WSBaseResponse;
import com.okinc.websocket.bean.WSCommonResponse;
import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57564ykm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57527ykB implements InterfaceC57564ykm {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final OKWsDoh AhwBna;
    public final java.util.HashMap<java.lang.String, C57574ykw> EZpvd;
    public final Function0<java.util.List<java.lang.Object>> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX INFO: renamed from: o.ykB$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.HashMap<java.lang.String, java.lang.String>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57564ykm
    public boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57564ykm
    public java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57564ykm
    public OKWsDoh OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57564ykm
    public java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57564ykm
    public boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57527ykB(@NotNull java.lang.String str, boolean z, java.lang.String str2, Function0<? extends java.util.List<? extends java.lang.Object>> function0, boolean z2, @NotNull OKWsDoh oKWsDoh) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKWsDoh, "");
        this.gEmmrt = str;
        this.AYXKKw = z;
        this.valueOf = str2;
        this.djBIcL = function0;
        this.AEQbTJ = z2;
        this.AhwBna = oKWsDoh;
        this.EZpvd = new java.util.HashMap<>();
    }

    @Override // o.InterfaceC57564ykm
    public long KWHzl() {
        return InterfaceC57564ykm.TaskDescription.KWHzl(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (wrap:com.okinc.websocket.connection.OKWsDoh:?: TERNARY null = ((wrap:int:0x0017: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] (LINE:38) com.okinc.websocket.connection.OKWsDoh.V5 com.okinc.websocket.connection.OKWsDoh) : (r15v0 com.okinc.websocket.connection.OKWsDoh))
 A[MD:(java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>>, boolean, com.okinc.websocket.connection.OKWsDoh):void (m)] (LINE:32) call: o.ykB.<init>(java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0, boolean, com.okinc.websocket.connection.OKWsDoh):void type: THIS */
    public /* synthetic */ C57527ykB(java.lang.String str, boolean z, java.lang.String str2, Function0 function0, boolean z2, OKWsDoh oKWsDoh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? OKWsDoh.V5 : oKWsDoh);
    }

    /* JADX INFO: renamed from: o.ykB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ykB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC57564ykm
    public OKWSConnDataParseResult copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            OKWSConnDataParseResult oKWSConnDataParseResult = new OKWSConnDataParseResult();
            WSBaseResponse wSBaseResponse = (WSBaseResponse) C33490mxT.EZpvd(str, WSBaseResponse.class);
            if (wSBaseResponse == null) {
                return null;
            }
            oKWSConnDataParseResult.setConnId(wSBaseResponse.getConnId());
            java.lang.String event = wSBaseResponse.getEvent();
            if (Intrinsics.EZpvd((java.lang.Object) event, (java.lang.Object) this.valueOf)) {
                oKWSConnDataParseResult.setEvent(OKWSEvent.LOGIN);
                C57570yks.KWHzl.KWHzl("OKWSConnectionConfigV5", "event login -->code:" + wSBaseResponse.getCode() + "-->message:" + wSBaseResponse.getMsg() + "-->event:" + wSBaseResponse.getEvent());
            } else if (Intrinsics.EZpvd((java.lang.Object) event, (java.lang.Object) "subscribe")) {
                C57570yks.KWHzl.KWHzl("OKWSConnectionConfigV5", "event sub-->code:" + wSBaseResponse.getCode() + "-->message:" + wSBaseResponse.getMsg() + "-->arg:" + wSBaseResponse.getArg());
                oKWSConnDataParseResult.setEvent(OKWSEvent.SUBSCRIBE);
            } else if (Intrinsics.EZpvd((java.lang.Object) event, (java.lang.Object) "unsubscribe")) {
                C57570yks.KWHzl.KWHzl("OKWSConnectionConfigV5", "event unSub-->code:" + wSBaseResponse.getCode() + "-->message:" + wSBaseResponse.getMsg() + "-->arg:" + wSBaseResponse.getArg());
                oKWSConnDataParseResult.setEvent(OKWSEvent.UNSUBSCRIBE);
            } else if (Intrinsics.EZpvd((java.lang.Object) event, (java.lang.Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                C57570yks.KWHzl.KWHzl("OKWSConnectionConfigV5", "event error-->code:" + wSBaseResponse.getCode() + "-->message:" + wSBaseResponse.getMsg());
                oKWSConnDataParseResult.setEvent(OKWSEvent.ERROR);
                oKWSConnDataParseResult.setError("return data event = error!");
            } else {
                oKWSConnDataParseResult = OLrzqt(str);
                if (oKWSConnDataParseResult == null) {
                    return null;
                }
            }
            return oKWSConnDataParseResult;
        } catch (java.lang.Exception e) {
            C57570yks.KWHzl.AEQbTJ("OKWSConnectionConfigV5", "parse message exception : " + e);
            return null;
        }
    }

    public final OKWSConnDataParseResult OLrzqt(java.lang.String str) {
        WSCommonResponse wSCommonResponse = (WSCommonResponse) C33490mxT.EZpvd(str, WSCommonResponse.class);
        if (wSCommonResponse == null) {
            return null;
        }
        C57570yks c57570yks = C57570yks.KWHzl;
        c57570yks.KWHzl("OKWSConnectionConfigV5", "event normalMessage data-->" + wSCommonResponse + ", event:" + wSCommonResponse.getEvent() + "-->" + wSCommonResponse.getArg());
        OKWSConnDataParseResult oKWSConnDataParseResult = new OKWSConnDataParseResult();
        if (C33129mqd.OLrzqt((java.lang.Object) wSCommonResponse.getCode(), (java.lang.Object) 0)) {
            if (wSCommonResponse.getData() != null) {
                java.lang.Object arg = wSCommonResponse.getArg();
                if (arg == null) {
                    arg = "";
                }
                java.util.HashMap map = (java.util.HashMap) C33490mxT.KWHzl(C33490mxT.OLrzqt(arg), new TaskDescription());
                JsonElement data = wSCommonResponse.getData();
                Intrinsics.copydefault(data);
                OKIncomingData oKIncomingData = new OKIncomingData(map, C33490mxT.OLrzqt(data));
                oKIncomingData.setAction(wSCommonResponse.getAction());
                oKIncomingData.setOriginMsg(str);
                c57570yks.KWHzl("OKWSConnectionConfigV5", "dealNormalMessage incomingData source --> :" + map);
                oKWSConnDataParseResult.setEvent(OKWSEvent.DATA);
                oKWSConnDataParseResult.setIncomingData(oKIncomingData);
            } else {
                c57570yks.AEQbTJ("OKWSConnectionConfigV5", "event normalMessage empty-->" + wSCommonResponse.getEvent() + "-->" + wSCommonResponse.getArg());
                oKWSConnDataParseResult.setEvent(OKWSEvent.ERROR);
                oKWSConnDataParseResult.setError("return data.data is empty!!!");
            }
        } else {
            c57570yks.AEQbTJ("OKWSConnectionConfigV5", "event normalMessage error->>code:" + wSCommonResponse.getCode() + "-->message:" + wSCommonResponse.getMsg());
            oKWSConnDataParseResult.setEvent(OKWSEvent.ERROR);
            oKWSConnDataParseResult.setError("return data code is: " + wSCommonResponse.getCode());
        }
        return oKWSConnDataParseResult;
    }

    @Override // o.InterfaceC57564ykm
    public AbstractC57561ykj KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57574ykw c57574ykw = this.EZpvd.get(str);
        if (c57574ykw == null) {
            c57574ykw = new C57574ykw();
        }
        return new C57577ykz(str, c57574ykw);
    }

    public final C57574ykw EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.get(str);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull C57574ykw c57574ykw) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c57574ykw, "");
        this.EZpvd.put(str, c57574ykw);
    }

    @Override // o.InterfaceC57564ykm
    public void AEQbTJ(OKIncomingData oKIncomingData, @NotNull java.util.Map<java.lang.String, ? extends AbstractC57561ykj> map) {
        java.util.HashMap<java.lang.String, java.lang.String> source;
        AbstractC57561ykj abstractC57561ykj;
        Intrinsics.checkNotNullParameter(map, "");
        if (oKIncomingData == null || (source = oKIncomingData.getSource()) == null || (abstractC57561ykj = map.get(source.get(AppsFlyerProperties.CHANNEL))) == null) {
            return;
        }
        abstractC57561ykj.EZpvd(oKIncomingData);
    }

    @Override // o.InterfaceC57564ykm
    public java.util.List<java.lang.Object> AEQbTJ() {
        Function0<java.util.List<java.lang.Object>> function0 = this.djBIcL;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }
}
