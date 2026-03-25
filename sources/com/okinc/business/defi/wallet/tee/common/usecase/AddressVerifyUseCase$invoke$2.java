package com.okinc.business.defi.wallet.tee.common.usecase;

import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.VerifyResp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58260yxt;
import o.C11283cIm;
import o.C13058cyg;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTS;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressVerifyUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ fTS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressVerifyUseCase$invoke$2(AbstractC12782ctV abstractC12782ctV, String str, fTS fts, Continuation<? super AddressVerifyUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.this$0 = fts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressVerifyUseCase$invoke$2(this.$wallet, this.$password, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((AddressVerifyUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        Object objKWHzl;
        AbstractC43419rot abstractC43419rot;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<String> abstractC58260yxtValues = this.$wallet.values(this.$password);
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtValues, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(((VerifyResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getRes(), C56443yFo.KWHzl(true))));
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        String str = (String) objAwait;
        C13058cyg c13058cyg = this.this$0.EZpvd;
        AbstractC12782ctV abstractC12782ctV = this.$wallet;
        Intrinsics.copydefault((Object) str);
        List<C11283cIm> listEZpvd = c13058cyg.EZpvd(abstractC12782ctV, str, CollectionsKt___CollectionsKt.QKudOq(this.$wallet.EZpvd()));
        C13934dbu c13934dbu = this.this$0.OLrzqt;
        String strDbNXlk = this.$wallet.DbNXlk();
        String strUSBtdM = this.$wallet.USBtdM();
        String strAUsmxb = this.$wallet.aUsmxb();
        CreateWalletReqNew createWalletReqNew = new CreateWalletReqNew((String) null, (String) null, (String) null, C13058cyg.suppleAndGroupSignData$default(this.this$0.EZpvd, this.$wallet.DbNXlk(), this.$wallet.EZpvd(), listEZpvd, false, 8, null), 0, 0L, this.$wallet.DbNXlk(), false, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, (DefaultConstructorMarker) null);
        this.label = 2;
        objKWHzl = c13934dbu.KWHzl(strDbNXlk, strUSBtdM, strAUsmxb, createWalletReqNew, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) objKWHzl;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
