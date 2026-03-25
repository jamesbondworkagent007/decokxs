package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.yMB;
import o.yWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59081zaM {
    public static final Application AEQbTJ = new Application(null);
    public static final java.util.Set<C56929yXo> KWHzl = yED.AEQbTJ(C56929yXo.AEQbTJ.KWHzl(yMB.Application.fJNWhG.djBIcL()));
    public final Function1<Activity, InterfaceC56658yNn> EZpvd;
    public final C59083zaO OLrzqt;

    public C59081zaM(@NotNull C59083zaO c59083zaO) {
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        this.OLrzqt = c59083zaO;
        this.EZpvd = c59083zaO.ejfBZ().OLrzqt(new C59085zaQ(this));
    }

    public static final InterfaceC56658yNn EZpvd(C59081zaM c59081zaM, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return c59081zaM.EZpvd(activity);
    }

    public static /* synthetic */ InterfaceC56658yNn deserializeClass$default(C59081zaM c59081zaM, C56929yXo c56929yXo, C59078zaJ c59078zaJ, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c59078zaJ = null;
        }
        return c59081zaM.OLrzqt(c56929yXo, c59078zaJ);
    }

    public final InterfaceC56658yNn OLrzqt(@NotNull C56929yXo c56929yXo, C59078zaJ c59078zaJ) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        return this.EZpvd.invoke(new Activity(c56929yXo, c59078zaJ));
    }

    public final InterfaceC56658yNn EZpvd(Activity activity) {
        java.lang.Object next;
        C59087zaS c59087zaSOLrzqt;
        C56929yXo c56929yXoEZpvd = activity.EZpvd();
        java.util.Iterator<yOY> it = this.OLrzqt.AYXKKw().iterator();
        while (it.hasNext()) {
            InterfaceC56658yNn interfaceC56658yNnKWHzl = it.next().KWHzl(c56929yXoEZpvd);
            if (interfaceC56658yNnKWHzl != null) {
                return interfaceC56658yNnKWHzl;
            }
        }
        if (KWHzl.contains(c56929yXoEZpvd)) {
            return null;
        }
        C59078zaJ c59078zaJOLrzqt = activity.OLrzqt();
        if (c59078zaJOLrzqt == null && (c59078zaJOLrzqt = this.OLrzqt.EZpvd().AEQbTJ(c56929yXoEZpvd)) == null) {
            return null;
        }
        yWS ywsAEQbTJ = c59078zaJOLrzqt.AEQbTJ();
        ProtoBuf.Class classCopydefault = c59078zaJOLrzqt.copydefault();
        yWQ ywqKWHzl = c59078zaJOLrzqt.KWHzl();
        InterfaceC56686yOo interfaceC56686yOoEZpvd = c59078zaJOLrzqt.EZpvd();
        C56929yXo c56929yXoKWHzl = c56929yXoEZpvd.KWHzl();
        if (c56929yXoKWHzl != null) {
            InterfaceC56658yNn interfaceC56658yNnDeserializeClass$default = deserializeClass$default(this, c56929yXoKWHzl, null, 2, null);
            C59127zbF c59127zbF = interfaceC56658yNnDeserializeClass$default instanceof C59127zbF ? (C59127zbF) interfaceC56658yNnDeserializeClass$default : null;
            if (c59127zbF == null || !c59127zbF.KWHzl(c56929yXoEZpvd.AYXKKw())) {
                return null;
            }
            c59087zaSOLrzqt = c59127zbF.QOLQEE();
        } else {
            java.util.Iterator<T> it2 = C56672yOa.OLrzqt(this.OLrzqt.fJNWhG(), c56929yXoEZpvd.OLrzqt()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                yNW ynw = (yNW) next;
                if (!(ynw instanceof AbstractC59088zaT) || ((AbstractC59088zaT) ynw).KWHzl(c56929yXoEZpvd.AYXKKw())) {
                    break;
                }
            }
            yNW ynw2 = (yNW) next;
            if (ynw2 == null) {
                return null;
            }
            C59083zaO c59083zaO = this.OLrzqt;
            ProtoBuf.TypeTable typeTable = classCopydefault.getTypeTable();
            Intrinsics.checkNotNullExpressionValue(typeTable, "");
            yWW yww = new yWW(typeTable);
            yWX.StateListAnimator stateListAnimator = yWX.EZpvd;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classCopydefault.getVersionRequirementTable();
            Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
            c59087zaSOLrzqt = c59083zaO.OLrzqt(ynw2, ywsAEQbTJ, yww, stateListAnimator.EZpvd(versionRequirementTable), ywqKWHzl, null);
        }
        return new C59127zbF(c59087zaSOLrzqt, classCopydefault, ywsAEQbTJ, ywqKWHzl, interfaceC56686yOoEZpvd);
    }

    /* JADX INFO: renamed from: o.zaM$Activity */
    public static final class Activity {
        public final C59078zaJ AEQbTJ;
        public final C56929yXo EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C59078zaJ OLrzqt() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull C56929yXo c56929yXo, C59078zaJ c59078zaJ) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            this.EZpvd = c56929yXo;
            this.AEQbTJ = c59078zaJ;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
        }

        public int hashCode() {
            return this.EZpvd.hashCode();
        }
    }

    /* JADX INFO: renamed from: o.zaM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zaM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.util.Set<C56929yXo> KWHzl() {
            return C59081zaM.KWHzl;
        }
    }
}
