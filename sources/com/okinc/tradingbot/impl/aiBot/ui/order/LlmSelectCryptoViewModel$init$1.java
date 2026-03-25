package com.okinc.tradingbot.impl.aiBot.ui.order;

import androidx.camera.video.AudioStats;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC54531xLw;
import o.C54799xVt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.uCB;
import o.uCL;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmSelectCryptoViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<Object> $initialSelectedSet;
    final /* synthetic */ String $instType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ LlmSelectCryptoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmSelectCryptoViewModel$init$1(LlmSelectCryptoViewModel llmSelectCryptoViewModel, String str, Set<? extends Object> set, Continuation<? super LlmSelectCryptoViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = llmSelectCryptoViewModel;
        this.$instType = str;
        this.$initialSelectedSet = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmSelectCryptoViewModel$init$1 llmSelectCryptoViewModel$init$1 = new LlmSelectCryptoViewModel$init$1(this.this$0, this.$instType, this.$initialSelectedSet, continuation);
        llmSelectCryptoViewModel$init$1.L$0 = obj;
        return llmSelectCryptoViewModel$init$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmSelectCryptoViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:31:0x00bc, B:36:0x0128], limit reached: 50 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:11:0x003d, B:29:0x00b8, B:31:0x00bc, B:33:0x00c2, B:22:0x008f, B:24:0x0095, B:26:0x00a1, B:39:0x0130, B:38:0x012b, B:14:0x0050, B:21:0x0080, B:17:0x0065), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:11:0x003d, B:29:0x00b8, B:31:0x00bc, B:33:0x00c2, B:22:0x008f, B:24:0x0095, B:26:0x00a1, B:39:0x0130, B:38:0x012b, B:14:0x0050, B:21:0x0080, B:17:0x0065), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #0 {all -> 0x0126, blocks: (B:11:0x003d, B:29:0x00b8, B:31:0x00bc, B:33:0x00c2, B:22:0x008f, B:24:0x0095, B:26:0x00a1, B:39:0x0130, B:38:0x012b, B:14:0x0050, B:21:0x0080, B:17:0x0065), top: B:49:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b5 -> B:29:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0128 -> B:37:0x0129). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        String str;
        Set<Object> set;
        LlmSelectCryptoViewModel llmSelectCryptoViewModel;
        Iterator it;
        String str2;
        LlmSelectCryptoViewModel llmSelectCryptoViewModel2;
        Collection collection;
        Set<Object> set2;
        uCB ucb;
        BizInstrument bizInstrumentValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LlmSelectCryptoViewModel llmSelectCryptoViewModel3 = this.this$0;
            String str3 = this.$instType;
            Set<Object> set3 = this.$initialSelectedSet;
            Result.Application application2 = Result.Companion;
            uCL ucl = llmSelectCryptoViewModel3.AhwBna;
            this.L$0 = llmSelectCryptoViewModel3;
            this.L$1 = str3;
            this.L$2 = set3;
            this.label = 1;
            objKWHzl = ucl.KWHzl(str3, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str = str3;
            set = set3;
            llmSelectCryptoViewModel = llmSelectCryptoViewModel3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                String str4 = (String) this.L$6;
                it = (Iterator) this.L$5;
                collection = (Collection) this.L$4;
                llmSelectCryptoViewModel = (LlmSelectCryptoViewModel) this.L$3;
                set2 = (Set) this.L$2;
                str2 = (String) this.L$1;
                llmSelectCryptoViewModel2 = (LlmSelectCryptoViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objEZpvd = obj;
                AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
                if (abstractC54531xLw != null || (bizInstrumentValueOf = abstractC54531xLw.valueOf(str4)) == null) {
                    ucb = null;
                } else {
                    String instId = bizInstrumentValueOf.getInstId();
                    String strValueOf = llmSelectCryptoViewModel2.AYXKKw.valueOf(bizInstrumentValueOf.getTradeSymbol());
                    C54799xVt c54799xVt = C54799xVt.AEQbTJ;
                    ucb = new uCB(instId, strValueOf, C54799xVt.getTitleByIdAndType$default(c54799xVt, bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), false, false, 12, null), c54799xVt.copydefault(bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? "normal" : null, (124 & 32) != 0, (124 & 64) != 0 ? null : null, (124 & 128) != 0 ? false : true), set2.contains(bizInstrumentValueOf.getInstId()), null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, LivenessCoordinator.TARGET_WIDTH, null);
                }
                if (ucb != null) {
                    collection.add(ucb);
                }
                if (it.hasNext()) {
                    str4 = (String) it.next();
                    InterfaceC54581xNr interfaceC54581xNr = llmSelectCryptoViewModel2.AYXKKw;
                    if (interfaceC54581xNr != null) {
                        this.L$0 = llmSelectCryptoViewModel2;
                        this.L$1 = str2;
                        this.L$2 = set2;
                        this.L$3 = llmSelectCryptoViewModel;
                        this.L$4 = collection;
                        this.L$5 = it;
                        this.L$6 = str4;
                        this.label = 2;
                        objEZpvd = interfaceC54581xNr.EZpvd(str2, this);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) objEZpvd;
                        if (abstractC54531xLw2 != null) {
                        }
                    }
                    ucb = null;
                    if (ucb != null) {
                    }
                    if (it.hasNext()) {
                        llmSelectCryptoViewModel.djBIcL = (List) collection;
                        llmSelectCryptoViewModel2.valueOf();
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    }
                }
                LlmSelectCryptoViewModel llmSelectCryptoViewModel4 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableStateFlow mutableStateFlow = llmSelectCryptoViewModel4.AEQbTJ;
                    List listAhwBna = yDY.AhwBna();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    if (mutableStateFlow.emit(listAhwBna, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            set = (Set) this.L$2;
            String str5 = (String) this.L$1;
            LlmSelectCryptoViewModel llmSelectCryptoViewModel5 = (LlmSelectCryptoViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            llmSelectCryptoViewModel = llmSelectCryptoViewModel5;
            str = str5;
            objKWHzl = obj;
        }
        ArrayList arrayList = new ArrayList();
        it = ((List) objKWHzl).iterator();
        str2 = str;
        llmSelectCryptoViewModel2 = llmSelectCryptoViewModel;
        collection = arrayList;
        set2 = set;
        if (it.hasNext()) {
        }
        LlmSelectCryptoViewModel llmSelectCryptoViewModel42 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
