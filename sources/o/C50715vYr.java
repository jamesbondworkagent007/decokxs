package o;

import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.biz.SignalBotTradingSign;
import com.okinc.unify_trade.bot.config.SignalBotActionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50715vYr implements InterfaceC47982uAp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = SignalBotSignParamsResult.$stable;
    public final java.lang.String AEQbTJ;
    public final SignalBotSignParamsResult copydefault;

    public C50715vYr(@NotNull java.lang.String str, SignalBotSignParamsResult signalBotSignParamsResult) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.copydefault = signalBotSignParamsResult;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        return C50714vYq.Companion.copydefault(SignalBotActionType.ACTION_MAPS.getConst(), this.AEQbTJ, this.copydefault);
    }

    /* JADX INFO: renamed from: o.vYr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ java.util.List getSignParamsContent$default(TaskDescription taskDescription, SignalBotSignParamsResult signalBotSignParamsResult, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalBotSignParamsResult = null;
            }
            return taskDescription.EZpvd(signalBotSignParamsResult, list);
        }

        public final java.util.List<C50715vYr> EZpvd(SignalBotSignParamsResult signalBotSignParamsResult, @NotNull java.util.List<SignalBotTradingSign> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String action = ((SignalBotTradingSign) it.next()).getAction();
                if (action == null) {
                    action = "";
                }
                arrayList.add(new C50715vYr(action, signalBotSignParamsResult));
            }
            return arrayList;
        }
    }
}
