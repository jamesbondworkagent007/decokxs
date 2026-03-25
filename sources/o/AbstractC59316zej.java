package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59316zej extends AbstractC59325zes {
    public static final Activity AEQbTJ = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59325zes EZpvd(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list) {
        return AEQbTJ.copydefault(interfaceC59315zei, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59316zej KWHzl(@NotNull java.util.Map<InterfaceC59315zei, ? extends InterfaceC59317zek> map) {
        return AEQbTJ.KWHzl(map);
    }

    public abstract InterfaceC59317zek AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei);

    @Override // o.AbstractC59325zes
    public InterfaceC59317zek copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return AEQbTJ(abstractC59233zdF.djBIcL());
    }

    /* JADX INFO: renamed from: o.zej$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zej.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59316zej KWHzl(@NotNull java.util.Map<InterfaceC59315zei, ? extends InterfaceC59317zek> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        private Activity() {
        }

        public static /* synthetic */ AbstractC59316zej createByConstructorsMap$default(Activity activity, java.util.Map map, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return activity.KWHzl(map, z);
        }

        /* JADX INFO: renamed from: o.zej$Activity$StateListAnimator */
        public static final class StateListAnimator extends AbstractC59316zej {
            public final /* synthetic */ java.util.Map<InterfaceC59315zei, InterfaceC59317zek> EZpvd;
            public final /* synthetic */ boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC59325zes
            public boolean copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<o.zei, ? extends o.zek> */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(java.util.Map<InterfaceC59315zei, ? extends InterfaceC59317zek> map, boolean z) {
                this.EZpvd = map;
                this.OLrzqt = z;
            }

            @Override // o.AbstractC59316zej
            public InterfaceC59317zek AEQbTJ(InterfaceC59315zei interfaceC59315zei) {
                Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
                return this.EZpvd.get(interfaceC59315zei);
            }

            @Override // o.AbstractC59325zes
            public boolean EZpvd() {
                return this.EZpvd.isEmpty();
            }
        }

        public final AbstractC59316zej KWHzl(@NotNull java.util.Map<InterfaceC59315zei, ? extends InterfaceC59317zek> map, boolean z) {
            Intrinsics.checkNotNullParameter(map, "");
            return new StateListAnimator(map, z);
        }

        public final AbstractC59325zes AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
            Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
            return copydefault(abstractC59233zdF.djBIcL(), abstractC59233zdF.bY_());
        }

        public final AbstractC59325zes copydefault(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list) {
            Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zei.copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) CollectionsKt___CollectionsKt.wlaJM(listCopydefault);
            if (interfaceC56691yOt != null && interfaceC56691yOt.fetchVPNInfo()) {
                java.util.List<InterfaceC56691yOt> listCopydefault2 = interfaceC59315zei.copydefault();
                Intrinsics.checkNotNullExpressionValue(listCopydefault2, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault2, 10));
                java.util.Iterator<T> it = listCopydefault2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC56691yOt) it.next()).fJNWhG());
                }
                return createByConstructorsMap$default(this, C56424yEw.copydefault(CollectionsKt___CollectionsKt.values(arrayList, list)), false, 2, null);
            }
            return new C59276zdw(listCopydefault, list);
        }
    }
}
