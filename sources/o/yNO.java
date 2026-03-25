package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNO {
    public final InterfaceC59181zcG<C56933yXs, yNW> EZpvd;
    public final InterfaceC59181zcG<TaskDescription, InterfaceC56658yNn> KWHzl;
    public final yNP OLrzqt;
    public final InterfaceC59187zcM copydefault;

    public yNO(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        this.copydefault = interfaceC59187zcM;
        this.OLrzqt = ynp;
        this.EZpvd = interfaceC59187zcM.AEQbTJ(new yNT(this));
        this.KWHzl = interfaceC59187zcM.AEQbTJ(new yNV(this));
    }

    public static final class TaskDescription {
        public final java.util.List<java.lang.Integer> AEQbTJ;
        public final C56929yXo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClassRequest(classId=" + this.copydefault + ", typeParametersCount=" + this.AEQbTJ + ')';
        }

        public TaskDescription(@NotNull C56929yXo c56929yXo, @NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = c56929yXo;
            this.AEQbTJ = list;
        }
    }

    public static final yNW OLrzqt(yNO yno, C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return new C56710yPl(yno.OLrzqt, c56933yXs);
    }

    public static final InterfaceC56658yNn AEQbTJ(yNO yno, TaskDescription taskDescription) {
        yNW ynwInvoke;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56929yXo c56929yXoCopydefault = taskDescription.copydefault();
        java.util.List<java.lang.Integer> listAEQbTJ = taskDescription.AEQbTJ();
        if (c56929yXoCopydefault.AhwBna()) {
            throw new java.lang.UnsupportedOperationException("Unresolved local class: " + c56929yXoCopydefault);
        }
        C56929yXo c56929yXoKWHzl = c56929yXoCopydefault.KWHzl();
        if (c56929yXoKWHzl == null || (ynwInvoke = yno.OLrzqt(c56929yXoKWHzl, CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listAEQbTJ, 1))) == null) {
            ynwInvoke = yno.EZpvd.invoke(c56929yXoCopydefault.OLrzqt());
        }
        InterfaceC56665yNu interfaceC56665yNu = ynwInvoke;
        boolean zValueOf = c56929yXoCopydefault.valueOf();
        InterfaceC59187zcM interfaceC59187zcM = yno.copydefault;
        C56935yXu c56935yXuAYXKKw = c56929yXoCopydefault.AYXKKw();
        java.lang.Integer num = (java.lang.Integer) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ);
        return new Activity(interfaceC59187zcM, interfaceC56665yNu, c56935yXuAYXKKw, zValueOf, num != null ? num.intValue() : 0);
    }

    public static final class Activity extends AbstractC56708yPj {
        public final java.util.List<InterfaceC56691yOt> AEQbTJ;
        public final boolean EZpvd;
        public final C59256zdc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/zei; */
        @Override // o.InterfaceC56663yNs
        /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
        public C59256zdc fJNWhG() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
        public java.util.List<InterfaceC56691yOt> AkhnZx() {
            return this.AEQbTJ;
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56659yNo
        public boolean gHZMYf() {
            return this.EZpvd;
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

        @Override // o.InterfaceC56658yNn
        public InterfaceC56656yNl uzCIH() {
            return null;
        }

        @Override // o.InterfaceC56658yNn
        public InterfaceC56658yNn valueOf() {
            return null;
        }

        @Override // o.InterfaceC56658yNn
        public boolean wlaJM() {
            return false;
        }

        @Override // o.yNJ
        public boolean zLjUOn() {
            return false;
        }

        @Override // o.AbstractC56708yPj, o.yNJ
        public boolean zsXlph() {
            return false;
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 84, r5v1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull C56935yXu c56935yXu, boolean z, int i) {
            super(interfaceC59187zcM, interfaceC56665yNu, c56935yXu, InterfaceC56686yOo.copydefault, false);
            Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
            Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            this.EZpvd = z;
            kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, i);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
            java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC56415yEn) it).nextInt();
                yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
                Variance variance = Variance.INVARIANT;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('T');
                sb.append(iNextInt);
                arrayList.add(yPR.KWHzl(this, yolOLrzqt, false, variance, C56935yXu.AEQbTJ(sb.toString()), iNextInt, interfaceC59187zcM));
            }
            this.AEQbTJ = arrayList;
            this.copydefault = new C59256zdc(this, C56692yOu.copydefault((InterfaceC56659yNo) this), yED.AEQbTJ(yZE.AhwBna(this).AEQbTJ().AhwBna()), interfaceC59187zcM);
        }

        @Override // o.InterfaceC56658yNn
        public ClassKind DbNXlk() {
            return ClassKind.CLASS;
        }

        @Override // o.InterfaceC56658yNn, o.yNJ
        public Modality isConnected() {
            return Modality.FINAL;
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

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zad; */
        @Override // o.AbstractC56722yPx
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public InterfaceC59098zad.ActionBar AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            return InterfaceC59098zad.ActionBar.copydefault;
        }

        /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/zad; */
        @Override // o.InterfaceC56658yNn
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public InterfaceC59098zad.ActionBar ejfBZ() {
            return InterfaceC59098zad.ActionBar.copydefault;
        }

        @Override // o.InterfaceC56658yNn
        public java.util.Collection<InterfaceC56656yNl> djBIcL() {
            return yEE.copydefault();
        }

        @Override // o.InterfaceC56658yNn
        public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
            return yDY.AhwBna();
        }

        public java.lang.String toString() {
            return "class " + bR_() + " (not found)";
        }
    }

    public final InterfaceC56658yNn OLrzqt(@NotNull C56929yXo c56929yXo, @NotNull java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(list, "");
        return this.KWHzl.invoke(new TaskDescription(c56929yXo, list));
    }
}
