package com.okinc.common.okcore.net.websocket;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.common.okcore.net.websocket.OKCoreWsFactoryImpl;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.websocket.connection.OKWsDoh;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AZM;
import o.AZX;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.AbstractC57572yku;
import o.C33490mxT;
import o.C4358BcB;
import o.C4366BcJ;
import o.C4367BcK;
import o.C4369BcM;
import o.C4408Bcz;
import o.C56403yEb;
import o.C56424yEw;
import o.C56427yEz;
import o.C57527ykB;
import o.C57554ykc;
import o.C57567ykp;
import o.C57571ykt;
import o.C57573ykv;
import o.C57574ykw;
import o.InterfaceC4285Bai;
import o.InterfaceC4325BbV;
import o.InterfaceC4354Bby;
import o.InterfaceC4388Bcf;
import o.InterfaceC57559ykh;
import o.pUU;
import o.yEE;
import o.yEJ;
import o.yET;
import org.jetbrains.annotations.NotNull;
import uniffi.network.WsConnectionState;
import uniffi.network.WsDoh;
import uniffi.network.WsListenerKind;

/* JADX INFO: loaded from: classes7.dex */
public final class OKCoreWsFactoryImpl implements InterfaceC4354Bby {

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WsDoh.values().length];
            try {
                iArr[WsDoh.CEFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WsDoh.WEB3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.InterfaceC4354Bby
    public AZX EZpvd(@NotNull C4367BcK c4367BcK, @NotNull C4358BcB c4358BcB) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        Intrinsics.checkNotNullParameter(c4358BcB, "");
        String strOLrzqt = c4358BcB.OLrzqt();
        boolean zAhwBna = c4367BcK.AhwBna();
        String strDjBIcL = c4367BcK.djBIcL();
        final String strKWHzl = c4358BcB.KWHzl();
        return new Activity(new C57567ykp(new C57527ykB(strOLrzqt, zAhwBna, strDjBIcL, strKWHzl != null ? new Function0() { // from class: o.mgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKCoreWsFactoryImpl.EZpvd(strKWHzl);
            }
        } : null, c4367BcK.copydefault(), KWHzl(c4367BcK.OLrzqt()))), WsListenerKind.NORMAL);
    }

    public static final List EZpvd(String str) {
        return C33490mxT.AEQbTJ(str, Object.class);
    }

    @Override // o.InterfaceC4354Bby
    public AZX AEQbTJ(@NotNull C4367BcK c4367BcK, @NotNull C4358BcB c4358BcB) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        Intrinsics.checkNotNullParameter(c4358BcB, "");
        String strOLrzqt = c4358BcB.OLrzqt();
        Map<String, String> mapKWHzl = c4367BcK.KWHzl();
        return new Activity(new C57573ykv(new C57571ykt(strOLrzqt, mapKWHzl != null ? C56424yEw.isConnected(mapKWHzl) : null, c4367BcK.copydefault(), KWHzl(c4367BcK.OLrzqt()))), WsListenerKind.SIMPLIFIED);
    }

    public final OKWsDoh KWHzl(WsDoh wsDoh) {
        int i = StateListAnimator.copydefault[wsDoh.ordinal()];
        if (i == 1) {
            return OKWsDoh.V5;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OKWsDoh.DEXPRI;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements AZX {
        public final WsListenerKind AEQbTJ;
        public final C57567ykp copydefault;

        /* JADX INFO: loaded from: classes23.dex */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WsListenerKind.values().length];
                try {
                    iArr[WsListenerKind.NORMAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WsListenerKind.SIMPLIFIED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AZX
        public WsListenerKind OLrzqt() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull C57567ykp c57567ykp, @NotNull WsListenerKind wsListenerKind) {
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            Intrinsics.checkNotNullParameter(wsListenerKind, "");
            this.copydefault = c57567ykp;
            this.AEQbTJ = wsListenerKind;
        }

        @Override // o.AZX
        public InterfaceC4285Bai AEQbTJ(@NotNull String str, @NotNull List<C4408Bcz> list, @NotNull InterfaceC4388Bcf interfaceC4388Bcf, @NotNull InterfaceC4325BbV interfaceC4325BbV) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC4388Bcf, "");
            Intrinsics.checkNotNullParameter(interfaceC4325BbV, "");
            int i = ActionBar.OLrzqt[this.AEQbTJ.ordinal()];
            if (i == 1) {
                return new TaskDescription(str, list, interfaceC4388Bcf, interfaceC4325BbV, this.copydefault);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C57567ykp c57567ykp = this.copydefault;
            Intrinsics.copydefault(c57567ykp, "");
            return new Application(interfaceC4388Bcf, interfaceC4325BbV, (C57573ykv) c57567ykp);
        }

        @Override // o.AZX
        public void copydefault() {
            this.copydefault.uzCIH();
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    @JsonAdapter(CoreBridgeWsArgV5Serializer.class)
    public static final class ActionBar extends WsSubscribeArgV5 {
        public final String EZpvd;

        public static final class TaskDescription<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
            }
        }

        public ActionBar(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str2;
            setChannel(str);
            setExtraParams(str2);
        }

        @Override // o.InterfaceC57559ykh
        public String getUniqueKey() {
            Pair<Map<String, Object>, Set<String>> pairOLrzqt = OLrzqt(this.EZpvd);
            return copydefault(getChannel(), pairOLrzqt.component1(), yEJ.OLrzqt(pairOLrzqt.component2(), AppsFlyerProperties.CHANNEL));
        }

        @Override // o.InterfaceC57559ykh
        public String getUniqueKeyByResponse(HashMap<String, String> map) {
            if (map == null) {
                return getChannel();
            }
            HashMap map2 = new HashMap(map);
            String channel = (String) map2.remove(AppsFlyerProperties.CHANNEL);
            if (channel == null) {
                channel = getChannel();
            }
            return copydefault(channel, map2, yEE.copydefault());
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:2:0x0000, B:4:0x0006, B:11:0x001f, B:13:0x0025, B:16:0x002d, B:18:0x0040, B:25:0x0053, B:27:0x0059, B:35:0x007d, B:34:0x0079, B:22:0x0047), top: B:43:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair<Map<String, Object>, Set<String>> OLrzqt(String str) {
            JsonElement jsonElement;
            Map mapKWHzl;
            Set setCopydefault;
            try {
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
                if (jsonObjectOLrzqt == null) {
                    return new Pair<>(C56424yEw.KWHzl(), yEE.copydefault());
                }
                JsonElement jsonElement2 = null;
                try {
                    jsonElement = jsonObjectOLrzqt.get("fields");
                } catch (Throwable unused) {
                    jsonElement = null;
                }
                JsonObject asJsonObject = (jsonElement == null || !jsonElement.isJsonObject()) ? null : jsonElement.getAsJsonObject();
                if (asJsonObject != null) {
                    String string = asJsonObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Object objEZpvd = C33490mxT.EZpvd(string, (Class<Object>) HashMap.class);
                    mapKWHzl = objEZpvd instanceof HashMap ? (HashMap) objEZpvd : null;
                    if (mapKWHzl == null) {
                        mapKWHzl = C56424yEw.KWHzl();
                    }
                }
                try {
                    jsonElement2 = jsonObjectOLrzqt.get("excludeKeys");
                } catch (Throwable unused2) {
                }
                if (jsonElement2 != null && jsonElement2.isJsonArray()) {
                    JsonArray asJsonArray = jsonElement2.getAsJsonArray();
                    setCopydefault = new LinkedHashSet();
                    int size = asJsonArray.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            String asString = asJsonArray.get(i).getAsString();
                            if (asString != null) {
                                setCopydefault.add(asString);
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                } else {
                    setCopydefault = yEE.copydefault();
                }
                return new Pair<>(mapKWHzl, setCopydefault);
            } catch (Throwable unused4) {
                return new Pair<>(C56424yEw.KWHzl(), yEE.copydefault());
            }
        }

        public static final CharSequence AEQbTJ(Pair pair) {
            String string;
            String str = "";
            Intrinsics.checkNotNullParameter(pair, "");
            String str2 = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 != null && (string = objComponent2.toString()) != null) {
                str = string;
            }
            return str2 + ContainerUtils.KEY_VALUE_DELIMITER + str;
        }

        public final String copydefault(String str, Map<String, ? extends Object> map, Set<String> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (!set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (map.isEmpty() || linkedHashMap.isEmpty()) {
                return str;
            }
            return str + "@" + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(C56427yEz.AkhnZx(linkedHashMap), new TaskDescription()), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, new Function1() { // from class: o.mgd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKCoreWsFactoryImpl.ActionBar.AEQbTJ((kotlin.Pair) obj);
                }
            }, 30, null);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC4285Bai {
        public final InterfaceC4388Bcf AEQbTJ;
        public final List<C4408Bcz> AhwBna;
        public AbstractC57556yke EZpvd;
        public final String KWHzl;
        public final C57567ykp OLrzqt;
        public final InterfaceC4325BbV copydefault;

        /* JADX INFO: loaded from: classes23.dex */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[OKWsConnectionState.values().length];
                try {
                    iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OKWsConnectionState.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        @Override // o.InterfaceC4285Bai
        public AZM AEQbTJ() {
            return null;
        }

        public TaskDescription(@NotNull String str, @NotNull List<C4408Bcz> list, @NotNull InterfaceC4388Bcf interfaceC4388Bcf, @NotNull InterfaceC4325BbV interfaceC4325BbV, @NotNull C57567ykp c57567ykp) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC4388Bcf, "");
            Intrinsics.checkNotNullParameter(interfaceC4325BbV, "");
            Intrinsics.checkNotNullParameter(c57567ykp, "");
            this.KWHzl = str;
            this.AhwBna = list;
            this.AEQbTJ = interfaceC4388Bcf;
            this.copydefault = interfaceC4325BbV;
            this.OLrzqt = c57567ykp;
        }

        @Override // o.InterfaceC4285Bai
        public WsListenerKind EZpvd() {
            return WsListenerKind.NORMAL;
        }

        @Override // o.InterfaceC4285Bai
        public void KWHzl() {
            pUU.EZpvd("Ws-Native", "try to start listener");
            C57567ykp c57567ykp = this.OLrzqt;
            List<C4408Bcz> list = this.AhwBna;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(EZpvd((C4408Bcz) it.next()));
            }
            AbstractC57556yke abstractC57556ykeEZpvd = C57554ykc.Companion.EZpvd(this.KWHzl, c57567ykp, new ArrayList<>(arrayList), new C57574ykw(), new Function1() { // from class: o.mge
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKCoreWsFactoryImpl.TaskDescription.copydefault(this.copydefault, (OKWsConnectionState) obj);
                }
            }, new Function2() { // from class: o.mgg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return OKCoreWsFactoryImpl.TaskDescription.AEQbTJ(this.copydefault, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.EZpvd = abstractC57556ykeEZpvd;
            pUU.EZpvd("Ws-Native", "try to start listener: " + abstractC57556ykeEZpvd);
            AbstractC57556yke abstractC57556yke = this.EZpvd;
            if (abstractC57556yke != null) {
                abstractC57556yke.AhwBna();
            }
        }

        public static final Unit copydefault(TaskDescription taskDescription, OKWsConnectionState oKWsConnectionState) {
            Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
            taskDescription.AEQbTJ.AEQbTJ(taskDescription.EZpvd(oKWsConnectionState));
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(TaskDescription taskDescription, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            pUU.EZpvd("Ws-Native", "receive message:" + oKIncomingData + ", listener: " + taskDescription.EZpvd);
            String originMsg = oKIncomingData.getOriginMsg();
            if (originMsg == null) {
                originMsg = C33490mxT.OLrzqt(oKIncomingData.getPayload());
            }
            taskDescription.copydefault.AEQbTJ(new C4366BcJ(oKIncomingData.getSource(), originMsg));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC4285Bai
        public void OLrzqt() {
            AbstractC57556yke abstractC57556yke = this.EZpvd;
            if (abstractC57556yke != null) {
                abstractC57556yke.djBIcL();
            }
        }

        public final InterfaceC57559ykh EZpvd(C4408Bcz c4408Bcz) {
            C4369BcM c4369BcMEZpvd = c4408Bcz.EZpvd();
            HashMap map = new HashMap();
            map.put("fields", c4369BcMEZpvd.EZpvd());
            List<String> listCopydefault = c4369BcMEZpvd.copydefault();
            if (listCopydefault != null) {
                map.put("excludeKeys", listCopydefault);
            }
            return new ActionBar(c4408Bcz.AEQbTJ(), C33490mxT.OLrzqt(map));
        }

        public final WsConnectionState EZpvd(OKWsConnectionState oKWsConnectionState) {
            int i = Application.AEQbTJ[oKWsConnectionState.ordinal()];
            if (i == 1) {
                return WsConnectionState.OPEN;
            }
            if (i == 2) {
                return WsConnectionState.CLOSED;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return WsConnectionState.FAILURE;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application implements InterfaceC4285Bai, AZM {
        public final InterfaceC4325BbV AEQbTJ;
        public final C57573ykv KWHzl;
        public final InterfaceC4388Bcf OLrzqt;
        public AbstractC57572yku copydefault;

        /* JADX INFO: loaded from: classes23.dex */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[OKWsConnectionState.values().length];
                try {
                    iArr[OKWsConnectionState.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OKWsConnectionState.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OKWsConnectionState.FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        @Override // o.InterfaceC4285Bai
        public AZM AEQbTJ() {
            return this;
        }

        public Application(@NotNull InterfaceC4388Bcf interfaceC4388Bcf, @NotNull InterfaceC4325BbV interfaceC4325BbV, @NotNull C57573ykv c57573ykv) {
            Intrinsics.checkNotNullParameter(interfaceC4388Bcf, "");
            Intrinsics.checkNotNullParameter(interfaceC4325BbV, "");
            Intrinsics.checkNotNullParameter(c57573ykv, "");
            this.OLrzqt = interfaceC4388Bcf;
            this.AEQbTJ = interfaceC4325BbV;
            this.KWHzl = c57573ykv;
        }

        @Override // o.InterfaceC4285Bai
        public WsListenerKind EZpvd() {
            return WsListenerKind.SIMPLIFIED;
        }

        @Override // o.InterfaceC4285Bai
        public void KWHzl() {
            AbstractC57572yku abstractC57572ykuOLrzqt = C57554ykc.Companion.OLrzqt(this.KWHzl, new Function1() { // from class: o.mgf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKCoreWsFactoryImpl.Application.KWHzl(this.OLrzqt, (OKWsConnectionState) obj);
                }
            }, new Function2() { // from class: o.mgi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return OKCoreWsFactoryImpl.Application.OLrzqt(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.copydefault = abstractC57572ykuOLrzqt;
            if (abstractC57572ykuOLrzqt != null) {
                abstractC57572ykuOLrzqt.AhwBna();
            }
        }

        public static final Unit KWHzl(Application application, OKWsConnectionState oKWsConnectionState) {
            Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
            application.OLrzqt.AEQbTJ(application.KWHzl(oKWsConnectionState));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(Application application, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
            Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
            Intrinsics.checkNotNullParameter(oKIncomingData, "");
            String originMsg = oKIncomingData.getOriginMsg();
            if (originMsg == null) {
                originMsg = C33490mxT.OLrzqt(oKIncomingData.getPayload());
            }
            application.AEQbTJ.AEQbTJ(new C4366BcJ(oKIncomingData.getSource(), originMsg));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC4285Bai
        public void OLrzqt() {
            AbstractC57572yku abstractC57572yku = this.copydefault;
            if (abstractC57572yku != null) {
                abstractC57572yku.djBIcL();
            }
        }

        private final WsConnectionState KWHzl(OKWsConnectionState oKWsConnectionState) {
            int i = TaskDescription.EZpvd[oKWsConnectionState.ordinal()];
            if (i == 1) {
                return WsConnectionState.OPEN;
            }
            if (i == 2) {
                return WsConnectionState.CLOSED;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return WsConnectionState.FAILURE;
        }

        @Override // o.AZM
        public void EZpvd(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            for (String str : list) {
                AbstractC57572yku abstractC57572yku = this.copydefault;
                if (abstractC57572yku != null) {
                    abstractC57572yku.copydefault(str);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class CoreBridgeWsArgV5Serializer implements JsonSerializer<ActionBar> {
        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement; */
        @Override // com.google.gson.JsonSerializer
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(@NotNull ActionBar actionBar, @NotNull Type type, @NotNull JsonSerializationContext jsonSerializationContext) {
            JsonElement jsonElement;
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(jsonSerializationContext, "");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(AppsFlyerProperties.CHANNEL, actionBar.getChannel());
            String extraParams = actionBar.getExtraParams();
            if (extraParams != null && !StringsKt__StringsKt.fARcdN((CharSequence) extraParams)) {
                try {
                    JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(extraParams);
                    if (jsonObjectOLrzqt != null) {
                        for (Map.Entry<String, JsonElement> entry : jsonObjectOLrzqt.entrySet()) {
                            Intrinsics.copydefault(entry);
                            String key = entry.getKey();
                            JsonElement value = entry.getValue();
                            if (!Intrinsics.EZpvd((Object) key, (Object) AppsFlyerProperties.CHANNEL) && !Intrinsics.EZpvd((Object) key, (Object) "fields") && !Intrinsics.EZpvd((Object) key, (Object) "excludeKeys")) {
                                jsonObject.add(key, value);
                            }
                        }
                        try {
                            jsonElement = jsonObjectOLrzqt.get("fields");
                        } catch (Throwable unused) {
                            jsonElement = null;
                        }
                        if (jsonElement != null && jsonElement.isJsonObject()) {
                            for (Map.Entry<String, JsonElement> entry2 : jsonElement.getAsJsonObject().entrySet()) {
                                Intrinsics.copydefault(entry2);
                                String key2 = entry2.getKey();
                                JsonElement value2 = entry2.getValue();
                                if (!Intrinsics.EZpvd((Object) key2, (Object) AppsFlyerProperties.CHANNEL)) {
                                    jsonObject.add(key2, value2);
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            return jsonObject;
        }
    }
}
