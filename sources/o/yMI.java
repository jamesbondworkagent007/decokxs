package o;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC56685yOn;
import o.InterfaceC59098zad;
import o.yMM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMI extends yOW {
    public static final C56929yXo EZpvd;
    public static final C56929yXo KWHzl;
    public static final Application OLrzqt = new Application(null);
    public final yNW AEQbTJ;
    public final InterfaceC59187zcM AYXKKw;
    public final java.util.List<InterfaceC56691yOt> AhwBna;
    public final int copydefault;
    public final yMM djBIcL;
    public final TaskDescription fetchVPNInfo;
    public final yMJ gEmmrt;
    public final FunctionClassKind valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        return this.AhwBna;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AuCTelauCTel() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AubY() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AwvSrB() {
        return false;
    }

    public java.lang.Void EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zad; */
    @Override // o.AbstractC56722yPx
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yMJ AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    @Override // o.InterfaceC56658yNn, o.InterfaceC56666yNv, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public yNW AuCTel() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return false;
    }

    public java.lang.Void getFieldNames() {
        return null;
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public yOA<AbstractC59242zdO> iwGUEr() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public boolean sSMYrx() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yMM values() {
        return this.djBIcL;
    }

    @Override // o.InterfaceC56658yNn
    public boolean wlaJM() {
        return false;
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return false;
    }

    @Override // o.yNJ
    public boolean zsXlph() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public /* synthetic */ InterfaceC56656yNl uzCIH() {
        return (InterfaceC56656yNl) getFieldNames();
    }

    @Override // o.InterfaceC56658yNn
    public /* synthetic */ InterfaceC56658yNn valueOf() {
        return (InterfaceC56658yNn) EZpvd();
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 80, r7v6 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yMI(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNW ynw, @NotNull yMM ymm, int i) {
        super(interfaceC59187zcM, ymm.EZpvd(i));
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynw, "");
        Intrinsics.checkNotNullParameter(ymm, "");
        this.AYXKKw = interfaceC59187zcM;
        this.AEQbTJ = ynw;
        this.djBIcL = ymm;
        this.copydefault = i;
        this.fetchVPNInfo = new TaskDescription();
        this.gEmmrt = new yMJ(interfaceC59187zcM, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(1, i);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(intRange, 10));
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('P');
            sb.append(iNextInt);
            EZpvd(arrayList, this, variance, sb.toString());
            arrayList2.add(Unit.INSTANCE);
        }
        EZpvd(arrayList, this, Variance.OUT_VARIANCE, com.ibm.icu.text.DateFormat.JP_ERA_2019_NARROW);
        this.AhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        this.valueOf = FunctionClassKind.Companion.OLrzqt(this.djBIcL);
    }

    public static final void EZpvd(java.util.ArrayList<InterfaceC56691yOt> arrayList, yMI ymi, Variance variance, java.lang.String str) {
        arrayList.add(yPR.KWHzl(ymi, yOL.KWHzl.OLrzqt(), false, variance, C56935yXu.AEQbTJ(str), arrayList.size(), ymi.AYXKKw));
    }

    /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/zad; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: fIwbmz, reason: merged with bridge method [inline-methods] */
    public InterfaceC59098zad.ActionBar ejfBZ() {
        return InterfaceC59098zad.ActionBar.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL()Ljava/util/Collection; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC56656yNl> djBIcL() {
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        return ClassKind.INTERFACE;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        return Modality.ABSTRACT;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = C56669yNy.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(ync, "");
        return ync;
    }

    @Override // o.yOB
    public yOL copydefault() {
        return yOL.KWHzl.OLrzqt();
    }

    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        return interfaceC56686yOo;
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Ljava/util/Collection; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC56658yNn> fetchVPNInfo() {
        return yDY.AhwBna();
    }

    public final class TaskDescription extends AbstractC59184zcJ {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/yNn; */
        @Override // o.AbstractC59184zcJ
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public yMI OLrzqt() {
            return yMI.this;
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            super(yMI.this.AYXKKw);
        }

        @Override // o.AbstractC59197zcW
        public java.util.Collection<AbstractC59233zdF> AEQbTJ() {
            java.util.List<C56929yXo> listGEmmrt;
            yMM ymmValues = yMI.this.values();
            yMM.TaskDescription taskDescription = yMM.TaskDescription.copydefault;
            if (Intrinsics.EZpvd(ymmValues, taskDescription)) {
                listGEmmrt = C56402yEa.EZpvd(yMI.KWHzl);
            } else if (Intrinsics.EZpvd(ymmValues, yMM.Application.copydefault)) {
                listGEmmrt = yDY.gEmmrt(yMI.EZpvd, new C56929yXo(yMB.AEQbTJ, taskDescription.EZpvd(yMI.this.OLrzqt())));
            } else {
                yMM.Activity activity = yMM.Activity.copydefault;
                if (Intrinsics.EZpvd(ymmValues, activity)) {
                    listGEmmrt = C56402yEa.EZpvd(yMI.KWHzl);
                } else if (Intrinsics.EZpvd(ymmValues, yMM.ActionBar.copydefault)) {
                    listGEmmrt = yDY.gEmmrt(yMI.EZpvd, new C56929yXo(yMB.fetchVPNInfo, activity.EZpvd(yMI.this.OLrzqt())));
                } else {
                    C59390zgD.shouldNotBeCalled$default(null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }
            yNP ynpAuCTel = yMI.this.AEQbTJ.AuCTel();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (C56929yXo c56929yXo : listGEmmrt) {
                InterfaceC56658yNn interfaceC56658yNnCopydefault = yNE.copydefault(ynpAuCTel, c56929yXo);
                if (interfaceC56658yNnCopydefault == null) {
                    throw new java.lang.IllegalStateException(("Built-in class " + c56929yXo + " not found").toString());
                }
                java.util.List listFetchVPNInfo = CollectionsKt___CollectionsKt.fetchVPNInfo(copydefault(), interfaceC56658yNnCopydefault.fJNWhG().copydefault().size());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
                java.util.Iterator it = listFetchVPNInfo.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C59323zeq(((InterfaceC56691yOt) it.next()).bQ_()));
                }
                arrayList.add(C59231zdD.KWHzl(C59308zeb.OLrzqt.copydefault(), interfaceC56658yNnCopydefault, arrayList2));
            }
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            return yMI.this.AhwBna;
        }

        public java.lang.String toString() {
            return OLrzqt().toString();
        }

        @Override // o.AbstractC59197zcW
        public InterfaceC56685yOn djBIcL() {
            return InterfaceC56685yOn.Activity.KWHzl;
        }
    }

    public java.lang.String toString() {
        java.lang.String strAEQbTJ = bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    static {
        C56933yXs c56933yXs = yMB.AEQbTJ;
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ("Function");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        KWHzl = new C56929yXo(c56933yXs, c56935yXuAEQbTJ);
        C56933yXs c56933yXs2 = yMB.getNewProxyInstance;
        C56935yXu c56935yXuAEQbTJ2 = C56935yXu.AEQbTJ("KFunction");
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ2, "");
        EZpvd = new C56929yXo(c56933yXs2, c56935yXuAEQbTJ2);
    }
}
