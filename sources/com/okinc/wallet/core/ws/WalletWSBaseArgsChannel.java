package com.okinc.wallet.core.ws;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.Expose;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.TaskDescription;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonObject;
import o.C56403yEb;
import o.C57576yky;
import o.InterfaceC57559ykh;
import o.xZA;
import o.xZF;
import o.xZR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class WalletWSBaseArgsChannel<T extends StateListAnimator, R extends TaskDescription> extends xZF<R> {
    public final HashMap<String, List<WsArgV5ForWallet>> AEQbTJ;
    public final String KWHzl;

    public static abstract class TaskDescription extends xZF.ActionBar {
        public static final int $stable = 0;

        public abstract String getMSubArgsUniqueId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletWSBaseArgsChannel(@NotNull String str, boolean z, long j, @NotNull DeserializationStrategy<? extends R> deserializationStrategy, @NotNull xZR xzr) {
        super(str, z, true, j, deserializationStrategy, xzr);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(xzr, "");
        this.KWHzl = "WalletWSBaseArgsChannel";
        this.AEQbTJ = new HashMap<>();
    }

    public final void copydefault(@NotNull Application<T, R> application) {
        Intrinsics.checkNotNullParameter(application, "");
        super.AEQbTJ(application);
    }

    @Override // o.xZF
    public void KWHzl(@NotNull xZF.TaskDescription<R> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.KWHzl(taskDescription);
        if (taskDescription instanceof Application) {
            Application application = (Application) taskDescription;
            List<T> listCopydefault = application.copydefault();
            if (listCopydefault == null || listCopydefault.isEmpty()) {
                this.AEQbTJ.remove(application.AhwBna());
            } else {
                HashMap<String, List<WsArgV5ForWallet>> map = this.AEQbTJ;
                String strAhwBna = application.AhwBna();
                List<? extends T> listCopydefault2 = application.copydefault();
                Intrinsics.copydefault(listCopydefault2, "");
                map.put(strAhwBna, KWHzl(listCopydefault2));
            }
            OLrzqt();
        }
    }

    @Override // o.xZF
    public void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.remove(str);
        super.copydefault(str);
        if (KWHzl().KWHzl()) {
            OLrzqt();
        } else {
            this.AEQbTJ.clear();
            KWHzl().gEmmrt().clear();
        }
    }

    public final void OLrzqt() {
        Object next;
        Object next2;
        ArrayList<InterfaceC57559ykh> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, List<WsArgV5ForWallet>>> it = this.AEQbTJ.entrySet().iterator();
        while (it.hasNext()) {
            for (WsArgV5ForWallet wsArgV5ForWallet : it.next().getValue()) {
                Iterator<T> it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) wsArgV5ForWallet.getUniqueKey(), (Object) ((InterfaceC57559ykh) next2).getUniqueKey())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 == null) {
                    arrayList.add(wsArgV5ForWallet);
                }
            }
        }
        if (arrayList.size() == KWHzl().gEmmrt().size()) {
            for (InterfaceC57559ykh interfaceC57559ykh : arrayList) {
                Iterator<T> it3 = KWHzl().gEmmrt().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.EZpvd((Object) interfaceC57559ykh.getUniqueKey(), (Object) ((InterfaceC57559ykh) next).getUniqueKey())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next == null) {
                }
            }
            return;
        }
        KWHzl().AEQbTJ(arrayList);
    }

    public static abstract class StateListAnimator {
        public String AEQbTJ() {
            return null;
        }

        public abstract String KWHzl();

        public abstract String OLrzqt();

        public abstract String copydefault();

        public final WsArgV5ForWallet KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WsArgV5ForWallet(str, KWHzl(), AEQbTJ(), null, OLrzqt(), null, 40, null);
        }
    }

    public static final class WsArgV5ForWallet extends WsSubscribeArgV5 {
        public static final int $stable = 8;
        private String chainIndex;
        private String instId;
        private String tokenContractAddress;

        @Expose(serialize = false)
        private String uniqueKey;
        private String walletAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWalletAddress() {
            return this.walletAddress;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 kotlinx.serialization.json.JsonObject) : (null kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:146) call: com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.WsArgV5ForWallet.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
        public /* synthetic */ WsArgV5ForWallet(String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? jsonObject : null);
        }

        public WsArgV5ForWallet(@NotNull String str, String str2, String str3, String str4, String str5, JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uniqueKey = "";
            setChannel(str);
            this.instId = str2;
            this.chainIndex = str3;
            this.tokenContractAddress = str4;
            this.walletAddress = str5;
            if (jsonObject != null) {
                setExtraParams(jsonObject.toString());
            }
        }

        @Override // o.InterfaceC57559ykh
        public String getUniqueKey() {
            if (this.uniqueKey.length() == 0) {
                this.uniqueKey = C57576yky.AEQbTJ.copydefault(getChannel(), this.instId, this.chainIndex, this.tokenContractAddress, this.walletAddress);
            }
            return this.uniqueKey;
        }

        @Override // o.InterfaceC57559ykh
        public String getUniqueKeyByResponse(HashMap<String, String> map) {
            if (map == null) {
                return "";
            }
            C57576yky c57576yky = C57576yky.AEQbTJ;
            String str = map.get(AppsFlyerProperties.CHANNEL);
            return c57576yky.copydefault(str != null ? str : "", map.get("instId"), map.get("chainIndex"), map.get("tokenContractAddress"), map.get("walletAddress"));
        }
    }

    public static abstract class Application<T extends StateListAnimator, R extends TaskDescription> extends xZF.TaskDescription<R> {
        public final List<T> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<T> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:o.xZA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.xZA) : (r3v0 o.xZA))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, o.xZA, java.util.List<? extends T extends com.okinc.wallet.core.ws.WalletWSBaseArgsChannel$StateListAnimator>):void (m)] (LINE:199) call: com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.Application.<init>(java.lang.String, o.xZA, java.util.List):void type: THIS */
        public /* synthetic */ Application(String str, xZA xza, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : xza, (i & 4) != 0 ? null : list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends T extends com.okinc.wallet.core.ws.WalletWSBaseArgsChannel$StateListAnimator> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull String str, xZA xza, List<? extends T> list) {
            super(str, xza);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = list;
        }

        @Override // o.xZF.TaskDescription
        public void copydefault(@NotNull List<? extends R> list) {
            Object next;
            Intrinsics.checkNotNullParameter(list, "");
            List<T> list2 = this.AEQbTJ;
            if (list2 == null || list2.isEmpty()) {
                super.copydefault(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TaskDescription taskDescription = (TaskDescription) obj;
                Iterator<T> it = this.AEQbTJ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((StateListAnimator) next).copydefault(), (Object) taskDescription.getMSubArgsUniqueId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(obj);
                }
            }
            super.copydefault(arrayList);
        }
    }

    public final List<WsArgV5ForWallet> KWHzl(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StateListAnimator) it.next()).KWHzl(EZpvd()));
        }
        return arrayList;
    }
}
