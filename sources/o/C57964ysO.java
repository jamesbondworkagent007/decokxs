package o;

import com.tencent.matrix.lifecycle.supervisor.ProcessToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57909yrM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57964ysO extends C57980yse implements InterfaceC57909yrM {
    public final java.lang.String AhwBna;
    public InterfaceC57916yrT gEmmrt;
    public final InterfaceC57918yrV valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final ConcurrentHashMap<java.lang.String, C57964ysO> AEQbTJ = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57918yrV values() {
        return this.valueOf;
    }

    /* JADX DEBUG: Possible override for method o.yse.copydefault()V */
    @Override // o.InterfaceC57909yrM
    public boolean copydefault() {
        return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57964ysO(@NotNull Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, @NotNull InterfaceC57918yrV interfaceC57918yrV, @NotNull java.lang.String str) {
        super(function1, new InterfaceC57918yrV[0]);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC57918yrV, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = interfaceC57918yrV;
        this.AhwBna = str;
        AEQbTJ.put(str, this);
    }

    /* JADX INFO: renamed from: o.ysO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ysO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ProcessToken[] OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            java.util.Collection collectionValues = C57964ysO.AEQbTJ.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            java.util.Collection<C57964ysO> collection = collectionValues;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection, 10));
            for (C57964ysO c57964ysO : collection) {
                arrayList.add(ProcessToken.Companion.EZpvd(context, c57964ysO.isConnected(), c57964ysO.values().AEQbTJ()));
            }
            return (ProcessToken[]) arrayList.toArray(new ProcessToken[0]);
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C57964ysO c57964ysO = (C57964ysO) C57964ysO.AEQbTJ.get(str);
            if (c57964ysO != null) {
                c57964ysO.AhwBna();
            }
        }

        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C57964ysO c57964ysO = (C57964ysO) C57964ysO.AEQbTJ.get(str);
            if (c57964ysO != null) {
                c57964ysO.AYXKKw();
            }
        }

        public final void EZpvd(@NotNull ProcessToken processToken, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(processToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (!C57968ysS.KWHzl.values()) {
                throw new java.lang.IllegalStateException("call forbidden");
            }
            for (Map.Entry entry : C57964ysO.AEQbTJ.entrySet()) {
                boolean zAEQbTJ = ((C57964ysO) entry.getValue()).AEQbTJ();
                C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "syncStates: " + ((java.lang.String) entry.getKey()) + ' ' + zAEQbTJ, new java.lang.Object[0]);
                C57969ysT.AEQbTJ.AEQbTJ().copydefault(processToken, str, (java.lang.String) entry.getKey(), zAEQbTJ);
            }
        }

        public final void OLrzqt(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            for (Map.Entry entry : C57964ysO.AEQbTJ.entrySet()) {
                C57964ysO c57964ysO = (C57964ysO) entry.getValue();
                InterfaceC57916yrT interfaceC57916yrT = c57964ysO.gEmmrt;
                if (interfaceC57916yrT != null) {
                    c57964ysO.values().AEQbTJ(interfaceC57916yrT);
                }
                c57964ysO.gEmmrt = new Activity(entry, application);
                InterfaceC57918yrV interfaceC57918yrVValues = c57964ysO.values();
                InterfaceC57916yrT interfaceC57916yrT2 = c57964ysO.gEmmrt;
                Intrinsics.copydefault(interfaceC57916yrT2);
                interfaceC57918yrVValues.KWHzl(interfaceC57916yrT2);
            }
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "DispatcherStateOwners attached", new java.lang.Object[0]);
        }

        /* JADX INFO: renamed from: o.ysO$ActionBar$Activity */
        public static final class Activity implements InterfaceC57909yrM {
            public final /* synthetic */ Map.Entry<java.lang.String, C57964ysO> EZpvd;
            public final /* synthetic */ android.app.Application KWHzl;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map$Entry<java.lang.String, ? extends o.ysO> */
            /* JADX WARN: Multi-variable type inference failed */
            public Activity(Map.Entry<java.lang.String, ? extends C57964ysO> entry, android.app.Application application) {
                this.EZpvd = entry;
                this.KWHzl = application;
            }

            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
            }

            @Override // o.InterfaceC57916yrT
            public void KWHzl() {
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                C58013ytK.copydefault(c57968ysS.gEmmrt(), "attached " + this.EZpvd.getKey() + " turned ON", new java.lang.Object[0]);
                java.lang.String str = c57968ysS.gEmmrt() + '.' + this.EZpvd.getKey();
                android.app.Application application = this.KWHzl;
                Map.Entry<java.lang.String, C57964ysO> entry = this.EZpvd;
                try {
                    InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
                    if (interfaceC57967ysRAhwBna != null) {
                        interfaceC57967ysRAhwBna.KWHzl(ProcessToken.Companion.EZpvd(application, entry.getKey(), true));
                    }
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(str, th, "", new java.lang.Object[0]);
                }
            }

            @Override // o.InterfaceC57916yrT
            public void OLrzqt() {
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                C58013ytK.copydefault(c57968ysS.gEmmrt(), "attached " + this.EZpvd.getKey() + " turned OFF", new java.lang.Object[0]);
                java.lang.String str = c57968ysS.gEmmrt() + '.' + this.EZpvd.getKey();
                android.app.Application application = this.KWHzl;
                Map.Entry<java.lang.String, C57964ysO> entry = this.EZpvd;
                try {
                    InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
                    if (interfaceC57967ysRAhwBna != null) {
                        interfaceC57967ysRAhwBna.KWHzl(ProcessToken.Companion.EZpvd(application, entry.getKey(), false));
                    }
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(str, th, "", new java.lang.Object[0]);
                }
            }
        }

        public final void KWHzl() {
            java.util.Iterator it = C57964ysO.AEQbTJ.entrySet().iterator();
            while (it.hasNext()) {
                C57964ysO c57964ysO = (C57964ysO) ((Map.Entry) it.next()).getValue();
                InterfaceC57916yrT interfaceC57916yrT = c57964ysO.gEmmrt;
                if (interfaceC57916yrT != null) {
                    c57964ysO.values().AEQbTJ(interfaceC57916yrT);
                }
                c57964ysO.gEmmrt = null;
            }
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "DispatcherStateOwners detached", new java.lang.Object[0]);
        }

        /* JADX INFO: renamed from: o.ysO$ActionBar$TaskDescription */
        public static final class TaskDescription implements InterfaceC57909yrM {
            public final /* synthetic */ Function2<java.lang.String, java.lang.Boolean, Unit> EZpvd;
            public final /* synthetic */ Map.Entry<java.lang.String, C57964ysO> copydefault;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map$Entry<java.lang.String, ? extends o.ysO> */
            /* JADX WARN: Multi-variable type inference failed */
            public TaskDescription(Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2, Map.Entry<java.lang.String, ? extends C57964ysO> entry) {
                this.EZpvd = function2;
                this.copydefault = entry;
            }

            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
            }

            @Override // o.InterfaceC57916yrT
            public void KWHzl() {
                this.EZpvd.invoke(this.copydefault.getKey(), java.lang.Boolean.TRUE);
            }

            @Override // o.InterfaceC57916yrT
            public void OLrzqt() {
                this.EZpvd.invoke(this.copydefault.getKey(), java.lang.Boolean.FALSE);
            }
        }

        public final void AEQbTJ(@NotNull Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            for (Map.Entry entry : C57964ysO.AEQbTJ.entrySet()) {
                ((C57964ysO) entry.getValue()).KWHzl(new TaskDescription(function2, entry));
            }
        }

        public final void EZpvd(@NotNull java.lang.String str, @NotNull C57983ysh c57983ysh) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57983ysh, "");
            C57964ysO c57964ysO = (C57964ysO) C57964ysO.AEQbTJ.get(str);
            if (c57964ysO != null) {
                c57964ysO.copydefault(c57983ysh);
            }
        }

        public final void copydefault(@NotNull java.lang.String str, @NotNull C57983ysh c57983ysh) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c57983ysh, "");
            C57964ysO c57964ysO = (C57964ysO) C57964ysO.AEQbTJ.get(str);
            if (c57964ysO != null) {
                c57964ysO.KWHzl(c57983ysh);
            }
        }
    }

    public final void AhwBna() {
        valueOf();
    }

    public final void AYXKKw() {
        djBIcL();
    }

    public java.lang.String toString() {
        return "DispatcherStateOwner_" + this.AhwBna;
    }
}
