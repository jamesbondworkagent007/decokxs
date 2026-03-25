package com.okinc.business.defi.wallet;

import android.view.View;
import com.okinc.business.defi.biz.core.error.OKWException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C12827cuN;
import o.C13754dXa;
import o.C33084mpl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6777aVl;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $showErrorDialogKey;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1(String str, DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1> continuation) {
        super(2, continuation);
        this.$showErrorDialogKey = str;
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1(this.$showErrorDialogKey, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$showEaterAddressDialogIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        DefiWalletMainActivity defiWalletMainActivity;
        List<AbstractC12782ctV> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defiWalletMainActivity = (DefiWalletMainActivity) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                str = this.$showErrorDialogKey;
                DefiWalletMainActivity defiWalletMainActivity2 = this.this$0;
                Result.Application application = Result.Companion;
                C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
                this.L$0 = str;
                this.L$1 = defiWalletMainActivity2;
                this.label = 1;
                Object objCopydefault2 = instance$default.copydefault(this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                defiWalletMainActivity = defiWalletMainActivity2;
                obj = objCopydefault2;
            }
            list = (List) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AbstractC12782ctV abstractC12782ctV : list) {
                if (abstractC12782ctV.DbNXlk("0x3f17f1962b36e491b30a40b2405849e597ba5fb5") || abstractC12782ctV.DbNXlk("TFipFnHXxvQqMvJg9sN92rgMxHAyN9LKA4") || abstractC12782ctV.DbNXlk("ronin:3f17f1962b36e491b30a40b2405849e597ba5fb5") || abstractC12782ctV.DbNXlk("one18utlr93txmjfrvc2gzeyqkzfuktm5ha4teutkl") || abstractC12782ctV.DbNXlk("hx1f1967693048551eb9042a8d0a057afbd75e81e0")) {
                    C33084mpl.AEQbTJ(str, C56443yFo.KWHzl(false));
                    final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(defiWalletMainActivity);
                    viewOnClickListenerC54939xaY.EZpvd(defiWalletMainActivity.getString(C13754dXa.FragmentManager.ComponentActivity2));
                    String string = defiWalletMainActivity.getString(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda1);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) string, new View.OnClickListener() { // from class: o.dWY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            viewOnClickListenerC54939xaY.dismiss();
                        }
                    });
                    viewOnClickListenerC54939xaY.show();
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    DefiWalletMainActivity defiWalletMainActivity3 = this.this$0;
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ(defiWalletMainActivity3.getTAG(), "showEaterAddressDialogIfNeeded error", thM7380exceptionOrNullimpl);
                        C6777aVl.Companion.OLrzqt(new OKWException("showEaterAddressDialogIfNeeded error", thM7380exceptionOrNullimpl), null, C56443yFo.KWHzl(true));
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
