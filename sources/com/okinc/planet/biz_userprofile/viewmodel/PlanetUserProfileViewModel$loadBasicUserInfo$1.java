package com.okinc.planet.biz_userprofile.viewmodel;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.utils.IMUtils;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.AbstractC46197tLk;
import o.C33129mqd;
import o.C46189tLc;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46387tSl;
import o.tLX;
import o.tQV;
import o.tRK;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileViewModel$loadBasicUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tLX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileViewModel$loadBasicUserInfo$1(tLX tlx, Continuation<? super PlanetUserProfileViewModel$loadBasicUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = tlx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileViewModel$loadBasicUserInfo$1 planetUserProfileViewModel$loadBasicUserInfo$1 = new PlanetUserProfileViewModel$loadBasicUserInfo$1(this.this$0, continuation);
        planetUserProfileViewModel$loadBasicUserInfo$1.L$0 = obj;
        return planetUserProfileViewModel$loadBasicUserInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileViewModel$loadBasicUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:13:0x002d, B:61:0x012e, B:16:0x003a, B:55:0x0103, B:57:0x0108, B:19:0x0043, B:35:0x00a6, B:37:0x00b6, B:40:0x00be, B:41:0x00c3, B:43:0x00cf, B:47:0x00d9, B:49:0x00e9, B:51:0x00f3, B:63:0x0139, B:64:0x013e, B:22:0x004b, B:30:0x008b, B:25:0x0058, B:27:0x0070, B:32:0x0097), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:13:0x002d, B:61:0x012e, B:16:0x003a, B:55:0x0103, B:57:0x0108, B:19:0x0043, B:35:0x00a6, B:37:0x00b6, B:40:0x00be, B:41:0x00c3, B:43:0x00cf, B:47:0x00d9, B:49:0x00e9, B:51:0x00f3, B:63:0x0139, B:64:0x013e, B:22:0x004b, B:30:0x008b, B:25:0x0058, B:27:0x0070, B:32:0x0097), top: B:79:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        tLX tlx;
        PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd;
        PlanetBasicUserInfoResp planetBasicUserInfoResp;
        tLX tlx2;
        String str;
        C46189tLc c46189tLc;
        C46189tLc c46189tLcCopydefault;
        MutableStateFlow mutableStateFlow;
        AbstractC46197tLk abstractC46197tLkKWHzl;
        tLX tlx3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tlx = this.this$0;
            Result.Application application2 = Result.Companion;
            if (!tlx.fetchVPNInfo.copydefault(tlx.hDKMBd, tlx.uzCIH, tlx.AEQbTJ)) {
                tQV tqv = tlx.values;
                String str2 = tlx.hDKMBd;
                String str3 = tlx.AEQbTJ;
                String str4 = tlx.uzCIH;
                this.L$0 = tlx;
                this.label = 1;
                obj = tqv.KWHzl(str2, str3, str4, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                planetBasicUserInfoRespEZpvd = (PlanetBasicUserInfoResp) ((AbstractC43419rot) obj).AEQbTJ();
            } else {
                InterfaceC46387tSl interfaceC46387tSl = tlx.fetchVPNInfo;
                this.L$0 = tlx;
                this.label = 2;
                obj = interfaceC46387tSl.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                Pair pair = (Pair) obj;
                c46189tLc = (C46189tLc) pair.component1();
                Throwable th2 = (Throwable) pair.component2();
                if ((c46189tLc == null ? c46189tLc.EZpvd() : null) != null) {
                }
            }
        } else if (i == 1) {
            tlx = (tLX) this.L$0;
            C56391yDq.AEQbTJ(obj);
            planetBasicUserInfoRespEZpvd = (PlanetBasicUserInfoResp) ((AbstractC43419rot) obj).AEQbTJ();
        } else {
            if (i != 2) {
                if (i == 3) {
                    planetBasicUserInfoResp = (PlanetBasicUserInfoResp) this.L$1;
                    tlx2 = (tLX) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = (String) obj;
                    c46189tLcCopydefault = C46189tLc.Companion.copydefault(planetBasicUserInfoResp, tlx2.values(), tlx2.AEQbTJ(), str);
                    mutableStateFlow = tlx2.copydefault;
                    abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(c46189tLcCopydefault);
                    this.L$0 = tlx2;
                    this.L$1 = c46189tLcCopydefault;
                    this.label = 4;
                    if (mutableStateFlow.emit(abstractC46197tLkKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    tlx3 = tlx2;
                    objM7377constructorimpl = Result.m7377constructorimpl(tlx3.copydefault(c46189tLcCopydefault));
                    tLX tlx4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                c46189tLcCopydefault = (C46189tLc) this.L$1;
                tlx3 = (tLX) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(tlx3.copydefault(c46189tLcCopydefault));
                tLX tlx42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    if (((AbstractC46197tLk) tlx42.copydefault.getValue()).OLrzqt() != null) {
                        MutableSharedFlow mutableSharedFlow = tlx42.KWHzl;
                        tLX.Application.StateListAnimator stateListAnimator = new tLX.Application.StateListAnimator(tRK.EZpvd(thM7380exceptionOrNullimpl));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 5;
                        if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    tlx42.copydefault.setValue(AbstractC46197tLk.Companion.OLrzqt(thM7380exceptionOrNullimpl));
                    tlx42.DbNXlk.AEQbTJ(null);
                }
                return Unit.INSTANCE;
            }
            tlx = (tLX) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Pair pair2 = (Pair) obj;
            c46189tLc = (C46189tLc) pair2.component1();
            Throwable th22 = (Throwable) pair2.component2();
            if ((c46189tLc == null ? c46189tLc.EZpvd() : null) != null) {
                if (th22 == null) {
                    throw new Exception();
                }
                throw th22;
            }
            planetBasicUserInfoRespEZpvd = c46189tLc.EZpvd();
        }
        tLX tlx5 = tlx;
        planetBasicUserInfoResp = planetBasicUserInfoRespEZpvd;
        if (!Intrinsics.EZpvd((Object) planetBasicUserInfoResp.fIwbmz(), (Object) "1") || !IMUtils.KWHzl.KWHzl()) {
            z = false;
        }
        tlx5.AEQbTJ(z);
        tlx5.DbNXlk.AEQbTJ(planetBasicUserInfoResp);
        if (!tlx5.values() && C33129mqd.OLrzqt((CharSequence) planetBasicUserInfoResp.QKVWgx())) {
            this.L$0 = tlx5;
            this.L$1 = planetBasicUserInfoResp;
            this.label = 3;
            Object objEZpvd = tlx5.EZpvd(planetBasicUserInfoResp, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            tlx2 = tlx5;
            obj = objEZpvd;
            str = (String) obj;
            c46189tLcCopydefault = C46189tLc.Companion.copydefault(planetBasicUserInfoResp, tlx2.values(), tlx2.AEQbTJ(), str);
            mutableStateFlow = tlx2.copydefault;
            abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(c46189tLcCopydefault);
            this.L$0 = tlx2;
            this.L$1 = c46189tLcCopydefault;
            this.label = 4;
            if (mutableStateFlow.emit(abstractC46197tLkKWHzl, this) == objCopydefault) {
            }
        } else {
            tlx2 = tlx5;
            str = null;
            c46189tLcCopydefault = C46189tLc.Companion.copydefault(planetBasicUserInfoResp, tlx2.values(), tlx2.AEQbTJ(), str);
            mutableStateFlow = tlx2.copydefault;
            abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(c46189tLcCopydefault);
            this.L$0 = tlx2;
            this.L$1 = c46189tLcCopydefault;
            this.label = 4;
            if (mutableStateFlow.emit(abstractC46197tLkKWHzl, this) == objCopydefault) {
            }
        }
    }
}
