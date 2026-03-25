package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.core.util.SPUtils;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBV implements jBW {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jBV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.jBW
    public java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<LeaderBoardFilterModel>> continuation) {
        C25699jDb c25699jDbAEQbTJ = AEQbTJ();
        if (c25699jDbAEQbTJ != null) {
            return c25699jDbAEQbTJ.AEQbTJ();
        }
        return null;
    }

    @Override // o.jBW
    public java.lang.Object EZpvd(@NotNull final java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        java.lang.Boolean boolKWHzl;
        java.util.List<LeaderBoardFilterModel> listAEQbTJ;
        C25699jDb c25699jDbAEQbTJ = AEQbTJ();
        if (c25699jDbAEQbTJ == null || (listAEQbTJ = c25699jDbAEQbTJ.AEQbTJ()) == null) {
            boolKWHzl = null;
        } else {
            final Function1 function1 = new Function1() { // from class: o.jBU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(jBV.EZpvd(str, (LeaderBoardFilterModel) obj));
                }
            };
            boolKWHzl = C56443yFo.KWHzl(listAEQbTJ.removeIf(new java.util.function.Predicate() { // from class: o.jCa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return jBV.KWHzl(function1, obj);
                }
            }));
        }
        if (Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true))) {
            SPUtils.put("SP_KEY_LEADERBOARD_FILTER_DATA", c25699jDbAEQbTJ);
        }
        return C56443yFo.KWHzl(boolKWHzl != null ? boolKWHzl.booleanValue() : false);
    }

    public static final boolean EZpvd(java.lang.String str, LeaderBoardFilterModel leaderBoardFilterModel) {
        Intrinsics.checkNotNullParameter(leaderBoardFilterModel, "");
        return Intrinsics.EZpvd((java.lang.Object) leaderBoardFilterModel.KWHzl(), (java.lang.Object) str);
    }

    public static final boolean KWHzl(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    @Override // o.jBW
    public java.lang.Object copydefault(@NotNull LeaderBoardFilterModel leaderBoardFilterModel, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        boolean zAdd;
        C25699jDb c25699jDbAEQbTJ = AEQbTJ();
        if (c25699jDbAEQbTJ == null) {
            SPUtils.put("SP_KEY_LEADERBOARD_FILTER_DATA", new C25699jDb(yDY.AhwBna(leaderBoardFilterModel)));
            zAdd = true;
        } else {
            zAdd = c25699jDbAEQbTJ.AEQbTJ().add(leaderBoardFilterModel);
            SPUtils.put("SP_KEY_LEADERBOARD_FILTER_DATA", c25699jDbAEQbTJ);
        }
        return C56443yFo.KWHzl(zAdd);
    }

    @Override // o.jBW
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super LeaderBoardFilterModel> continuation) {
        java.util.List<LeaderBoardFilterModel> listAEQbTJ;
        C25699jDb c25699jDbAEQbTJ = AEQbTJ();
        java.lang.Object obj = null;
        if (c25699jDbAEQbTJ == null || (listAEQbTJ = c25699jDbAEQbTJ.AEQbTJ()) == null) {
            return null;
        }
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((LeaderBoardFilterModel) next).KWHzl(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (LeaderBoardFilterModel) obj;
    }

    public final C25699jDb AEQbTJ() {
        return (C25699jDb) SPUtils.getObject("SP_KEY_LEADERBOARD_FILTER_DATA", C25699jDb.class);
    }
}
