package com.okinc.business.defi.deeplink;

import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.wallet.BoundWalletAccount;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.deeplink.DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.ActivityC19288fyU;
import o.C12827cuN;
import o.C17304fAj;
import o.C32866mlf;
import o.C34703nhO;
import o.C43251rlk;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC8107awW;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Map<String, Object> $params;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4(FragmentActivity fragmentActivity, Map<String, ? extends Object> map, Continuation<? super DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$params = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4(this.$activity, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x001e, CancellationException -> 0x0021, TryCatch #2 {CancellationException -> 0x0021, all -> 0x001e, blocks: (B:6:0x0014, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:31:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0087, B:41:0x00a0, B:43:0x00b6, B:45:0x00ba, B:46:0x00c1, B:48:0x00c7, B:50:0x00cd, B:51:0x00d1, B:21:0x0042), top: B:62:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractActivityC33041mov abstractActivityC33041mov;
        FragmentActivity fragmentActivity;
        Map<String, Object> map;
        Object objM7386unboximpl;
        String message;
        final String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                FragmentActivity fragmentActivity2 = this.$activity;
                AbstractActivityC33041mov abstractActivityC33041mov2 = fragmentActivity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity2 : null;
                if (abstractActivityC33041mov2 != null) {
                    abstractActivityC33041mov2.showLoading();
                }
                fragmentActivity = this.$activity;
                Map<String, Object> map2 = this.$params;
                Result.Application application = Result.Companion;
                this.L$0 = fragmentActivity;
                this.L$1 = map2;
                this.label = 1;
                Object objInvokeSuspend$lambda$9$getBoundWalletAccounts = invokeSuspend$lambda$9$getBoundWalletAccounts(this);
                if (objInvokeSuspend$lambda$9$getBoundWalletAccounts == objCopydefault) {
                    return objCopydefault;
                }
                map = map2;
                objM7386unboximpl = objInvokeSuspend$lambda$9$getBoundWalletAccounts;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.L$1;
                fragmentActivity = (FragmentActivity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            BoundWalletAccountsResult boundWalletAccountsResult = (BoundWalletAccountsResult) objM7386unboximpl;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            if (abstractC12782ctV != null) {
                List<BoundWalletAccount> walletAccounts = boundWalletAccountsResult.getWalletAccounts();
                if (!(walletAccounts instanceof Collection) || !walletAccounts.isEmpty()) {
                    Iterator<T> it = walletAccounts.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((BoundWalletAccount) it.next()).getAccountId(), (Object) abstractC12782ctV.DbNXlk())) {
                            str = "yes";
                            break;
                        }
                    }
                }
                str = "no";
                C32866mlf.onEvent$default("OKXWallet_Explore_LinkedAccount_Click", (TrackChannel[]) null, new Function1() { // from class: o.dKc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4.invokeSuspend$lambda$9$lambda$7$lambda$6(str, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                ActivityC19288fyU.ActionBar actionBar = ActivityC19288fyU.Companion;
                Object obj2 = map.get("KEY_SHOW_BIND_SUCCESS");
                actionBar.AEQbTJ(fragmentActivity, boundWalletAccountsResult, Boolean.parseBoolean(!(obj2 instanceof String) ? (String) obj2 : null));
            } else {
                str = "no";
                C32866mlf.onEvent$default("OKXWallet_Explore_LinkedAccount_Click", (TrackChannel[]) null, new Function1() { // from class: o.dKc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj22) {
                        return DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4.invokeSuspend$lambda$9$lambda$7$lambda$6(str, (EventParamsList) obj22);
                    }
                }, 1, (Object) null);
                ActivityC19288fyU.ActionBar actionBar2 = ActivityC19288fyU.Companion;
                Object obj22 = map.get("KEY_SHOW_BIND_SUCCESS");
                actionBar2.AEQbTJ(fragmentActivity, boundWalletAccountsResult, Boolean.parseBoolean(!(obj22 instanceof String) ? (String) obj22 : null));
            }
            FragmentActivity fragmentActivity3 = this.$activity;
            abstractActivityC33041mov = fragmentActivity3 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity3 : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            return Unit.INSTANCE;
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        }
        Result.m7377constructorimpl(Result.m7376boximpl(objM7386unboximpl));
        FragmentActivity fragmentActivity32 = this.$activity;
        if (fragmentActivity32 instanceof AbstractActivityC33041mov) {
        }
        if (abstractActivityC33041mov != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invokeSuspend$lambda$9$getBoundWalletAccounts(Continuation<? super Result<BoundWalletAccountsResult>> continuation) throws Throwable {
        DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1 defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1;
        Object objM7377constructorimpl;
        Object objOLrzqt;
        if (continuation instanceof DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1) {
            defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1 = (DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1) continuation;
            int i = defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label = i - Integer.MIN_VALUE;
            } else {
                defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1 = new DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1(continuation);
            }
        }
        Object objCopydefault = defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), true, false, 2, null);
            defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label = 1;
            objCopydefault = RxAwaitKt.await(allRootWallets$default, defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                    Result.Application application3 = Result.Companion;
                    return Result.m7377constructorimpl((BoundWalletAccountsResult) objCopydefault);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
                pUU.EZpvd("WalletMineViewModel", "getBoundWalletAccounts result: " + Result.m7385toStringimpl(objOLrzqt));
                return objOLrzqt;
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((List) objCopydefault);
        List listAhwBna = (List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC12784ctX) it.next()).KWHzl());
        }
        List listQOLQEE = C56403yEb.QOLQEE(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listQOLQEE) {
            if (((AbstractC12782ctV) obj).fZBcTu()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AbstractC12782ctV) it2.next()).DbNXlk());
        }
        if (C34703nhO.copydefault()) {
            C17304fAj c17304fAj = C17304fAj.EZpvd;
            WalletBindApiService walletBindApiServiceAEQbTJ = WalletBindApiService.Companion.AEQbTJ();
            defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label = 2;
            objCopydefault = c17304fAj.copydefault(arrayList3, walletBindApiServiceAEQbTJ, defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            Result.Application application32 = Result.Companion;
            return Result.m7377constructorimpl((BoundWalletAccountsResult) objCopydefault);
        }
        InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
        if (interfaceC8107awW == null) {
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("CDefiService is null")));
        }
        defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1.label = 3;
        objOLrzqt = interfaceC8107awW.OLrzqt(arrayList3, defiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1);
        if (objOLrzqt == objCopydefault2) {
            return objCopydefault2;
        }
        pUU.EZpvd("WalletMineViewModel", "getBoundWalletAccounts result: " + Result.m7385toStringimpl(objOLrzqt));
        return objOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$9$lambda$7$lambda$6(String str, EventParamsList eventParamsList) {
        eventParamsList.put("have_linked", str, true);
        return Unit.INSTANCE;
    }
}
