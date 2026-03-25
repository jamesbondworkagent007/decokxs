package com.okinc.business.trade.features.home.advanced.usecase;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.signdata.UserCancelledException;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dexlogic.error.SignCancelException;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.WalletDexService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.AbstractC9836bdB;
import o.C23274hvD;
import o.C28194kSj;
import o.C28195kSk;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C9842bdH;
import o.C9843bdI;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class EVMBatchSignBroadcastUseCase$signAndBroadcast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ AbstractC9836bdB.StateListAnimator $approveSignReq;
    final /* synthetic */ C28194kSj $params;
    final /* synthetic */ AbstractC9836bdB.StateListAnimator $swapSignReq;
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C28195kSk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVMBatchSignBroadcastUseCase$signAndBroadcast$2(C28195kSk c28195kSk, FragmentActivity fragmentActivity, InterfaceC9738bbJ interfaceC9738bbJ, AbstractC9836bdB.StateListAnimator stateListAnimator, AbstractC9836bdB.StateListAnimator stateListAnimator2, C28194kSj c28194kSj, Continuation<? super EVMBatchSignBroadcastUseCase$signAndBroadcast$2> continuation) {
        super(2, continuation);
        this.this$0 = c28195kSk;
        this.$activity = fragmentActivity;
        this.$wallet = interfaceC9738bbJ;
        this.$approveSignReq = stateListAnimator;
        this.$swapSignReq = stateListAnimator2;
        this.$params = c28194kSj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EVMBatchSignBroadcastUseCase$signAndBroadcast$2(this.this$0, this.$activity, this.$wallet, this.$approveSignReq, this.$swapSignReq, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((EVMBatchSignBroadcastUseCase$signAndBroadcast$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[Catch: Exception -> 0x01f5, TryCatch #0 {Exception -> 0x01f5, blocks: (B:7:0x0017, B:12:0x0038, B:30:0x00e3, B:31:0x00f3, B:33:0x00f9, B:35:0x0106, B:38:0x010d, B:39:0x0111, B:41:0x0117, B:43:0x012f, B:44:0x0133, B:45:0x013c, B:47:0x0142, B:49:0x014e, B:50:0x0152, B:54:0x015c, B:58:0x01b0, B:13:0x003f, B:19:0x0082, B:21:0x0088, B:23:0x0095, B:25:0x00b6, B:27:0x00ca, B:62:0x01d2, B:64:0x01d6, B:66:0x01f0, B:65:0x01e6, B:16:0x004e), top: B:72:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142 A[Catch: Exception -> 0x01f5, TryCatch #0 {Exception -> 0x01f5, blocks: (B:7:0x0017, B:12:0x0038, B:30:0x00e3, B:31:0x00f3, B:33:0x00f9, B:35:0x0106, B:38:0x010d, B:39:0x0111, B:41:0x0117, B:43:0x012f, B:44:0x0133, B:45:0x013c, B:47:0x0142, B:49:0x014e, B:50:0x0152, B:54:0x015c, B:58:0x01b0, B:13:0x003f, B:19:0x0082, B:21:0x0088, B:23:0x0095, B:25:0x00b6, B:27:0x00ca, B:62:0x01d2, B:64:0x01d6, B:66:0x01f0, B:65:0x01e6, B:16:0x004e), top: B:72:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objM7377constructorimpl2;
        C9843bdI c9843bdI;
        C9842bdH c9842bdH;
        C9842bdH c9842bdH2;
        Object objAwaitFirst;
        Object objAEQbTJ;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Exception e) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9740bbL interfaceC9740bbLOLrzqt = this.this$0.EZpvd.OLrzqt();
            FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            InterfaceC9738bbJ interfaceC9738bbJ = this.$wallet;
            List listGEmmrt = yDY.gEmmrt(this.$approveSignReq, this.$swapSignReq);
            boolean zCopydefault = this.$params.copydefault();
            this.label = 1;
            objEZpvd = interfaceC9740bbLOLrzqt.EZpvd(supportFragmentManager, interfaceC9738bbJ, listGEmmrt, zCopydefault, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = ((Result) obj).m7386unboximpl();
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                c9842bdH2 = (C9842bdH) this.L$2;
                c9842bdH = (C9842bdH) this.L$1;
                c9843bdI = (C9843bdI) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwaitFirst = obj;
                Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "");
                C28194kSj c28194kSj = this.$params;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) objAwaitFirst) {
                    List<Integer> chainIds = ((WalletDexService.SupportedMevNodeBean) obj2).getChainIds();
                    if (chainIds != null && !chainIds.isEmpty()) {
                        Iterator<T> it2 = chainIds.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (Intrinsics.EZpvd((Object) String.valueOf(((Number) it2.next()).intValue()), (Object) c28194kSj.KWHzl())) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    String supplier = ((WalletDexService.SupportedMevNodeBean) it.next()).getSupplier();
                    if (supplier != null) {
                        arrayList2.add(supplier);
                    }
                }
                ArrayList arrayList3 = !(arrayList2.isEmpty() ^ true) ? arrayList2 : null;
                pUU.KWHzl("EVMBatchSignBroadcastUseCase", "signAuthType = " + c9843bdI.copydefault());
                C28195kSk c28195kSk = this.this$0;
                String strKWHzl = this.$params.KWHzl();
                ApproveUnsignedData approveUnsignedDataOLrzqt = this.$params.OLrzqt();
                V6CalldataResponseData v6CalldataResponseDataAYXKKw = this.$params.AYXKKw();
                String strKWHzl2 = c9842bdH.KWHzl();
                String strEZpvd = c9842bdH.EZpvd();
                String strKWHzl3 = c9842bdH2.KWHzl();
                String strEZpvd2 = c9842bdH2.EZpvd();
                String strEZpvd3 = this.$params.EZpvd();
                String strAEQbTJ = this.$params.AEQbTJ();
                if (c9843bdI.copydefault() != SignAuthType.SILENT) {
                    z = false;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                objAEQbTJ = c28195kSk.AEQbTJ(strKWHzl, approveUnsignedDataOLrzqt, v6CalldataResponseDataAYXKKw, strKWHzl2, strEZpvd, strKWHzl3, strEZpvd2, strEZpvd3, strAEQbTJ, arrayList3, z, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = objAEQbTJ;
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            if (thM7380exceptionOrNullimpl instanceof UserCancelledException) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(new SignCancelException(null, 1, null)));
            } else {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            }
            return Result.m7376boximpl(objM7377constructorimpl2);
        }
        c9843bdI = (C9843bdI) objEZpvd;
        List listOLrzqt = c9843bdI.OLrzqt();
        if (listOLrzqt.size() < 2) {
            Result.Application application4 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null))));
        }
        c9842bdH = (C9842bdH) listOLrzqt.get(0);
        c9842bdH2 = (C9842bdH) listOLrzqt.get(1);
        if (this.$params.valueOf()) {
            AbstractC58185ywX<ArrayList<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXAEQbTJ = this.this$0.EZpvd.AEQbTJ();
            this.L$0 = c9843bdI;
            this.L$1 = c9842bdH;
            this.L$2 = c9842bdH2;
            this.label = 2;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
            Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "");
            C28194kSj c28194kSj2 = this.$params;
            ArrayList arrayList4 = new ArrayList();
            while (r4.hasNext()) {
            }
            ArrayList arrayList22 = new ArrayList();
            it = arrayList4.iterator();
            while (it.hasNext()) {
            }
            if (!(arrayList22.isEmpty() ^ true)) {
            }
            pUU.KWHzl("EVMBatchSignBroadcastUseCase", "signAuthType = " + c9843bdI.copydefault());
            C28195kSk c28195kSk2 = this.this$0;
            String strKWHzl4 = this.$params.KWHzl();
            ApproveUnsignedData approveUnsignedDataOLrzqt2 = this.$params.OLrzqt();
            V6CalldataResponseData v6CalldataResponseDataAYXKKw2 = this.$params.AYXKKw();
            String strKWHzl22 = c9842bdH.KWHzl();
            String strEZpvd4 = c9842bdH.EZpvd();
            String strKWHzl32 = c9842bdH2.KWHzl();
            String strEZpvd22 = c9842bdH2.EZpvd();
            String strEZpvd32 = this.$params.EZpvd();
            String strAEQbTJ2 = this.$params.AEQbTJ();
            if (c9843bdI.copydefault() != SignAuthType.SILENT) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            objAEQbTJ = c28195kSk2.AEQbTJ(strKWHzl4, approveUnsignedDataOLrzqt2, v6CalldataResponseDataAYXKKw2, strKWHzl22, strEZpvd4, strKWHzl32, strEZpvd22, strEZpvd32, strAEQbTJ2, arrayList3, z, this);
            if (objAEQbTJ == objCopydefault) {
            }
        }
        pUU.KWHzl("EVMBatchSignBroadcastUseCase", "signAuthType = " + c9843bdI.copydefault());
        C28195kSk c28195kSk22 = this.this$0;
        String strKWHzl42 = this.$params.KWHzl();
        ApproveUnsignedData approveUnsignedDataOLrzqt22 = this.$params.OLrzqt();
        V6CalldataResponseData v6CalldataResponseDataAYXKKw22 = this.$params.AYXKKw();
        String strKWHzl222 = c9842bdH.KWHzl();
        String strEZpvd42 = c9842bdH.EZpvd();
        String strKWHzl322 = c9842bdH2.KWHzl();
        String strEZpvd222 = c9842bdH2.EZpvd();
        String strEZpvd322 = this.$params.EZpvd();
        String strAEQbTJ22 = this.$params.AEQbTJ();
        if (c9843bdI.copydefault() != SignAuthType.SILENT) {
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        objAEQbTJ = c28195kSk22.AEQbTJ(strKWHzl42, approveUnsignedDataOLrzqt22, v6CalldataResponseDataAYXKKw22, strKWHzl222, strEZpvd42, strKWHzl322, strEZpvd222, strEZpvd322, strAEQbTJ22, arrayList3, z, this);
        if (objAEQbTJ == objCopydefault) {
        }
    }
}
