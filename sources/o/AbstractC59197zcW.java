package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59197zcW extends AbstractC59262zdi {
    public final InterfaceC59182zcH<ActionBar> AhwBna;
    public final boolean OLrzqt;

    public abstract java.util.Collection<AbstractC59233zdF> AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<AbstractC59233zdF> OLrzqt(@NotNull java.util.List<AbstractC59233zdF> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
    }

    public abstract InterfaceC56685yOn djBIcL();

    public AbstractC59233zdF valueOf() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.OLrzqt;
    }

    public AbstractC59197zcW(@NotNull InterfaceC59187zcM interfaceC59187zcM) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        this.AhwBna = interfaceC59187zcM.copydefault(new C59196zcV(this), C59194zcT.AEQbTJ, new C59193zcS(this));
    }

    /* JADX DEBUG: Method merged with bridge method: bV_()Ljava/util/Collection; */
    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public java.util.List<AbstractC59233zdF> bV_() {
        return this.AhwBna.invoke().KWHzl();
    }

    @Override // o.InterfaceC59315zei
    public InterfaceC59315zei AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return new Activity(this, abstractC59287zeG);
    }

    /* JADX INFO: renamed from: o.zcW$Activity */
    public final class Activity implements InterfaceC59315zei {
        public final /* synthetic */ AbstractC59197zcW KWHzl;
        public final AbstractC59287zeG OLrzqt;
        public final InterfaceC56387yDm copydefault;

        public Activity(@NotNull AbstractC59197zcW abstractC59197zcW, AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            this.KWHzl = abstractC59197zcW;
            this.OLrzqt = abstractC59287zeG;
            this.copydefault = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C59254zda(this, abstractC59197zcW));
        }

        public final java.util.List<AbstractC59233zdF> AEQbTJ() {
            return (java.util.List) this.copydefault.getValue();
        }

        public static final java.util.List AEQbTJ(Activity activity, AbstractC59197zcW abstractC59197zcW) {
            return C59286zeF.KWHzl(activity.OLrzqt, abstractC59197zcW.bV_());
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            java.util.List<InterfaceC56691yOt> listCopydefault = this.KWHzl.copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            return listCopydefault;
        }

        /* JADX DEBUG: Method merged with bridge method: bV_()Ljava/util/Collection; */
        @Override // o.InterfaceC59315zei
        /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
        public java.util.List<AbstractC59233zdF> bV_() {
            return AEQbTJ();
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return this.KWHzl.gEmmrt();
        }

        @Override // o.InterfaceC59315zei
        public InterfaceC56663yNs KWHzl() {
            return this.KWHzl.KWHzl();
        }

        @Override // o.InterfaceC59315zei
        public AbstractC56640yMw bU_() {
            AbstractC56640yMw abstractC56640yMwBU_ = this.KWHzl.bU_();
            Intrinsics.checkNotNullExpressionValue(abstractC56640yMwBU_, "");
            return abstractC56640yMwBU_;
        }

        @Override // o.InterfaceC59315zei
        public InterfaceC59315zei AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            return this.KWHzl.AEQbTJ(abstractC59287zeG);
        }

        public boolean equals(java.lang.Object obj) {
            return this.KWHzl.equals(obj);
        }

        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        public java.lang.String toString() {
            return this.KWHzl.toString();
        }
    }

    /* JADX INFO: renamed from: o.zcW$ActionBar */
    public static final class ActionBar {
        public java.util.List<? extends AbstractC59233zdF> EZpvd;
        public final java.util.Collection<AbstractC59233zdF> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.util.List<? extends AbstractC59233zdF> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.zdF>, java.util.List<o.zdF> */
        public final java.util.List<AbstractC59233zdF> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Collection<AbstractC59233zdF> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends o.zdF> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.Collection<? extends AbstractC59233zdF> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            this.KWHzl = collection;
            this.EZpvd = C56402yEa.EZpvd(C59370zfk.AEQbTJ.KWHzl());
        }
    }

    public static final ActionBar AEQbTJ(AbstractC59197zcW abstractC59197zcW) {
        return new ActionBar(abstractC59197zcW.AEQbTJ());
    }

    public static final ActionBar EZpvd(boolean z) {
        return new ActionBar(C56402yEa.EZpvd(C59370zfk.AEQbTJ.KWHzl()));
    }

    public static final Unit OLrzqt(AbstractC59197zcW abstractC59197zcW, ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        java.util.Collection<AbstractC59233zdF> collectionAEQbTJ = abstractC59197zcW.djBIcL().AEQbTJ(abstractC59197zcW, actionBar.OLrzqt(), new C59199zcY(abstractC59197zcW), new C59200zcZ(abstractC59197zcW));
        if (collectionAEQbTJ.isEmpty()) {
            AbstractC59233zdF abstractC59233zdFValueOf = abstractC59197zcW.valueOf();
            collectionAEQbTJ = abstractC59233zdFValueOf != null ? C56402yEa.EZpvd(abstractC59233zdFValueOf) : null;
            if (collectionAEQbTJ == null) {
                collectionAEQbTJ = yDY.AhwBna();
            }
        }
        if (abstractC59197zcW.values()) {
            abstractC59197zcW.djBIcL().AEQbTJ(abstractC59197zcW, collectionAEQbTJ, new C59255zdb(abstractC59197zcW), new C59198zcX(abstractC59197zcW));
        }
        java.util.List<AbstractC59233zdF> listAxsJAYsNCnLh = collectionAEQbTJ instanceof java.util.List ? (java.util.List) collectionAEQbTJ : null;
        if (listAxsJAYsNCnLh == null) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionAEQbTJ);
        }
        actionBar.EZpvd(abstractC59197zcW.OLrzqt(listAxsJAYsNCnLh));
        return Unit.INSTANCE;
    }

    public static final java.lang.Iterable EZpvd(AbstractC59197zcW abstractC59197zcW, InterfaceC59315zei interfaceC59315zei) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        return abstractC59197zcW.OLrzqt(interfaceC59315zei, false);
    }

    public static final Unit AEQbTJ(AbstractC59197zcW abstractC59197zcW, AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        abstractC59197zcW.copydefault(abstractC59233zdF);
        return Unit.INSTANCE;
    }

    public static final java.lang.Iterable copydefault(AbstractC59197zcW abstractC59197zcW, InterfaceC59315zei interfaceC59315zei) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        return abstractC59197zcW.OLrzqt(interfaceC59315zei, true);
    }

    public static final Unit copydefault(AbstractC59197zcW abstractC59197zcW, AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        abstractC59197zcW.KWHzl(abstractC59233zdF);
        return Unit.INSTANCE;
    }

    public final java.util.Collection<AbstractC59233zdF> OLrzqt(InterfaceC59315zei interfaceC59315zei, boolean z) {
        java.util.List listDjBIcL;
        AbstractC59197zcW abstractC59197zcW = interfaceC59315zei instanceof AbstractC59197zcW ? (AbstractC59197zcW) interfaceC59315zei : null;
        if (abstractC59197zcW != null && (listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) abstractC59197zcW.AhwBna.invoke().OLrzqt(), (java.lang.Iterable) abstractC59197zcW.copydefault(z))) != null) {
            return listDjBIcL;
        }
        java.util.Collection<AbstractC59233zdF> collectionBV_ = interfaceC59315zei.bV_();
        Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
        return collectionBV_;
    }

    public java.util.Collection<AbstractC59233zdF> copydefault(boolean z) {
        return yDY.AhwBna();
    }
}
