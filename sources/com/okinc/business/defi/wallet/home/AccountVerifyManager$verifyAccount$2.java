package com.okinc.business.defi.wallet.home;

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
import o.C15519eLi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountVerifyManager$verifyAccount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C15519eLi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountVerifyManager$verifyAccount$2(AbstractC12782ctV abstractC12782ctV, C15519eLi c15519eLi, String str, Continuation<? super AccountVerifyManager$verifyAccount$2> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c15519eLi;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountVerifyManager$verifyAccount$2 accountVerifyManager$verifyAccount$2 = new AccountVerifyManager$verifyAccount$2(this.$wallet, this.this$0, this.$password, continuation);
        accountVerifyManager$verifyAccount$2.L$0 = obj;
        return accountVerifyManager$verifyAccount$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountVerifyManager$verifyAccount$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [134=4] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[Catch: all -> 0x018e, TryCatch #0 {all -> 0x018e, blocks: (B:8:0x001d, B:41:0x014a, B:43:0x0150, B:45:0x0166, B:46:0x0171, B:50:0x0184, B:47:0x0174, B:49:0x0178, B:51:0x0188, B:52:0x018d, B:13:0x003d, B:32:0x00c8, B:33:0x00cb, B:35:0x00da, B:37:0x00dd, B:16:0x005a, B:27:0x00a6, B:29:0x00b1, B:19:0x006f, B:21:0x0087, B:23:0x008a), top: B:57:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[Catch: all -> 0x018e, TryCatch #0 {all -> 0x018e, blocks: (B:8:0x001d, B:41:0x014a, B:43:0x0150, B:45:0x0166, B:46:0x0171, B:50:0x0184, B:47:0x0174, B:49:0x0178, B:51:0x0188, B:52:0x018d, B:13:0x003d, B:32:0x00c8, B:33:0x00cb, B:35:0x00da, B:37:0x00dd, B:16:0x005a, B:27:0x00a6, B:29:0x00b1, B:19:0x006f, B:21:0x0087, B:23:0x008a), top: B:57:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150 A[Catch: all -> 0x018e, TryCatch #0 {all -> 0x018e, blocks: (B:8:0x001d, B:41:0x014a, B:43:0x0150, B:45:0x0166, B:46:0x0171, B:50:0x0184, B:47:0x0174, B:49:0x0178, B:51:0x0188, B:52:0x018d, B:13:0x003d, B:32:0x00c8, B:33:0x00cb, B:35:0x00da, B:37:0x00dd, B:16:0x005a, B:27:0x00a6, B:29:0x00b1, B:19:0x006f, B:21:0x0087, B:23:0x008a), top: B:57:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174 A[Catch: all -> 0x018e, TryCatch #0 {all -> 0x018e, blocks: (B:8:0x001d, B:41:0x014a, B:43:0x0150, B:45:0x0166, B:46:0x0171, B:50:0x0184, B:47:0x0174, B:49:0x0178, B:51:0x0188, B:52:0x018d, B:13:0x003d, B:32:0x00c8, B:33:0x00cb, B:35:0x00da, B:37:0x00dd, B:16:0x005a, B:27:0x00a6, B:29:0x00b1, B:19:0x006f, B:21:0x0087, B:23:0x008a), top: B:57:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        String str;
        AbstractC12782ctV abstractC12782ctV;
        String str2;
        C15519eLi c15519eLi;
        AbstractC12782ctV abstractC12782ctV2;
        String str3;
        Object objAwait2;
        String str4;
        C15519eLi c15519eLi2;
        Object objKWHzl;
        String str5;
        AbstractC43419rot abstractC43419rot;
        Object objPut;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
            C15519eLi c15519eLi3 = this.this$0;
            String str6 = this.$password;
            Result.Application application2 = Result.Companion;
            String strDbNXlk = abstractC12782ctV3.DbNXlk();
            if (Intrinsics.EZpvd(c15519eLi3.OLrzqt.get(strDbNXlk), C56443yFo.KWHzl(false))) {
                return Unit.INSTANCE;
            }
            AbstractC58260yxt<String> abstractC58260yxtValues = abstractC12782ctV3.values(str6);
            this.L$0 = abstractC12782ctV3;
            this.L$1 = c15519eLi3;
            this.L$2 = str6;
            this.L$3 = abstractC12782ctV3;
            this.L$4 = strDbNXlk;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtValues, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            str = str6;
            abstractC12782ctV = abstractC12782ctV3;
            str2 = strDbNXlk;
            c15519eLi = c15519eLi3;
            abstractC12782ctV2 = abstractC12782ctV;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) this.L$1;
                    C15519eLi c15519eLi4 = (C15519eLi) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c15519eLi2 = c15519eLi4;
                    objKWHzl = obj;
                    abstractC43419rot = (AbstractC43419rot) objKWHzl;
                    if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                        if (Intrinsics.EZpvd(((VerifyResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getRes(), C56443yFo.KWHzl(true))) {
                            c15519eLi2.OLrzqt.put(str5, C56443yFo.KWHzl(false));
                        }
                        objPut = Unit.INSTANCE;
                    } else {
                        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objPut = c15519eLi2.OLrzqt.put(str5, C56443yFo.KWHzl(true));
                    }
                    Result.m7377constructorimpl(objPut);
                    return Unit.INSTANCE;
                }
                str2 = (String) this.L$3;
                AbstractC12782ctV abstractC12782ctV4 = (AbstractC12782ctV) this.L$2;
                C15519eLi c15519eLi5 = (C15519eLi) this.L$1;
                abstractC12782ctV = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c15519eLi = c15519eLi5;
                abstractC12782ctV2 = abstractC12782ctV4;
                objAwait2 = obj;
                str3 = (String) objAwait2;
                C15519eLi c15519eLi6 = c15519eLi;
                String str7 = str2;
                str4 = str3;
                c15519eLi2 = c15519eLi6;
                Intrinsics.copydefault((Object) str4);
                if (str4.length() != 0) {
                    return Unit.INSTANCE;
                }
                C13058cyg c13058cyg = c15519eLi2.AYXKKw;
                Intrinsics.copydefault((Object) str4);
                List<C11283cIm> listEZpvd = c13058cyg.EZpvd(abstractC12782ctV2, str4, CollectionsKt___CollectionsKt.QKudOq(abstractC12782ctV2.EZpvd()));
                C13934dbu c13934dbu = c15519eLi2.KWHzl;
                String strDbNXlk2 = abstractC12782ctV2.DbNXlk();
                String strUSBtdM = abstractC12782ctV2.USBtdM();
                String strAUsmxb = abstractC12782ctV.aUsmxb();
                CreateWalletReqNew createWalletReqNew = new CreateWalletReqNew((String) null, (String) null, (String) null, C13058cyg.suppleAndGroupSignData$default(c15519eLi2.AYXKKw, abstractC12782ctV2.DbNXlk(), abstractC12782ctV2.EZpvd(), listEZpvd, false, 8, null), 0, 0L, abstractC12782ctV2.DbNXlk(), true, 55, (DefaultConstructorMarker) null);
                this.L$0 = c15519eLi2;
                this.L$1 = str7;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                objKWHzl = c13934dbu.KWHzl(strDbNXlk2, strUSBtdM, strAUsmxb, createWalletReqNew, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                str5 = str7;
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                }
                Result.m7377constructorimpl(objPut);
                return Unit.INSTANCE;
            }
            str2 = (String) this.L$4;
            abstractC12782ctV2 = (AbstractC12782ctV) this.L$3;
            String str8 = (String) this.L$2;
            c15519eLi = (C15519eLi) this.L$1;
            AbstractC12782ctV abstractC12782ctV5 = (AbstractC12782ctV) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str8;
            abstractC12782ctV = abstractC12782ctV5;
            objAwait = obj;
        }
        str3 = (String) objAwait;
        Intrinsics.copydefault((Object) str3);
        if (str3.length() == 0) {
            AbstractC58260yxt<String> abstractC58260yxtEjfBZ = abstractC12782ctV2.ejfBZ(str);
            this.L$0 = abstractC12782ctV;
            this.L$1 = c15519eLi;
            this.L$2 = abstractC12782ctV2;
            this.L$3 = str2;
            this.L$4 = null;
            this.label = 2;
            objAwait2 = RxAwaitKt.await(abstractC58260yxtEjfBZ, this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            str3 = (String) objAwait2;
        }
        C15519eLi c15519eLi62 = c15519eLi;
        String str72 = str2;
        str4 = str3;
        c15519eLi2 = c15519eLi62;
        Intrinsics.copydefault((Object) str4);
        if (str4.length() != 0) {
        }
    }
}
