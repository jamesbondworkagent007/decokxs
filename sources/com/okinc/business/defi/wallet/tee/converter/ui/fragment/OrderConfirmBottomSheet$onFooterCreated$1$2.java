package com.okinc.business.defi.wallet.tee.converter.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onFooterCreated$1$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C13754dXa;
import o.C14451dlh;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C58156yvv;
import o.C8396bBt;
import o.C9748bbT;
import o.InterfaceC58227yxM;
import o.InterfaceC9740bbL;
import o.fUF;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class OrderConfirmBottomSheet$onFooterCreated$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C52794wYp $this_apply;
    int label;
    final /* synthetic */ fUF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmBottomSheet$onFooterCreated$1$2(fUF fuf, C52794wYp c52794wYp, Continuation<? super OrderConfirmBottomSheet$onFooterCreated$1$2> continuation) {
        super(2, continuation);
        this.this$0 = fuf;
        this.$this_apply = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderConfirmBottomSheet$onFooterCreated$1$2(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderConfirmBottomSheet$onFooterCreated$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onFooterCreated$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ C52794wYp $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fUF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fUF fuf, C52794wYp c52794wYp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fuf;
            this.$this_apply = c52794wYp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strDbNXlk;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final String str = (String) this.L$0;
                AbstractC12782ctV value = this.this$0.gEmmrt().fARcdN().getValue();
                if (value != null && (strDbNXlk = value.DbNXlk()) != null) {
                    SignDataArgs<?> signDataArgs = new SignDataArgs<>(strDbNXlk, null, this.this$0.gEmmrt().gEmmrt(), new SolanaMessageSignData(str, false, null, 6, null), null, null, null, null, null, null, C56443yFo.AEQbTJ(1), null, null, null, null, null, null, false, false, null, false, false, false, true, 8387570, null);
                    C8396bBt c8396bBt = C8396bBt.AEQbTJ;
                    boolean zOLrzqt = C14451dlh.EZpvd.OLrzqt();
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity == null) {
                        return Unit.INSTANCE;
                    }
                    AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtCopydefault = c8396bBt.copydefault(signDataArgs, zOLrzqt, activity, new InterfaceC9740bbL.TaskDescription() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet.onFooterCreated.1.2.1.3
                        @Override // o.InterfaceC9740bbL.TaskDescription
                        public void EZpvd() {
                        }

                        @Override // o.InterfaceC9740bbL.TaskDescription
                        public void copydefault() {
                        }
                    });
                    LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtCopydefault, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
                    final fUF fuf = this.this$0;
                    final C52794wYp c52794wYp = this.$this_apply;
                    final Function1 function1 = new Function1() { // from class: o.fUJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OrderConfirmBottomSheet$onFooterCreated$1$2.AnonymousClass1.invokeSuspend$lambda$0(fuf, c52794wYp, str, (ResponseData) obj2);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fUH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj2) {
                            function1.invoke(obj2);
                        }
                    };
                    final C52794wYp c52794wYp2 = this.$this_apply;
                    final fUF fuf2 = this.this$0;
                    final Function1 function12 = new Function1() { // from class: o.fUK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return OrderConfirmBottomSheet$onFooterCreated$1$2.AnonymousClass1.invokeSuspend$lambda$2(c52794wYp2, fuf2, (java.lang.Throwable) obj2);
                        }
                    };
                    abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fUQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj2) {
                            function12.invoke(obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(fUF fuf, C52794wYp c52794wYp, String str, ResponseData responseData) {
            if (responseData.getCode() == -5001) {
                LifecycleOwner viewLifecycleOwner = fuf.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1(fuf, str, responseData, null), 3, null);
                return Unit.INSTANCE;
            }
            c52794wYp.fIwbmz();
            fuf.gEmmrt().iwGUEr();
            int code = responseData.getCode();
            if (code != -5014) {
                switch (code) {
                    case -5007:
                        break;
                    case -5006:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.unregisterCallbackListener, 0, 1, (Object) null);
                        break;
                    case -5005:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.DRGLNw, 0, 1, (Object) null);
                        break;
                    case -5004:
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.sYcwUD, 0, 1, (Object) null);
                        break;
                    default:
                        if (responseData.getMsg().length() == 0) {
                            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (Object) null);
                        } else {
                            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (Object) null);
                        }
                        break;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(C52794wYp c52794wYp, fUF fuf, Throwable th) {
            c52794wYp.fIwbmz();
            fuf.gEmmrt().iwGUEr();
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.Dfm, 0, 1, (Object) null);
            Intrinsics.copydefault(th);
            pUU.AEQbTJ("OrderConfirmBottomSheet", th);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<String> sharedFlowFetchVPNInfo = this.this$0.gEmmrt().fetchVPNInfo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowFetchVPNInfo, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
