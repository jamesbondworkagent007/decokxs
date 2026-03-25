package com.okinc.business.defi.wallet.smart;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.smart.AACreateUtils$createNormalOrTeeOrAAAccount$1$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.ActivityC17792fSl;
import o.C13458dMb;
import o.C13754dXa;
import o.C13758dXe;
import o.C13786dYf;
import o.C13788dYh;
import o.C14140dfo;
import o.C17922fXg;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.DialogC55112xdm;
import o.InterfaceC58227yxM;
import o.fNC;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$createNormalOrTeeOrAAAccount$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<WalletCreatedData, Unit> $callback;
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ DialogC55112xdm $loadingDialog;
    final /* synthetic */ String $psw;
    final /* synthetic */ String $rootWalletId;
    final /* synthetic */ String $sourceFrom;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.bean.WalletCreatedData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$createNormalOrTeeOrAAAccount$1$3(FragmentActivity fragmentActivity, String str, String str2, DialogC55112xdm dialogC55112xdm, String str3, FragmentManager fragmentManager, Function1<? super WalletCreatedData, Unit> function1, Continuation<? super AACreateUtils$createNormalOrTeeOrAAAccount$1$3> continuation) {
        super(2, continuation);
        this.$context = fragmentActivity;
        this.$rootWalletId = str;
        this.$psw = str2;
        this.$loadingDialog = dialogC55112xdm;
        this.$sourceFrom = str3;
        this.$fm = fragmentManager;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AACreateUtils$createNormalOrTeeOrAAAccount$1$3 aACreateUtils$createNormalOrTeeOrAAAccount$1$3 = new AACreateUtils$createNormalOrTeeOrAAAccount$1$3(this.$context, this.$rootWalletId, this.$psw, this.$loadingDialog, this.$sourceFrom, this.$fm, this.$callback, continuation);
        aACreateUtils$createNormalOrTeeOrAAAccount$1$3.L$0 = obj;
        return aACreateUtils$createNormalOrTeeOrAAAccount$1$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$createNormalOrTeeOrAAAccount$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.$context).isConnected();
            String str = this.$rootWalletId;
            String str2 = this.$psw;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objKWHzl = c13758dXeIsConnected.KWHzl(str, str2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            final boolean zEZpvd = C17922fXg.EZpvd(coroutineScope);
            AbstractC58260yxt<Integer> abstractC58260yxtCopydefault = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(this.$rootWalletId);
            final String str3 = this.$sourceFrom;
            final String str4 = this.$rootWalletId;
            final String str5 = this.$psw;
            final FragmentManager fragmentManager = this.$fm;
            final FragmentActivity fragmentActivity = this.$context;
            final DialogC55112xdm dialogC55112xdm = this.$loadingDialog;
            final Function1<WalletCreatedData, Unit> function1 = this.$callback;
            final Function1 function12 = new Function1() { // from class: o.fPz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$3.invokeSuspend$lambda$3(str3, zEZpvd, str4, str5, fragmentManager, fragmentActivity, dialogC55112xdm, function1, (java.lang.Integer) obj2);
                }
            };
            InterfaceC58227yxM<? super Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fPy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function12.invoke(obj2);
                }
            };
            final DialogC55112xdm dialogC55112xdm2 = this.$loadingDialog;
            final Function1 function13 = new Function1() { // from class: o.fPA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$3.invokeSuspend$lambda$5(dialogC55112xdm2, (java.lang.Throwable) obj2);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fPG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    function13.invoke(obj2);
                }
            });
        } else {
            this.$loadingDialog.dismiss();
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(String str, boolean z, String str2, String str3, FragmentManager fragmentManager, final FragmentActivity fragmentActivity, final DialogC55112xdm dialogC55112xdm, final Function1 function1, Integer num) {
        final String str4 = Intrinsics.EZpvd((Object) str, (Object) "wallet_details") ? "sa_wallet_walletdetail_addsmartaccount" : "sa_wallet_managesmartwallet";
        if (z) {
            C14140dfo.TaskDescription taskDescription = C14140dfo.Companion;
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null);
            String strCreateWalletName$default = C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null), null, num.intValue() + 1, false, 5, null);
            Intrinsics.copydefault(num);
            instance$default.OLrzqt(str2, strCreateWalletName$default, num.intValue(), str3, fragmentManager, new C13786dYf(true), (192 & 64) != 0, (192 & 128) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1() { // from class: o.fPs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$3.invokeSuspend$lambda$3$lambda$0(dialogC55112xdm, function1, fragmentActivity, str4, (AbstractC12782ctV) obj);
                }
            });
        } else {
            Intrinsics.copydefault(num);
            C17922fXg.showSAGuide$default(fragmentActivity, new ActivateTeeGuideModel("", false, true, str2, num.intValue(), 0, 0, str4, 98, (DefaultConstructorMarker) null), null, new Function1() { // from class: o.fPB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$3.invokeSuspend$lambda$3$lambda$1(dialogC55112xdm, function1, (WalletCreatedData) obj);
                }
            }, new Function0() { // from class: o.fPx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AACreateUtils$createNormalOrTeeOrAAAccount$1$3.invokeSuspend$lambda$3$lambda$2(dialogC55112xdm);
                }
            }, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$0(DialogC55112xdm dialogC55112xdm, Function1 function1, FragmentActivity fragmentActivity, String str, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null);
        if (abstractC12782ctV != null && !abstractC12782ctV.RJOkX()) {
            ActivityC17792fSl.Companion.copydefault(fragmentActivity, new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, true, (String) null, 0, 0, 0, str, 122, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(DialogC55112xdm dialogC55112xdm, Function1 function1, WalletCreatedData walletCreatedData) {
        dialogC55112xdm.dismiss();
        function1.invoke(walletCreatedData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(DialogC55112xdm dialogC55112xdm) {
        dialogC55112xdm.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(DialogC55112xdm dialogC55112xdm, Throwable th) {
        dialogC55112xdm.dismiss();
        pUU.copydefault(fNC.OLrzqt.OLrzqt(), "createHDWalletAddressIndex error message :" + th.getMessage());
        return Unit.INSTANCE;
    }
}
