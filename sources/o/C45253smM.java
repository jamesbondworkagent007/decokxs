package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.enums.LoginRouteCode;
import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45253smM implements InterfaceC45302snI {
    public final C45300snG OLrzqt;
    public final InterfaceC47278tmy copydefault;

    @yCM
    public C45253smM(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = c45300snG;
        this.copydefault = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonFeedbackBountyHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_Feedback_Click", false, new Function1() { // from class: o.smO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C45253smM.copydefault((EventParamsList) obj2);
            }
        }, 1, null);
        if (this.copydefault.values()) {
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            context.startActivity(ActivityC45583ssl.Companion.KWHzl(context, bool != null ? bool.booleanValue() : false));
            return Unit.INSTANCE;
        }
        java.lang.Object objCopydefault = this.OLrzqt.copydefault(CommonServiceKey.OpenLogin, context, new LoginRoute(null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(LoginRouteCode.REQUEST_LOGIN_AND_TO_FEEDBACK.getValue()), false, false, 1791, null), continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(MTPushConstants.PlatformNode.KEY_PLATFORM, "android", true);
        return Unit.INSTANCE;
    }
}
