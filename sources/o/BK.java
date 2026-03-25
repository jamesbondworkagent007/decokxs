package o;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BK {
    public static final Activity EZpvd = new Activity(null);
    public static final BK KWHzl = BO.OLrzqt;
    public final java.util.Map<C52643wT, InterfaceC2861Ab> AEQbTJ;
    public final InterfaceC5053Cx OLrzqt;
    public final InterfaceC4949Bx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.BK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BK copy$default(BK bk, InterfaceC4949Bx interfaceC4949Bx, java.util.Map map, InterfaceC5053Cx interfaceC5053Cx, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC4949Bx = bk.copydefault;
        }
        if ((i & 2) != 0) {
            map = bk.AEQbTJ;
        }
        if ((i & 4) != 0) {
            interfaceC5053Cx = bk.OLrzqt;
        }
        return bk.copydefault(interfaceC4949Bx, map, interfaceC5053Cx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<C52643wT, InterfaceC2861Ab> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5053Cx KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BK copydefault(@NotNull InterfaceC4949Bx interfaceC4949Bx, @NotNull java.util.Map<C52643wT, ? extends InterfaceC2861Ab> map, @NotNull InterfaceC5053Cx interfaceC5053Cx) {
        Intrinsics.checkNotNullParameter(interfaceC4949Bx, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(interfaceC5053Cx, "");
        return new BK(interfaceC4949Bx, map, interfaceC5053Cx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC4949Bx copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BK)) {
            return false;
        }
        BK bk = (BK) obj;
        return Intrinsics.EZpvd(this.copydefault, bk.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, bk.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, bk.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OperationAuthConfig(authSchemeResolver=" + this.copydefault + ", configuredAuthSchemes=" + this.AEQbTJ + ", identityProviderConfig=" + this.OLrzqt + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<o.wT, ? extends o.Ab> */
    /* JADX WARN: Multi-variable type inference failed */
    public BK(@NotNull InterfaceC4949Bx interfaceC4949Bx, @NotNull java.util.Map<C52643wT, ? extends InterfaceC2861Ab> map, @NotNull InterfaceC5053Cx interfaceC5053Cx) {
        Intrinsics.checkNotNullParameter(interfaceC4949Bx, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(interfaceC5053Cx, "");
        this.copydefault = interfaceC4949Bx;
        this.AEQbTJ = map;
        this.OLrzqt = interfaceC5053Cx;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final BK OLrzqt() {
            return BK.KWHzl;
        }

        public final BK OLrzqt(@NotNull InterfaceC5053Cx interfaceC5053Cx, @NotNull InterfaceC2861Ab... interfaceC2861AbArr) {
            Intrinsics.checkNotNullParameter(interfaceC5053Cx, "");
            Intrinsics.checkNotNullParameter(interfaceC2861AbArr, "");
            TaskDescription taskDescription = new TaskDescription(interfaceC2861AbArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(interfaceC2861AbArr.length), 16));
            for (InterfaceC2861Ab interfaceC2861Ab : interfaceC2861AbArr) {
                linkedHashMap.put(C52643wT.copydefault(interfaceC2861Ab.copydefault()), interfaceC2861Ab);
            }
            return new BK(taskDescription, linkedHashMap, interfaceC5053Cx);
        }

        public static final class TaskDescription implements InterfaceC4949Bx {
            public final /* synthetic */ InterfaceC2861Ab[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(InterfaceC2861Ab[] interfaceC2861AbArr) {
                this.OLrzqt = interfaceC2861AbArr;
            }

            @Override // o.InterfaceC4949Bx
            public final java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
                InterfaceC2861Ab[] interfaceC2861AbArr = this.OLrzqt;
                java.util.ArrayList arrayList = new java.util.ArrayList(interfaceC2861AbArr.length);
                for (InterfaceC2861Ab interfaceC2861Ab : interfaceC2861AbArr) {
                    arrayList.add(C52589wR.m8783AuthOptionJh0Pmzk$default(interfaceC2861Ab.copydefault(), null, 2, null));
                }
                return arrayList;
            }
        }
    }
}
