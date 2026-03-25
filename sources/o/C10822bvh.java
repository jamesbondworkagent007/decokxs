package o;

import com.okinc.business.defi.biz.net.bean.SupportCustomCoinChain;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10822bvh {
    public final java.util.ArrayList<C13924dbk> KWHzl;
    public final C10948byA OLrzqt;
    public final C13934dbu copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public C10822bvh(@NotNull C10948byA c10948byA, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.OLrzqt = c10948byA;
        this.copydefault = c13934dbu;
        this.KWHzl = new java.util.ArrayList<>();
    }

    /* JADX INFO: renamed from: o.bvh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bvh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C10822bvh getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.KWHzl(context);
        }

        public final C10822bvh KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).djBIcL();
        }
    }

    public final AbstractC58185ywX<java.util.ArrayList<C13924dbk>> copydefault() {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        if (this.KWHzl.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.copydefault.fetchVPNInfo(), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.bvi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10822bvh.KWHzl(this.EZpvd, (java.util.List) obj);
                }
            };
            abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bvj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10822bvh.KWHzl(function1, obj);
                }
            });
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(this.KWHzl);
        }
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return C33024moe.KWHzl(abstractC58185ywXKWHzl);
    }

    public static final java.util.ArrayList KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(C10822bvh c10822bvh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c10822bvh.KWHzl.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            C10854bwM c10854bwMKWHzl = c10822bvh.OLrzqt.KWHzl(((SupportCustomCoinChain) it.next()).getCoinId());
            if (c10854bwMKWHzl != null) {
                c10822bvh.KWHzl.add(new C13924dbk(c10854bwMKWHzl, c10854bwMKWHzl.AYXKKw()));
            }
        }
        return c10822bvh.KWHzl;
    }

    public final void OLrzqt() {
        this.KWHzl.clear();
    }
}
