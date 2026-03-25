package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.template.TemplateSetting;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRS implements InterfaceC49405unt<Unit, oLZ> {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.oRR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oRS.KWHzl();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oRT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return oRS.EZpvd(this.OLrzqt);
        }
    });
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public oRS() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public oLZ EZpvd(@NotNull Unit unit) {
        return (oLZ) InterfaceC49405unt.Activity.EZpvd(this, unit);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oRS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final C36246oUr KWHzl() {
        return C36246oUr.copydefault();
    }

    public final C36246oUr djBIcL() {
        return (C36246oUr) this.KWHzl.getValue();
    }

    public final com.okinc.kline.library.data.DataSource AEQbTJ() {
        return djBIcL().sSMYrx().get("ds0");
    }

    public final TemplateSetting AYXKKw() {
        return djBIcL().KWHzl("ds0");
    }

    public final oWN AhwBna() {
        return djBIcL().DCJXGO().get("ds0");
    }

    public final oWC valueOf() {
        return djBIcL().iwGUEr().QVAiDq().get("ds0.m");
    }

    public final oUK gEmmrt() {
        return (oUK) this.OLrzqt.getValue();
    }

    public static final oUK EZpvd(oRS ors) {
        return (oUK) ors.djBIcL().iwGUEr().AkhnZx().get("ds0.m.s.SR");
    }

    public final int copydefault() {
        AbstractC36262oVg abstractC36262oVgIsConnected;
        java.util.ArrayList<Expression.Parameter> arrayListGEmmrt;
        Expression.Parameter parameter;
        oUK oukGEmmrt = gEmmrt();
        if (oukGEmmrt == null || (abstractC36262oVgIsConnected = oukGEmmrt.isConnected()) == null || (arrayListGEmmrt = abstractC36262oVgIsConnected.gEmmrt()) == null || (parameter = (Expression.Parameter) CollectionsKt___CollectionsKt.firstOrNull(arrayListGEmmrt)) == null) {
            return 10;
        }
        return C33129mqd.AhwBna(java.lang.Double.valueOf(parameter.getValue()));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public oLZ AEQbTJ(@NotNull Unit unit) {
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(unit, "");
        if (AEQbTJ() == null || AYXKKw() == null || AhwBna() == null || valueOf() == null) {
            return new oLZ(null, null, null, null, 15, null);
        }
        com.okinc.kline.library.data.DataSource dataSourceAEQbTJ = AEQbTJ();
        Intrinsics.copydefault(dataSourceAEQbTJ);
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSourceAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(dataArrayList, "");
        oWN ownAhwBna = AhwBna();
        Intrinsics.copydefault(ownAhwBna);
        int iIsConnected = ownAhwBna.isConnected();
        oWN ownAhwBna2 = AhwBna();
        Intrinsics.copydefault(ownAhwBna2);
        java.util.List<DataSource.StateListAnimator> listOLrzqt = OLrzqt(dataArrayList, iIsConnected, ownAhwBna2.ejfBZ());
        if (listOLrzqt == null || listOLrzqt.isEmpty()) {
            return new oLZ(null, null, null, null, 15, null);
        }
        int iCopydefault = copydefault();
        kotlin.Pair<java.lang.Double, java.lang.Double> pairOLrzqt = OLrzqt(listOLrzqt);
        double dDoubleValue = pairOLrzqt.component1().doubleValue();
        double dDoubleValue2 = pairOLrzqt.component2().doubleValue();
        double dPow = java.lang.Math.pow(10.0d, java.lang.Math.max(C33129mqd.copydefault(java.lang.Double.valueOf(dDoubleValue)).scale(), C33129mqd.copydefault(java.lang.Double.valueOf(dDoubleValue2)).scale()));
        double d3 = dDoubleValue * dPow;
        while (true) {
            d = iCopydefault;
            d2 = (((dDoubleValue2 * dPow) - d3) / d) + ((double) 1);
            if (d2 <= 5000) {
                break;
            }
            iCopydefault *= 10;
        }
        int i = (int) d2;
        if (i <= 0 || i == Integer.MAX_VALUE) {
            return new oLZ(null, null, null, null, 15, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        for (DataSource.StateListAnimator stateListAnimator : listOLrzqt) {
            int iAkhnZx = (int) (((((stateListAnimator.AkhnZx() * dPow) + (stateListAnimator.values() * dPow)) / 2.0d) - d3) / d);
            if (iAkhnZx >= 0 && iAkhnZx < i) {
                arrayList.set(iAkhnZx, java.lang.Double.valueOf(((java.lang.Number) arrayList.get(iAkhnZx)).doubleValue() + stateListAnimator.zsXlph()));
            }
        }
        java.util.ArrayList<oRU> arrayList2 = new java.util.ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            arrayList2.add(new oRU(((double) (i3 * iCopydefault)) + d3, ((java.lang.Number) arrayList.get(i3)).doubleValue()));
        }
        double dCopydefault = ((DataSource.StateListAnimator) CollectionsKt___CollectionsKt.AubY(listOLrzqt)).copydefault() * dPow;
        java.lang.Double dValueOf = null;
        java.lang.Double dValueOf2 = null;
        java.lang.Integer numValueOf = null;
        java.lang.Integer numValueOf2 = null;
        double d4 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d5 = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (oRU oru : arrayList2) {
            double dCopydefault2 = oru.copydefault();
            double dAEQbTJ = oru.AEQbTJ();
            if (dCopydefault2 < dCopydefault) {
                if (dAEQbTJ > d4) {
                    double d6 = dCopydefault2 / dPow;
                    dValueOf = java.lang.Double.valueOf(d6);
                    oWC owcValueOf = valueOf();
                    Intrinsics.copydefault(owcValueOf);
                    numValueOf = java.lang.Integer.valueOf(owcValueOf.AhwBna(d6));
                    d4 = dAEQbTJ;
                }
            } else if (dCopydefault2 > dCopydefault && dAEQbTJ > d5) {
                double d7 = dCopydefault2 / dPow;
                dValueOf2 = java.lang.Double.valueOf(d7);
                oWC owcValueOf2 = valueOf();
                Intrinsics.copydefault(owcValueOf2);
                numValueOf2 = java.lang.Integer.valueOf(owcValueOf2.AhwBna(d7));
                d5 = dAEQbTJ;
            }
        }
        return new oLZ(dValueOf, dValueOf2, numValueOf, numValueOf2);
    }

    public final kotlin.Pair<java.lang.Double, java.lang.Double> OLrzqt(java.util.List<? extends DataSource.StateListAnimator> list) {
        java.util.Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dValues = ((DataSource.StateListAnimator) it.next()).values();
        while (it.hasNext()) {
            dValues = java.lang.Math.min(dValues, ((DataSource.StateListAnimator) it.next()).values());
        }
        java.util.Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double dAkhnZx = ((DataSource.StateListAnimator) it2.next()).AkhnZx();
        while (it2.hasNext()) {
            dAkhnZx = java.lang.Math.max(dAkhnZx, ((DataSource.StateListAnimator) it2.next()).AkhnZx());
        }
        return C56390yDp.OLrzqt(java.lang.Double.valueOf(dValues), java.lang.Double.valueOf(dAkhnZx));
    }

    public final java.util.List<DataSource.StateListAnimator> OLrzqt(java.util.List<? extends DataSource.StateListAnimator> list, int i, int i2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(list.subList(i, i2));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (java.util.List) objM7377constructorimpl;
    }
}
