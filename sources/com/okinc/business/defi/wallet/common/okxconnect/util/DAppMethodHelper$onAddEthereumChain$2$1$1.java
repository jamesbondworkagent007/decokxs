package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.biz.walletconnect.NativeCurrency;
import com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13983dcq;
import o.C13990dcx;
import o.C15974ebF;
import o.C33491mxU;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onAddEthereumChain$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ String $messageId;
    final /* synthetic */ WalletAddEthereumChain $walletAddEthereumChain;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onAddEthereumChain$2$1$1(WalletAddEthereumChain walletAddEthereumChain, C15974ebF c15974ebF, String str, DAppInfo dAppInfo, String str2, Continuation<? super DAppMethodHelper$onAddEthereumChain$2$1$1> continuation) {
        super(1, continuation);
        this.$walletAddEthereumChain = walletAddEthereumChain;
        this.this$0 = c15974ebF;
        this.$walletId = str;
        this.$dAppInfo = dAppInfo;
        this.$messageId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onAddEthereumChain$2$1$1(this.$walletAddEthereumChain, this.this$0, this.$walletId, this.$dAppInfo, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onAddEthereumChain$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String strOLrzqt;
        Object objKWHzl;
        Object next;
        DappInteractionArgs dappInteractionArgs;
        Object objOLrzqt;
        Integer decimals;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String chainId = this.$walletAddEthereumChain.getChainId();
            if (chainId != null && (strOLrzqt = C33491mxU.OLrzqt(chainId)) != null) {
                C15974ebF c15974ebF = this.this$0;
                String str = this.$walletId;
                this.L$0 = strOLrzqt;
                this.label = 1;
                objKWHzl = c15974ebF.KWHzl(str, (Continuation<? super AbstractC12782ctV>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                throw new OKXConnectException(OKXConnectException.ErrorType.BAD_REQUEST, (String) null, 2, (DefaultConstructorMarker) null);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                dappInteractionArgs = (DappInteractionArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs2, null);
                this.L$0 = null;
                this.label = 3;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass3, this);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
            strOLrzqt = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        String str2 = strOLrzqt;
        Iterator<T> it = C13990dcx.copydefault((AbstractC12782ctV) objKWHzl).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((C13983dcq) next).copydefault().EZpvd(), (Object) str2)) {
                break;
            }
        }
        C13983dcq c13983dcq = (C13983dcq) next;
        if (c13983dcq != null) {
            return c13983dcq.AEQbTJ();
        }
        String name = this.$dAppInfo.getName();
        String icon = this.$dAppInfo.getIcon();
        String url = this.$dAppInfo.getUrl();
        String chainName = this.$walletAddEthereumChain.getChainName();
        List<String> rpcUrls = this.$walletAddEthereumChain.getRpcUrls();
        NativeCurrency nativeCurrency = this.$walletAddEthereumChain.getNativeCurrency();
        String symbol = nativeCurrency != null ? nativeCurrency.getSymbol() : null;
        List<String> blockExplorerUrls = this.$walletAddEthereumChain.getBlockExplorerUrls();
        String str3 = blockExplorerUrls != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(blockExplorerUrls) : null;
        NativeCurrency nativeCurrency2 = this.$walletAddEthereumChain.getNativeCurrency();
        dappInteractionArgs = new DappInteractionArgs(this.$walletId, null, str2, null, null, null, "okx_connect", C56443yFo.AEQbTJ(1), null, null, null, null, false, false, null, false, null, null, null, null, null, new CustomNetworkInfo(icon, name, url, chainName, rpcUrls, symbol, str3, null, (nativeCurrency2 == null || (decimals = nativeCurrency2.getDecimals()) == null) ? -1 : decimals.intValue(), 128, null), null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -69206214, null);
        C15974ebF c15974ebF2 = this.this$0;
        this.L$0 = dappInteractionArgs;
        this.label = 2;
        objOLrzqt = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        DappInteractionArgs dappInteractionArgs22 = dappInteractionArgs;
        CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
        AnonymousClass3 anonymousClass32 = new AnonymousClass3(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs22, null);
        this.L$0 = null;
        this.label = 3;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass32, this);
        if (objWithContext2 != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAddEthereumChain$2$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ String $messageId;
        final /* synthetic */ WeakReference<Context> $weakContext;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$weakContext = weakReference;
            this.$args = dappInteractionArgs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$messageId, this.$weakContext, this.$args, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$messageId;
                WeakReference<Context> weakReference = this.$weakContext;
                DappInteractionArgs dappInteractionArgs = this.$args;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = weakReference;
                this.L$3 = dappInteractionArgs;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                Context context = weakReference.get();
                if (context != null) {
                    MethodHelperActivity.Companion.AEQbTJ(context, str, dappInteractionArgs, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, c15974ebF);
                } else {
                    c15974ebF.OLrzqt(str, "");
                }
                obj = cancellableContinuationImpl.getResult();
                if (obj == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }
}
