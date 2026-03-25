package com.okinc.common.application;

import com.okinc.localization2.bean.AppLanguagesChangeResult;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseApplication$localizationInit$5 extends SuspendLambda implements yHT<LanguageUnit, Integer, String, Continuation<? super AppLanguagesChangeResult>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BaseApplication this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$localizationInit$5(BaseApplication baseApplication, Continuation<? super BaseApplication$localizationInit$5> continuation) {
        super(4, continuation);
        this.this$0 = baseApplication;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(LanguageUnit languageUnit, int i, String str, Continuation<? super AppLanguagesChangeResult> continuation) {
        BaseApplication$localizationInit$5 baseApplication$localizationInit$5 = new BaseApplication$localizationInit$5(this.this$0, continuation);
        baseApplication$localizationInit$5.L$0 = languageUnit;
        baseApplication$localizationInit$5.I$0 = i;
        baseApplication$localizationInit$5.L$1 = str;
        return baseApplication$localizationInit$5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(LanguageUnit languageUnit, Integer num, String str, Continuation<? super AppLanguagesChangeResult> continuation) {
        return invoke(languageUnit, num.intValue(), str, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LanguageUnit languageUnit = (LanguageUnit) this.L$0;
            int i2 = this.I$0;
            String str = (String) this.L$1;
            BaseApplication baseApplication = this.this$0;
            this.L$0 = null;
            this.label = 1;
            obj = baseApplication.AEQbTJ(languageUnit, i2, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return AppLanguagesChangeResult.SUCCEED;
        }
        return AppLanguagesChangeResult.FAIL;
    }
}
