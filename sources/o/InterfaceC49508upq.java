package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49508upq extends InterfaceC43217rlC, InterfaceC48910ueb {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    androidx.fragment.app.Fragment EZpvd(java.lang.String str, Function1<? super java.lang.String, Unit> function1);

    void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super java.lang.Boolean, Unit> function1);

    androidx.fragment.app.Fragment KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map);

    androidx.fragment.app.Fragment KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.Boolean bool);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super BizInstrument> continuation);

    void KWHzl(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2);

    InterfaceC58217yxC OLrzqt(InterfaceC49503upl interfaceC49503upl);

    void OLrzqt(Function0<Unit> function0);

    androidx.fragment.app.Fragment copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map, java.lang.Boolean bool, java.lang.String str5);

    void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager);

    /* JADX INFO: renamed from: o.upq$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();
        public static final kotlin.Pair<java.lang.String, java.util.List<java.lang.String>> EZpvd = C56390yDp.OLrzqt("SWAP", C56402yEa.EZpvd("SWAP"));
        public static final java.lang.String KWHzl = "filterCondition";
        public static final kotlin.Pair<java.lang.String, java.util.List<java.lang.String>> OLrzqt = C56390yDp.OLrzqt("filterCondition", C56402yEa.EZpvd("SWAP"));
        public static final java.lang.String AEQbTJ = "trade_page";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return AEQbTJ;
        }

        private TaskDescription() {
        }

        public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> OLrzqt(@NotNull java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map) {
            Intrinsics.checkNotNullParameter(map, "");
            kotlin.Pair<java.lang.String, java.util.List<java.lang.String>> pair = OLrzqt;
            map.put(pair.getFirst(), pair.getSecond());
            kotlin.Pair<java.lang.String, java.util.List<java.lang.String>> pair2 = EZpvd;
            map.put(pair2.getFirst(), pair2.getSecond());
            return map;
        }
    }

    /* JADX INFO: renamed from: o.upq$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getSearchFragment$default(InterfaceC49508upq interfaceC49508upq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.HashMap map, java.lang.Boolean bool, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC49508upq.copydefault(str, str2, str3, str4, (i & 16) != 0 ? null : map, (i & 32) != 0 ? java.lang.Boolean.FALSE : bool, (i & 64) != 0 ? str2 : str5);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchFragment");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getSearchFragment$default(InterfaceC49508upq interfaceC49508upq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchFragment");
            }
            if ((i & 8) != 0) {
                map = null;
            }
            java.util.HashMap map2 = map;
            if ((i & 16) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return interfaceC49508upq.KWHzl(str, str2, str3, map2, bool);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getSearchNewFragment$default(InterfaceC49508upq interfaceC49508upq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.HashMap map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchNewFragment");
            }
            if ((i & 32) != 0) {
                map = null;
            }
            return interfaceC49508upq.KWHzl(str, str2, str3, str4, str5, map);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showDialog$default(InterfaceC49508upq interfaceC49508upq, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC49508upq.EZpvd(fragment, fragmentManager, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setShowCallBack$default(InterfaceC49508upq interfaceC49508upq, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShowCallBack");
            }
            if ((i & 1) != 0) {
                function0 = null;
            }
            interfaceC49508upq.OLrzqt((Function0<Unit>) function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.upq */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getNavigationSelectFragment$default(InterfaceC49508upq interfaceC49508upq, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNavigationSelectFragment");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return interfaceC49508upq.EZpvd(str, function1);
        }

        public static /* synthetic */ InterfaceC58217yxC openCoinSearch$default(InterfaceC49508upq interfaceC49508upq, InterfaceC49503upl interfaceC49503upl, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCoinSearch");
            }
            if ((i & 1) != 0) {
                interfaceC49503upl = null;
            }
            return interfaceC49508upq.OLrzqt(interfaceC49503upl);
        }

        public static /* synthetic */ java.lang.Object browseSelectFragment$default(InterfaceC49508upq interfaceC49508upq, java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: browseSelectFragment");
            }
            if ((i & 2) != 0) {
                str2 = InterfaceC49508upq.Companion.KWHzl();
            }
            return interfaceC49508upq.KWHzl(str, str2, fragmentManager, continuation);
        }
    }
}
