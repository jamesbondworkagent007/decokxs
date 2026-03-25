package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.C57958ysI;
import o.C57982ysg;
import o.C57987ysl;
import o.InterfaceC57909yrM;

/* JADX INFO: renamed from: o.ysr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57993ysr extends C57983ysh implements InterfaceC57912yrP {
    public static final C57993ysr AEQbTJ = new C57993ysr();
    public static final TaskDescription EZpvd;
    public static long OLrzqt;

    private C57993ysr() {
        super(false, 1, null);
    }

    static {
        long j = C57994yss.OLrzqt;
        OLrzqt = j;
        EZpvd = new TaskDescription(j);
        new AnonymousClass2(C57978ysc.Companion.OLrzqt(), new InterfaceC57918yrV[]{C57958ysI.AEQbTJ, C57982ysg.EZpvd, C57987ysl.EZpvd}).KWHzl(new InterfaceC57909yrM() { // from class: o.ysr.5
            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
            }

            @Override // o.InterfaceC57916yrT
            public void KWHzl() {
                C57993ysr.EZpvd.AhwBna();
                C57993ysr.AEQbTJ.djBIcL();
            }

            @Override // o.InterfaceC57916yrT
            public void OLrzqt() {
                C57993ysr.EZpvd.valueOf();
            }
        });
    }

    /* JADX INFO: renamed from: o.ysr$TaskDescription */
    public static final class TaskDescription extends AbstractC57957ysH {
        public TaskDescription(long j) {
            super("Matrix.Explicit", j, 0, 4, null);
        }

        public static final boolean KWHzl(InterfaceC56387yDm<java.lang.Boolean> interfaceC56387yDm) {
            return interfaceC56387yDm.getValue().booleanValue();
        }

        @Override // o.AbstractC57957ysH
        public boolean KWHzl() {
            InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$checkTask$1$action$uiForeground$2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(C57958ysI.AEQbTJ.AEQbTJ());
                }
            });
            InterfaceC56387yDm interfaceC56387yDmCopydefault2 = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$checkTask$1$action$fgService$2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(C57982ysg.EZpvd.gEmmrt());
                }
            });
            InterfaceC56387yDm interfaceC56387yDmCopydefault3 = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner$checkTask$1$action$visibleWindow$2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(C57987ysl.EZpvd.AYXKKw());
                }
            });
            if (KWHzl((InterfaceC56387yDm<java.lang.Boolean>) interfaceC56387yDmCopydefault)) {
                C58013ytK.EZpvd("Matrix.Explicit", "turn OFF for UI foreground", new java.lang.Object[0]);
                C57993ysr.AEQbTJ.djBIcL();
                return false;
            }
            if (!EZpvd((InterfaceC56387yDm<java.lang.Boolean>) interfaceC56387yDmCopydefault2) && !AEQbTJ((InterfaceC56387yDm<java.lang.Boolean>) interfaceC56387yDmCopydefault3)) {
                C58013ytK.EZpvd("Matrix.Explicit", "turn ON", new java.lang.Object[0]);
                C57993ysr.AEQbTJ.valueOf();
                return false;
            }
            C58013ytK.EZpvd("Matrix.Explicit", "turn OFF: fgService=" + EZpvd((InterfaceC56387yDm<java.lang.Boolean>) interfaceC56387yDmCopydefault2) + ", visibleView=" + AEQbTJ((InterfaceC56387yDm<java.lang.Boolean>) interfaceC56387yDmCopydefault3) + ", overlay=" + C57987ysl.EZpvd.AYXKKw(), new java.lang.Object[0]);
            C57993ysr.AEQbTJ.djBIcL();
            return true;
        }

        public static final boolean EZpvd(InterfaceC56387yDm<java.lang.Boolean> interfaceC56387yDm) {
            return interfaceC56387yDm.getValue().booleanValue();
        }

        public static final boolean AEQbTJ(InterfaceC56387yDm<java.lang.Boolean> interfaceC56387yDm) {
            return interfaceC56387yDm.getValue().booleanValue();
        }
    }

    /* JADX INFO: renamed from: o.ysr$2, reason: invalid class name */
    public static final class AnonymousClass2 extends C57917yrU implements InterfaceC57909yrM {
        public AnonymousClass2(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, InterfaceC57918yrV[] interfaceC57918yrVArr) {
            super(function1, interfaceC57918yrVArr);
        }

        /* JADX DEBUG: Possible override for method o.yse.copydefault()V */
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }
    }

    @Override // o.C57983ysh, o.InterfaceC57914yrR
    public boolean AEQbTJ() {
        if (C57958ysI.AEQbTJ.AEQbTJ()) {
            djBIcL();
            return false;
        }
        EZpvd.copydefault();
        return super.AEQbTJ();
    }
}
