package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52643wT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IntBinaryOperator implements DoubleBinaryOperator {
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> KWHzl;
    public final java.util.List<InterfaceC52616wS> OLrzqt;
    public final Predicate copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntBinaryOperator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public IntBinaryOperator(Predicate predicate) {
        this.copydefault = predicate;
        C52643wT.StateListAnimator stateListAnimator = C52643wT.OLrzqt;
        this.KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt("AssociateSoftwareToken", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ChangePassword", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ConfirmDevice", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ConfirmForgotPassword", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ConfirmSignUp", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("DeleteUser", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("DeleteUserAttributes", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ForgetDevice", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ForgotPassword", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GetDevice", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GetUser", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GetUserAttributeVerificationCode", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("GlobalSignOut", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("InitiateAuth", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ListDevices", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("ResendConfirmationCode", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("RespondToAuthChallenge", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("RevokeToken", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("SetUserMFAPreference", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("SetUserSettings", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("SignUp", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("UpdateAuthEventFeedback", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("UpdateDeviceStatus", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("UpdateUserAttributes", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("VerifySoftwareToken", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))), C56390yDp.OLrzqt("VerifyUserAttribute", C56402yEa.EZpvd(C52589wR.m8783AuthOptionJh0Pmzk$default(stateListAnimator.copydefault(), null, 2, null))));
        this.OLrzqt = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.Predicate:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.Predicate) : (r1v0 o.Predicate))
 A[MD:(o.Predicate):void (m)] (LINE:10) call: o.IntBinaryOperator.<init>(o.Predicate):void type: THIS */
    public /* synthetic */ IntBinaryOperator(Predicate predicate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : predicate);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull Function function, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.KWHzl.get(function.EZpvd());
        if (list == null) {
            list = this.OLrzqt;
        }
        return list;
    }
}
