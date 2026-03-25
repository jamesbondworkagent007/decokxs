package com.okinc.cruilib.compose.library.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.IntSize;
import com.okinc.cruilib.compose.library.reorderable.ProgrammaticScroller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mEF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ProgrammaticScroller {
    public final Function0<Float> AEQbTJ;
    public final Function2<LazyListItemInfo, LazyListItemInfo, Unit> AYXKKw;
    public final LazyListState AhwBna;
    public Job EZpvd;
    public Application KWHzl;
    public final boolean OLrzqt;
    public final Orientation copydefault;
    public final CoroutineScope djBIcL;
    public final float gEmmrt;
    public final HashSet<Object> valueOf;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ProgrammaticScrollDirection.values().length];
            try {
                iArr2[ProgrammaticScrollDirection.BACKWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProgrammaticScrollDirection.FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.LazyListItemInfo, ? super androidx.compose.foundation.lazy.LazyListItemInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ProgrammaticScroller(@NotNull LazyListState lazyListState, @NotNull CoroutineScope coroutineScope, @NotNull Orientation orientation, boolean z, float f, @NotNull HashSet<Object> hashSet, @NotNull Function0<Float> function0, @NotNull Function2<? super LazyListItemInfo, ? super LazyListItemInfo, Unit> function2) {
        Intrinsics.checkNotNullParameter(lazyListState, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        Intrinsics.checkNotNullParameter(hashSet, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AhwBna = lazyListState;
        this.djBIcL = coroutineScope;
        this.copydefault = orientation;
        this.OLrzqt = z;
        this.gEmmrt = f;
        this.valueOf = hashSet;
        this.AEQbTJ = function0;
        this.AYXKKw = function2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProgrammaticScrollDirection {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ProgrammaticScrollDirection[] $VALUES;
        public static final ProgrammaticScrollDirection BACKWARD = new ProgrammaticScrollDirection("BACKWARD", 0);
        public static final ProgrammaticScrollDirection FORWARD = new ProgrammaticScrollDirection("FORWARD", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ProgrammaticScrollDirection[] $values() {
            return new ProgrammaticScrollDirection[]{BACKWARD, FORWARD};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ProgrammaticScrollDirection> getEntries() {
            return $ENTRIES;
        }

        private ProgrammaticScrollDirection(String str, int i) {
        }

        static {
            ProgrammaticScrollDirection[] programmaticScrollDirectionArr$values = $values();
            $VALUES = programmaticScrollDirectionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(programmaticScrollDirectionArr$values);
        }

        public static ProgrammaticScrollDirection valueOf(String str) {
            return (ProgrammaticScrollDirection) Enum.valueOf(ProgrammaticScrollDirection.class, str);
        }

        public static ProgrammaticScrollDirection[] values() {
            return (ProgrammaticScrollDirection[]) $VALUES.clone();
        }
    }

    public static final class Application {
        public final ProgrammaticScrollDirection EZpvd;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ProgrammaticScrollDirection programmaticScrollDirection, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                programmaticScrollDirection = application.EZpvd;
            }
            if ((i & 2) != 0) {
                f = application.copydefault;
            }
            return application.AEQbTJ(programmaticScrollDirection, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull ProgrammaticScrollDirection programmaticScrollDirection, float f) {
            Intrinsics.checkNotNullParameter(programmaticScrollDirection, "");
            return new Application(programmaticScrollDirection, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.EZpvd == application.EZpvd && Float.compare(this.copydefault, application.copydefault) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + Float.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ScrollJobInfo(direction=" + this.EZpvd + ", speedMultiplier=" + this.copydefault + ")";
        }

        public Application(@NotNull ProgrammaticScrollDirection programmaticScrollDirection, float f) {
            Intrinsics.checkNotNullParameter(programmaticScrollDirection, "");
            this.EZpvd = programmaticScrollDirection;
            this.copydefault = f;
        }
    }

    public static /* synthetic */ void start$default(ProgrammaticScroller programmaticScroller, Function0 function0, ProgrammaticScrollDirection programmaticScrollDirection, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        programmaticScroller.copydefault(function0, programmaticScrollDirection, f);
    }

    public final void copydefault(@NotNull Function0<? extends LazyListItemInfo> function0, @NotNull ProgrammaticScrollDirection programmaticScrollDirection, float f) {
        int iM5573getHeightimpl;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(programmaticScrollDirection, "");
        Application application = new Application(programmaticScrollDirection, f);
        if (Intrinsics.EZpvd(this.KWHzl, application)) {
            return;
        }
        int i = Activity.EZpvd[this.copydefault.ordinal()];
        if (i == 1) {
            iM5573getHeightimpl = IntSize.m5573getHeightimpl(this.AhwBna.getLayoutInfo().mo774getViewportSizeYbymL2g());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM5573getHeightimpl = IntSize.m5574getWidthimpl(this.AhwBna.getLayoutInfo().mo774getViewportSizeYbymL2g());
        }
        float f2 = iM5573getHeightimpl;
        float f3 = this.gEmmrt;
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.KWHzl = null;
        if (AEQbTJ(programmaticScrollDirection)) {
            this.KWHzl = application;
            this.EZpvd = BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new ProgrammaticScroller$start$1(this, programmaticScrollDirection, f2 * f3 * f, function0, null), 3, null);
        }
    }

    public final boolean AEQbTJ(ProgrammaticScrollDirection programmaticScrollDirection) {
        int i = Activity.AEQbTJ[programmaticScrollDirection.ordinal()];
        if (i == 1) {
            return this.AhwBna.getCanScrollBackward();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.AhwBna.getCanScrollForward();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(Function0<? extends LazyListItemInfo> function0, ProgrammaticScrollDirection programmaticScrollDirection) {
        Boolean boolValueOf;
        LazyListItemInfo lazyListItemInfo;
        LazyListItemInfo lazyListItemInfoInvoke = function0.invoke();
        if (lazyListItemInfoInvoke == null) {
            return;
        }
        List<LazyListItemInfo> listAEQbTJ = AEQbTJ(this.AhwBna.getLayoutInfo(), this.copydefault, this.OLrzqt);
        int[] iArr = Activity.AEQbTJ;
        int i = iArr[programmaticScrollDirection.ordinal()];
        Object obj = null;
        if (i == 1) {
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ);
            if (lazyListItemInfo2 != null) {
                boolValueOf = Boolean.valueOf(lazyListItemInfoInvoke.getIndex() < lazyListItemInfo2.getIndex());
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) CollectionsKt___CollectionsKt.wlaJM(listAEQbTJ);
            if (lazyListItemInfo3 != null) {
                boolValueOf = Boolean.valueOf(lazyListItemInfoInvoke.getIndex() > lazyListItemInfo3.getIndex());
            } else {
                boolValueOf = null;
            }
        }
        if (boolValueOf == null || !boolValueOf.booleanValue()) {
            Function1 function1 = new Function1() { // from class: o.mEs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(ProgrammaticScroller.copydefault(this.OLrzqt, (LazyListItemInfo) obj2));
                }
            };
            int i2 = iArr[programmaticScrollDirection.ordinal()];
            if (i2 == 1) {
                Iterator<T> it = listAEQbTJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Boolean) function1.invoke(next)).booleanValue()) {
                        obj = next;
                        break;
                    }
                }
                lazyListItemInfo = (LazyListItemInfo) obj;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ListIterator<LazyListItemInfo> listIterator = listAEQbTJ.listIterator(listAEQbTJ.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    LazyListItemInfo lazyListItemInfoPrevious = listIterator.previous();
                    if (((Boolean) function1.invoke(lazyListItemInfoPrevious)).booleanValue()) {
                        obj = lazyListItemInfoPrevious;
                        break;
                    }
                }
                lazyListItemInfo = (LazyListItemInfo) obj;
            }
            if (lazyListItemInfo == null || lazyListItemInfo.getIndex() == lazyListItemInfoInvoke.getIndex()) {
                return;
            }
            this.AYXKKw.invoke(lazyListItemInfoInvoke, lazyListItemInfo);
        }
    }

    public static final boolean copydefault(ProgrammaticScroller programmaticScroller, LazyListItemInfo lazyListItemInfo) {
        Intrinsics.checkNotNullParameter(lazyListItemInfo, "");
        return programmaticScroller.valueOf.contains(lazyListItemInfo.getKey());
    }

    public final void OLrzqt() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.KWHzl = null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mEF.KWHzl(androidx.compose.foundation.lazy.LazyListLayoutInfo, androidx.compose.foundation.gestures.Orientation, boolean):kotlin.Pair */
    public final List<LazyListItemInfo> AEQbTJ(LazyListLayoutInfo lazyListLayoutInfo, Orientation orientation, boolean z) {
        Pair pairOLrzqt = mEF.OLrzqt(lazyListLayoutInfo, orientation, z);
        int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((Number) pairOLrzqt.component2()).intValue();
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList();
        for (Object obj : visibleItemsInfo) {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) obj;
            if (lazyListItemInfo.getOffset() >= iIntValue && lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() <= iIntValue2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
