package o;

import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.bot.config.SignalBotActionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C50714vYq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50716vYs implements InterfaceC47982uAp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final java.lang.String AEQbTJ;
    public final SignalBotSignParamsResult OLrzqt;
    public final java.util.ArrayList<androidx.fragment.app.Fragment> copydefault;

    public C50716vYs(@NotNull java.lang.String str, SignalBotSignParamsResult signalBotSignParamsResult, @NotNull java.util.ArrayList<androidx.fragment.app.Fragment> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ = str;
        this.OLrzqt = signalBotSignParamsResult;
        this.copydefault = arrayList;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        androidx.fragment.app.Fragment fragmentNewInstance$default;
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) SignalBotActionType.ACTION_MAPS.getConst())) {
            fragmentNewInstance$default = new C50713vYp();
        } else {
            fragmentNewInstance$default = C50714vYq.StateListAnimator.newInstance$default(C50714vYq.Companion, SignalBotActionType.TV_ACTION_MAP.getConst(), null, this.OLrzqt, 2, null);
        }
        this.copydefault.add(fragmentNewInstance$default);
        return fragmentNewInstance$default;
    }

    /* JADX INFO: renamed from: o.vYs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ java.util.List getSignParamsAction$default(ActionBar actionBar, SignalBotSignParamsResult signalBotSignParamsResult, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                signalBotSignParamsResult = null;
            }
            return actionBar.KWHzl(signalBotSignParamsResult, arrayList);
        }

        public final java.util.List<C50716vYs> KWHzl(SignalBotSignParamsResult signalBotSignParamsResult, @NotNull java.util.ArrayList<androidx.fragment.app.Fragment> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            SignalBotActionType[] signalBotActionTypeArrValues = SignalBotActionType.values();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(signalBotActionTypeArrValues.length);
            for (SignalBotActionType signalBotActionType : signalBotActionTypeArrValues) {
                arrayList2.add(new C50716vYs(signalBotActionType.getConst(), signalBotSignParamsResult, arrayList));
            }
            return arrayList2;
        }
    }
}
