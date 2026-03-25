package com.okinc.localization;

import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38281pSz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC58184ywW;
import o.pSC;

/* JADX INFO: loaded from: classes9.dex */
public final class OKLocalize$listLoaderCompat$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<List<C38281pSz>> $emitter;
    final /* synthetic */ boolean $local;
    final /* synthetic */ boolean $remote;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLocalize$listLoaderCompat$1$1(boolean z, InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW, boolean z2, Continuation<? super OKLocalize$listLoaderCompat$1$1> continuation) {
        super(2, continuation);
        this.$local = z;
        this.$emitter = interfaceC58184ywW;
        this.$remote = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKLocalize$listLoaderCompat$1$1(this.$local, this.$emitter, this.$remote, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKLocalize$listLoaderCompat$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:7:0x0017, B:36:0x00b8, B:38:0x00bc, B:39:0x00cb, B:41:0x00d1, B:43:0x00ee, B:45:0x00f2, B:12:0x0030, B:21:0x0066, B:23:0x006a, B:24:0x0077, B:26:0x007d, B:29:0x00a0, B:32:0x00a6, B:15:0x0040, B:17:0x0050), top: B:54:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:7:0x0017, B:36:0x00b8, B:38:0x00bc, B:39:0x00cb, B:41:0x00d1, B:43:0x00ee, B:45:0x00f2, B:12:0x0030, B:21:0x0066, B:23:0x006a, B:24:0x0077, B:26:0x007d, B:29:0x00a0, B:32:0x00a6, B:15:0x0040, B:17:0x0050), top: B:54:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:7:0x0017, B:36:0x00b8, B:38:0x00bc, B:39:0x00cb, B:41:0x00d1, B:43:0x00ee, B:45:0x00f2, B:12:0x0030, B:21:0x0066, B:23:0x006a, B:24:0x0077, B:26:0x007d, B:29:0x00a0, B:32:0x00a6, B:15:0x0040, B:17:0x0050), top: B:54:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW;
        boolean z;
        String market;
        Object objAEQbTJ;
        String str;
        Object objOLrzqt;
        InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW2;
        ArrayList arrayList;
        List<LanguageItem> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ArrayList arrayList2 = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z2 = this.$local;
            interfaceC58184ywW = this.$emitter;
            z = this.$remote;
            Result.Application application2 = Result.Companion;
            market = pSC.valueOf.OLrzqt().getMarket();
            if (z2) {
                LanguagesListRepository languagesListRepository = pSC.EZpvd;
                LanguagesListRepository.LoadType loadType = LanguagesListRepository.LoadType.CACHE_AND_EMBEDDED;
                this.L$0 = interfaceC58184ywW;
                this.L$1 = market;
                this.Z$0 = z;
                this.label = 1;
                objAEQbTJ = languagesListRepository.AEQbTJ(loadType, market, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = market;
            }
            if (z) {
                LanguagesListRepository languagesListRepository2 = pSC.EZpvd;
                this.L$0 = interfaceC58184ywW;
                this.L$1 = null;
                this.label = 2;
                objOLrzqt = languagesListRepository2.OLrzqt(market, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC58184ywW2 = interfaceC58184ywW;
                list = (List) objOLrzqt;
                if (list != null) {
                }
                if (arrayList2 != null) {
                }
                interfaceC58184ywW = interfaceC58184ywW2;
            }
            interfaceC58184ywW.onComplete();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW3 = this.$emitter;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC58184ywW2 = (InterfaceC58184ywW) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            list = (List) objOLrzqt;
            if (list != null) {
                arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (LanguageItem languageItem : list) {
                    arrayList2.add(new C38281pSz(languageItem.getDisplayName(), languageItem.getLocale(), false, 4, null));
                }
            }
            if (arrayList2 != null) {
                interfaceC58184ywW2.onNext(arrayList2);
            }
            interfaceC58184ywW = interfaceC58184ywW2;
            interfaceC58184ywW.onComplete();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW32 = this.$emitter;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                interfaceC58184ywW32.onError(thM7380exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        boolean z3 = this.Z$0;
        str = (String) this.L$1;
        interfaceC58184ywW = (InterfaceC58184ywW) this.L$0;
        C56391yDq.AEQbTJ(obj);
        z = z3;
        objAEQbTJ = obj;
        List<LanguageItem> list2 = (List) objAEQbTJ;
        if (list2 != null) {
            arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (LanguageItem languageItem2 : list2) {
                arrayList.add(new C38281pSz(languageItem2.getDisplayName(), languageItem2.getLocale(), false, 4, null));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            interfaceC58184ywW.onNext(arrayList);
        }
        market = str;
        if (z) {
        }
        interfaceC58184ywW.onComplete();
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        InterfaceC58184ywW<List<C38281pSz>> interfaceC58184ywW322 = this.$emitter;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
