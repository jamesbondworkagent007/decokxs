package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7381aik {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.util.List<kotlin.Pair<InterfaceC56387yDm<AbstractC7372aib>, InterfaceComponentCallbacks2C43266rlz>> OLrzqt = new java.util.ArrayList();

    /* JADX INFO: renamed from: o.aik$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aik.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz, @NotNull InterfaceC56387yDm<? extends AbstractC7372aib> interfaceC56387yDm) {
            Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
            Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
            C7381aik.OLrzqt.add(new kotlin.Pair(interfaceC56387yDm, interfaceComponentCallbacks2C43266rlz));
        }

        public final java.util.List<AbstractC7372aib> AEQbTJ() {
            java.util.List<kotlin.Pair> list = C7381aik.OLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (kotlin.Pair pair : list) {
                AbstractC7372aib abstractC7372aib = (AbstractC7372aib) ((InterfaceC56387yDm) pair.getFirst()).getValue();
                abstractC7372aib.bindModule((InterfaceComponentCallbacks2C43266rlz) pair.getSecond());
                arrayList.add(abstractC7372aib);
            }
            return arrayList;
        }
    }
}
