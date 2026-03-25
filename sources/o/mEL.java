package o;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.okinc.cruilib.compose.library.reorderable.ProgrammaticScroller;
import com.okinc.cruilib.compose.library.reorderable.ReorderableLazyListState$onDragStart$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableLazyListState$onDragStop$1;
import com.okinc.cruilib.compose.library.reorderable.ReorderableLazyListState$programmaticScroller$2;
import com.okinc.cruilib.compose.library.reorderable.ReorderableLazyListState$swapItems$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mEL {
    public final MutableIntState AEQbTJ;
    public final MutableState AYXKKw;
    public java.lang.Integer AhwBna;
    public final float AkhnZx;
    public final ProgrammaticScroller DbNXlk;
    public final MutableState EZpvd;
    public final MutableFloatState KWHzl;
    public float OLrzqt;
    public java.lang.Integer copydefault;
    public final Orientation djBIcL;
    public final LazyListState ejfBZ;
    public Animatable<java.lang.Float, AnimationVector1D> fetchVPNInfo;
    public final androidx.compose.runtime.State<Function2<LazyListItemInfo, LazyListItemInfo, Unit>> gEmmrt;
    public final CoroutineScope isConnected;
    public final boolean valueOf;
    public final java.util.HashSet<java.lang.Object> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.Object> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Orientation djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Animatable<java.lang.Float, AnimationVector1D> valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.LazyListItemInfo, ? super androidx.compose.foundation.lazy.LazyListItemInfo, kotlin.Unit>> */
    /* JADX WARN: Multi-variable type inference failed */
    public mEL(@NotNull LazyListState lazyListState, @NotNull CoroutineScope coroutineScope, @NotNull androidx.compose.runtime.State<? extends Function2<? super LazyListItemInfo, ? super LazyListItemInfo, Unit>> state, @NotNull Orientation orientation, boolean z, float f, float f2) {
        Intrinsics.checkNotNullParameter(lazyListState, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        this.ejfBZ = lazyListState;
        this.isConnected = coroutineScope;
        this.gEmmrt = state;
        this.djBIcL = orientation;
        this.valueOf = z;
        this.AkhnZx = f;
        this.EZpvd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.KWHzl = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.AEQbTJ = SnapshotIntStateKt.mutableIntStateOf(0);
        java.util.HashSet<java.lang.Object> hashSet = new java.util.HashSet<>();
        this.values = hashSet;
        this.DbNXlk = new ProgrammaticScroller(lazyListState, coroutineScope, orientation, z, f2, hashSet, new Function0() { // from class: o.mER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(mEL.gEmmrt(this.AEQbTJ));
            }
        }, new ReorderableLazyListState$programmaticScroller$2(this));
        this.AYXKKw = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.fetchVPNInfo = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    }

    public final java.lang.Integer KWHzl() {
        LazyListItemInfo lazyListItemInfoOLrzqt = OLrzqt();
        if (lazyListItemInfoOLrzqt != null) {
            return java.lang.Integer.valueOf(lazyListItemInfoOLrzqt.getIndex());
        }
        return null;
    }

    public final LazyListItemInfo OLrzqt() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.ejfBZ.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((LazyListItemInfo) next).getKey(), AEQbTJ())) {
                break;
            }
        }
        return (LazyListItemInfo) next;
    }

    public final float gEmmrt() {
        int iIntValue;
        LazyListItemInfo lazyListItemInfoOLrzqt = OLrzqt();
        if (lazyListItemInfoOLrzqt == null) {
            return 0.0f;
        }
        int index = lazyListItemInfoOLrzqt.getIndex();
        java.lang.Integer num = this.copydefault;
        if (num != null && index == num.intValue()) {
            this.AhwBna = null;
            iIntValue = lazyListItemInfoOLrzqt.getOffset();
        } else {
            java.lang.Integer num2 = this.AhwBna;
            iIntValue = num2 != null ? num2.intValue() : lazyListItemInfoOLrzqt.getOffset();
        }
        return (EZpvd() + copydefault()) - iIntValue;
    }

    public static final float gEmmrt(mEL mel) {
        return mel.gEmmrt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.Object obj, float f, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReorderableLazyListState$onDragStart$1 reorderableLazyListState$onDragStart$1;
        java.lang.Object next;
        LazyListItemInfo lazyListItemInfo;
        mEL mel;
        if (continuation instanceof ReorderableLazyListState$onDragStart$1) {
            reorderableLazyListState$onDragStart$1 = (ReorderableLazyListState$onDragStart$1) continuation;
            int i = reorderableLazyListState$onDragStart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reorderableLazyListState$onDragStart$1.label = i - Integer.MIN_VALUE;
            } else {
                reorderableLazyListState$onDragStart$1 = new ReorderableLazyListState$onDragStart$1(this, continuation);
            }
        }
        java.lang.Object obj2 = reorderableLazyListState$onDragStart$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = reorderableLazyListState$onDragStart$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            java.util.Iterator<T> it = this.ejfBZ.getLayoutInfo().getVisibleItemsInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(((LazyListItemInfo) next).getKey(), obj)) {
                    break;
                }
            }
            lazyListItemInfo = (LazyListItemInfo) next;
            if (lazyListItemInfo != null) {
                if (lazyListItemInfo.getOffset() < 0) {
                    LazyListState lazyListState = this.ejfBZ;
                    float offset = lazyListItemInfo.getOffset();
                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    reorderableLazyListState$onDragStart$1.L$0 = this;
                    reorderableLazyListState$onDragStart$1.L$1 = obj;
                    reorderableLazyListState$onDragStart$1.L$2 = lazyListItemInfo;
                    reorderableLazyListState$onDragStart$1.L$3 = lazyListItemInfo;
                    reorderableLazyListState$onDragStart$1.F$0 = f;
                    reorderableLazyListState$onDragStart$1.label = 1;
                    if (ScrollExtensionsKt.animateScrollBy(lazyListState, offset, springSpecSpring$default, reorderableLazyListState$onDragStart$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mel = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f = reorderableLazyListState$onDragStart$1.F$0;
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) reorderableLazyListState$onDragStart$1.L$3;
        java.lang.Object obj3 = reorderableLazyListState$onDragStart$1.L$1;
        mel = (mEL) reorderableLazyListState$onDragStart$1.L$0;
        C56391yDq.AEQbTJ(obj2);
        lazyListItemInfo = lazyListItemInfo2;
        obj = obj3;
        mel.OLrzqt(obj);
        mel.copydefault(lazyListItemInfo.getOffset());
        mel.OLrzqt = f;
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        if (KWHzl() != null) {
            KWHzl(AEQbTJ());
            BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new ReorderableLazyListState$onDragStop$1(this, gEmmrt(), null), 3, null);
        }
        copydefault(0.0f);
        OLrzqt((java.lang.Object) null);
        copydefault(0);
        this.DbNXlk.OLrzqt();
        this.copydefault = null;
        this.AhwBna = null;
    }

    public final void KWHzl(float f) {
        java.lang.Object next;
        copydefault(copydefault() + f);
        LazyListItemInfo lazyListItemInfoOLrzqt = OLrzqt();
        if (lazyListItemInfoOLrzqt == null) {
            return;
        }
        float offset = lazyListItemInfoOLrzqt.getOffset() + gEmmrt();
        kotlin.Pair pairOLrzqt = mEF.OLrzqt(this.ejfBZ.getLayoutInfo(), this.djBIcL, this.valueOf);
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        if (!this.DbNXlk.copydefault()) {
            float size = lazyListItemInfoOLrzqt.getSize();
            java.util.Iterator<T> it = this.ejfBZ.getLayoutInfo().getVisibleItemsInfo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                float fEZpvd = EZpvd(lazyListItemInfo);
                if (offset <= fEZpvd && fEZpvd <= size + offset && lazyListItemInfoOLrzqt.getIndex() != lazyListItemInfo.getIndex() && this.values.contains(lazyListItemInfo.getKey()) && lazyListItemInfo.getOffset() >= iIntValue && lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() <= iIntValue2) {
                    break;
                }
            }
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next;
            if (lazyListItemInfo2 != null) {
                copydefault(lazyListItemInfoOLrzqt, lazyListItemInfo2);
            }
        }
        float mainAxisItemSpacing = offset + this.ejfBZ.getLayoutInfo().getMainAxisItemSpacing();
        float f2 = mainAxisItemSpacing - iIntValue;
        float f3 = iIntValue2 - mainAxisItemSpacing;
        float f4 = this.AkhnZx;
        if (f2 < f4) {
            this.DbNXlk.copydefault(new Function0() { // from class: o.mEN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mEL.AYXKKw(this.AEQbTJ);
                }
            }, ProgrammaticScroller.ProgrammaticScrollDirection.BACKWARD, OLrzqt(f2));
        } else if (f3 < f4) {
            this.DbNXlk.copydefault(new Function0() { // from class: o.mEO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return mEL.AhwBna(this.copydefault);
                }
            }, ProgrammaticScroller.ProgrammaticScrollDirection.FORWARD, OLrzqt(f3));
        } else {
            this.DbNXlk.OLrzqt();
        }
    }

    public static final LazyListItemInfo AYXKKw(mEL mel) {
        return mel.OLrzqt();
    }

    public static final LazyListItemInfo AhwBna(mEL mel) {
        return mel.OLrzqt();
    }

    public final void copydefault(LazyListItemInfo lazyListItemInfo, LazyListItemInfo lazyListItemInfo2) {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        if (lazyListItemInfo.getIndex() == lazyListItemInfo2.getIndex()) {
            return;
        }
        if (lazyListItemInfo2.getIndex() > lazyListItemInfo.getIndex()) {
            numValueOf = java.lang.Integer.valueOf((lazyListItemInfo2.getSize() + lazyListItemInfo2.getOffset()) - lazyListItemInfo.getSize());
        } else {
            numValueOf = java.lang.Integer.valueOf(lazyListItemInfo2.getOffset());
        }
        this.AhwBna = numValueOf;
        this.copydefault = java.lang.Integer.valueOf(lazyListItemInfo2.getIndex());
        if (lazyListItemInfo2.getIndex() == this.ejfBZ.getFirstVisibleItemIndex()) {
            numValueOf2 = java.lang.Integer.valueOf(lazyListItemInfo.getIndex());
        } else {
            numValueOf2 = lazyListItemInfo.getIndex() == this.ejfBZ.getFirstVisibleItemIndex() ? java.lang.Integer.valueOf(lazyListItemInfo2.getIndex()) : null;
        }
        java.lang.Integer num = numValueOf2;
        if (num != null) {
            BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new ReorderableLazyListState$swapItems$1(this, num, lazyListItemInfo, lazyListItemInfo2, null), 3, null);
        } else {
            this.gEmmrt.getValue().invoke(lazyListItemInfo, lazyListItemInfo2);
        }
    }

    public final androidx.compose.runtime.State<java.lang.Boolean> DbNXlk() {
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mEL.valueOf(this.AEQbTJ));
            }
        });
    }

    public static final boolean valueOf(mEL mel) {
        return mel.AEQbTJ() != null;
    }

    public final androidx.compose.runtime.State<java.lang.Boolean> AEQbTJ(@NotNull final java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return SnapshotStateKt.derivedStateOf(new Function0() { // from class: o.mES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(mEL.copydefault(obj, this));
            }
        });
    }

    public static final boolean copydefault(java.lang.Object obj, mEL mel) {
        return Intrinsics.EZpvd(obj, mel.AEQbTJ());
    }

    public final float OLrzqt(float f) {
        float f2 = this.AkhnZx;
        return (1 - C56548yJl.KWHzl((f + f2) / (f2 * 2), 0.0f, 1.0f)) * 10;
    }

    public final float EZpvd(LazyListItemInfo lazyListItemInfo) {
        return lazyListItemInfo.getOffset() + (lazyListItemInfo.getSize() / 2.0f);
    }

    public final java.lang.Object AEQbTJ() {
        return this.EZpvd.getValue();
    }

    public final void OLrzqt(java.lang.Object obj) {
        this.EZpvd.setValue(obj);
    }

    public final float copydefault() {
        return this.KWHzl.getFloatValue();
    }

    public final void copydefault(float f) {
        this.KWHzl.setFloatValue(f);
    }

    public final int EZpvd() {
        return this.AEQbTJ.getIntValue();
    }

    public final void copydefault(int i) {
        this.AEQbTJ.setIntValue(i);
    }

    public final java.lang.Object AYXKKw() {
        return this.AYXKKw.getValue();
    }

    public final void KWHzl(java.lang.Object obj) {
        this.AYXKKw.setValue(obj);
    }
}
