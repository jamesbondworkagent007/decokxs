package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57914yrR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57978ysc {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> KWHzl = new Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.ReduceOperators$Companion$OR$1
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(@NotNull Collection<? extends InterfaceC57914yrR> collection) {
            boolean z;
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<? extends InterfaceC57914yrR> collection2 = collection;
            if (collection2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC57914yrR) it.next()).AEQbTJ()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    };
    public static final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> OLrzqt = new Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.ReduceOperators$Companion$AND$1
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(@NotNull Collection<? extends InterfaceC57914yrR> collection) {
            boolean z;
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<? extends InterfaceC57914yrR> collection2 = collection;
            if (collection2.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC57914yrR) it.next()).AEQbTJ()) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    public static final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> EZpvd = new Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.ReduceOperators$Companion$NONE$1
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(@NotNull Collection<? extends InterfaceC57914yrR> collection) {
            boolean z;
            Intrinsics.checkNotNullParameter(collection, "");
            Collection<? extends InterfaceC57914yrR> collection2 = collection;
            if (collection2.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = collection2.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC57914yrR) it.next()).AEQbTJ()) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };

    /* JADX INFO: renamed from: o.ysc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ysc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> OLrzqt() {
            return C57978ysc.KWHzl;
        }

        public final Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> AEQbTJ() {
            return C57978ysc.OLrzqt;
        }
    }
}
