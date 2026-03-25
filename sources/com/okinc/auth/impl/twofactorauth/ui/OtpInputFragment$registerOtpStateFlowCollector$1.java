package com.okinc.auth.impl.twofactorauth.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import androidx.core.view.ViewGroupKt;
import com.okinc.account.api.model.security.otp.OtpState;
import com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$registerOtpStateFlowCollector$1;
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
public final class OtpInputFragment$registerOtpStateFlowCollector$1 extends SuspendLambda implements Function2<OtpState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OtpInputFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpInputFragment$registerOtpStateFlowCollector$1(OtpInputFragment otpInputFragment, Continuation<? super OtpInputFragment$registerOtpStateFlowCollector$1> continuation) {
        super(2, continuation);
        this.this$0 = otpInputFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OtpInputFragment$registerOtpStateFlowCollector$1 otpInputFragment$registerOtpStateFlowCollector$1 = new OtpInputFragment$registerOtpStateFlowCollector$1(this.this$0, continuation);
        otpInputFragment$registerOtpStateFlowCollector$1.L$0 = obj;
        return otpInputFragment$registerOtpStateFlowCollector$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OtpState otpState, Continuation<? super Unit> continuation) {
        return ((OtpInputFragment$registerOtpStateFlowCollector$1) create(otpState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v74, resolved type: kotlin.jvm.functions.Function1<com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v79, resolved type: kotlin.jvm.functions.Function1<com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        View next;
        View next2;
        UserInfo info;
        View next3;
        View next4;
        AbstractC6659aTX.TaskDescription taskDescription;
        Function1<OtpState.NewError, Boolean> function1FJNWhG;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OtpState otpState = (OtpState) this.L$0;
            AbstractC8293azx abstractC8293azx = this.this$0.gEmmrt;
            strCopydefault = "";
            String phone = null;
            Object obj2 = null;
            AbstractC6659aTX abstractC6659aTX = null;
            phone = null;
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
                if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_NEW_MOBILE")) {
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
                if (Intrinsics.EZpvd(next2.getTag(), (Object) "TAG_OLD_MOBILE")) {
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
                        Object next5 = it3.next();
                        if (((AbstractC6659aTX) next5) instanceof AbstractC6659aTX.TaskDescription) {
                            obj2 = next5;
                            break;
                        }
                    }
                    abstractC6659aTX = (AbstractC6659aTX) obj2;
                }
                if ((abstractC6659aTX instanceof AbstractC6659aTX.TaskDescription) && (function1FJNWhG = (taskDescription = (AbstractC6659aTX.TaskDescription) abstractC6659aTX).fJNWhG()) != 0 && ((Boolean) function1FJNWhG.invoke(otpState)).booleanValue() && taskDescription.valueOf() != null) {
                    taskDescription.valueOf().invoke(otpState);
                } else {
                    C55326xho.toast$default(((OtpState.NewError) otpState).getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (Intrinsics.EZpvd(otpState, OtpState.NewLoading.INSTANCE)) {
                AbstractC8293azx abstractC8293azx3 = this.this$0.gEmmrt;
                if (abstractC8293azx3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC8293azx3 = null;
                }
                LinearLayout linearLayout3 = abstractC8293azx3.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                Iterator<View> it4 = ViewGroupKt.getChildren(linearLayout3).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (Intrinsics.EZpvd(next4.getTag(), (Object) "TAG_NEW_MOBILE")) {
                        break;
                    }
                }
                View view3 = next4;
                final LinearLayout linearLayout4 = view3 != null ? (LinearLayout) view3.findViewById(C8206ayP.StateListAnimator.fkESqH) : null;
                if (c33548myY != null) {
                    final OtpInputFragment otpInputFragment = this.this$0;
                    c33548myY.KWHzl(new C33548myY.Application() { // from class: o.aUn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.C33548myY.Application
                        public final void EZpvd() {
                            OtpInputFragment$registerOtpStateFlowCollector$1.invokeSuspend$lambda$4(otpInputFragment, linearLayout4);
                        }
                    });
                }
            } else if (otpState instanceof OtpState.NewSuccess) {
                String value2 = this.this$0.djBIcL().fJNWhG().getValue();
                String strCopydefault2 = value2 != null ? this.this$0.copydefault(value2) : null;
                strCopydefault = strCopydefault2 != null ? strCopydefault2 : "";
                Integer msgType = ((OtpState.NewSuccess) otpState).getMsgType();
                if (msgType != null && msgType.intValue() == 1) {
                    C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.DQzvGN) + "\n" + strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else {
                    C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.aJZHYI) + " " + strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (otpState instanceof OtpState.OldError) {
                if (c33548myY2 != null) {
                    c33548myY2.EZpvd();
                }
                OtpState.OldError oldError = (OtpState.OldError) otpState;
                if (oldError.getMsg().length() > 0) {
                    C55326xho.toast$default(oldError.getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (Intrinsics.EZpvd(otpState, OtpState.OldLoading.INSTANCE)) {
                AbstractC8293azx abstractC8293azx4 = this.this$0.gEmmrt;
                if (abstractC8293azx4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC8293azx4 = null;
                }
                LinearLayout linearLayout5 = abstractC8293azx4.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                Iterator<View> it5 = ViewGroupKt.getChildren(linearLayout5).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it5.next();
                    if (Intrinsics.EZpvd(next3.getTag(), (Object) "TAG_OLD_MOBILE")) {
                        break;
                    }
                }
                View view4 = next3;
                final LinearLayout linearLayout6 = view4 != null ? (LinearLayout) view4.findViewById(C8206ayP.StateListAnimator.fkESqH) : null;
                if (c33548myY2 != null) {
                    final OtpInputFragment otpInputFragment2 = this.this$0;
                    c33548myY2.KWHzl(new C33548myY.Application() { // from class: o.aUm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.C33548myY.Application
                        public final void EZpvd() {
                            OtpInputFragment$registerOtpStateFlowCollector$1.invokeSuspend$lambda$6(otpInputFragment2, linearLayout6);
                        }
                    });
                }
            } else {
                if (!(otpState instanceof OtpState.OldSuccess)) {
                    throw new NoWhenBranchMatchedException();
                }
                User userOLrzqt = this.this$0.AhwBna().OLrzqt();
                if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null) {
                    phone = info.getPhone();
                }
                if (phone == null) {
                    phone = "";
                }
                OtpState.OldSuccess oldSuccess = (OtpState.OldSuccess) otpState;
                Integer msgType2 = oldSuccess.getMsgType();
                if (msgType2 == null || msgType2.intValue() != 1 || (this.this$0.djBIcL().AuCTel() instanceof AbstractC6733aUt.Activity) || (this.this$0.djBIcL().AuCTel() instanceof AbstractC6733aUt.PendingIntent)) {
                    AbstractC6733aUt abstractC6733aUtAuCTel = this.this$0.djBIcL().AuCTel();
                    if (Intrinsics.EZpvd(abstractC6733aUtAuCTel, AbstractC6733aUt.StateListAnimator.KWHzl) || (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.TaskDescription)) {
                        strCopydefault = phone;
                    } else if ((abstractC6733aUtAuCTel instanceof AbstractC6733aUt.PendingIntent) || (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.Application)) {
                        String value3 = this.this$0.djBIcL().ejfBZ().getValue();
                        if (value3 == null) {
                            value3 = "";
                        }
                        if (C33129mqd.OLrzqt((CharSequence) value3)) {
                            phone = value3;
                        } else if (!C33129mqd.OLrzqt((CharSequence) phone)) {
                            phone = "";
                        }
                        if (C33129mqd.OLrzqt((CharSequence) phone)) {
                            Integer msgType3 = oldSuccess.getMsgType();
                            if (msgType3 != null && msgType3.intValue() == 1) {
                                strCopydefault = C33069mpW.copydefault(this.this$0, C8206ayP.Dialog.RbVjfb, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_PHONE, phone)));
                            } else if (msgType3 != null && msgType3.intValue() == 0) {
                                strCopydefault = C33069mpW.copydefault(this.this$0, C8206ayP.Dialog.DTeKQX, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("phonenumber", phone)));
                            }
                            C55326xho.toast$default(strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        } else {
                            C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.RgLUBD), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                    C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.aJZHYI) + " " + strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else {
                    C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.DQzvGN) + "\n" + phone, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(OtpInputFragment otpInputFragment, LinearLayout linearLayout) {
        if ((otpInputFragment.djBIcL().AuCTel() instanceof AbstractC6733aUt.ActionBar) || linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(OtpInputFragment otpInputFragment, LinearLayout linearLayout) {
        if ((otpInputFragment.djBIcL().AuCTel() instanceof AbstractC6733aUt.ActionBar) || linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }
}
