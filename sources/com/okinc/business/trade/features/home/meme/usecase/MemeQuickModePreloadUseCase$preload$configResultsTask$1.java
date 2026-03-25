package com.okinc.business.trade.features.home.meme.usecase;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.kVR;
import o.kXM;

/* JADX INFO: loaded from: classes23.dex */
public final class MemeQuickModePreloadUseCase$preload$configResultsTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super kXM>, Object> {
    final /* synthetic */ String $chainId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ kVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeQuickModePreloadUseCase$preload$configResultsTask$1(kVR kvr, String str, Continuation<? super MemeQuickModePreloadUseCase$preload$configResultsTask$1> continuation) {
        super(2, continuation);
        this.this$0 = kvr;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemeQuickModePreloadUseCase$preload$configResultsTask$1 memeQuickModePreloadUseCase$preload$configResultsTask$1 = new MemeQuickModePreloadUseCase$preload$configResultsTask$1(this.this$0, this.$chainId, continuation);
        memeQuickModePreloadUseCase$preload$configResultsTask$1.L$0 = obj;
        return memeQuickModePreloadUseCase$preload$configResultsTask$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super kXM> continuation) {
        return ((MemeQuickModePreloadUseCase$preload$configResultsTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        String str;
        Deferred deferred;
        Deferred deferred2;
        Deferred deferred3;
        Object objAwait;
        Object obj2;
        Deferred deferred4;
        Deferred deferred5;
        Object objAwait2;
        Object obj3;
        Object obj4;
        Object objAwait3;
        Object obj5;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                kKG kkg = this.this$0.DbNXlk;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objAEQbTJ = kkg.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                coroutineScope = coroutineScope2;
                obj = objAEQbTJ;
                str = (String) obj;
                kKG kkg2 = this.this$0.DbNXlk;
                this.L$0 = coroutineScope;
                this.L$1 = str;
                this.label = 2;
                obj = kkg2.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                String str2 = str;
                CoroutineScope coroutineScope3 = coroutineScope;
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$currencyDeferred$1(this.this$0, this.$chainId, str2, (String) obj, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$sellConfigDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$chainListDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$presetConfigDeferred$1(this.this$0, this.$chainId, null), 3, null);
                this.L$0 = deferredAsync$default2;
                this.L$1 = deferredAsync$default3;
                this.L$2 = deferredAsync$default4;
                this.label = 3;
                obj = deferredAsync$default.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                deferred = deferredAsync$default2;
                deferred2 = deferredAsync$default3;
                deferred3 = deferredAsync$default4;
                Deferred deferred6 = deferred;
                Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                this.L$0 = deferred2;
                this.L$1 = deferred3;
                this.L$2 = objM7386unboximpl;
                this.label = 4;
                objAwait = deferred6.await(this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                Deferred deferred7 = deferred3;
                obj2 = objM7386unboximpl;
                obj = objAwait;
                deferred4 = deferred2;
                deferred5 = deferred7;
                Object objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                this.L$0 = deferred5;
                this.L$1 = obj2;
                this.L$2 = objM7386unboximpl2;
                this.label = 5;
                objAwait2 = deferred4.await(this);
                if (objAwait2 != objCopydefault) {
                    return objCopydefault;
                }
                Object obj6 = obj2;
                obj3 = objM7386unboximpl2;
                obj = objAwait2;
                obj4 = obj6;
                Object objM7386unboximpl3 = ((Result) obj).m7386unboximpl();
                this.L$0 = obj4;
                this.L$1 = obj3;
                this.L$2 = objM7386unboximpl3;
                this.label = 6;
                objAwait3 = deferred5.await(this);
                if (objAwait3 != objCopydefault) {
                    return objCopydefault;
                }
                obj5 = objM7386unboximpl3;
                obj = objAwait3;
                return new kXM(obj4, obj3, obj5, ((Result) obj).m7386unboximpl());
            case 1:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope4;
                str = (String) obj;
                kKG kkg22 = this.this$0.DbNXlk;
                this.L$0 = coroutineScope;
                this.L$1 = str;
                this.label = 2;
                obj = kkg22.copydefault(this);
                if (obj == objCopydefault) {
                }
                String str22 = str;
                CoroutineScope coroutineScope32 = coroutineScope;
                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$currencyDeferred$1(this.this$0, this.$chainId, str22, (String) obj, null), 3, null);
                Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$sellConfigDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default32 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$chainListDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default42 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$presetConfigDeferred$1(this.this$0, this.$chainId, null), 3, null);
                this.L$0 = deferredAsync$default22;
                this.L$1 = deferredAsync$default32;
                this.L$2 = deferredAsync$default42;
                this.label = 3;
                obj = deferredAsync$default5.await(this);
                if (obj == objCopydefault) {
                }
                break;
            case 2:
                str = (String) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                String str222 = str;
                CoroutineScope coroutineScope322 = coroutineScope;
                Deferred deferredAsync$default52 = BuildersKt__Builders_commonKt.async$default(coroutineScope322, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$currencyDeferred$1(this.this$0, this.$chainId, str222, (String) obj, null), 3, null);
                Deferred deferredAsync$default222 = BuildersKt__Builders_commonKt.async$default(coroutineScope322, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$sellConfigDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default322 = BuildersKt__Builders_commonKt.async$default(coroutineScope322, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$chainListDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default422 = BuildersKt__Builders_commonKt.async$default(coroutineScope322, null, null, new MemeQuickModePreloadUseCase$preload$configResultsTask$1$presetConfigDeferred$1(this.this$0, this.$chainId, null), 3, null);
                this.L$0 = deferredAsync$default222;
                this.L$1 = deferredAsync$default322;
                this.L$2 = deferredAsync$default422;
                this.label = 3;
                obj = deferredAsync$default52.await(this);
                if (obj == objCopydefault) {
                }
                break;
            case 3:
                deferred3 = (Deferred) this.L$2;
                Deferred deferred8 = (Deferred) this.L$1;
                Deferred deferred9 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred = deferred9;
                deferred2 = deferred8;
                Deferred deferred62 = deferred;
                Object objM7386unboximpl4 = ((Result) obj).m7386unboximpl();
                this.L$0 = deferred2;
                this.L$1 = deferred3;
                this.L$2 = objM7386unboximpl4;
                this.label = 4;
                objAwait = deferred62.await(this);
                if (objAwait != objCopydefault) {
                }
                break;
            case 4:
                obj2 = this.L$2;
                Deferred deferred10 = (Deferred) this.L$1;
                Deferred deferred11 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred5 = deferred10;
                deferred4 = deferred11;
                Object objM7386unboximpl22 = ((Result) obj).m7386unboximpl();
                this.L$0 = deferred5;
                this.L$1 = obj2;
                this.L$2 = objM7386unboximpl22;
                this.label = 5;
                objAwait2 = deferred4.await(this);
                if (objAwait2 != objCopydefault) {
                }
                break;
            case 5:
                obj3 = this.L$2;
                obj4 = this.L$1;
                deferred5 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl32 = ((Result) obj).m7386unboximpl();
                this.L$0 = obj4;
                this.L$1 = obj3;
                this.L$2 = objM7386unboximpl32;
                this.label = 6;
                objAwait3 = deferred5.await(this);
                if (objAwait3 != objCopydefault) {
                }
                break;
            case 6:
                obj5 = this.L$2;
                obj3 = this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new kXM(obj4, obj3, obj5, ((Result) obj).m7386unboximpl());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
