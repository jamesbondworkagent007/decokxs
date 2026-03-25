package com.okinc.business.market.features.module.domain;

import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.ModuleBoostHeaderData;
import com.okinc.business.market.data.model.TokenAggregateData;
import com.okinc.business.market.features.module.domain.type.TimeType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25983jNp;
import o.C28545kcm;
import o.C28547kco;
import o.C28896kjS;
import o.C28897kjT;
import o.C28899kjV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28901kjX;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.module.domain.ModuleUseCase$getModuleDetail-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28899kjV>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $dataId$inlined;
    final /* synthetic */ Boolean $isBoostModuleOverride$inlined;
    final /* synthetic */ String $moduleId$inlined;
    final /* synthetic */ TimeType $timeType$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C28896kjS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, C28896kjS c28896kjS, String str, TimeType timeType, String str2, Boolean bool, String str3) {
        super(2, continuation);
        this.this$0 = c28896kjS;
        this.$dataId$inlined = str;
        this.$timeType$inlined = timeType;
        this.$chainId$inlined = str2;
        this.$isBoostModuleOverride$inlined = bool;
        this.$moduleId$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$dataId$inlined, this.$timeType$inlined, this.$chainId$inlined, this.$isBoostModuleOverride$inlined, this.$moduleId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28899kjV>> continuation) {
        return ((ModuleUseCase$getModuleDetailhUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r8v4. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[Catch: all -> 0x0147, CancellationException -> 0x015e, TryCatch #2 {CancellationException -> 0x015e, all -> 0x0147, blocks: (B:8:0x0018, B:57:0x013f, B:13:0x003b, B:47:0x0100, B:49:0x0111, B:53:0x0124, B:16:0x004d, B:34:0x00c8, B:36:0x00d1, B:43:0x00e3, B:38:0x00d8, B:17:0x005a, B:23:0x0074, B:24:0x0086, B:26:0x008c, B:30:0x00a1, B:20:0x0063), top: B:65:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x0147, CancellationException -> 0x015e, TryCatch #2 {CancellationException -> 0x015e, all -> 0x0147, blocks: (B:8:0x0018, B:57:0x013f, B:13:0x003b, B:47:0x0100, B:49:0x0111, B:53:0x0124, B:16:0x004d, B:34:0x00c8, B:36:0x00d1, B:43:0x00e3, B:38:0x00d8, B:17:0x005a, B:23:0x0074, B:24:0x0086, B:26:0x008c, B:30:0x00a1, B:20:0x0063), top: B:65:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Object next;
        Object objEZpvd;
        List list;
        C28897kjT c28897kjT;
        C28545kcm c28545kcm;
        ?? BooleanValue;
        ModuleBoostHeaderData moduleBoostHeaderData;
        C28897kjT c28897kjT2;
        ?? r1;
        List list2;
        Object objCopydefault;
        ?? r12;
        Object objAEQbTJ;
        Object objM7386unboximpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C25983jNp c25983jNp = this.this$0.KWHzl;
            this.label = 1;
            objKWHzl = c25983jNp.KWHzl(this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                int i2 = this.I$0;
                C28897kjT c28897kjT3 = (C28897kjT) this.L$2;
                C28545kcm c28545kcm2 = (C28545kcm) this.L$1;
                List list3 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list3;
                c28545kcm = c28545kcm2;
                c28897kjT2 = c28897kjT3;
                objCopydefault = obj;
                r12 = i2;
                moduleBoostHeaderData = (ModuleBoostHeaderData) ((AbstractC43419rot) objCopydefault).copydefault();
                r1 = r12;
                C28896kjS c28896kjS = this.this$0;
                List<HomeTokenData> listKWHzl = c28545kcm.KWHzl();
                TokenAggregateData tokenAggregateDataAEQbTJ = c28545kcm.AEQbTJ();
                TimeType timeType = this.$timeType$inlined;
                String str = this.$chainId$inlined;
                boolean z = r1 != 0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objAEQbTJ = c28896kjS.AEQbTJ(c28897kjT2, listKWHzl, tokenAggregateDataAEQbTJ, list2, timeType, str, moduleBoostHeaderData, z, this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7386unboximpl = objAEQbTJ;
                C56391yDq.AEQbTJ(objM7386unboximpl);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            c28897kjT = (C28897kjT) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objEZpvd);
            c28545kcm = (C28545kcm) objEZpvd;
            Boolean bool = this.$isBoostModuleOverride$inlined;
            BooleanValue = bool == null ? bool.booleanValue() : (c28897kjT == null || !c28897kjT.fIwbmz()) ? 0 : 1;
            if (BooleanValue == 0) {
                InterfaceC28901kjX interfaceC28901kjX = this.this$0.valueOf;
                this.L$0 = list;
                this.L$1 = c28545kcm;
                this.L$2 = c28897kjT;
                this.I$0 = BooleanValue;
                this.label = 3;
                objCopydefault = interfaceC28901kjX.copydefault(this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                List list4 = list;
                c28897kjT2 = c28897kjT;
                r12 = BooleanValue;
                list2 = list4;
                moduleBoostHeaderData = (ModuleBoostHeaderData) ((AbstractC43419rot) objCopydefault).copydefault();
                r1 = r12;
                C28896kjS c28896kjS2 = this.this$0;
                List<HomeTokenData> listKWHzl2 = c28545kcm.KWHzl();
                TokenAggregateData tokenAggregateDataAEQbTJ2 = c28545kcm.AEQbTJ();
                TimeType timeType2 = this.$timeType$inlined;
                String str2 = this.$chainId$inlined;
                if (r1 != 0) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objAEQbTJ = c28896kjS2.AEQbTJ(c28897kjT2, listKWHzl2, tokenAggregateDataAEQbTJ2, list2, timeType2, str2, moduleBoostHeaderData, z, this);
                if (objAEQbTJ == objCopydefault2) {
                }
            } else {
                moduleBoostHeaderData = null;
                List list5 = list;
                c28897kjT2 = c28897kjT;
                r1 = BooleanValue;
                list2 = list5;
                C28896kjS c28896kjS22 = this.this$0;
                List<HomeTokenData> listKWHzl22 = c28545kcm.KWHzl();
                TokenAggregateData tokenAggregateDataAEQbTJ22 = c28545kcm.AEQbTJ();
                TimeType timeType22 = this.$timeType$inlined;
                String str22 = this.$chainId$inlined;
                if (r1 != 0) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objAEQbTJ = c28896kjS22.AEQbTJ(c28897kjT2, listKWHzl22, tokenAggregateDataAEQbTJ22, list2, timeType22, str22, moduleBoostHeaderData, z, this);
                if (objAEQbTJ == objCopydefault2) {
                }
            }
        }
        List list6 = (List) objKWHzl;
        Iterator it = this.this$0.OLrzqt().getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((C28897kjT) next).valueOf(), (Object) this.$moduleId$inlined)) {
                break;
            }
        }
        C28897kjT c28897kjT4 = (C28897kjT) next;
        Map<String, ? extends Object> mapAEQbTJ = this.this$0.AEQbTJ(this.$dataId$inlined, this.$timeType$inlined.getValue(), this.$chainId$inlined);
        C28547kco c28547kco = this.this$0.AhwBna;
        this.L$0 = list6;
        this.L$1 = c28897kjT4;
        this.label = 2;
        objEZpvd = c28547kco.EZpvd(mapAEQbTJ, this);
        if (objEZpvd == objCopydefault2) {
            return objCopydefault2;
        }
        list = list6;
        c28897kjT = c28897kjT4;
        C56391yDq.AEQbTJ(objEZpvd);
        c28545kcm = (C28545kcm) objEZpvd;
        Boolean bool2 = this.$isBoostModuleOverride$inlined;
        if (bool2 == null) {
        }
        if (BooleanValue == 0) {
        }
    }
}
