package o;

import com.okinc.unify_trade.biz.OptionInstrument;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40003qFt implements InterfaceC40516qYt {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final java.lang.String KWHzl;
    public final java.util.List<java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qFt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40003qFt copy$default(C40003qFt c40003qFt, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c40003qFt.copydefault;
        }
        if ((i & 2) != 0) {
            str = c40003qFt.KWHzl;
        }
        return c40003qFt.KWHzl(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40003qFt KWHzl(@NotNull java.util.List<java.lang.Long> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C40003qFt(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40003qFt)) {
            return false;
        }
        C40003qFt c40003qFt = (C40003qFt) obj;
        return Intrinsics.EZpvd(this.copydefault, c40003qFt.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c40003qFt.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultOptionsPeriodVo(periods=" + this.copydefault + ", optionCcy=" + this.KWHzl + ")";
    }

    public C40003qFt(@NotNull java.util.List<java.lang.Long> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = list;
        this.KWHzl = str;
    }

    /* JADX INFO: renamed from: o.qFt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qFt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String EZpvd(java.util.Map<java.lang.Long, ? extends java.util.List<C40005qFv>> map) {
            java.util.Collection<? extends java.util.List<C40005qFv>> collectionValues;
            java.util.List list;
            C40005qFv c40005qFv;
            OptionInstrument optionInstrumentKWHzl;
            java.lang.String instFamily;
            return (map == null || (collectionValues = map.values()) == null || (list = (java.util.List) CollectionsKt___CollectionsKt.djSkpj(collectionValues)) == null || (c40005qFv = (C40005qFv) CollectionsKt___CollectionsKt.wlaJM(list)) == null || (optionInstrumentKWHzl = c40005qFv.KWHzl()) == null || (instFamily = optionInstrumentKWHzl.getInstFamily()) == null) ? "BTC-USD" : instFamily;
        }

        public final C40003qFt KWHzl(@NotNull java.util.Map<java.lang.Long, ? extends java.util.List<C40005qFv>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new C40003qFt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.keySet()), C40003qFt.Companion.EZpvd(map));
        }
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40003qFt) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40003qFt) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
