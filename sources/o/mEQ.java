package o;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.okinc.cruilib.compose.library.reorderable.ReorderableListState$settle$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mEQ {
    public final MutableState AEQbTJ;
    public final MutableState EZpvd;
    public final java.util.List<C31801mEk> KWHzl;
    public final SnapshotStateList<DraggableState> OLrzqt;
    public final SnapshotStateList<Animatable<java.lang.Float, AnimationVector1D>> copydefault;
    public final Function2<java.lang.Integer, java.lang.Integer, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SnapshotStateList<DraggableState> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SnapshotStateList<Animatable<java.lang.Float, AnimationVector1D>> KWHzl() {
        return this.copydefault;
    }

    public final androidx.compose.runtime.State<java.lang.Boolean> AEQbTJ() {
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mEQ.EZpvd(this.KWHzl));
            }
        });
    }

    public static final boolean EZpvd(mEQ meq) {
        return meq.OLrzqt() != null;
    }

    public final androidx.compose.runtime.State<java.lang.Boolean> EZpvd(final int i) {
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mEQ.AEQbTJ(i, this));
            }
        });
    }

    public static final boolean AEQbTJ(int i, mEQ meq) {
        java.lang.Integer numOLrzqt = meq.OLrzqt();
        return numOLrzqt != null && i == numOLrzqt.intValue();
    }

    public final void KWHzl(int i) {
        OLrzqt(java.lang.Integer.valueOf(i));
        EZpvd(java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, float f, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReorderableListState$settle$1 reorderableListState$settle$1;
        java.lang.Integer numAEQbTJ;
        mEQ meq;
        int i2;
        if (continuation instanceof ReorderableListState$settle$1) {
            reorderableListState$settle$1 = (ReorderableListState$settle$1) continuation;
            int i3 = reorderableListState$settle$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reorderableListState$settle$1.label = i3 - Integer.MIN_VALUE;
            } else {
                reorderableListState$settle$1 = new ReorderableListState$settle$1(this, continuation);
            }
        }
        ReorderableListState$settle$1 reorderableListState$settle$12 = reorderableListState$settle$1;
        java.lang.Object obj = reorderableListState$settle$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = reorderableListState$settle$12.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            float fKWHzl = this.KWHzl.get(i).KWHzl();
            float fAEQbTJ = this.KWHzl.get(i).AEQbTJ();
            int iOLrzqt = this.KWHzl.get(i).OLrzqt();
            float fKWHzl2 = this.KWHzl.get(i).KWHzl() + this.copydefault.get(i).getTargetValue().floatValue();
            float f2 = iOLrzqt;
            if (fKWHzl2 < fKWHzl) {
                int i5 = 0;
                for (java.lang.Object obj2 : this.KWHzl) {
                    if (i5 < 0) {
                        yDY.AYXKKw();
                    }
                    C31801mEk c31801mEk = (C31801mEk) obj2;
                    if (i5 != i) {
                        float fEZpvd = c31801mEk.EZpvd();
                        if (fKWHzl2 <= fEZpvd && fEZpvd <= fKWHzl) {
                            numAEQbTJ = C56443yFo.AEQbTJ(i5);
                            break;
                        }
                    }
                    i5++;
                }
                numAEQbTJ = null;
                OLrzqt(null);
                if (numAEQbTJ != null) {
                    float fKWHzl3 = this.KWHzl.get(numAEQbTJ.intValue()).KWHzl() - this.KWHzl.get(i).KWHzl();
                    if (fKWHzl3 > 0.0f) {
                        fKWHzl3 = this.KWHzl.get(numAEQbTJ.intValue()).AEQbTJ() - this.KWHzl.get(i).AEQbTJ();
                    }
                    Animatable<java.lang.Float, AnimationVector1D> animatable = this.copydefault.get(i);
                    java.lang.Float fOLrzqt = C56443yFo.OLrzqt(fKWHzl3);
                    SpringSpec springSpec = mET.KWHzl;
                    java.lang.Float fOLrzqt2 = C56443yFo.OLrzqt(f);
                    reorderableListState$settle$12.L$0 = this;
                    reorderableListState$settle$12.L$1 = numAEQbTJ;
                    reorderableListState$settle$12.I$0 = i;
                    reorderableListState$settle$12.label = 1;
                    if (Animatable.animateTo$default(animatable, fOLrzqt, springSpec, fOLrzqt2, null, reorderableListState$settle$12, 8, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    i2 = i;
                    meq = this;
                    meq.djBIcL.invoke(C56443yFo.AEQbTJ(i2), numAEQbTJ);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Animatable<java.lang.Float, AnimationVector1D> animatable2 = this.copydefault.get(i);
                    java.lang.Float fOLrzqt3 = C56443yFo.OLrzqt(0.0f);
                    SpringSpec springSpec2 = mET.KWHzl;
                    java.lang.Float fOLrzqt4 = C56443yFo.OLrzqt(f);
                    reorderableListState$settle$12.L$0 = this;
                    reorderableListState$settle$12.label = 2;
                    if (Animatable.animateTo$default(animatable2, fOLrzqt3, springSpec2, fOLrzqt4, null, reorderableListState$settle$12, 8, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    meq = this;
                }
            } else if (fKWHzl2 <= fKWHzl) {
                numAEQbTJ = null;
                OLrzqt(null);
                if (numAEQbTJ != null) {
                }
            } else {
                java.util.List<C31801mEk> list = this.KWHzl;
                for (int iAuCTel = yDY.AuCTel(list); -1 < iAuCTel; iAuCTel--) {
                    C31801mEk c31801mEk2 = list.get(iAuCTel);
                    if (iAuCTel != i) {
                        float fEZpvd2 = c31801mEk2.EZpvd();
                        if (fAEQbTJ <= fEZpvd2 && fEZpvd2 <= f2 + fKWHzl2) {
                            numAEQbTJ = C56443yFo.AEQbTJ(iAuCTel);
                            break;
                        }
                    }
                }
                numAEQbTJ = null;
                OLrzqt(null);
                if (numAEQbTJ != null) {
                }
            }
        } else if (i4 == 1) {
            int i6 = reorderableListState$settle$12.I$0;
            java.lang.Integer num = (java.lang.Integer) reorderableListState$settle$12.L$1;
            mEQ meq2 = (mEQ) reorderableListState$settle$12.L$0;
            C56391yDq.AEQbTJ(obj);
            numAEQbTJ = num;
            i2 = i6;
            meq = meq2;
            meq.djBIcL.invoke(C56443yFo.AEQbTJ(i2), numAEQbTJ);
            Unit unit2 = Unit.INSTANCE;
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            meq = (mEQ) reorderableListState$settle$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        meq.EZpvd((java.lang.Integer) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Integer OLrzqt() {
        return (java.lang.Integer) this.EZpvd.getValue();
    }

    public final void OLrzqt(java.lang.Integer num) {
        this.EZpvd.setValue(num);
    }

    public final void EZpvd(java.lang.Integer num) {
        this.AEQbTJ.setValue(num);
    }
}
