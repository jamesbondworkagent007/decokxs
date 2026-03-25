package com.okinc.localization2;

import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C43308rmo;
import o.C56391yDq;
import o.C56442yFn;
import o.pTJ;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeCoreManager$initLocalize$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ pTJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizeCoreManager$initLocalize$2(pTJ ptj, Continuation<? super LocalizeCoreManager$initLocalize$2> continuation) {
        super(2, continuation);
        this.this$0 = ptj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LocalizeCoreManager$initLocalize$2 localizeCoreManager$initLocalize$2 = new LocalizeCoreManager$initLocalize$2(this.this$0, continuation);
        localizeCoreManager$initLocalize$2.L$0 = obj;
        return localizeCoreManager$initLocalize$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalizeCoreManager$initLocalize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        LanguageUnit languageUnit;
        pTJ ptj;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            if (this.this$0.AYXKKw) {
                return Unit.INSTANCE;
            }
            pUU.KWHzl("LocalizeCoreManager", "initLocalize, start");
            this.this$0.EZpvd();
            AppLocaleInfo appLocaleInfoCopydefault = this.this$0.AhwBna.copydefault();
            pTJ ptj2 = this.this$0;
            this.L$0 = coroutineScope3;
            this.label = 1;
            Object objKWHzl = ptj2.KWHzl(appLocaleInfoCopydefault, (Continuation<? super LanguageUnit>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope3;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.AYXKKw = true;
                        pUU.KWHzl("LocalizeCoreManager", "initLocalize, end.");
                        return Unit.INSTANCE;
                    }
                    languageUnit = (LanguageUnit) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ptj = this.this$0;
                    this.L$0 = null;
                    this.label = 4;
                    if (ptj.OLrzqt(languageUnit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.AYXKKw = true;
                    pUU.KWHzl("LocalizeCoreManager", "initLocalize, end.");
                    return Unit.INSTANCE;
                }
                languageUnit = (LanguageUnit) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (C43308rmo.KWHzl(this.this$0.KWHzl)) {
                    this.this$0.AYXKKw = true;
                    return Unit.INSTANCE;
                }
                CoroutineScopeKt.ensureActive(coroutineScope2);
                pTJ ptj3 = this.this$0;
                this.L$0 = languageUnit;
                this.L$1 = null;
                this.label = 3;
                if (ptj3.KWHzl(languageUnit, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                ptj = this.this$0;
                this.L$0 = null;
                this.label = 4;
                if (ptj.OLrzqt(languageUnit, this) == objCopydefault) {
                }
                this.this$0.AYXKKw = true;
                pUU.KWHzl("LocalizeCoreManager", "initLocalize, end.");
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        LanguageUnit languageUnit2 = (LanguageUnit) obj;
        pTJ ptj4 = this.this$0;
        this.L$0 = coroutineScope;
        this.L$1 = languageUnit2;
        this.label = 2;
        if (ptj4.copydefault(languageUnit2, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        coroutineScope2 = coroutineScope;
        languageUnit = languageUnit2;
        if (C43308rmo.KWHzl(this.this$0.KWHzl)) {
        }
    }
}
