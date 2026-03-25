package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import o.C57554ykc;
import o.xZA;
import o.xZF;
import o.xZF.ActionBar;
import o.xZR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xZF<R extends ActionBar> {
    public final xZR AYXKKw;
    public final DeserializationStrategy<R> AhwBna;
    public final Application AkhnZx;
    public java.lang.String AuCTel;
    public final StateListAnimator DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;
    public final android.os.Handler djBIcL;
    public R ejfBZ;
    public final long fARcdN;
    public final xZA fIwbmz;
    public final ConcurrentHashMap<java.lang.String, R> fJNWhG;
    public final AbstractC57556yke fetchVPNInfo;
    public final boolean gEmmrt;
    public final boolean isConnected;
    public final android.os.Handler valueOf;
    public final java.util.ArrayList<TaskDescription<R>> values;

    public static abstract class ActionBar {
        public static final int $stable = 8;
        private java.lang.String originData = "";

        public abstract java.lang.String getMAddress();

        public abstract java.lang.String getMUniqueId();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String getOriginData() {
            return this.originData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOriginData(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.originData = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<TaskDescription<R>> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC57556yke KWHzl() {
        return this.fetchVPNInfo;
    }

    public abstract boolean OLrzqt(@NotNull java.util.List<? extends R> list);

    /* JADX DEBUG: Class process forced to load method for inline: o.xZR.getWSConnection$default(o.xZR, boolean, boolean, boolean, int, java.lang.Object):o.ykp */
    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: kotlinx.serialization.DeserializationStrategy<? extends R extends o.xZF$ActionBar> */
    /* JADX WARN: Multi-variable type inference failed */
    public xZF(@NotNull java.lang.String str, boolean z, boolean z2, long j, @NotNull DeserializationStrategy<? extends R> deserializationStrategy, @NotNull xZR xzr) {
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayListCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(xzr, "");
        this.EZpvd = str;
        this.isConnected = z;
        this.gEmmrt = z2;
        this.fARcdN = j;
        this.AhwBna = deserializationStrategy;
        this.AYXKKw = xzr;
        this.copydefault = getClass().getSimpleName();
        this.AuCTel = "";
        this.fJNWhG = new ConcurrentHashMap<>();
        this.DbNXlk = new StateListAnimator(this);
        C57554ykc.Application application = C57554ykc.Companion;
        C57567ykp wSConnection$default = xZR.getWSConnection$default(xzr, z, false, false, 4, null);
        if (z2) {
            arrayListCopydefault = new java.util.ArrayList<>();
        } else {
            arrayListCopydefault = yDY.copydefault(new WsArgV5ForWeb3(str, null, null, null, null, 30, null));
        }
        this.fetchVPNInfo = application.AEQbTJ(str, wSConnection$default, arrayListCopydefault, new Function2() { // from class: o.xZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return xZF.KWHzl(this.OLrzqt, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
        this.djBIcL = new android.os.Handler(android.os.Looper.getMainLooper());
        this.valueOf = new android.os.Handler(android.os.Looper.getMainLooper());
        this.values = new java.util.ArrayList<>();
        AbstractC58253yxm abstractC58253yxmAEQbTJ = yBP.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmAEQbTJ, "");
        this.fIwbmz = new xZA(0L, j, abstractC58253yxmAEQbTJ);
        this.AkhnZx = new Application(this);
    }

    public static final class StateListAnimator implements xZR.StateListAnimator {
        public final /* synthetic */ xZF<R> KWHzl;

        public StateListAnimator(xZF<R> xzf) {
            this.KWHzl = xzf;
        }

        @Override // o.xZR.StateListAnimator
        public void AEQbTJ(boolean z) {
            if (!(!this.KWHzl.AEQbTJ().isEmpty()) || this.KWHzl.KWHzl().KWHzl()) {
                return;
            }
            this.KWHzl.KWHzl().AhwBna();
        }
    }

    public static final Unit KWHzl(xZF xzf, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            xzf.fIwbmz.KWHzl(true);
            java.lang.String string = oKIncomingData.getPayload().toString();
            xzf.AuCTel = string;
            if (!C59449zhJ.startsWith$default(string, "[", false, 2, null)) {
                R r = (R) C33489mxS.KWHzl.OLrzqt(xzf.AhwBna, xzf.AuCTel);
                xzf.ejfBZ = r;
                Intrinsics.copydefault(r);
                r.setOriginData(xzf.AuCTel);
                ConcurrentHashMap<java.lang.String, R> concurrentHashMap = xzf.fJNWhG;
                R r2 = xzf.ejfBZ;
                Intrinsics.copydefault(r2);
                java.lang.String mUniqueId = r2.getMUniqueId();
                R r3 = xzf.ejfBZ;
                Intrinsics.copydefault(r3);
                concurrentHashMap.put(mUniqueId, r3);
            } else {
                for (JsonElement jsonElement : JsonElementKt.getJsonArray(C33489mxS.KWHzl.AEQbTJ().parseToJsonElement(xzf.AuCTel))) {
                    R r4 = (R) C33489mxS.KWHzl.OLrzqt(xzf.AhwBna, jsonElement.toString());
                    xzf.ejfBZ = r4;
                    Intrinsics.copydefault(r4);
                    r4.setOriginData(jsonElement.toString());
                    ConcurrentHashMap<java.lang.String, R> concurrentHashMap2 = xzf.fJNWhG;
                    R r5 = xzf.ejfBZ;
                    Intrinsics.copydefault(r5);
                    java.lang.String mUniqueId2 = r5.getMUniqueId();
                    R r6 = xzf.ejfBZ;
                    Intrinsics.copydefault(r6);
                    concurrentHashMap2.put(mUniqueId2, r6);
                }
            }
            if (xzf.fIwbmz.copydefault()) {
                if (!xzf.fIwbmz.KWHzl()) {
                    xzf.fIwbmz.EZpvd();
                }
            } else {
                xzf.AhwBna();
            }
        } catch (java.lang.Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements xZA.ActionBar {
        public final /* synthetic */ xZF<R> AEQbTJ;

        public Application(xZF<R> xzf) {
            this.AEQbTJ = xzf;
        }

        @Override // o.xZA.ActionBar
        public void KWHzl(xZA xza) {
            Intrinsics.checkNotNullParameter(xza, "");
            this.AEQbTJ.AhwBna();
        }
    }

    public final void AhwBna() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.isConnected) {
            java.util.Collection<R> collectionValues = this.fJNWhG.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            for (R r : collectionValues) {
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) this.AYXKKw.KWHzl()), r.getMAddress())) {
                    arrayList.add(r);
                }
            }
        } else {
            arrayList.addAll(this.fJNWhG.values());
        }
        this.fJNWhG.clear();
        if (OLrzqt(arrayList)) {
            return;
        }
        notifySubListener$default(this, arrayList, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xZF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void notifySubListener$default(xZF xzf, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifySubListener");
        }
        if ((i & 2) != 0) {
            list2 = xzf.values;
        }
        xzf.djBIcL(list, list2);
    }

    public static final Unit copydefault(java.util.List list, java.util.List list2) {
        OLrzqt(list, list2);
        return Unit.INSTANCE;
    }

    public void djBIcL(@NotNull final java.util.List<? extends R> list, @NotNull final java.util.List<? extends TaskDescription<R>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AEQbTJ(new Function0() { // from class: o.xZO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZF.copydefault(list2, list);
            }
        });
    }

    public final void AEQbTJ(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            function0.invoke();
        } else {
            this.djBIcL.post(new java.lang.Runnable() { // from class: o.xZL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    xZF.OLrzqt(function0);
                }
            });
        }
    }

    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }

    public static final Unit EZpvd(xZF xzf, TaskDescription taskDescription) {
        xzf.KWHzl(taskDescription);
        return Unit.INSTANCE;
    }

    public void AEQbTJ(@NotNull final TaskDescription<R> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AEQbTJ(new Function0() { // from class: o.xZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZF.EZpvd(this.KWHzl, taskDescription);
            }
        });
    }

    public final void OLrzqt(@NotNull TaskDescription<R> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        OLrzqt(taskDescription.AhwBna());
    }

    public static final Unit OLrzqt(xZF xzf, java.lang.String str) {
        xzf.copydefault(str);
        return Unit.INSTANCE;
    }

    public void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(new Function0() { // from class: o.xZJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZF.OLrzqt(this.AEQbTJ, str);
            }
        });
    }

    public static final void KWHzl(xZF xzf) {
        xzf.fetchVPNInfo.AhwBna();
    }

    public final boolean copydefault() {
        return (this.isConnected && this.AYXKKw.KWHzl().isEmpty()) ? false : true;
    }

    public static abstract class TaskDescription<R extends ActionBar> {
        public boolean AYXKKw;
        public final java.lang.String AkhnZx;
        public final InterfaceC56387yDm DbNXlk;
        public xZA fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final Activity isConnected;
        public ActionBar<R> valueOf;

        public interface ActionBar<R> {
            void copydefault(@NotNull java.util.List<? extends R> list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(@NotNull java.util.List<? extends R> list) {
            Intrinsics.checkNotNullParameter(list, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ActionBar<R> actionBar) {
            this.valueOf = actionBar;
        }

        public TaskDescription(@NotNull java.lang.String str, xZA xza) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AkhnZx = str;
            this.fetchVPNInfo = xza;
            this.gEmmrt = "WalletWSSubListener";
            this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.xZQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xZF.TaskDescription.EZpvd();
                }
            });
            this.isConnected = new Activity(this);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:o.xZA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.xZA) : (r2v0 o.xZA))
 A[MD:(java.lang.String, o.xZA):void (m)] (LINE:230) call: o.xZF.TaskDescription.<init>(java.lang.String, o.xZA):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, xZA xza, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : xza);
        }

        public final java.util.ArrayList<R> KWHzl() {
            return (java.util.ArrayList) this.DbNXlk.getValue();
        }

        public static final java.util.ArrayList EZpvd() {
            return new java.util.ArrayList();
        }

        public static final class Activity implements xZA.ActionBar {
            public final /* synthetic */ TaskDescription<R> copydefault;

            public Activity(TaskDescription<R> taskDescription) {
                this.copydefault = taskDescription;
            }

            @Override // o.xZA.ActionBar
            public void KWHzl(xZA xza) {
                Intrinsics.checkNotNullParameter(xza, "");
                if (this.copydefault.AYXKKw) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(this.copydefault.KWHzl());
                    this.copydefault.KWHzl().clear();
                    this.copydefault.OLrzqt(arrayList);
                }
            }
        }

        public void copydefault(@NotNull java.util.List<? extends R> list) {
            xZA xza;
            Intrinsics.checkNotNullParameter(list, "");
            if (list.isEmpty()) {
                return;
            }
            this.AYXKKw = true;
            xZA xza2 = this.fetchVPNInfo;
            if (xza2 != null && xza2.copydefault()) {
                xZA xza3 = this.fetchVPNInfo;
                if (xza3 != null) {
                    xza3.KWHzl(true);
                }
                KWHzl().addAll(list);
                xZA xza4 = this.fetchVPNInfo;
                if (xza4 == null || xza4.KWHzl() || (xza = this.fetchVPNInfo) == null) {
                    return;
                }
                xza.EZpvd();
                return;
            }
            OLrzqt(list);
        }

        public final void valueOf() {
            xZA xza;
            xZA xza2 = this.fetchVPNInfo;
            if (xza2 == null || !xza2.copydefault() || (xza = this.fetchVPNInfo) == null) {
                return;
            }
            xza.AEQbTJ(this.isConnected);
        }

        public final void AYXKKw() {
            this.AYXKKw = false;
            xZA xza = this.fetchVPNInfo;
            if (xza != null && xza.copydefault()) {
                xZA xza2 = this.fetchVPNInfo;
                if (xza2 != null) {
                    xza2.AEQbTJ();
                }
                xZA xza3 = this.fetchVPNInfo;
                if (xza3 != null) {
                    xza3.copydefault(this.isConnected);
                }
                xZA xza4 = this.fetchVPNInfo;
                if (xza4 != null) {
                    xza4.KWHzl(false);
                }
            }
            KWHzl().clear();
        }

        public final void OLrzqt(java.util.List<? extends R> list) {
            ActionBar<R> actionBar = this.valueOf;
            if (actionBar == null) {
                EZpvd(list);
                this.AYXKKw = false;
            } else if (actionBar != null) {
                actionBar.copydefault(list);
            }
        }
    }

    public void KWHzl(@NotNull TaskDescription<R> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.util.ArrayList<TaskDescription<R>> arrayList = this.values;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) ((TaskDescription) obj).AhwBna(), (java.lang.Object) taskDescription.AhwBna())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            this.values.add(taskDescription);
        } else {
            this.values.removeAll(arrayList2);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((TaskDescription) it.next()).AYXKKw();
            }
            this.values.add(taskDescription);
        }
        taskDescription.valueOf();
        if (this.values.size() == 1) {
            this.AYXKKw.EZpvd(this.DbNXlk);
            this.AYXKKw.copydefault(this.DbNXlk);
            this.fIwbmz.copydefault(this.AkhnZx);
            this.fIwbmz.AEQbTJ(this.AkhnZx);
        }
        if (this.values.size() == 1 && !this.fetchVPNInfo.KWHzl() && copydefault()) {
            this.valueOf.postDelayed(new java.lang.Runnable() { // from class: o.xZM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    xZF.KWHzl(this.EZpvd);
                }
            }, 1000L);
        }
    }

    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<TaskDescription<R>> arrayList = this.values;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) ((TaskDescription) obj).AhwBna(), (java.lang.Object) str)) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).AYXKKw();
        }
        this.values.removeAll(arrayList2);
        if (this.values.size() == 0) {
            this.fetchVPNInfo.djBIcL();
            this.fIwbmz.AEQbTJ();
            this.fIwbmz.copydefault(this.AkhnZx);
            this.fIwbmz.KWHzl(false);
            this.AuCTel = "";
            this.ejfBZ = null;
            this.fJNWhG.clear();
            this.AYXKKw.EZpvd(this.DbNXlk);
        }
        this.valueOf.removeCallbacksAndMessages(null);
    }

    public static final <R extends ActionBar> void OLrzqt(java.util.List<? extends TaskDescription<R>> list, java.util.List<? extends R> list2) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).copydefault(list2);
        }
    }
}
