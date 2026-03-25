package com.okinc.auth.impl.twofactorauth.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.okinc.account.api.model.security.otp.OtpState;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6659aTX;
import o.AbstractC6733aUt;
import o.AbstractC8293azx;
import o.C33069mpW;
import o.C33129mqd;
import o.C33548myY;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class OtpInputFragment$registerOtpStateFlowCollector$2 extends SuspendLambda implements Function2<OtpState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OtpInputFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpInputFragment$registerOtpStateFlowCollector$2(OtpInputFragment otpInputFragment, Continuation<? super OtpInputFragment$registerOtpStateFlowCollector$2> continuation) {
        super(2, continuation);
        this.this$0 = otpInputFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OtpInputFragment$registerOtpStateFlowCollector$2 otpInputFragment$registerOtpStateFlowCollector$2 = new OtpInputFragment$registerOtpStateFlowCollector$2(this.this$0, continuation);
        otpInputFragment$registerOtpStateFlowCollector$2.L$0 = obj;
        return otpInputFragment$registerOtpStateFlowCollector$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OtpState otpState, Continuation<? super Unit> continuation) {
        return ((OtpInputFragment$registerOtpStateFlowCollector$2) create(otpState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: kotlin.jvm.functions.Function1<com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: kotlin.jvm.functions.Function1<com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        View next;
        View next2;
        UserInfo info;
        UserInfo info2;
        AbstractC6659aTX.Activity activity;
        Function1<OtpState.NewError, Boolean> function1KWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OtpState otpState = (OtpState) this.L$0;
            AbstractC8293azx abstractC8293azx = this.this$0.gEmmrt;
            str = "";
            String email = null;
            Object obj2 = null;
            AbstractC6659aTX abstractC6659aTX = null;
            toastEmail = null;
            String toastEmail = null;
            email = null;
            if (abstractC8293azx == null) {
                Intrinsics.gEmmrt("");
                abstractC8293azx = null;
            }
            LinearLayout linearLayout = abstractC8293azx.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_NEW_EMAIL")) {
                    break;
                }
            }
            View view = next;
            C33548myY c33548myY = view != null ? (C33548myY) view.findViewById(C8206ayP.StateListAnimator.gtCCJH) : null;
            AbstractC8293azx abstractC8293azx2 = this.this$0.gEmmrt;
            if (abstractC8293azx2 == null) {
                Intrinsics.gEmmrt("");
                abstractC8293azx2 = null;
            }
            LinearLayout linearLayout2 = abstractC8293azx2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            Iterator<View> it2 = ViewGroupKt.getChildren(linearLayout2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (Intrinsics.EZpvd(next2.getTag(), (Object) "TAG_OLD_EMAIL")) {
                    break;
                }
            }
            View view2 = next2;
            C33548myY c33548myY2 = view2 != null ? (C33548myY) view2.findViewById(C8206ayP.StateListAnimator.gtCCJH) : null;
            if (otpState instanceof OtpState.NewError) {
                if (c33548myY != null) {
                    c33548myY.EZpvd();
                }
                List<AbstractC6659aTX> value = this.this$0.djBIcL().AEQbTJ().getValue();
                if (value != null) {
                    Iterator<T> it3 = value.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (((AbstractC6659aTX) next3) instanceof AbstractC6659aTX.Activity) {
                            obj2 = next3;
                            break;
                        }
                    }
                    abstractC6659aTX = (AbstractC6659aTX) obj2;
                }
                if ((abstractC6659aTX instanceof AbstractC6659aTX.Activity) && (function1KWHzl = (activity = (AbstractC6659aTX.Activity) abstractC6659aTX).KWHzl()) != 0 && ((Boolean) function1KWHzl.invoke(otpState)).booleanValue() && activity.EZpvd() != null) {
                    activity.EZpvd().invoke(otpState);
                } else {
                    C55326xho.toast$default(((OtpState.NewError) otpState).getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (Intrinsics.EZpvd(otpState, OtpState.NewLoading.INSTANCE)) {
                if (c33548myY != null) {
                    c33548myY.copydefault();
                }
            } else if (otpState instanceof OtpState.NewSuccess) {
                OtpInputFragment otpInputFragment = this.this$0;
                String value2 = otpInputFragment.djBIcL().values().getValue();
                String strOLrzqt = otpInputFragment.OLrzqt(value2 != null ? value2 : "");
                C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.RTWSvT) + " " + strOLrzqt, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (otpState instanceof OtpState.OldError) {
                if (c33548myY2 != null) {
                    c33548myY2.EZpvd();
                }
                OtpState.OldError oldError = (OtpState.OldError) otpState;
                if (oldError.getMsg().length() > 0) {
                    C55326xho.toast$default(oldError.getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (Intrinsics.EZpvd(otpState, OtpState.OldLoading.INSTANCE)) {
                if (c33548myY2 != null) {
                    c33548myY2.copydefault();
                }
            } else if (otpState instanceof OtpState.OldSuccess) {
                AbstractC6733aUt abstractC6733aUtAuCTel = this.this$0.djBIcL().AuCTel();
                if (Intrinsics.EZpvd(abstractC6733aUtAuCTel, AbstractC6733aUt.StateListAnimator.KWHzl)) {
                    User userOLrzqt = this.this$0.AhwBna().OLrzqt();
                    if (userOLrzqt != null && (info2 = userOLrzqt.getInfo()) != null) {
                        toastEmail = info2.getToastEmail();
                    }
                    if (toastEmail != null) {
                        str = toastEmail;
                    }
                } else if ((abstractC6733aUtAuCTel instanceof AbstractC6733aUt.PendingIntent) || (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.Application)) {
                    String value3 = this.this$0.djBIcL().fIwbmz().getValue();
                    if (value3 == null) {
                        value3 = "";
                    }
                    User userOLrzqt2 = this.this$0.AhwBna().OLrzqt();
                    if (userOLrzqt2 != null && (info = userOLrzqt2.getInfo()) != null) {
                        email = info.getEmail();
                    }
                    if (email == null) {
                        email = "";
                    }
                    if (C33129mqd.OLrzqt((CharSequence) value3)) {
                        str = value3;
                    } else if (C33129mqd.OLrzqt((CharSequence) email)) {
                        str = email;
                    }
                    if (C33129mqd.OLrzqt((CharSequence) str)) {
                        C55326xho.toast$default(C33069mpW.copydefault(this.this$0, C8206ayP.Dialog.DQzvGNdrmXxudrmXxu, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maskedEmail", str))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    } else {
                        C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.RgLUBD), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.RTWSvT) + " " + str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
