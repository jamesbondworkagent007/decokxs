package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47198tlX;
import o.C47225tly;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tlX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47198tlX {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.tlX$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tlX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.util.List<java.lang.Double> AEQbTJ(int i) {
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(java.lang.Double.valueOf(C47198tlX.Companion.copydefault(i2)));
            }
            return arrayList;
        }

        public final double OLrzqt(int i) {
            return KWHzl(i);
        }

        public final double KWHzl(int i) {
            int iMin = java.lang.Math.min(i, 10);
            double dCopydefault = (((double) iMin) * (copydefault(iMin) + 1.0d)) / 2.0d;
            return i > 10 ? dCopydefault + (((double) (i - 10)) * copydefault(i)) : dCopydefault;
        }

        public final double copydefault(int i) {
            return 1.0d - (((double) java.lang.Math.min(10, i)) * 0.001d);
        }

        /* JADX INFO: renamed from: o.tlX$Activity$ActionBar */
        public static abstract class ActionBar<T extends InterfaceC47221tlu> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tlX.Activity.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: o.tlX$Activity$ActionBar$Activity, reason: collision with other inner class name */
            public static final class C0964Activity extends ActionBar<InterfaceC47221tlu> {
                public static final C0964Activity KWHzl = new C0964Activity();

                private C0964Activity() {
                    super(null);
                }
            }

            private ActionBar() {
            }

            /* JADX INFO: renamed from: o.tlX$Activity$ActionBar$ActionBar, reason: collision with other inner class name */
            public static final class C0963ActionBar extends ActionBar<InterfaceC47221tlu> {
                public static final C0963ActionBar copydefault = new C0963ActionBar();

                private C0963ActionBar() {
                    super(null);
                }
            }

            public final Function1<T, java.lang.Boolean> EZpvd() {
                if (this instanceof C0964Activity) {
                    return new Function1() { // from class: o.tlT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.EZpvd((InterfaceC47221tlu) obj));
                        }
                    };
                }
                if (this instanceof C0963ActionBar) {
                    return new Function1() { // from class: o.tlU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.KWHzl((InterfaceC47221tlu) obj));
                        }
                    };
                }
                throw new NoWhenBranchMatchedException();
            }

            public static final boolean EZpvd(InterfaceC47221tlu interfaceC47221tlu) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                return interfaceC47221tlu.getPrimarySimilarity() >= C47225tly.ActionBar.KWHzl.AEQbTJ();
            }

            public static final boolean KWHzl(InterfaceC47221tlu interfaceC47221tlu) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                double primarySimilarity = interfaceC47221tlu.getPrimarySimilarity();
                C47225tly.ActionBar actionBar = C47225tly.ActionBar.KWHzl;
                return primarySimilarity < actionBar.AEQbTJ() && interfaceC47221tlu.getSecondarySimilarity() >= actionBar.EZpvd();
            }

            public static final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
                return str == null || str2 == null ? str != null : !C47225tly.ActionBar.KWHzl.copydefault() ? str.compareTo(str2) >= 0 : str.compareTo(str2) <= 0;
            }

            public final java.util.List<Function2<T, T, java.lang.Boolean>> copydefault() {
                if (this instanceof C0964Activity) {
                    return yDY.gEmmrt(new Function2() { // from class: o.tlZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.AYXKKw((InterfaceC47221tlu) obj, (InterfaceC47221tlu) obj2));
                        }
                    }, new Function2() { // from class: o.tmc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.djBIcL((InterfaceC47221tlu) obj, (InterfaceC47221tlu) obj2));
                        }
                    }, new Function2() { // from class: o.tlY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.gEmmrt((InterfaceC47221tlu) obj, (InterfaceC47221tlu) obj2));
                        }
                    });
                }
                if (!(this instanceof C0963ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                return yDY.gEmmrt(new Function2() { // from class: o.tmb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.AhwBna((InterfaceC47221tlu) obj, (InterfaceC47221tlu) obj2));
                    }
                }, new Function2() { // from class: o.tma
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(C47198tlX.Activity.ActionBar.valueOf((InterfaceC47221tlu) obj, (InterfaceC47221tlu) obj2));
                    }
                });
            }

            public static final boolean AYXKKw(InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                Intrinsics.checkNotNullParameter(interfaceC47221tlu2, "");
                return interfaceC47221tlu.getPrimarySimilarity() > interfaceC47221tlu2.getPrimarySimilarity();
            }

            public static final boolean djBIcL(InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                Intrinsics.checkNotNullParameter(interfaceC47221tlu2, "");
                return OLrzqt(interfaceC47221tlu.getPrimary(), interfaceC47221tlu2.getPrimary());
            }

            public static final boolean gEmmrt(InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                Intrinsics.checkNotNullParameter(interfaceC47221tlu2, "");
                return OLrzqt(interfaceC47221tlu.getSecondary(), interfaceC47221tlu2.getSecondary());
            }

            public static final boolean AhwBna(InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                Intrinsics.checkNotNullParameter(interfaceC47221tlu2, "");
                return interfaceC47221tlu.getSecondarySimilarity() > interfaceC47221tlu2.getSecondarySimilarity();
            }

            public static final boolean valueOf(InterfaceC47221tlu interfaceC47221tlu, InterfaceC47221tlu interfaceC47221tlu2) {
                Intrinsics.checkNotNullParameter(interfaceC47221tlu, "");
                Intrinsics.checkNotNullParameter(interfaceC47221tlu2, "");
                return OLrzqt(interfaceC47221tlu.getSecondary(), interfaceC47221tlu2.getSecondary());
            }
        }

        public static final int OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
        }

        public final <T> java.util.List<T> OLrzqt(@NotNull java.util.List<? extends T> list, @NotNull final java.util.List<? extends Function2<? super T, ? super T, java.lang.Boolean>> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            final Function2 function2 = new Function2() { // from class: o.tlW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(C47198tlX.Activity.OLrzqt(list2, obj, obj2));
                }
            };
            return CollectionsKt___CollectionsKt.EZpvd(list, new java.util.Comparator() { // from class: o.tlV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return C47198tlX.Activity.OLrzqt(function2, obj, obj2);
                }
            });
        }

        public static final int OLrzqt(java.util.List list, java.lang.Object obj, java.lang.Object obj2) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                if (((java.lang.Boolean) function2.invoke(obj, obj2)).booleanValue()) {
                    return -1;
                }
                if (((java.lang.Boolean) function2.invoke(obj2, obj)).booleanValue()) {
                    return 1;
                }
            }
            return 0;
        }

        public final <T extends InterfaceC47221tlu> java.util.List<T> EZpvd(@NotNull java.util.List<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                InterfaceC47221tlu interfaceC47221tlu = (InterfaceC47221tlu) obj;
                double primarySimilarity = interfaceC47221tlu.getPrimarySimilarity();
                C47225tly.ActionBar actionBar = C47225tly.ActionBar.KWHzl;
                if (primarySimilarity >= actionBar.AEQbTJ() || interfaceC47221tlu.getSecondarySimilarity() >= actionBar.EZpvd()) {
                    arrayList.add(obj);
                }
            }
            java.util.List<ActionBar> listGEmmrt = yDY.gEmmrt(ActionBar.C0964Activity.KWHzl, ActionBar.C0963ActionBar.copydefault);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (ActionBar actionBar2 : listGEmmrt) {
                Activity activity = C47198tlX.Companion;
                Function1 function1EZpvd = actionBar2.EZpvd();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (((java.lang.Boolean) function1EZpvd.invoke(obj2)).booleanValue()) {
                        arrayList3.add(obj2);
                    }
                }
                C56406yEe.KWHzl(arrayList2, activity.OLrzqt(arrayList3, actionBar2.copydefault()));
            }
            return arrayList2;
        }
    }
}
