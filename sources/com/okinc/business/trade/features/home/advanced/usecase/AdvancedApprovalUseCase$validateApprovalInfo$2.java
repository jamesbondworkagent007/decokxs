package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedApprovalUseCase$validateApprovalInfo$2;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.NeedApprove;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC58185ywX;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28146kQp;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.kQF;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedApprovalUseCase$validateApprovalInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ String $defiPlatformId;
    final /* synthetic */ DexMultiTokenInfoBean $fromToken;
    int label;
    final /* synthetic */ kQF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedApprovalUseCase$validateApprovalInfo$2(DexMultiTokenInfoBean dexMultiTokenInfoBean, kQF kqf, String str, String str2, Continuation<? super AdvancedApprovalUseCase$validateApprovalInfo$2> continuation) {
        super(2, continuation);
        this.$fromToken = dexMultiTokenInfoBean;
        this.this$0 = kqf;
        this.$amount = str;
        this.$defiPlatformId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedApprovalUseCase$validateApprovalInfo$2(this.$fromToken, this.this$0, this.$amount, this.$defiPlatformId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedApprovalUseCase$validateApprovalInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$fromToken;
            if (dexMultiTokenInfoBean == null || Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getNeedApprove(), (Object) NeedApprove.NO.getValue())) {
                this.this$0.AEQbTJ();
                return Unit.INSTANCE;
            }
            C28196kSl c28196kSl = this.this$0.gEmmrt;
            String chainId = this.$fromToken.getChainId();
            this.label = 1;
            obj = c28196kSl.KWHzl(chainId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                final kQF kqf = this.this$0;
                final String str = this.$amount;
                final String str2 = this.$defiPlatformId;
                final DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$fromToken;
                final Function1 function1 = new Function1() { // from class: o.kQN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$0(kqf, str, str2, dexMultiTokenInfoBean2, (java.util.Map) obj2);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ = ((AbstractC58185ywX) obj).AEQbTJ(new InterfaceC58229yxO() { // from class: o.kQL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$1(function1, obj2);
                    }
                });
                final kQF kqf2 = this.this$0;
                final Function1 function12 = new Function1() { // from class: o.kQO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$2(kqf2, (AdvancedApproveState) obj2);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kQM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        function12.invoke(obj2);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.kQK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$4((java.lang.Throwable) obj2);
                    }
                };
                abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kQS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        function13.invoke(obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        if (str3.length() == 0) {
            return Unit.INSTANCE;
        }
        this.this$0.copydefault();
        if (!this.this$0.EZpvd.valueOf()) {
            InterfaceC28146kQp interfaceC28146kQp = this.this$0.OLrzqt;
            String chainId2 = this.$fromToken.getChainId();
            String tokenContractAddress = this.$fromToken.getTokenContractAddress();
            this.label = 2;
            obj = interfaceC28146kQp.copydefault(str3, chainId2, tokenContractAddress, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            final kQF kqf3 = this.this$0;
            final String str4 = this.$amount;
            final String str22 = this.$defiPlatformId;
            final DexMultiTokenInfoBean dexMultiTokenInfoBean22 = this.$fromToken;
            final Function1 function14 = new Function1() { // from class: o.kQN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$0(kqf3, str4, str22, dexMultiTokenInfoBean22, (java.util.Map) obj2);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ2 = ((AbstractC58185ywX) obj).AEQbTJ(new InterfaceC58229yxO() { // from class: o.kQL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$1(function14, obj2);
                }
            });
            final kQF kqf22 = this.this$0;
            final Function1 function122 = new Function1() { // from class: o.kQO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$2(kqf22, (AdvancedApproveState) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.kQM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function122.invoke(obj2);
                }
            };
            final Function1 function132 = new Function1() { // from class: o.kQK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AdvancedApprovalUseCase$validateApprovalInfo$2.invokeSuspend$lambda$4((java.lang.Throwable) obj2);
                }
            };
            abstractC58185ywXAEQbTJ2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.kQS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function132.invoke(obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedApproveState invokeSuspend$lambda$1(Function1 function1, Object obj) {
        return (AdvancedApproveState) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedApproveState invokeSuspend$lambda$0(kQF kqf, String str, String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, Map map) {
        if (str == null) {
            str = "";
        }
        return kqf.EZpvd(str, (DeFiPlatformTokenApprovalInfo) map.get(str2), dexMultiTokenInfoBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(kQF kqf, AdvancedApproveState advancedApproveState) {
        kqf.copydefault.setValue(advancedApproveState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(Throwable th) {
        return Unit.INSTANCE;
    }
}
